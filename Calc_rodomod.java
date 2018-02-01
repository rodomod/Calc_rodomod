import javax.swing.*;   
import java.awt.*;   
import java.awt.event.*;
/**
 * 
 * Author@rodomod
 *
 */
public class Calc_rodomod extends JFrame { 
JTextArea display=new JTextArea();  
JPanel buttonPanel=new JPanel(new GridLayout(6,21));
JButton button0=new JButton("0");
JButton button1=new JButton("1");
JButton button2=new JButton("2");
JButton button3=new JButton("3");  
JButton button4=new JButton("4");
JButton button5=new JButton("5");
JButton button6=new JButton("6");
JButton button7=new JButton("7");
JButton button8=new JButton("8");
JButton button9=new JButton("9");
JButton buttonOps=new JButton("+/-");
JButton buttonPoint=new JButton(".");
JButton buttonC=new JButton("C");
JButton buttonSum=new JButton("+");
JButton buttonMul=new JButton("*");
JButton buttonDivide=new JButton("/");
JButton buttonSub=new JButton("-");	
JButton buttonStart=new JButton("=");
JButton buttonDiv=new JButton("2Sqrt");
JButton buttonCE=new JButton("CE");	 
JButton buttonN=new JButton("x^2");	
JButton buttonNS=new JButton("x^3");
JButton buttonNUS=new JButton("x^13");
JButton buttonW=new JButton("3Sqrt");
JButton buttonV=new JButton("x^5");	                   
String operation = "+,-,*,/";
double firstValue;
double secondValue;  
Calc_rodomod(){  
   super("Calc_rodomod");
button0.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (0));   
		           }   
		         });
button1.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (1));   
		           }   
		         });
button2.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (2));   
		           }   
		         });
button3.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (3));   
		           }   
		         });  
button4.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (4));   
		           }   
		         });   
button5.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (5));   
		           }   
		         });	   
button6.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (6));   
		           }   
		         });
button7.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (7));   
		           }   
		         });
button8.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (8));   
		           }   
		         });
