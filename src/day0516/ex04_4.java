package day0516;

import java.util.Scanner;

public class ex04_4 {
    public static void main(String[] args) {
        int score = 0; // 점수를 저장하는 변수
        char grade = ' '; // 학점을 저장하기 위한 변수 공백으로 초기화 한다.

        System.out.println("점수를 입력하세요. =>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("당신의 학점은 "+ grade + "입니다.");
    }
}

