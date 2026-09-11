class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int temp=0;
        for(int i=0; i<nums.length-1; i++) {
            temp=nums[i];
            if(nums[i+1] == temp) {
                return true;
            }
        }
        return false;
        
    }
}