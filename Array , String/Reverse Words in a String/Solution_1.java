class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] arrOfStr = s.trim().split("\\s+");
		for (int i = (arrOfStr.length-1) ; i > 0 ; i--){
                str.append(arrOfStr[i]);
                str.append(" ");
		}
        str.append(arrOfStr[0]);
        return str.toString();
    }
}