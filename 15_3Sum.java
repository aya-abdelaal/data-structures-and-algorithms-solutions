class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i<nums.length-2 &&  nums[i] <= 0; i++){
            if(i != 0 && nums[i] == nums[i-1])
                continue;
            
            int left = i + 1;
            int right = nums.length -1;

            while(left<right)
            {   
                if(left != i +1 && nums[left] == nums[left -1]){
                    left++;
                    continue;
                }
                
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    res.add(new ArrayList<Integer> (Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;
                    
                }
                else if(sum< 0)
                    left++;
                else
                    right--;
            }

        }

        return res;
    }
}
