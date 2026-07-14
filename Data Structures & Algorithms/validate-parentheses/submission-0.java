class Solution {
    public boolean isValid(String s) {
        Deque<Character> paren = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                paren.push(')');
            } else if (c == '{') {
                paren.push('}');
            } else if (c == '[') {
                paren.push(']');
            } else if (paren.isEmpty() || paren.pop() != c) {
                return false;
            }
        }
        return paren.isEmpty();
    }
}
