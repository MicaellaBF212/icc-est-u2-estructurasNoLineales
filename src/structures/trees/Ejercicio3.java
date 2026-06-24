package structures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import structures.node.Node;

public class Ejercicio3 {
    public List<List<Node>> listLevels(Node root){
        List<List<Node>> resul = new ArrayList<>();
        if(root == null)
            return resul;
        Queue<Node> cola = new LinkedList<>();
        cola.add(root);

        while(!cola.isEmpty()){
            int size = cola.size();
            List<Node> nivel = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node nodo = cola.poll();
                nivel.add(nodo);
                if(nodo.getLeft()!=null){
                    cola.add(nodo.getLeft());
                }
                if(nodo.getRight()!=null){
                    cola.add(nodo.getRight());
                }
            }
            resul.add(nivel);
        }
        return resul;
    }
    
}
