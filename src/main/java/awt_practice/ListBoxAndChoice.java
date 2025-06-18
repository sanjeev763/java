package awt_practice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrameListBox extends Frame implements ItemListener, ActionListener {
    List li;
    Choice c;
    TextArea ta;
    public MyFrameListBox(){
        super("ListBox & Choice");
        li = new List(4, true);
        c = new Choice();
        ta = new TextArea(10, 30);

        li.add("Monday");
        li.add("Tuesday");
        li.add("Wednesday");
        li.add("Thursday");
        li.add("Friday");
        li.add("Saturday");
        li.add("Sunday");

        c.add("Jan");
        c.add("Feb");
        c.add("Mar");
        c.add("Apr");

        setLayout(new FlowLayout());
        add(li);
        add(c);
        add(ta);
        li.addItemListener(this);
        c.addItemListener(this);
        li.addActionListener(this);
    }

    public void itemStateChanged(ItemEvent ie) {
        if(ie.getSource() == li)
            ta.setText(li.getSelectedItem());
        if(ie.getSource() == c)
            ta.setText(c.getSelectedItem());
    }

    public void actionPerformed(ActionEvent e) {
        String[] st = li.getSelectedItems();
        String str = "";
        for(String x:st)
            str += x + "\n";

        ta.setText(str);
    }
}

public class ListBoxAndChoice {
    public static void main(String[] args) {
        MyFrameListBox mflb = new MyFrameListBox();
        mflb.setSize(400, 400);
        mflb.setVisible(true);
    }
}
