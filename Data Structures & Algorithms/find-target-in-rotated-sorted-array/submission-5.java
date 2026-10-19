class Solution {
        public int search(int[] nums, int target) {
        int n = nums.length;

        // Step 1: find the index of the minimum (the pivot), same as findMin
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) left = mid + 1;
            else right = mid;
        }
        int pivot = left;

        // Step 2: both halves pivot..n-1 and 0..pivot-1 are sorted, so pick the one that can hold the target
        int ans;
        if (target >= nums[pivot] && target <= nums[n - 1]) {
            ans = Arrays.binarySearch(nums, pivot, n, target);     // range is [pivot, n)
        } else {
            ans = Arrays.binarySearch(nums, 0, pivot, target);     // range is [0, pivot)
        }
        return ans < 0 ? -1 : ans;
    }
}
