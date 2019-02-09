public  class TechnicalLead extends TechnicalEmployee  {
    private int headCountDefault=4;
    int directReports=0;

    public TechnicalLead(String name){
        super(name);
        this.baseSalary=1.3 * TechnicalEmployee.baseSalary;
        System.out.println("Manager");

    }

    public boolean hasHeadCount(){
        if(directReports<headCountDefault){
            System.out.println("Direct reports smaller then head count.");
            return true;
        }else{
            System.out.println("Direct reports equal to head count.");
            return false;
        }
    }

    public boolean addReport(SoftwareEngineer e){
        if (directReports<headCountDefault){
            System.out.println(this.name+" is manager for "+e.name);
            e.hasManager=true;
            e.Manager=this.name;
            e.grantedCodeAcces=true;
            return true;
        }else{
            return false;
        }
    }

    public boolean approveCheckIn(SoftwareEngineer e){
            if (e.hasManager&&(e.Manager.contentEquals(this.name)&&e.grantedCodeAcces)){
                System.out.println(this.name+" approved the check-in for: "+e.name);
                e.checkInAproved=true;
                return true;
            }else
            {
                System.out.println(this.name+" has declined the check-in for: "+e.name);
                e.checkInAproved=false;
                return false;
            }
    }

    public boolean requestBonus(Employee e ,double bonus ){

        return false;

    }
    public String getTeamStatus(){
        String a="";
        return a;
    }


    @Override
    public Employee getManager() {
        return null;
    }
}
