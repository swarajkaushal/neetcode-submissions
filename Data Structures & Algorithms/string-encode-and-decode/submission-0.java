class Solution {

    public String encode(List<String> strs) {
        StringBuilder b = new StringBuilder();
        for(String s : strs){
            b.append(s.length())
            .append("#")
            .append(s);
        }

        return b.toString();
    }

    public List<String> decode(String str) {
        List<String> lis = new ArrayList<>();
         int i =0;
         int n = str.length();
        while(i < n){

         int j =i;
         while(str.charAt(j) != '#'){
            j++;
         }

        int length = Integer.parseInt(str.substring(i,j));
        int start = j + 1;
        lis.add(str.substring(start,start + length));
        i = start + length;
        }

        return lis;
    }
}
