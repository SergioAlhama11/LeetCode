package com.sergio.Udemy.Graphs._02_clone_graph;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CloneGraphTest {

    @Test
    public void cloneGraphTest() {
        CloneGraph cloneGraph = new CloneGraph();

        CloneGraph.Node node1 = cloneGraph.new Node();
        node1.val = 1;
        CloneGraph.Node node2 = cloneGraph.new Node();
        node2.val = 2;
        CloneGraph.Node node3 = cloneGraph.new Node();
        node3.val = 3;
        CloneGraph.Node node4 = cloneGraph.new Node();
        node4.val = 4;

        node1.neighbors = List.of(node2, node3);
        node2.neighbors = List.of(node3);
        node3.neighbors = List.of(node4);
        node4.neighbors = List.of(node2);

        CloneGraph.Node clonedNode1 = cloneGraph.cloneGraph(node1);
        CloneGraph.Node clonedNode2 = clonedNode1.neighbors.get(0);
        CloneGraph.Node clonedNode3 = clonedNode1.neighbors.get(1);
        CloneGraph.Node clonedNode4 = clonedNode3.neighbors.get(0);

        assertEquals(1, clonedNode1.val);
        assertNotEquals(node1, clonedNode1);
        assertEquals(2, clonedNode2.val);
        assertNotEquals(node2, clonedNode2);
        assertEquals(3, clonedNode3.val);
        assertNotEquals(node3, clonedNode3);
        assertEquals(4, clonedNode4.val);
        assertNotEquals(node4, clonedNode4);
    }
}
