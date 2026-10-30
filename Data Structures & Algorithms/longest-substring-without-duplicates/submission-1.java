class Solution {
    //varivable sliding window 
    public int lengthOfLongestSubstring(String s) {
       Set<Character> set = new HashSet<>();
        int maxLen =0;

        int l =0;
        for(int r = 0;r<s.length();r++){

            //remove fi the Characger is laready in the set 
            while (set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }

            set.add(s.charAt(r));

            maxLen = Math.max(maxLen,r-l+1);
        }

        return maxLen;
    }
}
