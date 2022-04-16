package arralgorithm;

/**
 * @author longyh
 * @Description: 类似移动数据那种【单指针】
 * @analysis:
 * @date 2022/4/15 4:29 下午
 */
public class SortColorsSolution {
    public static void sortColors(int[] nums) {
        int zero = 0;
        int two = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (i > two) {
                break;
            }

            if (nums[i] == 0) {
                int tmp = nums[zero];
                nums[zero] = nums[i];
                nums[i] = tmp;

                zero++;
            }

            if (nums[i] == 2) {
                int tmp = nums[two];
                nums[two] = nums[i];
                nums[i] = tmp;

                two--;
            }
        }
    }
}

/*
int slow = 0;
for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 0) {
        int tmp = nums[slow];
        nums[slow] = nums[i];
        nums[i] = tmp;

        slow++;
    }
}

for (int i = slow; i < nums.length; i++) {
    if (nums[i] == 1) {
        int tmp = nums[slow];
        nums[slow] = nums[i];
        nums[i] = tmp;

        slow++;
    }
}
 */