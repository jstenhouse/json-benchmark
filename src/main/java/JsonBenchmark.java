import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.caliper.Benchmark;
import com.google.caliper.runner.CaliperMain;
import com.google.gson.Gson;

import java.io.IOException;

public class JsonBenchmark {

    private static final int Iterations = 10000;

    private static final String jobJson = "{ \"jobId\": \"12345\", \"accountId\": \"987654321\", \"customerName\": \"foo\", \"frequency\": \"5\", \"enqueuedAt\": \"1433551351\"}";
    private static final GsonJob gsonJob = new GsonJob("12345", "987654321", "foo", "5", "1433551351");
    private static final JacksonJob jacksonJob = new JacksonJob("12345", "987654321", "foo", "5", "1433551351");

    private static final Gson gson = new Gson();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {
        CaliperMain.main(JsonBenchmark.class, args);
    }

    @Benchmark
    public void timeGsonToJson() {
        for (int i = 0; i < Iterations; i++) {
            String json = gson.toJson(gsonJob);
        }
    }

    @Benchmark
    public void timeGsonFromJson() {
        for (int i = 0; i < Iterations; i++) {
            GsonJob job = gson.fromJson(jobJson, GsonJob.class);
        }
    }

    @Benchmark
    public void timeJacksonToJson() throws IOException {
        for (int i = 0; i < Iterations; i++) {
            JacksonJob job = objectMapper.readValue(jobJson, JacksonJob.class);
        }
    }

    @Benchmark
    public void timeJacksonFromJson() throws JsonProcessingException {
        for (int i = 0; i < Iterations; i++) {
            String json = objectMapper.writeValueAsString(jacksonJob);
        }
    }
}
