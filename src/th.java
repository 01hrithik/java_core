class Hate extends Thread{
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("i hate you"+" "+i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class LOVE extends Thread{
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.println("i love you"+" "+i);
        }
    }
}
public class th {
    public static void main(String[] args) {
 Hate iol =  new Hate();
 LOVE loi = new LOVE();
        System.out.println(iol.getPriority());
        loi.setPriority(Thread.MAX_PRIORITY);
 iol.start();
 loi.start();

    }
}
