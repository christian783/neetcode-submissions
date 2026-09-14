class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prev = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(prev.containsKey(complement)){
                return new int[]{prev.get(complement),i};
            }
            prev.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
