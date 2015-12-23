/**
 * Created by yasminegutierrez on 8/30/15.
 */
public class Stack<K> {

    private Node top;


    public Stack(){

    }

    public void push(K newElement){

        if(top == null)
            top = new Node(newElement,null);
        else{
            top = new Node(newElement,top);
        }
    }


    public Node pop(){

        if(top!=null){
            Node aux = top;
            top = top.getNext();
            return aux;
        }else return null;

    }

    public void printStack(){

        Node node = null;

        if(top!=null)
            node=top;

        while (node!=null){

            System.out.println(node.getValue());
            node = node.getNext();

        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push("hola");
        stack.push("adios");
        stack.push("bonjour");
        stack.push("bye");
        stack.pop();
        stack.printStack();
        stack.pop();


    }

}
