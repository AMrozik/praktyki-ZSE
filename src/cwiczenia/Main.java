package cwiczenia;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println(1 / 8);
        }
        catch (ArithmeticException e){
            System.out.println("nie dziel przez zero");
        }
        finally {
            System.out.println("koniec");
        }


        try {
            System.out.println(1 / 8);
            throw new My_Exception();
        }
        catch (My_Exception e){
            System.out.println(e);
        }
    }
}
