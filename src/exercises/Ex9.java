package exercises;

public class Ex9 
{
    public static boolean ex09(int x, int y)
    {
        if(x == y) return false;

        if(Ex1.ehNegativo(Ex3.subtracao(x,y))) return true;

        return false;
    }
}
