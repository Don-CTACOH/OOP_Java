package OOP_Java.HW5.Controller;

import OOP_Java.HW5.Model.Student1;

import java.util.List;
import java.util.Map;

// интерфейс отвечающий за действия соединения с базой данных(Model)
public interface iGetModel {
   // public List<Student1> getAllStudent();
   Map<Long,Student1> getAllHashMapStudent();

  String deleteStudentBuyID();


}
