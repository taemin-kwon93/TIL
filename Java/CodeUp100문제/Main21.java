package codeUpExample;

/*1개의 단어를 입력받아 그대로 출력해보자.*/

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a);
        sc.close();
    }
}
