package atividadess;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class teste extends JFrame {

    private JTextField input;
    private JLabel label;

    public teste() {
        setTitle("Oficina");
        setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JButton btnCliente = new JButton("  Cliente");
        JButton btnFornecedor = new JButton("Fornecedor");
        JButton btnAgendamento = new JButton("Agendamento");
        JButton btncontroleestoque = new JButton("Controle de estoque");
        JButton btnrelatorio = new JButton("Relatório");
        JButton btnpagamento = new JButton("Pagamento");


        btnCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnFornecedor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnAgendamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btncontroleestoque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnrelatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnpagamento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });




        JPanel panel = new JPanel();

        panel.add(btnCliente);
        panel.add(btnFornecedor);
        panel.add(btnAgendamento);
        panel.add(btncontroleestoque);
        panel.add(btnrelatorio);
        panel.add(btnpagamento);
        add(panel);

        setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new teste().setVisible(true);
            }
        });

    }
}
