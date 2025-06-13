package Java.Needcode;

import java.util.HashMap;

public class TwoSumProblem {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Сразу вычисляем недостающий элемент для суммы
            int complement = target - nums[i];

            // Если такой элемент уже есть в карте, возвращаем его индекс и текущий
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Добавляем текущее число и его индекс в карту
            map.put(nums[i], i);
        }

        // По условию задачи до сюда не дойдёт
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Индексы: " + result[0] + ", " + result[1]);
    }
}
