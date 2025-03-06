import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;;
/*
 * Create the Student and Priorities classes here.
 */
 class Priorities{ 
    private PriorityQueue<Student> queue = new PriorityQueue<>();
    
    public List<Student> getStudents(List<String> events)
    {
        for(String event: events)
        {
            String[] s = event.split(" ");
            if(s[0].equals("ENTER"))
            {
                String name = s[1];
                double cgpa = Double.parseDouble(s[2]);
                int id = Integer.parseInt(s[3]);
                Student newStudent = new Student(id, name, cgpa);
                queue.add(newStudent);
            }else if(s[0].equals("SERVED")){
                queue.poll();
            }
        }
        
        List<Student> remainingStudents = new ArrayList<>();
        while(!queue.isEmpty()){
            remainingStudents.add(queue.poll());
        }
        return remainingStudents;
    }
 }
 
 

class Student implements Comparable<Student>{
    private int id;
    private String name;
    private double cgpa;
    
    public Student(int id, String name, double cgpa)
    {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCGPA()
    {
        return this.cgpa;
    }
    
    public int compareTo(Student student)
    {
        if(this.cgpa != student.cgpa)
        {
            return Double.compare(student.cgpa, this.cgpa);   
        }else if(!this.name.equals(student.name)){
            return this.name.compareTo(student.name);
        }else{
            return Integer.compare(this.id, student.id);
        }
    }
 }


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}


/*
Input:
12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED

Output:
Dan
Ashley
Shafaet
Maria


*/

