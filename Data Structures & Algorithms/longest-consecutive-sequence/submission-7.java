class Solution {
    public int longestConsecutive(int[] nums) {
        //Most optimised solution O(n)
        Set<Integer> set = new HashSet<>(); //to lookup in O(1)
        for(int num: nums){
            set.add(num);
        }
        int longest = 0;

        for(int num : set){
            if(!set.contains(num-1)){
                int count = 1;  //first element of sequence is num.
                while(set.contains(num+count)){
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }

        return longest;

        
    }
}
