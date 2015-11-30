package diversos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public final class TesteBox2 extends JFrame {

    private static JPanel contentPane;
    static JPanel panel_3 = new JPanel();
    static Rectangle rect = GraphicsEnvironment.getLocalGraphicsEnvironment()
            .getMaximumWindowBounds();
  

    String[] list = {
        "C:\\Users\\Raul\\Documents\\GitHub\\Fill-Control\\imagens\\noticia1.jpg",
        "C:\\Users\\Raul\\Documents\\GitHub\\Fill-Control\\imagens\\noticia2.jpg",
        "C:\\Users\\Raul\\Documents\\GitHub\\Fill-Control\\imagens\\noticia3.jpg"
    };

   

    

    /**
     * Launch the application.
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    TesteBox2 frame = new TesteBox2();

                    frame.setVisible(true);

                    System.out.println("Tamanho da resolução: " + (int) rect.getBounds().getWidth() + " x "
                            + (int) rect.getBounds().getHeight()
                            + "\nTamanho do Painel de imagens: " + (int) panel_3.bounds().getWidth() + " x "
                            + (int) panel_3.bounds().getHeight());
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }

    /**
     * Create the frame.
     */
    public TesteBox2() {
        Rectangle rect = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getMaximumWindowBounds();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(rect);
        contentPane = new JPanel();

        setUndecorated(true);
        setPreferredSize(new Dimension((int) rect.getWidth(), (int) rect.getHeight()));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        contentPane.add(panel, BorderLayout.NORTH);

        JLabel label = new JLabel("");
        label.setHorizontalAlignment(SwingConstants.RIGHT);
        label.setIcon(new ImageIcon("C:\\Users\\Raul\\Documents\\GitHub\\Fill-Control\\src\\br\\com\\engsoft\\img\\queen8 .png"));
        panel.add(label);

        JLabel lblBemVindoAo = new JLabel("BEM VINDO AO BANCO CENTRAL");
        lblBemVindoAo.setFont(new Font("Tahoma", Font.PLAIN, 36));
        panel.add(lblBemVindoAo);

        JLabel label_1 = new JLabel("");
        label_1.setIcon(new ImageIcon("C:\\Users\\Raul\\Documents\\GitHub\\Fill-Control\\src\\br\\com\\engsoft\\img\\queen8 .png"));
        label_1.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.add(label_1);

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        contentPane.add(panel_1, BorderLayout.WEST);
        panel_1.setLayout(new MigLayout("", "[37px][31px][46px]", "[14px][]"));

        JLabel lblSenha = new JLabel("SENHA:");
        lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
        lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 30));
        panel_1.add(lblSenha, "cell 0 0,alignx left,aligny top");

        JLabel lblN = new JLabel("N0001");
        lblN.setHorizontalAlignment(SwingConstants.CENTER);
        lblN.setFont(new Font("Tahoma", Font.PLAIN, 40));
        panel_1.add(lblN, "cell 1 0,alignx left,aligny top");

        JLabel lblGuich = new JLabel("GUICH\u00CA");
        panel_1.add(lblGuich, "cell 0 1");

        JLabel lblA = new JLabel("A01");
        panel_1.add(lblA, "cell 1 1");

      

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        contentPane.add(panel_2, BorderLayout.SOUTH);
      
        panel_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        contentPane.add(panel_3, BorderLayout.CENTER);

    }

}
