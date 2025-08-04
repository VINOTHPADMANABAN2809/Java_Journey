import java.util.*;

class bfs_dsa{

    ArrayList<ArrayList<Integer>> as = new ArrayList<>();

    bfs_dsa(int n){
        for(int i=0;i<n;i++){
            as.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int u, int v){
        
            as.get(u).add(v);
            as.get(v).add(u);
    }
    public void display(){
        System.out.println();
        for(int i=0;i<as.size();i++){
            System.out.println("Vertex " + i + " is connected to: ");
            for(int j=0;j<as.get(i).size();j++){
                System.out.print(as.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    public void bfs(int n){
       Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[as.size()];
        q.add(n);
        visited[n] = true;
        

        while(q.size()!=0){
            int s = q.remove();
            System.out.print(s + " ");
            for(int i=0;i<as.get(s).size();i++){
                int v = as.get(s).get(i);
                if(!visited[v]){
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }
}

public class bfs{
    public static void main(String[] vk){
        bfs_dsa g = new bfs_dsa(5);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);

        g.bfs(0);
        g.display();

    }
}