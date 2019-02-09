public class BussinessLead extends BusinessEmployee{
    private static final int  headCount= 10;
    private int addReports=0;

    public BussinessLead(String name){
        super(name);
        this.baseSalary=2*BusinessEmployee.baseSalary;
    }

    public boolean hasHeadCount(){
            if(headCount<addReports){
                System.out.println("Head count available :"+(this.headCount-this.addReports));
                return true;
            }else{
                System.out.println("Head count full: "+this.addReports);
                return false;
            }

    }

    public boolean addReport(Accountant a, TechnicalLead tl){

    }
    public boolean requestBonus(Employee e, double bonus){

    }
    public boolean approvesBonus(Employee e, double bonus){

    }








    @Override
    public Employee getManager() {
        return null;
    }
}
