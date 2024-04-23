package studentpack;

import java.util.*;

public class StudentAttandance {
    String date;
    String title;
    String section;
    ArrayList<Student> studentAttendance;
    Scanner input = new Scanner(System.in);

    StudentAttandance(String date,String title,String section) {
        this.date=date;
        this.title=title;
        this.section=section;
        this.studentAttendance = new ArrayList<Student>();
    }
    public void takeattendance(ArrayList<Student> studentArrayList){
        StudentOperation operation = new StudentOperation();  //Creating object for use display function.
        for(Student s: studentArrayList ){
            if(this.section.equalsIgnoreCase(s.section)==true) {
                operation.display(s);
                System.out.println("1 for YESand 0 for NO");
                int a = input.nextInt();
            }
        }
    }
}
