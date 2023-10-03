package RA_BT4;
import java.util.Scanner;
public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng m:");
        int m = scanner.nextInt();
        System.out.print("Nhập số hàng n:");
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i <m; i++) {
            for(int j=0; j <n; j++) {
                System.out.print("Nhập giá trị thuộc tính "+i+","+j+":");
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = arr[0][0];
        for(int i=0; i <m; i++) {
            for(int j=0; j <n; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là : " + max);



    }
}
