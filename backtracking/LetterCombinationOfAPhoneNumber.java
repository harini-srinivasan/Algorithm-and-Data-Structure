class Solution {
    char[][] phone = {
        {}, 
        {},
        {'a', 'b', 'c'},
        {'d', 'e', 'f'},
        {'g', 'h', 'i'},
        {'j', 'k', 'l'},
        {'m', 'n', 'o'},
        {'p', 'q', 'r', 's'},
        {'t', 'u', 'v'},
        {'w', 'x', 'y', 'z'}
    };
    List<String> solution = new LinkedList<>();
    
    private void backtrack(StringBuilder candidate, String digits) {
        if (digits.equals("")) {
            solution.add(candidate.toString());
            return;
        }
        
        for (char letter : phone[Character.getNumericValue(digits.charAt(0))]) {
            candidate.append(letter);
            backtrack(candidate, digits.substring(1));
            candidate.deleteCharAt(candidate.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if (digits.equals(""))
            return solution;
        
        backtrack(new StringBuilder(), digits);
        return solution;
    }
}
