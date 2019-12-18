
/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class GUI_project extends JFrame {

    private JMenuBar menuBar;
    private JLabel g3;
    private JButton jbEinfügen;
    private JButton jbEinzelschritt;
    private JButton jbExecuteSort;
    private JLabel jg3;
    private JLabel jlg1;
    private JLabel jpEinfügen;
    private JTextField jtSummonWaggon;
    private JTextArea jtfGleis2;
    private JTextArea jtfGleis3;
    private JTextArea jtfGleis1;
    private JTextField textfield2;

    
    Controller kController;
    //Constructor 
    public GUI_project(Controller pController){
        
        kController = pController;

        this.setTitle("GUI_project");
        this.setSize(500,400);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(500,400));
        contentPane.setBackground(new Color(192,192,192));
        
        jbEinfügen = new JButton();
        jbEinfügen.addActionListener(new ActionListener()
          {
            public void actionPerformed(ActionEvent e)
            {
                kController.addWaggon(Integer.parseInt(jtSummonWaggon.getText()));
                String previousText = jtfGleis1.getText();
                String newText = "Waggon " + jtSummonWaggon.getText() + "\n" + previousText;
                jtfGleis1.setText("");
                jtfGleis1.setText(newText + "\n");
                jtSummonWaggon.setText("");
            }
          } 
        );
        
        jbExecuteSort = new JButton();
        jbExecuteSort.addActionListener(new ActionListener()
          {
            public void actionPerformed(ActionEvent e)
            {
                kController.sort(); 
            }
          } 
        );
        
        jbEinzelschritt = new JButton();
        jbEinzelschritt.addActionListener(new ActionListener()
          {
            public void actionPerformed(ActionEvent e)
            {
                kController.singleStep(); 
            }
          } 
        );

        g3 = new JLabel();
        g3.setBounds(148,131,90,35);
        g3.setBackground(new Color(214,217,223));
        g3.setForeground(new Color(0,0,0));
        g3.setEnabled(true);
        g3.setFont(new Font("sansserif",0,12));
        g3.setText("Gleis 2 ");
        g3.setVisible(true);

        jbEinfügen.setBounds(278,24,90,35);
        jbEinfügen.setBackground(new Color(214,217,223));
        jbEinfügen.setForeground(new Color(0,0,0));
        jbEinfügen.setEnabled(true);
        jbEinfügen.setFont(new Font("sansserif",0,12));
        jbEinfügen.setText("Einfügen");
        jbEinfügen.setVisible(true);

        jbEinzelschritt.setBounds(215,70,90,35);
        jbEinzelschritt.setBackground(new Color(214,217,223));
        jbEinzelschritt.setForeground(new Color(0,0,0));
        jbEinzelschritt.setEnabled(true);
        jbEinzelschritt.setFont(new Font("sansserif",0,12));
        jbEinzelschritt.setText("Schritt");
        jbEinzelschritt.setVisible(true);

        jbExecuteSort.setBounds(87,68,90,35);
        jbExecuteSort.setBackground(new Color(214,217,223));
        jbExecuteSort.setForeground(new Color(0,0,0));
        jbExecuteSort.setEnabled(true);
        jbExecuteSort.setFont(new Font("sansserif",0,12));
        jbExecuteSort.setText("Sortieren");
        jbExecuteSort.setVisible(true);

        jg3 = new JLabel();
        jg3.setBounds(256,131,90,35);
        jg3.setBackground(new Color(214,217,223));
        jg3.setForeground(new Color(0,0,0));
        jg3.setEnabled(true);
        jg3.setFont(new Font("sansserif",0,12));
        jg3.setText("Gleis 3");
        jg3.setVisible(true);

        jlg1 = new JLabel();
        jlg1.setBounds(36,129,90,35);
        jlg1.setBackground(new Color(214,217,223));
        jlg1.setForeground(new Color(0,0,0));
        jlg1.setEnabled(true);
        jlg1.setFont(new Font("sansserif",0,12));
        jlg1.setText("Gleis 1");
        jlg1.setVisible(true);

        jpEinfügen = new JLabel();
        jpEinfügen.setBounds(27,21,120,35);
        jpEinfügen.setBackground(new Color(214,217,223));
        jpEinfügen.setForeground(new Color(0,0,0));
        jpEinfügen.setEnabled(true);
        jpEinfügen.setFont(new Font("sansserif",0,12));
        jpEinfügen.setText("Waggon Einfügen");
        jpEinfügen.setVisible(true);

        jtSummonWaggon = new JTextField();
        jtSummonWaggon.setBounds(145,22,110,35);
        jtSummonWaggon.setBackground(new Color(255,255,255));
        jtSummonWaggon.setForeground(new Color(0,0,0));
        jtSummonWaggon.setEnabled(true);
        jtSummonWaggon.setFont(new Font("sansserif",0,12));
        jtSummonWaggon.setText("Wagonnnummer");
        jtSummonWaggon.setVisible(true);

        jtfGleis2 = new JTextArea();
        jtfGleis2.setBounds(128,164,100,200);
        jtfGleis2.setBackground(new Color(255,255,255));
        jtfGleis2.setForeground(new Color(0,0,0));
        jtfGleis2.setEnabled(true);
        jtfGleis2.setFont(new Font("sansserif",0,12));
        jtfGleis2.setText("");
        jtfGleis2.setBorder(BorderFactory.createBevelBorder(1));
        jtfGleis2.setVisible(true);

        jtfGleis3 = new JTextArea();
        jtfGleis3.setBounds(246,165,100,200);
        jtfGleis3.setBackground(new Color(255,255,255));
        jtfGleis3.setForeground(new Color(0,0,0));
        jtfGleis3.setEnabled(true);
        jtfGleis3.setFont(new Font("sansserif",0,12));
        jtfGleis3.setText("");
        jtfGleis3.setBorder(BorderFactory.createBevelBorder(1));
        jtfGleis3.setVisible(true);

        jtfGleis1 = new JTextArea();
        jtfGleis1.setBounds(13,163,100,200);
        jtfGleis1.setBackground(new Color(255,255,255));
        jtfGleis1.setForeground(new Color(0,0,0));
        jtfGleis1.setEnabled(true);
        jtfGleis1.setFont(new Font("sansserif",0,12));
        jtfGleis1.setText("");
        jtfGleis1.setBorder(BorderFactory.createBevelBorder(1));
        jtfGleis1.setVisible(true);

        textfield2 = new JTextField();
        textfield2.setBounds(405,356,90,39);
        textfield2.setBackground(new Color(255,255,255));
        textfield2.setForeground(new Color(0,0,0));
        textfield2.setEnabled(false);
        textfield2.setFont(new Font("sansserif",0,12));
        textfield2.setText("JTextField");
        textfield2.setVisible(false);

        //adding components to contentPane panel
        contentPane.add(g3);
        contentPane.add(jbEinfügen);
        contentPane.add(jbEinzelschritt);
        contentPane.add(jbExecuteSort);
        contentPane.add(jg3);
        contentPane.add(jlg1);
        contentPane.add(jpEinfügen);
        contentPane.add(jtSummonWaggon);
        contentPane.add(jtfGleis2);
        contentPane.add(jtfGleis3);
        contentPane.add(jtfGleis1);
        contentPane.add(textfield2);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu tools = new JMenu("Tools");
        JMenu help = new JMenu("Help");

        JMenuItem open = new JMenuItem("Open   ");
        JMenuItem save = new JMenuItem("Save   ");
        JMenuItem exit = new JMenuItem("Exit   ");
        JMenuItem preferences = new JMenuItem("Preferences   ");
        JMenuItem about = new JMenuItem("About   ");


        file.add(open);
        file.add(save);
        file.addSeparator();
        file.add(exit);
        tools.add(preferences);
        help.add(about);

        menuBar.add(file);
        menuBar.add(tools);
        menuBar.add(help);
    }
    
    public void addToGleis(int pGleisnummer, int pWagonnummer)
    {
        String previousText;
        String newText;
        switch(pGleisnummer)
        {
           case 1:
                previousText = jtfGleis1.getText();
                System.out.println(previousText);
                if(jtSummonWaggon.getText().equals("Waggonnummer"))
                {
                    if(previousText.equalsIgnoreCase(""))
                    {
                        newText = "Waggon " + Integer.parseInt(jtSummonWaggon.getText()) + "\n";
                    }
                    else
                    {
                        newText = "Waggon " + Integer.parseInt(jtSummonWaggon.getText()) + "\n" + previousText;
                    }
                } 
                else
                {
                    if(previousText.equalsIgnoreCase(""))
                    {
                        newText = "Waggon " + pWagonnummer + "\n";
                    }
                    else
                    {
                        newText = "Waggon " + pWagonnummer + "\n" + previousText;
                    }
                }
                jtfGleis1.setText("");
                jtfGleis1.setText(newText);
                break;
           case 2:
                previousText = jtfGleis2.getText();
                if(jtSummonWaggon.getText().equals("Waggonnummer"))
                {
                    if(previousText.equalsIgnoreCase(""))
                    {
                        newText = "Waggon " + Integer.parseInt(jtSummonWaggon.getText()) + "\n";
                    }
                    else
                    {
                        newText = "Waggon " + Integer.parseInt(jtSummonWaggon.getText()) + "\n" + previousText;
                    }
                } 
                else
                {
                    if(previousText.equalsIgnoreCase(""))
                    {
                        newText = "Waggon " + pWagonnummer + "\n";
                    }
                    else
                    {
                        newText = "Waggon " + pWagonnummer + "\n" + previousText;
                    }
                }
                jtfGleis2.setText("");
                jtfGleis2.setText(newText);
                break;
           case 3:
                previousText = jtfGleis3.getText();
                if(jtSummonWaggon.getText().equals("Waggonnummer"))
                {
                    if(previousText.equalsIgnoreCase(""))
                    {
                        newText = "Waggon " + Integer.parseInt(jtSummonWaggon.getText()) + "\n";
                    }
                    else
                    {
                        newText = "Waggon " + Integer.parseInt(jtSummonWaggon.getText()) + "\n" + previousText;
                    }
                } 
                else
                {
                    if(previousText.equalsIgnoreCase(""))
                    {
                        newText = "Waggon " + pWagonnummer + "\n";
                    }
                    else
                    {
                        newText = "Waggon " + pWagonnummer + "\n" + previousText;
                    }
                }
                jtfGleis3.setText("");
                jtfGleis3.setText(newText);
                break;
           }
    }
       
    public void removeFromGleis(int pGleisnummer)
    {
        String previousText;
        String newText;
        switch(pGleisnummer)
        {
            case 1:
                previousText = jtfGleis1.getText();
                jtfGleis1.setText("");
                newText = previousText.substring(0, previousText.indexOf("\n") + 1);
                System.out.println(newText);
                jtfGleis1.setText(newText);
            case 2:
                previousText = jtfGleis2.getText();
                jtfGleis2.setText("");
                newText = previousText.substring(0, previousText.indexOf("\n") + 1);
                jtfGleis2.setText(newText);
            case 3:
                previousText = jtfGleis3.getText();
                jtfGleis3.setText("");
                newText = previousText.substring(0, previousText.indexOf("\n") + 1);
                jtfGleis3.setText(newText);
        }
    }
}
