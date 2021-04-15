import java.util.Scanner;

public class SUM1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        System.out.println(n*(n+1)/2);
    }
}
