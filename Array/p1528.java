
import java.util.HashMap;

public class p1528 {
    public static void main(String[] args) {
        HashMap<Integer,Character> map = new HashMap<>();
        String str = "codeleet";
        int arr[] ={4,5,6,7,0,2,1,3};
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], str.charAt(i));
        }
        String ans = "";
        for (int i = 0; i < map.size(); i++) {
            ans += map.get(i);
        }
        System.out.println(ans);
    }
}
