package it.venefix.tabellone3vs3;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Timer;
import java.util.TimerTask;
import java.lang.reflect.Field;
import javax.swing.*;




public class Consolemenu extends javax.swing.JFrame {
       private Tabellone tabellone;
     private Winner winner;
    
    public Consolemenu() {
        initComponents();
        tabellone = new Tabellone();
        winner = new Winner();
//         Dimension dim = getToolkit().getScreenSize(); // centra lo schermo
//        this.setLocation(dim.width/2-this.getWidth()/2,dim.height/2-this.getHeight()/2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jConsNomeCasa = new javax.swing.JTextField();
        jConsTimerLabel = new javax.swing.JLabel();
        jConsInizio = new javax.swing.JButton();
        jConsPausa = new javax.swing.JButton();
        jConsTimeMin = new javax.swing.JTextField();
        jConsTimeSec = new javax.swing.JTextField();
        jConsLabelVenefix = new javax.swing.JLabel();
        jConsLabelFalliOsp = new javax.swing.JLabel();
        jConsLabelFalliCasa = new javax.swing.JLabel();
        JConsLabelPuntiCasa = new javax.swing.JLabel();
        JConsLabelPuntiOsp = new javax.swing.JLabel();
        jCons24Reset = new javax.swing.JButton();
        jCons24s = new javax.swing.JSpinner();
        jConsPuntiCasa = new javax.swing.JSpinner();
        jConsFalliCasa = new javax.swing.JSpinner();
        jConsFalliOsp = new javax.swing.JSpinner();
        jConsPuntiOsp = new javax.swing.JSpinner();
        jCons24StartStop = new javax.swing.JToggleButton();
        jConsAzzeraTutto = new javax.swing.JButton();
        jConsTabView = new javax.swing.JButton();
        jConsGiocatoriView = new javax.swing.JButton();
        jConsFischio = new javax.swing.JButton();
        jConsGirone = new javax.swing.JRadioButton();
        jConsFinale = new javax.swing.JRadioButton();
        jConsTipoGaraframe = new javax.swing.JPanel();
        jConsWinView = new javax.swing.JButton();
        jConsGironeView = new javax.swing.JButton();
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
        setMaximumSize(new java.awt.Dimension(640, 550));
        setMinimumSize(new java.awt.Dimension(640, 550));
        setName("Console"); // NOI18N
        setPreferredSize(new java.awt.Dimension(640, 550));
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

        jConsLabelVenefix.setFont(new java.awt.Font("Edwardian Script ITC", 0, 24)); // NOI18N
        jConsLabelVenefix.setText("Venefix");
        getContentPane().add(jConsLabelVenefix, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 60, 30));

