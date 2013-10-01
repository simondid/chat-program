import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField textAddress;
	private JLabel lblAddress;
	private JTextField textPort;
	private JLabel lblPort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(172, 189);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setToolTipText("enter user name");
		txtName.setBounds(64, 25, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 28, 46, 14);
		contentPane.add(lblName);
		
		textAddress = new JTextField();
		textAddress.setBounds(64, 56, 86, 20);
		contentPane.add(textAddress);
		textAddress.setColumns(10);
		
		lblAddress = new JLabel("address");
		lblAddress.setBounds(10, 59, 46, 14);
		contentPane.add(lblAddress);
		
		textPort = new JTextField();
		textPort.setBounds(64, 87, 86, 20);
		contentPane.add(textPort);
		textPort.setColumns(10);
		
		lblPort = new JLabel("Port");
		lblPort.setBounds(10, 90, 46, 14);
		contentPane.add(lblPort);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(61, 128, 89, 23);
		contentPane.add(btnLogin);
	}
}
