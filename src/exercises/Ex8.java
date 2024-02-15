package exercises;

public class Ex8 
{
    public static int divisaoInteiraComResto(int x, int y) throws Exception
    {
        if(y == 0) throw new Exception("Não existe divisão por 0");
        if(x == 0) return 0;
        if(y == 1) throw new Exception("Erro, denominador 1 não possui resto 0");
        if(x == 1) return 1;
        if(x == 2) return 2;
        if(x == 3) return 3;
        if(x == 4) return 4;
        if(x == 5) return 5;
        if(x == 6) return 6;



        if(divisaoInteiraComResto(Ex3.subtracao(x, y), y) == 0) throw new Exception("Erro, resto 0");

        return Ex2.soma(0,divisaoInteiraComResto(Ex3.subtracao(x, y), y));

    }
}
