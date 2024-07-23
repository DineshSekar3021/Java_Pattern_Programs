public class Hollow_Triangle_Pattern {
    public static void main(String[] args) {
        int s=5;
        for (int i=1;i<6;i++){
            for (int j=s;j>0;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                if(  k==1  ||i==5 || k==i ){
                    System.out.print("*"+" ");
                }else {
                    System.out.print("  ");
                }
            }s--;
            System.out.println();
        }
    }
}
