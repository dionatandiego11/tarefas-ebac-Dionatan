import java.util.List;
import java.util.stream.Collectors;

public class FilterListEx {

    public static void main(String[] args) {

        var p1 = new Person("Michael", Gender.MALE);
        var p2 = new Person("Jane", Gender.FEMALE);
        var p3 = new Person("John", Gender.MALE);
        var p4 = new Person("Peter", Gender.MALE);
        var p5 = new Person("Lucy", Gender.FEMALE);

        var persons = List.of(p1, p2, p3, p4, p5);

        var result = persons.stream()
            .filter(person -> person.getSex() == Gender.FEMALE)
            .collect(Collectors.toList());
            
        System.out.println(result);
    }
}