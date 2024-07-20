public class Palndrome_Traingle {
    public static void main(String[] args) {
        for (int i=1;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print("  ");
            }
            for (int k=i;k>0;k--){
                System.out.print(k+" ");
            }
            for(int l=2;l<=i;l++){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}
