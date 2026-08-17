class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexArray = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){

            int complement = target - nums[i];

            if(map.containsKey(complement)){
                int val = map.get(complement);
                if(i < val){
                    indexArray[0] = i;
                    indexArray[1] = val;
                }
                else if(val < i){
                    indexArray[0] = val;
                    indexArray[1] = i;
                }
            }
        }

        return indexArray;
    }
}
