package LeetCode.String;

import java.util.HashMap;

public class p387 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(solve(s));
    }

    static public int solve(String s){
        int n = s.length();
        int ans;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < n; i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1) ; 
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println(map);
        return 0;
    }

}
