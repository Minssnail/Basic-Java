Import javax.swing.JOptionPane;			//�����
Public class AddSub					//������{}
{									������������ĸ��д��
	public static void main(String[] args)	//��������������{}
	{
		String firstNumber;				//��������ĸСд
String secondNumber;
Int number1;
Int number2;
Int add,sub;
firstNumber=JOptionPane.showInputDialog(�������һ������);
secondNumber=JOptionPane.showInputDialog(������ڶ�������);
number1=Integer.parseInt(firstNumber);
number2=Integer.parseInt(secondNumber);
add=number1+number2;
sub=number1-number2;
JOptionPane.showMessageDialog(null,���������ǡ�+add,�������͡�,JOptionPane.PLAIN_MESSAGE);
JOptionPane.showMessageDialog(null,���������ǡ�+sub,�������,JOptionPane.PLAIN_MESSAGE);
System.exit(0);
	}
}
