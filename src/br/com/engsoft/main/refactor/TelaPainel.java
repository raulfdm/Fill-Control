package br.com.engsoft.main.refactor;

import br.com.engsoft.controll.ChamarProximoCliente;
import static br.com.engsoft.main.refactor.TelaGuichePadrao.txtSenhaAtual;
import br.com.engsoft.utils.utilitarios;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import net.miginfocom.swing.MigLayout;

public class TelaPainel extends JFrame {

    public static String painelGuiche;
    private JPanel contentPane;
    static JPanel pnlImagens = new JPanel();
    static Rectangle rect = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();

    JLabel pic;
    Timer tm;
    int x = 0;

    public static JLabel lblNumSenha = new JLabel("        ");
    public static JLabel lblNumGuiche = new JLabel("   ");
    public static JLabel lblNumProxSenha = new JLabel("     ");

    String[] list = {
        "C:\\Users\\Raul\\Documents\\GitHub\\Fill-Control\\imagens\\noticia1.png",
        "C:\\Users\\Raul\\Documents\\GitHub\\Fill-Control\\imagens\\noticia2.png",
        "C:\\Users\\Raul\\Documents\\GitHub\\Fill-Control\\imagens\\noticia3.png"
    };

    /**
     * Launch the application.
     *
     * @param args
     */
    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                break;

            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPainel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    TelaPainel frame = new TelaPainel();
                    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    frame.setVisible(true);

                } catch (Exception e) {
                }
            }

        }
        );
    }

    /**
     * Create the frame.
     */
    public TelaPainel() throws InterruptedException {

        initComponents();
        configuracaoTela();
        chamada();
    }

    private void setImagemAnuncios() {
        pic = new JLabel();
        pic.setBounds(0, 0, 1060, 566);

        //Call The Function SetImageSize
        SetImageSize(1);

        //set a timer
        tm = new Timer(5000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if (x >= list.length) {
                    x = 0;
                }
            }
        });

        //add(pic);
        pnlImagens.add(pic);
        tm.start();
        setLayout(null);
    }

    private void SetImageSize(int i) {
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        try {
            Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon newImc = new ImageIcon(newImg);
            pic.setIcon(newImc);
        } catch (Exception e) {
            System.out.println("VAI TOMAR NO CU");
        }

    }

    private void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(rect);
        contentPane = new JPanel();
        setUndecorated(true);
        setPreferredSize(new Dimension((int) rect.getWidth(), (int) rect.getHeight()));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new MigLayout("", "[296px][1060px]", "[74px][605px][60][14.00][60px]"));

        JPanel pnlTitulo = new JPanel();
        pnlTitulo.setBorder(null);
        contentPane.add(pnlTitulo, "cell 0 0 2 1,growx,aligny top");

        JPanel pnlSenha = new JPanel();
        pnlSenha.setBorder(new LineBorder(new Color(0, 0, 0)));
        pnlSenha.setLayout(new MigLayout("", "[106][84]", "[][]"));

        JLabel lblSenha = new JLabel("  SENHA  ");
        lblSenha.setFont(new Font("Lato", Font.PLAIN, 55));
        pnlSenha.add(lblSenha, "cell 0 0 2 1,alignx center,aligny center");

        lblNumSenha.setFont(new Font("Lato", Font.BOLD, 80));
        pnlSenha.add(lblNumSenha, "cell 0 1 2 1,alignx center,aligny center");

        JLabel lblLogo = new JLabel("");
        lblLogo.setHorizontalAlignment(SwingConstants.RIGHT);
        lblLogo.setIcon(new ImageIcon(getClass().getResource("/br/com/engsoft/img/logo64sn.png")));
        pnlTitulo.add(lblLogo);

        JLabel lblMensagem = new JLabel("    DIAMOND BANK    ");
        lblMensagem.setFont(new Font("Lato", Font.BOLD, 60));
        pnlTitulo.add(lblMensagem);

        JLabel lblLogo2 = new JLabel("");
        lblLogo2.setIcon(new ImageIcon(getClass().getResource("/br/com/engsoft/img/logo64sn.png")));
        lblLogo2.setHorizontalAlignment(SwingConstants.RIGHT);
        pnlTitulo.add(lblLogo2);

        JPanel pnlAtendimento = new JPanel();
        pnlAtendimento.add(pnlSenha, "cell 0 0");

        pnlAtendimento.setBorder(null);
        contentPane.add(pnlAtendimento, "cell 0 1,alignx left,growy");
        pnlAtendimento.setLayout(new MigLayout("", "[37px,grow]", "[2][50][][10][][][][][][][]"));

        JPanel pnlGuiche = new JPanel();
        pnlGuiche.setBorder(new LineBorder(new Color(0, 0, 0)));
        pnlAtendimento.add(pnlGuiche, "cell 0 1,grow");
        pnlGuiche.setLayout(new MigLayout("", "[106][84]", "[][]"));

        JLabel lblGuiche = new JLabel(" GUICHE ");
        lblGuiche.setFont(new Font("Lato", Font.PLAIN, 55));
        pnlGuiche.add(lblGuiche, "cell 0 0 2 1,alignx center,aligny center");
        
        lblNumGuiche.setFont(new Font("Lato", Font.BOLD, 80));
        pnlGuiche.add(lblNumGuiche, "cell 0 1 2 1,alignx center,aligny center");

        JLabel lblProximaSenha = new JLabel("PR\u00D3XIMA SENHA");
        lblProximaSenha.setFont(new Font("Lato", Font.PLAIN, 25));
        pnlAtendimento.add(lblProximaSenha, "cell 0 6,alignx center,aligny center");
        
        lblNumProxSenha.setFont(new Font("Lato", Font.PLAIN, 35));
        pnlAtendimento.add(lblNumProxSenha, "cell 0 7,alignx center,aligny center");

        JPanel pnlFooter = new JPanel();
        pnlFooter.setBorder(null);
        contentPane.add(pnlFooter, "cell 0 2 2 3,growx,aligny top");
        pnlFooter.setLayout(new MigLayout("", "[]", "[]"));

        pnlImagens.setBorder(new LineBorder(new Color(0, 0, 0)));
        contentPane.add(pnlImagens, "cell 1 1,grow");
        pnlImagens.setLayout(null);
        
        pnlAtendimento.setBackground(new Color(211, 211, 211));
        pnlGuiche.setBackground(new Color(211, 211, 211));
        pnlFooter.setBackground(new Color(211, 211, 211));
        pnlSenha.setBackground(new Color(211, 211, 211));
        pnlTitulo.setBackground(new Color(211, 211, 211));
        
    }

    private void configuracaoTela() {
        this.getContentPane().setBackground(new Color(211, 211, 211));
        
        setSize((int) rect.getWidth(), (int) rect.getHeight());
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        setImagemAnuncios();
    }

    private void chamada() throws InterruptedException {
        ChamarProximoCliente proximo = new ChamarProximoCliente();

        proximo.fila.setTela("TelaPainel");
        proximo.fila.setGuicheAtendimento(painelGuiche);
        proximo.fila.setData(new utilitarios().dataAtual("dd/MM/yyyy"));

        Thread t = new Thread(proximo);
        //Thread.sleep(10000);
        t.start();

    }

}
