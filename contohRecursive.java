public class contohRecursive {
    public static int factorial(int NilaiFaktorial){
        if(NilaiFaktorial == 0){
            return 1;
        }else {
            return NilaiFaktorial * factorial(NilaiFaktorial -1);
        }
    }
    public static void main(String[] args) {
        int hasil = factorial(5);
        System.out.println("faktorial dari 5 : " + hasil);

    }
}