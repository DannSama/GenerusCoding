class Node {
    public Passenger data;
    public Node left;
    public Node right;

    public Node(Passenger data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(Passenger data) {
        root = insert(root, data);
    }

    private Node insert(Node node, Passenger data) {
        if (node == null) {
            node = new Node(data);
        }
        else {
            if (data.getName().compareTo(node.data.getName()) <= 0) {
                node.left = insert(node.left, data);
            }
            else {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }

    public Passenger search(String name) {
        return search(root, name);
    }

    private Passenger search(Node node, String name) {
        if (node == null) {
            return null;
        }
        if (name.equals(node.data.getName())) {
            return node.data;
        }
        if (name.compareTo(node.data.getName()) < 0) {
            return search(node.left, name);
        }
        else {
            return search(node.right, name);
        }
    }
}
