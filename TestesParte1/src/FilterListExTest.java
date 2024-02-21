import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class FilterListExTest {

    @Test
    public void testFilter() {
        var p1 = new Person("Michael", Gender.HOMEM);
        var p2 = new Person("Jane", Gender.MULHER);
        var p3 = new Person("John", Gender.HOMEM);
        var p4 = new Person("Peter", Gender.HOMEM);
        var p5 = new Person("Lucy", Gender.MULHER);

        var persons = List.of(p1, p2, p3, p4, p5);

        var result = persons.stream()
                .filter(person -> person.getSex() == Gender.MULHER)
                .collect(Collectors.toList());

        assertEquals(2, result.size());
        assertTrue(result.contains(p2));
        assertTrue(result.contains(p5));

        // Verificar se todos os elementos na lista resultante são do gênero MULHER
        assertTrue(result.stream().allMatch(person -> person.getSex() == Gender.MULHER));
    }
}