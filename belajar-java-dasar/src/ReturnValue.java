public class ReturnValue {
    public static void main(String[] args) {

        System.out.println(perhitungan(100, "dibagi",50, 25, 5,1 ));
    }

    static int perhitungan(int value1, String perhitungan, int value2, int value3, int value4, int value5){
        switch (perhitungan){
            case ("dibagi") :
                return value1 / value2;
            case ("dikali"):
                return value1 * value2;
            default:
                return 0;
        }
    }
}
