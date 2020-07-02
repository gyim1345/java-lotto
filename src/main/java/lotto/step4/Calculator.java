package lotto.step4;

import java.text.DecimalFormat;

public class Calculator {
    public static String rateOfReturn(int totalProfit, int spentCash) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(Math.floor((double) totalProfit/spentCash*100)/100);
    }

    public static int getTotalProfit(int[] profits) {
        int totalProfit = 0;
        for(int profit : profits) {
            totalProfit += profit;
        }
        return totalProfit;
    }


}
