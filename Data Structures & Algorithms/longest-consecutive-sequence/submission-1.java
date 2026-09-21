class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest =0;
        for(int i : nums)
            set.add(i);

        for(int i : nums){
            if(!set.contains(i-1)){
                int length = 0;
                while (set.contains(i + length)){
                    length++;
                }
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
