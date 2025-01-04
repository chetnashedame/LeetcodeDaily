class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int [] arr = new int[26];
        for(char c: ransomNote.toCharArray()){
            arr[c-'a']++;   //maps the each char c to its index e.g 'a'>0, 'b'>1 and increment the count of each letter
        }
        for(char c: magazine.toCharArray()){
            arr[c-'a']--;
        }
        for(int i:arr){
            if(i>0)   //if count is positive it means ransomnote needs more letters than magazines provide
            return false;
        }
        return true;
    }
}