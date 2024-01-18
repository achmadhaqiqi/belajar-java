public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("Ahmad", "Ciamis");
        person1.name = "Ahmad";
        person1.address = "Ciamis";
        Person person2 = new Person("Sabil", "Surabaya");


        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Dani");

        Person person3;
        person3 = new Person("Dani", "Ciamis");
        person3.name = "Joko";
        person3.sayHello("Budi");
    }
}
