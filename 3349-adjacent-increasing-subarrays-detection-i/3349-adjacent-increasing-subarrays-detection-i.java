class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        if(k==1)return true;
        for(int i=0;i<=nums.size()-2*k;i++){
            boolean flag=true,flag2=true;
            for(int j=i;j<i+k-1;j++){
                if(nums.get(j)>=nums.get(j+1)){
                    flag=false;
                    break;
                }
            }
            for(int l=i+k;l<i+k+k-1;l++){
                if(nums.get(l)>=nums.get(l+1)){
                    flag2=false;
                    break;
                }
            }
            if(flag&&flag2)return true;
        }
        return false;
    }
}