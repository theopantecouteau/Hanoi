public class Baguenaudier {

    public static void main(String[] args) {
        remplir(3);
    }

    static void remplir (int n){
        if (n>0) {
            remplir(n - 1);
            vider(n - 2);
            System.out.println(n - 1);
            remplir(n - 2);
        }

    }

    static void vider (int n){
        if (n>0) {
            vider(n - 2);
            System.out.println(n - 1);
            remplir(n - 2);
            vider(n - 1);
        }
    }

}
