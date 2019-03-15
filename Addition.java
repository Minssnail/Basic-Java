Import javax.swing.JOptionPane;			//导入包
Public class AddSub					//创建类{}
{									（类名：首字母大写）
	public static void main(String[] args)	//主函数（方法）{}
	{
		String firstNumber;				//变量首字母小写
String secondNumber;
Int number1;
Int number2;
Int add,sub;
firstNumber=JOptionPane.showInputDialog(“输入第一个数”);
secondNumber=JOptionPane.showInputDialog(“输入第二个数”);
number1=Integer.parseInt(firstNumber);
number2=Integer.parseInt(secondNumber);
add=number1+number2;
sub=number1-number2;
JOptionPane.showMessageDialog(null,”两数和是”+add,”两数和”,JOptionPane.PLAIN_MESSAGE);
JOptionPane.showMessageDialog(null,”两数差是”+sub,”两数差”,JOptionPane.PLAIN_MESSAGE);
System.exit(0);
	}
}
