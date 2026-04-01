class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) return false;

        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        String sortedS1 = new String(s1Arr);

        for (int i = 0; i <= len2 - len1; i++) {

            String sub = s2.substring(i, i + len1);
            char[] subArr = sub.toCharArray();
            Arrays.sort(subArr);
            String sortedSub = new String(subArr);

            if (sortedSub.equals(sortedS1)) {
                return true;
            }
        }

        return false;
    }
}
