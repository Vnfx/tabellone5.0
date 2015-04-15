package it.venefix.tabellone3vs3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Component;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Toolkit;
import sun.audio.*;


public class Consolemenu extends javax.swing.JFrame {
    Toolkit toolkit;
//    Timer timer;
    private Tabellone tabellone;
    private Winner winner;
   
    
    public Consolemenu() {
        initComponents();
        int finalegirone = 21;
        
        tabellone = new Tabellone();
        winner = new Winner();
        
        Timer t24 = new Timer();
        
        TimerTask task = new TimerTask()
         {
          Integer v24 = (Integer) jCons24s.getValue();              
              public void run ()
               {           
//                    if (v24 > (0))  //(valuefo > (4))
//                    {
                     v24 --;
//                     jCons24s.setValue(v24);
//                    }        
               } 
          }; 
      

        Dimension dim = getToolkit().getScreenSize(); // centra lo schermo
        this.setLocation(dim.width/2-this.getWidth()/2,dim.height/2-this.getHeight()/2);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jConsNomeCasa = new javax.swing.JTextField();
        jConsTimerLabel = new javax.swing.JLabel();
        jConsInizio = new javax.swing.JButton();
        jConsPausa = new javax.swing.JButton();
        jConsMin = new javax.swing.JSpinner();
        jConsSec = new javax.swing.JSpinner();
        jConsLabelVenefix = new javax.swing.JLabel();
        jConsLabelFalliOsp = new javax.swing.JLabel();
        jConsLabelFalliCasa = new javax.swing.JLabel();
        JConsLabelPuntiCasa = new javax.swing.JLabel();
        JConsLabelPuntiOsp = new javax.swing.JLabel();
        jCons24Start = new javax.swing.JButton();
        jCons24Reset = new javax.swing.JButton();
        jCons24Stop = new javax.swing.JButton();
        jCons24s = new javax.swing.JSpinner();
        jConsPuntiCasa = new javax.swing.JSpinner();
        jConsPuntiOsp = new javax.swing.JSpinner();
        jConsFalliCasa = new javax.swing.JSpinner();
        jConsFalliOsp = new javax.swing.JSpinner();
        jConsAzzeraTutto = new javax.swing.JButton();
        jConsTabView = new javax.swing.JButton();
        jConsGiocatoriView = new javax.swing.JButton();
        jConsFischio = new javax.swing.JButton();
        jConsTipoGaraframe = new javax.swing.JPanel();
        jConsGirone = new javax.swing.JRadioButton();
        jConsFinale = new javax.swing.JRadioButton();
        jConsWinView = new javax.swing.JButton();
        jConsGironeView = new javax.swing.JButton();
        jConsNomeOsp = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jConsBonusOsp = new javax.swing.JLabel();
        jConsBonusCasa = new javax.swing.JLabel();
        jConsRedBar1 = new javax.swing.JLabel();
        jConsMemorial = new javax.swing.JLabel();
        jConsPulsanti = new javax.swing.JLabel();
        jConsBanner = new javax.swing.JLabel();
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
        setMinimumSize(new java.awt.Dimension(810, 500));
        setName("Console"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jConsNomeCasa.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jConsNomeCasa.setText("SQUADRA CASA");
        jConsNomeCasa.setToolTipText("Inserire il nome della squadra");
        jConsNomeCasa.setMaximumSize(new java.awt.Dimension(135, 28));
        jConsNomeCasa.setMinimumSize(new java.awt.Dimension(135, 28));
        getContentPane().add(jConsNomeCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 230, 30));

        jConsTimerLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jConsTimerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jConsTimerLabel.setText("TIMER");
        jConsTimerLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jConsTimerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jConsTimerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 100, -1));

        jConsInizio.setText("INIZIO");
        jConsInizio.setOpaque(false);
        jConsInizio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsInizioActionPerformed(evt);
            }
        });
        getContentPane().add(jConsInizio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        jConsPausa.setText("PAUSA");
        jConsPausa.setOpaque(false);
        getContentPane().add(jConsPausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jConsMin.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        jConsMin.setModel(new javax.swing.SpinnerNumberModel(12, 0, 59, 1));
        jConsMin.setToolTipText("Impostare la durata della partita (casella secondi)");
        jConsMin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jConsMin.setMaximumSize(new java.awt.Dimension(40, 42));
        jConsMin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jConsMinStateChanged(evt);
            }
        });
        getContentPane().add(jConsMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 60, 40));

        jConsSec.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
        jConsSec.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        jConsSec.setToolTipText("Impostare la durata della partita (casella minuti)");
        jConsSec.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jConsSec.setMaximumSize(new java.awt.Dimension(40, 42));
        jConsSec.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jConsSecStateChanged(evt);
            }
        });
        getContentPane().add(jConsSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 60, 40));

        jConsLabelVenefix.setFont(new java.awt.Font("Edwardian Script ITC", 0, 24)); // NOI18N
        jConsLabelVenefix.setText("Venefix");
        getContentPane().add(jConsLabelVenefix, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 60, 30));

        jConsLabelFalliOsp.setForeground(new java.awt.Color(255, 255, 255));
        jConsLabelFalliOsp.setText("FALLI");
        getContentPane().add(jConsLabelFalliOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        jConsLabelFalliCasa.setForeground(new java.awt.Color(255, 255, 255));
        jConsLabelFalliCasa.setText("FALLI");
        getContentPane().add(jConsLabelFalliCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        JConsLabelPuntiCasa.setForeground(new java.awt.Color(240, 240, 240));
        JConsLabelPuntiCasa.setText("PUNTI");
        getContentPane().add(JConsLabelPuntiCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 40, -1));

        JConsLabelPuntiOsp.setForeground(new java.awt.Color(240, 240, 240));
        JConsLabelPuntiOsp.setText("PUNTI");
        getContentPane().add(JConsLabelPuntiOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        jCons24Start.setText("START");
        jCons24Start.setOpaque(false);
        jCons24Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCons24StartActionPerformed(evt);
            }
        });
        getContentPane().add(jCons24Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 70, -1));

        jCons24Reset.setText("RESET");
        jCons24Reset.setOpaque(false);
        jCons24Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCons24ResetActionPerformed(evt);
            }
        });
        getContentPane().add(jCons24Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 70, -1));

        jCons24Stop.setText("STOP");
        jCons24Stop.setOpaque(false);
        getContentPane().add(jCons24Stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 70, -1));

        jCons24s.setFont(new java.awt.Font("Roboto", 0, 72)); // NOI18N
        jCons24s.setModel(new javax.swing.SpinnerNumberModel(24, 0, 24, 1));
        jCons24s.setMaximumSize(new java.awt.Dimension(143, 94));
        jCons24s.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCons24sStateChanged(evt);
            }
        });
        getContentPane().add(jCons24s, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 110, 90));

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
        getContentPane().add(jConsPuntiCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 110, 90));

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
        getContentPane().add(jConsPuntiOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 110, 90));

        jConsFalliCasa.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jConsFalliCasa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 15, 1));
        jConsFalliCasa.setToolTipText("Falli Casa");
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
        jConsFalliOsp.setMaximumSize(new java.awt.Dimension(63, 64));
        jConsFalliOsp.setOpaque(false);
        jConsFalliOsp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jConsFalliOspStateChanged(evt);
            }
        });
        getContentPane().add(jConsFalliOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 90, 70));

        jConsAzzeraTutto.setText("Azzera");
        jConsAzzeraTutto.setPreferredSize(new java.awt.Dimension(79, 23));
        jConsAzzeraTutto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsAzzeraTuttoActionPerformed(evt);
            }
        });
        getContentPane().add(jConsAzzeraTutto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        jConsTabView.setText("Tabellone");
        jConsTabView.setToolTipText("Visualizza il Tabellone");
        jConsTabView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsTabViewActionPerformed(evt);
            }
        });
        getContentPane().add(jConsTabView, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        jConsGiocatoriView.setText("Giocatori");
        jConsGiocatoriView.setEnabled(false);
        jConsGiocatoriView.setPreferredSize(new java.awt.Dimension(79, 23));
        getContentPane().add(jConsGiocatoriView, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));

        jConsFischio.setText("Fischio");
        jConsFischio.setMaximumSize(new java.awt.Dimension(79, 23));
        jConsFischio.setMinimumSize(new java.awt.Dimension(79, 23));
        jConsFischio.setPreferredSize(new java.awt.Dimension(79, 23));
        jConsFischio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsFischioActionPerformed(evt);
            }
        });
        getContentPane().add(jConsFischio, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, -1));

        jConsTipoGaraframe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jConsTipoGaraframe.setToolTipText("Modalità Torneo");
        jConsTipoGaraframe.setLayout(null);

        jConsGirone.setSelected(true);
        jConsGirone.setText("Girone");
        jConsGirone.setToolTipText("Girone Regolare");
        jConsTipoGaraframe.add(jConsGirone);
        jConsGirone.setBounds(10, 10, 60, 20);

        jConsFinale.setText("Finale");
        jConsFinale.setToolTipText("Finali e Semifinali");
        jConsFinale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsFinaleActionPerformed(evt);
            }
        });
        jConsTipoGaraframe.add(jConsFinale);
        jConsFinale.setBounds(10, 30, 53, 23);

        getContentPane().add(jConsTipoGaraframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 80, 60));

        jConsWinView.setText("Winner");
        jConsWinView.setPreferredSize(new java.awt.Dimension(79, 23));
        jConsWinView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsWinViewActionPerformed(evt);
            }
        });
        getContentPane().add(jConsWinView, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, -1));

        jConsGironeView.setText("Gironi");
        jConsGironeView.setEnabled(false);
        jConsGironeView.setPreferredSize(new java.awt.Dimension(79, 23));
        getContentPane().add(jConsGironeView, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, -1));

        jConsNomeOsp.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jConsNomeOsp.setText("SQUADRA OSPITI");
        jConsNomeOsp.setToolTipText("Inserire il nome della squadra");
        jConsNomeOsp.setMaximumSize(new java.awt.Dimension(135, 28));
        jConsNomeOsp.setMinimumSize(new java.awt.Dimension(135, 28));
        jConsNomeOsp.setPreferredSize(new java.awt.Dimension(135, 28));
        getContentPane().add(jConsNomeOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 230, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jSeparator1.setMaximumSize(new java.awt.Dimension(50, 3));
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 3));
        jSeparator1.setOpaque(true);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 3));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 6, 500));

        jConsBonusOsp.setBackground(new java.awt.Color(255, 0, 0));
        jConsBonusOsp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jConsBonusOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 40, 40));

        jConsBonusCasa.setBackground(new java.awt.Color(255, 0, 0));
        jConsBonusCasa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jConsBonusCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 40, 40));

        jConsRedBar1.setBackground(new java.awt.Color(204, 0, 0));
        jConsRedBar1.setForeground(new java.awt.Color(204, 0, 0));
        jConsRedBar1.setOpaque(true);
        getContentPane().add(jConsRedBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 590, 12));

        jConsMemorial.setFont(new java.awt.Font("Edwardian Script ITC", 0, 36)); // NOI18N
        jConsMemorial.setText("Memorial Alberto Ceccherini");
        jConsMemorial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jConsMemorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 340, 30));

        jConsPulsanti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parq2vert.jpg"))); // NOI18N
        jConsPulsanti.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jConsPulsanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 170, 500));

        jConsBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banner_trasp.png"))); // NOI18N
        jConsBanner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jConsBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 590, 110));

        jConsSfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parq.jpg"))); // NOI18N
        jConsSfondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jConsSfondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        Integer valuepc = (Integer) jConsPuntiCasa.getValue();
        String wincasa = (String) jConsNomeCasa.getText();
        if (jConsFinale.isEnabled() != true ){
            int finalegirone = 30;
        }
        else{
            int finalegirone = 21;
        }
            
        if (tabellone != null ) {
            tabellone.changeJTabPuntiCasa(valuepc);

            if (valuepc == 21) {
              winner.setVisible(true); 
              toolkit.getDefaultToolkit().beep();
              winner.changeJWinWinner(wincasa);
              winner.changeJWinWinner1(wincasa);
            }
           
        }
    }//GEN-LAST:event_jConsPuntiCasaStateChanged

 
    private void jConsFischioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsFischioActionPerformed
        {
         toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jConsFischioActionPerformed

    private void jConsFinaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsFinaleActionPerformed
        jConsMin.setValue(15);
        int finalegirone = 30;
    }//GEN-LAST:event_jConsFinaleActionPerformed

    private void jConsMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jConsMenu3ActionPerformed

    private void jConsTabViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsTabViewActionPerformed
    tabellone.setVisible(true);
    tabellone.changeNomeSquadraCasa(jConsNomeCasa.getText());
    tabellone.changeNomeSquadraOsp(jConsNomeOsp.getText());
