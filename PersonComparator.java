import java.util.Comparator;

// Обобщенный класс для сравнения персон
class PersonComparator<T extends Person> implements Comparator<T> {
    @Override
    public int compare(T person1, T person2) {
        return person1.getName().compareTo(person2.getName());
    }
}