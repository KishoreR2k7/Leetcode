class Solution {
    public String reverseVowels(String s) {
        char[] a=s.toCharArray();
        int left=0,right=s.length()-1;
        while (left < right) {
            while (left < right && !isVowel(a[left])) {
                left++;
            }
            while (left < right && !isVowel(a[right])) {
                right--;
            }
            char temp = a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
        return String.valueOf(a);
    }
    public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A'|| c =='E' || c == 'I' || c == 'O' || c == 'U';
    }
}