package strings_homework;

/**
 * Created by Егор on 21.11.2021.
 */
public class HomeworkWithStrings {
    public static void middleOfString(String str) {
        String[] words = str.split(", ");
        for (String word : words) {
            int averageLength = word.length() / 2;
            if (word.length() % 2 == 0) {
                System.out.println(word.substring(averageLength - 1, averageLength + 1));
            } else {
                System.out.println("Строка c нечетным количеством символов.");
            }
        }
    }
}
