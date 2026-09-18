class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;
    
        boolean isValid = true;
        char[] freqS = new char[26];
        for(char c : s.toCharArray()){
           freqS[c - 'a']++;
        }

        char[] freqT = new char[26];
        for(char c : t.toCharArray()){
            freqT[c - 'a']++;
        }
        
        for (char c : s.toCharArray()){
            if (freqS[c-'a'] != freqT[c-'a'])
                return false;
        }
        
        return isValid;

    }
}
