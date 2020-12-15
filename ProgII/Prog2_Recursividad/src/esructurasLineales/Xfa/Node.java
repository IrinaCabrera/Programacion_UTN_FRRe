package esructurasLineales.Xfa;

public class Node {
    int dataNode;
    Node nextNode;

    public Node(int dataNode, Node nextNode) {
        this.dataNode = dataNode;
        this.nextNode = nextNode;
    }

    public Node(int dataNode) {
        this.dataNode = dataNode;
    }

    public int getDataNode() {
        return dataNode;
    }

    public void setDataNode(int dataNode) {
        this.dataNode = dataNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
