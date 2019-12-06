import java.util.*;
//https://github.com/azraanimating/zugschiebschieb/
public class Controller{
        Stack<Waggon> gleis1 = new Stack<>();
        Stack<Waggon> gleis2 = new Stack<>();
        Stack<Waggon> gleis3 = new Stack<>();
    
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
            while (!gleis1.isEmpty())
            {
                if(gleis1.top().getNumber() < gleis2.top().getNumber())
                {
                    gleis2.push(gleis1.top());
                    gleis1.pop();
                } 
                else 
                {
                    while (!gleis2.isEmpty() && gleis1.top().getNumber() > gleis2.top().getNumber())
                    {
                        gleis3.push(gleis2.top());
                        gleis2.pop();
                    }
                    gleis2.push(gleis1.top());
                    gleis1.pop();
                    while (!gleis3.isEmpty())
                    {
                        gleis2.push(gleis3.top());
                        gleis3.pop();
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
