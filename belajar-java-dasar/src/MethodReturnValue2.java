public class MethodReturnValue2 {
    public static void main(String[] args) {

      int hasill = min(200, 155);
        System.out.println(hasill);

        int hasill2 = min(150, 125);
        System.out.println(hasill2);

        int hasill3 = sum(100, 50);
        System.out.println(hasill3);

        System.out.println(hitung(12,"+",15));

        System.out.println(menghitung(10,"+",10));
        System.out.println(menghitung(12,"-", 8));
        System.out.println(menghitung(12, "hiks", 11));

    }


    static int min(int nilai1, int nilai2){
        int hasil = nilai1 - nilai2;
        return hasil;
        }

    static int sum(int nilai3, int nilai4) {
        int hasil2 = nilai3 + nilai4;
        return hasil2;
    }


    static int hitung(int nilai1, String operasi, int nilai2){
        switch (operasi){
            case "+":
                return nilai1 + nilai2;
            case "-":
                return nilai1 - nilai2;
            default:
                return 0;
        }



    }
    static int menghitung(int hal1, String metoda, int hal2){
        switch (metoda){
            case "+":
                return hal1 + hal2;
            case "-":
                return hal1 - hal2;
            case "*":
                return hal1 * hal2;
            case "/":
                return hal1 / hal2;
            default:
                return 0;
        }
    }

}
