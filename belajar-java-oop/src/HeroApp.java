public class HeroApp {
    public static void main(String[] args) {
        var hero1 = new Hero("Change", "Midlane");
        hero1.name = "Lancelot";
        hero1.damage = "Physical";
        hero1.role = "Jungler";

        System.out.println(hero1.name);
        System.out.println(hero1.damage);
        System.out.println(hero1.role);

        hero1.sayHello("Lancelot");



    }
}
