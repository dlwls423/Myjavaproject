package week02;

import java.util.*;

public class HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data_st = sc.nextLine();
        String sentence;

        if(data_st.equals("List")){
            ArrayList<String> stringList = new ArrayList<>();
            while(true){
                sentence = sc.nextLine();
                if(sentence.equals("끝")) break;
                else{
                    stringList.add(sentence);
                }
            }
            System.out.println("[ List " + stringList.get(0) +" ]");
            for(int i = 1; i < stringList.size(); i++){
                System.out.println(i + ". " + stringList.get(i));
            }
        }
        else if(data_st.equals("Set")){
            String title = sc.nextLine();
            Set<String> stringSet= new HashSet<>();
            while(true){
                sentence = sc.nextLine();
                if(sentence.equals("끝")) break;
                else{
                    stringSet.add(sentence);
                }
            }
            System.out.println("[ Set " + title +" ]");
            Iterator iter = stringSet.iterator();	// Iterator 사용
            for(int i = 0; i < stringSet.size(); i++) {//값이 있으면 true 없으면 false
                System.out.println(i+1 + ". " + iter.next());
            }
        }
        else{
            Map<Integer, String> stringMap = new HashMap<>();
            int key = 0;
            while(true){
                sentence = sc.nextLine();
                if(sentence.equals("끝")) break;
                else{
                    stringMap.put(key, sentence);
                    key++;
                }
            }
            System.out.println("[ Map " + stringMap.get(0) +" ]");
            for(int i = 1; i < stringMap.size(); i++){
                System.out.println(i + ". " + stringMap.get(i));
            }
        }
    }
}
