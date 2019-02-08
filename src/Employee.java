import java.sql.SQLOutput;

public abstract class  Employee {
     double baseSalary;
     String name;
     int employeeID;



    public Employee(String name, double baseSalary){
        this.name=name;
        this.baseSalary=baseSalary;
        this.employeeID++;
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }

    public String getName(){
        return this.name;
    }

    public abstract Employee getManager();

    public boolean equals(Employee other){
        if(this.employeeID == other.employeeID){
            return  true;
        }
        else {
            return false;
        }
    }
    public String toString(){
         return this.employeeID+this.name ;
    }

    public abstract String employeeStatus();

}
