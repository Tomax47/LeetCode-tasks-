import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RomanToInteger {

    public static void main(String[] args) {
        ArrayList<String> romanNumbers = new ArrayList<>(Arrays.asList("XXIV","XI","VVI","MLXIV"));

        for (String romanNumber : romanNumbers) {
            System.out.println("Number as int : "+romanToInt(romanNumber));
            
        }


    }
    public static int romanToInt(String s) {
        int finalNumber = 0;
        int previousNumebr = 0;

        for (int i = s.length() -1; i >= 0 ; i--) {
            int current = RomanCharToInt(s.charAt(i));

            if (previousNumebr > current) {
                finalNumber -= current;
            } else {
                finalNumber += current;
            }

            previousNumebr = current;
        }

        return finalNumber;
    }

    public static int RomanCharToInt(char c) {
        switch(c) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;
        }
    }
}
