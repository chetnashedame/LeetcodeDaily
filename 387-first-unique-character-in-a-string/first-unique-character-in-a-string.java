class Solution {
    public int firstUniqChar(String s) {
        int []arr= new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        for(int c=0; c<s.length(); c++){
            if(arr[(s.charAt(c))-'a']==1){
                return c;
            }
        }return -1;
        
    }
}