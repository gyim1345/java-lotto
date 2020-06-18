package Step1_string_add_calculator;

public class CalculatorApp {
    public static void main(String[] args) {
        String input = InputView.getInputs();
        String[] inputs = Deciferer.extractElements(input);
        int sum = Calculator.getSum(inputs);
        OutputView.sumResult(sum);
    }
}
