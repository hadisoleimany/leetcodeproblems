class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
   
        reversArray(nums,0,nums.length-1);
        reversArray(nums,0,k-1);
        reversArray(nums,k,nums.length-1);
    
    }
    public void reversArray(int[]nums, int start, int end){
        while(start<end){
            int temp= nums[end];
            nums[end--] = nums[start];
            nums[start++]=temp;
        }
    }
}
//189. Rotate Array
