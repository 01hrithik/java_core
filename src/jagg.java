import java.util.Scanner;
public class jagg {
    public static void main(String args[]){

        //taking input from user.
        Scanner cs = new Scanner(System.in);
        int[][] array = new int[2][5];

        for(int i=0; i< array.length; i++){
            for (int j=0; j<= array.length; j++){
                array[i][j] = (int)(Math.random()*8);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        for(int n[]: array){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}
