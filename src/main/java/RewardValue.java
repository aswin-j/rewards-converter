public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // Convert cash value to miles.
        this.milesValue = (int) (cashValue / 0.0035);
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        // Convert miles value to cash.
        this.cashValue = milesValue * 0.0035;
    }
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value.
    public int getMilesValue() {
        return milesValue;
    }
}
