class Solution {
    public int count(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')count++;
        }
        return count;
    }
    public int numberOfBeams(String[] bank) {
        int ans=0;
        for(int i=0;i<bank.length;i++){
            int count=count(bank[i]);
            if(count==0)continue;
            for(int j=i+1;j<bank.length;j++){
                if(count(bank[j])==0)continue;
                else{
                    int countj=count(bank[j]);
                    ans+=(countj*count);
                    break;
                }
            }
        }
        return ans;
    }
}