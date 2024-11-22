import java.util.Scanner;

public class InsertionSort {
    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        //Duyet qua mang tu phan tu thu 2 den cuoi mang
        for (int i = 1; i < n; i++) {
            int key = arr[i]; //Phan tu hien tai
            int j = i - 1;
            //Di chuyen cac phan tu cua mang > key len mot vi tri
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            //Chen phan tu key vao dung vi tri
            arr[j + 1] = key;
            //Hien thi trang thai mang sau moi lan chen
            displayArray(arr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //Hien thi mang truoc khi sap xep
        System.out.println("Mang truoc khi sap xep: ");
        displayArray(arr);
        //Goi ham sap xep chen
        System.out.println("Cac buoc sap xep chen: ");
        insertionSort(arr);
        //Hien thi mang sau khi sap xep
        System.out.println("Mang sau khi sap xep: ");
        displayArray(arr);
    }
}
