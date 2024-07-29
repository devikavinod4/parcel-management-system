import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Parcel {

    public static void main(String[] args) {
        String htmlFilePath = "E:\\VSCode\\ParcelManagementSystem\\parcelmanagement\\src\\webapp\\home.html";

        // Try to open the HTML file in the default browser
        try {
            File htmlFile = new File(htmlFilePath);
            if (htmlFile.exists()) {
                // For Windows and Linux
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    if (desktop.isSupported(Desktop.Action.BROWSE)) {
                        desktop.browse(htmlFile.toURI());
                    } else {
                        System.out.println("Desktop doesn't support browse action");
                    }
                } else {
                    System.out.println("Desktop is not supported");
                }
            } else {
                System.out.println("HTML file does not exist");
            }
        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        }
        // } catch (URISyntaxException e) {
        //     System.err.println("URISyntaxException occurred: " + e.getMessage());
        // }
    }
}
