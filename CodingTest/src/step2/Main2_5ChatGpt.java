package step2;

import java.util.Scanner;

public class Main2_5ChatGpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        int totalMinutes = H * 60 + M;
        int adjustedMinutes = (totalMinutes - 45 + 1440) % 1440; // 음수 방지 및 24시간 주기

        int adjustedHours = adjustedMinutes / 60;
        int adjustedMins = adjustedMinutes % 60;

        System.out.println(adjustedHours + " " + adjustedMins);
    }
}