import java.util.Scanner;

public class AddElementInArray {
    public static int[] addElementInArray(int input, int index, int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (index == i) {
                int temp1 = arr[index];
                arr[index] = input;
                for (int j = index + 1; j < arr.length; j++) {
                    int temp2 = arr[j];
                    arr[j] = temp1;
                    temp1 = temp2;
                }
                break;
            }
        }
        return arr;
    }

    public static int[] reSize(int arr[], int size) {
        int arrNew[] = new int[arr.length + 1];
        System.arraycopy(arr, 0, arrNew, 0, arr.length < arrNew.length ? arr.length : arrNew.length);
        return arrNew;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int arrNew[] = reSize(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri can them: ");
        int input = sc.nextInt();
        System.out.print("Nhap vi tri them: ");
        int index = sc.nextInt();

        if (index >= 0 && index < arr.length) {
            arr = addElementInArray(input, index, arrNew);
            System.out.println("\nMang sau khi them: ");
            for (int i = 0; i < arrNew.length; i++) {
                System.out.print(arrNew[i] + " ");
            }
        } else {
            System.out.println("Khong them duoc phan tu vao trong mang");
        }
    }
}
