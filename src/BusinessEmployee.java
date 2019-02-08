public abstract class BusinessEmployee extends Employee {
    double budget;

    public BusinessEmployee(String name) {
        super(name, 0);
        this.baseSalary=50000;
    }

    public String employeeStatus() {
        String a = Integer.toString(this.employeeID) + this.name + Double.toString(this.budget);
        return a;
    }

    public double getBonusBudget(){
        return this.budget;
    }

}
