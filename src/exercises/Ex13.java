package exercises;

public class Ex13 
{
    public static boolean ex13(int x, int y)
    {
        if(x == y) return false;
        if(y == 0) return true;
        if(x == 0) return true;

        if(Ex1.verificaNegativo(y,y))
        {
            if(!Ex1.verificaNegativo(x,x))
            {
                ex13(--x, ++y);
                 //if(y == 0) return true;
            }
            
            if(Ex1.verificaNegativo(x,x))
            {
                ex13(++x, ++y);
                return true;
            }            
        }
            return true;
    }
}
