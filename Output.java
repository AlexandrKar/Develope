import java.util.Scanner;

public class Output {

    public void o() {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String number = in.nextLine();
        System.out.print("Вы ввели:" + number);
    }
}