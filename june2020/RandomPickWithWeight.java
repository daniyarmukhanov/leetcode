package june2020;

public class RandomPickWithWeight {
    int[] array;

    public RandomPickWithWeight(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        array = arr;
    }

    public int pickIndex() {
        int random = (int) (Math.random() * array[array.length - 1]) + 1;
        int left = 0, right = array.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == random)
                return mid;
            else if (array[mid] < random)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}
