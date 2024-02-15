package exercises;

public class Ex10 
{
    public static boolean ex10(int x, int y)
    {
        if(x == y) return true;

        if(Ex1.ehNegativo(Ex3.subtracao(x,y))) return true;
        return false;
    }
}
