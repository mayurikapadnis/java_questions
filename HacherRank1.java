import java.util.Scanner;

public class HacherRank1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        int marks[] = new int[n];
        String gender;
        int sum = 0;
        System.out.println("enter the marks: ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Enter Gender(b/g)");
        gender = sc.next();

        if (gender == "b") {
            for (int j = 0; j <= n; j = j + 2) {
                sum = sum + marks[j];
            }
        } else {
            for (int j = 1; j <= n; j = j + 2) {
                sum = sum + marks[j];
            }
        }

        System.out.println("sum= " + sum);

    }
}
