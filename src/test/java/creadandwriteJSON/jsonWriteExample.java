package creadandwriteJSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class jsonWriteExample {

   public static void main(String[] args) throws IOException {

        JSONObject jsonObjToWrite = new JSONObject();//Create object using JSONObject
        jsonObjToWrite.put("name","kirupaagar");
        jsonObjToWrite.put("age",30);

        //Add Array values using JSONArray
        JSONArray valueArray = new JSONArray();
        valueArray.add("ferrari");
        valueArray.add("bmw");

        //Add array to json using put method
        jsonObjToWrite.put("cars",valueArray);

        //write it in new file
       FileWriter writeJSONinFIle = new FileWriter("dummyJSON.json");
       writeJSONinFIle.write(jsonObjToWrite.toJSONString()); // write method args accept string , so add toJSONString()
       writeJSONinFIle.close();


    }




}
