package awt_practice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrameTextArea extends Frame implements ActionListener {
TextArea ta;
TextField tf;
Label l;
Button b;
    public MyFrameTextArea(){
       super("Text Area Demo");
       l = new Label("  This is      ");
       ta = new TextArea("hello", 10, 20, 5);
       tf = new TextField(20);
       b = new Button("Click");

       setLayout(new FlowLayout());
       add(ta);
       add(l);
       add(tf);
       add(b);
       b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
//        l.setText(ta.getSelectedText()); // It will add selected string from text area in label
//        ta.setText(tf.getText()); // It will add string in text field into text area at last
        ta.insert(tf.getText(), ta.getCaretPosition()); // It will add string in text field into text area where
        // cursor is positioned currently in text area

    }
}
public class TextAreaDemo {
    public static void main(String[] args) {
        MyFrameTextArea mfta = new MyFrameTextArea();
        mfta.setSize(400, 400);
        mfta.setVisible(true);
    }

}
