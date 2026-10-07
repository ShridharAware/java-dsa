import java.util.Arrays;

public class Q50MergeSortUsingRecursion1 {
    static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {

            if (left[i] <= right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }

            k++;
        }

        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }

    static int[] mergeSort(int[] arr, int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex == 1) {
            return new int[]{arr[leftIndex]};
        }

        int mid = (leftIndex + rightIndex) / 2;
        int[] left = mergeSort(arr, leftIndex, mid);
        int[] right = mergeSort(arr, mid, rightIndex);
        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 11, 2};
        int[] result = mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(result));
    }
}