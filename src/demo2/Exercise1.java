package demo2;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;  
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Exercise1 extends JFrame implements ActionListener{


	private JPanel p1 = new JPanel(); //������� 
	  private JPanel p2 = new JPanel(); //������� 
	  private JTextField t1;   //�ı���1������ʾ������Ϣ  
	  StringBuffer str;//������ַ���
	  JButton[] b=new JButton[10];
	  JButton  b1,b2,b3,b4,b5,b6;//16����ť
	   double x,y;
	  int n;
	public Exercise1() {
		
		 super("������"); 
		   setSize(350,300);  //���ô��ڴ�С
	     setLocationRelativeTo(null);	 //��ʾ���м�  	      
	      Container c = getContentPane(); //�������������� 
	   
	      t1 = new JTextField(25); 
	      t1.setEditable(false); //ֻ����ʾ�����ܱ༭ 
	      
	      p2.add(t1);   //����ı������ 


	      p2.setLayout(new GridLayout(4,4)); //����Ⲽ��Ϊ4��4�� 
	      str=new StringBuffer(); 
	      //ʵ����������ť  
	      for(int i=0;i<10;i++)  //�ֱ�Ϊ������0~9�ŵİ�ť���ñ�ǩ����ע������� 
	      { 
	        String s=""+i; 
	        b[i]= new JButton(s);   
	        b[i].addActionListener(this);   
	      } 	        
	       b1=new JButton("+");
	       b2=new JButton("-");
	       b3=new JButton("*");
	       b4=new JButton("/");    
	       b5=new JButton("=");
	       b6=new JButton("delete");    
        
	      //��ӵ����
	      p1.add(b[7]);
	      p1.add(b[8]);
	      p1.add(b[9]);
	      p1.add(b1);
	      p1.add(b[4]);
	      p1.add(b[5]);
	      p1.add(b[6]); 
	      p1.add(b2);
	      p1.add(b[1]);
	      p1.add(b[2]);
	      p1.add(b[3]);    
	      p1.add(b3);
	      p1.add(b[0]);
	      p1.add(b5);
	      p1.add(b6);
	      p1.add(b4);     
	      p1.setLayout(new GridLayout(4,5,10,10)); 
	      
	      //ע������� 
	         
	      b1.addActionListener(this);
	      b2.addActionListener(this);
	      b3.addActionListener(this);
	      b4.addActionListener(this);
	      b5.addActionListener(this);
	      b6.addActionListener(this);
	   
	      //��������ӵ������Ȼ����ӵ�������
	      c.add(p2); 
	      c.add(p1); 
	      c.setLayout(new FlowLayout()); //����Ϊ˳�򲼾� 
	      //���ô��ڹرն��� 
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���ô��ڹرն��� 
	      setVisible(true);  //����Ϊ�ɼ� 
	     setResizable(true); //��ֹ������ܴ�С 
	    
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")//�������ڷ���������û��ʹ��,ȥ�������ϵĻ�ɫ���棡����
		Exercise1 calculate=new Exercise1();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub	
		
		if(e.getSource()==b6)
		{  
	       t1.setText("0");//����
	       t1.setHorizontalAlignment(JTextField.RIGHT);//�Ҷ���
	       str.setLength(0);
		}
           
              //Double.parseDouble   ���ַ���ת��Ϊdouble����
             //t1.getText().trim()   ��ȡ�ַ�����������
            else if (e.getSource()==b1)//�����ӺŰ�ť���x��ֵ�����y��ֵ 
	    { 
		      x=Double.parseDouble(t1.getText().trim()); 
		      str.setLength(0); 
		      y=0d; 
		      n=0;
		 }else if(e.getSource()==b2)//��������
		 {
			 x=Double.parseDouble(t1.getText().trim()); 
		      str.setLength(0); 
		      y=0d;
		      n=1;
		}else if(e.getSource()==b3)//�˷�����
		{
			x=Double.parseDouble(t1.getText().trim()); 
		      str.setLength(0); 
		      y=0d;
		      n=2;
		}else if(e.getSource()==b4)//��������
		{
			x=Double.parseDouble(t1.getText().trim()); 
		      str.setLength(0); 
		      y=0d;
		      n=3;
		}else if(e.getSource()==b5)//�Ⱥ�
		{
			str.setLength(0);
			switch(n){
			case 0:t1.setText(""+(x+y));break;
			case 1:t1.setText(""+(x-y));break;
			case 2:t1.setText(""+(x*y));break;
			case 3:t1.setText(""+(x/y));break;
			}		
		}else{
		if(e.getSource()==b[0])
		{
			if(t1.getText().trim().equals("0"))//�����ʾ����ʾ��Ϊ�㲻������  
	        {} 
	        else
			t1.setText(str.append(e.getActionCommand()).toString());
			t1.setHorizontalAlignment(JTextField.LEFT); 
			y=Double.parseDouble(t1.getText().trim());
			}
		else 
        { 
        t1.setText(str.append(e.getActionCommand()).toString());  
        t1.setHorizontalAlignment(JTextField.LEFT); 
        y=Double.parseDouble(t1.getText().trim()); 
           }
		}
	}	

}
