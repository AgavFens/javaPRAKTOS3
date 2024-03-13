import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите строку:");
            String stroka = scanner.nextLine();
            stroka = stroka.replaceAll("\\s+", "").toLowerCase();
            String obratnayaStroka = "";

            for (int i = stroka.length() - 1; i >= 0; i--) {
                obratnayaStroka += (stroka.charAt(i));
            }

            if (stroka.equals(obratnayaStroka)) {
                System.out.println("Введенная строка является палиндромом.");
            } else {
                System.out.println("Введенная строка не является палиндромом.");
                break;
            }
        }
    }
}
