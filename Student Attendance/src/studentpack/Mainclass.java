package studentpack;


import java.util.*;

public class Mainclass {
    public static void main(String[] args){
        System.out.println("WELCOME TO STUDENT MANAGEMENT SYSTEM.");
        Scanner input = new Scanner(System.in);
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        ArrayList<StudentAttandance> attendanceArrayList = new ArrayList<StudentAttandance>();
        StudentOperation operation = new StudentOperation();
        AttendanceOperation attendanceOperation = new AttendanceOperation();
        //StudentAttandance attandance = new StudentAttandance();
        int choice;

        while(true){
            System.out.println("\n1.Registration HERE.");
            System.out.println("2.Searching Student by name.");
            System.out.println("3.Searching Student by ID.");
            System.out.println("4.Searching Students by Section.");
            System.out.println("5.Searching Students by Level and Term.");
            System.out.println("6.Taking Atttendance.");
            System.out.println("7.Showing Attended Students by course title.");
            System.out.println("8.Removing student.");
            System.out.println("0. For Exit.");
            System.out.print("\nPlease Enter Your Choice: ");
            choice = input.nextInt();

            if(choice==0){
                break;
            }else if(choice == 1){
                operation.registration(studentArrayList);
            }else if(choice == 2){
                operation.search_by_name(studentArrayList);
            }else if(choice == 3){
                operation.search_by_id(studentArrayList);
            }else if(choice == 4){
                operation.search_by_section(studentArrayList);
            }else if(choice == 5){
                operation.search_by_level_term(studentArrayList);
            }else if(choice == 6){
                attendanceArrayList.add(attendanceOperation.attendance(studentArrayList)); // Receiving attendance and store in a arraylist,
                                                                                            // in bracket-call the operation.
            }else if(choice == 7){
                attendanceOperation.searchAttendancebytitle(attendanceArrayList);
            }else if(choice == 8) {
                operation.remove(studentArrayList);
            }
        }
        System.out.println("\n--------Thanks For Using our System.--------");
    }
}