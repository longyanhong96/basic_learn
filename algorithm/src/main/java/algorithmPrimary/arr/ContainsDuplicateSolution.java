package algorithmPrimary.arr;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/13 9:47 上午
 */
public class ContainsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
    }
}
