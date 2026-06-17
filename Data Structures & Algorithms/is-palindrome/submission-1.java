class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        String str = removeSpepcialChars(s);
        int end = str.length()-1;
        while (start<=end){
            if(str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            }
            else
                return false;
        }
        return true;
    }

    private String removeSpepcialChars(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for(char c : s.toCharArray()){
            if(isAlphanumeric(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString().toLowerCase();
    }

    private boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }
}
