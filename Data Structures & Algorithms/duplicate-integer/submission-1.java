class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        //more simple way to just know whether array contains duplicate or not is to use Set instead of Map.

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                return true;
            }
            else{
                map.put(nums[i],1);
            }
        }

        return false;
    }
}