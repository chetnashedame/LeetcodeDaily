class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
        int maxcount=0;
        int maxlength=0;

        HashMap<Character,Integer> map=new HashMap<>();

        for(int right=0; right<s.length(); right++){
            char curr=s.charAt(right);
            map.put(curr, map.getOrDefault(curr, 0)+1);//for freuency of character
            maxcount=Math.max(maxcount, map.get(curr));
            while((right-left+1)-maxcount>k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar); // Remove the character if its count is zero
                }
                left++;
            }
            maxlength=Math.max(maxlength, right-left+1);
        }return maxlength;
    }
}