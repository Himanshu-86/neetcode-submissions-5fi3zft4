class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> myint = new HashSet<>();
        for (int i = 0; i<nums.length; i++) {
            int number = nums[i];
            myint.add(number);
        }
        int longest = 0;
        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            if (!myint.contains(num - 1)) {
                int curNum = num;
                int curpos = 1;
                while (myint.contains(curNum + 1)) {
                    curNum++;
                    curpos++;
                }

                longest = Math.max(longest, curpos);
            }
        }

        return longest;
    }
}

