class Solution {
        private static boolean total(int[] nums ,int h, int mid){
        int hour =0;
        for(int num : nums){
            hour+= (num + mid -1)/mid;
        }

        if(hour <= h){
            return true;
        }

        return false;
        
    }
    public int minEatingSpeed(int[] nums, int h) {
          int low =1;
        int high = 0;
        for(int num : nums){
            high = Math.max(high,num);
        }
        

        while(low < high){
            int mid = low + (high- low )/2;
            boolean eat = total(nums,h,mid);
            if(eat){
                
                high = mid;
            }else{
                low = mid +1;
            }
        }

        return low;
    }
}