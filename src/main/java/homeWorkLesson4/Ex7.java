package homeWorkLesson4;

/**
 * Created by admin on 09.10.2016.
 */
public class Ex7 {
    public static void main(String[] args) {
        int[][][][] array = new int[10][10][10][10];
        for(int i1 =0;i1<10;i1++){
            for(int i2 =0;i2<10;i2++){
                for(int i3 =0;i3<10;i3++){
                    for(int i4 =0;i4<10;i4++){
                        array[i1][i2][i3][i4] = i1*1000+i2*100+i3*10+i4+1;
                    }
                }
            }
        }

        for(int i1 =0;i1<10;i1++){
            for(int i2 =0;i2<10;i2++){
                for(int i3 =0;i3<10;i3++){
                    for(int i4 =0;i4<10;i4++){
                        System.out.print(array[i1][i2][i3][i4]+", ");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
            }
        }
    }
}
