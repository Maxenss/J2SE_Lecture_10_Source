package generics_002;

public class Main {
    static public void main(String[] args) {
        MyClass<String, Integer> instance =
                new MyClass<>("Hello from first instance", 123);

        System.out.println(instance.getField1());
        System.out.println(instance.getField2());


        System.out.println();


        MyClass<Double, String> instance2 =
                new MyClass<>(0.123, "Hello from second instance");

        System.out.println(instance2.getField1());
        System.out.println(instance2.getField2());
    }
}
