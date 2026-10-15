class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            Set<Integer> a=new HashSet<>();
            for(int j=i;j<nums.size();j++){
                a.add(nums.get(j));
            sum+=(a.size()*a.size());
            }
        }
        return sum;
    }
}