package w10;

public class StackSurat06{
    Surat06[] stack;
    int top;

    public StackSurat06(int size){
        stack=new Surat06[size];
        top=-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == stack.length-1;
    }
    public void push(Surat06 srt){
        if(!isFull()){
            stack[++top]=srt;
            System.out.println("surat berhasil ditambahkan");
        }else{
            System.out.println("stack surat penuh");
        }
    }
    public Surat06 pop(){
        if(!isEmpty()){
            return stack[top--];
        }else{
            System.out.println("tidak ada surat untuk diproses.");
            return null;
        }
    }
    public Surat06 peek(){
        if(!isEmpty()){
            return stack[top];
        }else{
            System.out.println("tidak ada surat di stack.");
            return null;
        }
    }
    public void cariSurat(String nama){
        boolean ditemukan=false;
        for (int i=0;i<=top;i++){
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)){
                System.out.println("surat ditemukan:");
                stack[i].tampil();
                ditemukan=true;
            }
        }
        if(!ditemukan){
            System.out.println("tidak ditemukan surat dengan nama: "+nama);
        }
    }
}
