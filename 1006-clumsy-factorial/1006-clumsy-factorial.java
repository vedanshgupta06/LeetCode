class Solution {
    public int clumsy(int n) {
        Stack<Integer> st=new Stack<>();
         st.push(n);
         int count=1;
        while(n>1){
           if(count==1){
            int pro=st.pop()*(n-1);
            st.push(pro);
           }else if(count==2 &&n-1>0){
             int div=st.pop()/(n-1);
             st.push(div);
           }else if(count==3){
            st.push(n-1);
           }else{
            st.push(-(n-1));
            count=0;
           }
           count++;
           n--;
        }
        int result=0;
        while(st.size()!=0){
            result+=st.pop();
        }
        return result;
    }
}