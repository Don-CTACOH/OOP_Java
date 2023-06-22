package OOP_Java.HW5.View;

import OOP_Java.HW5.Controller.iGetView;
import OOP_Java.HW5.Model.Student1;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
// создать клась в англоязычной вьюшкой
public class ViewEng implements iGetView {
    public void printAllStudent(Map<Long,Student1> s){
        System.out.println("------List students------");
        for (Map.Entry<Long, Student1> longStudent1Entry : s.entrySet()) {
            System.out.println(longStudent1Entry);
        }
        System.out.println("------End list------");

    }

     @Override
    public String prompt(String massage) {
        Scanner in = new Scanner(System.in);
        System.out.println(massage);
        return in.nextLine();
    }
}
