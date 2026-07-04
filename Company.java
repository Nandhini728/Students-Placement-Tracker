public class Company{
        String companyName;
        double packageLpa;
        double eligibilityCgpa;
        String position;
        int openings;
        Company(String companyName,double packageLpa,double eligibilityCgpa,String position,int openings){
                this.companyName=companyName;
                this.packageLpa=packageLpa;
                this.eligibilityCgpa=eligibilityCgpa;
                this.position=position;
                this.openings=openings;
        }
        public String getCompanyName() {
    return companyName;
}

public double getPackageLpa() {
    return packageLpa;
}

public double getEligibilityCgpa() {
    return eligibilityCgpa;
}

public String getPosition() {
    return position;
}

public int getOpenings() {
    return openings;
}

}