package lotto.step2.domain;

public class Lotto {

    public static int getTicketAmount(int cashAmount) {
        return cashAmount/1000;
    }

    public static int[][] getTickets(int ticketAmount) {
        return new int[][] {{1}};
    }

}
