public class Reverse_Left_Half_Pyramid {
    public static void main(String[] args) {
        int a=1;
        for (int i=6;i>0;i--){
            for (int j=a;j>1;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*"+" ");
            }
          a=a+2;
            System.out.println();
        }
    }
}
