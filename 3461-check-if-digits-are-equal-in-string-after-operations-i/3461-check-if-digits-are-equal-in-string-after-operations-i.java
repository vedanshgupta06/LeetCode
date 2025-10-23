class Solution {
    public boolean check(String s){
        if(s.charAt(0)==s.charAt(1))return true;
        return false;
    }
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
        StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length()-1;i++){
                int num=(s.charAt(i)-'0'+s.charAt(i+1)-'0')%10;
                sb.append(num);
            }
            s=sb.toString();
        }
        return check(s);
    }
}