public class SalariedEmploye extends Employe{
    int salary;

    public void setSalary(int salary){
        this.salary=salary;
    }
    @Override
    int payment() {
        
        return salary;
    }
    
    
}
