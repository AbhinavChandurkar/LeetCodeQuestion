import java.util.*;

public class p1512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        int pairs =0;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i] == nums[j]){
                    pairs++;
                }
            }
        }
        sc.close(); 
        System.out.println(pairs);
    }
}
