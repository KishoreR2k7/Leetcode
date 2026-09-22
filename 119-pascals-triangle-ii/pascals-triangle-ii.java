class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> mat = new ArrayList<>();
        for (int i = 0; i < rowIndex+1; i++) {
            List<Integer> result = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    result.add(1);
                } else {
                    result.add(
                        mat.get(i - 1).get(j - 1) +
                        mat.get(i - 1).get(j)
                    );
                }
            }
            mat.add(result);
        }
        return mat.get(rowIndex);
    }
}