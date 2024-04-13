import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JavaSwingCalculator extends JFrame {
    JLabel lblExpression = new JLabel("Expression "),
            lblResult = new JLabel("0 ");
    JButton btnEq = new JButton("="),
            btnAdd = new JButton("+"),
            btnSub = new JButton("-"),
            btnMulti = new JButton("*"),
            btnDiv = new JButton("/"),
            btnPer = new JButton("%");
    JButton btn0 = new JButton("0"),
            btn1 = new JButton("1"),
            btn2 = new JButton("2"),
            btn3 = new JButton("3"),
            btn4 = new JButton("4"),
            btn5 = new JButton("5"),
            btn6 = new JButton("6"),
            btn7 = new JButton("7"),
            btn8 = new JButton("8"),
            btn9 = new JButton("9");
    JButton btnClear = new JButton("C");

    public static void main(String[] args) {
        // Object -> JFrame -> Initialize Components -> Event Handling
        new JavaSwingCalculator();
    }

    public JavaSwingCalculator() {
        this.setTitle("My GUI Swing Calculator");
        this.setSize(400, 600);
        this.setLayout(new GridBagLayout());

        // USER INTERFACE COMPONENTS
        lblExpression.setHorizontalAlignment(SwingConstants.TRAILING);
        lblExpression.setOpaque(true);
        lblExpression.setForeground(Color.WHITE);
        lblExpression.setBackground(Color.DARK_GRAY);

        lblResult.setHorizontalAlignment(SwingConstants.TRAILING);
        lblResult.setOpaque(true);
        lblResult.setForeground(Color.WHITE);
        lblResult.setBackground(Color.DARK_GRAY);

        // UI LAYOUT
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weighty = (float) 1 / 7;
        gbc.weightx = (float) 1 / 4;
        gbc.gridheight = 1;

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.gridwidth =	4;
        this.add(lblExpression, gbc);

        gbc.gridy = 1;
        gbc.gridx = 0;
        gbc.gridwidth =	4;
        gbc.gridheight = 2;
        this.add(lblResult, gbc);

        // Reset height
        gbc.gridheight = 1;

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        this.add(btnClear, gbc);

        gbc.gridy = 7;
        gbc.gridx = 0;
        gbc.gridwidth = 3;
        this.add(btn0, gbc);

        // Reset width
        gbc.gridwidth = 1;
        

        gbc.gridy = 6;
        gbc.gridx = 0;
        this.add(btn1, gbc);
        gbc.gridy = 6;
        gbc.gridx = 1;
        this.add(btn2, gbc);
        gbc.gridy = 6;
        gbc.gridx = 2;
        this.add(btn3, gbc);

        gbc.gridy = 5;
        gbc.gridx = 0;
        this.add(btn4, gbc);
        gbc.gridy = 5;
        gbc.gridx = 1;
        this.add(btn5, gbc);
        gbc.gridy = 5;
        gbc.gridx = 2;
        this.add(btn6, gbc);

        gbc.gridy = 4;
        gbc.gridx = 0;
        this.add(btn7, gbc);
        gbc.gridy = 4;
        gbc.gridx = 1;
        this.add(btn8, gbc);
        gbc.gridy = 4;
        gbc.gridx = 2;
        this.add(btn9, gbc);

        gbc.gridy = 7;
        gbc.gridx = 3;
        this.add(btnEq, gbc);
        gbc.gridy = 6;
        gbc.gridx = 3;
        this.add(btnAdd, gbc);
        gbc.gridy = 5;
        gbc.gridx = 3;
        this.add(btnSub, gbc);
        gbc.gridy = 4;
        gbc.gridx = 3;
        this.add(btnMulti, gbc);
        gbc.gridy = 3;
        gbc.gridx = 3;
        this.add(btnDiv, gbc);
        gbc.gridy = 3;
        gbc.gridx = 2;
        this.add(btnPer, gbc);


        this.setVisible(true);
    }
}
