class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
        return "";

        HashMap<Character, Integer> tfreq=new HashMap<>(256);
        HashMap<Character, Integer> winfreq=new HashMap<>(256);
           
        for(char c:t.toCharArray()){
            tfreq.put(c, tfreq.getOrDefault(c, 0)+1);
        }   

        int left=0, right=0, minlength=Integer.MAX_VALUE, start=0;
        int required=tfreq.size();
        int count=0; 

        while(right<s.length()){
            char c= s.charAt(right);
            winfreq.put(c, winfreq.getOrDefault(c, 0)+1);

            if(tfreq.containsKey(c) && winfreq.get(c).intValue()==tfreq.get(c).intValue()){
                count++;
            }

            while(count == required){
                if(right-left+1<minlength){
                    minlength=right-left+1;
                    start=left;
                }
                char l=s.charAt(left);
                winfreq.put(l, winfreq.getOrDefault(l,0)-1);

                if(tfreq.containsKey(l) && winfreq.get(l)<tfreq.get(l)){
                    count--;
                }
                left++;
            }
            right++;

        }
        return minlength==Integer.MAX_VALUE ? "" : s.substring(start, start+minlength);
    }    
}