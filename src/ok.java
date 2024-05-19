import java.util.HashMap;
import java.util.Map;

public class ok {
    public static void main(String[] args) {
        Map<String,Integer> studnet = new HashMap<>();
        studnet.put("hrithik",80);
        studnet.put("Shreya",80);
        System.out.println(studnet);
        for(String name:studnet.keySet())
        {
            System.out.println(name+" : "+studnet.get(name));
        }
    }
}
