class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<Integer> result = new ArrayList<>();
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{0, 0});

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0], c = curr[1];

            result.add(nums.get(r).get(c));

            // down
            if (c == 0 && r + 1 < nums.size()) {
                q.offer(new int[]{r + 1, 0});
            }

            // right
            if (c + 1 < nums.get(r).size()) {
                q.offer(new int[]{r, c + 1});
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}