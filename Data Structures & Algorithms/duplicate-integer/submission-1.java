class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        AtomicBoolean flag = new AtomicBoolean(false);
        Arrays.stream(nums).forEach(num -> {
            if (!set.add(num)) {
                flag.set(true);
            }
        });
        return flag.get();
    }
}