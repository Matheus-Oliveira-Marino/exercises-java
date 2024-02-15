package exercises;

public class Ex2 
{
    public static int soma(int x, int y)
    {
        if(x==0) return y;
        if(y==0) return x;

        if(Ex1.ehNegativo(y)) return soma(--x,++y);
        return soma(++x,--y);
    }   
}
