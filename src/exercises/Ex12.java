package exercises;

public class Ex12 {

    public static boolean ex12(int x, int y)
    {
        if(x == y) return true;

        if(!Ex1.ehNegativo(Ex3.subtracao(x,y))) return true;
        return false;
    }
}
