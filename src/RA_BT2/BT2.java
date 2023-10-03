package RA_BT2;
import java.util.Arrays;
import java.util.Scanner;
public class BT2 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vị trí cần thêm");
        int index = scanner.nextInt();
        System.out.print("Nhập giá trị cần thêm");
        int number = scanner.nextInt();
        int[] newArray = new int[array.length+1];
        newArray[index] = number;
        for (int i = 0, j =0; i < newArray.length; i++) {
            if(i != index ) {
                newArray[i] = array[j];
                j++;
            }
        }
        array = newArray;
        System.out.println(Arrays.toString(array));
    }

}
