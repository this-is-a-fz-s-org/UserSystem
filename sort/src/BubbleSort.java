/**
 * 排序算法：重复地走访要排序的数列，一次比较两个元素，如果它们的顺序错误就把它们交换过来。
 * 走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3, 6, 3, 1, 9, 0, 6, 5, 8, 7};
        bubbleSort(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    private static void bubbleSort(int[] arr) {
        int len = arr.length;
        if (len <= 1) {
            return;
        }
        for (int i = 0; i < len; i++) {
            boolean flag = true;
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }
}
