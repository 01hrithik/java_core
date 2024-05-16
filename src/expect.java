public class expect {
    public static void main(String[] args) {
        int value=0;
        int j=0;
       try
        {
            j=20/value;
        }catch (Exception e){
           System.out.println("Somethig wrong!");
       }
        System.out.println(j);
    }
}
