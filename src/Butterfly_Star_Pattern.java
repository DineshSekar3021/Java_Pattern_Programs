public class Butterfly_Star_Pattern {
    public static void main(String[] args) {
        int a=10;
        for (int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                if(((i+j)%2)==0){
                    System.out.print("*"+" ");
                }else {
                    System.out.print("  ");
                }
            }
            for(int k=a;k>0;k--){
                System.out.print("  ");
            }
            for (int l=1;l<=i;l++){
                if((l%2)!=0){
                    System.out.print("*"+" ");
                }else {
                    System.out.print("  ");
                }
            }
a=a-2;
            System.out.println();
        }
    }
}
