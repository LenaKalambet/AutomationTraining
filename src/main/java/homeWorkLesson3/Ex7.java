package homeWorkLesson3;

import com.sun.jna.platform.win32.OaIdl;

import java.text.DateFormatSymbols;
import java.util.Date;
import java.util.Scanner;



/**
 * Created by admin on 07.10.2016.
 */
public class Ex7 {
    public static void main(String[] args) {
        //String month = getString("Enter month");
        String curMonth;
        int monthNum=0;
        curMonth = getString("Enter month in format 'January' ");
        String[] arr = {"January", "February", "Martch", "April", "May", "June", "July", "August", "September", "October", "November","December"};

        for(int i=0; i<12;i++)
        {
            if (curMonth.equals(arr[i])) {
                monthNum = i+1;
            }
        }
            if (monthNum == 0){
                System.out.println("Month entered incorrectly");
            }
            else {
                System.out.println("Month number is: "+monthNum);
            }

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

