/**
 * 希尔排序是把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；
 * 随着增量逐渐减少，每组包含的关键词越来越多，当增量减至1时，整个文件恰被分成一组，算法便终止
 *
 * 基本步骤：
 * 1.选择一个增量序列 t1，t2，……，tk，其中 ti > tj, tk = 1；
 *
 * 2.按增量序列个数 k，对序列进行 k 趟排序；
 *
 * 3.每趟排序，根据对应的增量 ti，将待排序列分割成若干长度为 m 的子序列，分别对各子表进行直接插入排序。
 * 仅增量因子为 1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = {3, 6, 3, 1, 9, 0, 4, 5, 8, 7};
        shellSort(arr);
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
    private static void shellSort(int[] arr) {
        int len = arr.length;
        int gap;
        for (gap = len / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < len; i++) {
                int j = i;
                int temp = arr[i];
                if (temp < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = temp;
                }
            }
        }
    }
}
