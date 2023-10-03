package RA_BT6;
import java.util.Scanner;
public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng m:");
        int m = scanner.nextInt();
        System.out.println("Nhập số cột n:");
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("Nhập giá trị vị trí"+i+","+j+": ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhập số cột tính tổng :");
        int Sum =0;
        int cotTong = scanner.nextInt();
        if(cotTong > m && cotTong < 0) {
            System.out.println("Cột nhập vào không thỏa mãn ");

        } else {
            for(int k = 0; k < m; k++) {
                Sum += arr[k][cotTong-1];
            }
            System.out.println("Tổng cột thứ "+cotTong+" " +Sum);
        }



    }
}
