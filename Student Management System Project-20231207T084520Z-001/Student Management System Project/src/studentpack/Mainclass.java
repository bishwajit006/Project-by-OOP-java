package studentpack;

import java.util.*;
public class Mainclass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO STUDENT MANAGEMENT SYSTEM.");

        ArrayList<Student>studentlist = new ArrayList<Student>();
        StudentOperation operation = new StudentOperation();
        int choice;
        while(true){
            System.out.println("\n1.Registration here.");
            System.out.println("2.Searching Student by Name.");
            System.out.println("3.Searching Student by ID.");
            System.out.println("4.Searching Students by Section: ");
            System.out.println("5.Searching Students by Level and TERM: ");
            System.out.println("6.*Removing Student by ID: ");

            System.out.print("\nPlease Enter Your Choice: ");
            choice = input.nextInt();

            if(choice==0) {
                break;
            }else if(choice==1){
                operation.registration(studentlist);
            }else if(choice==2){
                operation.searching_by_name(studentlist);
            }else if(choice==3){
                operation.searching_by_id(studentlist);
            }else if(choice==4){
                operation.searching_by_section(studentlist);
            }else if(choice == 5){
                operation.searching_by_level_term(studentlist);
            }else if(choice == 6){
                operation.remove(studentlist);
            }


        }
        System.out.println("\n--------Thank You For Using Our System---------");



    }
}