//    tabellone.startClock();
    }//GEN-LAST:event_jConsTabViewActionPerformed

    private void jConsWinViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsWinViewActionPerformed
     winner.setVisible(true);   
    }//GEN-LAST:event_jConsWinViewActionPerformed

    private void jConsPuntiOspStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jConsPuntiOspStateChanged
        Integer valuepo = (Integer) jConsPuntiOsp.getValue();
        String winosp = (String) jConsNomeOsp.getText();
        if (tabellone != null ) 
       {
        tabellone.changeJTabPuntiOsp(valuepo);
       }
        if (valuepo.equals(21)) 
        {
            winner.setVisible(true);
            toolkit.getDefaultToolkit().beep();
            winner.changeJWinWinner(winosp);
            winner.changeJWinWinner1(winosp);
        } else 
        {
           
        }
    }//GEN-LAST:event_jConsPuntiOspStateChanged

    private void jConsFalliCasaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jConsFalliCasaStateChanged
        Integer valuefc = (Integer) jConsFalliCasa.getValue();
       if (tabellone != null ) 
       {
        tabellone.changejTabFalliCasa(valuefc);
       }
        if (valuefc > (4)) 
         {
            jConsBonusCasa.setOpaque(true);
            tabellone.jTabFalliCasa.setBackground(Color.red);
         } 
           else 
              if (valuefc <(5)) 
             jConsBonusCasa.setOpaque(false);
             jConsFalliCasa.setBackground(Color.black);
             tabellone.jTabFalliCasa.setBackground(Color.black);
    }//GEN-LAST:event_jConsFalliCasaStateChanged

    private void jConsFalliOspStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jConsFalliOspStateChanged
        Integer valuefo = (Integer) jConsFalliOsp.getValue();
       if (tabellone != null ) 
       {
        tabellone.changejTabFalliOsp(valuefo);
       }
        if (valuefo > (4)) 
        {
              jConsBonusOsp.setOpaque (true); //cambiare colore dello spinner falli nella console
              tabellone.jTabFalliOsp.setBackground(Color.red);
        } 
            else 
        {
             if (valuefo <(5)) 
             jConsBonusOsp.setOpaque (false);
             jConsFalliOsp.setBackground(Color.white);
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
        tabellone.changeNomeSquadraOsp("SQUADRA OSPITI");
        tabellone.changeNomeSquadraCasa("SQUADRA CASA");
//        azzera crono e 24 s
        jConsMin.setValue("12");
        jConsSec.setValue("00");
        tabellone.jTabMin.setText("12");
        tabellone.jTabSec.setText("00");
        jCons24s.setValue(24);
        tabellone.jTab24sec.setText("24");
        tabellone.jTabBarra24s.setValue(24);
//        chiusura di winner
        winner.jWinWinner.setText("3 VS 3");
        winner.setVisible(false);
        
    
    }//GEN-LAST:event_jConsAzzeraTuttoActionPerformed

    private void jCons24StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCons24StartActionPerformed
