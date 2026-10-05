class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int n = heights.length;
        int j=n-1;
        int ans = Integer.MIN_VALUE;
        while (i <n && j >0){
            int currentMax = (j - i) * Math.min(heights[i], heights[j]);
            ans = Math.max(currentMax, ans);

            if(heights[i] < heights[j])
                i++;
            else
                j--;
        }
        return ans;
    }
}
