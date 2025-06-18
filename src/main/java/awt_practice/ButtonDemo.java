package awt_practice;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
    Button b;
    Label l;
    int count = 0;
    public MyFrame(){
        super("Button Demo");
        l = new Label(" "+count);
        b = new Button("Click");
        b.addActionListener(this);

        setLayout(new FlowLayout());
        add(l);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText(" "+count);
    }
}

public class ButtonDemo {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(400, 400);
        mf.setVisible(true);
    }
}
