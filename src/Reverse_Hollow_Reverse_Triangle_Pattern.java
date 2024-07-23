public class Reverse_Hollow_Reverse_Triangle_Pattern {
    public static void main(String[] args) {
        int a=1;
        for (int i=6;i>0;i--){
            for (int j=a;j>1;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                if(k==1 || k==i|| i==6){
                    System.out.print("*"+" ");
                }else {
                    System.out.print("  ");
                }
            }a++;
            System.out.println();
        }
    }
}
