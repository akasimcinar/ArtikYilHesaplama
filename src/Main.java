import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yıl giriniz : ");
        int year = input.nextInt();

        if ((year % 4 == 0) && (year % 400 == 0)) {
            System.out.println(year + "Artık Yıldır.");
        } else {
            System.out.println(year + "Artık Yıl değildir.");

        }
    }
}