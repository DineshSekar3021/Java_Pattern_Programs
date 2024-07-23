public class Left_Half_Pyramid {
    public static void main(String[] args) {
        int a=8;
        for (int i=1;i<6;i++){
            for (int j=a;j>0;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }a=a-2;
            System.out.println();
        }
    }
}
