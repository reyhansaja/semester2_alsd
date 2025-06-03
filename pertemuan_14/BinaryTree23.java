public class BinaryTree23 {
    Node23 root;

    public BinaryTree23(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add (Mahasiswa23 mahasiswa){
        Node23 newNode = new Node23(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        }else{
            Node23 current = root;
            Node23 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk){
                    current = current.left;
                    if(current == null){
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
}
