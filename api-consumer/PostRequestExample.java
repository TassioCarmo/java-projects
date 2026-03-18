import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PostRequestExample {
    public static void main(String[] args) throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        // Build the JSON string we want to send as the request body
        String requestBody = """
                {
                    "title": "My Java Post",
                    "body": "Created using Java HttpClient!",
                    "userId": 1
                }
                """;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
                // POST method + request body
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                // Tell the server we're sending JSON
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        System.out.println("Status Code: " + response.statusCode()); // Expect 201
        System.out.println("Created Resource: " + response.body());
    }
}
