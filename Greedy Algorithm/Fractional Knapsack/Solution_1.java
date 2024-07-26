class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item arr[], int n) {
        
        Arrays.sort(arr, new Comparator<Item>() {
            public int compare(Item o1, Item o2) {
                double r1 = (double) o1.value / o1.weight;
                double r2 = (double) o2.value / o2.weight;
                return Double.compare(r2, r1);
            }
        });

        double maxValue = 0.0;

        for (Item item : arr) {
            if (w == 0) break;

            if (item.weight <= w) {
                w -= item.weight;
                maxValue += item.value;
            } else {
                maxValue += ((double) item.value / item.weight) * w;
                w = 0;
            }
        }

        return maxValue;
    }
}