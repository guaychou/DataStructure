/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinchou
 */
class Node {

    String data;
    Node nodeKiri;
    Node nodeKanan;

    public Node(String dt) {
        data = dt;
        nodeKiri = nodeKanan = null;
    }

    public void sisipDt(String data) {
        if (data instanceof String) {
            String dtSisip = data.toString();
            if (this.data.compareTo(dtSisip) > 0) {
                if (nodeKiri == null) {
                    nodeKiri = new Node(dtSisip);

                } else {
                    nodeKiri.sisipDt(dtSisip);

                }
            } else if (this.data.toString().compareTo(dtSisip) < 0) {
                if (nodeKanan == null) {
                    nodeKanan = new Node(dtSisip);

                } else {
                    nodeKanan.sisipDt(dtSisip);

                }
            }
        }
    }
}

public class Tree {

    private Node root;

    public Tree() {
        root = null;
    }

    public void sisipDtNode(String dtSisip) {
        if (root == null) {
            root = new Node(dtSisip);
        } else {
            root.sisipDt(dtSisip);
        }
    }
    
    private void cetakAZtransversal(Node node) {
        if (node == null) {
            return;
        }
        cetakAZtransversal(node.nodeKiri);
        System.out.print(node.data + " ->");
        cetakAZtransversal(node.nodeKanan);
    }
    
    public void cetakAZ() {
        cetakAZtransversal(root);
    }
private void cetakZAtransversal(Node node){
    if (node == null) {
            return;
        }
        cetakZAtransversal(node.nodeKanan);
        System.out.print(node.data + " ->");
        cetakZAtransversal(node.nodeKiri);
}
    public void cetakZA(){
    cetakZAtransversal(root);
        }
}
    class main {

        public static void main(String args[]) {
            Tree Tree1 = new Tree();
            Tree1.sisipDtNode("Victor S Arseid");
            Tree1.sisipDtNode("Cecil Neues");
            Tree1.sisipDtNode("Arianrhod");
            Tree1.sisipDtNode("Estelle Bright");
            Tree1.sisipDtNode("Joshua Astray");
            Tree1.sisipDtNode("Cassius Bright");
            Tree1.sisipDtNode("Rean Schwarzer");
                        
            System.out.println("\n\nA->Z");
          Tree1.cetakAZ();
         System.out.println("\n\nZ->A");
       Tree1.cetakZA();
       
            System.out.println("");
        }
    }
