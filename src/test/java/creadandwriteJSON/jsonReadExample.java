package creadandwriteJSON;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;

public class jsonReadExample {

    public static void main(String[] args) {

        //Use GSON to read the json file
        // Path to your JSON file
        String filePath = "dummyJSON.json";

        try (FileReader reader = new FileReader(filePath)) {
            // Parse the JSON file using Gson's JsonParser
            //return type is JsonObject
            //mention getAsJsonObject
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();

            // Get data from the JSON object
            //mention getAsString
            String name = jsonObject.get("name").getAsString();
            int age = jsonObject.get("age").getAsInt();
            JsonArray city = jsonObject.get("cars").getAsJsonArray();

            // Print the retrieved data
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);

        } catch (IOException e) {
            e.printStackTrace();
        }



    }


}
