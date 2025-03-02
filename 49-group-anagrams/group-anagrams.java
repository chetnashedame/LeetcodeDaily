class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String,List> map= new HashMap<>();
        for(String s:strs){
            int[]count=new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb= new StringBuilder();
            for(int i:count){
                sb.append('#');
                sb.append(i);
            }
            String Key=sb.toString();
            if(!map.containsKey(Key)){
                map.put(Key, new ArrayList<String>());
            }
            map.get(Key).add(s);
        }
      return new ArrayList(map.values());  
    }
}   
    