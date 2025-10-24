class Solution {
    public int nextBeautifulNumber(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        if(n==0)return 1;
        int min=n,max=1000000;
        while(true){
            if(min>n){
                int m=min;
                while(m>0){
                    int rem=m%10;
                    if(map.containsKey(rem)){
                        map.put(rem,map.get(rem)+1);
                    }else{
                        map.put(rem,1);
                    }
                    m/=10;
                }
                boolean flag=true;
                for(int ele:map.keySet()){
                    if(ele!=map.get(ele)){
                        map.clear();
                        flag=false;
                        break;
                    }
                }
                if(flag)return min;
            }
                min++;
        }
     
    }
}