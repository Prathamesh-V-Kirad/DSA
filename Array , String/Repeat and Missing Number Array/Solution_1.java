public class Solution {
    public int[] repeatedNumber(final int[] A) {
        int xorArray = 0, xorRange = 0;
        int n = A.length;
        
        for (int num : A) {
            xorArray ^= num;
        }

        for (int i = 1; i <= n; i++) {
            xorRange ^= i;
        }

        int xorResult = xorArray ^ xorRange;
        int rightmostSetBit = xorResult & ~(xorResult - 1);
        int missing = 0, duplicate = 0;

        for (int num : A) {
            if ((num & rightmostSetBit) != 0) {
                duplicate ^= num;
            } else {
                missing ^= num;
            }
        }
        for (int i = 1; i <= n; i++) {
            if ((i & rightmostSetBit) != 0) {
                duplicate ^= i;
            } else {
                missing ^= i;
            }
        }

        for (int num : A) {
            if (num == duplicate) {
                return new int[]{duplicate, missing};
            }
        }
        return new int[]{missing, duplicate};
    }
}
