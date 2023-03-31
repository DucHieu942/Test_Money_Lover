package Test_02;

import java.util.Scanner;

public class Test_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ tự n cần tìm trong dãy Fibonacci: ");// Nhập số thứ tự N của số Fibonacci cần tìm
        int n = scanner.nextInt();
        int fibN = fibonacci(n); // Gọi hàm fibonacci để tính số Fibonacci thứ n
        System.out.println("Số Fibonacci thứ " + n + " là: " + fibN);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
