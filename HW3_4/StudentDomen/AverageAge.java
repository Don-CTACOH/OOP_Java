package OOP_Java.HW3_4.StudentDomen;

import java.util.List;
// создадим общий класс для вычесления среднего возраста персонала
public class AverageAge<T extends Person> {
    public double averAge(List<T> var) {
        double sum = 0;
        for (T age : var) {
            sum += age.getAge();
        }
        return sum / var.size();
    }
}
