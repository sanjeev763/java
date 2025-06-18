package awt_practice;

import java.awt.*;

public class SecondApp extends Frame {
    public SecondApp(){
        super("My Second App");
        setLayout(new FlowLayout());
        Button b;
        TextField tf;
        Label l;

        b = new Button("OK");
        tf = new TextField(20);
        l = new Label("Name");
        add(tf);
        add(l);

        add(b);
    }

    public static void main(String[] args) {
        SecondApp sa = new SecondApp();
        sa.setSize(400, 400);
        sa.setVisible(true);

    }
}
