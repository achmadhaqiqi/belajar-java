class Hero {

    String name;
    String role;
    String damage;


    Hero(String paramName, String paramRole){
        name = paramName;
        role = paramRole;
    }

    void sayHello(String paramName){
        System.out.println("Selamat Pagi " + name + " kamu adalah hero " + damage + " kamu berada di role " + role );
    }

}
