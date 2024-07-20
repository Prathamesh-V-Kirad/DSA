class Solution {
    public String predictPartyVictory(String senate) {
        byte[] senateArr = senate.getBytes();
        int direBans = 0, radBans = 0, direCount = 0, radCount = 0;

        while (true) {
            for (int i = 0; i < senateArr.length; i++) {
                if (senateArr[i] == 'D') {
                    if (radBans > 0) {
                        senateArr[i] = 0; 
                        radBans--;
                    } else {
                        direCount++;
                        direBans++;
                    }
                } else if (senateArr[i] == 'R') {
                    if (direBans > 0) {
                        senateArr[i] = 0; 
                        direBans--;
                    } else {
                        radCount++;
                        radBans++;
                    }
                }
            }

            if (radCount == 0 && direCount != 0) return "Dire";
            if (direCount == 0 && radCount != 0) return "Radiant";
            radCount = 0;
            direCount = 0;
        }
    }
}