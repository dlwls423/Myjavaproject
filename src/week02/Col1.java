package week02;

import java.util.ArrayList;

public class Col1 {
    public static void main(String[] args) {
        // List
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        //System.out.println(intList.get(0));

        intList.set(1, 10);
        //System.out.println(intList.get(1));

        System.out.println(intList.get(0));
        intList.remove(0);
        System.out.println(intList.get(0));
        //삭제 시 앞으로 밀림

        intList.clear();
        System.out.println(intList.toString());
    }
}
