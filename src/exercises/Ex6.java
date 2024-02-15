package exercises;

public class Ex6 
{
    public static int potenciacao(int x, int y) throws Exception
    {
        if(y == 0) return 1;
        if(x == 1) return x;
        if(x == 0) return 1;

        if(Ex1.ehNegativo(y)) throw new Exception("Erro, restrição de divisão de números inteiros");

        return Ex5.multiplicacao(x, potenciacao(x,--y));
    }
}