//    Integer v24 = (Integer) jCons24s.getValue();    
//        v24 --;
//        jCons24s.setValue(v24);
                    
//           if (v24 > (0))  //(valuefo > (4))
//           {
//             v24 --;
//             jCons24s.setValue(v24);
//             tabellone.changejTab24sec(v24);
//           }        
//           else
//                    {
//                            v24 --;
//                    }
//            t24.scheduleAtFixedRate(task, 0, 1000);
    }//GEN-LAST:event_jCons24StartActionPerformed

    private void jCons24ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCons24ResetActionPerformed
       jCons24s.setValue(24);
       tabellone.jTab24sec.setText("24");
       tabellone.jTabBarra24s.setValue(24);
    }//GEN-LAST:event_jCons24ResetActionPerformed

    private void jCons24sStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCons24sStateChanged
        Integer v24 = (Integer) jCons24s.getValue();  
        tabellone.changejTab24sec(v24);  // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jCons24sStateChanged

    private void jConsSecStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jConsSecStateChanged
       Integer sec = (Integer) jConsSec.getValue();    
             tabellone.changejTabSec(sec);      
    }//GEN-LAST:event_jConsSecStateChanged

    private void jConsMinStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jConsMinStateChanged
          Integer min = (Integer) jConsMin.getValue();        
             tabellone.changejTabMin(min);     
    }//GEN-LAST:event_jConsMinStateChanged

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
    private javax.swing.JButton jCons24Start;
    private javax.swing.JButton jCons24Stop;
    private javax.swing.JSpinner jCons24s;
    private javax.swing.JButton jConsAzzeraTutto;
    private javax.swing.JLabel jConsBanner;
    private javax.swing.JLabel jConsBonusCasa;
    private javax.swing.JLabel jConsBonusOsp;
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
    private javax.swing.JLabel jConsMemorial;
    private javax.swing.JMenu jConsMenu1;
    private javax.swing.JMenu jConsMenu3;
    private javax.swing.JMenuBar jConsMenuBar;
    private javax.swing.JMenu jConsMenuOpz;
    private javax.swing.JSpinner jConsMin;
    private javax.swing.JTextField jConsNomeCasa;
    private javax.swing.JTextField jConsNomeOsp;
    private javax.swing.JButton jConsPausa;
    private javax.swing.JLabel jConsPulsanti;
    private javax.swing.JSpinner jConsPuntiCasa;
    private javax.swing.JSpinner jConsPuntiOsp;
    private javax.swing.JLabel jConsRedBar1;
    private javax.swing.JSpinner jConsSec;
    private javax.swing.JLabel jConsSfondo;
    private javax.swing.JButton jConsTabView;
    private javax.swing.JLabel jConsTimerLabel;
    private javax.swing.JPanel jConsTipoGaraframe;
    private javax.swing.JButton jConsWinView;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private Object Tabellone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
;