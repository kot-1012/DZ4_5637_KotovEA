import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание сервиса для учителей
        TeacherService teacherService = new TeacherService();
        
        // Добавление учителей
        teacherService.addPerson(new Teacher("Иванов", 35));
        teacherService.addPerson(new Teacher("Петров", 40));
        teacherService.addPerson(new Teacher("Сидоров", 30));

        // Создание компаратора для сортировки учителей по имени
        PersonComparator<Teacher> teacherComparator = new PersonComparator<>();
        
        // Вывод отсортированного списка учителей
        System.out.println("Отсортированный список учителей:");
        teacherService.printSortedTeachers(teacherComparator);

        // Подсчет среднего возраста учителей
        List<Teacher> teachers = teacherService.getPeople();
        double averageAgeTeachers = AccountController.averageAge(teachers);
        System.out.println("Средний возраст учителей: " + averageAgeTeachers);
    }
}