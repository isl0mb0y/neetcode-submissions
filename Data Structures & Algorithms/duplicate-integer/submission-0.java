class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length < 2) {
            return false;
        }

        for (int num:nums) {
            if(!set.add(num)) {
                return true;
            }
        }

        return false;
    }
}