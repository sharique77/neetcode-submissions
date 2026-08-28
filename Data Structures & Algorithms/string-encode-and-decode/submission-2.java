class Solution {

    public String encode(List<String> strs) {

        StringBuilder encodedStr = new StringBuilder();

        for(int i=0;i<strs.size();i++){
            String str = strs.get(i);
            encodedStr.append(str.length());
            encodedStr.append("#");
            encodedStr.append(str);
        }

        return encodedStr.toString();  //5#Hello5#World
        
    }

   public List<String> decode(String s) {

    List<String> decodedStr = new ArrayList<>();

    int i = 0;

    while (i < s.length()) {

        // Find '#'
        int j = i;

        while (s.charAt(j) != '#') {
            j++;
        }

        // Get complete length
        int len = Integer.parseInt(s.substring(i, j));

        // Move past '#'
        j++;

        // Extract string of length 'len'
        String str = s.substring(j, j + len);

        decodedStr.add(str);

        // Move to next encoded string
        i = j + len;
    }

    return decodedStr;
}

}