import java.util.*;

public class p1313 {
    public static void main(String[] args) {
        int nums[] = {1,1,2,3};
        int arrSize=0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }
        int [] res = new int[arrSize];
        int n = nums.length;
        int i = 0;
        int k =0;
        while (i < n) {
            int freq = nums[i];
            int j = i+1;
            while(freq > 0){
                res[k] = nums[j];
                k++;
                freq--;
            }
            i = i+2;
        }
        System.out.println(Arrays.toString(res));
    }
}
