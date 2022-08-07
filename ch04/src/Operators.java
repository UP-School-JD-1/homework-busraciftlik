public class Operators {
    public static void main(String[] args) {
        Operators operators = new Operators();
        System.out.println(operators.subtract(8,15));
        int i = 5 ;
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(--i);
        System.out.println(i--);
    }

    public int add(int x , int y){
        int result = x + y;
        return result;
    }
    public int subtract(int x , int y) {

        if (x > y) {
            int result = x - y;
            return result;
        } else {
            int result = y - x;
            return result;
        }
    }
    public int divide (int x , int y) {
        int result = x / y;
        return result;
    }
    public int multiply ( int x , int y){
        int result = x*y;
        return result ;
    }
}
