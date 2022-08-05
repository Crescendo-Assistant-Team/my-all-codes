import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class book implements ActionListener
{
    JFrame jfrm;
    JPanel jpl;
    JLabel jlcode,jlname,jlprice,jldis,jlnet;
    JTextField jtcode,jtname,jtdis,jtprice,jtnet;
    JButton jtbill;
    book()
    {
        jfrm=new JFrame("Book shopping");
        jfrm.setSize(300,400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jpl=new JPanel();
        jlcode=new JLabel("Book code");
        jlname=new JLabel("Book name");
        jlprice=new JLabel("Price");
        jldis=new JLabel("Discount");
        jlnet=new JLabel("Net amount");
        jtcode=new JTextField(10);
        jtname=new JTextField(10);
        jtprice=new JTextField(10);
        jtdis=new JTextField(10);
        jtnet=new JTextField(10);
        jtbill=new JButton("Calculate bill");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jpl.add(jlcode);
        jpl.add(jtname);
        jpl.add(jlname);
        jpl.add(jtname);
        jpl.add(jlprice);
        jpl.add(jtprice);
        jpl.add(jldis);
        jpl.add(jtdis);
        jpl.add(jlnet);
        jpl.add(jtnet);
        jpl.add(jtbill);
        jfrm.getContentPane().add(jpl);
        jtdis.setEditable(false);
        jtdis.setEditable(false);
        jtbill.addActionListener(this);
        jfrm.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        int code=Integer.parseInt(jtcode.getText());
        float price,disc,net;
        price=Float.parseFloat(jtprice.getText());
        if (code==101)
            disc=price*0.15f;
        else if (code==102)
            disc=price*0.2f;
        else if(code==103)
            disc=price*0.25f;
        else
            disc=price+0.05f;
        net=price-disc;
        jtdis.setText(Float.toString(disc));
        jtdis.setText(Float.toString(net));
        }
        public static void main(String[] args)
        {
            new book();
        }
    }
