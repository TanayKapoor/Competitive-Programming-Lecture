package Jul21;

import java.awt.*;

public class anonymousInnerClass extends Frame {
    anonymousInnerClass() {
        Button b = new Button("Click");
        b.setBounds(100, 100, 100, 100);
        b.addActionListener(e -> {
            System.out.println("Exit");
            System.exit(0);
        });
        add(b);
        setTitle("Client");
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new anonymousInnerClass();
    }
}
