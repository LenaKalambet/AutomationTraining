package lesson6;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Scanner;

/**
 * Created by admin on 21.10.2016.
 */

// TEST CHECK IN
public class Calculate {
    public static void main(String[] args) {
        while(true) {
            double result;
            String stringToCalculate = getString("Enter VALID string to calculate: ");
            result = calc(stringToCalculate);
            System.out.println(result);
        }
    }

   public static double calc(String string){
       double result = 0;
       String[] stringSplitedByPlus = splitStringByPlus(string);
       for (String s: stringSplitedByPlus) {
           result += parseStringWithoutPlus(s);
       }
       return result;
   }

    private static double parseStringWithoutPlus(String stringWitghoutPlus) {
        String[] stringsSplitedByMinus = stringWitghoutPlus.split("-");

        double result = parseMultiplicition(stringsSplitedByMinus[0]);
        if(stringsSplitedByMinus.length == 1){
            return result;
        }

        for (int i = 1; i < stringsSplitedByMinus.length; ++i) {
            result -= parseMultiplicition(stringsSplitedByMinus[i]);
        }
        return result;
    }

    private static double parseMultiplicition(String string) {
        double result = 1;
        String[] byMult = string.split("\\*");
        for (int i=0; i < byMult.length; i++){
            String[] byDiv = byMult[i].split("/");
            result *= Integer.parseInt(byDiv[0]);
            for (int j = 1; j < byDiv.length;j++){
                double value = Double.parseDouble(byDiv[j]);
                if (value == 0){
                    System.out.println("LOOOOSEEERR");
                }
                result /= value;
            }
        }
        return result;
    }

    public static String[] splitStringByPlus(String line) {
        //   String line = getString("Enter string to calculate: ");
        String[] splitedString = line.split("\\+");
        return splitedString;
    }

    public static String getString(String message) {
        String q = "";
        boolean verify;
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        do {
            verify = scanner.hasNext();
            if (verify) {
                q = scanner.nextLine();
            } else {
                System.out.println(message);
                scanner.next();
            }
        } while (verify == false);
        return q;
    }
}
