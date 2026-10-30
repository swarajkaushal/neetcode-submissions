class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int[26];
        int maxfreq =0;
        int maxcount =0;
        int l =0;
        int r =0;
        while(r<n){
            freq[s.charAt(r) -'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(r)-'A']);
            r++;

            while((r-l)-maxfreq > k){
                freq[s.charAt(l) -'A']--;
                l++;
            }

            maxcount = Math.max(maxcount , r-l);
        }

        return maxcount;
    }
}
