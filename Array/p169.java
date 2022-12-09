import java.util.HashMap;

public class p169 {
    public static void main(String[] args) {
        int nums[] = {9999999,21};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(i);
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }    
        }
        System.out.println(map);
    }
}