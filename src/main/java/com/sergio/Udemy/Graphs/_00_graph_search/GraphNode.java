package com.sergio.Udemy.Graphs._00_graph_search;

import java.util.HashMap;

public class GraphNode {
    public String value;
    public GraphNodeStatus status;
    public HashMap<String, GraphNode> adjacents;

    public GraphNode(String value) {
        this.value = value;
        this.adjacents = new HashMap<>();
        this.status = GraphNodeStatus.Unvisited;
    }

    public GraphNode(String value, HashMap<String, GraphNode> adjacents) {
        this.value = value;
        this.adjacents = adjacents;
    }

    public void addNeighbor(GraphNode node) {
        if (!adjacents.containsKey(node.value)) {
            adjacents.put(node.value, node);
        }
    }
}
