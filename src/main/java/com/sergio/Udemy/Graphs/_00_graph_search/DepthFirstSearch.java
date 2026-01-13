package com.sergio.Udemy.Graphs._00_graph_search;

public class DepthFirstSearch {
    public static boolean depthFirstSearch(Graph graph, String target) {
        for (GraphNode node : graph.nodes.values()) {
            if (node.status != GraphNodeStatus.Visited) {
                if (recursiveDFSHelper(node, target)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean recursiveDFSHelper(GraphNode currentNode, String target) {
        if (currentNode.value.equals(target)) return true;

        currentNode.status = GraphNodeStatus.Visited;

        for (GraphNode node : currentNode.adjacents.values()) {
            if ((node.status != GraphNodeStatus.Visited) && (recursiveDFSHelper(node, target))) return true;
        }
        return false;
    }
}
