/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Vui lòng nhập số phần tử mảng: ");
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n < 0) {
                    System.err.println("Số phần tử phải lớn hơn 0");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Vui lòng nhập số nguyên");
            }
        }
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.printf("Vui lòng nhập phần tử thứ %d: ", i);
                try {
                    int a = Integer.parseInt(sc.nextLine());
                    if (a < 1000) {
                        arr.add(a);
                        break;
                    } else {
                        System.err.println("Vui lòng nhập số nhỏ hơn 1000");
                    }

                } catch (Exception e) {
                    System.err.println("Vui lòng nhập số nguyên ");
                }
            }
        }
        arr.sort((o1, o2) -> o1 - o2);
        System.out.println("Input " + arr);
        List<Integer[]> arout = new ArrayList<Integer[]>();
        for (int i = 0; i < arr.size(); i++) {
            if (i < arr.size() - 1) {
                if (arr.get(i + 1) - arr.get(i) == 1) {
                    Integer outarr[] = new Integer[2];
                    outarr[0] = arr.get(i);
                    outarr[1] = arr.get(i + 1);
                    arout.add(outarr);
                }
            }

        }
        System.out.print("Output: [");
        for (int i = 0; i < arout.size(); i++) {
            System.out.print(Arrays.toString(arout.get(i)));
        }
        System.out.println("]");
    }
}
