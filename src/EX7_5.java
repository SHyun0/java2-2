import java.util.*;

public class EX7_5 {
    public static void main(String[] args) {
        HashMap<String, String> dic= new HashMap<String, String>();

        dic.put("baby", "아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        Set<String> keys = dic.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
            String key = it.next();
            String value = dic.get(key);
            System.out.println("(" + key + "," + value + ")");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<3; i++) {
            System.out.print("찾고싶은단어는? ");
            String eng= scanner.next();

            String kor= dic.get(eng);
            if(kor== null) 
                System.out.println(eng+ "는없는단어입니다.");
             else 
                System.out.println(kor);
        }
    }
}
