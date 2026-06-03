class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int water=0,max=0;
        while(i<j){
            water=(Math.min(height[j],height[i]))*(j-i);
            max=Math.max(max,water);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }


        }
        return max;
        
    }
}