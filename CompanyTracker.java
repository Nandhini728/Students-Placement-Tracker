import java.util.ArrayList;
public class CompanyTracker{

ArrayList<Company>companies=new ArrayList<>();
public void addCompany(Company company) {
    companies.add(company);
    System.out.println("Company Added Successfully!");
   
}
public void displayCompanies() {

    if (companies.isEmpty()) {
        System.out.println("No Companies Available!");
        return;
    }

    for (Company company : companies) {
        System.out.println("Company Name: " + company.getCompanyName());
        System.out.println("Package: " + company.getPackageLpa() + " LPA");
        System.out.println("Eligibility CGPA: " + company.getEligibilityCgpa());
        System.out.println("Position: " + company.getPosition());
        System.out.println("Openings: " + company.getOpenings());
        System.out.println("------------------------------");
    }
}
}