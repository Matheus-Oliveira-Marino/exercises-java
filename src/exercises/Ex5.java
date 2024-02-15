package exercises;

public class Ex5 {
    public static int multiplicacao(int x, int y) // x = 2, y = 3
    {
        if(x == 0) return 0;
        if(y == 1) return x;

        if(Ex1.ehNegativo(y)) return Ex3.subtracao(0, multiplicacao(x, Ex3.subtracao(0, y)));
        return Ex2.soma(x, multiplicacao(x,--y));
    }
}
