import java.util.ArrayList;

public class Hanoi {

    public static void resoudreAux(int n, int i, int j){
        int k=6-i-j;
        int a=0;
        if (n==1){
            System.out.println(i + " vers " + j);
        }
        else{
            resoudreAux(n-1,i,k);
            resoudreAux(1,i,j);
            resoudreAux(n-1,k,j);
        }
    }

    public static void resoudre (int n){
        resoudreAux(n,1,3);
    }

    //Un+1 = Un + 2^n
    //Un = 2^n -1
    //question bonus : il faut rajouter un cas de base pour n==0 et afficher " ".

    public static int calcule(int n){
        int a=resoudre(n);
        return a;
    }

    public static void main(String[] args) {
        calcule(3);
    }
}
