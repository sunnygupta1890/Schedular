package com.xyz.graph;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    String[] tasks = {"a", "b", "c"};
    Graph graph = new Graph(tasks);
    // This mean b should be executed before a.
    // a => b should be translated to graph.addEdge("b", "a").
    // a is the task that is dependent on b.
    graph.addEdge("b", "a");
    graph.addEdge("c", "b");
    graph.addEdge("c", "a");
    if (!graph.isCyclic()) {
      List<String> list = graph.findDependencyOrder();
      for (String task : list) {
        System.out.print(task);
        System.out.print(",");
      }
    } else {
      System.out.println("Error - this is a cyclic dependency");
    }
  }
}
