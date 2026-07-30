import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Main {

    static Node root = null;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int data = s.nextInt();
            root = insert(root, data);
        }

        bfs(root);
        s.close();
    }

    public static void bfs(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node x = q.poll();
            System.out.print(x.data + " ");

            if (x.left != null)
                q.offer(x.left);

            if (x.right != null)
                q.offer(x.right);
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }
}