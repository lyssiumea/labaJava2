import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // Задание № 1. Имена
//        System.out.println("Введите имя:");
//        String firstName = getValidInput(scanner);
//        System.out.println("Введите фамилию (или оставьте пустым):");
//        String lastName = getValidInput(scanner);
//        System.out.println("Введите отчество (или оставьте пустым):");
//        String middleName = getValidInput(scanner);
//        Name name = new Name(
//                lastName.isEmpty() ? null : lastName,
//                firstName,
//                middleName.isEmpty() ? null : middleName
//        );
//        System.out.println("\nСозданное имя:");
//        System.out.println(name);

        String firstName1 = InputValidator.validateString("Клеопатра");

        String lastName2 = InputValidator.validateString("Пушкин");
        String firstName2 = InputValidator.validateString("Александр");
        String middleName2 = InputValidator.validateString("Сергеевич");

        String lastName3 = InputValidator.validateString("Маяковский");
        String firstName3 = InputValidator.validateString("Владимир");

        Name name1 = new Name(firstName1);
        Name name2 = new Name(lastName2, firstName2, middleName2);
        Name name3 = new Name(lastName3, firstName3);

        System.out.println("\nРаннее созданные имена:");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);


        // Задание № 1. Дом

    }

    private static String getValidInput(Scanner scanner) { // метод сборки для понятных проверок
        String input;
        while (true) {
            input = scanner.nextLine();
            try {
                return InputValidator.validateString(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage() + " Попробуйте еще раз.");
            }
        }
    }
}