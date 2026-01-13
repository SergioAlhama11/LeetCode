package com.sergio.Udemy.Graphs._03_build_order;

import com.sergio.Udemy.Graphs._00_graph_search.DepthFirstSearch;
import com.sergio.Udemy.Graphs._00_graph_search.Graph;
import com.sergio.Udemy.Graphs._00_graph_search.GraphNode;
import com.sergio.Udemy.Graphs._00_graph_search.GraphNodeStatus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Dada una lista de proyectos y las dependencias entre ellos, devuelve un orden de
 * compilación válido para dichos proyectos.
 *
 * La lista de dependencias es una lista de pares de strings (a, b), que indican que el
 * proyecto b depende del a (el a debe ser compilado con antelación).
 *
 * Ejemplo 1:
 *  Input:
 *    projects: a, b, c, d
 *    dependencies: [(a, b), (a, c), (a, d), (c, b), (d, b), (d, c)]
 *  Output: a, d, c, b
 *
 * Ejemplo2:
 *  Input:
 *    projects: a, b, c, d
 *    dependencies: [(a, b), (b, c), (c, d), (d, a)]
 *  Output: Lanza excepción. No se puede construir ya que se forma un ciclo.
 *
 */
public class BuildOrder {

  public List<String> buildOrder(String[] projects, String[][] dependencies) {
    Graph graph = buildDependencyGraph(projects, dependencies);

    List<String> sortedProjects = new ArrayList<>();
    for (GraphNode node : graph.nodes.values()) {
      depthFirstSearch(node, sortedProjects);
    }

    Collections.reverse(sortedProjects);
    return sortedProjects;
  }

  private void depthFirstSearch(GraphNode node, List<String> sortedProjects) {
    if (node == null) return;

    if (node.status == GraphNodeStatus.Unvisited) {
      node.status = GraphNodeStatus.Visiting;

      for (GraphNode n : node.adjacents.values()) {
        depthFirstSearch(n, sortedProjects);
      }

      node.status = GraphNodeStatus.Visited;
      sortedProjects.add(node.value);
    } else if (node.status == GraphNodeStatus.Visiting) {
      throw new RuntimeException();
    }
  }

  private Graph buildDependencyGraph(String[] projects, String[][] dependencies) {
    Graph graph = new Graph();

    for (String project : projects) {
      graph.getOrCreateNode(project);
    }

    for (String[] dependency : dependencies) {
      graph.addEdge(dependency[0], dependency[1]);
    }

    return graph;
  }
}
