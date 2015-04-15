
package it.venefix.tabellone3vs3;

import com.sun.awt.AWTUtilities;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Dimension;

/**
 *
 * @author Venefix
 */
public class Winner extends javax.swing.JFrame {
 boolean vaisx = true;
    
 
    public Winner() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        Dimension dim = getToolkit().getScreenSize(); // centra lo schermo
        this.setLocation(dim.width/2-this.getWidth()/2,dim.height/2-this.getHeight()/2);
           
           Timer timer = new Timer();
//           TimerTask task = new TimerTask()
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jWinWinner = new javax.swing.JLabel();
        jWinWinner1 = new javax.swing.JLabel();
        jWinSfondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1200, 768));
        setMinimumSize(new java.awt.Dimension(1200, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1200, 768));
        getContentPane().setLayout(null);

        jWinWinner.setFont(new java.awt.Font("Tahoma", 0, 144)); // NOI18N
        jWinWinner.setForeground(new java.awt.Color(255, 255, 255));
        jWinWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jWinWinner.setText("3 vs 3");
        jWinWinner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jWinWinner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jWinWinnerMouseClicked(evt);
            }
        });
        getContentPane().add(jWinWinner);
        jWinWinner.setBounds(5, 25, 1180, 190);

        jWinWinner1.setFont(new java.awt.Font("Tahoma", 0, 144)); // NOI18N
        jWinWinner1.setForeground(new java.awt.Color(204, 204, 204));
        jWinWinner1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jWinWinner1.setText("3 vs 3");
        jWinWinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jWinWinner1);
        jWinWinner1.setBounds(10, 20, 1180, 190);

        jWinSfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/winner.png"))); // NOI18N
        jWinSfondo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jWinSfondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jWinSfondoMouseClicked(evt);
            }
        });
        getContentPane().add(jWinSfondo);
        jWinSfondo.setBounds(60, 0, 1120, 727);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jWinSfondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jWinSfondoMouseClicked
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jWinSfondoMouseClicked

    private void jWinWinnerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jWinWinnerMouseClicked
    this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_jWinWinnerMouseClicked
    private void jWinWinner1MouseClicked(java.awt.event.MouseEvent evt) {                                        
    this.dispose();       // TODO add your handling code here:
    }
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
            java.util.logging.Logger.getLogger(Winner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Winner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Winner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Winner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Winner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jWinSfondo;
    public javax.swing.JLabel jWinWinner;
    public javax.swing.JLabel jWinWinner1;
    // End of variables declaration//GEN-END:variables

    void changeJWinWinner(String wincasa) {
        jWinWinner.setText(wincasa);
    }
    void changeJWinWinner1(String wincasa) {
        jWinWinner1.setText(wincasa);
    }

//  public void changeJWinWinner(String value) 
//    { 
//        jWinWinner.setText(wincasa);
//        public void run() // rende il nome del vincitore scorrevole
//        {
//          if (vaisx == true)
//            {
//            jWinWinner.setLocation(jWinWinner.getLocation().x -2,jWinWinner.getLocation ().y);
//            if (jWinWinner.getLocation().x < 0)
//                    {
//                        vaisx = false;
//                    }
//            }
//            else if (vaisx == false)
//            {
//             jWinWinner.setLocation(jWinWinner.getLocation().x +2,jWinWinner.getLocation ().y);  
//                if (jWinWinner.getLocation().x > 800)
//                    {
//                        vaisx = true;
//                    }
//            }
//
//        }
//    };
//    timer.scheduleAtFixedRate(task, 0, 50);
//        
    } 
