package awt_practice;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class MyFrameTextField extends Frame implements TextListener, ActionListener {
    Label l1, l2;
    TextField tf;
    public MyFrameTextField(){
        super("Text Field Demo");
        l1 = new Label("No Text is entered yet");
        l2 = new Label("Enter key is not hit yet");
        tf = new TextField(20);
        tf.setEchoChar('*'); // Use it for password fields

        tf.addTextListener(this);
        tf.addActionListener(this);

        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);

    }
    public void textValueChanged(TextEvent te){
        l1.setText(tf.getText());
    }

    public void actionPerformed(ActionEvent ae) {
        l2.setText(tf.getText());
    }
}
public class TextFieldDemo {
    public static void main(String[] args) {
        MyFrameTextField mf = new MyFrameTextField();
        mf.setSize(400, 400);
        mf.setVisible(true);
    }
}
