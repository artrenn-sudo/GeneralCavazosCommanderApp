package com.cavazos;

import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class JSONFile {

  // Read a JSON file from classpath and return an array
  public static JSONArray readArray(String fileName) {
    JSONParser jsonParser = new JSONParser();
    JSONArray data = null;

    InputStream is = JSONFile.class.getClassLoader().getResourceAsStream(fileName);
    if (is == null) {
      System.err.println("File not found: " + fileName);
      return data;
    }

    try (InputStreamReader reader = new InputStreamReader(is)) {
      Object obj = jsonParser.parse(reader);
      data = (JSONArray) obj;
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ParseException e) {
      e.printStackTrace();
    }

    return data;
  }
}
