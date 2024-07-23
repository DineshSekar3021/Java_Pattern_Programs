public class Diamond_Pattern {
    public static void main(String[] args) {
        int a=5;
        for (int i=1;i<6;i++){
            for (int j=a;j>0;j--){
                System.out.print(" ");
            }
            for (int k=i;k>0;k--){
                System.out. print("*"+" ");
            }
            a--;
            System.out.println();
        }
        int b=1;
        for(int i=4;i>0;i--){
            for (int j=b;j>=0;j--){
                System.out.print(" ");
            }
            for (int k=i;k>0;k--){
                System.out.print("*"+" ");
            }b++;
            System.out.println();
        }
    }
}
