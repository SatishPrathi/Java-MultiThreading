import java.lang.ref.WeakReference;

public class WeakReferenceExample {

    public static void main(String[] args) {
        WeakReference<MyClass> weakReference = new WeakReference<>(new MyClass("Weak Object"));

        MyClass weakObject = weakReference.get();

        System.gc();

        
        if (weakObject != null) {
            System.out.println("Weak reference still holds the object: " + weakObject.getName());
        } else {
            System.out.println("Weak reference does not hold the object. It may have been collected.");
        }
    }
}

class MyClass {
    private String name;

    public MyClass(String name) {
        this.name = name;
        System.out.println(name + " created.");
    }

    public String getName() {
        return name;
    }

    protected void finalize() throws Throwable {
        System.out.println(name + " is being finalized.");
    }
}
