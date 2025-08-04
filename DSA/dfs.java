import java.util.*;

class dfs_dsa{

    ArrayList<ArrayList<Integer>> as = new ArrayList<>();

    dfs_dsa(int n){
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

    public void dfs(int n){
        Stack<Integer> q = new Stack<>();
        boolean[] visited = new boolean[as.size()];
        q.push(n);
        visited[n] = true;

        while(q.size()!=0){
            int s = q.pop();
            System.out.print(s + " ");
            for(int i=0;i<as.get(s).size();i++){
                int v = as.get(s).get(i);
                if(!visited[v]){
                    visited[v] = true;
                    q.push(v);
                }
            }
        }
    }
}

public class dfs{
    public static void main(String[] vk){
        dfs_dsa g = new dfs_dsa(5);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);

        g.dfs(0);
        g.display();

    }
}