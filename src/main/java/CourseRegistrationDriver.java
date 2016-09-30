import com.felix.ct417.Course;
import com.felix.ct417.Module;
import com.felix.ct417.Student;
import org.joda.time.LocalDate;

import java.util.ArrayList;

/**
 * Created by FelixDSantos on 29/09/2016.
 */
public class CourseRegistrationDriver {

    public static void main(String[] args){
        Course csit= new Course("Computer Science and Information Technology",new LocalDate("2016-09-05") ,new LocalDate("2020-05-10"));
        Module machineLearning = new Module("Machine Learning", "CT475");
        Module softwareEngineering = new Module("Software Engineering", "CT417");
        Module cryptography = new Module("Cryptography", "CS402");
        Module modInfoManagement= new Module("Module Information Management","CT422");

        ArrayList<Student> testStudents=new ArrayList();
        Student student1 = new Student("Jim","Bob",new LocalDate("1995-08-03"),13387876,csit);
        Student student2 = new Student("Jeremy","Evans",new LocalDate("1993-02-07"),13387877,csit);
        Student student3 = new Student("Stevie","Boy",new LocalDate("1995-08-29"),13387878,csit);
        Student student4 = new Student("Mary","McAleese",new LocalDate("1995-12-25"),13387879,csit);
        Student student5 = new Student("King","Ding",new LocalDate("1995-05-26"),13387880,csit);

        student1.addStudentModule(machineLearning);student1.addStudentModule(softwareEngineering);student1.addStudentModule(cryptography);
        student2.addStudentModule(machineLearning);student2.addStudentModule(softwareEngineering);student2.addStudentModule(modInfoManagement);
        student3.addStudentModule(machineLearning);student3.addStudentModule(cryptography);student3.addStudentModule(modInfoManagement);
        student4.addStudentModule(softwareEngineering);student4.addStudentModule(cryptography);student4.addStudentModule(modInfoManagement);
        student5.addStudentModule(softwareEngineering);student5.addStudentModule(cryptography);student5.addStudentModule(machineLearning);

        testStudents.add(student1);
        testStudents.add(student2);
        testStudents.add(student3);
        testStudents.add(student4);
        testStudents.add(student5);

        csit.addCourseModule(machineLearning);
        csit.addCourseModule(softwareEngineering);
        csit.addCourseModule(cryptography);
        csit.addCourseModule(modInfoManagement);

        for (Student testStudent : testStudents) {
            System.out.println("-------------------------------");
            System.out.println("-------------------------------");
            System.out.println("Name: " + testStudent.getFirstName() + " "+testStudent.getLastName());
            System.out.println("\nCourse: "+ testStudent.getCourse().getCourseName());
            ArrayList<Module> modules=testStudent.getStudentModules();
            System.out.println("Modules: ");
            for (Module module:modules) {
                System.out.println(module.getID()+" "+module.getModuleName() +"\n");
            }
        }

    }
}