class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] products = new int[nums.length];
        products[nums.length - 1]=  1;
        int prod = 1;
        for(int i = nums.length - 2; i >= 0 ; i--){
            prod *= nums[i+1];
            products[i]= prod;
        }

        prod = 1;
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            nums[i]= prod * products[i];
            prod *= temp;
        }
        return nums;
    }
}
