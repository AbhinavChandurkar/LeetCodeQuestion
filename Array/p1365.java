

public class p1365 {
    public static void main(String[] args) {
        int nums[] = {8,1,2,2,3};
        int count=0;
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            res[i] = count;
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
