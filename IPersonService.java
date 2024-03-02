import java.util.List;

// Обобщенный интерфейс для сервиса персон
interface IPersonService<T> {
    void addPerson(T person);
    List<T> getPeople();
}