import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //Initialice scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please give me the number in roman: ");
        String romanString = scanner.toString();

        //Call the method
        Integer convertedInt = convertToRoman(romanString);

    }

    /**
     * This method its going to transform the string to an integer.
     * @param romanString as a String.
     * @return integer of the roman.
     *
     */
    public static Integer convertToRoman(String romanString) {
        Map<Character, Integer> romanMapping = new HashMap<>();
        romanMapping.put('I', 1);
        romanMapping.put('V', 5);
        romanMapping.put('X',10);
        romanMapping.put('L', 50);
        romanMapping.put('C', 100);

        int stringLengthPrevious = 0;
        for(int i = romanString.length() -1; i >= 0; i--){
            int valueString = romanMapping.get(romanString.charAt(i));
            if(valueString < stringLengthPrevious){

            }
        }
        return 0;


    }


}