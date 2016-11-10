package homeWorkLesson3;

import java.util.Scanner;

/**
 * Created by admin on 07.10.2016.
 */
public class Ex4 {
    public static void main(String[] args) {

        String name1 = getString("Type the name of the first person");
        String name2 = getString("Type the name of the second person");
if (name1.equals(name2)){
    System.out.println("The names are equal");
}
else {
    System.out.println("Names are not equal");
}
    }
    public static String getString (String message) {
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
