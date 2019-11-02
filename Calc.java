import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calc {
    JPanel p0,p01;
    JTextField display;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bPtn,bRezult,bSum,bSub,bMul,bDiv,bOps,bBack,bSe,bSqrt,bPow;
    
Calc() {
        p0 = new JPanel();
        BorderLayout bl=new BorderLayout();
        p0.setLayout(bl);
        display=new JTextField(30);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        p0.add("North",display);
        b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
        b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
        b8=new JButton("8");
		b9=new JButton("9");
		bPtn=new JButton(".");
		bSum=new JButton("+");
		bSub=new JButton("-");
		bMul=new JButton("*");
		bDiv=new JButton("/");
        bOps=new JButton("-/+");
		bBack=new JButton("C");
		bSe=new JButton("CE");
		bSqrt=new JButton("sqrt");
		bPow=new JButton("pow^3");
        p01=new JPanel();
        GridLayout gl=new GridLayout(4,20);
        p01.setLayout(gl);
        p01.add(b0);
        p01.add(b1);
        p01.add(b2);
        p01.add(b3);
        p01.add(b4);
        p01.add(b5);
        p01.add(b6);
        p01.add(b7);
        p01.add(b8);
        p01.add(b9);
        p01.add(bPtn);
        p01.add(bSum);
        p01.add(bSub);
        p01.add(bMul);
        p01.add(bDiv);
        p01.add(bOps);
        p01.add(bBack);
        p01.add(bSe);
        p01.add(bSqrt);
        p01.add(bPow);
        p0.add("Center",p01);
        
        bRezult=new JButton("=");
        p0.add("South",bRezult);
        
        JFrame frame=new JFrame("Calc_ENG");
        frame.setContentPane(p0);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Eng en=new Eng(this);
        b0.addActionListener(en);
        b1.addActionListener(en);
        b2.addActionListener(en);
        b3.addActionListener(en);
        b4.addActionListener(en);
        b5.addActionListener(en);
        b6.addActionListener(en);
        b7.addActionListener(en);
        b8.addActionListener(en);
        b9.addActionListener(en);
        bPow.addActionListener(en);
        bSqrt.addActionListener(en);
        bSe.addActionListener(en);
        bBack.addActionListener(en);
        bOps.addActionListener(en);
        bSum.addActionListener(en);
        bSub.addActionListener(en);
        bMul.addActionListener(en);
        bDiv.addActionListener(en);
        bPtn.addActionListener(en); 
        bRezult.addActionListener(en);
                   }
public class Eng implements ActionListener {
    Calc rodomod;
    char cA=' ';  
    double cR=0;
Eng(Calc rodomod){this.rodomod=rodomod;}
    @Override
public void actionPerformed(ActionEvent e) {
        JButton ib=(JButton)e.getSource();
        String dt=rodomod.display.getText();
        double dV=0; 
        if(!"".equals(dt)){dV=Double.parseDouble(dt);}
        Object src=e.getSource();
             if(src==rodomod.bSum){cA='+';cR=dV;rodomod.display.setText("");}
        else if(src==rodomod.bSub){cA='-';cR=dV;rodomod.display.setText("");}
        else if(src==rodomod.bMul){cA='*';cR=dV;rodomod.display.setText("");}
        else if(src==rodomod.bDiv){cA='/';cR=dV;rodomod.display.setText("");}
else if(src==rodomod.bRezult){
            if(cA=='+'){cR+=dV;rodomod.display.setText(""+cR);}
            if(cA=='-'){cR-=dV;rodomod.display.setText(""+cR);}
            if(cA=='*'){cR*=dV;rodomod.display.setText(""+cR);}
            if(cA=='/'){cR/=dV;rodomod.display.setText(""+cR);}
                   }
else  if(src==rodomod.bPtn){
      String pnt=rodomod.display.getText();
      if(!pnt.contains("."))rodomod.display.setText(rodomod.display.getText()+".");
                      }
else if(src==rodomod.bOps){
      double ops=Double.parseDouble(String.valueOf(rodomod.display.getText()));
      ops*=(-1.D);
      rodomod.display.setText(String.valueOf(ops));
                      }
else if(src==rodomod.bBack){
      String temp=rodomod.display.getText();
      rodomod.display.setText(temp.substring(0,temp.length()-1));
                      }
else if(src==rodomod.bSe){
	rodomod.display.setText("");
                      }
else if(src==rodomod.bSqrt){
      double fm=Double.parseDouble(rodomod.display.getText());
      double sm=Double.parseDouble(rodomod.display.getText());
      String sqrt=rodomod.display.getText();
      if(sqrt.indexOf("")==0)rodomod.display.setText(Math.sqrt(sm*fm/sm)+"");
                      }
else if(src==rodomod.bPow){
      double fs=Double.parseDouble(rodomod.display.getText());
      String pow=rodomod.display.getText();
      if(pow.indexOf("")==0){rodomod.display.setText(Math.pow(fs,3)+"");}
                      }
else {String  iL=ib.getText();
          rodomod.display.setText(dt+iL);}
        }
}	
@SuppressWarnings("unused")
public static void main(String[] args) {
      Calc calc = new Calc();
        }
 }