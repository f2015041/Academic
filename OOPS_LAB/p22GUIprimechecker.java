import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class p22GUIprimechecker{

              public static int PrimeChecker(int n){
	              int flag=0;
		      int i=n-1;
	              while(i>=2){
		           if(n%i==0){
			     flag=0;
			     break;
			   }
			   else{
			       flag=1;
			   }
		       }
		       return flag;
              
	      }
	      
	      public static void main(String[] args){

              JFrame frame=new JFrame();
	      JButton OKButton=new JButton(" OK ");
	      final int FIELD_WIDTH=25;
	      JTextField inputField=new JTextField(FIELD_WIDTH);
	      inputField.setText("Enter a number ");
	      JTextField outputField=new JTextField(FIELD_WIDTH);
	      outputField.setText(" Prime checker output ");


	      OKButton.addActionListener(new ActionListener()
	      {
	         public void actionPerformed(ActionEvent event){
		         int num=Integer.parseInt(inputField.getText());
			 int p=PrimeChecker(num);
	                 if(p==0)
		         {outputField.setText("Prime=false");
		         }else{
			 outputField.setText("Prime=true");
		        }
	         }
	      });

 									   
	      Container contentPane=frame.getContentPane();
	      contentPane.setLayout(new FlowLayout());
	      contentPane.add(inputField);
	      contentPane.add(OKButton);
	      contentPane.add(outputField);

	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.pack();
	      frame.setVisible(true);
      }

}
