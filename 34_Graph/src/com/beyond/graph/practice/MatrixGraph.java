package com.beyond.graph.practice;

import java.util.Arrays;

public class MatrixGraph {
    //꼭짓점의 개수
    private final int numOfVertices;

    //인접 행렬로 사용될 2차원 배열
    private final int[][] matrix;

    //꼭짓점의 개수가 n이라면 n*n 형태의 2차원 배열이 인접 행렬로 사용된다
    public MatrixGraph(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        this.matrix = new int[this.numOfVertices][this.numOfVertices];
    }

    public void addEdge(int src, int dest, int weight) {
        //행이 시작 꼭짓점
        //열이 시작 꼭짓점
        this.matrix[src][dest] = weight;

        //무방향 그래프일 경우
//        this.matrix[dest][src] = weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<this.matrix.length; i++) {
            for(int j=0; j<this.matrix[i].length; j++) {
                if(this.matrix[i][j] <= 0) {
                    continue;
                }
                sb.append(String.format("Vertex %d -> Vertax %d (weight: %d)\n", i, j, this.matrix[i][j]));

            }
        }
        return sb.toString();
    }
}
