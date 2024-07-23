public class Hollow_HourGlass_Pattern {
    public static void main(String[] args) {
        int a=1;
        for (int i=4;i>0;i--){
            for(int j=a;j>0;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                if(k==1 ||i==4 ||k==i){
                System.out.print("*"+" ");
            }else{
                System.out.print("  ");
            }

        }
            a++;
            System.out.println();
    }
        int b=3;
        for (int i=2;i<5;i++){
            for (int j=b;j>0;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                if (k==1 || k==i||i==4){
                    System.out.print("*"+" ");
                }else {
                    System.out.print("  ");
                }
            }
            b--;
            System.out.println();
        }
}
}
