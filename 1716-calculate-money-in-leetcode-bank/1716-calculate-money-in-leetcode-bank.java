class Solution {
    public int sumOf(int n){
        if(n==0|| n==1)return n;
        return(n*(n+1))/2;
    }
    public int totalMoney(int n) {
        int count=0;
        int sum=0,j=0;
        int deno = n/7;
        if(n<=7){
            return sumOf(n);
        }
        sum+=((sumOf(7)*deno)+(deno*(deno-1)/2)*(7)+sumOf(n%7));
        if(n%7!=0){
            sum+=((deno)*(n%7));
        }
        return sum;
    }
}