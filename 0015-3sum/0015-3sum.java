class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) continue; 
            int j=i-1;
            int k=0;
            while(k<j){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum==0){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(arr[i]);
                    triplet.add(arr[j]);
                    triplet.add(arr[k]);
                    ans.add(triplet);
                    k++;
                    j--;
                    while(k<j && arr[k-1]==arr[k])k++;
                    while(k<j && arr[j]==arr[j+1])j--;
                }else if(sum>0){
                    j--;
                }else{
                    k++;
                }
            }
        }

        return ans;
    }
}