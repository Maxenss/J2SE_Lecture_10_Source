package generics_003;

class MyClass {
    static <T> void Method(T num) {
        if (num instanceof Double) {
            System.out.println("Число имеет тип Double");
        } else if (num instanceof Integer) {
            System.out.println("Число имеет тип Integer");
        } else {
            System.out.println("Число имеет другой тип");
        }
    }
}
