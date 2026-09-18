class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] freq = new int[26];
            for(char c : s.toCharArray()){
                int count = freq[c-'a'];
                count++;
                freq[c-'a'] = count;
                
            }
            
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append(freq[i]).append('#');
            }
            String key = sb.toString();

            if(map.get(key) != null){
                List<String> strings = map.get(key);
                strings.add(s);
                map.put(key,strings);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key,list);
            }
        }
        //System.out.println(map);
        List<List<String>> ans = new ArrayList<>();
        for(String key : map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
}
