import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so do ba canh cua tam giac:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (isTriangle(a, b, c)) {
            String triangleType = classifyTriangle(a, b, c);
            System.out.println("Loai tam giac: " + triangleType);
        } else {
            System.out.println("Khong phai tam giac.");
        }
    }

    public static boolean isTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static String classifyTriangle(int a, int b, int c) {
        if (a == b && b == c) {
            return "tam giac deu";
        } else if (a == b || b == c || a == c) {
            return "tam giac can";
        } else {
            return "tam giac thuong";
        }
    }
}
