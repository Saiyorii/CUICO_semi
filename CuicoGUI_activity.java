import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CuicoGUI_activity
{
    public static void main(String[] args)
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JLabel nameLabel = new JLabel("Enter your name:");
        JTextField nameField = new JTextField();
        
        JLabel birthdayLabel = new JLabel("Enter your birthday (MM/DD/YYYY):");
        JTextField birthdayField = new JTextField();
        
        JLabel addressLabel = new JLabel("Enter your address:");
        JTextField addressField = new JTextField();
        
        JLabel resultLabel = new JLabel(" "); 

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        
        panel.add(birthdayLabel);
        panel.add(birthdayField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        
        panel.add(resultLabel);

        Object[] options = {"Submit", "Cancel"};

        while (true) {
            int option = JOptionPane.showOptionDialog(
                    null,
                    panel,
                    "User Information Form",
                    JOptionPane.NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            if (option != 0) {
                break;
            }
 
            String name = nameField.getText().trim();
            String birthday = birthdayField.getText().trim();
            String address = addressField.getText().trim();

            String resultText = "<html><b>Information Submitted:</b><br>" +
                                "Name: " + name + "<br>" +
                                "Birthday: " + birthday + "<br>" +
                                "Address: " + address + "</html>";
            resultLabel.setText(resultText);
        }
    }
}
