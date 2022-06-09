package pkgQueue;
public class cQueue {
    cNode front, rear;
    int jumlah;
    
    cQueue(){
        front = rear = null;
        jumlah = 0;
    }
    
    public void enqueue(cNode baru){
        //penambahan data baru selalu dari ujung belakang
        //identik dengan tambah belakang pada linked list
        if (rear==null) {
            rear = front = baru;
        }else{
            rear.next = baru;
            rear = baru;
        }
        System.out.println("Antrean terisi");
    }
    
    public cNode dequeue(){
        cNode temp = front;
        if (temp == null) {
            System.out.println("Antrean kosong");
        }else if(front.next == null){
            front = rear = null;
            temp.next = null;
        }else{
            front = front.next;
            temp.next = null;
        }
        return temp;
    }
    
    public void viewQueue(){
        System.out.print("Isi Antrean -> ");
        for (cNode t = front; t != null; t=t.next) {
            System.out.print(t.getBarang()+", ");
        }
        System.out.println("");
    }
}
