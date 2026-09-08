class Solution {
    public String encode(List<String> strs) {
        StringBuilder strBuffer = new StringBuilder();

        for (String str : strs) {
            strBuffer.append(str.length()).append("#").append(str);
        }

        return strBuffer.toString();
    }

    public List<String> decode(String str) {

        if(str==null|| str=="") return new ArrayList<>();
        
        int i = 0, len, j;
        List<String> decodedStrs = new ArrayList<>();

        while (i < str.length()) {
            j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            len = Integer.parseInt(str.substring(i, j));
            decodedStrs.add(str.substring(j + 1, j + 1 + len));
            i = j + 1 + len;
        }

        return decodedStrs;
    }
}
