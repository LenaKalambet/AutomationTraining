package lesson14test;

/**
 * Created by stas1 on 18.11.2016.
 */
public class RemoveAlfabetical {
    public static void main(String[] args) {
        StringBuilder string1 = new StringBuilder();
        String test_string = "гж976ти34.рв32";
        char[] charArr = test_string.toCharArray();
        for (int i =0; i<charArr.length;i++){
            if (charArr[i]<='9' && charArr[i]>='0') {
                string1.append(charArr[i]);
            }
        }

        System.out.println(string1);


    }
}
