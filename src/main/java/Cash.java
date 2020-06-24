public class Cash {
    private final int cashAmount;

    public Cash(int cashAmount) {
        validateCashAmount(cashAmount);
        this.cashAmount = cashAmount;
    }

    public int getCashAmount() {
        return this.cashAmount;
    }

    private void validateCashAmount(int cashAmount) {
        if (cashAmount < 1000) {
            throw new IllegalArgumentException("1000원 이상 넣어 주세요");
        }
    }

}
