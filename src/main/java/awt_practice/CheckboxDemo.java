package awt_practice;

import java.awt.*;
import java.awt.event.*;

class MyFrameCheckbox extends Frame implements ItemListener{
Checkbox cb1, cb2, cb3;
CheckboxGroup cbg;
Label l;
public MyFrameCheckbox(){
    super("Checkbox demo");
    l = new Label("Nothing is selected        ");

    cbg = new CheckboxGroup();
    cb1 = new Checkbox("Java", false,cbg);
    cb2 = new Checkbox("C#", false,cbg);
    cb3 = new Checkbox("Python",false,cbg);

    cb1.addItemListener(this);
    cb2.addItemListener(this);
    cb3.addItemListener(this);

    setLayout(new FlowLayout());
    add(l);
    add(cb1);
    add(cb2);
    add(cb3);
}


    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = "";
        if(cb1.getState())
            str=str+" "+ cb1.getLabel();
        if(cb2.getState())
            str=str+" "+ cb2.getLabel();
        if(cb3.getState())
            str=str+" "+ cb3.getLabel();
        if(str.isEmpty())
            str= "Nothing is selected";
        l.setText(str);
    }
}

public class CheckboxDemo {
    public static void main(String[] args) {
        MyFrameCheckbox mf = new MyFrameCheckbox();
        mf.setSize(400, 400);
        mf.setVisible(true);
    }
}