        jConsLabelFalliOsp.setForeground(new java.awt.Color(255, 255, 255));
        jConsLabelFalliOsp.setText("FALLI");
        getContentPane().add(jConsLabelFalliOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        jConsLabelFalliCasa.setForeground(new java.awt.Color(255, 255, 255));
        jConsLabelFalliCasa.setText("FALLI");
        getContentPane().add(jConsLabelFalliCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        JConsLabelPuntiCasa.setForeground(new java.awt.Color(240, 240, 240));
        JConsLabelPuntiCasa.setText("PUNTI");
        getContentPane().add(JConsLabelPuntiCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 40, -1));

        JConsLabelPuntiOsp.setForeground(new java.awt.Color(240, 240, 240));
        JConsLabelPuntiOsp.setText("PUNTI");
        getContentPane().add(JConsLabelPuntiOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

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

        jConsFalliCasa.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jConsFalliCasa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        jConsFalliCasa.setToolTipText("Falli Casa");
        jConsFalliCasa.setBorder(null);
        jConsFalliCasa.setMaximumSize(new java.awt.Dimension(63, 64));
        jConsFalliCasa.setOpaque(false);
        jConsFalliCasa.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jConsFalliCasaStateChanged(evt);
            }
        });
        getContentPane().add(jConsFalliCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 90, 70));

        jConsFalliOsp.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jConsFalliOsp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        jConsFalliOsp.setToolTipText("Falli Ospiti");
        jConsFalliOsp.setBorder(null);
        jConsFalliOsp.setMaximumSize(new java.awt.Dimension(63, 64));
        jConsFalliOsp.setOpaque(false);
        jConsFalliOsp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jConsFalliOspStateChanged(evt);
            }
        });
        getContentPane().add(jConsFalliOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 90, 70));

        jConsPuntiOsp.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jConsPuntiOsp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));
        jConsPuntiOsp.setToolTipText("Contatore Punti Ospiti");
        jConsPuntiOsp.setMaximumSize(new java.awt.Dimension(45, 93));
        jConsPuntiOsp.setMinimumSize(new java.awt.Dimension(45, 93));
        jConsPuntiOsp.setPreferredSize(new java.awt.Dimension(45, 93));
        jConsPuntiOsp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jConsPuntiOspStateChanged(evt);
            }
        });
        getContentPane().add(jConsPuntiOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 110, -1));

        jCons24StartStop.setText("START / STOP");
        jCons24StartStop.setToolTipText("Avvia ferma Timer 24Sec");
        getContentPane().add(jCons24StartStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 340, 110, 30));

        jConsAzzeraTutto.setText("Azzera");
        jConsAzzeraTutto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsAzzeraTuttoActionPerformed(evt);
            }
        });
        getContentPane().add(jConsAzzeraTutto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

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

        jConsGirone.setSelected(true);
        jConsGirone.setText("Girone");
        jConsGirone.setToolTipText("Girone Regolare");
        getContentPane().add(jConsGirone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 70, 20));

        jConsFinale.setText("Finale");
        jConsFinale.setToolTipText("Finali e Semifinali");
        jConsFinale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsFinaleActionPerformed(evt);
            }
        });
        getContentPane().add(jConsFinale, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        jConsTipoGaraframe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jConsTipoGaraframe.setToolTipText("Modalità Torneo");
        jConsTipoGaraframe.setLayout(null);
        getContentPane().add(jConsTipoGaraframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 395, 90, 50));

        jConsWinView.setText("Winner");
        jConsWinView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsWinViewActionPerformed(evt);
            }
        });
        getContentPane().add(jConsWinView, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, -1, -1));

        jConsGironeView.setText("Gironi");
        getContentPane().add(jConsGironeView, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        jConsNomeOsp.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jConsNomeOsp.setText("SQUADRA OSPITI");
        jConsNomeOsp.setToolTipText("Inserire il nome della squadra");
        jConsNomeOsp.setMaximumSize(new java.awt.Dimension(135, 28));
        jConsNomeOsp.setMinimumSize(new java.awt.Dimension(135, 28));
        jConsNomeOsp.setPreferredSize(new java.awt.Dimension(135, 28));
        getContentPane().add(jConsNomeOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 230, 30));

        jConsSfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parq.jpg"))); // NOI18N
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
        Integer valuepc = (Integer) jConsPuntiCasa.getValue() ;  
        if (tabellone != null ) {
        tabellone.changeJTabPuntiCasa(valuepc);
       }
        if (valuepc.equals(21)) {
          winner.setVisible(true); 
          
//            System.out.println("casa");
        } else {
//            System.out.println("KO");
            
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
//      string nomecasa = (string) jConsNomeCasa.getText();
//        tabellone.changejTabNomeCasa (nomecasa) ;   
    }//GEN-LAST:event_jConsNomeCasaActionPerformed

    private void jConsMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsMenu3ActionPerformed

    private void jConsTabViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsTabViewActionPerformed
    tabellone.setVisible(true);
    }//GEN-LAST:event_jConsTabViewActionPerformed

    private void jConsWinViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsWinViewActionPerformed
     winner.setVisible(true);   
    }//GEN-LAST:event_jConsWinViewActionPerformed

    private void jConsPuntiOspStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jConsPuntiOspStateChanged
        Integer valuepo = (Integer) jConsPuntiOsp.getValue();
       if (tabellone != null ) 
       {
        tabellone.changeJTabPuntiOsp(valuepo);
       }
        if (valuepo.equals(21)) 
        {
            winner.setVisible(true); 
           
        } else 
        {
           
        }
    }//GEN-LAST:event_jConsPuntiOspStateChanged

    private void jConsFalliCasaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jConsFalliCasaStateChanged
        Integer valuefc = (Integer) jConsFalliCasa.getValue();
