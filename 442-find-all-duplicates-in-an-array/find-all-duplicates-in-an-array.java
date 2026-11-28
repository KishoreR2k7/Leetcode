class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                list.add(num);
            }
            set.add(num);
        }
        return list;
    }
}