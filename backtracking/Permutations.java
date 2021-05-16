class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sublist = new ArrayList<Integer>();
        helper(nums, result, sublist);
        return result;
    }
    private void helper(int[]nums, List<List<Integer>> result, List<Integer> sublist) {
        if (sublist.size() == nums.length) {
            result.add(sublist);
			return;
        }

        for (int num : nums) {
            if (!sublist.contains(num)) {
                List<Integer> copy = new ArrayList<>(sublist);
                copy.add(num);
                // pass the new copy of sublist for the next recursion
                helper(nums, result, copy);
            }
        }
    }
}
