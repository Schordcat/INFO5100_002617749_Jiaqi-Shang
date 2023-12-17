
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class JSONParser {
    public static void main(String[] args) throws Exception {
        // Parse the JSON
        String jsonData = readFile("BookShelf.json");
        JSONObject root = new JSONObject(jsonData);
        JSONArray books = root.getJSONArray("BookShelf");


        // Add a new book
        JSONObject newBook = new JSONObject();
        newBook.put("title", "Book Four");
        newBook.put("publishedYear", 2015);
        newBook.put("numberOfPages", 350);
        newBook.put("authors", new JSONArray(new String[]{"Author Six", "Author Seven"}));
        books.put(newBook);

        // Print JSON
        System.out.println(root.toString(2));
    }

    private static String readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        reader.close();
        return stringBuilder.toString();
    }
}
