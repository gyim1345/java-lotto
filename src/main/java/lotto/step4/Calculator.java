package lotto.step4;

import java.text.DecimalFormat;

public class Calculator {
    public static String rateOfReturn(int totalProfit, int spentCash) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format((double) totalProfit/spentCash);
    }
}
