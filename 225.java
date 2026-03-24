import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number",
                "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number",
                "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;

        String result;

        if (num2 != 0) {
            double quot = num1 / num2;
            result = "Sum: " + sum +
                     "\nDifference: " + diff +
                     "\nProduct: " + prod +
                     "\nQuotient: " + quot;
        } else {
            result = "Sum: " + sum +
                     "\nDifference: " + diff +
                     "\nProduct: " + prod +
                     "\nQuotient: Cannot divide by 0";
        }

        JOptionPane.showMessageDialog(null, result,
                "Result", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}