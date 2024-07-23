public class Hollow_Diamond_Pattern {
    public static void main(String[] args) {
        int a=4;
        for (int i=1;i<5;i++){
            for (int j=a;j>1;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                if (k==1 || k==i){
                System.out.print("*"+" ");
            }else{
                    System.out.print("  ");
                }
        }a--;
            System.out.println();
    }
        int b=1;
        for (int i=3;i>0;i--){
            for (int j=b;j>0;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                if (k == 1 || k == i) {
                    System.out.print("*"+" ");
                }else {
                    System.out.print("  ");
                }
            }
            b++;
            System.out.println();
        }
}}
