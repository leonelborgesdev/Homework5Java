import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Juan", "25", "programar"),
                new Person("María", "19", "leer"),
                new Person("Pedro", "30", "bailar"),
                new Person("Luisa", "22", "programar"),
                new Person("Ana", "17", "dibujar"),
                new Person("Carlos", "29", "programar")
        );
        List<Person> filterPerson=persons.stream()
                .filter(person -> Integer.parseInt(person.getAge())>18)
                .filter(person -> person.getHobby().contains("programar"))
                .toList();

        List<String> names = persons.stream()
                .map(Person::getName)
                .toList();

        List<Person> limitedPersons = persons.stream()
                .limit(5)
                .toList();

        persons.forEach(person -> System.out.println(person.getName()));
    }
}