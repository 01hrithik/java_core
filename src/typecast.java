class F{
    public void show(){
        System.out.println("in F show");
    }
}

class P extends  F{
public void show_1(){
    System.out.println("in P show");
}
}


abstract class Car{
    public abstract void drive();
    public void music(){
        System.out.println("play music");
    }
}

class jeep extends Car{
    public void drive(){
        System.out.println("car started &driving");
    }
}

public class typecast {
    public static void main(String[] args) {
       F obj = new P();
       obj.show();

       P obj_ = (P) obj;
       obj_.show_1();
       int num =69;
       Integer nm = num;
        System.out.println(nm);

        int num_= nm.intValue();
        System.out.println(num_);

        String str ="169";
        int num_0 = Integer.parseInt(str);
        System.out.println(num_0*2);

        Car o = new jeep();
        o.drive();
        o.music();

    }
}
