package it.venefix.tabellone3vs3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
//import sun.audio.*;


public class Consolemenu extends javax.swing.JFrame {
    Toolkit toolkit;
    private Tabellone tabellone;
    private Winner winner;

  
//    Timer vsxa = new Timer();
   
    public Consolemenu() {
        initComponents();
//        int finalegirone = 21;
//        boolean attivo = true;
        tabellone = new Tabellone();
        winner = new Winner();
        int finalegirone = 21;
        
        // centra lo schermo
        Dimension dim = getToolkit().getScreenSize(); 
        this.setLocation(dim.width/2-this.getWidth()/2,dim.height/2-this.getHeight()/2);
     
//    TimerTask scritta = new TimerTask()
//    {
//        boolean vaisx = true;
//        public void run() // rende la label (con la scritta venefix) scorrevole
//        {
//          if (vaisx == true)
//            {
//            tabellone.jTabLabelVenefix.setLocation(tabellone.jTabLabelVenefix.getLocation().x -2,tabellone.jTabLabelVenefix.getLocation ().y);
//            if (tabellone.jTabLabelVenefix.getLocation().x < 120)
//                    {
//                        vaisx = false;
//                    }
//            }
//            else if (vaisx == false)
//            {
//             tabellone.jTabLabelVenefix.setLocation(tabellone.jTabLabelVenefix.getLocation().x +2,tabellone.jTabLabelVenefix.getLocation ().y);  
//                if (tabellone.jTabLabelVenefix.getLocation().x > 1000)
//                    {
//                        vaisx = true;
//                    }
//            }    
//        }
//    };
//    vsxa.scheduleAtFixedRate(scritta, 0, 10);
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
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
        jConsGara3 = new javax.swing.JRadioButton();
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
        jMenuHelp = new javax.swing.JMenuItem();
        jMenuSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuEsci = new javax.swing.JMenuItem();
        jConsMenuOpz = new javax.swing.JMenu();
        jMenuSfondo = new javax.swing.JMenu();
        jCheckSfondoTabellone = new javax.swing.JCheckBoxMenuItem();
        jCheckSfondoConsole = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Console");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 153, 102));
        setBounds(new java.awt.Rectangle(2, 2, 2, 2));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImages(null);
        setMinimumSize(new java.awt.Dimension(770, 500));
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
        getContentPane().add(jConsNomeCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 230, 30));

        jConsTimerLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jConsTimerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jConsTimerLabel.setText("TIMER");
        jConsTimerLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jConsTimerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jConsTimerLabel.setOpaque(true);
        getContentPane().add(jConsTimerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 120, -1));

        jConsInizio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Play-1-Normal-Red-icontrasp.png"))); // NOI18N
        jConsInizio.setText("INIZIO");
        jConsInizio.setOpaque(false);
        jConsInizio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsInizioActionPerformed(evt);
            }
        });
        getContentPane().add(jConsInizio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 100, 30));

        jConsPausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pausarossatrasp.png"))); // NOI18N
        jConsPausa.setText("PAUSA");
        jConsPausa.setOpaque(false);
        jConsPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsPausaActionPerformed(evt);
            }
        });
        getContentPane().add(jConsPausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 100, 30));

        jConsMin.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jConsMin.setModel(new javax.swing.SpinnerNumberModel(12, 0, 30, 1));
        jConsMin.setMaximumSize(new java.awt.Dimension(143, 94));
        jConsMin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jConsMinStateChanged(evt);
            }
        });
        getContentPane().add(jConsMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 70, 50));

        jConsSec.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jConsSec.setModel(new javax.swing.SpinnerNumberModel(0, -1, 59, 1));
        jConsSec.setMaximumSize(new java.awt.Dimension(143, 94));
        jConsSec.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jConsSecStateChanged(evt);
            }
        });
        getContentPane().add(jConsSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 70, 50));

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

        jCons24Start.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jCons24Start.setForeground(new java.awt.Color(51, 204, 0));
        jCons24Start.setText("START");
        jCons24Start.setOpaque(false);
        jCons24Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCons24StartActionPerformed(evt);
            }
        });
        getContentPane().add(jCons24Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 70, -1));

        jCons24Reset.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jCons24Reset.setText("RESET");
        jCons24Reset.setOpaque(false);
        jCons24Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCons24ResetActionPerformed(evt);
            }
        });
        getContentPane().add(jCons24Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 70, -1));

        jCons24Stop.setForeground(new java.awt.Color(204, 0, 0));
        jCons24Stop.setText("STOP");
        jCons24Stop.setOpaque(false);
        jCons24Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCons24StopActionPerformed(evt);
            }
        });
        getContentPane().add(jCons24Stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 70, -1));

        jCons24s.setFont(new java.awt.Font("Roboto", 0, 48)); // NOI18N
        jCons24s.setModel(new javax.swing.SpinnerNumberModel(24, 0, 24, 1));
        jCons24s.setMaximumSize(new java.awt.Dimension(143, 94));
        jCons24s.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCons24sStateChanged(evt);
            }
        });
        getContentPane().add(jCons24s, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 90, 60));

        jConsPuntiCasa.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        jConsPuntiCasa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
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
        jConsPuntiOsp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
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
        jConsFalliCasa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
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
        jConsFalliOsp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jConsFalliOsp.setMaximumSize(new java.awt.Dimension(63, 64));
        jConsFalliOsp.setOpaque(false);
        jConsFalliOsp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jConsFalliOspStateChanged(evt);
            }
        });
        getContentPane().add(jConsFalliOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 90, 70));

        jConsAzzeraTutto.setText("Azzera");
        jConsAzzeraTutto.setOpaque(false);
        jConsAzzeraTutto.setPreferredSize(new java.awt.Dimension(79, 23));
        jConsAzzeraTutto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jConsAzzeraTuttoMouseClicked(evt);
            }
        });
        getContentPane().add(jConsAzzeraTutto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        jConsTabView.setText("Tabellone");
        jConsTabView.setToolTipText("Visualizza il Tabellone");
        jConsTabView.setOpaque(false);
        jConsTabView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsTabViewActionPerformed(evt);
            }
        });
        getContentPane().add(jConsTabView, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, -1));

        jConsGiocatoriView.setText("Giocatori");
        jConsGiocatoriView.setEnabled(false);
        jConsGiocatoriView.setOpaque(false);
        jConsGiocatoriView.setPreferredSize(new java.awt.Dimension(79, 23));
        getContentPane().add(jConsGiocatoriView, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));

        jConsFischio.setText("Fischio");
        jConsFischio.setToolTipText("Fischio");
        jConsFischio.setMaximumSize(new java.awt.Dimension(79, 23));
        jConsFischio.setMinimumSize(new java.awt.Dimension(79, 23));
        jConsFischio.setOpaque(false);
        jConsFischio.setPreferredSize(new java.awt.Dimension(79, 23));
        jConsFischio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsFischioActionPerformed(evt);
            }
        });
        getContentPane().add(jConsFischio, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, -1));

        jConsTipoGaraframe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jConsTipoGaraframe.setToolTipText("Modalità Torneo");
        jConsTipoGaraframe.setOpaque(false);
        jConsTipoGaraframe.setLayout(null);

        buttonGroup.add(jConsGirone);
        jConsGirone.setSelected(true);
        jConsGirone.setText("Girone");
        jConsGirone.setToolTipText("Girone Regolare");
        jConsGirone.setOpaque(false);
        jConsGirone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsGironeActionPerformed(evt);
            }
        });
        jConsTipoGaraframe.add(jConsGirone);
        jConsGirone.setBounds(10, 10, 60, 20);

        buttonGroup.add(jConsFinale);
        jConsFinale.setText("Finale");
        jConsFinale.setToolTipText("Finali e Semifinali");
        jConsFinale.setOpaque(false);
        jConsFinale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsFinaleActionPerformed(evt);
            }
        });
        jConsTipoGaraframe.add(jConsFinale);
        jConsFinale.setBounds(10, 50, 60, 20);

        buttonGroup.add(jConsGara3);
        jConsGara3.setText("3 Punti");
        jConsGara3.setToolTipText("Finali e Semifinali");
        jConsGara3.setOpaque(false);
        jConsGara3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsGara3ActionPerformed(evt);
            }
        });
        jConsTipoGaraframe.add(jConsGara3);
        jConsGara3.setBounds(10, 30, 60, 20);

        getContentPane().add(jConsTipoGaraframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 80, 80));

        jConsWinView.setText("Winner");
        jConsWinView.setOpaque(false);
        jConsWinView.setPreferredSize(new java.awt.Dimension(79, 23));
        jConsWinView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsWinViewActionPerformed(evt);
            }
        });
        getContentPane().add(jConsWinView, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, -1, -1));

        jConsGironeView.setText("Gironi");
        jConsGironeView.setEnabled(false);
        jConsGironeView.setOpaque(false);
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

        jConsBonusOsp.setBackground(new java.awt.Color(255, 255, 255));
        jConsBonusOsp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jConsBonusOsp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jConsBonusOsp.setOpaque(true);
        getContentPane().add(jConsBonusOsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 30, 70));

        jConsBonusCasa.setBackground(new java.awt.Color(255, 255, 255));
        jConsBonusCasa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jConsBonusCasa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jConsBonusCasa.setOpaque(true);
        getContentPane().add(jConsBonusCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 30, 70));

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
        getContentPane().add(jConsPulsanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 130, 500));

        jConsBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banner_trasp.png"))); // NOI18N
        jConsBanner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jConsBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 590, 90));

        jConsSfondo.setBackground(new java.awt.Color(102, 102, 102));
        jConsSfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parq.jpg"))); // NOI18N
        jConsSfondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jConsSfondo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jConsSfondo.setMaximumSize(new java.awt.Dimension(640, 520));
        jConsSfondo.setMinimumSize(new java.awt.Dimension(640, 520));
        jConsSfondo.setPreferredSize(new java.awt.Dimension(640, 520));
        jConsSfondo.setRequestFocusEnabled(false);
        getContentPane().add(jConsSfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        jConsMenu1.setText("File");

        jMenuHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        jMenuHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Menuhelp.gif"))); // NOI18N
        jMenuHelp.setText("Help");
        jMenuHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHelpActionPerformed(evt);
            }
        });
        jConsMenu1.add(jMenuHelp);
        jConsMenu1.add(jMenuSeparator4);

        jMenuEsci.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuEsci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menuchiudi.png"))); // NOI18N
        jMenuEsci.setText("Uscita");
        jMenuEsci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEsciActionPerformed(evt);
            }
        });
        jConsMenu1.add(jMenuEsci);

        jConsMenuBar.add(jConsMenu1);

        jConsMenuOpz.setText("Opzioni");
        jConsMenuOpz.setToolTipText("");

        jMenuSfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menusfondo.png"))); // NOI18N
        jMenuSfondo.setText("Disabilita Sfondo");

        jCheckSfondoTabellone.setSelected(true);
        jCheckSfondoTabellone.setText("Tabellone");
        jCheckSfondoTabellone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckSfondoTabelloneActionPerformed(evt);
            }
        });
        jMenuSfondo.add(jCheckSfondoTabellone);

        jCheckSfondoConsole.setSelected(true);
        jCheckSfondoConsole.setText("Console");
        jCheckSfondoConsole.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckSfondoConsoleItemStateChanged(evt);
            }
        });
        jCheckSfondoConsole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckSfondoConsoleActionPerformed(evt);
            }
        });
        jMenuSfondo.add(jCheckSfondoConsole);

        jConsMenuOpz.add(jMenuSfondo);

        jConsMenuBar.add(jConsMenuOpz);

        setJMenuBar(jConsMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private Timer t24s ;
    private Timer gara ;
    
    private void jConsInizioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsInizioActionPerformed
        if (jConsGara3.isSelected() == false) {
            gara = new Timer(1000, new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    Integer garasec = (Integer) jConsSec.getValue();
                    garasec--;
                    jConsSec.setValue(garasec);
                }    
            });
            gara.start();                                                                    
            jCons24Start.doClick();
        }
        else {
            gara = new Timer(1000, new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    Integer garasec = (Integer) jConsSec.getValue();
                    garasec--;
                    jConsSec.setValue(garasec);
                }    
            });
            gara.start();
        }
    }//GEN-LAST:event_jConsInizioActionPerformed
    private void jConsPuntiCasaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jConsPuntiCasaStateChanged
        int finalegirone;
        Integer valuepc = (Integer) jConsPuntiCasa.getValue();
        String wincasa = (String) jConsNomeCasa.getText();
        if (jConsFinale.isSelected()== true ){
             finalegirone = 30;
             
        }
        else{
             finalegirone = 21;
        }
            
        if (tabellone != null ) {
            tabellone.changeJTabPuntiCasa(valuepc);

            if (valuepc == finalegirone) {
              winner.setVisible(true); 
              toolkit.getDefaultToolkit().beep();
              winner.changeJWinWinner(wincasa);
              winner.changeJWinWinner1(wincasa);
            }
           
        }
    }//GEN-LAST:event_jConsPuntiCasaStateChanged

 
    private void jConsFischioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsFischioActionPerformed
         toolkit.getDefaultToolkit().beep();
    }//GEN-LAST:event_jConsFischioActionPerformed

    private void jConsFinaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsFinaleActionPerformed
        jConsMin.setValue(15);
        jConsSec.setValue(00);
        jConsPuntiCasa.setMaximumSize(null);
        jConsPuntiOsp.setMaximumSize(null);
        int finalegirone = 30;
        jCons24s.setVisible(true);
        jCons24Start.setVisible(true);
        jCons24Reset.setVisible(true);
        jCons24Stop.setVisible(true);
        
        jConsFalliCasa.setVisible(true);
        jConsBonusCasa.setVisible(true);   
        jConsFalliOsp.setVisible(true);
        jConsBonusOsp.setVisible(true); 
        
        jConsLabelFalliOsp.setVisible(true);
        jConsLabelFalliCasa.setVisible(true);
        
        tabellone.jTabFalliCasa.setVisible(true);
        tabellone.jTab24s.setVisible(true);   
        tabellone.jTabFalliOsp.setVisible(true);
        tabellone.jTabBarra24s.setVisible(true);
    }//GEN-LAST:event_jConsFinaleActionPerformed

    private void jConsTabViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsTabViewActionPerformed
    tabellone.setVisible(true);
    tabellone.changeNomeCasa(jConsNomeCasa.getText());
    tabellone.changeNomeOsp(jConsNomeOsp.getText());
    }//GEN-LAST:event_jConsTabViewActionPerformed

    private void jConsWinViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsWinViewActionPerformed
     winner.setVisible(true);   
    }//GEN-LAST:event_jConsWinViewActionPerformed

    private void jConsPuntiOspStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jConsPuntiOspStateChanged
        int finalegirone;
        Integer valuepo = (Integer) jConsPuntiOsp.getValue();
        String wincasa = (String) jConsNomeOsp.getText();
        if (jConsFinale.isSelected()== true ){
             finalegirone = 30;
        }
        else{
             finalegirone = 21;
        }
        if (tabellone != null ) {
            tabellone.changeJTabPuntiOsp(valuepo);
            if (valuepo == finalegirone) {
              winner.setVisible(true); 
              toolkit.getDefaultToolkit().beep();
              winner.changeJWinWinner(wincasa);
              winner.changeJWinWinner1(wincasa);
            }
        }   
