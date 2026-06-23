class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        for (String s : strs) {
            int[] freqs = new int[26];
            for (char c : s.toCharArray()) {
                freqs[c - 'a']++;
            }
            String key = Arrays.toString(freqs);
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(s);
        }
        return new ArrayList<>(anagrams.values());
    }
}
