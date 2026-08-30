class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] productArray = new int[nums.length];
        int n = nums.length;

        //Prefix Product
        int prefix = 1; 

        for(int i=0;i<n;i++){
            productArray[i] = prefix;
            prefix = prefix * nums[i];
            
        }

        //Suffix Product
        int suffix = 1;

        for(int i=n-1;i>=0;i--){
            productArray[i] = productArray[i] * suffix;
            suffix = suffix * nums[i];
        }

        return productArray;
    }
}  
