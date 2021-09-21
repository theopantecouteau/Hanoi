public class Hanoi {

    public static int resoudreAux(int n, int i, int j){
        int k=6-i-j;
        int x,y;
        if (n==1){
            System.out.println(i + " vers " + j);
            return 1;
        }
        else{
            x = resoudreAux(n-1,i,k);
            resoudreAux(1,i,j);
            y = resoudreAux(n-1,k,j);
        }
        return x+y+1;
    }

    public static void resoudre (int n){
        resoudreAux(n,1,3);
    }

    //Un+1 = Un + 2^n
    //Un = 2^n -1
    //question bonus : il faut rajouter un cas de base pour n==0 et afficher " ".

    public static int calcule(int n){
        int a=resoudreAux(n,1,3);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(calcule(3));
    }
}
