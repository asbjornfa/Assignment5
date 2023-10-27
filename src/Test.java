import java.util.ArrayList;
import java.util.List;

public class Test {
    public void start(){
        List<Person> persons = new ArrayList<>();


        PersonManager pm = new PersonManager();

        Teacher t = new Teacher(202,"Bent H. Pedersen", "bhp");
        t.setEmail("hni@easv.dk");
        t.addSubject("Programming");
        t.addSubject("ITO");

        pm.addPerson(t);

        Student student = new Student(105, "boIbsen", "CS");
        student.setEmail("bib@easv.dk");
        student.addGrade(new GradeInfo(7, "CS"));
        student.addGrade(new GradeInfo(10, "ITO"));

        pm.addPerson(student);

        System.out.println("All persons\n" + pm.getAllPersons());
        System.out.println("All teachers\n" + pm.getAllTeachers());
        System.out.println("All students\n" + pm.getAllStudents());

    }
}
