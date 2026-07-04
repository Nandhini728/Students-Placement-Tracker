import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PlacementTracker tracker = new PlacementTracker();
        
        CompanyTracker companyTracker=new CompanyTracker();
        



        boolean running = true;

        while (running) {

            System.out.println("\n===== Student Placement Tracker =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Mark Student as Placed");
            System.out.println("5. Exit");
            System.out.println("6. Add Company");
            System.out.println("7. Display Companies");
             System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student Name: ");
                    String Name = sc.nextLine();


                    System.out.print("Enter Roll Number: ");
                    int rollNumber = sc.nextInt();

                    System.out.print("Enter CGPA: ");
                    double Cgpa = sc.nextDouble();

                    System.out.print("Is Placed? (true/false): ");
                    boolean isPlaced = sc.nextBoolean();

                    System.out.print("Placements Attended: ");
                    int PlacementsAttended = sc.nextInt();
                    sc.nextLine();

                    Student s1 = new Student(Name, rollNumber, Cgpa, isPlaced, PlacementsAttended);

                    tracker.addStudent(s1);

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:

                    tracker.displayStudents();
                    break;

                case 3:

                   System.out.print("Enter Roll Number to Search: ");
                   int searchRoll = sc.nextInt();
                   tracker.searchStudent(searchRoll);
                   break;

                case 4:

                    System.out.println("Enter Roll number");
                    int placedRoll=sc.nextInt();
                    tracker.markStudentAsPlaced(placedRoll);
                    break;

                case 5:

                    running = false;
                    System.out.println("Thank You!");
                    break;
                case 6:

    System.out.print("Enter Company Name: ");
    String companyName = sc.nextLine();

    System.out.print("Enter Package (LPA): ");
    double packageLPA = sc.nextDouble();

    System.out.print("Enter Eligibility CGPA: ");
    double eligibilityCgpa = sc.nextDouble();
    sc.nextLine();

    System.out.print("Enter Position: ");
    String position = sc.nextLine();

    System.out.print("Enter Number of Openings: ");
    int openings = sc.nextInt();
    sc.nextLine();

    Company company = new Company(
        companyName,
        packageLPA,
        eligibilityCgpa,
        position,
        openings
    );

    companyTracker.addCompany(company);

    break;
    case 7:
        companyTracker.displayCompanies();
        break;    

                default:

                    System.out.println("Invalid Choice!");

            }

        }

        sc.close();
    }
}