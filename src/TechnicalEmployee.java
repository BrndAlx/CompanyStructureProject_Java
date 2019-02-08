public abstract class TechnicalEmployee extends Employee {
    int checkINs;

    TechnicalEmployee(String name){
        super(name,0);
        this.baseSalary=75000;
    }

    @Override
    public String employeeStatus() {
        String a = Integer.toString(this.employeeID) + this.name + Integer.toString(this.checkINs);
        return a;
}


}
