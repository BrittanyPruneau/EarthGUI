package practiceTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class EarthGUI extends JFrame
{

	private JPanel contentPane;
	private static final long serialVersionUID = -7046163230302554575L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					EarthGUI frame = new EarthGUI();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EarthGUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel controlPanel = cntrlPanelSouth();
		contentPane.add(controlPanel, BorderLayout.SOUTH);

	}

	private JPanel cntrlPanelSouth()
	{
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JCheckBox chckbxBlue = new JCheckBox("Blue ");
		chckbxBlue.setVerticalAlignment(SwingConstants.BOTTOM);
		controlPanel.add(chckbxBlue);
		
		JCheckBox chckbxBlue_1 = new JCheckBox("Blue ");
		chckbxBlue_1.setVerticalAlignment(SwingConstants.BOTTOM);
		controlPanel.add(chckbxBlue_1);
		
		JCheckBox chckbxBlue_2 = new JCheckBox("Blue ");
		chckbxBlue_2.setVerticalAlignment(SwingConstants.BOTTOM);
		controlPanel.add(chckbxBlue_2);
		return controlPanel;
	}

}
