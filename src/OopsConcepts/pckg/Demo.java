package OopsConcepts.pckg;
//import  OopsConcepts.pckg.college.Student;
public class Demo {
    public static void main(String[] args) {
        OopsConcepts.pckg.college.Student s1 = new OopsConcepts.pckg.college.Student();
        s1.print();

        OopsConcepts.pckg.school.Student s2 = new OopsConcepts.pckg.school.Student();
        s2.print();
    }

}
