class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        backtrack(result, new LinkedList<>(), candidates, target, 0);
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] candidates, int sum, int start) {
        if(sum == 0) {
            result.add(new LinkedList<>(current));
            return;
        }
        else if(sum < 0) {
            return;
        }
        else {
            for(int i = start; i < candidates.length; i++) {
                current.add(candidates[i]);
                backtrack(result, current, candidates, sum - candidates[i], i);
                current.remove(current.size()-1);
            }
        }
    }
}