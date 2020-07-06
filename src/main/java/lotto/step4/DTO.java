package lotto.step4;

public class DTO {
    private int cash;
    private int[] profits;
    private int[] rewards = {0, 0, 0, 5000, 50000, 1500000, 2000000000};

    public DTO() {

    }

    public void setCash(Cash cash) {
        this.cash = cash.getCash();
    }

    public int getCash() {
        return this.cash;
    }

    public void setMatchingProfits(int[] matchedProfits) {
        this.profits = matchedProfits;
    }

    public int[] getMatchingProfits() {
        return this.profits;
    }

    public int getMatchingProfit(int index) {
        return this.profits[index];
    }

    public int[] getRewards() {
        return this.rewards;
    }

    public int getReward(int matchCount) {
        return this.rewards[matchCount];
    }
}
