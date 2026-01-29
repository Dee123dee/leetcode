class Solution {
    Map<List<Integer>, Integer> memo = new HashMap<>();

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return dfs(price, special, needs);
    }

    private int dfs(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        if (memo.containsKey(needs)) {
            return memo.get(needs);
        }

        // Buy items without any special offer
        int minCost = 0;
        for (int i = 0; i < needs.size(); i++) {
            minCost += needs.get(i) * price.get(i);
        }

        // Try each special offer
        for (List<Integer> offer : special) {
            List<Integer> newNeeds = new ArrayList<>();
            boolean valid = true;

            for (int i = 0; i < needs.size(); i++) {
                if (offer.get(i) > needs.get(i)) {
                    valid = false;
                    break;
                }
                newNeeds.add(needs.get(i) - offer.get(i));
            }

            if (valid) {
                minCost = Math.min(
                    minCost,
                    offer.get(offer.size() - 1) + dfs(price, special, newNeeds)
                );
            }
        }

        memo.put(needs, minCost);
        return minCost;
    }
}
