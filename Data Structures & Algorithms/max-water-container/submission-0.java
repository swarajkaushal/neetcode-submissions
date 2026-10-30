class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxarea =0;
        int maxl = 0;
        int maxr =0;
        int l =0;
        int r = n-1;
        while(l<r){
        int area = (r-l) * Math.min(height[l],height[r]);
            if(area > maxarea){
                maxarea = area;
                maxl = l;
                maxr =r;
            }

            if(height[l]<height[r]){
                l++;
            }else{ 
                r--;
            }
        }
        return maxarea;
    }
}
