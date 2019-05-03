package view;

import controller.Controller;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Panel extends JPanel
{
	private Controller appController;
	private JLabel Permutation;
	private JLabel Combination;
	private JTextField PermutationN;
	private JTextField PermutationC;
	private JTextField CombinationN;
	private JTextField CombinationC;
	private JLabel permutationAnswer;
	private JLabel combinationAnswer;
	private SpringLayout appLayout;
	private JButton Calculate;

	public Panel(Controller appController)
	{
		super();
		this.appController = appController;
		Calculate = new JButton("Calculate");
		Permutation = new JLabel("Permutation");
		Combination = new JLabel("Combination");
		permutationAnswer = new JLabel("Permutation Answer");
		combinationAnswer = new JLabel("Combination Answer");
		PermutationN = new JTextField("0");
		PermutationC = new JTextField("0");
		CombinationN = new JTextField("0");
		CombinationC = new JTextField("0");
		appLayout = new SpringLayout();
		appLayout.putConstraint(SpringLayout.NORTH, PermutationC, 6, SpringLayout.SOUTH, Permutation);
		appLayout.putConstraint(SpringLayout.NORTH, permutationAnswer, 5, SpringLayout.NORTH, PermutationN);
		appLayout.putConstraint(SpringLayout.WEST, permutationAnswer, 0, SpringLayout.WEST, combinationAnswer);
		appLayout.putConstraint(SpringLayout.NORTH, CombinationC, 6, SpringLayout.SOUTH, Combination);
		appLayout.putConstraint(SpringLayout.NORTH, combinationAnswer, 5, SpringLayout.NORTH, CombinationN);
		appLayout.putConstraint(SpringLayout.EAST, combinationAnswer, -70, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, PermutationC, 0, SpringLayout.EAST, Calculate);
		appLayout.putConstraint(SpringLayout.EAST, CombinationC, -1, SpringLayout.EAST, Calculate);
		appLayout.putConstraint(SpringLayout.EAST, CombinationN, -1, SpringLayout.EAST, PermutationN);
		appLayout.putConstraint(SpringLayout.WEST, CombinationC, 138, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, CombinationN, 87, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, PermutationC, 12, SpringLayout.EAST, PermutationN);
		appLayout.putConstraint(SpringLayout.EAST, PermutationN, 127, SpringLayout.WEST, this);

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.add(Calculate);
		this.add(permutationAnswer);
		this.add(combinationAnswer);
		this.add(Permutation);
		this.add(Combination);
		this.add(PermutationN);
		this.add(PermutationC);
		this.add(CombinationN);
		this.add(CombinationC);
		this.setLayout(appLayout);
	}

	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, CombinationN, 6, SpringLayout.SOUTH, Combination);
		appLayout.putConstraint(SpringLayout.WEST, Combination, 87, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, Combination, -59, SpringLayout.NORTH, Permutation);
		appLayout.putConstraint(SpringLayout.WEST, Permutation, 0, SpringLayout.WEST, Combination);
		appLayout.putConstraint(SpringLayout.WEST, PermutationN, 88, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, PermutationN, 6, SpringLayout.SOUTH, Permutation);
		appLayout.putConstraint(SpringLayout.SOUTH, PermutationN, -83, SpringLayout.NORTH, Calculate);
		appLayout.putConstraint(SpringLayout.SOUTH, Permutation, -154, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, Calculate, 76, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, Calculate, -10, SpringLayout.SOUTH, this);

	}

	private void setupListeners()
	{

		Calculate.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String permutationN = PermutationN.getText();
				long permutationValueN = Long.parseLong(permutationN);
				String permutationC = PermutationC.getText();
				long permutationValueC = Long.parseLong(permutationC);
				String combinationN = CombinationN.getText();
				long combinationValueN = Long.parseLong(combinationN);
				String combinationC = CombinationC.getText();
				long combinationValueC = Long.parseLong(combinationC);
				if (permutationValueN > 15 || permutationValueC > 15)
				{
					permutationAnswer.setText("Please enter a number less than 15 for n and r");
				}
				else
					//startAbstraction
				{
					permutationAnswer.setText(Long.toString(appController.Permutations(permutationValueN, permutationValueC)));
				}
				//endAbstraction
				if (combinationValueN > 15 || combinationValueC > 15)
				{
					combinationAnswer.setText("Please enter a number less than 15 for n and r");
				}
				else
				{
					combinationAnswer.setText(Long.toString(appController.Combinations(combinationValueN, combinationValueC)));
				}

			}
		});
	}
}
