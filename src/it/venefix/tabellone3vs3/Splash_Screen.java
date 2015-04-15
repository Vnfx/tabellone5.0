
package it.venefix.tabellone3vs3;


//import java.io.BufferedInputStream;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import javax.swing.UIManager;
import com.sun.awt.AWTUtilities; // VEDERE MESSAGGI COMPILAZIONE
//import java.applet.AudioClip;
//import javazoom.jl.decoder.JavaLayerException;
//import javazoom.jl.player.Player;

public class Splash_Screen extends javax.swing.JFrame 
{
private Consolemenu consolemenu;
   
    public Splash_Screen() 
    {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        consolemenu = new Consolemenu();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplashFirma = new javax.swing.JLabel();
        jSplashVersione = new javax.swing.JLabel();
        jSplashTitolo = new javax.swing.JLabel();
        jSplashTitolo1 = new javax.swing.JLabel();
        jSplashSfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MEMORIAL ALBERTO CECCHERINI");
        setAlwaysOnTop(true);
        setFocusableWindowState(false);
        setMaximumSize(new java.awt.Dimension(619, 336));
        setMinimumSize(new java.awt.Dimension(619, 336));
        setName(""); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jSplashFirma.setFont(new java.awt.Font("Bradley Hand ITC", 0, 36)); // NOI18N
        jSplashFirma.setText("Venefix");
        jSplashFirma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSplashFirma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSplashFirmaMouseClicked(evt);
            }
        });
        getContentPane().add(jSplashFirma);
        jSplashFirma.setBounds(460, 265, 120, 40);

        jSplashVersione.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        jSplashVersione.setText("5.0");
        jSplashVersione.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSplashVersione.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSplashVersioneMouseClicked(evt);
            }
        });
        getContentPane().add(jSplashVersione);
        jSplashVersione.setBounds(50, 280, 60, 30);

        jSplashTitolo.setFont(new java.awt.Font("Bradley Hand ITC", 1, 50)); // NOI18N
        jSplashTitolo.setForeground(new java.awt.Color(255, 255, 255));
        jSplashTitolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSplashTitolo.setText("TORNEO 3 vs 3");
        jSplashTitolo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSplashTitolo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSplashTitoloMouseClicked(evt);
            }
        });
        getContentPane().add(jSplashTitolo);
        jSplashTitolo.setBounds(10, 10, 600, 40);

        jSplashTitolo1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 48)); // NOI18N
        jSplashTitolo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSplashTitolo1.setText("TORNEO 3 vs 3");
        getContentPane().add(jSplashTitolo1);
        jSplashTitolo1.setBounds(10, 10, 600, 40);

        jSplashSfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartoon_splash.png"))); // NOI18N
        jSplashSfondo.setToolTipText("Click To Open");
        jSplashSfondo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSplashSfondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSplashSfondoMouseClicked(evt);
            }
        });
        getContentPane().add(jSplashSfondo);
        jSplashSfondo.setBounds(10, 50, 600, 280);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jSplashSfondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSplashSfondoMouseClicked
       new Consolemenu().setVisible(true);
       this.dispose();
             
    }//GEN-LAST:event_jSplashSfondoMouseClicked

    private void jSplashTitoloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSplashTitoloMouseClicked
       new Consolemenu().setVisible(true);
       this.dispose();
      
    }//GEN-LAST:event_jSplashTitoloMouseClicked

    private void jSplashFirmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSplashFirmaMouseClicked
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jSplashFirmaMouseClicked

    private void jSplashVersioneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSplashVersioneMouseClicked
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jSplashVersioneMouseClicked

  public static void main(String args[]) 
    {
         
//        try {                  // lo splash screen si apre a fine audio e non insieme
//            FileInputStream fis;
//            Player player;
//            fis = new FileInputStream("C:\\Users\\Venefix\\Desktop\\intromusic.mp3");
//            BufferedInputStream bis = new BufferedInputStream(fis);
//            player = new Player(bis);
//            player.play();         
//        } catch (JavaLayerException e) {
//            e.printStackTrace();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

    
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
            java.util.logging.Logger.getLogger(Splash_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        new Splash_Screen().setVisible(true);
      

                
             }
    
//            private Object Consolemenu() 
//            {
//                throw new UnsupportedOperationException("Not supported yet.");
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jSplashFirma;
    private javax.swing.JLabel jSplashSfondo;
    private javax.swing.JLabel jSplashTitolo;
    private javax.swing.JLabel jSplashTitolo1;
    private javax.swing.JLabel jSplashVersione;
    // End of variables declaration//GEN-END:variables



}