package common;


import java.util.HashSet;
import java.util.Set;

public class DirectedAcyclicGraph {

	public void setEdge(Node a, Node b) {
		
		b.inboundEdges.add( a);
		a.outboundEdges.add( b);
		
	}	
	
	public class Node {
		Integer id;
		public Set<Node> outboundEdges ;
		public Set<Node> inboundEdges  ;
		
		public Node(Integer id) {
			this.id = id;
			outboundEdges = new HashSet<Node>();
			inboundEdges = new HashSet<Node>();
		}
		

		
		
		
	}
	
}
