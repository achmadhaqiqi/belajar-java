class Person {
    String name;
    String address;
    final String country = "Indonesia";

    void sayHello(String paramName){
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}
