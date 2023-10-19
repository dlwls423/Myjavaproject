package week02;

import java.util.HashMap;
import java.util.Map;

public class Col6 {
    public static void main(String[] args) {
        // Map
        Map<String, Integer> intMap = new HashMap<>();

        intMap.put("일", 11);
        intMap.put("이", 12);
        intMap.put("삼", 13);
        intMap.put("사", 14);

        for (String key: intMap.keySet()){
            System.out.println(key);
        }

        for (Integer value: intMap.values()){
            System.out.println(value);
        }

        System.out.println(intMap.get("삼"));
    }
}
