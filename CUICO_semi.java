import javax.swing.*;


public class CUICO_semi
{
   public static void main(String[] args)
   {
      String input = JOptionPane.showInputDialog("Enter a value in inches:");
      double inches = Double.parseDouble(input);
        
      InchConversion conversion = new InchConversion(inches);
        
      double feet = conversion.convertToFeet();
      double yards = conversion.convertToYards();
        

      String messageFeet = "Calculation: Feet = inches / 12" + "\nInches: " + inches + "\n\nSolution: " + inches + " / 12" + "\n\nFeet = " + feet;
      String messageYards = "Calculation: Yards = inches / 36" + "\nInches: " + inches + "\n\nSolution: " + inches + " / 36" + "\n\nYards = " + yards;
        
      JOptionPane.showMessageDialog(null, messageFeet);
      JOptionPane.showMessageDialog(null, messageYards);
   }
}

class InchConversion
{
    private double inches;
    public InchConversion(double inches)
    {
      this.inches = inches;
    }

    public double convertToFeet()
    {
      return inches / 12; // 12 inches in a foot
    }
    public double convertToYards()
    {
      return inches / 36; // 36 inches in a yard (3 feet)
    }
}

