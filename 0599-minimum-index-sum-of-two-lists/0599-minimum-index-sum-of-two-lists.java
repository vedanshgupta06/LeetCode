class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> ans=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])&&i+j<min){
                    min=i+j;
                    ans.clear();
                    ans.add(list1[i]);
                }else if(list1[i].equals(list2[j]) && i+j==min){
                    ans.add(list1[i]);
                }
            }
        }
         String[] ansarr = ans.toArray(new String[0]);
         return ansarr;
    }
}