import java.util.ArrayList;
import java.util.List;

// Класс-сервис для учителей
class TeacherService implements IPersonService<Teacher> {
    private List<Teacher> teachers = new ArrayList<>();

    @Override
    public void addPerson(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public List<Teacher> getPeople() {
        return teachers;
    }

    // Метод для вывода списка учителей, отсортированного компаратором
    public void printSortedTeachers(PersonComparator<Teacher> comparator) {
        teachers.sort(comparator);
        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName() + " - " + teacher.getAge());
        }
    }
}