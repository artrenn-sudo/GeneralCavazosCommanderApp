package com.cavazos;

import org.json.simple.*;

public class Cavazos {

  // Print command array
  public static void print(String[] commandArray) {
    System.out.printf("Number\tCommand\n");
    System.out.printf("------\t---------------\n");
    for (int i = 0; i < commandArray.length; i++) {
      System.out.printf("%04d\t%s\n", i, commandArray[i]);
    }
  }

  // Convert JSONArray to String array
  public static String[] getCommandArray(JSONArray commandArray) {
    String[] arr = new String[commandArray.size()];
    for (int i = 0; i < commandArray.size(); i++) {
      arr[i] = commandArray.get(i).toString();
    }
    return arr;
  }
}
