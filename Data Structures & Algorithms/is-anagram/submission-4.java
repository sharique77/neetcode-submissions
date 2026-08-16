class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c  = s.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else
            hm.put(c,1);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(hm.containsKey(ch))
                hm.put(ch,hm.get(ch)-1);

            else
            hm.put(ch,1);                
        }

        for(Integer value: hm.values()){
            if(value > 0)
            return false;
        }

        return true;
    }
}
