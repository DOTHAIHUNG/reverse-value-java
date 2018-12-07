import java.util.Scanner;

public class reverseValue {
    public static void main(String[] args) {
        int[] arrays = new int[20];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Nhap gia tri phan tu " + (i + 1));
            arrays[i] = sc.nextInt();
        }

        System.out.println("Cac phan tu trong mang la: ");
        for (int j : arrays) {
            System.out.print(j + "\t");
        }

        System.out.println("Mang sau khi dao nguoc la: ");
        for (int k = 0; k < arrays.length / 2; k++) {
            int n = arrays[k];
            arrays[k] = arrays[19 - k];
            arrays[19 - k] = n;
        }
        for (int l : arrays) {
            System.out.print(l + "\t");
        }
    }
}
