package randd.c4;

import java.util.HashSet;
import java.util.Set;

import common.DirectedAcyclicGraph;
import common.DirectedAcyclicGraph.Node;

public class IsDagRoute {

	public static void main(String[] args) {
		DirectedAcyclicGraph dag = new DirectedAcyclicGraph();
		DirectedAcyclicGraph.Node n1 = dag.new Node(1) ;
		DirectedAcyclicGraph.Node n2 = dag.new Node(2) ;
		DirectedAcyclicGraph.Node n3 = dag.new Node(3) ;
		DirectedAcyclicGraph.Node n4 = dag.new Node(4) ;
		
		dag.setEdge(n1, n2);
		dag.setEdge(n2, n3);
		dag.setEdge(n3, n4);
		dag.setEdge(n2, n4);

		Set<Node> visited = new HashSet<Node>() ;
		System.out.println(isDagRoute(n1, n4, visited));

		DirectedAcyclicGraph dag2 = new DirectedAcyclicGraph();
		DirectedAcyclicGraph.Node n11 = dag.new Node(11) ;
		DirectedAcyclicGraph.Node n12 = dag.new Node(12) ;
		DirectedAcyclicGraph.Node n13 = dag.new Node(13) ;
		DirectedAcyclicGraph.Node n14 = dag.new Node(14) ;

		dag2.setEdge(n11, n12);
		dag2.setEdge(n12, n13);
		dag2.setEdge(n14, n13);
		Set<Node> visited2 = new HashSet<Node>() ;
		System.out.println(isDagRoute(n11, n14, visited2));

		
		
	}

	private static Boolean isDagRoute( Node n1, Node n4, Set<Node> visited) {
		// TODO Auto-generated method stub
		
		if (n1 == n4) {
			return true;
		} 
		if (n1 == null || n4 == null) {
			return false;
		}
		visited.add(n1);
		
		
		for (Node n: n1.outboundEdges ) {
			if (visited.contains(n)) {
				return false;
			} else {
				if (isDagRoute(n, n4, visited)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
}
