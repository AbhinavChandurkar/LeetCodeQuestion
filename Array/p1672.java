import java.util.*;;

public class p1672 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] accounts = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int[] col : accounts) {
            int temp = 0;
            for (int row : col) {
                temp += row;
            }
            if(temp > sum){
                sum = temp;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
