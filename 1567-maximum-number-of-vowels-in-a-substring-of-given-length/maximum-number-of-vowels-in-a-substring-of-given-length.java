class Solution {
    public int maxVowels(String s, int k) {
        int l=0, r=0, res=0, win=0;
        for(;r < k; r++){
            win += IsVowel(s.charAt(r));
        }
        res = win;
        while(r < s.length()){
            win -= IsVowel(s.charAt(l++));
            win += IsVowel(s.charAt(r++));
            res = Math.max(res, win);

        }
        return res;
    }

    public int IsVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 :0 ;
    }
}