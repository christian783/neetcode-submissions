class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramSublists = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] charSet = new int[26];
            for (char c : strs[i].toCharArray()) {
                charSet[c - 'a']++;
            }

            String key = Arrays.toString(charSet);
            anagramSublists.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(anagramSublists.values());
    }
}
