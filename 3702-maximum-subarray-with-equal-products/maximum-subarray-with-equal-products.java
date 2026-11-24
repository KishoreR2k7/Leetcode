class Solution {
    public static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
    public static boolean isequ(int[] arr, int left, int right) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long product = 1;
        for (int i = left; i <= right; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            product *= arr[i];
            if (product > 25200) return false;
        }
        int a = arr[left];
        int b = arr[left];
        for (int key : map.keySet()) {
            a = gcd(a, key);
            b = (b / gcd(b, key)) * key;
        }
        if (product == ((long) a * b)) {
            return true;
        }
        return false;
    }
    public int maxLength(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (isequ(nums, i, j)) {
                    length = Math.max(length, (j - i + 1));
                }
            }
        }
        return length;
    }
}