class Solution {
    public int maxProfit(int[] nums) {
        int n = nums.length,sum=0;
        int[] dp=new int[nums.length];
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
            dp[i]=nums[i+1]-nums[i];
        }
        for(int i=0;i<n;i++){
           if(dp[i]>0)sum+=dp[i];
        }
        return sum;
    }
}