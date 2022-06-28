package br.com.tjdiego.docsus.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Diego
 */
public class Tela extends JFrame implements ItemListener {

    public JPanel panel;
    private JMenu menuNovo, menuPesquisar, menuAjuda, menuSair, home;
    private JMenuBar menuBarra;
    private JMenuItem cadastrarPaciente, cadastrarMedico, cadastrarDentista,
            cadastrarEnfermeiro, cadastrarAgente,
            cadastrarConsulta, cadastrarVisita, sobre;
    private JLabel fundo;

    public Tela() {
        menuBarra = new JMenuBar();
        menuBarra.setSize(800, 20);
        menuNovo = new JMenu("Novo");
        menuNovo.addSeparator();
        menuNovo.setMnemonic('n');
        menuBarra.add(menuNovo);
        cadastrarPaciente = new JMenuItem("Paciente");
        cadastrarPaciente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TelaCadastroPaciente();
                dispose();
            }
        });
        menuNovo.add(cadastrarPaciente);
        cadastrarMedico = new JMenuItem("Médico");
        cadastrarMedico.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TelaCadastroMedico();
                dispose();
            }
        });
        menuNovo.add(cadastrarMedico);
        cadastrarDentista = new JMenuItem("Dentista");
        cadastrarDentista.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TelaCadastroDentista();
                dispose();
            }
        });
        menuNovo.add(cadastrarDentista);
        cadastrarEnfermeiro = new JMenuItem("Enfermeiro");
        cadastrarEnfermeiro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TelaCadastroEnfermeiro();
                dispose();
            }
        });
        menuNovo.add(cadastrarEnfermeiro);
        cadastrarAgente = new JMenuItem("Agente");
        cadastrarAgente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TelaCadastroAgente();
                dispose();
            }
        });
        menuNovo.add(cadastrarAgente);
        cadastrarConsulta = new JMenuItem("Consulta");
        cadastrarConsulta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TelaCadastroConsulta();
                dispose();
            }
        });
        menuNovo.add(cadastrarConsulta);
        cadastrarVisita = new JMenuItem("Visita");
        cadastrarVisita.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TelaCadastroVisita();
                dispose();
            }
        });
        menuNovo.add(cadastrarVisita);
        menuPesquisar = new JMenu("Pesquisar");
        menuPesquisar.setMnemonic('p');
        menuPesquisar.addItemListener(this);
        menuBarra.add(menuPesquisar);
        menuAjuda = new JMenu("Ajuda");
        menuAjuda.setMnemonic('a');
        menuBarra.add(menuAjuda);
        sobre = new JMenuItem("Sobre");
        sobre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new TelaAbout();
            }
        });
        menuAjuda.add(sobre);
        home = new JMenu("Inicial");
        home.setMnemonic('i');
        menuBarra.add(home);
        home.addItemListener(this);
        menuSair = new JMenu("Sair");
        menuSair.setMnemonic('s');
        menuBarra.add(menuSair);
        menuSair.addItemListener(this);
        panel = new JPanel();
        panel.setSize(800, 600);
        panel.setLayout(null);
        panel.setVisible(true);
        panel.add(menuBarra);
        setTitle("MedicALL");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(panel);
        setLocationRelativeTo(null);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == menuPesquisar) {
            dispose();
            new TelaPesquisa();
        } else if (e.getSource() == home) {
            new TelaPrincipal();
            dispose();
        } else if (e.getSource() == menuSair) {
            new Login();
            dispose();
        }
    }

    
}
