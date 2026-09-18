class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapped = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            mapped.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++) {
            int diff = target - nums[i];
            if(mapped.containsKey(diff) && mapped.get(diff) != i) {
                return new int[] {i, mapped.get(diff)};
            }
        }
        return new int[0];

        
    }
}
