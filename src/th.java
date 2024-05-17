
class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}
public class th {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
 Runnable iol = ()->{
     for (int i = 1; i <10000 ; i++) {
        c.increment();
     }
 };

 Runnable loi = ()->{
     for (int i = 1; i <10000 ; i++) {
           c.increment();
        }
        };
    Thread t1 = new Thread(iol);
    Thread t2 = new Thread(loi);
 t1.start();
 t2.start();
 t1.join();
 t2.join();
        System.out.println(c.count);

    }
}
