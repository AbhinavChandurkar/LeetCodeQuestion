import java.util.*;

public class p1470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt(); 
        int[] nums = new int[n];
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int i =1,j=n1,k=1;
        res[0] = nums[0];
        while(j <= n-1 && i <=n1){
            if(k%2 == 0){
                res[k] = nums[i];
                i++;
                k++;
            }else{
                res[k] = nums[j];
                j++;
                k++;
            }
        }
        for (int q = 0; q < res.length; q++) {
            System.out.print(res[q]+" ");
        }
        sc.close();
    }
}
/**
 *  I can use two pointer 
 *  1 at the beginning 
 *  2 at the mid 
 *  6
    3
    2 5 1 3 4 7 
 * 
 */