//        Integer valuepo = (Integer) jConsPuntiOsp.getValue();
//        String winosp = (String) jConsNomeOsp.getText();
//        if (tabellone != null ) 
//       {
//        tabellone.changeJTabPuntiOsp(valuepo);
//       }
//        if (valuepo.equals(21)) 
//        {
//            winner.setVisible(true);
//            toolkit.getDefaultToolkit().beep();
//            winner.changeJWinWinner(winosp);
//            winner.changeJWinWinner1(winosp);
//        } else 
//        {
//           
//        }
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
            jConsBonusCasa.setBackground(Color.red);
            tabellone.jTabFalliCasa.setBackground(Color.red);
         } 
           else {
              if (valuefc <(4)) 
             jConsBonusCasa.setOpaque(false);
             jConsBonusCasa.setBackground(Color.white);
             jConsFalliCasa.setBackground(Color.black);
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
              jConsBonusOsp.setOpaque (true);
              jConsBonusOsp.setBackground(Color.red);
              tabellone.jTabFalliOsp.setBackground(Color.red);
        } 
            else {
              if (valuefo <(4)) 
             jConsBonusOsp.setOpaque (false);
             jConsBonusOsp.setBackground(Color.white);
             jConsFalliOsp.setBackground(Color.white);
             tabellone.jTabFalliOsp.setBackground(Color.white);
        }
    }//GEN-LAST:event_jConsFalliOspStateChanged

    private void jCons24StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCons24StartActionPerformed
        t24s = new Timer(1000, new ActionListener() {
         public void actionPerformed(ActionEvent evt) {                                    //24 SECONDI
                       jCons24Start.setEnabled(false);
                       jCons24Start.setForeground(Color.gray);
                       Integer tempo = (Integer) jCons24s.getValue();
                       tempo --;
                       System.out.println("tempo"+tempo);
                       jCons24s.setValue(tempo);
                           if (tempo == -1){
                                jCons24s.setValue(24); 
                              
                            }
                               else if (tempo == 0){
                                  t24s.stop();
                                  gara.stop();
                                  jCons24Start.setEnabled(true);
                                }
         }
        });
        t24s.start(); 

    }//GEN-LAST:event_jCons24StartActionPerformed

    private void jCons24ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCons24ResetActionPerformed
       jCons24s.setValue(24);
       jCons24Start.setEnabled(true);
       jCons24Start.setForeground(Color.green);
       tabellone.jTab24s.setText("24");
       tabellone.jTabBarra24s.setValue(24);
    }//GEN-LAST:event_jCons24ResetActionPerformed

    private void jCons24sStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCons24sStateChanged
        Integer v24 = (Integer) jCons24s.getValue();  
        tabellone.changejTab24s(v24);
    }//GEN-LAST:event_jCons24sStateChanged

    private void jMenuEsciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEsciActionPerformed
            System.exit(0) ;      
    }//GEN-LAST:event_jMenuEsciActionPerformed

    private void jMenuHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHelpActionPerformed
        new InfoMenu().setVisible(true);
    }//GEN-LAST:event_jMenuHelpActionPerformed

    private void jCheckSfondoTabelloneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckSfondoTabelloneActionPerformed
        tabellone.jTabSfondo.setIcon(null);
    }//GEN-LAST:event_jCheckSfondoTabelloneActionPerformed

    private void jCheckSfondoConsoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckSfondoConsoleActionPerformed
        jConsSfondo.setIcon(null);
        jConsPulsanti.setIcon(null);
        jConsBanner.setIcon(null);
    }//GEN-LAST:event_jCheckSfondoConsoleActionPerformed

    private void jCheckSfondoConsoleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckSfondoConsoleItemStateChanged
        
