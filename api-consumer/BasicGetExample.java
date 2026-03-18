import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class BasicGetExample {
    public static void main(String[] args) throws Exception {

        // 1. Create an HttpClient — reuse this across requests in real apps
        HttpClient client = HttpClient.newHttpClient();

        // 2. Build the request: specify URL and HTTP method
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/1"))
                .GET()  // Explicitly set method (GET is default, but good to be explicit)
                .build();

        // 3. Send the request — BodyHandlers.ofString() reads response as text
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        // 4. Check the HTTP status code
        System.out.println("Status Code: " + response.statusCode());

        // 5. Print the raw JSON response body
        System.out.println("Response Body:\n" + response.body());
    }
}