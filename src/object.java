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

public class object {
    public static void main(String args[]){

   Calc hi = new Calc();
   System.out.println(hi.add(5,5));
        System.out.println(hi.add(10,5));
        System.out.println(hi.modulo(10,2));
        System.out.println(hi.multiply(5,6));
        System.out.println(hi.subtract(2,9));
    }
}
