package hung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test1 {
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
        List<Integer> ouput = new ArrayList<Integer>();
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        int count = 0;
        for (int i = 0; i <= n-1; i++) {
            System.out.print("Vui lòng a["+ i +"]: ");
            a[i] = sc.nextInt();
            System.out.print("Vui lòng b["+ i +"]: ");
            b[i] = sc.nextInt();
            System.out.print("Vui lòng c["+ i +"]: ");
            c[i] = sc.nextInt();
        }
        System.out.println("Đầu vào: ");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println("Đầu Ra: ");
        for (int i = 0; i <= n-1; i++) {
            ouput.add(a[i]);
            ouput.add(b[i]);
            ouput.add(c[i]);
        }
        System.out.println(ouput);
    }
}
