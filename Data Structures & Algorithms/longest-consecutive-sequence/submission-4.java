class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int maxLength = 1;
        int count = 1;

        if(nums.length == 0){
            return 0;
        }
        
        int l=0;
        for(int r=1;r<nums.length;r++){
            if(nums[r] == nums[r-1]){ //duplicate
            continue;
            }

            else if(nums[r] - nums[r-1] == 1){
                count++;
            }
            else{
                l=r;
                count =1;
            }

            maxLength = Math.max(maxLength, count);

        }

        return maxLength;

       
}

}
