package ycblog;

/**
 * Author: Dongping Wang
 * Date: 2021/1/28
 * Description:删除重复元素，并返回新数组长度
 */
public final class DeleteElement {

    public static void main(String[] args) {

    }

    private static int deleteElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
