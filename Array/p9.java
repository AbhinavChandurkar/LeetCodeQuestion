



public class p9 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int x =  -12-1;
        System.out.println(x);
        System.out.println(isPalindrome(x));

    }    
    public static boolean isPalindrome(int x) {
        // convert input into an array and rest is nothing but a simple two pointer solution
        char[] nums = String.valueOf(x).toCharArray();
        int start = 0;
        int end = nums.length-1;
        while(start < end) {
            if(nums[start] != nums[end]) return false;
            start++; end--;
        }
       return true;
   }

}
