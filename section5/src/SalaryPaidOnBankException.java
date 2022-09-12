public class SalaryPaidOnBankException extends Exception{
    private double argument;

    private static String message;

    public SalaryPaidOnBankException(double argument, String message){
        super(message);
        this.argument = argument;
    }

    public SalaryPaidOnBankException(String message){
        super(message);
    }

    public double getArgument() {
        return argument;
    }
}
