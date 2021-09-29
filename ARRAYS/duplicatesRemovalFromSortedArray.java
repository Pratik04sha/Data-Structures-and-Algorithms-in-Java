import java.util.Arrays;

public class duplicatesRemovalFromSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 3, 3};
        removeDuplicates(a, a.length);
        System.out.println(Arrays.toString(a));
    }

    public static int removeDuplicates(int[] nums, int n) {
        if (n == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
