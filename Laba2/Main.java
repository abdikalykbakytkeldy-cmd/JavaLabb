public class Main {
    public static void main(String[] args) {
        Person person = new Student(); // полиморфизм

        person.name = "Асет";
        person.age = 20;
        ((Student) person).group = "ИС-2204";

        person.displayInfo();
    }
}
