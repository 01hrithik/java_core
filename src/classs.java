abstract class X{
    public abstract void age();
    public void show(){
        System.out.println("in show");
    }

}

class L extends X{
    public void config(){
        System.out.println("in config");
    }

    @Override
    public void age() {
        System.out.println("age is age");
    }
}

public class classs {
    public static void main(String[] args) {


X oil =new X(){
    public void age(){
        System.out.println("in ceo");
    }
};
oil.show();
oil.age();

    }
}
