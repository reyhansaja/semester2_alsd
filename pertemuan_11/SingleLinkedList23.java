public class SingleLinkedList23 {
    Node23 head;
    Node23 tail;

    boolean isEmpty(){
        return(head == null);
    }
    public void print(){
        if(!isEmpty()){
            Node23 tmp = head;
            System.out.println("Isi Linked List: \t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }
    }
    public void addFirst(Mahasiswa23 input){
        Node23 ndInput = new Node23(input, null);
        if (!isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(Mahasiswa23 input){
        Node23 ndInput = new Node23(input, null);
        if (!isEmpty()) {
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            tail = ndInput;
        }
    }
    public void insertAfter(String key, Mahasiswa23 input){
        Node23 ndInput = new Node23(input, null);
        Node23 temp = head;
        do{
            if(temp.data.nama.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null){
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
    public void insertAt(int index, Mahasiswa23 input){
        if (index < 0) {
            System.out.println("Index Salah");
        } else if (index == 0){
            addFirst(input);
        } else {
            Node23 temp = head;
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new Node23(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
