class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        char[] arr1=s.toCharArray();
        int index=0;
        for(char c: arr1){
            if(Character.isLetterOrDigit(c)){
                arr1[index]=Character.toLowerCase(c);
                index++;
            }
        }

        char[] arr2=new char[index];
        System.arraycopy(arr1, 0, arr2, 0, index);
        int j=0;
        int i=arr2.length-1;
        while(j<i){
            if(arr2[j]!=arr2[i]){
                return false;
            }j++;
            i--;
        }    
        return true;
    }
}