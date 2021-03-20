import java.util.ArrayList;
//class to store edges of graph
class Edges{
    int strVertex;
    int endVertex;
    public Edges(int start,int end){
        this.strVertex = start;
        this.endVertex= end;
    }
}

public class Matrix{

     public static void main(String []args){
        int vert= 5;
        
        int[][] matrix = new int[vert+1][vert+1];
        ArrayList<Edge> edgeList = new ArrayList<Edge>();
        edgeList.add(new Edge(1,2));
        edgeList.add(new Edge(1,3));
        edgeList.add(new Edge(2,5));
        edgeList.add(new Edge(2,3));
        edgeList.add(new Edge(3,4));
        edgeList.add(new Edge(4,5));
        for(int i = 0;i<edgeList.size();i++){
            Edge current = edgeList.get(i);
            int strVertex = current.strVertex;
            int endVertex = current.endVertex;
            matrix[strVertex][endVertex] = 1;
        }
        
        for(int i = 1;i<=vert;i++){
            for(int j = 1;j<=vert;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
     }
}
