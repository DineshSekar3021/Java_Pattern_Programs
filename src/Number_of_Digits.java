import java.util.Scanner;

public class Number_of_Digits {
    public static void main(String[] args) {
        int sum=0;
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        while (b > 0) {

            int remainder =b%10;
            sum++;
            b=b/10;
        }
        System.out.println(sum);
    }

}
