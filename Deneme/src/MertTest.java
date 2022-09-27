import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MertTest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MertTest frame = new MertTest();
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
	public MertTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_num = new JLabel("1");
		lbl_num.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl_num.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_num.setBounds(175, 62, 89, 61);
		contentPane.add(lbl_num);
		
		JButton btn_click = new JButton("Increase him !");
		btn_click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = lbl_num.getText();
				int myNum = Integer.parseInt(number);
				myNum++;
				lbl_num.setText(String.valueOf(myNum));
			}
			
			
		});
		btn_click.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_click.setBounds(148, 199, 146, 23);
		contentPane.add(btn_click);
		
		JButton btn_click2 = new JButton("Decrease him !");
		btn_click2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number2 = lbl_num.getText();
				int myNum2 = Integer.parseInt(number2);
				myNum2--;
				lbl_num.setText(String.valueOf(myNum2));
			}
		});
		btn_click2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_click2.setBounds(148, 227, 146, 23);
		contentPane.add(btn_click2);
		
	}
}
