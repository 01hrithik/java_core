import java.util.*;

public class ll {
    public static void main(String[] args) {
        List<Integer> nums =  new ArrayList<Integer>();
        nums.add(6);
        nums.add(69);
        nums.add(9669);
        nums.add(9696);
        System.out.println(nums.get(0));
        System.out.println(nums.indexOf(69));
        System.out.println(nums);
        for(Object n :nums){
            int num = (Integer)n;
            System.out.print("["+" "+(num*2)+" "+"]");
        }

        Collection<Integer> value = new TreeSet<Integer>();
        value.add(90);
        value.add(80);
        value.add(70);
        value.add(60);
        value.add(50);
        System.out.println();
          for(int ahh :value){
              System.out.print(ahh+" ");
          }
          Iterator<Integer> values = value.iterator();
          while(values.hasNext())
        System.out.print(values.next()+" ");
    }
}
