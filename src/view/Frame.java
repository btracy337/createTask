package view;
import javax.swing.*;

import view.Panel;
import controller.Controller;
public class Frame extends JFrame
{
private Panel guiPanel;
private Controller controller;
public Frame(Controller controller)
{
	super();
	this.controller = controller;
	this.guiPanel =  new Panel(controller);
	
	setupFrame();
}
public void setupFrame()
{
	this.setContentPane(guiPanel);
	this.setSize(1000,800);
	this.setTitle("Permutations and Combinations");
	this.setResizable(false);
	this.setVisible(true);
	
}
}
