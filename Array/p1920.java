import java.util.Scanner;

public class p1920 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      ans[i] = a[a[i]];
    }
    for (int i = 0; i < n; i++) {
      System.out.print(ans[i]);
    }
    sc.close();
  }
}
