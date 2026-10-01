public class Objpractice {
    public static void main(String[] args){
//        Students s1 = new Students("jay",37);
       Students s2 = new Students();
//        s1.studentDetails();

        System.out.println(s2.name);

    }

}

 class Students {
     String name;
     int rollno;

//   Students(){

     /// /       name="jay";
//       rollno=37;
//   }
//   void studentDetails(){
//       System.out.println("the name of the student is :"+name);
//       System.out.println("The roll no of student is : "+rollno);
//   }
//     ---------------------------------------------
//     Parameterised Constructor + Constructor overloading
//     -----------------------------------------------

     Students(String n,int rn)

     {
         name = n;
         rollno = rn;
     }
     void show(){
         System.out.println(name+rollno);
     }
    Students(){
    //    
    }
 }