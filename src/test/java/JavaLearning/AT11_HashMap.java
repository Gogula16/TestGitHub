package JavaLearning;

import org.junit.Test;

import java.util.HashMap;

// declaring maps

public class AT11_HashMap {
    @Test
    public void Test15(){
        HashMap<String,Integer> map= new HashMap<>();
        map.put("Ash",10);
        map.put("Baby",9);
        map.put("Charlie",8);
        map.put("Darpan",7);
        map.put("Eva",6);
        System.out.println("Values in Map : "+map);
        System.out.println("Size of HashMap : " +map.size());
        if(map.containsKey("Ash")){
        int i= map.get("Ash");
            System.out.println("Value for key is : "+1);
        }
    }
}

