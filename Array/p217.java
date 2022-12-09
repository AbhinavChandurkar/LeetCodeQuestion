import java.util.*;

public class p217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }   
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                flag = true;
                break;
            }else{
            }
        } 
        System.out.println(flag);
        sc.close();
    }
}
