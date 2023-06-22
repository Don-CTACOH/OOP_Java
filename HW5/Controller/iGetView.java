package OOP_Java.HW5.Controller;

import OOP_Java.HW5.Model.Student1;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

// интерфейс отвечающий за действия соединения с вьющкой(View)
public interface iGetView {
    void printAllStudent(Map<Long,Student1> student1s);

    String prompt(String massage);
}
