class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        //store the frequency
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[] bucket = new List[n+1];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                int num = entry.getKey();
                int count = entry.getValue();

                if(bucket[count] == null){
                    bucket[count] = new ArrayList<>();
                }
                bucket[count].add(num);

        }

        int[] result  = new int[k];
        int index = 0;
        for(int freq = bucket.length-1; freq >= 0 && index < k ;freq--){

            if(bucket[freq]!= null){
                for(int num : bucket[freq]){
                    result[index] = num;
                    index++;
                }

                if(index == k){
                    break;
                }

            }
        }

        return result;

        
    }
}