# Dijkstras-Algorithm
You have to set up your graph by adding all the edges between the vertices. You should just be able to use this code (You don't really need to use setLabel either):
    Graph g = new Graph(10);
		g.setLabel(0, one);g.addEdge(0, 1); g.addEdge(0, 2);
		g.setLabel(1, two);g.addEdge(1, 5); g.addEdge(1, 6); g.addEdge(1, 0);
		g.setLabel(2, three);g.addEdge(2, 3);g.addEdge(2, 0);
		g.setLabel(3, four);g.addEdge(3, 2); g.addEdge(3, 7); g.addEdge(3, 5); g.addEdge(3, 4);
		g.setLabel(4, five);g.addEdge(4, 3);
		g.setLabel(5, six);g.addEdge(5, 1); g.addEdge(5, 9); g.addEdge(5, 8); g.addEdge(5, 7); g.addEdge(5, 3);
		g.setLabel(6, seven);g.addEdge(6, 1); g.addEdge(6, 9);
		g.setLabel(7, eight);g.addEdge(7, 3); g.addEdge(7, 5);
		g.setLabel(8, nine);g.addEdge(8, 5);
		g.setLabel(9, ten);g.addEdge(9, 5); g.addEdge(9, 6);
    
    Then you can just use Dijkstra.shortestPath(g, s) where s is the source vertex and it will return an array with all the distances.
