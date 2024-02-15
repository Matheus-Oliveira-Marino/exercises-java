package exercises;


public class Ex1 
{
    public static boolean verificaNegativo(int aumenta, int diminui)
    {
        if(aumenta == 0) return true;
        if(diminui == 0) return false;

        return verificaNegativo(++aumenta,--diminui);
    }

     static boolean ehNegativo(int x)
    {
        if(x == 0) return false;

        return verificaNegativo(x,x);
    }
}
