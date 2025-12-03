public class second {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        for(int i=0;i<rows;i++){
            for(int s=0;s<i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<cols;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
