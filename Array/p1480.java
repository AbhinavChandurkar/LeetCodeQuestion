import java.util.*;

public class p1480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
          sum += nums[i]; 
          nums[i] = sum; 
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
}
