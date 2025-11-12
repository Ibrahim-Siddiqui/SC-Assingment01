package fig1;

import java.util.List;

/**
 * Demo main to show the split interfaces in action.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Fig1 UML Implementation Demo ---");

        Amazon amazon = new Amazon();
        // Use hosting features
        amazon.createServer("us-east-1");
        amazon.createServer("us-east-1");
        amazon.createServer("eu-west-1");

        List<String> usServers = amazon.listServers("us-east-1");
        System.out.println("Amazon servers in us-east-1: " + usServers);

        // Use storage and CDN
        amazon.storeFile("index.html");
        String content = amazon.getFile("index.html");
        System.out.println("Retrieved from Amazon storage: " + content);
        System.out.println("CDN url: " + amazon.getCDNAddress("index.html"));

        System.out.println();

        // Dropbox only supports storage
        Dropbox dropbox = new Dropbox();
        dropbox.storeFile("notes.txt");
        System.out.println("Retrieved from Dropbox: " + dropbox.getFile("notes.txt"));

        System.out.println("--- Demo complete ---");
    }
}
