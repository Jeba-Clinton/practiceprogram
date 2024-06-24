import java.awt.*;
import java.awt.event.*;

class App43 extends Frame {
    Label l1, l2;
    Checkbox c1, c2;

    public App43() {
        super("Calisthenics");
        setSize(1000, 600);
        setLayout(null);
        setVisible(true);

        c1 = new Checkbox("Option 1");
        c1.setBounds(10, 50, 250, 30);
        l1 = new Label("Not Selected");
        l1.setBounds(300, 50, 600, 30);

        c2 = new Checkbox("Option 2");
        c2.setBounds(10, 100, 250, 30);
        l2 = new Label("Not Selected");
        l2.setBounds(300, 100, 600, 30);

        add(c1);
        add(l1);

        add(c2);
        add(l2);

        c1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l1.setText((e.getStateChange() == 1 ? "Checked" : "Unchecked"));
            }
        });

        c2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l2.setText((e.getStateChange() == 1 ? "Checked" : "Unchecked"));
            }
        });

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        App43 frm = new App43();
    }
}
