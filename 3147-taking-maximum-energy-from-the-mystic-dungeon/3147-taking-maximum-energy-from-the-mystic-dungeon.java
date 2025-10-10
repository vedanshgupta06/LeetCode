class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int[] arr = new int[energy.length];
          int max = Integer.MIN_VALUE;
        for(int i=energy.length-1;i>=0;i--){
            if(i+k<energy.length)arr[i] = energy[i]+arr[i+k];
            else arr[i] = energy[i];
             max=Math.max(arr[i],max);
        }
        return max;
    }
}