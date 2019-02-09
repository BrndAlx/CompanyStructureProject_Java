import java.sql.SQLOutput;

public class SoftwareEngineer extends  TechnicalEmployee {
   private int checkIns;
   private int succesfulCheckIns;
   boolean codeAcces;
   boolean grantedCodeAcces=false;
   boolean hasManager=false;
   String Manager;
   boolean checkInAproved=false;

   public SoftwareEngineer (String name){
       super(name);
       this.checkIns=0;
       this.codeAcces=false;
   }
   public boolean getCodeAcces(){
       if (codeAcces==true){
           System.out.println(name + " has a valid Code Access");
           return true;
       }else{
           System.out.println(name + " does not have a valid Code Access");
           return false;
       }
   }

   public void setCodeAcces(boolean access){
       if (grantedCodeAcces==true){
           System.out.println(" Acces Code Granted for "+name+" !");
           codeAcces=true;
       }else{
            System.out.println(this.name+" has no Technical Lead,please assign one for code acces");
            codeAcces=false;
       }
   }

   public int getSuccesfulCheckIns(){
       System.out.println(name+" has "+succesfulCheckIns+" succesful CheckIns");
       return succesfulCheckIns;
   }

   public boolean checkInCode(){
       if(checkInAproved==true){
           System.out.println("Approved Check-in");
           checkInAproved=false;
           succesfulCheckIns++;
           return true;
       }else{
           System.out.println("Declinde Check-in");
           return false;
       }

   }

    @Override
    public Employee getManager() {
        return null;
    }
}
