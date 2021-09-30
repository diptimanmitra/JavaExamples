import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
/**
 * The Main class implements an application that reads lines from the standard input
 * and prints them to the standard output.
 */
public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    //InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(new FileReader("src/input.txt"));
    List<String> list = new ArrayList<>();
    ArrayList<ArrayList<String>> inputList = new ArrayList<ArrayList<String>>();
    list = in.lines().collect(Collectors.toList());
    for(String l1 : list)
      inputList.add(new ArrayList<String>(Arrays.asList(l1.split(" "))));
    
    ArrayList<ArrayList<Integer>> adjList = creatFinalList(inputList);
    printArrayList(adjList);
  }
  
      // Function to create Adjacency List
    static ArrayList<ArrayList<Integer>>  creatFinalList(ArrayList<ArrayList<String>> inputList)
    {
      ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(inputList.size());
      // Create a new list for each
      // vertex such that adjacent
      // nodes can be stored
      for (int i = 0; i < inputList.size(); i++) {
    	  adjList.add(new ArrayList<Integer>());
      }  
      // Print the adjacency list
        for (int i = 0; i < inputList.size(); i++) {
          for (int j = 0; j < inputList.get(i).size(); j++) {
                if (inputList.get(i).get(j).equals("1")) {
                	adjList.get(i).add(j);
                  //System.out.println(finalArray);
                }
            }
        }
      return adjList;
    }
  
   
    // Function to print the adjacency list
    static void printArrayList(ArrayList<ArrayList<Integer>> adjList)
    {
        // Print the adjacency list
        for (int v = 0; v < adjList.size(); v++) {
            System.out.print(v);
            for (Integer u : adjList.get(v)) {
                System.out.print(" " + u);
            }
            System.out.println();
        }
    }
}
