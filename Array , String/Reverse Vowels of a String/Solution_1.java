class Solution {
    public String reverseVowels(String s) {
         ArrayList<Integer> n = new ArrayList<Integer>();
        for(int i = 0 ; i < s.length();i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                n.add(i);
            }
        }
        int a = 0;
        int b = n.size()-1;
        StringBuilder sb = new StringBuilder(s);
        while(a <= b){
            swap(n.get(a),n.get(b),sb);
            a++;
            b--;
        }
        return sb.toString();
    }

    public void swap(int a,int b,StringBuilder sb){
        char temp =  sb.charAt(a);
        sb.setCharAt(a, sb.charAt(b));
        sb.setCharAt(b, temp);
    }
}


/*
Runtime 3ms
Memory  45.19MB
 */