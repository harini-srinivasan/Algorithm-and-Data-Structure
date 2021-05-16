class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(n,n,"",result);
        return result;
    }
    private static void helper (int open, int close, String output, List<String> res) {
        if (open == 0 && close == 0) {
            res.add(output);
        }
        if (open != 0) {
            String updateOutput = output + "(";
            helper(open - 1, close, updateOutput, res);
        }
        if (close > open) {
            String updateOutput = output + ")";
            helper(open, close - 1, updateOutput, res);
        }
    }
}
