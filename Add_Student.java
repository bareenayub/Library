package library;
import java.util.Scanner;
import java.util.List;
import java.util.*;


 class Student {
     private Integer studentId;
     private String studentName;
     private String className;


     public void setStudentId(int studentId) {
         this.studentId = studentId;
     }

     public void setStudentName(String studentName) {
         this.studentName = studentName;
     }

     public void setClassName(String className) {
         this.className = className;
     }

     public int getStudentId() {
         return studentId;
     }

     public String getStudentName() {
         return studentName;
     }

     public String getClassName() {
         return className;
     }

 }
public class Add_Student extends Student
{
    List<Student> list=new ArrayList<Student>();

    private void add_students()
    {


        Scanner c = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = c.next();
        System.out.println("Enter Your Age");
        int id = c.nextInt();
        System.out.println("Enter your Class Name");
        String classname = c.next();

        Student std = new Student();
        std.setStudentId(id);
        std.setStudentName(name);
        std.setClassName(classname);

        list.add(std); //adding

     //   System.out.println();
        //System.out.println("Student ID :" + std.getStudentId() +
               // "\t" + "Student Name: " + std.getStudentName() + "\t Student Class Name: " + std.getClassName());

    }

    public void std_details()
    {
        add_students();
    }

    public void view_all()
    {
//        Iterator itr=list.iterator();
//        //traversing elements of ArrayList object
//        while(itr.hasNext()){
//            Student st=(Student)itr.next();
//            System.out.println(st); //priniting
//        }
        System.out.println(list);
    }


    }

