class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n= nums.length;
        for(int i=0;i<n;i++){
            nums[i] = nums[i]%value;
        }
        int[] freq = new int[value+1];
        for(int i=0;i<n;i++){
           if(nums[i]>-1) freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0)return i;
        }
    return freq.length;
    }
}