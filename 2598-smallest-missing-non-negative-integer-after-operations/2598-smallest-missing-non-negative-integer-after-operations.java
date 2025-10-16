class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n= nums.length;
        for(int i=0;i<n;i++){
            nums[i] = ((nums[i]%value)+value)%value;
        }
        int[] freq = new int[value];
        for(int i=0;i<n;i++){
           if(nums[i]>-1) freq[nums[i]]++;
        }
        int min=freq[0],idx = 0;
        for(int i=0;i<value;i++){
            if(freq[i]<min){
                min=freq[i];
                idx=i;
            }
        }
    return min*value+idx;
    }
}