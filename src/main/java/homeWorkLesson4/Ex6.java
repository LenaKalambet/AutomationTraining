package homeWorkLesson4;

import java.util.Scanner;



/**
 * Created by admin on 09.10.2016.
 */
public class Ex6 {
    public static void main(String[] args) {
        char[] charArr = getCharArr("Enter String: ");
        char[] charArr1 = new char[charArr.length];
        int r = 0;
        for(int i =0;i<charArr.length;i++){
            int m = (int) charArr[i];
            boolean b = Character.isAlphabetic(m);
            if (b){
                charArr1[r] = charArr[i];
                r = r+1;
            }
        }
        for (char arrElement:charArr1){
            System.out.print(arrElement);
        }
    }

    public static char[] getCharArr(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String input = scanner.nextLine();
        char[] array=input.toCharArray();
        return array;
    }
}
