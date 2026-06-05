class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int index,List<String> segments,List<String> result) {

        if (segments.size() == 4) {
            if (index == s.length()) {
                result.add(String.join(".", segments));
            }
            return;
        }

        for (int len = 1; len <= 3; len++) {
            
            if (index + len > s.length()) {
                break;
            }

            String part = s.substring(index, index + len);

            if (part.length() > 1 && part.charAt(0) == '0') {
                continue;
            }

            if (Integer.parseInt(part) > 255) {
                continue;
            }

            segments.add(part);

            backtrack(s, index + len, segments, result);

            segments.remove(segments.size() - 1);
        }
    }
}