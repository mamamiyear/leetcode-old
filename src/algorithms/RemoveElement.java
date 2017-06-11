package algorithms;

/**
 * @author mamamiyear
 *         on 2015/12/30
 *
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int index = nums.length;
        int i = 0;
        while (i <= index - 1) {

            if (nums[i] == val) {
                while (i <= index - 1) {
                    index--;
                    if (nums[index] != val) {
                        int temp = nums[index];
                        nums[index] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                }
            }

            i++;
        }
        System.out.println(index);
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int val = 1;
        System.out.println("原数组的长度为：" + nums.length);
        System.out.println("删除的数是：" + val);
        System.out.println("删除后的数组长度为：" + new RemoveElement().removeElement(nums, val));
        System.out.println("删除后的数组为：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
        System.out.println();
    }
}
