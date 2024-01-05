public class IfStatement {
    public static void main(String[] args) {

        var gol = 52;
        var assist = 26;

        var mvp = gol <=50;
        var bestplaymaker = assist <=35;

        var bestplayer = mvp && bestplaymaker;

        if (gol<=50 &&  assist <=35){
            System.out.println("GOAT");
        }
        else {
            System.out.println("Anda adalah Pemain Ecek-ecek");
        }







    }
}
