class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int len = s2.length();

        if(n > len)
            return false;

        HashMap<Character, Integer> fre = new LinkedHashMap<>();
        for(char c : s1.toCharArray()){
            fre.put(c, fre.getOrDefault(c,0)+1);
        }
        
        int left = 0;
        int right = n;

        Map<Character, Integer> temp = new LinkedHashMap<>();
        for(int i=0;i<s1.length();i++){
            temp.put(s2.charAt(i), temp.getOrDefault(s2.charAt(i),0)+1);
        }
        while (len - left >= n){
            boolean flag = true;
            for(char c : fre.keySet()){
                if(!Objects.equals(fre.get(c), temp.get(c))){
                    int count = temp.get(s2.charAt(left));
                    if(count <= 1){
                        temp.remove(s2.charAt(left));
                    }
                    else {
                        temp.put(s2.charAt(left), temp.get(s2.charAt(left)) -1);
                    }
                    flag = false;
                    if(right< len)
                        temp.put(s2.charAt(right),temp.getOrDefault(s2.charAt(right),0)+1);
                    right++;
                    break;
                }
            }
            if(flag){
                return true;
            }
            left++;
        }
        return false;

    }
}
