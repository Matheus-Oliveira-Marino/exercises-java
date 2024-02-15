package exercises;

public class Ex11 
{
    public static boolean ex11(int x, int y)
    {
        if(x == y) return false;

        if(!Ex1.ehNegativo(Ex3.subtracao(x,y))) return true;
        return false;
    }
}
