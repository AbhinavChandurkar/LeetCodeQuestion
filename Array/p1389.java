
import java.util.ArrayList;
import java.util.Arrays;


class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i],nums[i]);
        }
        System.out.println(list);
        int arr[] = new int[list.size()];

        for (int i = 0; i < list.size(); i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}
public class p1389 {
    public static void main(String[] args) {
        int nums[] = {0,1,2,3,4};
        int index[] = {0,1,2,2,1};
        Solution s = new Solution();
        int[] ans = s.createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
        
    }
}
