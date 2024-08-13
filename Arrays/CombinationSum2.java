// https://leetcode.com/problems/combination-sum-ii/description/?envType=daily-question&envId=2024-08-13
// Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

// Each number in candidates may only be used once in the combination.

// Note: The solution set must not contain duplicate combinations.
// ________________________________________________________________________________________________________:)

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        ArrayList<Integer> cur= new ArrayList<Integer>();
        Arrays.sort(candidates);
        recur(candidates,target,0,cur,res);
        return res;
    }

    public void recur(int[]candidates, int target, int ind, ArrayList<Integer>cur,List<List<Integer>>res){
        if(target==0){
            res.add(new ArrayList<Integer>(cur));
            return;
        }

        for(int i=ind; i<candidates.length; i++){
            if((i==ind || candidates[i-1]!=candidates[i]) && candidates[i]<=target){
                cur.add(candidates[i]);
                recur(candidates, target-candidates[i], i+1, cur,res);
                cur.remove(cur.size()-1);
            }
        }
    }
}
