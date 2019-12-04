import java.util.*;
public class Controller{
    Stack<Waggon> gleis1 = new Stack<Waggon>();
    Stack<Waggon> gleis2 = new Stack<Waggon>();
    Stack<Waggon> gleis3 = new Stack<Waggon>();
    public Controller(int pAnzahlWaggons){
        for(int i = 0 ; i < pAnzahlWaggons ; i++)
        {
            int randomNum = new java.util.Random().nextInt(pAnzahlWaggons);
            gleis1.push(new Waggon(randomNum));
        }
    }
    public void sort()
    {
        gleis2.push(gleis1.top());
        gleis1.pop();
        while(!gleis1.isEmpty())
        {
            int lNummerg2 = 0;
            int lNummerg1 = gleis1.top().getNumber();
            if(!gleis2.isEmpty())
            {
                lNummerg2 = gleis2.top().getNumber();
            }
            else
            {
                lNummerg2 = 0;
            }
            if(lNummerg1 < lNummerg2)
            {
                gleis2.push(gleis1.top());
                gleis1.pop();
                while(!gleis3.isEmpty())
                {
                    gleis2.push(gleis3.top());
                    gleis3.pop();
                }
            }
            else
            {
                if(!gleis2.isEmpty())
                {
                    gleis3.push(gleis2.top());
                    gleis2.pop();       
                }
                else
                {
                    gleis2.push(gleis1.top());
                    gleis1.pop();
                }
            }
        }
    }
    public void output()
    {
        while(!gleis1.isEmpty())
        {
            System.out.println(gleis1.top().getNumber());
            gleis2.push(gleis1.top());
            gleis1.pop();
        }
        while(!gleis2.isEmpty())
        {
            gleis1.push(gleis2.top());
            gleis2.pop();
        }
    }
}
