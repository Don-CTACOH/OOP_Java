package OOP_Java.HW3_4.Controllers;

import OOP_Java.HW3_4.StudentDomen.Person;
// создадим интерфейс основного контроллера работы с персоналом
public interface iPersonController<T extends Person> {
    void create(String firstName, String secondName, int age);
}
