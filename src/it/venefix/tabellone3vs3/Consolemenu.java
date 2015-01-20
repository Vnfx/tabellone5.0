package it.venefix.tabellone3vs3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Venefix
 */
public class Consolemenu extends javax.swing.JFrame {
    
    private Tabellone tabellone;

    /**
     * Creates new form Consolemenu
     */
    public Consolemenu() {
        initComponents();
        tabellone = new Tabellone();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tipogara = new javax.swing.ButtonGroup();
        jConsNomeCasa = new javax.swing.JTextField();
        jConsTimerLabel = new javax.swing.JLabel();
        jConsInizio = new javax.swing.JButton();
        jConsPausa = new javax.swing.JButton();
        jConsTimeMin = new javax.swing.JTextField();
        jConsTimeSec = new javax.swing.JTextField();
        jConsLabelVenefix = new javax.swing.JLabel();
        jConsLabelFalliOsp = new javax.swing.JLabel();
        jConsLabelFalliCasa = new javax.swing.JLabel();
        jCons24Reset = new javax.swing.JButton();
        jCons24s = new javax.swing.JSpinner();
        //int n = (Integer) jConsPuntiCasa.getValue ();
        //        if (n == 4) {
            //            System.out.println("vincitoreeee!");
            //}
        jConsPuntiCasa = new javax.swing.JSpinner();
        jConsFallicasa = new javax.swing.JSpinner();
        jConsFalliOsp = new javax.swing.JSpinner();
        jConsPuntiOps = new javax.swing.JSpinner();
        jCons24StartStop = new javax.swing.JToggleButton();
        jConsBonusCasa = new javax.swing.JPanel();
        jConsBonusOsp = new javax.swing.JPanel();
        jConsPartiteView = new javax.swing.JButton();
        jConsTabView = new javax.swing.JButton();
        jConsGiocatoriView = new javax.swing.JButton();
        jConsFischio = new javax.swing.JButton();
        jConsGirone = new javax.swing.JRadioButton();
        jConsFinale = new javax.swing.JRadioButton();
        jCons3p = new javax.swing.JRadioButton();
        jConsTipoGaraframe = new javax.swing.JPanel();
        jConsNomeOsp = new javax.swing.JTextField();
        jConsSfondo = new javax.swing.JLabel();
        jConsMenuBar = new javax.swing.JMenuBar();
        jConsMenu1 = new javax.swing.JMenu();
        jConsMenuOpz = new javax.swing.JMenu();
        jConsMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Console");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 153, 102));
        setBounds(new java.awt.Rectangle(2, 2, 2, 2));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(640, 480));
        setName("Console"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jConsNomeCasa.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jConsNomeCasa.setText("SQUADRA CASA");
        jConsNomeCasa.setToolTipText("Inserire il nome della squadra");
        jConsNomeCasa.setMaximumSize(new java.awt.Dimension(135, 28));
        jConsNomeCasa.setMinimumSize(new java.awt.Dimension(135, 28));
        jConsNomeCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsNomeCasaActionPerformed(evt);
            }
        });
        getContentPane().add(jConsNomeCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 230, 30));

        jConsTimerLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jConsTimerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jConsTimerLabel.setText("TIMER");
        jConsTimerLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jConsTimerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 80, 90, -1));

        jConsInizio.setText("INIZIO");
        jConsInizio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsInizioActionPerformed(evt);
            }
        });
        getContentPane().add(jConsInizio, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 160, -1, -1));

        jConsPausa.setText("PAUSA");
        getContentPane().add(jConsPausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        jConsTimeMin.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jConsTimeMin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jConsTimeMin.setText("10");
        jConsTimeMin.setToolTipText("Impostare la durata della partita (casella minuti)");
        getContentPane().add(jConsTimeMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 115, 40, 40));

        jConsTimeSec.setFont(new java.awt.Font("Roboto Th", 0, 30)); // NOI18N
        jConsTimeSec.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jConsTimeSec.setText("00");
        jConsTimeSec.setToolTipText("Impostare la durata della partita (casella secondi)");
        getContentPane().add(jConsTimeSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 115, 40, 40));

        jConsLabelVenefix.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jConsLabelVenefix.setText("Venefix");
        getContentPane().add(jConsLabelVenefix, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 60, 30));

        jConsLabelFalliOsp.setForeground(new java.awt.Color(255, 255, 255));
        jConsLabelFalliOsp.setText("FALLI");
        getContentPane().add(jConsLabelFalliOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        jConsLabelFalliCasa.setForeground(new java.awt.Color(255, 255, 255));
        jConsLabelFalliCasa.setText("FALLI");
        getContentPane().add(jConsLabelFalliCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jCons24Reset.setText("RESET");
        getContentPane().add(jCons24Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 310, 110, -1));

        jCons24s.setFont(new java.awt.Font("Roboto", 0, 72)); // NOI18N
        jCons24s.setModel(new javax.swing.SpinnerNumberModel(24, 0, 24, 1));
        jCons24s.setMaximumSize(new java.awt.Dimension(143, 94));
        getContentPane().add(jCons24s, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 220, 110, 90));

        jConsPuntiCasa.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jConsPuntiCasa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        jConsPuntiCasa.setToolTipText("Contatore Punti Casa");
        jConsPuntiCasa.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jConsPuntiCasa.setMaximumSize(new java.awt.Dimension(45, 93));
        jConsPuntiCasa.setMinimumSize(new java.awt.Dimension(45, 93));
        jConsPuntiCasa.setName("Punti Casa"); // NOI18N
        jConsPuntiCasa.setPreferredSize(new java.awt.Dimension(45, 93));
        jConsPuntiCasa.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jConsPuntiCasaStateChanged(evt);
            }
        });
        getContentPane().add(jConsPuntiCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 110, 90));

        jConsFallicasa.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jConsFallicasa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        jConsFallicasa.setToolTipText("Falli Casa");
        jConsFallicasa.setMaximumSize(new java.awt.Dimension(63, 64));
        getContentPane().add(jConsFallicasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 90, 70));

        jConsFalliOsp.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jConsFalliOsp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        jConsFalliOsp.setToolTipText("Falli Ospiti");
        jConsFalliOsp.setMaximumSize(new java.awt.Dimension(63, 64));
        getContentPane().add(jConsFalliOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 90, 70));

        jConsPuntiOps.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jConsPuntiOps.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        jConsPuntiOps.setToolTipText("Contatore Punti Ospiti");
        jConsPuntiOps.setMaximumSize(new java.awt.Dimension(45, 93));
        jConsPuntiOps.setMinimumSize(new java.awt.Dimension(45, 93));
        jConsPuntiOps.setPreferredSize(new java.awt.Dimension(45, 93));
        getContentPane().add(jConsPuntiOps, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 110, -1));

        jCons24StartStop.setText("START / STOP");
        jCons24StartStop.setToolTipText("Avvia ferma Timer 24Sec");
        getContentPane().add(jCons24StartStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 340, 110, 30));

        jConsBonusCasa.setBackground(new java.awt.Color(255, 0, 0));
        jConsBonusCasa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jConsBonusCasa.setToolTipText("Bonus Casa");
        jConsBonusCasa.setMaximumSize(new java.awt.Dimension(10, 10));
        jConsBonusCasa.setPreferredSize(new java.awt.Dimension(10, 10));
        getContentPane().add(jConsBonusCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 50, 50));

        jConsBonusOsp.setBackground(new java.awt.Color(255, 0, 0));
        jConsBonusOsp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jConsBonusOsp.setToolTipText("Bonus Ospiti");
        jConsBonusOsp.setMaximumSize(new java.awt.Dimension(10, 10));
        jConsBonusOsp.setPreferredSize(new java.awt.Dimension(10, 10));
        getContentPane().add(jConsBonusOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 50, 50));

        jConsPartiteView.setText("Partite");
        getContentPane().add(jConsPartiteView, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        jConsTabView.setText("Tabellone");
        jConsTabView.setToolTipText("Visualizza il Tabellone");
        jConsTabView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsTabViewActionPerformed(evt);
            }
        });
        getContentPane().add(jConsTabView, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, -1));

        jConsGiocatoriView.setText("Giocatori");
        getContentPane().add(jConsGiocatoriView, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        jConsFischio.setText("Fischio");
        jConsFischio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsFischioActionPerformed(evt);
            }
        });
        getContentPane().add(jConsFischio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        Tipogara.add(jConsGirone);
        jConsGirone.setSelected(true);
        jConsGirone.setText("Girone");
        jConsGirone.setToolTipText("Girone Regolare");
        getContentPane().add(jConsGirone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 70, 20));

        Tipogara.add(jConsFinale);
        jConsFinale.setText("Finale");
        jConsFinale.setToolTipText("Finali e Semifinali");
        jConsFinale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsFinaleActionPerformed(evt);
            }
        });
        getContentPane().add(jConsFinale, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        Tipogara.add(jCons3p);
        jCons3p.setText("3 Punti");
        jCons3p.setToolTipText("Gara di tiro da 3");
        getContentPane().add(jCons3p, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 70, -1));

        jConsTipoGaraframe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jConsTipoGaraframe.setToolTipText("Modalità Torneo");
        jConsTipoGaraframe.setLayout(null);
        getContentPane().add(jConsTipoGaraframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 395, 90, 70));

        jConsNomeOsp.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jConsNomeOsp.setText("SQUADRA OSPITI");
        jConsNomeOsp.setToolTipText("Inserire il nome della squadra");
        jConsNomeOsp.setMaximumSize(new java.awt.Dimension(135, 28));
        jConsNomeOsp.setMinimumSize(new java.awt.Dimension(135, 28));
        jConsNomeOsp.setPreferredSize(new java.awt.Dimension(135, 28));
        getContentPane().add(jConsNomeOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 230, 30));

        jConsSfondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Venefix\\Desktop\\Tabellone 5.0\\IMAGES\\parq.jpg")); // NOI18N
        jConsSfondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jConsSfondo.setMaximumSize(new java.awt.Dimension(640, 520));
        jConsSfondo.setMinimumSize(new java.awt.Dimension(640, 520));
        jConsSfondo.setPreferredSize(new java.awt.Dimension(640, 520));
        jConsSfondo.setRequestFocusEnabled(false);
        getContentPane().add(jConsSfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        jConsMenu1.setText("File");
        jConsMenuBar.add(jConsMenu1);

        jConsMenuOpz.setText("Opzioni");
        jConsMenuOpz.setToolTipText("");
        jConsMenuBar.add(jConsMenuOpz);

        jConsMenu3.setText("?");
        jConsMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsMenu3ActionPerformed(evt);
            }
        });
        jConsMenuBar.add(jConsMenu3);

        setJMenuBar(jConsMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConsInizioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsInizioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jConsInizioActionPerformed

    private void jConsPuntiCasaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jConsPuntiCasaStateChanged
    //////////////////////    jconspunticasa = Tabellone
        Integer value = (Integer) jConsPuntiCasa.getValue();
       if (tabellone != null ) {
        tabellone.changeJTabPuntiCasa(value);
       }
        if (value.equals(2)) {
            System.out.println(value);
        } else {
            System.out.println("KO");
        }
    }//GEN-LAST:event_jConsPuntiCasaStateChanged

    private void jConsFischioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsFischioActionPerformed
        {
        // aw.start();     
}
    }//GEN-LAST:event_jConsFischioActionPerformed

    private void jConsFinaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsFinaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsFinaleActionPerformed

    private void jConsNomeCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsNomeCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsNomeCasaActionPerformed

    private void jConsMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsMenu3ActionPerformed

    private void jConsTabViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsTabViewActionPerformed
