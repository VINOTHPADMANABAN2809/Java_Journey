package bfs_questions;

import java.util.*;
class bfs_1{
    ArrayList<ArrayList<Integer>> as = new ArrayList<>();

    bfs_1(int n){
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
            // System.out.println("Vertex " + i + " is connected to: ");
            for(int j=0;j<as.get(i).size();j++){
                System.out.print(as.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
    public boolean bfs(int n, int destination){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[as.size()];
        q.add(n);
        visited[n] = true;
        
        while(q.size() != 0){
            int s = q.remove();
            if(s == destination) return true;
            for(int v : as.get(s)){
                if(!visited[v]){
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
        return false; 
    }

}

class city_navigation_system{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int source = sc.nextInt();
        int destination = sc.nextInt();
        bfs_1 g = new bfs_1(n+1);
        for(int i=0;i<n;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdge(u,v);
        }
        if(g.bfs(n,destination)) System.out.println("Path Exist");
        else System.out.println("Path does not exist");
        sc.close();
    }
}