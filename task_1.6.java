/*
Пользователь вводит число, необходимо увеличить это число на 15% и вывести результат на экран
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ваш код

        Scanner scan = new Scanner(System.in);
        System.out.println("дай число => ");
        double a = scan.nextInt();
        System.out.println( a + " + 15% от " + a + " = " + a * 1.15 );
        
    }
}
