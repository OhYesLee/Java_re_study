package day0515;

import java.util.Scanner;

public class ex01 {
    public static void main(String args[]) {
        System.out.println("Hello world");
//        System.out.println(5%3);
//        System.out.println(5/3);

        Scanner scanner = new Scanner(System.in);

      /*  System.out.println("두자리 정수를 하나 입력해주세요. ==>> ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

        System.out.println("입력내용 : "+input);*/

        String str = "3";
        System.out.println(str.charAt(0)-'0');
        System.out.println(str.charAt(0));
        System.out.println('3'-'0'+1);
        System.out.println(Integer.parseInt("3")+1);
        System.out.println("3"+1);
        System.out.println((char) (3+'0'));
        System.out.println((3+'0')); // '0' 은 숫자로 48 이다.

    }
}
