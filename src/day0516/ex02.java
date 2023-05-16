package day0516;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력하세요. =>");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 0) {
            System.out.println("입력하신 숫자는 : 0 입니다.");
        } else {
            //input != 0 인 경우
            System.out.println("입력하신 숫자는 0이 아닙니다. "+input+"입니다.");
        }
    }
}
