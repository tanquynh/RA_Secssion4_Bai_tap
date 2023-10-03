package RA_BT9;

public class BT9 {
    public static void main(String[] args) {
        int [] arr = {1,2,1,4,5,6,6,7,5};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        if (max2 != Integer.MIN_VALUE) {
            System.out.println("Số lớn thứ hai trong mảng là: " + max2);
        } else {
            System.out.println("Không có số lớn thứ hai trong mảng.");
        }
    }
}
