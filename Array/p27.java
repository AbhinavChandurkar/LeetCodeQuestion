package LeetCode.Array;
import java.lang.reflect.Array;
import java.util.*;
/**
 * create a array list and store all the value expexct the one 
 *  - nums[i] = val
 *  
 * 
 */
public class p27 {
    public static void main(String[] args) {
        int nums[] = {2,2,2};
        int val = 2;
        int k = removeElement(nums,val);
        Arrays.sort(nums,0,k);
        System.out.println(Arrays.toString(nums));


    }
    public static int removeElement(int[] nums, int val) {
        int ans=0;
        int n = nums.length;
        if(n < 2 && val == n){
            return 0;
        }   
        int i =0,j=n-1;
        int count=0;
        while(i<j){
            if(nums[i] == nums[j] && nums[j] == val && nums[i] == val){
                
            }
            if(nums[j] == val){
                j--;
                count++;
            }
            if(nums[i] == val){
                count++;
                int temp =nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
            i++;
        }
        ans = n-count;
        return ans;
    }
}
