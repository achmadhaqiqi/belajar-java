public class ForEach {
    public static void main(String[] args) {

        String [] names = {
                "Achmad", "Kurniawan", "Khannedy",
                "Proggrammer", "Zaman", "Now"
        };

        for (var i = 0; i <names.length;i++){
            System.out.println(names[i]);
        }

        for (var name : names){
            System.out.println(name);
        }
    }
}
