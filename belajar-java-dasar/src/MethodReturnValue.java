public class MethodReturnValue {
    public static void main(String[] args) {

        int hasil1 = sum(100, 100);
        System.out.println(hasil1);

        int hasil2 = sum(213, 123);
        System.out.println(hasil2);

    }

    static int sum(int nilai1, int nilai2){
        int total = nilai1 + nilai2;
        return total;

    }
}

