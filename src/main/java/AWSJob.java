/**
 * Created by jason on 6/5/15.
 */
public class AWSJob {

    private String jobId;
    private String accountId;
    private String customerName;
    private String frequency;
    private String enqueuedAt;

    public AWSJob(String jobId, String accountId, String customerName, String frequency, String enqueuedAt) {
        this.jobId = jobId;
        this.accountId = accountId;
        this.customerName = customerName;
        this.frequency = frequency;
        this.enqueuedAt = enqueuedAt;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getFrequency() {
        return this.frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getEnqueuedAt() {
        return this.enqueuedAt;
    }

    public void setEnqueuedAt(String enqueuedAt) {
        this.enqueuedAt = enqueuedAt;
    }
}
