package lesson4;

/**
 * Created by admin on 07.10.2016.
 */
public class Arrays1 {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        a[0]= 1;
        a[1]= 2;
        a[2]= 3;
         for(int i=0;i<a.length;i++){

            System.out.println(a[i]);
        }
        for(int arrElement:a){
            System.out.println(arrElement);
        }
    }
}
