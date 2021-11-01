public class MainClass {

    public static void main(String[] args) {
        String rawData = getData();
        int data = parseData(rawData);
        printData(data);
    }

    private static String getData() {
        return null;
    }

    private static int parseData(String data) {
        return Integer.parseInt(data);
    }

    private static void printData(int data) {
        System.out.println(data);
    }
}
