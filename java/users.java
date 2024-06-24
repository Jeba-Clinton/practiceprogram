import java.util.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.*;
import java.sql.*;

class UserFrame extends Frame implements ActionListener
{
   Label lblTitle,lblId,lblName,lblCity,lblAge,lblStatus;
   TextField txtName,txtId,txtCity,txtAge;
   Button btnSave,btnClear,btnDelete;
    public UserFrame()
    {
       setTitle("User management System ");
       setVisible(true);
       setLayout(null);
       setSize(1000,600);
       Color frcolor = new Color(53,59,72);
       setBackground(frcolor);

       Font titlefont= new Font("arial",Font.BOLD,25);
       Font labelfont= new Font("arial", Font.PLAIN,18);
       Font textfont= new Font("arial", Font.PLAIN,18);

       lblTitle = new Label("User Management System");
       lblTitle.setBounds(250,40,400,50);
       lblTitle.setFont(titlefont);
       lblTitle.setForeground(Color.YELLOW);
       add(lblTitle);
    
       lblId = new Label("ID");
       lblId.setBounds(250,100,150,30);
       lblId.setFont(labelfont);
       lblId.setForeground(Color.WHITE);
       add(lblId);

       txtId= new TextField();
       txtId.setBounds(400,100,400,30);
       txtId.setFont(textfont);
       txtId.addActionListener(this);
       add(txtId);

       lblName = new Label("NAME");
       lblName.setBounds(250,150,150,30);
       lblName.setFont(labelfont);
       lblName.setForeground(Color.WHITE);
       add(lblName);

       txtName= new TextField();
       txtName.setBounds(400,150,400,30);
       txtName.setFont(textfont);
       txtName.addActionListener(this);
       add(txtName);
       
       lblCity = new Label("CITY");
       lblCity.setBounds(250,200,150,30);
       lblCity.setFont(labelfont);
       lblCity.setForeground(Color.WHITE);
       add(lblCity);

       txtCity= new TextField();
       txtCity.setBounds(400,200,400,30);
       txtCity.setFont(textfont);
       add(txtCity);

       lblAge = new Label("AGE");
       lblAge.setBounds(250,250,150,30);
       lblAge.setFont(labelfont);
       lblAge.setForeground(Color.WHITE);
       add(lblAge);

       txtAge= new TextField();
       txtAge.setBounds(400,250,400,30);
       txtAge.setFont(textfont);
       add(txtAge);
       
       btnSave = new Button("SAVE");
       btnSave.setBounds(400,300,100,30);
       btnSave.setBackground(Color.ORANGE);
       btnSave.setForeground(Color.WHITE);
       btnSave.setFont(labelfont);
       btnSave.addActionListener(this);
       add(btnSave);

       btnClear = new Button("CLEAR");
       btnClear.setBounds(520,300,100,30);
       btnClear.setBackground(Color.BLUE);
       btnClear.setForeground(Color.WHITE);
       btnClear.setFont(labelfont);
       btnClear.addActionListener(this);
       add(btnClear);

       btnDelete = new Button("DELETE");
       btnDelete.setBounds(640,300,100,30);
       btnDelete.setBackground(Color.RED);
       btnDelete.setForeground(Color.WHITE);
       btnDelete.setFont(labelfont);
       btnDelete.addActionListener(this);
       add(btnDelete);

       lblStatus = new Label("_________________");
       lblStatus.setBounds(400,350,300,50);
       lblStatus.setFont(labelfont);
       lblStatus.setForeground(Color.WHITE);
       add(lblStatus);

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we)
      {
        System.exit(0);
      }
    });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
public class users {
  public static void main(String[] args) {
   UserFrame UF=new UserFrame();
  }
} 