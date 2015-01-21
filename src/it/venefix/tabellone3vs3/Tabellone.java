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
public class Tabellone extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Tabellone() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabBarra24s = new javax.swing.JProgressBar();
        jTabSeparator1 = new javax.swing.JSeparator();
        jTabBarraTempoGara = new javax.swing.JProgressBar();
        jTabNomeCasa = new javax.swing.JLabel();
        jTabNomeOsp = new javax.swing.JLabel();
        jTabPuntiOsp = new javax.swing.JLabel();
        jTabPuntiCasa = new javax.swing.JLabel();
        jTabMin = new javax.swing.JLabel();
        jTabSec = new javax.swing.JLabel();
        jTab2puntiLampeggianti = new javax.swing.JLabel();
        JTabBonusCasa = new javax.swing.JLabel();
        jTabFalliCasa = new javax.swing.JLabel();
        jTabFalliOsp = new javax.swing.JLabel();
        jTabBonusOsp = new javax.swing.JLabel();
        jTab24sec = new javax.swing.JLabel();
        jTabTitoloMemorial = new javax.swing.JLabel();
        jTabLabelVenefix = new javax.swing.JLabel();
        jTabSfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MEMORIAL ALBERTO CECCHERINI");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 51, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(1280, 768));
        setMinimumSize(new java.awt.Dimension(1280, 768));
        setName("Tabellone"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1280, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabBarra24s.setForeground(new java.awt.Color(0, 0, 0));
        jTabBarra24s.setMinimum(24);
        jTabBarra24s.setToolTipText("Barra 24s");
        jTabBarra24s.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabBarra24s.setName("Barra24s"); // NOI18N
        getContentPane().add(jTabBarra24s, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 250, 150, 22));
        getContentPane().add(jTabSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 520, 10));
        getContentPane().add(jTabBarraTempoGara, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 670, 520, 27));

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
        jTabPuntiOsp.setText("0");
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
        jTabPuntiCasa.setText("0");
        jTabPuntiCasa.setToolTipText("Punti Casa");
        jTabPuntiCasa.setMaximumSize(new java.awt.Dimension(266, 295));
        jTabPuntiCasa.setMinimumSize(new java.awt.Dimension(266, 295));
        jTabPuntiCasa.setOpaque(true);
        jTabPuntiCasa.setPreferredSize(new java.awt.Dimension(266, 295));
        getContentPane().add(jTabPuntiCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 330, 240));

        jTabMin.setBackground(new java.awt.Color(0, 0, 0));
        jTabMin.setFont(new java.awt.Font("Roboto", 1, 200)); // NOI18N
        jTabMin.setForeground(new java.awt.Color(0, 204, 51));
        jTabMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTabMin.setText("10");
        jTabMin.setToolTipText("Minuti");
        jTabMin.setMaximumSize(new java.awt.Dimension(218, 243));
        jTabMin.setMinimumSize(new java.awt.Dimension(218, 243));
        jTabMin.setOpaque(true);
        jTabMin.setPreferredSize(new java.awt.Dimension(218, 243));
        getContentPane().add(jTabMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 250, 270));

        jTabSec.setBackground(new java.awt.Color(0, 0, 0));
        jTabSec.setFont(new java.awt.Font("Roboto Th", 0, 200)); // NOI18N
        jTabSec.setForeground(new java.awt.Color(0, 204, 51));
        jTabSec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTabSec.setText("00");
        jTabSec.setToolTipText("Secondi");
        jTabSec.setOpaque(true);
        getContentPane().add(jTabSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 250, 270));

        jTab2puntiLampeggianti.setBackground(new java.awt.Color(0, 0, 0));
        jTab2puntiLampeggianti.setFont(new java.awt.Font("Roboto", 0, 150)); // NOI18N
        jTab2puntiLampeggianti.setForeground(new java.awt.Color(0, 204, 51));
        jTab2puntiLampeggianti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTab2puntiLampeggianti.setText(":");
        jTab2puntiLampeggianti.setToolTipText("Puntini Lampeggianti Tempo");
        jTab2puntiLampeggianti.setOpaque(true);
        getContentPane().add(jTab2puntiLampeggianti, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 400, -1, 270));

        JTabBonusCasa.setToolTipText("Bonus Casa");
        JTabBonusCasa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(JTabBonusCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, 260, 70));

        jTabFalliCasa.setBackground(new java.awt.Color(0, 0, 0));
        jTabFalliCasa.setFont(new java.awt.Font("Roboto", 0, 90)); // NOI18N
        jTabFalliCasa.setForeground(new java.awt.Color(255, 255, 255));
        jTabFalliCasa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTabFalliCasa.setText("0");
        jTabFalliCasa.setToolTipText("Falli Casa");
        jTabFalliCasa.setOpaque(true);
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

        jTabBonusOsp.setToolTipText("Bonus Ospiti");
        jTabBonusOsp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTabBonusOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 620, 260, 70));

        jTab24sec.setBackground(new java.awt.Color(0, 0, 0));
        jTab24sec.setFont(new java.awt.Font("Roboto Th", 1, 110)); // NOI18N
        jTab24sec.setForeground(new java.awt.Color(0, 204, 51));
        jTab24sec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTab24sec.setText("24");
        jTab24sec.setToolTipText("24 Sec");
        jTab24sec.setOpaque(true);
        getContentPane().add(jTab24sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 110, 150, 140));

        jTabTitoloMemorial.setFont(new java.awt.Font("Edwardian Script ITC", 1, 30)); // NOI18N
        jTabTitoloMemorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTabTitoloMemorial.setText("Memorial Alberto Ceccherini");
        jTabTitoloMemorial.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jTabTitoloMemorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 370, 50));

        jTabLabelVenefix.setFont(new java.awt.Font("Edwardian Script ITC", 0, 24)); // NOI18N
        jTabLabelVenefix.setText("Venefix");
        getContentPane().add(jTabLabelVenefix, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 710, 60, 30));

        jTabSfondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Venefix\\Desktop\\Tabellone 5.0\\IMAGES\\tolomei.jpg")); // NOI18N
        jTabSfondo.setMaximumSize(new java.awt.Dimension(1280, 768));
        jTabSfondo.setMinimumSize(new java.awt.Dimension(1280, 768));
        jTabSfondo.setPreferredSize(new java.awt.Dimension(1280, 768));
        getContentPane().add(jTabSfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getAccessibleContext().setAccessibleName("MEMORIAL   ALBERTO   CECCHERINI");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    public void changeJTabPuntiCasa(Integer value) {
        jTabPuntiCasa.setText(value.toString());
    }
    public void changeJTabPuntiOsp(Integer valuepo) {
        jTabPuntiOsp.setText(valuepo.toString());
    }
    public void changeJTabFalliCasa(Integer valuefc) {
        jTabFalliCasa.setText(valuefc.toString());
    }
    public void changeJTabFalliOsp(Integer valuefo) {
        jTabFalliOsp.setText(valuefo.toString());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JTabBonusCasa;
    private javax.swing.JLabel jTab24sec;
    private javax.swing.JLabel jTab2puntiLampeggianti;
    private javax.swing.JProgressBar jTabBarra24s;
    private javax.swing.JProgressBar jTabBarraTempoGara;
    private javax.swing.JLabel jTabBonusOsp;
    private javax.swing.JLabel jTabFalliCasa;
    private javax.swing.JLabel jTabFalliOsp;
    private javax.swing.JLabel jTabLabelVenefix;
    private javax.swing.JLabel jTabMin;
    private javax.swing.JLabel jTabNomeCasa;
    private javax.swing.JLabel jTabNomeOsp;
    private javax.swing.JLabel jTabPuntiCasa;
    private javax.swing.JLabel jTabPuntiOsp;
    private javax.swing.JLabel jTabSec;
    private javax.swing.JSeparator jTabSeparator1;
    private javax.swing.JLabel jTabSfondo;
    private javax.swing.JLabel jTabTitoloMemorial;
    // End of variables declaration//GEN-END:variables

   // public javax.swing.JLabel jTabPuntiOsp;
      //   void changeJTabPuntiOsp(Integer value) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//}
