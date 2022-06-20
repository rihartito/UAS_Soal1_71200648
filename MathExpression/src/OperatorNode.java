public abstract class OperatorNode extends Node {
    private Node kiri;
    private Node kanan;

    public OperatorNode(Node kiri, Node kanan) {
        this.kiri = kiri;
        this.kanan = kanan;
    }

    public Node getKiri() {
        return kiri;
    }

    public Node getKanan() {
        return kanan;
    }

    @Override
    public abstract double hitung();
}
