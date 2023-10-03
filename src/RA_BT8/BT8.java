package RA_BT8;

import java.util.Scanner;

public class BT8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi ");
        String str = scanner.nextLine();
        int count = 0;
        System.out.println("Nhập ký tự kiểm tra");
        char ch = scanner.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(count);
    }

}
