public class Test {
    public static void main(String[] args) throws SalaryPaidOnBankException {

        Employee employee = new Employee(1, "Büşra", 15, "IT");
        try {
            employee.calculateSalary();
        }catch (SalaryPaidOnBankException salaryPaidOnBankException){
            System.out.println("get your salary from bank");
            System.out.println(salaryPaidOnBankException.getMessage());
            salaryPaidOnBankException.printStackTrace();
            double salary = salaryPaidOnBankException.getArgument();
            System.out.println("Salary of the employee: " +salary);
        }
        System.out.println("Program continues");
    }
}
