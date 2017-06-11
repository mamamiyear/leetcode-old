package algorithms;

import java.util.HashMap;

/**
 * Created by MMMy on 2016/5/12.
 *
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that
 * adjacent houses have security system connected
 * and it will automatically contact the police
 * if two adjacent houses were broken into on the same night.
 *
 * Given a list of non-negative integers representing the amount of money of each house,
 * determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobber {
    HashMap<Integer, Integer> cache = new HashMap<>();
    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            if (!cache.containsKey(length)) cache.put(length, 0);
            return cache.get(length);
        }
        if (length == 1) {
            if (!cache.containsKey(length)) cache.put(length, nums[length - 1]);
            return cache.get(length);
        }
        if (length >= 2) {
            int index = length - 1;
            int[] beforeOne = new int[nums.length - 1];
            int[] beforeTwo = new int[nums.length - 2];
            System.arraycopy(nums, 0, beforeOne, 0, nums.length - 1);
            System.arraycopy(nums, 0, beforeTwo, 0, nums.length - 2);
            int maxBeforeOne = cache.containsKey(length - 1) ? cache.get(length - 1) : rob(beforeOne);
            int maxBeforeTow = cache.containsKey(length - 2) ? cache.get(length - 2) : rob(beforeTwo);
            int maxCurrent = Math.max(maxBeforeOne, maxBeforeTow + nums[index]);
            cache.put(length, maxCurrent);
            return maxCurrent;
        } else {
            return -1;
        }
    }

    public int otherRob(int[] nums) {
        int l = nums.length;
        if (l == 0){
            return 0;
        }

        int[] robbedMoney = new int[l];
        for (int i = 0; i < l; i ++){
            if (i == 0){
                robbedMoney[i] = nums[i];
            }
            else if (i == 1){
                robbedMoney[i] = Math.max(nums[i], nums[i-1]);
            }
            else{
                robbedMoney[i] = Math.max(robbedMoney[i - 2] + nums[i], robbedMoney[i-1]);
            }
        }

        return robbedMoney[l - 1];
    }


    public static void main(String[] args) {
        HouseRobber robber = new HouseRobber();
        int[] moneyOfHouses = {183, 219, 57, 193, 94, 233, 202, 154, 65, 240, 97, 234, 100, 249, 186, 66, 90, 238, 168, 128, 177, 235, 50, 81, 185, 165, 217, 207, 88, 80, 112, 78, 135, 62, 228, 247, 211};
        long a = System.nanoTime();
        System.out.println(robber.rob(moneyOfHouses));
        System.out.println(System.nanoTime() - a);
        long b = System.nanoTime();
        System.out.println(robber.otherRob(moneyOfHouses));
        System.out.println(System.nanoTime() - b);
    }
}
