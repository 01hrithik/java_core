public class expect {
    public static void main(String[] args) {
        int value=0;
        int j=0;
       try
        {
            j=20/value;
        }catch (Exception e){
           System.out.println("Somethig wrong!"+" -> "+e);
       }
        System.out.println(j);

       int num[] = new int[5];
       try{
           System.out.println(num[5]);
       }catch (Exception F){
           System.out.println("wrong dude!"+" -> "+F);
       }

       //throw.
    }
}
