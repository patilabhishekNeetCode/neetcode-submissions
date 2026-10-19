class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right  = nums.length-1;
        while (left < right){
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;     // the drop is after mid, so the min is to the right
            } else {
                right = mid;        // mid..right is sorted, so the min is at mid or to its left
            }
        }
        return nums[left];
    }
}


