import javax.swing.*;
import java.util.Arrays;

public class Fibinocci_Series {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2 + " ");
        int b[] = new int[9];
        b[0]=n1;
        b[1]=n2;
        for (int i = 2; i < 9; i++) {

            n3 = n1 + n2;
            b[i] = n3;

            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
        System.out.println(Arrays.toString(b));
        for (int j = b.length-1; j>=0; j--) {
            if(b[j]<=7){
                System.out.println("hii");
                int k=b[j];
                for (int p=j-2;p>=0;p--){
                    int e=k+b[p];
                    if (e==7){
                        System.out.println(p+" "+j);

                    }
                }

            }
        }

    }
}

