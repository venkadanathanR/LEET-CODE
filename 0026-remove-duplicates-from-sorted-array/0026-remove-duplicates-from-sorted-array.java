class Solution {
    public int removeDuplicates(int[] nums) {
        int nn=nums.length;

        int n=1;
        for(int i=0;i<nn;i++){
            if(nums[i]!=nums[n-1]){
                nums[n]=nums[i];
                n++;


            }
        }
        return n;
    }
}