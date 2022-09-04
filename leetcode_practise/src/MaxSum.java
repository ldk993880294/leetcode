import java.util.Arrays;

public class MaxSum {
    public static void main(ComString[] args) {
        int[] nums=new int[]{8,3,4,5,7,8};
        int total=10;
        System.out.println(maxSum(nums,total));

    }

    private static int maxSum(int[] nums, int total) {
        Arrays.sort(nums);
        int num=0;
        for(int i=nums.length-1;i>=0;i--){
            if(total>=0){
                total-=nums[i];
                num++;
            }
        }
        return num-1;
    }
}
