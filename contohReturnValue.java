public class contohReturnValue {
    public static void sebutkanNama(){
        System.out.println("Nama Saya Rio Saputra");
    }

    public static int kembalikanAngka(){
        return 20;
    }

    public static void main(String[] args) {
        sebutkanNama();
        System.out.println(kembalikanAngka());
    }
}