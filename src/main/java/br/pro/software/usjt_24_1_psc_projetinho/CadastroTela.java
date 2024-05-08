/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pro.software.usjt_24_1_psc_projetinho;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author andyc
 */
public class CadastroTela extends JFrame implements ActionListener {
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
