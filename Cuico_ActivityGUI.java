import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cuico_ActivityGUI {
    public static void main(String[] args) {
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel questionLabel = new JLabel("<html>What is the default value of a boolean in Java?<br>" +
                "A. true<br>B. false<br>C. 0<br>D. null</html>");
        JTextField answerField = new JTextField();
        JLabel resultLabel = new JLabel(" "); 
        
        panel.add(questionLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(new JLabel("Enter your answer (a/b/c/d):"));
        panel.add(answerField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(resultLabel);

        Object[] options = {"Submit", "Cancel"};

        while (true) {
            int option = JOptionPane.showOptionDialog(
                    null,
                    panel,
                    "Java MCQ Quiz",
                    JOptionPane.NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            if (option != 0) {
                break;
            }

            String answer = answerField.getText().trim().toLowerCase();

            if (answer.equals("b")) {
                resultLabel.setText("Correct!");
            } else {
                resultLabel.setText("Wrong. The correct answer is B.");
            }
        }
    }
}
