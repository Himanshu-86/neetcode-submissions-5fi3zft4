class Solution {
    public int maxProduct(int[] nums) {
        
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            int tempMax = Math.max(num, Math.max(num * max, num * min));
            int tempMin = Math.min(num, Math.min(num * max, num * min));

            max = tempMax;
            min = tempMin;

            result = Math.max(result, max);
        }

        return result;
    }
}
