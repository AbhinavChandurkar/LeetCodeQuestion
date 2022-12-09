
/**
 * p1720
 */
public class p1720 {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int ans[] = new int [n+1];
        ans[0] = first;
        for (int i = 1; i < n+1; i++) {
            ans[i] = ans[i-1]^encoded[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        // int arr[] = {1,2,3};
        // int first = 1;
        // System.out.println(decode(arr,first));


    }
}