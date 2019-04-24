package view;
import controller.Controller;
import javax.swing.*;
import java.awt.Color;
import java.awt.*;
public class Panel extends JPanel
{
private Controller appController;
private JLabel Permutation;
private JLabel Combination;
private JTextField PermutationN;
private JTextField PermutationC;
private JTextField CombinationN;
private JTextField CombinationC;
private SpringLayout appLayout;
public Panel(Controller appController)
{
	super();
	this.appController = appController;
	Permutation = new JLabel("Permutation");
	Combination = new JLabel("Combination");
	PermutationN = new JTextField("");
	PermutationC = new JTextField("");
	CombinationN = new JTextField("");
	CombinationC = new JTextField("");
	appLayout = new SpringLayout();
	setupPanel();
	setupLayout();
	setupListeners();
}
private void setupPanel()
{
	
}
private void setupLayout()
{
	
	
}
private void setupListeners()
{
	
}
}
