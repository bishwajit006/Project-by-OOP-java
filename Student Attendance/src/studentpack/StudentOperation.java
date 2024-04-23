package studentpack;
import java.util.*;
public class StudentOperation {
    Scanner input = new Scanner(System.in);
    //Student student = new Student();

    public void registration(ArrayList<Student> studentArrayList){
        System.out.print("\nEnter Your name: ");
        String name = input.next();
        System.out.print("\nEnter Your Student ID: ");
        String id = input.next();
        System.out.print("\nEnter Your Section: ");
        String section = input.next();
        System.out.print("\nEnter The Level and Term(ex:L2T2): ");
        String level_term = input.next();

        Student student = new Student(name,id,section,level_term);
        studentArrayList.add(student);
        System.out.println("\nOne Student Registration Completed.\nNow Total Number of Students: "+studentArrayList.size());
    }

    public void search_by_name(ArrayList<Student> studentArrayList){
        System.out.print("\nEnter The Name of the Student: ");
        String name = input.next();
        boolean k=true;
        for(Student s: studentArrayList){
            if(s.name.equalsIgnoreCase(name)==true){
                this.display(s);
                k=false;
            }
        }
        if(k){
            System.out.println("\nThere is no Student such this name.");
        }
    }

    public void search_by_id(ArrayList<Student> studentArrayList){
        System.out.print("Enter The ID: ");
        String id= input.next();
        boolean k=true;
        for(Student s: studentArrayList){
            if(id.equalsIgnoreCase(s.id)==true){ // we can search any way(s.id first or id first)
                this.display(s);
                k=false;
            }
        }
        if(k){
            System.out.println("\nThere is no Student for this ID.\nPlease Enter a Valid ID.");
        }
    }

    public void search_by_section(ArrayList<Student> studentArrayList){
        System.out.print("Enter The Section: ");
        String section = input.next();
        boolean k =true;
        for(Student s:studentArrayList){
            if(section.equalsIgnoreCase(s.section)==true){
                this.display(s);
                k=false;
            }
        }
        if(k){System.out.println("\nThe Section is Empty.");}

    }
    public void search_by_level_term(ArrayList<Student> studentArrayList){
        System.out.print("Enter The Level and Term: ");
        String level_term = input.next();
        boolean k=true;
        for(Student s: studentArrayList){
            if(level_term.equalsIgnoreCase(s.level_term)==true) {
                this.display(s);
                k=false;
            }
        }
        if(k) System.out.println("\nThere no Students for this Session.");
    }
    public void remove(ArrayList<Student> studentArrayList){
        System.out.print("Enter The ID: ");
        String id = input.next();
        boolean k= true;
        for(Student s: studentArrayList){
            if(id.equalsIgnoreCase(s.id)==true) {
                k=false;
                this.display(s);
                System.out.println(s.name+" this Student is Removed.");
                studentArrayList.remove(s);
                System.out.println("Removed Succesfully, Now Total Student Number: "+studentArrayList.size());
                return;
            }
        }
        if(k) System.out.println("\nPlease Enter Valid ID;");
    }


    public void display(Student s){
        System.out.println("\nName: "+s.name);
        System.out.println("ID: "+s.id);
        System.out.println("Section: "+s.section);
        System.out.println("Level and term: "+s.level_term);
    }
}
