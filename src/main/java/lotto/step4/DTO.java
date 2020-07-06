package lotto.step4;

public class DTO {
    private int cash;
    private int[] profits;
    private int[] rewards = {0, 0, 0, 5000, 50000, 1500000, 2000000000};
    private int[][] lottoTickets;

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

    public void setLottoTickets(LottoTickets lottoTickets) {
        this.lottoTickets = new int[lottoTickets.getLottoTickets().length][lottoTickets.getLottoTickets()[0].length];
        int index = 0;
        for(int[] ticket: lottoTickets.getLottoTickets()) {
            System.arraycopy(ticket,0,this.lottoTickets[index], 0,ticket.length);
            index += 1;
        }
    }

    public int[][] getLottoTickets() {
        return this.lottoTickets;
    }
}
