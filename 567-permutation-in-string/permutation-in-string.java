class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()){
            return false;
        }

        int[]counts1=new int[26];
        int[]counts2=new int[26];

        for(int i=0; i<s1.length();i++){
            counts1[s1.charAt(i)-'a']++;
            counts2[s2.charAt(i)-'a']++;
        }
        if(matches(counts1,counts2))
            return true;
        

        for(int i=s1.length(); i<s2.length();i++){
            counts2[s2.charAt(i)-'a']++;
            counts2[s2.charAt(i-s1.length())-'a']--;
        
            if(matches(counts1,counts2))
                return true;
            }return false;
        
    }   
    private boolean matches(int[]counts1, int [] counts2){
        for(int i=0; i<26; i++){
            if(counts1[i]!=counts2[i])
                return false;
        }return true;
    }    
}   
