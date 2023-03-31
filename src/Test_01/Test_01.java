package Test_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test_01 {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua day A: ");
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " cua day A: ");
            A[i] = scanner.nextInt();
        }

        // Sap xep day A tu nho den lon
        Arrays.sort(A);

        // Loai bo cac so khong phai la so nguyen to
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (isPrime(A[i])) {
                result.add(A[i]);
            }
        }

        // In ket qua
        System.out.println("Day A sau khi sap xep va loai bo cac so khong phai la so nguyen to:");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
