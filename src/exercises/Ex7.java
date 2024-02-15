package exercises;

public class Ex7 
{
    
    public static int divisaoInteira(int x, int y) throws Exception
    {
        if(y == 0) throw new Exception("Não existe divisão por 0");
        if(x == 1) throw new Exception("Divisão não corresponde a um número inteiro");
        if(x == 0) return 0;
        if(y == 1) return x;

        //if(ehNegativo(y)) return subtracao(divisaoInteira(soma(x, y), y),1);
        //if(ehNegativo(x)) return subtracao(0, soma(divisaoInteira(soma(x, y), y),1));
        //if(ehNegativo(y)) return subtracao(0, divisaoInteira(x, subtracao(0, y)));

        if(Ex1.ehNegativo(x))
        {
            if(!Ex1.ehNegativo(y))
            {
                return Ex3.subtracao(0, divisaoInteira(x, Ex3.subtracao(0, y)));
            }
            if(Ex1.ehNegativo(y))
            {
                x = Ex4.modulo(x);
                y = Ex4.modulo(y);
                return Ex2.soma(1, divisaoInteira(Ex3.subtracao(x, y), y));
            }
        }
        if(!Ex1.ehNegativo(x))
        {
            if(Ex1.ehNegativo(y))
            {
                return Ex3.subtracao(0, divisaoInteira(x, Ex3.subtracao(0, y)));
            }
        }
        return Ex2.soma(1, divisaoInteira(Ex3.subtracao(x, y), y));
    }
}
