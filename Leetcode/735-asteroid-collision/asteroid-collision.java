class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> sc = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;
            while (!sc.isEmpty() && a < 0 && sc.peek() > 0) {
                if (Math.abs(a) > sc.peek()) {
                    sc.pop(); 
                } 
                else if (Math.abs(a) == sc.peek()) {
                    sc.pop();
                    destroyed = true;
                    break;
                } 
                else {
                    destroyed = true; 
                    break;
                }
            }
            if (!destroyed) {
                sc.push(a);
            }
        }








        int n = sc.size();
        int[] arr = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            arr[i] = sc.pop();
        }

        return arr;
    }
}
