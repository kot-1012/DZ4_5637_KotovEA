import java.util.List;

// Класс для управления учетными данными
public class AccountController {
    // Обобщенный метод для подсчета среднего возраста персон
    public static <T extends Person> double averageAge(List<T> people) {
        if (people.isEmpty()) return 0;

        int totalAge = 0;
        for (T person : people) {
            totalAge += person.getAge();
        }

        return (double) totalAge / people.size();
    }
}