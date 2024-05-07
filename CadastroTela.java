import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroTela extends JFrame implements ActionListener{
    JButton btnCriar, btnListar, btnExcluir, btnAtualizar, btnSair;

    public CadastroTela(){
        btnCriar = new JButton("Criar...");
        btnListar = new JButton("Listar...");
        btnExcluir = new JButton("Excluir...");
        btnAtualizar = new JButton("Atualizar...");
        btnSair = new JButton("Sair");

        setLayout(new GridLayout(5, 1));
        add(btnCriar);
        add(btnListar);
        add(btnAtualizar);
        add(btnExcluir);
        add(btnSair);

        btnCriar.addActionListener(this);
        
        btnAtualizar.setEnabled(false);
        btnExcluir.setEnabled(false);

        setSize(150, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ClienteTela tela = new ClienteTela();
        tela.setLocationRelativeTo(this);
    }
}
