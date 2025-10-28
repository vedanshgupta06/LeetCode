class Solution {
    public int countValidSelections(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int[] arr=Arrays.copyOf(nums,nums.length);
            int dir=1,j=i;
            if(nums[i]!=0)continue;
            while(j>=0&&j<n){
                if(arr[j]==0){
                    if(dir==1)j++;
                    else j--;
                }else if(arr[j]>0){
                    arr[j]--;
                    if(dir==1)dir=0;
                    else dir=1;
                    if(dir==1)j++;
                    else j--;
                }
            }
            int sum=0;
            for(int k=0;k<arr.length;k++){
                sum+=arr[k];
            }
            if(sum==0)count++;
        }
        for(int i=0;i<n;i++){
            int[] arr=Arrays.copyOf(nums,nums.length);
            int dir=0,j=i;
            if(nums[i]!=0)continue;
            while(j>=0&&j<n){
                if(arr[j]==0){
                    if(dir==1)j++;
                    else j--;
                }else if(arr[j]>0){
                    arr[j]--;
                    if(dir==1)dir=0;
                    else dir=1;
                    if(dir==1)j++;
                    else j--;
                }
            }
            int sum=0;
            for(int k=0;k<arr.length;k++){
                sum+=arr[k];
            }
            if(sum==0)count++;
        }
        return count;
    }
}