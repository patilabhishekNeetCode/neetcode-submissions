class Solution {
    public int characterReplacement(String s, int k) {
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            set.add(c);
        }

        int ans = 0 ,  maxFreq = 0;
        int n = s.length();
        for (char c : set) {
            int count = 0, left = 0;
            for(int r=0; r<n; r++){
                if(c == s.charAt(r)){
                    count++;
                    maxFreq = Math.max(maxFreq, count);
                }
                while ( (r- left + 1) -maxFreq > k ){
                    if(s.charAt(left) == c ){
                        count--;
                    }
                    left++;
                }
                ans = Math.max(r - left + 1, ans);
            }

        }
        return ans;
    }
}
