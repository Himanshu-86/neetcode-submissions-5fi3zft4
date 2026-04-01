class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] newList = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int pro=1;
            for(int j = 0; j<nums.length; j++){
                if(i != j){
                    pro=pro*nums[j];
                }
            }
            newList[i] = pro;
        }
        return newList;
    }
}
