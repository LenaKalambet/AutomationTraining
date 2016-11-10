package homeWorkLesson4;

import java.util.Scanner;

/**
 * Created by admin on 09.10.2016.
 */
public class krestikiNoliki {
    public static void main(String[] args) {
        char[][] array = new char[3][3];

        //System.out.print(array.length);
        boolean victory = false;
        boolean check = false;
        showBoard(array);
        while(!victory){
            int count = 1;
            int x = getValidInt("Enter row number: ");
            int y = getValidInt("Enter column number: ");
            array[x-1][y-1] = 'x';
            victory = win(array);
            showBoard(array);

            if (isInCenter(array)&&count==1) {
               array=robotTurn(array,0,0);
            }
            if (!isInCenter(array)&&count==1){
                array = robotTurn(array,1,1);
            }
            if (twoFromTree(array, 'x') == null && twoFromTree(array, 'o') == null && count == 2) {
                if (array[0][0]==0){
                    array = robotTurn(array,0,0);
                }else{
                    if (array[0][1]==0){
                        array = robotTurn(array,0,1);
                    } else
                        if (array[0][2]==0){
                            array = robotTurn(array,0,2);
                        }
                }
            }
            if (twoFromTree(array,'x')!=null){
                int ar[] = twoFromTree(array,'x');
                array = robotTurn(array,ar[0],ar[1]);
            } else{
                if (twoFromTree(array,'o')!=null){
                    int ar[] = twoFromTree(array,'x');
                    array = robotTurn(array,ar[0],ar[1]);
                }
            }


            /*x = getValidInt("Enter row number: ");
            y = getValidInt("Enter column number: ");
            array[x-1][y-1] = '0';*/

            victory = win(array);
            System.out.print('\n');
            showBoard(array);
        }
        System.out.println("Victory!!");
    }

    public static boolean win(char a[][]) {
        boolean victory = false;
        if (a[0][0] == a[0][1] && a[0][1] == a[0][2] && (a[0][0] == 'x' || a[0][0] == 'o')) {
            victory = true;
        }
        if (a[1][0] == a[1][1] && a[1][1] == a[1][2] && (a[1][0] == 'x' || a[1][0] == 'o')) {
            victory = true;
        }
        if (a[0][0] == a[1][1] && a[1][1] == a[2][2] && (a[0][0] == 'x' || a[0][0] == 'o')){
            victory = true;
        }
        if (a[0][2] == a[1][1] && a[1][1] == a[2][0] && (a[0][2] == 'x' || a[0][2] == 'o')){
            victory = true;
        }
        if (a[1][0] == a[1][1] && a[1][1] == a[1][2] && (a[1][0] == 'x' || a[1][0] == 'o')) {
            victory = true;
        }
        if (a[2][0] == a[2][1] && a[2][1] == a[2][2] && (a[2][0] == 'x' || a[2][0] == 'o')){
            victory = true;
        }
        if (a[0][0] == a[1][0] && a[1][0] == a[2][0] && (a[0][0] == 'x' || a[0][0] == 'o')){
            victory = true;
        }
        if (a[2][0] == a[2][1] && a[2][1] == a[2][2] && (a[2][0] == 'x' || a[2][0] == 'o')){
            victory = true;
        }

            return victory;
    }



    public static void showBoard(char array[][]){
        for (int i =0;i<array.length;i++) {
            System.out.print("| ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]+" | ");
            }
            System.out.print("\n");
        }
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

    public static int getValidInt(String message){
        int i;
        boolean verify=false;
        do{
            i = getInt(message);
            if (i>0&&i<4){
                verify = true;
            }
        } while (!verify);
        return i;
    }

    public static boolean isInCenter(char array[][]){
        boolean inCenter = false;
        if (array[1][1]=='x'){
            inCenter = true;
        }
        return inCenter;
    }

    public static int[] twoFromTree(char array1[][], char symbol){
        int x=3,y=3;
        char[][] array = new char[5][5];
        for (int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                array[i][j] = array1[i][j];
            }
        }
        for(int j =0;j<array1.length;j++) {
            for (int i = 0; i < array1.length; i++) {
                if (array[i][j] == array[i + 1][j]&&(array[i][j]==symbol)) {
                    if (i == 0&&array[2][j]==0) {
                        x = 2;
                        y = j;
                    }
                    if (i == 1&&array[0][j]==0) {
                            x = 0;
                            y = j;
                    }
                }
                if (array[0][j] == array[2][j]&&(array[i][j]==symbol)&&array[1][j]==0) {
                        x = 1;
                        y = j;
                }
            }
        }
        for(int j =0;j<array1.length;j++) {
            for (int i = 0; i < array1.length; i++) {
                if (array[j][i] == array[j + 1][i]&&(array[j][i]==symbol)) {
                    if (j == 0&&array[2][i]==0) {
                        x = 2;
                        y = i;
                    }
                    if (j == 1&&array[0][i]==0) {
                        x = 0;
                        y = i;
                    }
                }
                if (array[0][i] == array[2][i]&&(array[i][j]==symbol)&&array[1][i]==0) {
                    x = 1;
                    y = i;
                }
            }
        }
        for(int j = 0; j<array1.length;j++){
            if (array[j][j]==array[j+1][j+1]&&(array[j][j]==symbol)){
                if(j==0&&array[2][2]==0){
                    x=2;
                    y=2;
                }
                if(j==1&&array[0][0]==0){
                    x=0;
                    y=0;
                }
            }
            if(array[j][j]==array[j+2][j+2]&&(array[j][j]==symbol)&&array[1][1]==0){
                x=1;
                y=1;
            }
        }
        if(array[0][2]==array[1][1]&&(array[0][2]==symbol)&&array[2][0]==0){
            x=2;
            y=0;
        }
        if(array[0][2]==array[2][0]&&(array[0][2]==symbol)&&array[1][1]==0){
            x=1;
            y=1;
        }
        if(array[1][1]==array[2][0]&&(array[1][1]==symbol)&&array[0][2]==0){
            x=0;
            y=2;
        }
      int[] arr = new int[]{x,y};
        if (arr[0]==3&&arr[1]==3){
            return null;
        }
        else{
            return arr;
        }
    }

    public static char[][] robotTurn (char array[][],int x,int y){
        array[x][y]='o';
        return array;
    }
}