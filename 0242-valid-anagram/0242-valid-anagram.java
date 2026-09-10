class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            map.put(a, map.getOrDefault(a, 0) + 1);
            map.put(b, map.getOrDefault(b, 0) - 1);
        }
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            if (map.getOrDefault(ch, 0) != 0) {
                return false;
            }
        }
        return true;
    }
}