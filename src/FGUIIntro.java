import javax.swing.JOptionPane;
public class FGUIIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+name);
		//As showInputDialog returns string
		int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		String food=JOptionPane.showInputDialog("Enter your fav food");
		JOptionPane.showMessageDialog(null, "Your fav food is "+food);
	}

}
