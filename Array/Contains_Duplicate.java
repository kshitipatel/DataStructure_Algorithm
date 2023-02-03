class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Sort Array easy to solve
        Arrays.sort(nums);
        // traversal on array
        for(int i = 0; i < nums.length - 1; i ++)  {
            // we are checking next element is equal to previous element
            if(nums[i] == nums[i + 1]) {
                return true;
            }
         }
        //  if any element in array not equal then return false
        return false;
    }
}