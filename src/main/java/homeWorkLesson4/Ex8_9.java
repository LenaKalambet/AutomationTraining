package homeWorkLesson4;

import java.util.Scanner;

/**
 * Created by admin on 09.10.2016.
 */
public class Ex8_9 {
    public static void main(String[] args) {
        char [] toTrans = getCharArr("Enter some string: ");
        char[][] transArr = new char[][]{{'а','a'},{'б','b'},{'в','v'},{'г','g'},{'д','d'},{'е','e'},{'ё','e'},{'ж','j'},{'з','z'},{'и','i'},{'й','i'}, {'к','k'},{'л','l'},{'м','m'},{'н','n'},{'о','o'},{'п','p'},{'р','r'},{'с','s'},{'т','t'},{'у','u'},{'ф','f'},{'х','h'},{'ц','c'},{'ч','4'},{'ш','w'},{'щ','w'},{'ь','\''},{'ы','i'}, {'ъ','\''},{'э','e'},{'ю','y'},{'я','a'}};
 //       char[][] transarr = new char[][]{{'а','a'},{'б','b'},{'в','v'},{'г','g'},{'д','d'},{'е','e'},{'ё','e'},{'ж','j'},{'з','z'},{'и','i'},{'к','k'},{'л','l'},{'м','m'},{'н','n'},{'о','o'},{'п','p'},{'р','r'},{'с','s'},{'т','t'},{'у','u'},{'ф','f'},{'х','h'},{'ц','c'},{'ч','c'},{'ш','s'},{'щ','s'},{'ь','\''},{'ъ','\''},{'э','e'},{'ю','y'},{'я','a'}};

        for (int j =0;j<toTrans.length;j++) {
            for (int i = 0; i < transArr.length; i++) {
                if (toTrans[j] == transArr[i][0]){
                    toTrans[j] = transArr[i][1];
                }
            }
        }
        for (char arElement:toTrans){
            System.out.print(arElement);
        }
        System.out.print("\n");
        for (int j =0;j<toTrans.length;j++) {
            for (int i = 0; i < transArr.length; i++) {
                if (toTrans[j] == transArr[i][1]){
                    toTrans[j] = transArr[i][0];
                }
            }
        }
        for (char arElement:toTrans){
            System.out.print(arElement);
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
