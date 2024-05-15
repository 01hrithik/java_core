abstract class Compu{
    public  abstract void code();
}
class Laptop extends  Compu{
    public void code(){
        System.out.println("code,compile,run");
    }
}
class Desktop extends  Compu{
    public void code(){
        System.out.println("code,compile,run");
    }
}
class Devloper{
    public void devAPpp(Compu lap){
        lap.code();
    }
}

public class mycode {
    public static void main(String args[]){
         Compu la= new Laptop();
         Compu al = new Desktop();
        System.out.println("my first java code");
        System.out.println(89);
        Devloper Hrithik  = new Devloper();
        Hrithik.devAPpp(al);
    }
}
