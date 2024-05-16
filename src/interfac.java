interface  U{
    void love();
   void hate();
   int age=25;
  String area="surat";
}

interface R{
    void run();
}

interface O  extends R{

}

class G  implements U,R{
    public void love(){
        System.out.println( "in love");
    }

    @Override
    public void hate() {
        System.out.println("in hate");
    }

    @Override
    public void run() {
        System.out.println("run..");
    }
}
public class interfac {
    public static void main(String[] args) {

U obi;
obi = new G();
obi.love();
obi.hate();

        System.out.println(U.age);
    }
}