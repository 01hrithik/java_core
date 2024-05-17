
class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B  extends A{
    public void show(){
        System.out.println("in B show");
    }
}

class C extends B{
    public void show(){
        System.out.println("in c show");
    }
}

 class Col{
    public void show() {
        System.out.println("by hrithik");
    }

    public void add(int a, int b){
        System.out.println(a + b);
    }
}

class AdCOL extends Col{
    public void show(){
        System.out.println("by  johnn");
    }
}
public class polymorphim {
    public static void main(String args[]){
        /*
        type of polymorphim :-
        compile time
        run time
         */
        A obj =new A();
        obj.show();

        obj = new B();
        obj.show();

        obj= new C();
        obj.show();

       final int num = 0;

       System.out.println(num);
       Col obj_1= new Col();
       obj_1.show();
       obj_1.add(8,9);

       AdCOL o = new AdCOL();
       o.show();
       o.add(9,0);

    }
}
