import java.util.function.BinaryOperator;

import models.Persona;
import structures.node.Node;
import structures.trees.BinaryTree;
import structures.trees.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
        runBinaryTree();
    }

    private static void runBinaryTree() {
        BinaryTree<String> arbolStrings = new BinaryTree<>();
        BinaryTree<Persona> arbolPersonas = new BinaryTree<>();
        arbolPersonas.add(new Persona("Pablo", 30));
        arbolPersonas.add(new Persona("Ana", 25));
        arbolPersonas.add(new Persona("Luis", 35));
        arbolPersonas.add(new Persona("Maria", 28));
        
    }

    private static void runIntTree() {
        IntTree arbolNumeros = new IntTree();
        arbolNumeros.add(50);
        arbolNumeros.add(10);
        arbolNumeros.add(30);
        arbolNumeros.add(60);
        arbolNumeros.add(70);
        arbolNumeros.add(55);

        System.out.println("-----Preorden-----");
        arbolNumeros.preOrden();
        System.out.println();
        System.out.println("-----PosOrden-----");
        arbolNumeros.posOrden();
        System.out.println();
        System.out.println("-----InOrden-----");
        arbolNumeros.inOrden();

        // Node<Integer> node1 = new Node(50);
        // Node<Integer> node2 = new Node(10);
        // Node<Integer> node3 = new Node(30);

        // //Raiz del arbol sea node1
        // arbolNumeros.setRoot(node1);
        // node1.setRight(node2);
        // node2.setLeft(node3);

        // System.out.println(arbolNumeros.getRoot());
        // System.out.println(arbolNumeros.getRoot().getLeft().getRight());



    }

}