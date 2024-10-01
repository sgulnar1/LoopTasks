public class TCode {
    public static void main(String[] args) {
        int height = 7;
        int width = 9;
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                if(i==0 || j==width/2)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
