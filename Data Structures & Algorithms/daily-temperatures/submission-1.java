class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] results = new int[n];
        for (int i = 0; i < n-1; i++) {
            int j = i+1;
            int count =1;
            while(j< n && temperatures[j] <= temperatures[i]) {
                count++;
                j++;
            }
            if(j==n)
                results[i] = 0;
            else
                results[i] = count;
        }
        return results;
    }
}
