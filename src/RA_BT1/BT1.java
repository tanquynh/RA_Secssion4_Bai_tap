package RA_BT1;
import java.util.Scanner;
import java.util.Arrays;
public class BT1 {

    public static void main(String[] args) {
        int[] array = {1,2,3,3,4,3,7};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị muốn xóa");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        int[] newArray = new int[array.length-count];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != number) {
                newArray[j] = array[i];
                j++;
            }
        }
        array = newArray;
        System.out.println(Arrays.toString(array));

    }
}
