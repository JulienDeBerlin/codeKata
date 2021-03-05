public class RomanNumeralConverter {

    public static String convertIntToRomanNumeral(int input) {
        StringBuilder romanNumeral = new StringBuilder();
        while (input > 0) {
            for (RomanNumeral item : RomanNumeral.values()) {
                while (input >= item.decimalValue) {
                    romanNumeral.append(item.toString());
                    input -= item.decimalValue;
                }
            }
        }
        return romanNumeral.toString();
    }

    public static int convertRomanNumeralToInt(String input) {
        int result = 0;
        while (input.length() > 0) {
            for (RomanNumeral item : RomanNumeral.values()) {
                if (input.startsWith(item.toString())) {
                    result += item.decimalValue;
                    input = input.substring((item.toString().length()), input.length());
                    break;
                }
            }
        }
        return result;
    }
}
