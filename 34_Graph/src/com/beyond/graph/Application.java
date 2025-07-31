package com.beyond.graph;

import com.beyond.graph.practice.MatrixGraph;

public class Application {
    public static void main(String[] args) {
        //인접행렬테스트
        MatrixGraph matrixGraph = new MatrixGraph(4);

        matrixGraph.addEdge(0, 1, 30);
        matrixGraph.addEdge(0, 2, 20);
        matrixGraph.addEdge(1, 2, 40);
        matrixGraph.addEdge(2, 3, 50);

        System.out.println(matrixGraph);
    }
}
