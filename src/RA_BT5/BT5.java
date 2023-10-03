package RA_BT5;

public class BT5 {
    public static void main(String[] args) {
        int[] arr = {8,1,2,3,4,5,6,7,8};
        int min = arr[0];
        for(int i =1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là :" + min);
    }
}
