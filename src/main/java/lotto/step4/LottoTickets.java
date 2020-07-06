package lotto.step4;

public class LottoTickets {

    private int[][] LottoTickets;
    private final int [][] LottoFixedTickets = {
            {8, 21, 23, 41, 42, 43},
            {3, 5, 11, 16, 32, 38},
            {7, 11, 16, 35, 36, 44},
            {1, 8, 11, 31, 41, 42},
            {13, 14, 16, 38, 42, 45},
            {7, 11, 30, 40, 42, 43},
            {2, 13, 22, 32, 38, 45},
            {23, 25, 33, 36, 39, 41},
            {1, 3, 5, 14, 22, 45},
            {5, 9, 38, 41, 43, 44},
            {2, 8, 9, 18, 19, 21},
            {13, 14, 18, 21, 23, 35},
            {17, 21, 29, 37, 42, 45},
            {3, 8, 27, 30, 35, 44},
            {1, 2, 3, 4, 5, 6}};
    public LottoTickets(int amount) {
        generateTickets(amount);
    }

    private int[][] generateTickets(int amount) {

        for(int i = 0; i < amount; i += 1) {
            this.LottoTickets[i] = this.LottoFixedTickets[i];
        }

        return this.LottoTickets = this.LottoFixedTickets;
    }

}
