class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length()-1;
        char [] arr = s.toCharArray();
        while(i<j){
            
            if(IsEnglish(arr[i])){
                while(!IsEnglish(arr[j])){
                j--;
            }

                char temp= arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
            i++;
        }
        return new String(arr);

        
    }

    public boolean IsEnglish(char c){
        return ((65<= c && c<= 90) || (97<= c && c<= 122));
    }
}