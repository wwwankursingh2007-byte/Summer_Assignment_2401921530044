class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int currsum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxsum=sum;
        for(int i=k;i<=nums.length-1;i++){
            currsum=sum-nums[i-k]+nums[i];
            maxsum=Math.max(maxsum,currsum);
            sum=currsum;
        }
        return (double)maxsum/k;
    }
}