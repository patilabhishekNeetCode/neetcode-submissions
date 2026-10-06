class Solution {
    public int lengthOfLongestSubstring(String s) {
        if( s == null || s.isEmpty())
            return 0;

        //zxyzxyz
        HashMap<Character, Integer> map = new HashMap<>();
        int ans=0;
        int n = s.length();
        int left = 0;
        for (int right = 0; right <n ; right++) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.get(ch) > 1){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            ans = Math.max(ans, right - left + 1 );
        }
        return ans;
    }
}
