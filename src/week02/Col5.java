package week02;

import java.util.HashSet;
import java.util.Set;

public class Col5 {
    public static void main(String[] args) {
        // Set
        Set<Integer> intSet = new HashSet<Integer>();

        intSet.add(1);
        intSet.add(2);
        intSet.add(3);

        for(Integer value : intSet){
            System.out.println(value);
        }

        //contains
        System.out.println(intSet.contains(1));
        System.out.println(intSet.contains(5));

    }
}
