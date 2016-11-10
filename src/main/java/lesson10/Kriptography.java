package lesson10;

import java.util.Scanner;

/**
 * Created by admin on 31.10.2016.
 */
public class Kriptography {
    public static void main(String[] args) {
        String input;
        input = getString("Enter string for cripto: ");
        StringBuilder builder = new StringBuilder();
        for (int i =0; i<input.length();i++){
            builder.append(symbolMap(input.charAt(i)));
        }
        System.out.println(builder);

        StringBuilder builder1 = new StringBuilder();
        for (int i =0; i<input.length();i++){
            builder1.append(revertSymbolMap(builder.charAt(i)));
        }
        System.out.println(builder1);

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

    public static char symbolMap(char in){
        char out='0';

        char[][] mappArray = new char[][]{{'a','b'},{'b','c'},{'c','d'},{'d','e'},{'e','f'},{'f','g'},{'g','h'},{'h','i'},{'i','j'},{'j','k'},{'k','l'}, {'l','m'},{'m','n'},{'n','o'},{'o','p'},{'p','q'},{'q','r'},{'r','s'},{'s','t'},{'t','u'},{'u','v'},{'v','w'},{'w','x'},{'x','y'},{'y','z'},{'z','a'},{' ','_'},{'0','1'},{'1','2'}, {'2','3'},{'3','4'},{'4','5'},{'5','6'},{'6','7'},{'7','8'},{'8','9'},{'9','0'}};
            for (int i =0; i< mappArray.length; i++){
                if (in == mappArray[i][0]) {
                    out = mappArray[i][1];
                }
            }
        return out;
    }

    public static char revertSymbolMap(char in){
        char out='0';

        char[][] mappArray = new char[][]{{'a','b'},{'b','c'},{'c','d'},{'d','e'},{'e','f'},{'f','g'},{'g','h'},{'h','i'},{'i','j'},{'j','k'},{'k','l'}, {'l','m'},{'m','n'},{'n','o'},{'o','p'},{'p','q'},{'q','r'},{'r','s'},{'s','t'},{'t','u'},{'u','v'},{'v','w'},{'w','x'},{'x','y'},{'y','z'},{'z','a'},{' ','_'},{'0','1'},{'1','2'}, {'2','3'},{'3','4'},{'4','5'},{'5','6'},{'6','7'},{'7','8'},{'8','9'},{'9','0'}};
        for (int i =0; i< mappArray.length; i++){
            if (in == mappArray[i][1]) {
                out = mappArray[i][0];
            }
        }
        return out;
    }
}
