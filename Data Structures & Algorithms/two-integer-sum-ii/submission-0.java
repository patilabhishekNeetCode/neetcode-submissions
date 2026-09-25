class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int smallerPointer = 0;
        int n = numbers.length;
        int greaterPointer = n-1;
        int[] ans = new int[2];
        while(smallerPointer < greaterPointer){
            int sum = numbers[smallerPointer] + numbers[greaterPointer];
            if(sum == target){
                ans[0] = smallerPointer+1;
                ans[1] = greaterPointer+1;
                return ans;
            }
            if(sum > target){
                greaterPointer--;
            }
            else {
                smallerPointer++;
            }
        }
        ans[0] = smallerPointer+1;
        ans[1] = greaterPointer+1;
        return ans;
    }
}
