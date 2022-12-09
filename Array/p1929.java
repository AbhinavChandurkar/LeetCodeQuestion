import java.util.Scanner;

public class p1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // for (int i = 0; i < ans.length/2; i++) {
        //     ans[i] = nums[i];
        //     ans[i + n] = nums[i];
        // }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }

        sc.close();
    }
}
