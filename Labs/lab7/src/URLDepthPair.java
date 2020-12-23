import java.net.*;

/**
 * A class to represent [URL, depth] pairs for our Crawler. 
 */
public class URLDepthPair {
    

    
    /**
     * Fields to represent the current URL and current depth.
     */
    private int currentDepth;
    private String currentURL;
    
    /**
     * A constructor that sets the input to the current URL and depth.
     */
    public URLDepthPair(String URL, int depth) {
        currentDepth = depth;
        currentURL = URL;
    }

    public String getURL() {
        return currentURL;
    }

    public int getDepth() {
        return currentDepth;
    }

    public String toString() {
        String stringDepth = Integer.toString(currentDepth);
        return stringDepth + '\t' + currentURL;
    }

    public String getDocPath() {
        try {
            URL url = new URL(currentURL);
            return url.getPath();
        }
        catch (MalformedURLException e) {
            System.err.println("MalformedURLException: " + e.getMessage());
            return null;
        }
    }

    public String getWebHost() {
        try {
            URL url = new URL(currentURL);
            return url.getHost();
        }
        catch (MalformedURLException e) {
            System.err.println("MalformedURLException: " + e.getMessage());
            return null;
        }
    }
    
    
}