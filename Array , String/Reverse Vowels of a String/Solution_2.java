class Solution {
    public String reverseVowels(String s) {
        boolean[] vowels=new boolean[128];
        for(char c:"aeiouAEIOU".toCharArray())
            vowels[c]=true;
        
        char[] str=s.toCharArray();
        int i=0,j=str.length-1;
        while(i<j){
            while(i<j && !vowels[str[i]]){
                i++;
            }
            while(i<j && !vowels[str[j]]){
                j--;
            }
        
            if(i<j){
                char temp=str[i];
                str[i]=str[j];
                str[j]=temp;
                i++;
                j--;
            }
        }
        return String.valueOf(str);
    }
}

/*
Runtime 1ms
Memory  44.72MB
 */