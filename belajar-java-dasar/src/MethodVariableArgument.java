public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values = {80,80,80,80,80};
        sayCongrats("Eko", values);

    }
static void sayCongrats(String name, int...values) {
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >=75) {
            System.out.println("Selamat "+ name + ", Anda Lulus");
        } else {
            System.out.println("Maaf "+ name + ", Anda Belum Lulus");
        }
}
}
