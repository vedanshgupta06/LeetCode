class Solution {
    public boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        int[] count = new int[26];
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        for(int c:count){
            if(c!=0)return false;
        }
        return true;
    }
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            ans.add(words[i]);
        }
        int i=1;
        while(i<ans.size()){
            if(isAnagram(ans.get(i-1),ans.get(i)))ans.remove(i);
            else i++;
        }
        return ans;
    }
}