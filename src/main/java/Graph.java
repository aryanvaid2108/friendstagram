import java.util.*;



class Edge
{
	public User v;
	public Edge(User vertex){ v=vertex;}
}
class Graph
{
	Map<User, List<Edge> > G;
        ArrayList<User> verticesList = new ArrayList<>(); 
        
	Graph(){
            G=new HashMap<User, List<Edge> >();
	}
        
        void addVertex(User newUser){
            verticesList.add(newUser);
        }
                
	void addEdge(User u,User v)
	{
		if(!G.containsKey(u))
			G.put(u, new LinkedList<Edge>() );
		G.get(u).add(0, new Edge(v));
	}
      
	void display()
	{
		for(User vertex: G.keySet())
		{
			System.out.print(vertex.getUsername()+"=>");
			for(Edge iterator: G.get(vertex))
				System.out.print(iterator.v.getUsername()+"=>");
			System.out.println();
		}
	}
}

//public class GraphAdjacencyList {
//	public static void main(String[] args) {
//		GraphList<String,Integer> g=new GraphList<>();
//		g.addEdge("Delhi", "Kolkata");
//		g.addEdge("Delhi", "Channai");
//		g.addEdge("Kolkata", "Delhi");
//		g.display();
//	}
//}



//class Graph
//   {
//   private final int MAX_VERTS = 30;
//   private final int INFINITY = 1000000;
//   ArrayList<User> usersList = new ArrayList<>();
//   private int adjMat[][];      // adjacency matrix
//   private int nVerts;          // current number of vertices
//   private int currentVert;
//   private int nTree;           // number of verts in tree
//   List<User> adjacencyList[];
//
//// -------------------------------------------------------------
//   //Constructor
//   public Graph(){
////      vertexList = new Vertex[MAX_VERTS];
//      nVerts = 0;
//      adjacencyList = new LinkedList[MAX_VERTS];
//        for(int i=0;i<adjacencyList.length;i++){
//            adjacencyList[i] = new LinkedList<User>();
//      }   
//    }  
//// -------------------------------------------------------------
//   public void addNewUser(User newUser){
//       usersList.add(newUser);
//   }
//   
//   public void addUserFriend(User currentUser,User newFriend){
//       adjacencyList[currentUser].add(0,newFriend);
//   }
//   
//
//// -------------------------------------------------------------
////   public void displayVertex(int v)
////      {
////      System.out.print(vertexList[v].label);
////      }
//}