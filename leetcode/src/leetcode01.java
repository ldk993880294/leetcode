import java.util.Arrays;

//二分查找
public class leetcode01 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,3,5,7,9};
        int target=4;
        System.out.println(binanry(nums,target));
    }

    private static int binanry(int[] nums, int target) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        Arrays.sort(nums);
        int left = 0, right = nums.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }
}
