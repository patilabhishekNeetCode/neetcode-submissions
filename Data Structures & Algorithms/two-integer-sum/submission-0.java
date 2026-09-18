class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null && (target - nums[i] == nums[map.get(target - nums[i])])) {
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
            } else
                map.put(nums[i], i);
            //System.out.println(map);
        }
        return ans;
    }
}
