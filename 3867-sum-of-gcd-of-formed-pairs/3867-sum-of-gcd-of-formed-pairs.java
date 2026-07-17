class Solution {
    private static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
        return a;
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for(int i = 0;i<n;i++)
        {
            max = Math.max(max,nums[i]);
            nums[i] = gcd(max,nums[i]);
        }
        Arrays.sort(nums);

        long result = 0;
        int left = 0, right = n-1;
        while(left<right)
        {
            result = result + gcd(nums[left],nums[right]);
            left++;
            right--;
        }
        return result;
    }
}