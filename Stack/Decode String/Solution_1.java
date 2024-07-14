public class Solution {
    public String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int index = 0;
        int count = 0;

        while (index < s.length()) {
            char c = s.charAt(index);
            
            if (Character.isDigit(c)) {
                count = count * 10 + (s.charAt(index) - '0');
            } else if (c == '[') {
                counts.push(count);
                count = 0;
                resultStack.push(result);
                result = new StringBuilder();
            } else if (c == ']') {
                StringBuilder temp = resultStack.pop();
                int repeatTimes = counts.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(result);
                }
                result = temp;
            } else {
                result.append(c);
            }
            index++;
        }

        return result.toString();
    }
}
