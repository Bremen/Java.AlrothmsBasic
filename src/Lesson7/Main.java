package Lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph= new Graph(18);
        graph.addEdge(0,2);//            0 m adjacent: 2+ 4+ 14+
        graph.addEdge(0,4);//            1 m adjacent: 5+ 4+
        graph.addEdge(0,14);//           2 m adjacent: 0+ 3+ 6+ 5+
        graph.addEdge(2,3);//            3 m adjacent: 2+ 10+ 6+
        graph.addEdge(2,6);//            4 m adjacent: 0+ 1+ 5+ 8+ 7+
        graph.addEdge(2,5);//            5 m adjacent: 2+ 6+ 8+ 4+ 1+
        graph.addEdge(4,1);//            6 m adjacent: 2+ 3+ 9+ 5+
        graph.addEdge(4,5);//            7 m adjacent: 4+ 8+ 11+
        graph.addEdge(4,8);//            8 m adjacent: 5+ 12+ 7+ 4+
        graph.addEdge(4,7);//            9 m adjacent: 6+ 10+ 12+
        graph.addEdge(14,15);//         10 m adjacent: 3+ 9+
        graph.addEdge(3,10);//          11 m adjacent: 7+ 15+
        graph.addEdge(3,6);//           12 m adjacent: 8+ 9+ 15+
        graph.addEdge(6,5);//           13 m adjacent:
        graph.addEdge(6,9);//           14 m adjacent: 0+ 15+
        graph.addEdge(5,8);//           15 m adjacent: 14+ 16+ 12+ 11+ 17+
        graph.addEdge(5,1);//           16 m  adjacent: 15+
        graph.addEdge(8,12);//          17 m  adjacent: 15+
        graph.addEdge(8,7);//
        graph.addEdge(7,11);//
        graph.addEdge(15,16);//
        graph.addEdge(15,12);//
        graph.addEdge(15,11);//
        graph.addEdge(15,17);//
        graph.addEdge(10,9);//
        graph.addEdge(9,12);//

        //queue:
        //passed: 0 2 4 14 3 6 5 1 8 7 15 10 9 12 11 16 17 13

//        System.out.println(graph.getAdjList(1));
//        DepthFirstPaths dfp = new DepthFirstPaths(graph,2);

        int vertex_start = 15;
        int vertex_finish = 8;

        BreadthFirstPaths bfp = new BreadthFirstPaths(graph,vertex_start);

        System.out.println(bfp.hasPathTo(vertex_finish));
        System.out.println(bfp.pathTo   (vertex_finish));
        System.out.println(bfp.distTo   (vertex_finish));

    }
}
