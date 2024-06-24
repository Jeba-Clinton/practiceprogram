import java.awt.*;
import java.awt.event.*;

public class CheckboxExample extends Frame implements ItemListener {
    Checkbox checkbox1, checkbox2;
    Label label;

    CheckboxExample() {
        label = new Label();
        label.setBounds(50, 200, 200, 30);
        checkbox1 = new Checkbox("Java");
        checkbox1.setBounds(100, 100, 50, 50);
        checkbox2 = new Checkbox("Python");
        checkbox2.setBounds(100, 150, 50, 50);
        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);
        add(checkbox1);
        add(checkbox2);
        add(label);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {
        String result = "Java: " + (checkbox1.getState() ? "Checked" : "Unchecked") + " | Python: " + (checkbox2.getState() ? "Checked" : "Unchecked");
        label.setText(result);
    }

    public static void main(String[] args) {
        new CheckboxExample();
    }
}
