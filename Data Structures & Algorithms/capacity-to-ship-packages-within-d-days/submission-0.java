class Solution {

    private boolean capicity(int[] weights, int days,int min){
        int total = 0;
        int day = 1;
        for(int num : weights){
            if(total + num <= min){
                total += num;
            }else{
                day++;
                total = num;
            }
            
        }

        if(day<=days){
        return true;
         }
  
        return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low = 0;
        int high = 0;
        for(int num : weights){
            low = Math.max(low,num);
            high += num;
        }
        while(low < high){
            int mid = low + (high-low)/2;
            if(capicity(weights,days,mid)){
                high = mid;

            }else{
                low = mid+ 1;
            }
        }

        return low;
    }
}