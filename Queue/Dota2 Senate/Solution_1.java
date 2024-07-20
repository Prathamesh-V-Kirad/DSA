class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }
        int n = senate.length();
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int r = radiant.poll();
            int d = dire.poll();

            if (r < d) {
                radiant.add(r + n);
            } else {
                dire.add(d + n);
            }
        }
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}