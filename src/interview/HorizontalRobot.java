package interview;

/**
 * Author: Dongping Wang
 * Date: 2021/1/25
 * Description:地平线机器人-智能座舱 三面
 */
public class HorizontalRobot {

    public static void main(String[] args) {
        byte[][] data = {
                {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 1, 2}
        };
        twoDimenArrReverse2(data);
        for (int i = 0; i < data.length; i++) { // 0
            for (int j = 0; j < data[i].length; j++) { // 0 1 2 3
                System.out.println("" + data[i][j]);
            }
        }
    }

    // 面试1: 整数反转
    private static long reverse(long num) {
        long reverseNum = 0;
        long pop;
        while (num != 0) {
            pop = num % 10;
            if (reverseNum > Long.MAX_VALUE / 10 || (reverseNum == Long.MAX_VALUE / 10 && pop > Long.MAX_VALUE % 10)) {
                return 0;
            }
            if (reverseNum < Long.MIN_VALUE / 10 || (reverseNum == Long.MIN_VALUE / 10 && pop < Long.MIN_VALUE % 10)) {
                return 0;
            }
            reverseNum = reverseNum * 10 + pop;
            num /= 10;
        }
        return reverseNum;
    }

    // 数组反转

    // 面试2.1：二维数组反转1
    // 1234   4321
    // 5678   8765
    // 9012   2109
    private static void twoDimenArrReverse1(byte[][] data) {
        for (int i = 0; i < data.length; i++) {
            int itemArrLen = data[i].length;
            for (int j = 0; j < itemArrLen / 2; j++) {
                byte temp = data[i][j];
                data[i][j] = data[i][itemArrLen - 1 - i];
                data[i][itemArrLen - 1 - i] = temp;
            }
        }
    }

    // 面试2.2：二维数组反转2
    // 1234   2109
    // 5678   8765
    // 9012   4321
    private static void twoDimenArrReverse2(byte[][] data) {
        int len = data.length;
        for (int i = 0; i <= len / 2; i++) {
            int itemLen = data[i].length;
            int count = itemLen;
            if (len % 2 == 1 && i == len / 2) {
                count /= 2;
            }
            for (int j = 0; j < count; j++) {
                byte temp = data[i][j];
                data[i][j] = data[len - 1 - i][itemLen - 1 - j];
                data[len - 1 - i][itemLen - 1 - j] = temp;
            }
        }
    }

}
