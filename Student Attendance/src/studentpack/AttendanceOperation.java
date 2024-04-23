package studentpack;

import java.util.*;

public class AttendanceOperation {
    Scanner input = new Scanner(System.in);
    public StudentAttandance attendance(ArrayList<Student> studentArrayList){  //return type StudentAttendance for return the attendance.

        System.out.print("\nPlease Enter The Date: ");
        String date = input.nextLine();
        System.out.print("\nPlease Enter the Course Title: ");
        String title = input.nextLine();
        System.out.print("\nEnter the Section: ");
        String section = input.next();

        StudentAttandance attandance = new StudentAttandance(date,title,section);
        attandance.takeattendance(studentArrayList);
        return attandance;
    }
    public void searchAttendancebytitle(ArrayList<StudentAttandance> attendance)
    {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Please enter the course title: ");
        String title = scanner.next();

        for(StudentAttandance  attendances : attendance )
        {
            if(title.equalsIgnoreCase(attendances.title) == true)
            {
                this.displayAttendance(attendances);
            }
        }
    }



    public void displayAttendance(StudentAttandance  attendances)
    {
        System.out.println("Date: "+attendances.date);
        System.out.println("Title:"+attendances.title);
        System.out.println("section:"+attendances.section);

        for(Student s: attendances.studentAttendance)
        {
            (new StudentOperation()).display(s);
        }
    }

}
