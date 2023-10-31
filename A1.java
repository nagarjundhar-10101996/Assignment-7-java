class Staff extends Object
{   
    private int CodeName;
    public Staff(int i) {
        this.CodeName = i;
    }
    public int getCodeName() {
        return CodeName;
    }
}
class Teacher extends Staff
{
    private String Subject;
    public Teacher(String Subject , int CodeName ) {
        super(CodeName);
        this.Subject = Subject;
    }
    public String getSubject() {
        return Subject;
    }
    
}
class Typist extends Staff
{
    private int Speed;
    public Typist(int Speed , int CodeName) {
        super(CodeName);
        this.Speed = Speed;
    }
    public int getSpeed() {
        return Speed;
    }
    
    
}
class Officer extends Staff
{
    private String Grade;
    public Officer(String Grade , int CodeName) {
        super(CodeName);
        this.Grade = Grade;
    }
    public String getGrade() {
        return Grade;
    }
    
}
class Regular extends Typist
{
    private int Salary;
    public Regular(int Speed , int CodeName , int Salary ) {
        super( Speed , CodeName);
        this.Salary = Salary;
        //TODO Auto-generated constructor stub
    }
    public int getSalary() {
        return Salary;
    }
    
}
class Casual extends Typist
{
    private int Daily_wages;
    public Casual(int Speed , int CodeName, int Daily_wages) {
        super( Speed , CodeName);
        this.Daily_wages = Daily_wages;
        //TODO Auto-generated constructor stub
    }
    public int getDaily_wages() {
        return Daily_wages;
    }
    
}
/**
 * A1 Main 
 */
public class A1 {
    public static void main(String[] args) {
        Staff s = new Staff(1);
        Typist t = new Typist(25,2);
        Teacher staff = new Teacher("Math" , 3);
        Officer staffOfr = new Officer(" A ", 4);
        Regular staff1 = new Regular(30, 5, 1000);
        Casual staffCasual = new Casual(400, 6, 200);
        
        System.out.printf("Grade: %s,  CodeName: %d \n" ,staffOfr.getGrade()  , staffOfr.getCodeName()  );
        System.out.printf("Subject: %s,  CodeName: %d \n" ,staff.getSubject()  , staff.getCodeName()  );
        System.out.printf("CodeName: %s,  Speed: %d , Grade: %s \n"   ,staff1.getCodeName()  ,staff1.getSpeed()  , staffOfr.getGrade()  );
        System.out.printf("CodeName: %s,  Speed: %d , Daily Wages: %d \n"   ,staffCasual.getCodeName()  ,staffCasual.getSpeed()  , staffCasual.getDaily_wages()  );

    }
}