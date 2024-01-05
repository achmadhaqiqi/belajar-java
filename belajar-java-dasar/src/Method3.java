public class Method3 {
    public static void main(String[] args) {


        sayHello();

        sayHelloName("Cristiano ", "Ronaldo");
        sayHelloName("Achmad ", "Haqiqi");
        sayHelloName("Lionel ", "Messi");

    }





    static void sayHello (){
        System.out.println("Hello World");
    }


    static void sayHelloName (String firstName, String lastName){
        System.out.println("Hello "+ firstName + lastName);
    }
}
