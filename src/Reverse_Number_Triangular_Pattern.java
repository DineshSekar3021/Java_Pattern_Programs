public class Reverse_Number_Triangular_Pattern {
    public static void main(String[] args) {
        int a=1;
        for(int i=1;i<5;i++){
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int k=i;k<5;k++){
                System.out.print(k+" ");
            }
            a++;
            System.out.println();
        }
    }
}
