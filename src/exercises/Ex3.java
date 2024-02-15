package exercises;

public class Ex3 
{
    public static int subtracao(int x, int y)
    {
        if(y==0) return x;

        if(Ex1.ehNegativo(y)) return subtracao(++x,++y);
        return subtracao(--x,--y);
    }    
}
