class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
            if (n <= 1) {
                return n;
            }
            
            int write = 0;
            int read = 1;
            int count = 1;
            
            for (; read <= n; read++) {
                if (read < n && chars[read] == chars[read - 1]) {
                    count++;
                } else {
                    chars[write] = chars[read - 1];
                    write++;
                    if (count > 1) {
                        String countStr = String.valueOf(count);
                        for (int i = 0; i < countStr.length(); i++) {
                            chars[write] = countStr.charAt(i);
                            write++;
                        }
                    }
                    count = 1;
                }
            }
            
        return write;
    }
}