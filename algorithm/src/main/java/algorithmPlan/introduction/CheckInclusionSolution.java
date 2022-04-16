package algorithmPlan.introduction;

import java.util.HashMap;
import java.util.Map;

/**
 * @author longyh
 * @Description:
 * @analysis:
 * @date 2022/4/6 23:43
 */
public class CheckInclusionSolution {
    public static boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int j = 0;
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (map.containsKey(c)) {
                for (; j < s2.length(); j++) {
                    char c1 = s2.charAt(j);
                    if (map.containsKey(c1)) {
                        Integer integer = map.get(c1);
                        if (integer - 1 == 0) {
                            map.remove(c1);
                        } else {
                            map.put(c1, integer - 1);
                        }
                    } else {
                        break;
                    }
                }
            }

            if (map.size() == 0) {
                return true;
            }

            if (j > i) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            } else {
                j++;
            }
        }

        return false;
    }
}
