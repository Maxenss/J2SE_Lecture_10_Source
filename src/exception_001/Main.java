package exception_001;

class Main {
    static public void main(String[] args) {
        try {
            int a = 2 / 0;
        } catch (ArithmeticException ex1) {
            //
        } catch (Exception ex) {
            System.out.println("На ноль делить нельзя!");
            System.out.println(ex);
        }

    }
}
