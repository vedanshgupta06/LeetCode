class Solution {
    public int countValidSelections(int[] nums) {
        int sum=0;
        int n=nums.length,count=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            leftSum+=nums[i];
            if(nums[i]==0){
                if(sum-leftSum==leftSum)count+=2;
                else if(Math.abs((sum-leftSum)-leftSum)==1)count+=1;
            }
        }
        return count;
    }
}