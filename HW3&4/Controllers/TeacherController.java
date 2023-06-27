package OOP_Java.HW3&4.Controllers;

import OOP_Java.HW3&4.StudentDomen.Teacher;
import OOP_Java.HW3&4.SyudentServise.TeacherService;
// создадим контроллер выполнения логики работ учителей
public class TeacherController implements iPersonController<Teacher> {
    private final TeacherService techService = new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        techService.create(firstName,secondName,age);
    }
}
