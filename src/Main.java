import java.awt.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;


class Main
{
    public static void main(String args[])
    {
        bmi object = new bmi();
    }
}


class bmi extends JFrame
{
    Border border = BorderFactory.createLineBorder(Color.black);
    JFrame frame = new JFrame();
    JLabel w = new JLabel();
    JTextField wi= new JTextField();
    JLabel h = new JLabel();
    JTextField hi = new JTextField();
    JButton button = new JButton("Calculate");
    JLabel v = new JLabel("Your BMI Value");
    JLabel vo = new JLabel();
    JLabel s = new JLabel("Status");
    JLabel so = new JLabel();




    bmi()//frame
    {
        frame.setTitle("BMI Calculator v.1.0");
        frame.setSize(300,320);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setLayout(null);



        w.setText("Enter weight (Kg):"); //weight
        w.setBounds(20,50,150,20);
        frame.add(w);

        wi.setBounds(130,50,100,20);
        frame.add(wi);


        h.setText("Enter height (m)  :");//height
        h.setBounds(20,100,150,20);
        frame.add(h);

        hi.setBounds(130,100,100,20);
        frame.add(hi);

        button.setBounds(95,130,100,25);//button
        frame.add(button);

        v.setBounds(100,180,150,20);// bmi value
        frame.add(v);

        vo.setBounds(110,200,100,20);
        frame.add(vo);

        s.setBounds(120,220,150,20);//status
        frame.add(s);

        so.setBounds(120,240,100,20);
        frame.add(so);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                float a = Float.parseFloat(wi.getText());
                float b = Float.parseFloat(hi.getText());
                Double c = a/Math.pow(b,2);
                vo.setText(c+" Kg/m\u00b2");

                if(c<18.5)
                    //so.setForeground(Color.CYAN);
                    so.setText("Underweight");
                else if(c<=24.9 && c>=18.5)
                    //so.setForeground(Color.GREEN);
                    so.setText("Normal");
                else if(c<=29.9 && c>=25)
                    //so.setForeground(Color.ORANGE);
                    so.setText("Overweight");
                else
                    //so.setForeground(Color.RED);
                    so.setText("Obese");

            }
        });
    }
}