tabellone.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jConsTabViewActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consolemenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consolemenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consolemenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consolemenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consolemenu().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Tipogara;
    private javax.swing.JButton jCons24Reset;
    private javax.swing.JToggleButton jCons24StartStop;
    private javax.swing.JSpinner jCons24s;
    private javax.swing.JRadioButton jCons3p;
    private javax.swing.JPanel jConsBonusCasa;
    private javax.swing.JPanel jConsBonusOsp;
    private javax.swing.JSpinner jConsFalliOsp;
    private javax.swing.JSpinner jConsFallicasa;
    private javax.swing.JRadioButton jConsFinale;
    private javax.swing.JButton jConsFischio;
    private javax.swing.JButton jConsGiocatoriView;
    private javax.swing.JRadioButton jConsGirone;
    private javax.swing.JButton jConsInizio;
    private javax.swing.JLabel jConsLabelFalliCasa;
    private javax.swing.JLabel jConsLabelFalliOsp;
    private javax.swing.JLabel jConsLabelVenefix;
    private javax.swing.JMenu jConsMenu1;
    private javax.swing.JMenu jConsMenu3;
    private javax.swing.JMenuBar jConsMenuBar;
    private javax.swing.JMenu jConsMenuOpz;
    private javax.swing.JTextField jConsNomeCasa;
    private javax.swing.JTextField jConsNomeOsp;
    private javax.swing.JButton jConsPartiteView;
    private javax.swing.JButton jConsPausa;
    private javax.swing.JSpinner jConsPuntiCasa;
    private javax.swing.JSpinner jConsPuntiOps;
    private javax.swing.JLabel jConsSfondo;
    private javax.swing.JButton jConsTabView;
    private javax.swing.JTextField jConsTimeMin;
    private javax.swing.JTextField jConsTimeSec;
    private javax.swing.JLabel jConsTimerLabel;
    private javax.swing.JPanel jConsTipoGaraframe;
    // End of variables declaration//GEN-END:variables

    private Object Tabellone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
;