class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int l = 0;
        int r = heights.length - 1;

        while(l<r){
            int containerLength = r-l;
            int area = (Math.min(heights[l], heights[r])) * containerLength;

            if(area>maxWater){
                maxWater=area;
            }
            if(heights[l] < heights[r]){
                l++;
            }
            else {
                r--;
            }            
        }
        return maxWater;
    }
}
