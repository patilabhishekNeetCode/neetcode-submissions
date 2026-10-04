class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()).append('#').append(str);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(str == ""){
            return new ArrayList<>();
        }
        int n = str.length();
        List<String> ans = new ArrayList<>();
        int i=0;
         while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            ans.add(str.substring(i, j));
            i = j;
        }
        return ans;
    }
}
