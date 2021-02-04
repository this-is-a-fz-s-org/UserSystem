/**
 * 选择排序
 * 选择排序无论什么数据进去都是 O(n²) 的时间复杂度。
 *
 * 算法步骤:
 * 1.首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置。
 *
 * 2.再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 *
 * 3.重复第二步，直到所有元素均排序完毕。
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {3, 6, 3, 1, 9, 0, 6, 5, 8, 7};
        selectionSort(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
    }
}
