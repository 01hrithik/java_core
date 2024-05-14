class eddie{
    public eddie(){
        super();
        System.out.println("hello there!");
    }
    public eddie(int n){
        super();
        System.out.println("in eddie phone message pop-up");
    }
}

class meddie extends eddie{
    public meddie(){
        super();
        System.out.println("in mddie");
    }
    public meddie(int n){
        this();
        System.out.println("in meddie messeg pop up");
    }
}

public class inherit {
    public static void main(String args[]){
       meddie phone = new meddie(5);
    }
}
