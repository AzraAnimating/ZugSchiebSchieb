import java.util.*;
//https://github.com/azraanimating/zugschiebschieb/
public class Controller{
        Stack<Waggon> gleis1 = new Stack<>();
        Stack<Waggon> gleis2 = new Stack<>();
        Stack<Waggon> gleis3 = new Stack<>();
        GUI_project gui = new GUI_project(this);
    
        public Controller(int pAnzahlWaggons){
            for(int i = 0 ; i < pAnzahlWaggons ; i++)
            {
                int lrandomNum = new java.util.Random().nextInt(pAnzahlWaggons);
                gleis1.push(new Waggon(lrandomNum));
                gui.addToGleis(1, lrandomNum);
            }
        }
        
        public void addWaggon(int pNummer)
        {
            gleis1.push(new Waggon(pNummer));
        }
    
        public void sort()
        {
            gleis2.push(gleis1.top());
            gui.addToGleis(2, gleis1.top().getNumber());
            gleis1.pop();
            gui.removeFromGleis(1);
            while (!gleis1.isEmpty())
            {
                if(gleis1.top().getNumber() < gleis2.top().getNumber())
                {
                    gleis2.push(gleis1.top());
                    gui.addToGleis(2, gleis1.top().getNumber());
                    gleis1.pop();
                    gui.removeFromGleis(1);
                } 
                else 
                {
                    while (!gleis2.isEmpty() && gleis1.top().getNumber() > gleis2.top().getNumber())
                    {
                        gleis3.push(gleis2.top());
                        gui.addToGleis(3, gleis2.top().getNumber());
                        gleis2.pop();
                        gui.removeFromGleis(2);
                    }
                    gleis2.push(gleis1.top());
                    gui.addToGleis(2, gleis1.top().getNumber());
                    gleis1.pop();
                    gui.removeFromGleis(1);
                    while (!gleis3.isEmpty())
                    {
                        gleis2.push(gleis3.top());
                        gui.addToGleis(2, gleis3.top().getNumber());
                        gleis3.pop();
                        gui.removeFromGleis(3);
                    }
                }
            }
        }
        
        public void singleStep()
        {
            if(!gleis1.isEmpty())
            {
                if(!gleis2.isEmpty())
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
                else
                {
                    gleis2.push(gleis1.top());
                    gleis1.pop();
                }
            }
        }
    
        public void output()
        {
            while(!gleis1.isEmpty())
            {
                gui.addToGleis(1, gleis1.top().getNumber());
                gleis2.push(gleis1.top());
                gleis1.pop();
            }
            while(!gleis2.isEmpty())
            {
                gleis1.push(gleis2.top());
                gleis2.pop();
            }
        }
        
        public void testClear(){
            gui.removeFromGleis(1);
        }
}
