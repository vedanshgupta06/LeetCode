class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length;
        Arrays.sort(potions);
        int[] pairs = new int[n];
        
        for(int i=0;i<n;i++){
            int lo=0,hi=potions.length-1;
            while(lo<=hi){
                int mid=lo+(hi-lo)/2;
                if((long)spells[i]*potions[mid]>=success){
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }
            pairs[i]= potions.length-lo;
        }
        return pairs;
    }
}