package HomeWork05;

import java.util.Random;

/*
На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску.
Пример вывода доски 8х8:
0х000000
0000х000
00х00000
*/
public class Task03 {
    public static void main(String[] args) {
        int[] queens = new int[8];
        findPosition(0, queens);
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (queens[row] == col) {
                    System.out.print("X ");
                } else {
                    System.out.print("o ");
                }
            }
            System.out.println();
        }
    }

    private static boolean findPosition(int row, int[] queens) {
        if (row == 8) {
            return true;
        }
        for (int col = 0; col < 8; col++) {
            boolean isSafe = true;
            for (int i = 0; i < row; i++) {
                if (queens[i] == col - row + i || queens[i] == col + row - i || queens[i] == col) {
                    isSafe = false;
                    break;
                }
            }
            if (isSafe && row != 0) {
                queens[row] = col;
                if (findPosition(row + 1, queens)) {
                    return true;
                }
            }
            if (row == 0) {
                Random random = new Random();
                queens[row] = random.nextInt(8);
                if (findPosition(row + 1, queens)) {
                    return true;
                }
            }
        }
        return false;
    }
}
