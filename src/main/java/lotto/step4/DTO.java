package lotto.step4;

public class DTO {
    private int cash;

    public DTO() {

    }

    public void setCash(Cash cash) {
        this.cash = cash.getCash();
    }

    public int getCash() {
        return this.cash;
    }

}
