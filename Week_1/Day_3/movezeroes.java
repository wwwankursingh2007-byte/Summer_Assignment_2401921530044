class Solution {
    public void moveZeroes(int[] nums) {
        int j=1;
        int i=j-1;
        while(j<nums.length){
            if(nums[i]==0 && nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
            else if(nums[i]==0 && nums[j]==0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
        
    }
}