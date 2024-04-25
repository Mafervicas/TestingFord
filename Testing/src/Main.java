import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Initialice scanner
        Scanner scanner = new Scanner(System.in);

        //Ask for the number
        System.out.print("Please give me the number in roman: ");
        String romanString = scanner.next();

        //Call the method
        Integer convertedInt = convertToRoman(romanString);

        //Print result
        System.out.println(convertedInt);
    }

    /**
     * This method its going to transform the string to an integer.
     * @param romanString as a String.
     * @return integer of the roman.
     *
     */
    public static Integer convertToRoman(String romanString) {
        //Map with possibilities
        Map<Character, Integer> romanMapping = new HashMap<>();
        romanMapping.put('I', 1);
        romanMapping.put('V', 5);
        romanMapping.put('X',10);
        romanMapping.put('L', 50);
        romanMapping.put('C', 100);

        //Variables that will be used
        int stringLengthPrevious = 0;
        int intConverted = 0;

        //For that will be covering all string
        for(int i = romanString.length() -1; i >= 0; i--){
            int valueString = romanMapping.get(romanString.charAt(i));
            //Validate length
            if(valueString < stringLengthPrevious){
                //If less then substract
                intConverted-= valueString;
            } else {
                //If more then add
                intConverted += valueString;
            }

            stringLengthPrevious = valueString;
        }
        return intConverted;


    }


}