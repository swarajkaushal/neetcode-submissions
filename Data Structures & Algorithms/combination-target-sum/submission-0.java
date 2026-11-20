class Solution {
    private void process(int idx,int[] candidates, int target,List<List<Integer>> result,List<Integer> current){
        //base cond 
        if(target ==0){
            result.add(new ArrayList<>(current));
            return;
        }

        if(idx == candidates.length){
            return ;
        }

        //pick
        if(candidates[idx] <= target){
        current.add(candidates[idx]);
        //stay wit the same index because the repatation is allowed 
        process(idx,candidates,target-candidates[idx],result,current);

        //backtrack
        current.remove(current.get(current.size()-1));
        }

        //dont pick 

        process(idx+1,candidates,target,result,current);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> result = new ArrayList<>();
         process(0,candidates,target,result, new ArrayList<>());
         return result;
    }
}