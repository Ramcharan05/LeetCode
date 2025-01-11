class Solution {
    public boolean canConstruct(String s, int k) {
        int x = 0;
        Map<Character, Integer> mp = new HashMap<>();
        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        for (int i : mp.values()) {
            if (i % 2 == 1) {
                x++;
            }
        }

        return x <= k && k <= s.length();
    }
}