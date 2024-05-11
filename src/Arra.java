public class Arra {
   public static void main(String args[]){

       int number[] = {4,5,9,6};
       System.out.println(number[3]);

       for(int run=0; run<number.length; run++){
           System.out.println(number[run]);
       }

       int num[][] = new int[3][4];
       for(int i=0; i<num.length; i++){
           for(int j=0; j<=num.length; j++){
               num[i][j] = (int)(Math.random()*6);
               System.out.print(num[i][j] +" ");
           }
           System.out.println();
       }


   }
}
