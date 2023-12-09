import java.io.IOException;

public class ExecuteCommandExample {

    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("ls");

            int exitCode = process.waitFor();
            System.out.println("Command executed with exit code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
