package RA_BT7;

import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng m:");
        int m = scanner.nextInt();
        System.out.println("Nhập số hàng n:");
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập giá trị vị trí" + i + "," + j + ": ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int Sum = 0;
        for (int j = 0, i = 0; j < n; j++) {
            Sum += arr[i][j];
            i++;
        }
        System.out.println("Sum: " + Sum);
    }
}
