package Step1_string_add_calculator;

public class Validator {
    public static boolean checkIfEmpty(String[] input) {
        if(input[0].equals("")){
            return false;
        }
        return true;
    }
}
