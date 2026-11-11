package Hash;

import java.util.HashMap;
import java.util.Map;

class Hashmap {
    public static void main(String[] args) {

        Map<Integer,Double>   bank= new HashMap();

        bank.put(101,1000.0);

        bank.put(102,1000.0);
        bank.put(101, 5000.9);


        for(Integer key : bank.keySet())
        {
            System.out.println(key +  "    " +bank.get(key));
        }










    }
}