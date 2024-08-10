// https://leetcode.com/problems/combination-sum/description/
// Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

// The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
// frequency of at least one of the chosen numbers is different.
// The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
// __________________________________________________________________________________________________________________________________________________________:)
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        recur(candidates, target, 0, cur, res);
        return res;
    }

    public static void recur(int[] candidates, int target, int ind, ArrayList<Integer> cur, List<List<Integer>> res) {
        if (ind == candidates.length) {
            if (target == 0) {
                res.add(new ArrayList<>(cur)); 
            }
            return;
        }

        if (candidates[ind] <= target) {
            cur.add(candidates[ind]);
            recur(candidates, target - candidates[ind], ind, cur, res);
            cur.remove(cur.size() - 1);
        }
        recur(candidates, target, ind + 1, cur, res);
    }

    public static void main(String[] args) {
        int[] candidates = {2, 3};
        int target = 7;
        List<List<Integer>> res = combinationSum(candidates, target); // No need to instantiate

        // Print the result
        for (List<Integer> combination : res) {
            System.out.println(combination);
        }
    }
}
