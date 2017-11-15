package chat.view;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JTextArea;
import chat.controller.ChatController;
import chat.view.ChatFrame;
import java.awt.Color;

public class ChatPanel extends JPanel
{
	private ChatController appController;
	private JButton chatButton;
	private JTextField inputField;
	private JTextArea chatArea;
	private SpringLayout appLayout;
	
	public ChatPanel(ChatController appController)
	{
		super();
		this.appController = appController;
		
		//Initialize GUI data members
		chatButton = new JButton("chat");
		chatArea = new JTextArea(10,25);
		inputField = new JTextField(20);
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
	this.setBackground(Color.CYAN);	
	this.setLayout(appLayout);
	this.add(chatButton);
	this.add(inputField);
	this.add(chatArea);
	}
	private void setupLayout()
	{
		
	}
	private void setupListeners()
	{
		
	}
	
	
}
