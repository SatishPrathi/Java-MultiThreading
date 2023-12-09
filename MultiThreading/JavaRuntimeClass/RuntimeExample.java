public class RuntimeExample {

    public static void main(String[] args) {

        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of processors: " + processors);
    }
}
