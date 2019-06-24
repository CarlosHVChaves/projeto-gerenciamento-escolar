/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.AlunoDAO;
import dao.CursoDAO;
import dao.NotaDAO;
import java.awt.Dimension;
import model.Aluno;
import model.Curso;
import model.Nota;
import static util.Formata.carregaStatusNota;
import static util.Formata.carregaStatusNotaFinal;

/**
 *
 * @author Daniel
 */
public class TelaCadastroDeNota extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroDeNotas
     */
    public TelaCadastroDeNota() {
        initComponents();
        carregaStatusNota(cbStatusAluno);
        carregaStatusNotaFinal(cbStatusFinal);
        limpaTela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCódigoAluno = new javax.swing.JTextField();
        btBuscarAluno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCodigoCurso = new javax.swing.JTextField();
        btBuscarCurso = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNomeCurso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFaltaAluno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNotaAluno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbStatusAluno = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNotaFinal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbStatusFinal = new javax.swing.JComboBox();
        btLimparPagamento = new javax.swing.JButton();
        btGravarPagamento = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastro de Nota");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Principal"));

        jLabel2.setText("Código do Aluno:");

        btBuscarAluno.setText("Buscar");
        btBuscarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarAlunoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome do Aluno:");

        jLabel7.setText("Código do Curso:");

        btBuscarCurso.setText("Buscar");
        btBuscarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarCursoActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome do Curso:");

        jLabel4.setText("Faltas:");

        jLabel5.setText("Nota:");

        jLabel6.setText("Status:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCódigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBuscarAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFaltaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNotaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbStatusAluno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBuscarCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeCurso))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCódigoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarAluno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFaltaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtNotaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cbStatusAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Recuperação"));

        jLabel8.setText("Nota Final:");

        jLabel9.setText("Status Final:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNotaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbStatusFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNotaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cbStatusFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btLimparPagamento.setText("Limpar");
        btLimparPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparPagamentoActionPerformed(evt);
            }
        });

        btGravarPagamento.setText("Salvar");
        btGravarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGravarPagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimparPagamento)
                .addGap(18, 18, 18)
                .addComponent(btGravarPagamento)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGravarPagamento)
                    .addComponent(btLimparPagamento))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparPagamentoActionPerformed
        limpaTela();
    }//GEN-LAST:event_btLimparPagamentoActionPerformed

    private void btBuscarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarAlunoActionPerformed
        AlunoDAO dao = new AlunoDAO();
        Aluno aluno = dao.findByCodigo(Integer.parseInt(txtCódigoAluno.getText()));
        txtNomeAluno.setText(aluno.getNome());
    }//GEN-LAST:event_btBuscarAlunoActionPerformed

    private void btBuscarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarCursoActionPerformed
        CursoDAO dao = new CursoDAO();
        Curso curso = dao.findByCodigo(Integer.parseInt(txtCodigoCurso.getText()));
        txtNomeCurso.setText(curso.getNome());
    }//GEN-LAST:event_btBuscarCursoActionPerformed

    private void btGravarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarPagamentoActionPerformed
        NotaDAO daoN = new NotaDAO();
        Nota nota = new Nota();
        nota.setCodAluno(Integer.parseInt(txtCódigoAluno.getText()));
        nota.setCodCurso(Integer.parseInt(txtCodigoCurso.getText()));
        nota.setFaltas(Integer.parseInt(txtFaltaAluno.getText()));
        nota.setNota(Integer.parseInt(txtNotaAluno.getText()));
        nota.setStatus(cbStatusAluno.getSelectedItem().toString());
        nota.setNotaFinal(Integer.parseInt(txtNotaFinal.getText()));
        nota.setStatusFinal(cbStatusFinal.getSelectedItem().toString());
        daoN.insert(nota);
    }//GEN-LAST:event_btGravarPagamentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarAluno;
    private javax.swing.JButton btBuscarCurso;
    private javax.swing.JButton btGravarPagamento;
    private javax.swing.JButton btLimparPagamento;
    private javax.swing.JComboBox cbStatusAluno;
    private javax.swing.JComboBox cbStatusFinal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCodigoCurso;
    private javax.swing.JTextField txtCódigoAluno;
    private javax.swing.JTextField txtFaltaAluno;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtNomeCurso;
    private javax.swing.JTextField txtNotaAluno;
    private javax.swing.JTextField txtNotaFinal;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public void limpaTela() {
        cbStatusAluno.setSelectedIndex(0);
        cbStatusFinal.setSelectedIndex(0);
        txtCodigoCurso.setText("");
        txtCódigoAluno.setText("");
        txtFaltaAluno.setText("");
        txtNomeCurso.setText("");
        txtNomeAluno.setText("");
        txtNotaAluno.setText("0");
        txtNotaFinal.setText("0");
    }
}