import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        String rawData = getData();
        int data = parseData(rawData);
        printData(data);
    }

    private static String getData() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    private static int parseData(String data) {
        return Integer.parseInt(data);
    }

    private static void printData(int data) {
        System.out.println(data);
    }
}
