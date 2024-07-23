public class Zoho_Question {
    public static void main(String[] args) {
        int a=4;
        for (int i=1;i<6;i++){
            for (int j=a;j>0;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                if ((k%2)!=0) {
                    System.out.print("*");

                }else {
                    System.out.print(" ");

                }

            }
            a--;
            System.out.println();
        }
        int b=1;
        for(int i=4;i>0;i--){
            for (int j=b;j>=1;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                if((k%2)!=0){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            b++;
            System.out.println();
        }
    }
}
