import javax.swing.JFrame;
import java.awt.FlowLayout;
import edu.kinkaid.hhowe.mineSweeper.*;

public class MineSweeper extends JFrame 
{
	public static void main(String[] args)
	{
		MineSweeper app = new MineSweeper();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MineSweeper()
	{
		super("MineSweeper");
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(new MinePanel());
		setSize(MineSquare.size*MinePanel.numCellsAcross+10,MineSquare.size*MinePanel.numCellsDown+70);
		setVisible(true);
		setResizable(false);
	}
}
