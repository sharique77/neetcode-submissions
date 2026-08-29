class Solution {

    public String encode(List<String> strs) {

        StringBuilder encodedStr = new StringBuilder();

        for(int i=0;i<strs.size();i++){
            String str = strs.get(i);
            encodedStr.append(str.length());
            encodedStr.append("#");
            encodedStr.append(str);
        }

        return encodedStr.toString(); //5#Hello5#World

    }

    public List<String> decode(String str) {

        List<String> decodedStr = new ArrayList<>();

            int i=0;
            while(i<str.length()){
            int j=i; //just to find first '#'

            while(str.charAt(j) != '#'){
                j++;
            }

            int len = Integer.parseInt(str.substring(i,j));

            j++;

            String s = str.substring(j,j+len);

            decodedStr.add(s);

            i = j+len;

        }

        return decodedStr;

    }
}
