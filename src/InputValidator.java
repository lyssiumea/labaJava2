public class InputValidator {   // класс проверок

    public static String validateString(String input) { // строка не содержит цифр
        if (input.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Введенная строка не должна содержать цифры.");
        }
        return capitalizeEachWord(input.trim());
    }

    private static String capitalizeEachWord(String input) {    // строка всегда выводится с заглавной буквы
        String[] words = input.split("(?<=\\s)|(?<=-)|(?=\\s)|(?=-)"); // разделение по пробелам и дефисам
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty() && word.matches("[\\p{L}]+")) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase());
            } else {
                result.append(word); // сохраняем пробелы или дефисы
            }
        }
        return result.toString().trim();
    }



}
