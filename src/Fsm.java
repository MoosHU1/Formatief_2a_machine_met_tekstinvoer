import java.util.ArrayList;

public class Fsm {

    private ArrayList<Node>nodes;
    private Node currentNode;
    private ArrayList<Node> goneThrough;

    public Fsm(ArrayList<Node> al){
        nodes = al;
        currentNode = nodes.get(0);

    }



    public void run(String input) {
        System.out.println(currentNode.getNaam());
        for (int index = 0; index < input.length(); index++) {
            char letter = input.charAt(index);
            if (letter == 'A') {
                currentNode = currentNode.getNodeA();

            }
            if (letter == 'B'){
                currentNode = currentNode.getNodeB();

            }
            System.out.println(currentNode.getNaam());


        }

    }



}
