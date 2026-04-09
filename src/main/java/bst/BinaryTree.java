package bst;

public class BinaryTree<E extends Comparable<E>> {
    private Node<E> root;

    public BinaryTree() {
        root = null;
    }

    public void insert(E value) {
        root = insertRec(root, value);
    }

    private Node<E> insertRec(Node<E> current, E value) {
        if (current == null) {
            return new Node<>(value);
        }

        if (value.compareTo(current.data) < 0) {
            current.left = insertRec(current.left, value);
        } else {
            current.right = insertRec(current.right, value);
        }

        return current;
    }

    public E search(E value) {
        return searchRec(root, value);
    }

    private E searchRec(Node<E> current, E value) {
        if (current == null) return null;

        if (value.compareTo(current.data) == 0) {
            return current.data;
        }

        if (value.compareTo(current.data) < 0) {
            return searchRec(current.left, value);
        } else {
            return searchRec(current.right, value);
        }
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node<E> current) {
        if (current != null) {
            inOrderRec(current.left);
            System.out.print(current.data);
            inOrderRec(current.right);
        }
    }
}
