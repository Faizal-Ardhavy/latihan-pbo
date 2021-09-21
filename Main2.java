public class Main2 {
    
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        Employe[] employe = new Employe [2];
        employe[0]= new SalariedEmploye();
        employe[1]= new HourlyEmployee();
        ((SalariedEmploye)employe[0]).setSalary(1000000);
        ((HourlyEmployee)employe[1]).setHourlyPayment(10000);
        ((HourlyEmployee)employe[1]).setHoursWorked(20);
        for(Employe i:employe){
            System.out.println(i.payment());
        }
    }
    
}
