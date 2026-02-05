

public class Emp {
    String name;
    String lastname;
    double Salary;

    public Emp(String aname, String alastname, int new_salary){
        this.name= aname;
        this.lastname = alastname;
        if (new_salary > 0) {
            this.Salary = new_salary;
        } else {
            this.Salary = new_salary;
        }

}

    public void setName(String aname ){
        this.name = aname;
    }
    public String getName(){
        return name;
    }
    
    public void setlastName(String alastname ){
        this.lastname = alastname;
    }
    public String getlastName(){
        return lastname;
    }
     public void setSalary(double  new_salary ){
        if (new_salary>0) {
            this.Salary = new_salary;
        }
    }
    public double  getSalary(){
            return Salary;
    }
    public void give_salary(){
        Salary = Salary+(Salary* 0.1);
    }

    public double calculate_salary(){
        return Salary*12;
    }
    public static void main(String[] args) {
        Emp e = new Emp("Shahu", "Jagtap", 30000);
        Emp e1 = new Emp("Devank", "Chavan", -234000);

        System.out.println(e.getName() );
        System.out.println(e.getlastName());
        System.out.println(e.getSalary());


         System.out.println(e1.getName() );
        System.out.println(e1.getlastName());
        System.out.println(e1.getSalary());

       

        System.out.println(" After the raise of the salary : ");

        System.out.println(e.getName() + " " + e.getlastName() + " ");
        System.out.println( e.calculate_salary());
       
        System.out.println(e1.getName() + " " + e1.getlastName() + " " +  e1.calculate_salary());
       


        
    }
    
}
