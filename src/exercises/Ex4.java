package exercises;

public class Ex4 {
    public static int modulo(int z)
    {
        if(Ex1.ehNegativo(z)) return modulo(Ex3.subtracao(0,z));

        return z;
    }
}
