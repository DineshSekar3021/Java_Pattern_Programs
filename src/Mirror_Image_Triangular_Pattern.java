public class Mirror_Image_Triangular_Pattern {

        public static void main(String[] args) {

            for(int i=1;i<5;i++){
                for (int j=1;j<i;j++){
                    System.out.print(" ");
                }
                for (int k=i;k<5;k++){
                    System.out.print(k+" ");
                }

                System.out.println();
            }
            int a=3;
            for (int i=2;i<5;i++){
                for (int j=a;j>0;j--){
                    System.out.print(" ");
                }
                for (int k=2;k<i;k++){
                    System.out.print(k+" ");
                }
                a--;
                System.out.println();
            }
        }
    }


