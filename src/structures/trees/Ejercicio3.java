package structures.trees;

import java.util.List;

import structures.node.Node;

public class Ejercicio3 {
    public void insert(int[] numeros){
        // Crear el arbol de enteros
        BinaryTree<Integer> tree = new BinaryTree<>();
        //Insertar cada numero 
        for (int numero : numeros) {
            tree.add(numero);
        }
        //Imprimir el Arbol
        ;
    }
    public List<List<Node>> listLevels(Node root){
        
    }
}
