package studentpack;
import java.util.*;
public class StudentOperation {
    Scanner input = new Scanner(System.in);
    public void registration(ArrayList<Student> studentlist){
        System.out.print("\nEnter Your Name: ");
        String name = input.next();
        System.out.print("Enter Your ID: ");
        String id = input.next();
        System.out.print("Enter Your Section: ");
        String section = input.next();
        System.out.print("Enter Your Level and Term(ex:L2,T2): ");
        String level_term = input.next();


        Student student = new Student(name,id,section,level_term);
        studentlist.add(student);
        System.out.println("\nRegistration Completed.\nNow Number of Total Students: "+studentlist.size());
    }
    public void searching_by_id(ArrayList<Student> studentlist){
        System.out.print("\nEnter The ID: ");
        String id = input.next();
        for(Student s:studentlist) {
            if(id.equalsIgnoreCase(s.id) == true){
                this.display(s);
            }
        }
    }
    public void searching_by_name(ArrayList<Student> studentlist){
        System.out.print("\nEnter The NAME: ");
        String name = input.next();
        for(Student s:studentlist) {
            if(name.equalsIgnoreCase(s.name) == true){
                this.display(s);
            }
        }
    }
    public void searching_by_section(ArrayList<Student> studentlist){
        System.out.print("\nEnter The SECTION: ");
        String section = input.next();
        for(Student s:studentlist) {
            if(section.equalsIgnoreCase(s.section) == true){
                this.display(s);
            }
        }
    }
    public void searching_by_level_term(ArrayList<Student> studentlist){
        System.out.print("\nEnter The LEVEL and TERM: ");
        String level_term = input.next();
        for(Student s:studentlist) {
            if(level_term.equalsIgnoreCase(s.level_term) == true){
                this.display(s);
            }
        }
    }
    public void remove(ArrayList<Student> studentlist){
        System.out.print("\nEnter The ID: ");
        String id = input.next();
        for(Student s:studentlist) {
            if(id.equalsIgnoreCase(s.id) == true){
                Student student2 = new Student(s.name,s.id,s.section,s.level_term);
                studentlist.remove(student2);
            }
        }
        System.out.println("Successfully Removed.");


    }

    public void display(Student s){
        System.out.println("\nName: "+s.name);
        System.out.println("ID: "+s.id);
        System.out.println("SECTION: "+s.section);
        System.out.println("Level and Term: "+s.level_term);
    }

}
