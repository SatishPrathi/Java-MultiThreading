public class AutomaticGarbageCollectionExample {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new MyClass("Object " + (i + 1));
        }

       
        System.out.println("Automatic garbage collection may have occurred.");
    }
}

class MyClass {
    private String name;

    public MyClass(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    
    protected void finalize() throws Throwable {
        System.out.println(name + " is being finalized.");
    }
}
