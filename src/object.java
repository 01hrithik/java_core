class Calc{
    int num_1;
    int num_2;
    public int add(int num_1,int num_2){
        int ans=num_1+num_2;
        return ans;
    }

    public int subtract(int num_1,int num_2){
        int ans=num_1-num_2;
        return ans;
    }

    public int multiply(int num_1,int num_2){
        int ans=num_1*num_2;
        return ans;
    }

    public int divide(int num_1,int num_2){
        int ans=num_1/num_2;
        return ans;
    }

    public int modulo(int num_1,int num_2){
        int ans=num_1%num_2;
        return ans;
    }
}

class Computer{
    public void PlayMusic(){
        System.out.println("playing love me like you do");
    }

    public String GetPen(int cost){
        if(cost <=10){
            return "buy pen";
        }
        return "don't buy pen";
    }
}
public class object {
    public static void main(String args[]){

   Calc hi = new Calc();
        System.out.println(hi.add(5,5));
        System.out.println(hi.add(10,5));
        System.out.println(hi.modulo(10,2));
        System.out.println(hi.multiply(5,6));
        System.out.println(hi.subtract(2,9));

        Computer com = new Computer();
        com.PlayMusic();
        System.out.println(com.GetPen(11));
    }
}
