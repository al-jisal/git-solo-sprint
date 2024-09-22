import java.util.ArrayList;
import java.util.Iterator;

public class LinkedList<Integer>{ 
    /**************** inner class for Node *************************/
    private static class Node<Integer>{
        // the fields for the Node class
            Integer data;
            Node<Integer> next;

        // constructor for the Node class if next is not known
        public Node(Integer item){
            data = item;
            next = null;
        }

        //ADDED THIS ONLY ON THE REMOTE REPO
        // constructor for the Node class if next is known 
        public Node(Integer item, Node<Integer> newNext){
            data = item;
            next = newNext;
        }

        
        public Integer getData(){
            return data;
        }


        public void setNext( Node<Integer> n){
            next = n;
        }


        public Node<Integer> getNext(){
            return next;
        }

    }
    /***************************************************************/

}
