package Test_03;

import java.util.*;

public class Test_03 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> listInput = new ArrayList<>();
            System.out.print("Nhập số phần tử của dãy A: ");
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập phần tử thứ " + (i+1) + " của dãy A: ");
                int num = scanner.nextInt();
                listInput.add(num);
            }
            System.out.print("Nhập số phần tử của các cặp số: ");
            int k = scanner.nextInt();
             ArrayList<Integer> combination = new ArrayList<Integer>();
            //remove_duplicates trả về một list các số không trùng lặp
            ArrayList<Integer> listAfter = remove_duplicates(listInput);
            //printCombinations thực in ra màn hình các bộ số thỏa mãn, và trả về số bộ số thỏa mãn
            int count = printCombinations (listAfter,combination,0,k);
            System.out.println("Có: " + count+" bộ số thỏa mãn");

    }


    public static int printCombinations(ArrayList<Integer> set, ArrayList<Integer> combination, int index, int k) {
        int count = 0;
        if (combination.size() == k) {
            System.out.println(combination);
            return 1;
        }
        if (index == set.size()) {
            return 0;
        }
        // Chọn phần tử tiếp theo từ tập hợp set để thêm vào combination
        combination.add(set.get(index));
        count += printCombinations(set, combination, index + 1, k);
        combination.remove(combination.size() - 1);
        // Không chọn phần tử tiếp theo từ tập hợp set để thêm vào combination
        count += printCombinations(set, combination, index + 1, k);
        return count;
    }


    public static ArrayList<Integer> remove_duplicates( ArrayList<Integer> list) {
        Set<Integer> idSet = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer number : list) {
            if (idSet.add(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