//        if (attivo = true){
//        jConsPulsanti.setIcon(null);
//        jConsSfondo.setIcon(null);
//        attivo = false;    //attivare il toggle per attivare/disattivare lo sfondo
//        }
//        if (attivo = false);{
//        jConsSfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parq.jpg")));
//        jConsPulsanti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parq2vert.jpg")));
//        attivo = true;
//         }
    }//GEN-LAST:event_jCheckSfondoConsoleItemStateChanged

    private void jConsNomeCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsNomeCasaActionPerformed
    }//GEN-LAST:event_jConsNomeCasaActionPerformed

    private void jConsPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsPausaActionPerformed
        gara.stop(); 
        jConsInizio.setEnabled(true);
        jCons24Stop.doClick();
    }//GEN-LAST:event_jConsPausaActionPerformed

    private void jCons24StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCons24StopActionPerformed
        t24s.stop();
        jCons24Start.setForeground(Color.green);
        jCons24Start.setEnabled(true);
    }//GEN-LAST:event_jCons24StopActionPerformed

    private void jConsSecStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jConsSecStateChanged
          Integer seccon = (Integer) jConsSec.getValue();  
          Integer mincon = (Integer) jConsMin.getValue(); 
          tabellone.changejTabSec(seccon); 
          tabellone.changejTabMin(mincon); 
            if (seccon == -1){
              jConsSec.setValue(59);   
              mincon --;
              jConsMin.setValue(mincon);
            }
            if ((seccon == 0) && (mincon == 0)){
                gara.stop();
                t24s.stop();
                winner.setVisible(true);
                jConsMin.setValue(12);
                jConsMin.setValue(0);
            }
            
    }//GEN-LAST:event_jConsSecStateChanged

    private void jConsMinStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jConsMinStateChanged
          Integer secmin = (Integer) jConsMin.getValue();  
          tabellone.changejTabMin(secmin);  
    }//GEN-LAST:event_jConsMinStateChanged

    private void jConsGara3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsGara3ActionPerformed
       jConsMin.setValue(2);
       jConsSec.setValue(30);
       
       jCons24s.setVisible(false);
       jCons24Start.setVisible(false);
       jCons24Reset.setVisible(false);
       jCons24Stop.setVisible(false);
       
       jConsFalliCasa.setVisible(false);
       jConsBonusCasa.setVisible(false);   
       jConsFalliOsp.setVisible(false);
       jConsBonusOsp.setVisible(false); 
       
       jConsLabelFalliOsp.setVisible(false);
       jConsLabelFalliCasa.setVisible(false);
       
       tabellone.jTabFalliCasa.setVisible(false);
       tabellone.jTab24s.setVisible(false);   
       tabellone.jTabFalliOsp.setVisible(false);
       tabellone.jTabBarra24s.setVisible(false);
      
       
    }//GEN-LAST:event_jConsGara3ActionPerformed

    private void jConsGironeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsGironeActionPerformed
        jConsMin.setValue(12);
        jConsSec.setValue(00);
