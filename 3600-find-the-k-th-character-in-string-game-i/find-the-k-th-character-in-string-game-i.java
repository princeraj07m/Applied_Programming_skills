class Solution {
    public char kthCharacter(int k) {
        StringBuilder s = new StringBuilder("a");

        while (s.length() < k) {
            StringBuilder curr = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                curr.append((char) ((ch - 'a' + 1) % 26 + 'a'));
            }
            s.append(curr);
        }
        return s.charAt(k - 1);
    }
}