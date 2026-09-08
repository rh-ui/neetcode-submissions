class Solution {
    public String encode(List<String> strs) {
        StringBuffer strBuffer = new StringBuffer();

        for (String str : strs) {
            strBuffer.append(str.length() + "#" + str);
        }

        return strBuffer.toString();
    }

    public List<String> decode(String str) {
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
