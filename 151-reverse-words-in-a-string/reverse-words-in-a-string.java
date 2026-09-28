class Solution {
    public String reverseWords(String s) {
       String[] a=s.trim().split("\\s+");
       for(int i=0;i<a.length/2;i++){
        String temp=a[i];
        a[i]=a[a.length-i-1];
        a[a.length-i-1]=temp;
       } 
       return String.join(" ",a);
    }
}