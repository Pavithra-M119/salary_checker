import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] hours = new int[7];
        for (int i = 0; i < 7; i++) {
            hours[i] = scanner.nextInt();
        }
        int totalHours = 0;
        for (int i = 0; i < 7; i++) {
            totalHours += hours[i];
        }
        int overtimeHours = 0;
        for (int i = 0; i < 7; i++) {
            if (hours[i] > 8) {
                overtimeHours += hours[i] - 8;
            }
        }
        int overtimePay = overtimeHours * 15;
        int bonusHours = 0;
        for (int i = 0; i < 7; i++) {
            if (totalHours > 40) {
                bonusHours += hours[i];
            }
        }
        int bonusPay = bonusHours * 25;
        int saturdayBonus = hours[5] * 25 / 100;
        int sundayBonus = hours[6] * 50 / 100;
        int salary = 100 * totalHours + overtimePay + bonusPay + saturdayBonus + sundayBonus;
        System.out.println(salary);
    }
}
