
package it.venefix.tabellone3vs3;


import java.awt.Dimension;

public class Splash_Screen extends javax.swing.JFrame 
{
private Consolemenu consolemenu;
   
    public Splash_Screen() 
    {
        initComponents();
       
        consolemenu = new Consolemenu();
         Dimension dim = getToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getWidth()/2,dim.height/2-this.getHeight()/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplashFirma = new javax.swing.JLabel();
        jSplashVersione = new javax.swing.JLabel();
        jSplashfondo = new javax.swing.JLabel();
        jSplashTitolo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MEMORIAL ALBERTO CECCHERINI");
        setAlwaysOnTop(true);
        setFocusableWindowState(false);
        setMaximumSize(new java.awt.Dimension(619, 336));
        setMinimumSize(new java.awt.Dimension(619, 336));
        setName(""); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(619, 336));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jSplashFirma.setFont(new java.awt.Font("Bradley Hand ITC", 0, 36)); // NOI18N
        jSplashFirma.setText("Venefix");
        getContentPane().add(jSplashFirma);
        jSplashFirma.setBounds(440, 250, 120, 40);

        jSplashVersione.setFont(new java.awt.Font("Bradley Hand ITC", 3, 36)); // NOI18N
        jSplashVersione.setText("5.0");
        getContentPane().add(jSplashVersione);
        jSplashVersione.setBounds(50, 280, 60, 30);

        jSplashfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartoon-basketball-court-hi.png"))); // NOI18N
        getContentPane().add(jSplashfondo);
        jSplashfondo.setBounds(10, 50, 600, 280);

        jSplashTitolo.setFont(new java.awt.Font("Felix Titling", 0, 32)); // NOI18N
        jSplashTitolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSplashTitolo.setText("Memorial Alberto Ceccherini");
        jSplashTitolo.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        getContentPane().add(jSplashTitolo);
        jSplashTitolo.setBounds(10, 0, 600, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
      
             /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                try
                    {
                        Thread.sleep(3000);
                    }
                 catch (Exception e)
                 {
                 }
                new Consolemenu().setVisible(true);
             }
            private Object Consolemenu() 
            {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jSplashFirma;
    private javax.swing.JLabel jSplashTitolo;
    private javax.swing.JLabel jSplashVersione;
    private javax.swing.JLabel jSplashfondo;
    // End of variables declaration//GEN-END:variables

    private static class AWUtilities {

        public AWUtilities() {
        }
    }

}