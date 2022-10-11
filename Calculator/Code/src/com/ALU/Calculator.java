package com.ALU;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

//    initiate instances from the main modules
    JFrame frame;
    JTextField txtfield;
    JButton[] numberB = new JButton[10];
    JButton[] operators = new JButton[7];
    JButton add, sub, mul, div, mod;
    JButton eq, clr;

//    initiate the numbers vars and the result var
    double num1 = 0, num2 = 0, res = 0;
//    this one will hold the operator type
    char opr;

//    Just to make a funny font
    Font font = new Font("Ink Free", Font.BOLD, 30);

    Calculator() {

//        The frame properities
        frame = new JFrame("Java Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(410, 550);
        frame.setLayout(null);
        frame.setResizable(false);

//        The text Field Properities
        txtfield = new JTextField();
        txtfield.setBounds(0, 0, 400, 70);
        txtfield.setFont(font);
        txtfield.setEditable(false);
        frame.add(txtfield);

//        The operations buttons
        add = new JButton("+");
        mul = new JButton("X");
        sub = new JButton("-");
        div = new JButton("/");
        mod = new JButton("%");
        clr = new JButton("C");
        eq = new JButton("=");

        operators[0] = add;
        operators[1] = mul;
        operators[2] = sub;
        operators[3] = div;
        operators[4] = mod;
        operators[5] = clr;
        operators[6] = eq;

//        Add action listners to each of the buttons in the button array
        for (int i = 0; i < 7; i++) {
            operators[i].addActionListener(this);
            operators[i].setFont(font);
            operators[i].setFocusable(false);
        }

//        Add action listners and the text to each of the numbers' buttons in the button array
        for (int i = 0; i < 10; i++) {
            numberB[i] = new JButton(String.valueOf(i));
            numberB[i].addActionListener(this);
            numberB[i].setFont(font);
            numberB[i].setFocusable(false);
        }


//        Set the places of the buttons
        add.setBounds(0, 400, 80, 50);
        frame.add(add);
        mul.setBounds(160, 400, 80, 50);
        frame.add(mul);
        sub.setBounds(80, 400, 80, 50);
        frame.add(sub);
        div.setBounds(240, 400, 80, 50);
        frame.add(div);
        mod.setBounds(320, 400, 80, 50);
        frame.add(mod);
        eq.setBounds(200, 450, 200, 50);
        frame.add(eq);
        clr.setBounds(0, 450, 200, 50);
        frame.add(clr);


        frame.add(numberB[0]).setBounds(0, 200, 80, 100);
        frame.add(numberB[1]).setBounds(80, 200, 80, 100);
        frame.add(numberB[2]).setBounds(160, 200, 80, 100);
        frame.add(numberB[3]).setBounds(240, 200, 80, 100);
        frame.add(numberB[4]).setBounds(320, 200, 80, 100);

        frame.add(numberB[5]).setBounds(0, 300, 80, 100);
        frame.add(numberB[6]).setBounds(80, 300, 80, 100);
        frame.add(numberB[7]).setBounds(160, 300, 80, 100);
        frame.add(numberB[8]).setBounds(240, 300, 80, 100);
        frame.add(numberB[9]).setBounds(320, 300, 80, 100);


        // Loop to show the frame
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        // make a new instance of our class
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        The functions to perform when press each of the puttons
//        The way this works is that you enter he first number --> appear on the screen -->
//        enter the operator --> The screen is empty --> Enter the second number -->
//        appear on the screen --> press equel --> show the result --> press Clear to perform another operation

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberB[i]) {
                txtfield.setText((txtfield.getText().concat(String.valueOf(i))));
            }
        }
        if (e.getSource() == add) {
            num1 = Double.parseDouble(txtfield.getText());
            opr = '+';
            txtfield.setText("");
//            txtfield.setText((txtfield.getText().concat("+")));
        }

        if (e.getSource() == sub) {
            num1 = Double.parseDouble(txtfield.getText());
            opr = '-';
            txtfield.setText("");
//            txtfield.setText((txtfield.getText().concat("-")));
        }

        if (e.getSource() == mul) {
            num1 = Double.parseDouble(txtfield.getText());
            opr = 'x';
            txtfield.setText("");
//            txtfield.setText((txtfield.getText().concat("x")));
        }

        if (e.getSource() == div) {
            num1 = Double.parseDouble(txtfield.getText());
            opr = '/';
            txtfield.setText("");
//            txtfield.setText((txtfield.getText().concat("/")));
        }

        if (e.getSource() == mod) {
            num1 = Double.parseDouble(txtfield.getText());
            opr = '%';
            txtfield.setText("");
//            txtfield.setText((txtfield.getText().concat("%")));
        }

        if (e.getSource() == clr) {
            txtfield.setText("");
        }

        if (e.getSource() == eq) {
            num2 = Double.parseDouble(txtfield.getText());
            if ((num2 == 0) & (opr == '/')) {
                txtfield.setText("Undefined (n/0)");
            } else {
                switch (opr) {

                    case '+':
                        res = num1 + num2;
                        break;

                    case '-':
                        res = num1 - num2;
                        break;

                    case 'x':
                        res = num1 * num2;
                        break;

                    case '/':
                        res = num1 / num2;
                        break;

                    case '%':
                        res = num1 % num2;
                        break;
                }

                txtfield.setText(String.valueOf(res));

            }
        }

    }

}
