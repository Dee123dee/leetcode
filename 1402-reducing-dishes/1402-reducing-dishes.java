import java.util.*;

class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);

        int total = 0;
        int suffixSum = 0;

        for (int i = satisfaction.length - 1; i >= 0; i--) {
            suffixSum += satisfaction[i];

            if (suffixSum > 0) {
                total += suffixSum;
            } else {
                break;
            }
        }

        return total;
    }
}