//        try 
//        {
//            String colorString = (String)jConsPuntiCasa.getValue();
//
//            Field field = Class.forName("java.awt.Color").getField(colorString.toLowerCase()); // toLowerCase because the color fields are RED or red, not Red
//            Color color = (Color)field.get(null);
//
//            JTextField tf = ((JSpinner.DefaultEditor) jConsPuntiCasa.getEditor()).getTextField();
//            tf.setForeground(color);
//
//        } catch (Exception ex) 
//        { // handle ex }
//        }
        
        
        if (tabellone != null ) 
       {
        tabellone.changejTabFalliCasa(valuefc);
       }
        if (valuefc> (4)) 
         {
           jConsFalliCasa.setBackground(Color.red);
            tabellone.jTabFalliCasa.setBackground(Color.red);
         } 
           else 
        {
              if (valuefc <(5)) 
//             jConsFalliCasa.setBorder(true);
             tabellone.jTabFalliCasa.setBackground(Color.black);
        }
    }//GEN-LAST:event_jConsFalliCasaStateChanged

    private void jConsFalliOspStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jConsFalliOspStateChanged
        Integer valuefo = (Integer) jConsFalliOsp.getValue();
       if (tabellone != null ) 
       {
        tabellone.changejTabFalliOsp(valuefo);
       }
        if (valuefo > (4)) 
        {
              jConsFalliOsp.setBackground(Color.red); //cambiare colore dello spinner falli nella console
              tabellone.jTabFalliOsp.setBackground(Color.red);
        } 
            else 
        {
              if (valuefo <(5)) 
//             jConsFalliOsp.
             tabellone.jTabFalliOsp.setBackground(Color.white);
        }
    }//GEN-LAST:event_jConsFalliOspStateChanged

    private void jConsAzzeraTuttoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsAzzeraTuttoActionPerformed
//        azzera falli  
        jConsFalliOsp.setBackground(Color.black);
        jConsFalliCasa.setBackground(Color.white);
        tabellone.jTabFalliCasa.setBackground(Color.black);
        tabellone.jTabFalliOsp.setBackground(Color.white);
        jConsFalliOsp.setValue(0);
        jConsFalliCasa.setValue(0);
//        azzera punti e nome squadre
        jConsPuntiOsp.setValue(0);
        jConsPuntiCasa.setValue(0);
        jConsNomeOsp.setText("SQUADRA OSPITI");
        jConsNomeCasa.setText("SQUADRA CASA");
//        azzera crono e 24 s
        jConsTimeMin.setText("10");
        jConsTimeSec.setText("00");
        jCons24s.setValue(24);
//        chiusura di winner
        winner.setVisible(false);
        
    }//GEN-LAST:event_jConsAzzeraTuttoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Consolemenu().setVisible(true);
            }
        });
    }
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JConsLabelPuntiCasa;
    private javax.swing.JLabel JConsLabelPuntiOsp;
    private javax.swing.JButton jCons24Reset;
    private javax.swing.JToggleButton jCons24StartStop;
    private javax.swing.JSpinner jCons24s;
    private javax.swing.JButton jConsAzzeraTutto;
    private javax.swing.JSpinner jConsFalliCasa;
    private javax.swing.JSpinner jConsFalliOsp;
    private javax.swing.JRadioButton jConsFinale;
    private javax.swing.JButton jConsFischio;
    private javax.swing.JButton jConsGiocatoriView;
    private javax.swing.JRadioButton jConsGirone;
    private javax.swing.JButton jConsGironeView;
    private javax.swing.JButton jConsInizio;
    private javax.swing.JLabel jConsLabelFalliCasa;
    private javax.swing.JLabel jConsLabelFalliOsp;
    private javax.swing.JLabel jConsLabelVenefix;
    private javax.swing.JMenu jConsMenu1;
    private javax.swing.JMenu jConsMenu3;
    private javax.swing.JMenuBar jConsMenuBar;
    private javax.swing.JMenu jConsMenuOpz;
    public javax.swing.JTextField jConsNomeCasa;
    private javax.swing.JTextField jConsNomeOsp;
    private javax.swing.JButton jConsPausa;
    private javax.swing.JSpinner jConsPuntiCasa;
    private javax.swing.JSpinner jConsPuntiOsp;
    private javax.swing.JLabel jConsSfondo;
    private javax.swing.JButton jConsTabView;
    private javax.swing.JTextField jConsTimeMin;
    private javax.swing.JTextField jConsTimeSec;
    private javax.swing.JLabel jConsTimerLabel;
    private javax.swing.JPanel jConsTipoGaraframe;
    private javax.swing.JButton jConsWinView;
    // End of variables declaration//GEN-END:variables

    private Object Tabellone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
;