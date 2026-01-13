package com.sergio.Udemy.Graphs._00_graph_search;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public static boolean breadthFirstSearch(Graph graph, String target) {
        for (GraphNode node : graph.nodes.values()) {
            if (node.status != GraphNodeStatus.Visited) {
                if (singleBFSHelper(node, target)) return true;
            }
        }
        return false;
    }

    private static boolean singleBFSHelper(GraphNode node, String target) {
        Queue<GraphNode> queue = new LinkedList<>();
        node.status = GraphNodeStatus.Visited;
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.remove();

            if (currentNode.value.equals(target)) return true;

            for (GraphNode adj : currentNode.adjacents.values()) {
                if (adj.status != GraphNodeStatus.Visited) {
                    adj.status = GraphNodeStatus.Visited;
                    queue.add(adj);
                }
            }
        }
        return false;
    }
}
