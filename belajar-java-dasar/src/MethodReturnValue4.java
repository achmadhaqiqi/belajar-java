public class MethodReturnValue4 {
    public static void main(String[] args) {

        System.out.println(hitung(1000, "/", 10));

    }





    static int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "*":
                return value1 * value2;
            case "/":
                return value1 / value2;
            default:
                return 0;
        }
    }
}
