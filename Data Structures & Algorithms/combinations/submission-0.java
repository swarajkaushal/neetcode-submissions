class Solution {
    private void process(int idx,int n ,int k , List<Integer> curr , List<List<Integer>> result){
        //base 
        if(curr.size()==k){
            result.add(new ArrayList<>(curr));
        }

        for(int i = idx;i<= n;i++){
        curr.add(i);
        process(i+1,n,k,curr,result);
        curr.remove(curr.get(curr.size()-1));
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        process(1,n,k,new ArrayList<>(),result);
        return result;
    }
}