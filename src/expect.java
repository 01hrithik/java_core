class HrithikExpetion extends RuntimeException{
    public HrithikExpetion(String string){
 super(string);
    }
}

class PO{
        public void showed(){

            try{
                Class.forName("demo");
            }catch (ClassNotFoundException e){
                System.out.println("undefined class name");
            }
        }
}

public class expect {
    public static void main(String[] args) {
        int value=2;
        int j=0;
       try
        {
            j=2/value;
            if(j==0){
                throw new HrithikExpetion("i don't print zero");
            }
        }catch (HrithikExpetion e){
           System.out.println("Somethig wrong!"+" -> "+e);
       }
        System.out.println(j);

       int num[] = new int[5];
       num[3]=69;
       try{
           System.out.println(num[3]);
       }catch (Exception F){
           System.out.println("wrong dude!"+" -> "+F);
       }

       //throws

 PO ou = new PO();
 ou.showed();
    }
}
