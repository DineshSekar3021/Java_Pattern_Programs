import java.util.*;

public class Sum_of_Digits {
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();

        int sum=0;
        while(b>0){
            int remainder=b%10;
            sum=sum+remainder;
            b=b/10;
        }
        System.out.println(sum);
    }
}
