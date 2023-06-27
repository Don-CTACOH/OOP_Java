package OOP_Java.HW3_4.Controllers;

import OOP_Java.HW3_4.StudentDomen.Student;
import OOP_Java.HW3_4.StudentServise.StudentService;
// создадим контроллер выполнения логики работ студентов
public class StudentController implements iPersonController<Student>{
    private final StudentService dataService = new StudentService();
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName,secondName,age);
    }
}
