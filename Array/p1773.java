import java.util.*;

public class p1773 {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx;
        if(ruleKey.equals("type")){
            idx = 0;
        }else if(ruleKey.equals("color")){
            idx =1;
        }else{
            idx=2;
        }
        int count = 0;
        int n = items.size();
        for (int i = 0; i < n; i++) {
            // System.out.println(items.get(i).get(idx));
            if(items.get(i).get(idx) == ruleValue){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<String> p1 = new ArrayList<String>();
        p1.add("phone");
        p1.add("blue");
        p1.add("pixel");

        List<String> p2 = new ArrayList<String>();
        p2.add("computer");
        p2.add("silver");
        p2.add("lenovo");

        List<String> p3 = new ArrayList<String>();
        p3.add("phone");
        p3.add("gold");
        p3.add("iphone");

        List<List<String>> items = new ArrayList<>();
        items.add(p1);
        items.add(p2);
        items.add(p3);

        System.out.println(items);

        int ans = countMatches(items,"color","silver");
        System.out.println(ans);        

    }
}
