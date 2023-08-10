import java.util.*;

public class wordCount {
    public static void main(String args[]) {
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        String[] arrOfStr = str.split(" ", 0);
        int count = 0;
        for (int i = 0; i < arrOfStr.length - 2; i++) {
            boolean match = true;
            for (int j = i + 1; j < arrOfStr.length - 1; j++) {
                if (arrOfStr[i].equals(arrOfStr[j])) {
                    match = false;
                }
            }
            if (match) {
                count++;
            }
        }

        System.out.println(count + 1);

    }
}