import javax.swing.*;
import java.awt.event.*;

public class Calculator {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(350, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel num1Label = new JLabel("Number 1:");
        num1Label.setBounds(40, 30, 100, 30);
        frame.add(num1Label);

        JTextField num1Text = new JTextField();
        num1Text.setBounds(140, 30, 150, 30);
        frame.add(num1Text);

        JLabel num2Label = new JLabel("Number 2:");
        num2Label.setBounds(40, 70, 100, 30);
        frame.add(num2Label);

        JTextField num2Text = new JTextField();
        num2Text.setBounds(140, 70, 150, 30);
        frame.add(num2Text);

        JButton addBtn = new JButton("+");
        addBtn.setBounds(40, 120, 60, 30);
        frame.add(addBtn);

        JButton subBtn = new JButton("-");
        subBtn.setBounds(110, 120, 60, 30);
        frame.add(subBtn);

        JButton mulBtn = new JButton("*");
        mulBtn.setBounds(180, 120, 60, 30);
        frame.add(mulBtn);

        JButton divBtn = new JButton("/");
        divBtn.setBounds(250, 120, 60, 30);
        frame.add(divBtn);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(40, 170, 100, 30);
        frame.add(resultLabel);

        JTextField resultText = new JTextField();
        resultText.setBounds(140, 170, 150, 30);
        resultText.setEditable(false);
        frame.add(resultText);

        // ADDITION
        addBtn.addActionListener(e -> {
            double a = Double.parseDouble(num1Text.getText());
            double b = Double.parseDouble(num2Text.getText());
            resultText.setText(String.valueOf(a + b));
        });

        // SUBTRACTION
        subBtn.addActionListener(e -> {
            double a = Double.parseDouble(num1Text.getText());
            double b = Double.parseDouble(num2Text.getText());
            resultText.setText(String.valueOf(a - b));
        });

        // MULTIPLICATION
        mulBtn.addActionListener(e -> {
            double a = Double.parseDouble(num1Text.getText());
            double b = Double.parseDouble(num2Text.getText());
            resultText.setText(String.valueOf(a * b));
        });

        // DIVISION
        divBtn.addActionListener(e -> {
            double a = Double.parseDouble(num1Text.getText());
            double b = Double.parseDouble(num2Text.getText());

            if (b == 0) {
                JOptionPane.showMessageDialog(frame, "Cannot divide by zero ❌");
            } else {
                resultText.setText(String.valueOf(a / b));
            }
        });

        frame.setVisible(true);
    }
}
