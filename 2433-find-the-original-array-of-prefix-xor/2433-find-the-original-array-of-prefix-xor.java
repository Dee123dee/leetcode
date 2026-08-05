class Solution {
    public int[] findArray(int[] pref) {
        int res[] = new int[pref.length];
        res[0] = pref[0];
        int t = res[0];
        for(int i=1;i<pref.length;i++)
        {
            res[i] = t ^ pref[i];
            t = t ^ res[i];
        }
        return res;
    }
}