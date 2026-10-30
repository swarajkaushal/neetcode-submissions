class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n<m || m < n){
            return false;
        }

        Map<Character,Integer> map = new HashMap<>();
        for(int i =0; i<n;i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }


        for(int j = 0;j<n;j++){
            if(!map.containsKey(s.charAt(j))){
                return false;
            }

            map.put(s.charAt(j),map.get(s.charAt(j))-1);

            if(map.get(s.charAt(j))==0){
                map.remove(s.charAt(j));
            }
        }

        return true;
    }
}
