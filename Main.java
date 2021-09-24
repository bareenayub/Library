package library;
import java.util.*;

public class Main {
    static Boolean running =true;
    static Scanner in =new Scanner(System.in);
    public  static  void main(String[] args)
    {
         while(running)
        {
            System.out.println("\n Enter 0 for a librarian " +
                    "\n Enter 1 for Book Details"+
                   "\n Enter 2 for Student Details" +
                   "\n Enter 3 for Exit"
                    );
            int answer= in.nextInt();
            switch(answer)
            {
                case 0:
                    System.out.println("Are you a librarian ? press Y / N");
                    char ans= in.next().charAt(0);

                    switch(ans)
                    {
                        case 'y' :
                            System.out.println("press a for Add Books " +  "\n press i for Library Info" +
                                               "\n press e for Exit");
                            char val= in.next().charAt(0);
                            switch(val){
                                case 'a' :
                                    //Addbooks();
                                    break;
                                case 'i' :
                                    //Librarian_details();
                                    break;
                                case 'n' :
                                    System.exit(0);
                                    break;
                           }
                            break;

                        case 'n':
                            System.exit(0);
                            break;
                        default:
                            System.out.println("You entered Wrong !!!");
                    }
                    break;
                case 1:
                    //Bookdetails();
                    break;
                case 2:

                    System.out.println("Are you a Student ? press Y / N");
                    char ans2= in.next().charAt(0);

                    switch(ans2)
                    {
                        case 'y' :
                            System.out.println("Press b for Issue Books " + "\n Press s for All Student Details" +"\npress a for add students"
                                   + "\n Press e for Exit");
                            char val= in.next().charAt(0);
                            switch(val){
                                case 'a' :
                                    Add_Student();
                                    break;
                                case 's':
                                    AllStudentDetails();
                                    break;
                                case 'n' :
                                    System.exit(0);
                                    break;
                            }
                            break;

                        case 'n':
                            System.exit(0);
                            break;
                        default:
                            System.out.println("You entered Wrong !!!");
                    }
                    break;

                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
            }

        }









         //end of main
    }
//    private static void Addbooks() {
//        BookDetails book = new BookDetails();
////        book.Book_details(book);
//    }
//    private static void Librarian_details()
//    {
//        Lib_Info info=new Lib_Info();
//        info.lib_info();
//    }
    private static void AllStudentDetails()
    {
        Add_Student add=new Add_Student();
        add.view_all();

    }
    private static void Add_Student()
    {
        Add_Student add=new Add_Student();
        add.std_details();
        add.view_all();
    }
}
