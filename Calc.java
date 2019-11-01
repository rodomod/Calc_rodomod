import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc {
    JPanel winContent,p1;
    JTextField display;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bPtn,bEquals,bSum,bSub,bMul,bDiv,bOps,bBack,bse,bSqrt,bPow;
    
Calc(){
        winContent = new JPanel();
        BorderLayout bl=new BorderLayout();
        winContent.setLayout(bl);
        display=new JTextField(30);
        winContent.add("North",display);
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
		bse=new JButton("CE");
		bSqrt=new JButton("sqrt");
		bPow=new JButton("pow^3");
        p1=new JPanel();
        GridLayout gl=new GridLayout(4,20);
        p1.setLayout(gl);
        
        p1.add(b0);p1.add(b1);p1.add(b2);p1.add(b3);p1.add(b4);p1.add(b5);
        p1.add(b6);p1.add(b7);p1.add(b8);p1.add(b9);
        p1.add(bPtn);p1.add(bSum);p1.add(bSub);p1.add(bMul);
        p1.add(bDiv);p1.add(bOps);p1.add(bBack);p1.add(bse);p1.add(bSqrt);p1.add(bPow);
        winContent.add("Center",p1);
        
        bEquals=new JButton("=");
        winContent.add("South",bEquals);
        
        JFrame frame=new JFrame("Calc_ENG");
        frame.setContentPane(winContent);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CalcEngine calcen=new CalcEngine(this);
        bPow.addActionListener(calcen);bSqrt.addActionListener(calcen);bse.addActionListener(calcen);
        bBack.addActionListener(calcen);bOps.addActionListener(calcen);
        bEquals.addActionListener(calcen);bSum.addActionListener(calcen);
        bSub.addActionListener(calcen);bMul.addActionListener(calcen);
        bDiv.addActionListener(calcen);bPtn.addActionListener(calcen);
        b0.addActionListener(calcen);b1.addActionListener(calcen);
        b2.addActionListener(calcen);b3.addActionListener(calcen);
        b4.addActionListener(calcen);b5.addActionListener(calcen);
        b6.addActionListener(calcen);b7.addActionListener(calcen);
        b8.addActionListener(calcen);b9.addActionListener(calcen);
                    }
public class CalcEngine implements ActionListener {
    Calc parent;
    char selAction=' ';  
    double curRes=0;
  CalcEngine(Calc parent){this.parent=parent;}
    @Override
 public void actionPerformed(ActionEvent e){
        JButton clickedButton=(JButton)e.getSource();
        String dspText=parent.display.getText();
        double dspValue=0; 
        if(!"".equals(dspText)){dspValue=Double.parseDouble(dspText);}
        Object src=e.getSource();
             if(src==parent.bSum){selAction='+';curRes=dspValue;parent.display.setText("");}
        else if(src==parent.bSub){selAction='-';curRes=dspValue;parent.display.setText("");}
        else if(src==parent.bMul){selAction='*';curRes=dspValue;parent.display.setText("");}
        else if(src==parent.bDiv){selAction='/';curRes=dspValue;parent.display.setText("");}
else if(src==parent.bEquals){
            if(selAction=='+'){curRes+=dspValue;parent.display.setText(""+curRes);}
            if(selAction=='-'){curRes-=dspValue;parent.display.setText(""+curRes);}
            if(selAction=='*'){curRes*=dspValue;parent.display.setText(""+curRes);}
            if(selAction=='/'){curRes/=dspValue;parent.display.setText(""+curRes);}
                   }
else  if(src==parent.bPtn){
      String ptn=parent.display.getText();
      if(!ptn.contains("."))parent.display.setText(parent.display.getText()+".");
                      }
else if(src==parent.bOps){
      double ops=Double.parseDouble(String.valueOf(parent.display.getText()));
      ops*=(-1.D);
      parent.display.setText(String.valueOf(ops));
                      }
else if(src==parent.bBack){
      String temp=parent.display.getText();
      parent.display.setText(temp.substring(0,temp.length()-1));
                      }
else if(src==parent.bse){
	parent.display.setText("");
                      }
else if(src==parent.bSqrt){
      double fm=Double.parseDouble(parent.display.getText());
      double sm=Double.parseDouble(parent.display.getText());
      String sqrt=parent.display.getText();
      if(sqrt.indexOf("")==0)parent.display.setText(Math.sqrt(sm*fm/sm)+"");
                      }
else if(src==parent.bPow){
      double fs=Double.parseDouble(parent.display.getText());
      String pow=parent.display.getText();
      if(pow.indexOf("")==0){parent.display.setText(Math.pow(fs,3)+"");}
                      }
else {String  clickedButtonLabel=clickedButton.getText();
          parent.display.setText(dspText+clickedButtonLabel);}
            }

}	
@SuppressWarnings("unused")
public static void main(String[] args) {
      Calc calc = new Calc();
    }
 }