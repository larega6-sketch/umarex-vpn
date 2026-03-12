import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.InetAddress;

public class PingService {

    public static void main(String[] args) {
        String host = "google.com"; // Update with your server IP or hostname
        pingServer(host);
    }

    public static void pingServer(String host) {
        try {
            InetAddress inet = InetAddress.getByName(host);
            long startTime = System.currentTimeMillis();
            if (inet.isReachable(5000)) {
                long latency = System.currentTimeMillis() - startTime;
                System.out.println(host + " is reachable. Latency: " + latency + " ms");
            } else {
                System.out.println(host + " is not reachable.");
            }
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}