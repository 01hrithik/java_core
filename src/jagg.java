import java.util.Scanner;
public class jagg {
    public static void main(String args){

        //taking input from user.
        Scanner cs = new Scanner(System.in);
        int[][] array = new int[2][3];

        for(int i=0; i< array.length; i++){
            for (int j=0; j<= array.length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
