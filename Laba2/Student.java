public class Main {
    public static void main(String[] args) {
        Person person = new Student(); // полиморфизм

        person.name = "Баха";
        person.age = 20;
        ((Student) person).group = "Банкай";

        person.displayInfo();
    }
}
