package com.mycompany.empchaves;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class TelaInicial extends javax.swing.JFrame {

    ControllerAcao contrAcao;
    TelaInicial ti;
    int aprovado = 0;
    String getFilial;
    ControllerAcao ca;

    public TelaInicial() {

        this.dataehora = new JLabel();

        while (aprovado == 0) {
            getFilial = JOptionPane.showInputDialog(ti, "Digite a Filial");
            switch (getFilial) {
                case "1":
                    setTitle("Gerenciamento de Chaves.           Filial 01 - Paracatu");
                    aprovado = 1;
                    break;
                case "2":
                    setTitle("Gerenciamento de Chaves.           Filial 02 - Sete Lagoas");
                    aprovado = 1;
                    break;
                case "3":
                    setTitle("Gerenciamento de Chaves.           Filial 03 - Passos");
                    aprovado = 1;
                    break;
                case "5":
                    setTitle("Gerenciamento de Chaves.           Filial 05 - Valença");
                    aprovado = 1;
                    break;
                case "6":
                    setTitle("Gerenciamento de Chaves.           Filial 06 - Sorriso");
                    aprovado = 1;
                    break;
                default:
            }

        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
        this.dataehora.setText(dtf.format(LocalDateTime.now()));
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        cadastroemp = new javax.swing.JPanel();
        JTextFilial = new javax.swing.JTextField();
        confemprestimo = new javax.swing.JButton();
        filial = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        matricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nomeFilial = new javax.swing.JTextField();
        nomeAluno = new javax.swing.JTextField();
        usuarioLogado = new javax.swing.JLabel();
        dataehora = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        menuAcao = new javax.swing.JMenu();
        trocaFilial = new javax.swing.JMenuItem();
        efetuarEmprestimo = new javax.swing.JMenuItem();
        cancelarEmprestimo = new javax.swing.JMenuItem();
        relatorios = new javax.swing.JMenu();
        relatorioPorSala = new javax.swing.JMenuItem();
        relChavesPendentes = new javax.swing.JMenuItem();
        relChavesPendentesUsuario = new javax.swing.JMenuItem();
        relChavesDisponiveis = new javax.swing.JMenuItem();
        javax.swing.JMenu listagens = new javax.swing.JMenu();
        ambiente = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        fechar_janela = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N

        JTextFilial.setEditable(false);

        confemprestimo.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOFTWARE\\Documents\\NetBeansProjects\\EMPChaves\\src\\main\\java\\com\\mycompany\\empchaves\\imagens\\icons8-salvar-50.png")); // NOI18N
        confemprestimo.setText("Confirmar");
        confemprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confemprestimoActionPerformed(evt);
            }
        });

        filial.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        filial.setText("Filial: ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Matricula:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Sala:");

        nomeFilial.setEditable(false);

        nomeAluno.setEditable(false);

        javax.swing.GroupLayout cadastroempLayout = new javax.swing.GroupLayout(cadastroemp);
        cadastroemp.setLayout(cadastroempLayout);
        cadastroempLayout.setHorizontalGroup(
            cadastroempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroempLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastroempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(cadastroempLayout.createSequentialGroup()
                        .addComponent(filial, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextFilial, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeFilial, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cadastroempLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomeAluno))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroempLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confemprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        cadastroempLayout.setVerticalGroup(
            cadastroempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroempLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(cadastroempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filial)
                    .addComponent(JTextFilial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeFilial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cadastroempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confemprestimo)
                .addGap(17, 17, 17))
        );

        usuarioLogado.setText("Usuario Logado");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOFTWARE\\Documents\\NetBeansProjects\\EMPChaves\\src\\main\\java\\com\\mycompany\\empchaves\\imagens\\tocha.png")); // NOI18N

        menuAcao.setText("Ações");
        menuAcao.setPreferredSize(new java.awt.Dimension(90, 30));

        trocaFilial.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOFTWARE\\Documents\\NetBeansProjects\\EMPChaves\\src\\main\\java\\com\\mycompany\\empchaves\\imagens\\icons8-alterar-50.png")); // NOI18N
        trocaFilial.setText("Trocar Filial");
        trocaFilial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocaFilialActionPerformed(evt);
            }
        });
        menuAcao.add(trocaFilial);

        efetuarEmprestimo.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOFTWARE\\Documents\\NetBeansProjects\\EMPChaves\\src\\main\\java\\com\\mycompany\\empchaves\\imagens\\icons8-novo-50.png")); // NOI18N
        efetuarEmprestimo.setText("Efetuar Emprestimo");
        efetuarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efetuarEmprestimoActionPerformed(evt);
            }
        });
        menuAcao.add(efetuarEmprestimo);

        cancelarEmprestimo.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOFTWARE\\Documents\\NetBeansProjects\\EMPChaves\\src\\main\\java\\com\\mycompany\\empchaves\\imagens\\icons8-excluir-50.png")); // NOI18N
        cancelarEmprestimo.setText("Cancelar Emprestimo");
        cancelarEmprestimo.setToolTipText("");
        menuAcao.add(cancelarEmprestimo);

        jMenuBar2.add(menuAcao);

        relatorios.setText("Relatórios");
        relatorios.setPreferredSize(new java.awt.Dimension(90, 30));

        relatorioPorSala.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOFTWARE\\Documents\\NetBeansProjects\\EMPChaves\\src\\main\\java\\com\\mycompany\\empchaves\\imagens\\icons8-sala50.png")); // NOI18N
        relatorioPorSala.setText("Relatório Por Sala");
        relatorios.add(relatorioPorSala);

        relChavesPendentes.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOFTWARE\\Documents\\NetBeansProjects\\EMPChaves\\src\\main\\java\\com\\mycompany\\empchaves\\imagens\\icons8-chave-não-no-veículo-50.png")); // NOI18N
        relChavesPendentes.setText("Relatório de Chaves Pendentes");
        relatorios.add(relChavesPendentes);

        relChavesPendentesUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOFTWARE\\Documents\\NetBeansProjects\\EMPChaves\\src\\main\\java\\com\\mycompany\\empchaves\\imagens\\icons8-credenciais-do-usuário-50.png")); // NOI18N
        relChavesPendentesUsuario.setText("Relatório de Chaves Pendentes por Usuário");
        relatorios.add(relChavesPendentesUsuario);

        relChavesDisponiveis.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOFTWARE\\Documents\\NetBeansProjects\\EMPChaves\\src\\main\\java\\com\\mycompany\\empchaves\\imagens\\icons8-chave-50.png")); // NOI18N
        relChavesDisponiveis.setText("Relatório de Chaves Disponíveis");
        relChavesDisponiveis.setToolTipText("");
        relatorios.add(relChavesDisponiveis);

        jMenuBar2.add(relatorios);

        listagens.setText("Listagens");
        listagens.setPreferredSize(new java.awt.Dimension(90, 30));
        jMenuBar2.add(listagens);

        ambiente.setText("Ambiente");
        ambiente.setPreferredSize(new java.awt.Dimension(90, 30));

        logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOFTWARE\\Documents\\NetBeansProjects\\EMPChaves\\src\\main\\java\\com\\mycompany\\empchaves\\imagens\\icons8-desligar-50.png")); // NOI18N
        logout.setText("Logout");
        ambiente.add(logout);

        fechar_janela.setIcon(new javax.swing.ImageIcon("C:\\Users\\SOFTWARE\\Documents\\NetBeansProjects\\EMPChaves\\src\\main\\java\\com\\mycompany\\empchaves\\imagens\\icons8-fechar-janela-50.png")); // NOI18N
        fechar_janela.setText("Fechar");
        fechar_janela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechar_janelaActionPerformed(evt);
            }
        });
        ambiente.add(fechar_janela);

        jMenuBar2.add(ambiente);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(usuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataehora, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 39, Short.MAX_VALUE)
                        .addComponent(cadastroemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cadastroemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usuarioLogado)
                    .addComponent(dataehora, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confemprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confemprestimoActionPerformed
        //emprestimo
    }//GEN-LAST:event_confemprestimoActionPerformed

    private void trocaFilialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trocaFilialActionPerformed

        while (aprovado == 0) {
            getFilial = JOptionPane.showInputDialog(ti, "Digite a Filial");
            switch (getFilial) {
                case "1":
                    setTitle("Gerenciamento de Chaves.           Filial 01 - Paracatu");
                    aprovado = 1;
                    break;
                case "2":
                    setTitle("Gerenciamento de Chaves.           Filial 02 - Sete Lagoas");
                    aprovado = 1;
                    break;
                case "3":
                    setTitle("Gerenciamento de Chaves.           Filial 03 - Passos");
                    aprovado = 1;
                    break;
                case "5":
                    setTitle("Gerenciamento de Chaves.           Filial 05 - Valença");
                    aprovado = 1;
                    break;
                case "6":
                    setTitle("Gerenciamento de Chaves.           Filial 06 - Sorriso");
                    aprovado = 1;
                    break;
                default:
            }

        }
    }//GEN-LAST:event_trocaFilialActionPerformed

    private void efetuarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efetuarEmprestimoActionPerformed

    }//GEN-LAST:event_efetuarEmprestimoActionPerformed

    private void fechar_janelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechar_janelaActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_fechar_janelaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextFilial;
    private javax.swing.JMenu ambiente;
    private javax.swing.JPanel cadastroemp;
    private javax.swing.JMenuItem cancelarEmprestimo;
    private javax.swing.JButton confemprestimo;
    private javax.swing.JLabel dataehora;
    private javax.swing.JMenuItem efetuarEmprestimo;
    private javax.swing.JMenuItem fechar_janela;
    private javax.swing.JLabel filial;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem logout;
    private javax.swing.JTextField matricula;
    private javax.swing.JMenu menuAcao;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JTextField nomeFilial;
    private javax.swing.JMenuItem relChavesDisponiveis;
    private javax.swing.JMenuItem relChavesPendentes;
    private javax.swing.JMenuItem relChavesPendentesUsuario;
    private javax.swing.JMenuItem relatorioPorSala;
    private javax.swing.JMenu relatorios;
    private javax.swing.JMenuItem trocaFilial;
    private javax.swing.JLabel usuarioLogado;
    // End of variables declaration//GEN-END:variables
}