//        int finalegirone = 21;
        jCons24s.setVisible(true);
        jCons24Start.setVisible(true);
        jCons24Reset.setVisible(true);
        jCons24Stop.setVisible(true);
        
        jConsFalliCasa.setVisible(true);
        jConsBonusCasa.setVisible(true);   
        jConsFalliOsp.setVisible(true);
        jConsBonusOsp.setVisible(true); 
          
        jConsLabelFalliOsp.setVisible(true);
        jConsLabelFalliCasa.setVisible(true);
        
        tabellone.jTabFalliCasa.setVisible(true);
        tabellone.jTab24s.setVisible(true);   
        tabellone.jTabFalliOsp.setVisible(true);
        tabellone.jTabBarra24s.setVisible(true);
    }//GEN-LAST:event_jConsGironeActionPerformed

    private void jConsAzzeraTuttoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jConsAzzeraTuttoMouseClicked
//        azzera crono e 24 s
        jConsMin.setValue(12);                // NON FUNZIONA
        jConsSec.setValue(00);
        tabellone.jTabMin.setText("12");
        tabellone.jTabSec.setText("00");
        jCons24s.setValue(24);
        tabellone.jTab24s.setText("24");
        tabellone.jTabBarra24s.setValue(24);
//        azzera falli 
        jCons24Reset.doClick();  // vedi commento 1
        jConsFalliOsp.setBackground(Color.black);
        jConsFalliCasa.setBackground(Color.white);
        tabellone.jTabFalliCasa.setBackground(Color.black);
        tabellone.jTabFalliOsp.setBackground(Color.white);
        jConsFalliOsp.setValue(0);
        jConsFalliCasa.setValue(0);
        jConsBonusOsp.setOpaque(false);  
        jConsBonusCasa.setOpaque(false);  
