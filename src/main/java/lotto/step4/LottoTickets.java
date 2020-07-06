package lotto.step4;

import java.util.Arrays;

public class LottoTickets {

    private int[][] LottoTickets;
    private final int TICKET_MAX_SIZE = 6;
    private final int NUMBER_MAX = 45;
    private final int NUMBER_MIN = 1;
    private int[][] LottoFixedTickets = {
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
        this.LottoTickets = new int[amount][TICKET_MAX_SIZE];
        generateTickets(amount);
        verification();
    }

    public LottoTickets(int amount, int[][] fixedTickets) {
        this.LottoFixedTickets = fixedTickets;
        verification();
        this.LottoTickets = new int[amount][TICKET_MAX_SIZE];
        generateTickets(amount);
    }

    public int[][] getLottoTickets() {
        return this.LottoTickets;
    }

    private void generateTickets(int amount) {
        for (int i = 0; i < amount; i += 1) {
            System.out.println(Arrays.toString(this.LottoFixedTickets[i]));
            LottoTickets[i] = this.LottoFixedTickets[i];
        }
    }

    private void verification() {
            for (int[] ticket : this.LottoFixedTickets) {
            if (ticket.length > TICKET_MAX_SIZE) {
                throw new IllegalArgumentException("lotto ticket size must be 6");
            }
                for (int number : ticket) {
                    if (number > NUMBER_MAX || number < NUMBER_MIN) {
                        throw new IllegalArgumentException("lotto number size must be between 1 and 45");
                    }
                }
            }
    }
}
