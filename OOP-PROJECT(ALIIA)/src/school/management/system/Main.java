package school.management.system;

import java.util.ArrayList;
import java.util.List;


public class Main {
        public static void main(String[] args) {
            Teacher aliia = new Teacher(1,"Aliia",500);
            Teacher zhamila = new Teacher(2,"Zhamila",700);
            Teacher meerim = new Teacher(3,"Meerim",600);

            List<Teacher> teacherList = new ArrayList<>();
            teacherList.add(aliia);
            teacherList.add(zhamila);
            teacherList.add(meerim);


            Student rapkat = new Student(1,"Rakat",4);
            Student kalzira = new Student(2,"Kalzira",12);
            Student ainazik = new Student(3,"Ainazik",5);
            List<Student> studentList = new ArrayList<>();

            studentList.add(rapkat);
            studentList.add(kalzira);
            studentList.add(ainazik);




        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);


        rapkat.payFees(5000);
        kalzira.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        aliia.receiveSalary(aliia.getSalary());
        System.out.println("GHS has spent for salary to " + aliia.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        meerim.receiveSalary(meerim.getSalary());
        System.out.println("GHS has spent for salary to " + meerim.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(kalzira);

        zhamila.receiveSalary(zhamila.getSalary());

        System.out.println(zhamila);


    }
}
