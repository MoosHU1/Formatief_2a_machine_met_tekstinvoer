import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        //Verbindingen
        s0.setNodeA(s2);
        s0.setNodeB(s1);

        s1.setNodeB(s2);
        s1.setNodeA(s1);

        s2.setNodeB(s3);

        s3.setNodeB(s0);
        s3.setNodeA(s3);

        ArrayList<Node> nodes = new ArrayList<Node>();
        nodes.add(s0);
        nodes.add(s1);
        nodes.add(s2);
        nodes.add(s3);



        Fsm Fsm1 = new Fsm(nodes);
        String input = "BAAB";
        Fsm1.run(input);



    }




}





