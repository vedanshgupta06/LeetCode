class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        Map<String,List<Integer>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String str=new String(arr);
            if(map.containsKey(str)){
               map.get(str).add(i);
            }else{
                List<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(str,list);
            }
        }
        int j=0;
        for(String ele:map.keySet()){
            List<String> group=new ArrayList<>();
            for(int idx:map.get(ele)){
                group.add(strs[idx]);
            }
            ans.add(group);
        }
        return ans;
    }
}