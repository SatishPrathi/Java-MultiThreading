public class GarbageCollectionExample {

    public static void main(String[] args) {

        Runtime.getRuntime().gc();
        System.out.println("Garbage collector executed.");
    }
}