//        azzera punti e nome squadre
        jConsPuntiOsp.setValue(0);
        jConsPuntiCasa.setValue(0);
        jConsNomeOsp.setText("SQUADRA OSPITI");
        jConsNomeCasa.setText("SQUADRA CASA");
        tabellone.changeNomeOsp("SQUADRA OSPITI");
        tabellone.changeNomeCasa("SQUADRA CASA");
//        chiusura di winner
        winner.jWinWinner.setText("3 VS 3");
        winner.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jConsAzzeraTuttoMouseClicked

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
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JCheckBoxMenuItem jCheckSfondoConsole;
    private javax.swing.JCheckBoxMenuItem jCheckSfondoTabellone;
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
    private javax.swing.JRadioButton jConsGara3;
    private javax.swing.JButton jConsGiocatoriView;
    private javax.swing.JRadioButton jConsGirone;
    private javax.swing.JButton jConsGironeView;
    private javax.swing.JButton jConsInizio;
    private javax.swing.JLabel jConsLabelFalliCasa;
    private javax.swing.JLabel jConsLabelFalliOsp;
    private javax.swing.JLabel jConsLabelVenefix;
    private javax.swing.JLabel jConsMemorial;
    private javax.swing.JMenu jConsMenu1;
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
    private javax.swing.JMenuItem jMenuEsci;
    private javax.swing.JMenuItem jMenuHelp;
    private javax.swing.JPopupMenu.Separator jMenuSeparator4;
    private javax.swing.JMenu jMenuSfondo;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

//    private Object Tabellone() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
;