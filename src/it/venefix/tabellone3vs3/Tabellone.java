package it.venefix.tabellone3vs3;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;
import javax.swing.*;

public class Tabellone extends javax.swing.JFrame 
       
{      
//    boolean vaisx = true;
    public Tabellone()   
  
    {        
        new Thread () //fa comparire l'ora attuale nel tabellone
            {
                    public void run()
                {
                        while (true)
                    { 
                        Calendar cal = new GregorianCalendar();
                        int ora = cal.get(Calendar.HOUR_OF_DAY);
                        int min = cal.get(Calendar.MINUTE);
                        int sec = cal.get(Calendar.SECOND);
                        String orario = ora + ":" + min + ":" + sec ;
                        jTabOrario.setText(orario);
                    } 
                }
             }
            .start();
        };
   
    
    {    
    
    initComponents();
    Dimension dim = getToolkit().getScreenSize();              // centra il form
    this.setLocation(dim.width/2-this.getWidth()/2,dim.height/2-this.getHeight()/2);
//    
//    Timer ora = new Timer();
//    TimerTask taskora = new TimerTask()
//    {
//        public void run() // rende la label (con la scritta venefix) scorrevole
//        {
//          if (vaisx == true)
//            {
//            jTabLabelVenefix.setLocation(jTabLabelVenefix.getLocation().x -2,jTabLabelVenefix.getLocation ().y);
//            if (jTabLabelVenefix.getLocation().x < 0)
//                    {
//                        vaisx = false;
//                    }
//            }
//            else if (vaisx == false)
//            {
//             jTabLabelVenefix.setLocation(jTabLabelVenefix.getLocation().x +2,jTabLabelVenefix.getLocation ().y);  
//                if (jTabLabelVenefix.getLocation().x > 1200)
//                    {
//                        vaisx = true;
//                    }
//            }
//
//        }
//    };
//    ora.scheduleAtFixedRate(taskora, 0, 50);
//        
    } 
    
        
 
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabBarra24s = new javax.swing.JProgressBar();
        jTabSeparator1 = new javax.swing.JSeparator();
        jTabBarraTimer = new javax.swing.JProgressBar();
        jTabNomeCasa = new javax.swing.JLabel();
        jTabNomeOsp = new javax.swing.JLabel();
        jTabPuntiOsp = new javax.swing.JLabel();
        jTabPuntiCasa = new javax.swing.JLabel();
        jTabOrario = new javax.swing.JLabel();
        jTabMin = new javax.swing.JLabel();
        jTabSec = new javax.swing.JLabel();
        jTab2pBlink = new javax.swing.JLabel();
        jTabFalliCasa = new javax.swing.JLabel();
        jTabFalliOsp = new javax.swing.JLabel();
        jTab24sec = new javax.swing.JLabel();
        jTabTitoloMemorial = new javax.swing.JLabel();
        jTabLabelVenefix = new javax.swing.JLabel();
        jTabSfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MEMORIAL ALBERTO CECCHERINI");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 51, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(1280, 780));
        setMinimumSize(new java.awt.Dimension(1280, 780));
        setName("Tabellone"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 780));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabBarra24s.setForeground(new java.awt.Color(0, 0, 0));
        jTabBarra24s.setMaximum(24);
        jTabBarra24s.setToolTipText("");
        jTabBarra24s.setValue(24);
        jTabBarra24s.setBorderPainted(false);
        jTabBarra24s.setMaximumSize(new java.awt.Dimension(146, 14));
        jTabBarra24s.setMinimumSize(new java.awt.Dimension(146, 14));
        jTabBarra24s.setName("Barra24s"); // NOI18N
        jTabBarra24s.setString("");
        getContentPane().add(jTabBarra24s, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 250, 150, 22));
        getContentPane().add(jTabSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 520, 10));

        jTabBarraTimer.setMaximum(12);
        jTabBarraTimer.setToolTipText("");
        jTabBarraTimer.setMaximumSize(new java.awt.Dimension(146, 14));
        getContentPane().add(jTabBarraTimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 670, 520, 27));

        jTabNomeCasa.setBackground(new java.awt.Color(0, 0, 0));
        jTabNomeCasa.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTabNomeCasa.setForeground(new java.awt.Color(255, 255, 255));
        jTabNomeCasa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTabNomeCasa.setText("SQUADRA CASA");
        jTabNomeCasa.setToolTipText("Nome squadra Casa");
        jTabNomeCasa.setOpaque(true);
        getContentPane().add(jTabNomeCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 440, 60));

        jTabNomeOsp.setBackground(new java.awt.Color(255, 255, 255));
        jTabNomeOsp.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTabNomeOsp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTabNomeOsp.setText("SQUADRA OSPITI");
        jTabNomeOsp.setToolTipText("Nome squadra ospiti");
        jTabNomeOsp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabNomeOsp.setMaximumSize(new java.awt.Dimension(256, 44));
        jTabNomeOsp.setMinimumSize(new java.awt.Dimension(256, 44));
        jTabNomeOsp.setOpaque(true);
        jTabNomeOsp.setPreferredSize(new java.awt.Dimension(256, 44));
        getContentPane().add(jTabNomeOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 440, 60));

        jTabPuntiOsp.setBackground(new java.awt.Color(255, 255, 255));
        jTabPuntiOsp.setFont(new java.awt.Font("Roboto", 0, 240)); // NOI18N
        jTabPuntiOsp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTabPuntiOsp.setText("00");
        jTabPuntiOsp.setToolTipText("Punti Ospiti");
        jTabPuntiOsp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabPuntiOsp.setMaximumSize(new java.awt.Dimension(266, 295));
        jTabPuntiOsp.setMinimumSize(new java.awt.Dimension(266, 295));
        jTabPuntiOsp.setOpaque(true);
        jTabPuntiOsp.setPreferredSize(new java.awt.Dimension(266, 295));
        getContentPane().add(jTabPuntiOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 110, 330, 250));

        jTabPuntiCasa.setBackground(new java.awt.Color(0, 0, 0));
        jTabPuntiCasa.setFont(new java.awt.Font("Roboto", 0, 240)); // NOI18N
        jTabPuntiCasa.setForeground(new java.awt.Color(255, 255, 255));
        jTabPuntiCasa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTabPuntiCasa.setText("00");
        jTabPuntiCasa.setToolTipText("Punti Casa");
        jTabPuntiCasa.setMaximumSize(new java.awt.Dimension(266, 295));
        jTabPuntiCasa.setMinimumSize(new java.awt.Dimension(266, 295));
        jTabPuntiCasa.setOpaque(true);
        jTabPuntiCasa.setPreferredSize(new java.awt.Dimension(266, 295));
        getContentPane().add(jTabPuntiCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 330, 240));

        jTabOrario.setFont(new java.awt.Font("Roboto Th", 0, 48)); // NOI18N
        jTabOrario.setForeground(new java.awt.Color(0, 204, 51));
        jTabOrario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTabOrario.setToolTipText("");
        jTabOrario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTabOrario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 190, 60));

        jTabMin.setBackground(new java.awt.Color(0, 0, 0));
        jTabMin.setFont(new java.awt.Font("Roboto", 1, 200)); // NOI18N
        jTabMin.setForeground(new java.awt.Color(0, 204, 51));
        jTabMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTabMin.setText("12");
        jTabMin.setToolTipText("Minuti");
        jTabMin.setMaximumSize(new java.awt.Dimension(218, 243));
        jTabMin.setMinimumSize(new java.awt.Dimension(218, 243));
        jTabMin.setOpaque(true);
        jTabMin.setPreferredSize(new java.awt.Dimension(218, 243));
        jTabMin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTabMinPropertyChange(evt);
            }
        });
        getContentPane().add(jTabMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 250, 270));

        jTabSec.setBackground(new java.awt.Color(0, 0, 0));
        jTabSec.setFont(new java.awt.Font("Roboto Th", 0, 200)); // NOI18N
        jTabSec.setForeground(new java.awt.Color(0, 204, 51));
        jTabSec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTabSec.setText("00");
        jTabSec.setToolTipText("Secondi");
        jTabSec.setOpaque(true);
        getContentPane().add(jTabSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 250, 270));

        jTab2pBlink.setBackground(new java.awt.Color(0, 0, 0));
        jTab2pBlink.setFont(new java.awt.Font("Roboto", 0, 150)); // NOI18N
        jTab2pBlink.setForeground(new java.awt.Color(0, 204, 51));
        jTab2pBlink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTab2pBlink.setText(":");
        jTab2pBlink.setToolTipText("Puntini Lampeggianti Tempo");
        jTab2pBlink.setOpaque(true);
        getContentPane().add(jTab2pBlink, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 400, -1, 270));

        jTabFalliCasa.setBackground(new java.awt.Color(0, 0, 0));
        jTabFalliCasa.setFont(new java.awt.Font("Roboto", 0, 90)); // NOI18N
        jTabFalliCasa.setForeground(new java.awt.Color(255, 255, 255));
        jTabFalliCasa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTabFalliCasa.setText("0");
        jTabFalliCasa.setToolTipText("Falli Casa");
        jTabFalliCasa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabFalliCasa.setMaximumSize(new java.awt.Dimension(38, 85));
        jTabFalliCasa.setMinimumSize(new java.awt.Dimension(38, 85));
        jTabFalliCasa.setOpaque(true);
        jTabFalliCasa.setPreferredSize(new java.awt.Dimension(38, 85));
        getContentPane().add(jTabFalliCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, 120, 120));

        jTabFalliOsp.setBackground(new java.awt.Color(255, 255, 255));
        jTabFalliOsp.setFont(new java.awt.Font("Roboto", 0, 90)); // NOI18N
        jTabFalliOsp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTabFalliOsp.setText("0");
        jTabFalliOsp.setToolTipText("Falli Ospiti");
        jTabFalliOsp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabFalliOsp.setMaximumSize(new java.awt.Dimension(38, 85));
        jTabFalliOsp.setMinimumSize(new java.awt.Dimension(38, 85));
        jTabFalliOsp.setOpaque(true);
        jTabFalliOsp.setPreferredSize(new java.awt.Dimension(38, 85));
        getContentPane().add(jTabFalliOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 480, 120, 110));

        jTab24sec.setBackground(new java.awt.Color(0, 0, 0));
        jTab24sec.setFont(new java.awt.Font("Roboto Th", 1, 100)); // NOI18N
        jTab24sec.setForeground(new java.awt.Color(0, 204, 51));
        jTab24sec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTab24sec.setText("24");
        jTab24sec.setToolTipText("24 Sec");
        jTab24sec.setOpaque(true);
        jTab24sec.setPreferredSize(new java.awt.Dimension(150, 138));
        jTab24sec.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTab24secPropertyChange(evt);
            }
        });
        getContentPane().add(jTab24sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 110, 150, 140));

        jTabTitoloMemorial.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jTabTitoloMemorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTabTitoloMemorial.setText("Memorial Alberto Ceccherini");
        jTabTitoloMemorial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jTabTitoloMemorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 430, 50));

        jTabLabelVenefix.setFont(new java.awt.Font("Edwardian Script ITC", 0, 24)); // NOI18N
        jTabLabelVenefix.setText("Venefix");
        getContentPane().add(jTabLabelVenefix, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 720, 60, 30));

        jTabSfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tolomei.jpg"))); // NOI18N
        jTabSfondo.setMaximumSize(new java.awt.Dimension(1280, 768));
        jTabSfondo.setMinimumSize(new java.awt.Dimension(1280, 768));
        jTabSfondo.setPreferredSize(new java.awt.Dimension(1280, 768));
        getContentPane().add(jTabSfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getAccessibleContext().setAccessibleName("MEMORIAL   ALBERTO   CECCHERINI");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTab24secPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTab24secPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTab24secPropertyChange

    private void jTabMinPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTabMinPropertyChange
//        vbt = valore barra timer 
        int vbt = Integer.parseInt(jTabMin.getText());
        jTabBarraTimer.setValue(vbt);
  
    }//GEN-LAST:event_jTabMinPropertyChange

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
            java.util.logging.Logger.getLogger(Tabellone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabellone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabellone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabellone.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>eger
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabellone().setVisible(true);   }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel jTab24sec;
    private javax.swing.JLabel jTab2pBlink;
    public javax.swing.JProgressBar jTabBarra24s;
    public javax.swing.JProgressBar jTabBarraTimer;
    public javax.swing.JLabel jTabFalliCasa;
    public javax.swing.JLabel jTabFalliOsp;
    private javax.swing.JLabel jTabLabelVenefix;
    public javax.swing.JLabel jTabMin;
    private javax.swing.JLabel jTabNomeCasa;
    private javax.swing.JLabel jTabNomeOsp;
    private javax.swing.JLabel jTabOrario;
    private javax.swing.JLabel jTabPuntiCasa;
    private javax.swing.JLabel jTabPuntiOsp;
    public javax.swing.JLabel jTabSec;
    private javax.swing.JSeparator jTabSeparator1;
    private javax.swing.JLabel jTabSfondo;
    private javax.swing.JLabel jTabTitoloMemorial;
    // End of variables declaration//GEN-END:variables
 
    public void changejTabMin(Integer min) 
    {
        jTabMin.setText(min.toString());
    }
     public void changejTabSec(Integer sec) 
    {
        jTabSec.setText(sec.toString());
    }
    public void changejTab24sec(Integer v24) 
    {
// vb24 = valore barra 24 secondi
        int vb24 = Integer.parseInt(jTab24sec.getText());
        jTabBarra24s.setValue(vb24);
        jTab24sec.setText(v24.toString());
//        jTabBarra24s.setStringPainted(true);
       
      
    }
    public void changeNomeSquadraCasa(String name) 
    {
        jTabNomeCasa.setText(name);
    }
    public void changeNomeSquadraOsp(String name) 
    {
        jTabNomeOsp.setText(name);
    }
    public void changeJTabPuntiCasa(Integer value) 
    {
        jTabPuntiCasa.setText(value.toString());
    }
    public void changeJTabPuntiOsp(Integer valuepo) 
    {
        jTabPuntiOsp.setText(valuepo.toString());
    }
    public void changejTabFalliCasa(Integer valuefc) 
    {
        jTabFalliCasa.setText(valuefc.toString());
    }
    public void changejTabFalliOsp(Integer valuefo) 
    {
        jTabFalliOsp.setText(valuefo.toString());
    }
//    public void changeJTabNomeCasa(String value) 
//    {
//        jTabNomeCasa.setText(value.toString());
//    }
//    public void changeJTabNomeOsp(String value) 
//    {
//        jTabNomeOsp.setText(Consolemenu.jConsNomeOsp.getText());
//    }

   
}
