package w13;

public class nodeVaksin06 {
    int nomor;
    String nama;
    nodeVaksin06 prev,next;

    nodeVaksin06(nodeVaksin06 prev, int nomor, String nama, nodeVaksin06 next){
        this.prev=prev;
        this.nomor=nomor;
        this.nama=nama;
        this.next=next;
    }
}
