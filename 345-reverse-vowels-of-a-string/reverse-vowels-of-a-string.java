class Solution {
    public String reverseVowels(String s) {
        StringBuilder a = new StringBuilder(s);
        int left = 0;
        int right = a.length() - 1;
        while (left < right) {
            while (left < right && !isVowel(a.charAt(left))) {
                left++;
            }
            while (left < right && !isVowel(a.charAt(right))) {
                right--;
            }
            char temp = a.charAt(left);
            a.setCharAt(left, a.charAt(right));
            a.setCharAt(right, temp);
            left++;
            right--;
        }
        return a.toString();
    }
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||c == 'A'|| c=='E' || c == 'I' || c == 'O' || c == 'U';
    }
}