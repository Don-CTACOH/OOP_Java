package OOP_Java.HW3_4.StudentServise;

import java.util.List;
// создадим интерфейс по работе с логикой персонала
public interface iPersonService<T> {
    List<T> getAll();
    void create(String firstName, String secondName, int age);
}
