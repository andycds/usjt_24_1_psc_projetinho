/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pro.software.usjt_24_1_psc_projetinho;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author andyc
 */
public class ClienteTela extends JFrame implements ActionListener {
    private JLabel lblNome, lblEmail, lblIdade;
    private JTextField txtNome, txtEmail, txtIdade;
    private JButton btnSalvar, btnCancelar;
    private JPanel pnlNome, pnlEmailIdade, pnlBotoes;

    public ClienteTela(){
        lblNome = new JLabel("Nome:");
        lblEmail = new JLabel("E-mail");
        lblIdade = new JLabel("Idade:");

        txtNome = new JTextField(20);
        txtEmail = new JTextField(10);
        txtIdade = new JTextField(3);

        btnSalvar = new JButton("Salvar");
        btnCancelar = new JButton("Cancelar");

        setLayout(new GridLayout(3,1));
        pnlNome = new JPanel(new FlowLayout());
        pnlNome.add(lblNome);
        pnlNome.add(txtNome);
        add(pnlNome);

        pnlEmailIdade = new JPanel(new FlowLayout());
        pnlEmailIdade.add(lblEmail);
        pnlEmailIdade.add(txtEmail);
        pnlEmailIdade.add(lblIdade);
        pnlEmailIdade.add(txtIdade);
        add(pnlEmailIdade);

        pnlBotoes = new JPanel(new FlowLayout());
        pnlBotoes.add(btnSalvar);
        pnlBotoes.add(btnCancelar);
        add(pnlBotoes);

        btnSalvar.addActionListener(this);

        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Cliente cliente = new Cliente();
        cliente.setNome(txtNome.getText());
        cliente.setEmail(txtEmail.getText());
        cliente.setIdade(Integer.parseInt(txtIdade.getText()));
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.inserir(cliente);
    }
}
