/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double min = Math.pow(2, 30);
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
                    if (a < min - 1 && a > -min) {
                        arr.add(a);
                        break;
                    }
                } catch (Exception e) {
                    System.err.printf("Vui lòng nhập số nguyên lớn hơn %f nhỏ hơn %f", -min, min - 1);
                    System.out.println("");

                }
            }
        }
        arr.sort((o1, o2) -> o2 - o1);
        System.out.println("Mảng vừa nhập là: ");
        System.out.println(arr.toString());
        System.out.printf("Tổng hai số lớn nhất là: %d", arr.get(0) + arr.get(1));
    }
}
