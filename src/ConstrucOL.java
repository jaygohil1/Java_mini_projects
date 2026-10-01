public class ConstrucOL {
    public static void main(String[] args) {
        Student s1 = new Student("JAy");

//        Student s2 = new Student("Jay",20);
//        Student s3 = new Student("Jay",20,37,"thakur");

        s1.display();
//        s2.display();
//        s3.display();

    }
}
class Student{
    String name;
    int age;
    int rollno;
    String college;

    //default constructor
    Student(){
//        this.name="Unknown";
//        this.age=0;
//        this.rollno=0;
//        this.college="Unknown";

        this("Unknown");
    }
//    =====================================================
    //Chaining of constructors

    Student(String name){
        this(name,0);
        System.out.println("1st constructor");
    }

    Student(String name,int age){
        this(name,age,0);
        System.out.println("2nd constructor.");
    }

    Student(String name,int age , int rollno){
        this(name,age,rollno,"Unknown");
        System.out.println("3rd constructor");
    }

    Student(String name,int age, int rollno,String college){
        this.name=name;
        this.age = age;
        this.rollno=rollno;
        this.college = college;
        System.out.println("4th construtor");
    }


    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Rollno:"+rollno);
        System.out.println("College:"+college);
        System.out.println("\n");


    }

}
