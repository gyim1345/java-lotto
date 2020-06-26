package lotto.step4;

import lotto.step4.ui.inputView;
import lotto.step4.domain.Cash;

import java.util.List;

public class LottoGameApp {
    public static void main(String[] args) {
        Cash cash = new Cash(inputView.getCashAmount());
    }
}
