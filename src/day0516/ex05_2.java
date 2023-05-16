package day0516;

public class ex05_2 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0f;

        int[] score = {100, 88, 100, 100, 90};

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        average = sum / (float) score.length;

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);

        System.out.println("=======================");

        int[] score1 = {88, 99, 97, 96, 100, 100};
        int max = score1[0];
        int min = score1[0];

        for (int i = 1; i < score.length; i++) {
            if (score1[i] > max) {
                max = score1[i];
            } else if (score1[i] < min) {
                min = score1[i];
            }
        }

        System.out.println("최대값 : "+max);
        System.out.println("최소값 : "+min);
    }
}
