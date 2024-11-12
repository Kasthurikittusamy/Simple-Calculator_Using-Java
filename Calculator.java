package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Calculator implements ActionListener {  
    private TextField Space;
    private Button one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen;

    public Calculator() {
        Frame f = new Frame("Calculator");
        f.setSize(800, 800);
        f.setLayout(null);
        
        //window closing 
        f.addWindowListener(new WindowAdapter()
        		{
        	public void windowClosing(WindowEvent e)
        	{
        		System.exit(0);
        	}
        	
        		});
        	
  

       
        Space = new TextField("0");
        Space.setBounds(100, 100, 360, 80);
        Space.setBackground(Color.PINK);
        f.add(Space);

        // First row
        one = new Button("1");
        one.setBackground(Color.YELLOW);
        one.setBounds(100, 200, 60, 50);
        f.add(one);
        one.addActionListener(this);  

        two = new Button("2");
        two.setBackground(Color.YELLOW);
        two.setBounds(200, 200, 60, 50);
        f.add(two);
        two.addActionListener(this);

        three = new Button("3");
        three.setBackground(Color.YELLOW);
        three.setBounds(300, 200, 60, 50);
        f.add(three);
        three.addActionListener(this);

        four = new Button("+");
        four.setBackground(Color.PINK);
        four.setBounds(400, 200, 60, 50);
        f.add(four);
        four.addActionListener(this);

        // Second row
        five = new Button("4");
        five.setBackground(Color.YELLOW);
        five.setBounds(100, 300, 60, 50);
        f.add(five);
        five.addActionListener(this);

        six = new Button("5");
        six.setBackground(Color.YELLOW);
        six.setBounds(200, 300, 60, 50);
        f.add(six);
        six.addActionListener(this);

        seven = new Button("6");
        seven.setBackground(Color.YELLOW);
        seven.setBounds(300, 300, 60, 50);
        f.add(seven);
        seven.addActionListener(this);

        eight = new Button("-");
        eight.setBackground(Color.PINK);
        eight.setBounds(400, 300, 60, 50);
        f.add(eight);
        eight.addActionListener(this);

        // Third row
        nine = new Button("7");
        nine.setBackground(Color.YELLOW);
        nine.setBounds(100, 400, 60, 50);
        f.add(nine);
        nine.addActionListener(this);

        ten = new Button("8");
        ten.setBackground(Color.YELLOW);
        ten.setBounds(200, 400, 60, 50);
        f.add(ten);
        ten.addActionListener(this);

        eleven = new Button("9");
        eleven.setBackground(Color.YELLOW);
        eleven.setBounds(300, 400, 60, 50);
        f.add(eleven);
        eleven.addActionListener(this);

        twelve = new Button("*");
        twelve.setBackground(Color.PINK);
        twelve.setBounds(400, 400, 60, 50);
        f.add(twelve);
        twelve.addActionListener(this);

        // Fourth row
        thirteen = new Button("C");
        thirteen.setBackground(Color.PINK);
        thirteen.setBounds(100, 500, 60, 50);
        f.add(thirteen);
        thirteen.addActionListener(this);

        fourteen = new Button("0");
        fourteen.setBackground(Color.PINK);
        fourteen.setBounds(200, 500, 60, 50);
        f.add(fourteen);
        fourteen.addActionListener(this);

        fifteen = new Button("=");
        fifteen.setBackground(Color.PINK);
        fifteen.setBounds(300, 500, 60, 50);
        f.add(fifteen);
        fifteen.addActionListener(this);

        sixteen = new Button("/");
        sixteen.setBackground(Color.PINK);
        sixteen.setBounds(400, 500, 60, 50);
        f.add(sixteen);
        sixteen.addActionListener(this);

        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Button sourceButton = (Button) e.getSource();  
        String buttonLabel = sourceButton.getLabel(); 

        
        if (buttonLabel.equals("0")) {
            String exp = Space.getText();
            exp += "0";
            Space.setText(exp);
        } 
        if (buttonLabel.equals("1")) {
            String exp = Space.getText();
            exp += "1";
            Space.setText(exp);
        } 
        if (buttonLabel.equals("2")) {
            String exp = Space.getText();
            exp += "2";
            Space.setText(exp);
        }
        if (buttonLabel.equals("3")) {
            String exp = Space.getText();
            exp += "3";
            Space.setText(exp);
        }
        if (buttonLabel.equals("4")) {
            String exp = Space.getText();
            exp += "4";
            Space.setText(exp);
        }
        if (buttonLabel.equals("5")) {
            String exp = Space.getText();
            exp += "5";
            Space.setText(exp);
        }
        if (buttonLabel.equals("6")) {
            String exp = Space.getText();
            exp += "6";
            Space.setText(exp);
        }
        if (buttonLabel.equals("7")) {
            String exp = Space.getText();
            exp += "7";
            Space.setText(exp);
        }
        if (buttonLabel.equals("8")) {
            String exp = Space.getText();
            exp += "8";
            Space.setText(exp);
        }
        if (buttonLabel.equals("9")) {
            String exp = Space.getText();
            exp += "9";
            Space.setText(exp);
        }
        if (buttonLabel.equals("C")) {
            Space.setText("0");
        }
        if (buttonLabel.equals("+")) {
            String exp = Space.getText();
            exp += "+";
            Space.setText(exp);
        }
        if (buttonLabel.equals("-")) {
            String exp = Space.getText();
            exp += "-";
            Space.setText(exp);
        }
        if (buttonLabel.equals("*")) {
            String exp = Space.getText();
            exp += "*";
            Space.setText(exp);
        }
        if (buttonLabel.equals("/")) {
            String exp = Space.getText();
            exp += "/";
            Space.setText(exp);
        }
        if(buttonLabel.equals("=")) {
            String exp = Space.getText();
            String str1 = "";
            char str2 = '+';  // Default operator
            String str3 = "";
            
            for (int i = 0; i < exp.length(); i++) {
                if (Character.isDigit(exp.charAt(i))) {
                    str1 += exp.charAt(i);
                } else {
                    str2 = exp.charAt(i);  
                    str3 = exp.substring(i + 1);
                    break;
                }
            }
            
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str3);
            int result;
            
            try {
                switch (str2) {
                    case '+':
                        result = num1 + num2;
                        Space.setText(String.valueOf(result));
                        System.out.println(result);
                        break;
                    case '-':
                        result = num1 - num2;
                        Space.setText(String.valueOf(result));
                        System.out.println(result);
                        break;
                    case '*':
                        result = num1 * num2;
                        Space.setText(String.valueOf(result));
                        System.out.println(result);
                        break;
                    case '/':
                        result = num1 / num2;
                        Space.setText(String.valueOf(result));
                        System.out.println(result);
                        break;
                    default:
                        Space.setText("Operation Invalid");
                }
            } catch (Exception e1) {
                Space.setText("Exception");
            }
        }

        }
        
    public static void main(String[] args) {
        new Calculator();
    }
}