button9.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (9));   
   }   
});   
buttonPanel.add(buttonOps);
buttonOps.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		double ops = Double.parseDouble(String.valueOf(display.getText()));
		ops=ops*(-1);
		display.setText(String.valueOf(ops));
		
	}
});
buttonPanel.add(buttonDiv);
buttonDiv.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		double firstValue=Double.parseDouble(display.getText());
		double secondValue=Double.parseDouble(display.getText());
		String d=display.getText();
		if(d.indexOf("")!=0)display.setText(Math.sqrt(firstValue*secondValue/secondValue)+"");
		else if(d.indexOf("")<0)display.setText(Math.sqrt(firstValue*secondValue/secondValue)+"");
		else if(d.indexOf("")>0)display.setText(Math.sqrt(firstValue*secondValue/secondValue)+"");
		else if(d.indexOf("")==0)display.setText(Math.sqrt(firstValue*secondValue/secondValue)+"");
		
   }
});
buttonPanel.add(buttonV);
buttonV.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		double firstValue=Double.parseDouble(display.getText());
		double secondValue=Double.parseDouble(display.getText());
		String d=display.getText();
		if(d.indexOf("")==0)display.setText((firstValue*secondValue*firstValue*secondValue*firstValue)+"");
	}
});
buttonPanel.add(buttonW);
buttonW.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		double firstValue=Double.parseDouble(display.getText());
		double secondValue=Double.parseDouble(display.getText());
		String d=display.getText();
		if(d.indexOf("")!=0)display.setText((secondValue*firstValue*secondValue/firstValue)+"");
	else	if(d.indexOf("")<0)display.setText((secondValue*firstValue*secondValue/firstValue)+"");
	else	if(d.indexOf("")>0)display.setText((secondValue*firstValue*secondValue/firstValue)+"");
	else	if(d.indexOf("")==0)display.setText((secondValue*firstValue*secondValue/firstValue)+"");
	}
});
buttonPanel.add(buttonN);
buttonN.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		double firstValue=Double.parseDouble(display.getText());
		double secondValue=Double.parseDouble(display.getText());
		String d=display.getText();
		if(d.indexOf("")==0)display.setText((firstValue*secondValue)+"");
	}
});
buttonPanel.add(buttonNS);
buttonNS.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		double firstValue=Double.parseDouble(display.getText());
		double secondValue=Double.parseDouble(display.getText());
		String d=display.getText();
		if(d.indexOf("")==0)display.setText((firstValue*secondValue*firstValue)+"");
	}
});
buttonPanel.add(buttonNUS);
buttonNUS.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		double firstValue=Double.parseDouble(display.getText());
		double secondValue=Double.parseDouble(display.getText());
		String d=display.getText();
		if(d.indexOf("")==0)display.setText((secondValue*firstValue*secondValue*firstValue*firstValue*secondValue*firstValue*firstValue*secondValue*firstValue*firstValue*secondValue*firstValue)+"");
	}
});
buttonPanel.add(buttonPoint);
buttonPoint.addActionListener(
  new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
	             String Pnt=display.getText();
	        if(Pnt.indexOf(".")<0)display.setText(display.getText()+ ".");
   }
});	 
buttonPanel.add(buttonC);
buttonC.addActionListener(new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent e){
        		String temp=display.getText();
        		display.setText(temp.substring(0,temp.length()-1));
				
   }
});
buttonPanel.add(buttonCE);
buttonCE.addActionListener(new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent e){
        		String CE=display.getText();
        		display.setText("0"); 
	
   }
});
buttonPanel.add(buttonSum);
buttonSum.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		firstValue=Double.parseDouble(display.getText());
		display.setText("");
		operation="+";
	}
});
buttonPanel.add(buttonMul);
buttonMul.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		firstValue=Double.parseDouble(display.getText());
		display.setText("");
		operation="*";
	}
});
buttonPanel.add(buttonDivide);
buttonDivide.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		firstValue=Double.parseDouble(display.getText());
		display.setText("");
		operation="/";
	}
});
buttonPanel.add(buttonSub);
buttonSub.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		firstValue=Double.parseDouble(display.getText());
		display.setText("");
		operation="-";
	}
});
buttonPanel.add(buttonStart);
 buttonStart.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		double secondValue=Double.parseDouble(display.getText());
	if("+".equals(operation)){
			display.setText((firstValue+secondValue)+"");
		}
else if("-".equals(operation)){
			display.setText((firstValue-secondValue)+"");
		}
else if("*".equals(operation)){
			display.setText((firstValue*secondValue)+"");
		}
else if("/".equals(operation)){
			display.setText((firstValue/secondValue)+"");
		}
	 
		 operation ="+,-,*,/";
		 double firstValue=0.0;
    }
});
setBounds(300,300,300,300);
setLayout(new BorderLayout()); 
add(display ,BorderLayout.NORTH);
add(buttonPanel,BorderLayout.CENTER);
add(buttonStart,BorderLayout.SOUTH); 
buttonPanel.add(button0);
buttonPanel.add(button1);
buttonPanel.add(button2);
buttonPanel.add(buttonSum);
buttonPanel.add(button3);
buttonPanel.add(button4);
buttonPanel.add(button5);
buttonPanel.add(buttonSub);
buttonPanel.add(button6);
buttonPanel.add(button7);
buttonPanel.add(button8);
buttonPanel.add(buttonDivide);
buttonPanel.add(button9);
buttonPanel.add(buttonMul);
buttonPanel.add(buttonPoint); 
buttonPanel.add(buttonDiv);
buttonPanel.add(buttonOps);
buttonPanel.add(buttonCE);
buttonPanel.add(buttonC);
buttonPanel.add(buttonN);
buttonPanel.add(buttonNS);
buttonPanel.add(buttonNUS);
buttonPanel.add(buttonV);
buttonPanel.add(buttonW);
setVisible(true); 
        }
public static void main(String[]args){
	new Calc_rodomod();
    }
}