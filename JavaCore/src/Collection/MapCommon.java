package Collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapCommon {


    public static void main(String[] args) {


        Map<String, Integer> map = new TreeMap<>();
        map.put("abidin", 99);
        map.put("kemal", 50);
        map.put("ali", 234);
        map.put("ali", 234);
        map.put("ali", 45);
        map.put("ayşe", 687);
        map.put("fatma", 3245);
        System.err.println(map.isEmpty());
        System.err.println(map.containsValue(50) + "50 var kıymış");
        System.err.println(map.containsKey("abidin") + "abidin var mıymış");
        System.err.println(map.get("abidin"));
        System.err.println("///////");
        map.values().forEach(System.err::println);
        map.keySet().forEach(System.err::println);
        System.err.println("////////");
        for (String name :
                map.keySet()) {
            System.err.println(name);

        }


        map.forEach((k, v) -> System.err.println(k + " is refer to :" + v));


        map.entrySet().forEach(enty -> System.err.println(enty.getKey() + "-->>>" + enty.getValue()));


        Set keys = map.keySet();

        map.put("mike", null);
        map.put("kemal", 4324);
        map.put("mike", 55);
        map.put("luke", 31);
        Integer original = map.replace("abidin", 66);
        System.err.println(map);


        map.replaceAll((k, v) -> k.length());
        System.err.println(map);

    }


}
