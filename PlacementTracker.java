import java.util.ArrayList;
public class PlacementTracker{
   ArrayList<Student>students=new ArrayList<>();

public void addStudent(Student student){
    students.add(student);
}
public void displayStudents(){
    for (Student student:students){
        System.out.println("Name:"+student.getName());
        System.out.println("Roll Number:"+student.rollNumber);
        System.out.println("CGPA:"+student.Cgpa);
        System.out.println("placed:"+student.isPlaced);
        System.out.println("placements Attended:"+student.PlacementsAttended);
        System.out.println("________________________________");
         }
}

public void searchStudent(int rollNumber) {

    for (Student student : students) {

        if (student.rollNumber == rollNumber) {

            System.out.println("Student Found!");
            System.out.println("Name: " + student.getName());
            System.out.println("Roll Number: " + student.getrollNumber());
            System.out.println("CGPA: " + student.getCgpa());
            System.out.println("Placed:" + student.isPlaced());
            System.out.println("Placements Attended: " + student.getPlacementsAttended());

            return;
        }
    }

    System.out.println("Student Not Found!");
}
public void markStudentAsPlaced(int rollNumber) {

    for (Student student : students) {

        if (student.rollNumber == rollNumber) {

            student.isPlaced = true;

            System.out.println("Student marked as placed!");
            return;
        }
    }

    System.out.println("Student not found!");
}

}