/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.AlunoDAO;
import dao.CursoDAO;
import dao.PagamentoDAO;
import dao.ParcelaDAO;
import java.awt.Dimension;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import model.Aluno;
import model.Curso;
import model.Pagamento;
import model.Parcela;
import static util.Formata.carregaDiaPagamento;

/**
 *
 * @author Daniel
 */
public class TelaCadastroDePagamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroDePagamento
     */
    public TelaCadastroDePagamento() {
        initComponents();
        carregaDiaPagamento(cbDiavencimento);
        limpaTela();
    }

    Aluno aluno;
    Curso curso;

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
        txtvalorCurso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPercentualDesconto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtValorFinalCurso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbDiavencimento = new javax.swing.JComboBox();
        btLimparPagamento = new javax.swing.JButton();
        btGravarPagamento = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastro de Pagamento");

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

        jLabel4.setText("Valor do Curso:");

        jLabel5.setText("Percentual de Desconto:");

        txtPercentualDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPercentualDescontoFocusLost(evt);
            }
        });

        jLabel6.setText("Valor Final da Mensalidade:");

        jLabel8.setText("Dia de Vencimento:");

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
                .addComponent(txtNomeAluno))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDiavencimento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtvalorCurso))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btBuscarCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPercentualDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorFinalCurso))))
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
                    .addComponent(txtvalorCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPercentualDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtValorFinalCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbDiavencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btGravarPagamento)
                    .addComponent(btLimparPagamento))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparPagamentoActionPerformed
        limpaTela();
    }//GEN-LAST:event_btLimparPagamentoActionPerformed

    private void btBuscarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarAlunoActionPerformed
        AlunoDAO dao = new AlunoDAO();
        aluno = dao.findByCodigo(Integer.parseInt(txtCódigoAluno.getText()));
        txtNomeAluno.setText(aluno.getNome());
    }//GEN-LAST:event_btBuscarAlunoActionPerformed

    private void btBuscarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarCursoActionPerformed
        CursoDAO dao = new CursoDAO();
        curso = dao.findByCodigo(Integer.parseInt(txtCodigoCurso.getText()));
        txtNomeCurso.setText(curso.getNome());
        txtvalorCurso.setText(curso.getValormensalidade()+"");
    }//GEN-LAST:event_btBuscarCursoActionPerformed

    private void btGravarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGravarPagamentoActionPerformed
        PagamentoDAO dao = new PagamentoDAO();
        Pagamento pagamento = new Pagamento();
        pagamento.setAluno(aluno);
        pagamento.setCurso(curso);
        pagamento.setValorCurso(Double.parseDouble(txtvalorCurso.getText()));
        pagamento.setDescontoMensalidade(Integer.parseInt(txtPercentualDesconto.getText()));
        pagamento.setValorFinalMensalidade(Double.parseDouble(txtValorFinalCurso.getText()));
        pagamento.setDiaVencimento(Integer.parseInt(cbDiavencimento.getSelectedItem().toString()));
        pagamento.setCodigo(dao.insert(pagamento));

        Date data = new Date();
        GregorianCalendar dataCal = new GregorianCalendar();
        dataCal.setTime(data);
//        int mes = dataCal.get(Calendar.MONTH);
//        int ano = dataCal.get(Calendar.YEAR);

        ParcelaDAO daoPar = new ParcelaDAO();
        int i = 1;
        while (i <= curso.getDuraçãoCurso()) {
            System.out.println("while "+i);
            Parcela parcela = new Parcela();
            parcela.setNumero(i);
            parcela.setAluno(aluno);
            parcela.setCurso(curso);
            parcela.setPagamento(pagamento);
            parcela.geraDataVencimento(dataCal.MONTH+"", dataCal.YEAR+"");
            dataCal.add(Calendar.MONTH, 1);
            parcela.setStatus("Pendente Fixo");
            daoPar.insert(parcela);
            i++;
        }


    }//GEN-LAST:event_btGravarPagamentoActionPerformed

    private void txtPercentualDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPercentualDescontoFocusLost
        double valorFinal, valor, porcentagem;
        valor = Double.parseDouble(txtvalorCurso.getText());
        porcentagem = Integer.parseInt(txtPercentualDesconto.getText());
        valorFinal = valor * ((porcentagem / 100));
        txtValorFinalCurso.setText(valorFinal + "");
    }//GEN-LAST:event_txtPercentualDescontoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarAluno;
    private javax.swing.JButton btBuscarCurso;
    private javax.swing.JButton btGravarPagamento;
    private javax.swing.JButton btLimparPagamento;
    private javax.swing.JComboBox cbDiavencimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigoCurso;
    private javax.swing.JTextField txtCódigoAluno;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtNomeCurso;
    private javax.swing.JTextField txtPercentualDesconto;
    private javax.swing.JTextField txtValorFinalCurso;
    private javax.swing.JTextField txtvalorCurso;
    // End of variables declaration//GEN-END:variables

    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    
    public void limpaTela(){
        cbDiavencimento.setSelectedIndex(0);
        txtCodigoCurso.setText("");
        txtCódigoAluno.setText("");
        txtNomeCurso.setText("");
        txtNomeAluno.setText("");
        txtPercentualDesconto.setText("0");
        txtValorFinalCurso.setText("0");
        txtvalorCurso.setText("0");
    }
}