public class Triangular_Star_Pattern {
    public static void main(String[] args) {
        int a=4;
        for (int i=1;i<6;i++){
            for (int j=a;j>0;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*"+" ");
            }
            a--;
            System.out.println();
        }
    }
}
