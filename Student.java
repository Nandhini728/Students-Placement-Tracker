public class Student{
        String Name;
        int rollNumber;
        double Cgpa;
        boolean isPlaced;
        int PlacementsAttended;
        Student(){
            System.out.println("Student object created");
        }
        
        Student(String Name,int rollNumber,double Cgpa,boolean isPlaced,int PlacementsAttended){
        this.Name=Name;
        this.rollNumber=rollNumber;
        this.Cgpa=Cgpa;
        this.isPlaced=isPlaced;
        this.PlacementsAttended=PlacementsAttended;  
        }
        public String getName(){
            return Name;
        }
        public void setName(String Name){
            this.Name=Name;
        }
        public  int getrollNumber(){
            return rollNumber;
        }
         public  double getCgpa(){
            return Cgpa;
        }
         public  boolean isPlaced(){
            return isPlaced;
        }
         public  int getPlacementsAttended(){
            return PlacementsAttended;
        }
        public void setPlaced(boolean isPlaced){
            this.isPlaced=isPlaced;
        }
}
