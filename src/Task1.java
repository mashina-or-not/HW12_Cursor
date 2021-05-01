import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your numerical mark - ");
        int numMark = scanner.nextInt();
        String mark = switch (numMark) {
            case 0, 1, 2, 3, 4 -> "Very bad";
            case 5 -> "Bad";
            case 6 -> "Acceptable";
            case 7, 8 -> "Good";
            case 9, 10 -> "Well";
            default -> ("Unexpected value: " + numMark);
        };
        System.out.println(mark);
    }
}