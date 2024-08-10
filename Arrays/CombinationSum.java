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