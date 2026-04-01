public class Solution {
    public int maxArea(int[] heights) {
        int result = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                int minimum = Math.min(heights[i], heights[j]);
                result = Math.max(result, minimum * (j - i));
            }
        }
        return result;
    }
}