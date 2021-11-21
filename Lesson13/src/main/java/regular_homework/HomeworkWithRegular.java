package regular_homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Егор on 21.11.2021.
 */
public class HomeworkWithRegular {
    public static void task_2(String str) {
        Pattern pattern = Pattern.compile("c+ab");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void task_3(String str) {
        Pattern pattern = Pattern.compile("Java\\s+\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void task_4(String str) {
        System.out.println(str.split("(\\s+)|([а-я]+)|([a-z]*\\d+)").length);
    }

    public static boolean task_5(String str) {
        if (str.matches("[a-z[15]]{4,20}")) {
            return true;
        }
        return false;
    }
}
