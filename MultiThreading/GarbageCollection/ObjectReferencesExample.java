public class ObjectReferencesExample {

    public static void main(String[] args) {
        MyClass obj1 = new MyClass("Object 1");
        MyClass obj2 = new MyClass("Object 2");
        MyClass obj3 = new MyClass("Object 3");

        obj1.setReference(obj2);
        obj2.setReference(obj3);
        obj3.setReference(obj1);

        obj1 = null;
        obj2 = null;
        obj3 = null;

        System.gc();



        System.out.println("Garbage collection suggested. Circularly referenced objects may have been collected.");
    }
}

class MyClass {
    private String name;
    private MyClass reference;

    public MyClass(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    public void setReference(MyClass reference) {
        this.reference = reference;
    }

    protected void finalize() throws Throwable {
        System.out.println(name + " is being finalized.");
    }
}
