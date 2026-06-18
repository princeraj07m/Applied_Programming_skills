class Solution {
    public int findTheWinner(int n, int k) {
         List<Integer> circle = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }

        int idx = 0;

        while (circle.size() > 1) {
            idx = (idx + k - 1) % circle.size();
            circle.remove(idx);
        }

        return circle.get(0);
    }
}