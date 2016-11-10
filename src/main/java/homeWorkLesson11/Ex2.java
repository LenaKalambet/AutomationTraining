package homeWorkLesson11;

import java.util.Scanner;

/**
 * Created by stas1 on 06.11.2016.
 */
public class Ex2 {


    public static void main(String[] args) {
        int[] array = new int[10];
        int value =0;
        for (int i =0; i<array.length; i++){
            array[i] = i;
        }
        try{
            value = verifyUserValue();
        } catch(CustomException e){
            e.printStackTrace();
            System.out.println("Custom Exception! ");
            return;
        }
        try{
            System.out.println(array[value-1]);
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Bounder Exception! ");
        }






    }


    public static int verifyUserValue() throws CustomException {
        int value = getInt("Enter array index: ");
        if (value == 7){
            throw new CustomException();
        }
        return value;
    }


    public static int getInt (String message) {
        int q = 0;
        boolean verify;
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        do {
            verify = scanner.hasNextInt();
            if (verify) {
                q = scanner.nextInt();
            } else {
                System.out.println(message);
                scanner.next();
            }
        } while (verify == false);
        return q;
    }

}
