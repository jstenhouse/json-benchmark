/**
 * Created by jason on 6/5/15.
 */
public class GsonJob {

    private String jobId;
    private String accountId;
    private String customerName;
    private String frequency;
    private String enqueuedAt;

    public GsonJob(String jobId, String accountId, String customerName, String frequency, String enqueuedAt) {
        this.jobId = jobId;
        this.accountId = accountId;
        this.customerName = customerName;
        this.frequency = frequency;
        this.enqueuedAt = enqueuedAt;
    }

}
