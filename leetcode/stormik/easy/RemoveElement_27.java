package leetcode.stormik.easy;

public class RemoveElement_27 {

    public int removeElement(int[] nums, int val) {
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == val) {
                for (int j=i; j<nums.length; j++) {
                    if (nums[j] != val) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                count++;
                continue;
            }
            break;
        }
        return count;
    }

}
