import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

class VerticalMenuBar extends JMenuBar {
  private static final LayoutManager grid = new GridLayout(0,1);
  public VerticalMenuBar() {
    setLayout(grid);
  }
}


public class VerticalMenuBarDemo {

  public static void main(final String args[]) {
    JFrame frame = new JFrame("MenuSample Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JMenuBar menuBar = new VerticalMenuBar();

    // File Menu, F - Mnemonic
    JMenu fileMenu = new JMenu("Configurações");
    fileMenu.setMnemonic(KeyEvent.VK_F);
    menuBar.add(fileMenu);

    JMenu editMenu = new JMenu("Edit");
    menuBar.add(editMenu);
    
    frame.setJMenuBar(menuBar);
    frame.setSize(350, 250);
    frame.setVisible(true);
  }
}