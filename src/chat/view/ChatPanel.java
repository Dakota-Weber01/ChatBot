package chat.view;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JTextArea;
import chat.controller.ChatController;
import chat.view.ChatFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatPanel extends JPanel
{
	private ChatController appController;
	private JButton chatButton;
	private JTextField inputField;
	private JTextArea chatArea;
	private SpringLayout appLayout;
	
	/**
	 * Declaring object names and variables 
	 * @param appController
	 */
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
		/** Setup Panel
		 *  The basic method to set GUI properties
		 */
	}
	private void setupPanel()
	{
	this.setBackground(Color.CYAN);	
	this.setLayout(appLayout);
	this.add(chatButton);
	this.add(inputField);
	this.add(chatArea);
	chatArea.setEnabled(false);
	chatArea.setEditable(false);
	/** Setup Layout
	 *  Its a garbage dump for all the constraints made by the GUI editor.
	 */
	}
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, chatArea, 20, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatArea, 25, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatArea, -25, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 0, SpringLayout.NORTH, inputField);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, 0, SpringLayout.EAST, chatArea);
		appLayout.putConstraint(SpringLayout.NORTH, inputField, 45, SpringLayout.SOUTH, chatArea);
		appLayout.putConstraint(SpringLayout.WEST, inputField, 0, SpringLayout.WEST, chatArea);
	/** Setup Listeners	
	 *  A void which calls a method based on the users action
	 */
	}
	private void setupListeners()
	{
	chatButton.addActionListener(new ActionListener()
 {
		public void actionPerformed(ActionEvent click)
		{
		String userText = inputField.getText();
		String displayText = appController.interactWithChatBot(userText);
		chatArea.append(displayText);
		inputField.setText("");
		}	
	});
 }

}
