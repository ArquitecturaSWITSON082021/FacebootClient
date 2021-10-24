/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;

/**
 *
 * @author urias
 */
public class Settings extends javax.swing.JFrame {

    private int mouseX;
    private int mouseY;
    
    /**
     * Creates new form Settings
     */
    public Settings() {
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

        jSeparator1 = new javax.swing.JSeparator();
        topBar1 = new javax.swing.JPanel();
        DisposeButton = new javax.swing.JLabel();
        MinimizeButton = new javax.swing.JLabel();
        FullScreenButton = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        DisposeButtonW = new javax.swing.JLabel();
        FullScreenButtonW = new javax.swing.JLabel();
        MinimizeButtonW = new javax.swing.JLabel();
        topMenu = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        containerSearch = new View.Components.RoundPanelText();
        searchIcon = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        containerHome = new View.Components.RoundedPanel();
        homeButton = new javax.swing.JButton();
        containerSettings = new View.Components.RoundPanelText();
        settings = new javax.swing.JButton();
        containerNotifications = new View.Components.RoundPanelText();
        notifications = new javax.swing.JButton();
        containerUser = new View.Components.RoundPanelText();
        user = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtBirth = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topBar1.setBackground(new java.awt.Color(31, 32, 36));
        topBar1.setPreferredSize(new java.awt.Dimension(0, 35));
        topBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topBar1MouseDragged(evt);
            }
        });
        topBar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topBar1MousePressed(evt);
            }
        });
        topBar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DisposeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DisposeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/DisposeButton.png"))); // NOI18N
        DisposeButton.setMaximumSize(new java.awt.Dimension(14, 14));
        DisposeButton.setMinimumSize(new java.awt.Dimension(14, 14));
        DisposeButton.setPreferredSize(new java.awt.Dimension(14, 14));
        DisposeButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DisposeButtonMouseMoved(evt);
            }
        });
        DisposeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DisposeButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DisposeButtonMousePressed(evt);
            }
        });
        topBar1.add(DisposeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        MinimizeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MinimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/MinimizeButton.png"))); // NOI18N
        MinimizeButton.setMaximumSize(new java.awt.Dimension(14, 14));
        MinimizeButton.setMinimumSize(new java.awt.Dimension(14, 14));
        MinimizeButton.setPreferredSize(new java.awt.Dimension(14, 14));
        MinimizeButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MinimizeButtonMouseMoved(evt);
            }
        });
        MinimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MinimizeButtonMousePressed(evt);
            }
        });
        topBar1.add(MinimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        FullScreenButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FullScreenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/FullScreenButton.png"))); // NOI18N
        FullScreenButton.setMaximumSize(new java.awt.Dimension(14, 14));
        FullScreenButton.setMinimumSize(new java.awt.Dimension(14, 14));
        FullScreenButton.setPreferredSize(new java.awt.Dimension(14, 14));
        FullScreenButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FullScreenButtonMouseMoved(evt);
            }
        });
        FullScreenButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FullScreenButtonMouseExited(evt);
            }
        });
        topBar1.add(FullScreenButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/Faceboot.png"))); // NOI18N
        topBar1.add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 0, 145, 35));

        DisposeButtonW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DisposeButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/DisposeButtonW.png"))); // NOI18N
        DisposeButtonW.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DisposeButtonWMouseMoved(evt);
            }
        });
        DisposeButtonW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DisposeButtonWMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DisposeButtonWMousePressed(evt);
            }
        });
        topBar1.add(DisposeButtonW, new org.netbeans.lib.awtextra.AbsoluteConstraints(968, 0, 55, 33));

        FullScreenButtonW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FullScreenButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/FullScreenButtonW.png"))); // NOI18N
        FullScreenButtonW.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FullScreenButtonWMouseMoved(evt);
            }
        });
        FullScreenButtonW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FullScreenButtonWMouseExited(evt);
            }
        });
        topBar1.add(FullScreenButtonW, new org.netbeans.lib.awtextra.AbsoluteConstraints(911, 0, 55, 33));

        MinimizeButtonW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MinimizeButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/MinimizeButtonW.png"))); // NOI18N
        MinimizeButtonW.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MinimizeButtonWMouseMoved(evt);
            }
        });
        MinimizeButtonW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeButtonWMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MinimizeButtonWMousePressed(evt);
            }
        });
        topBar1.add(MinimizeButtonW, new org.netbeans.lib.awtextra.AbsoluteConstraints(854, 0, 55, 33));

        topMenu.setBackground(new java.awt.Color(31, 32, 36));
        topMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/flogo.png"))); // NOI18N
        topMenu.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 7, 40, -1));

        containerSearch.setBackground(new java.awt.Color(58, 59, 60));

        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/search.png"))); // NOI18N

        search.setBackground(new java.awt.Color(58, 59, 60));
        search.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        search.setForeground(new java.awt.Color(204, 204, 204));
        search.setBorder(null);
        search.setDisabledTextColor(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout containerSearchLayout = new javax.swing.GroupLayout(containerSearch);
        containerSearch.setLayout(containerSearchLayout);
        containerSearchLayout.setHorizontalGroup(
            containerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        containerSearchLayout.setVerticalGroup(
            containerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search)
                    .addGroup(containerSearchLayout.createSequentialGroup()
                        .addComponent(searchIcon)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        topMenu.add(containerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 190, 50));

        containerHome.setBackground(new java.awt.Color(31, 32, 36));
        containerHome.setLayout(new java.awt.BorderLayout());

        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/home.png"))); // NOI18N
        homeButton.setContentAreaFilled(false);
        homeButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                homeButtonMouseMoved(evt);
            }
        });
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButtonMouseExited(evt);
            }
        });
        containerHome.add(homeButton, java.awt.BorderLayout.CENTER);

        topMenu.add(containerHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 4, 104, 48));

        containerSettings.setBackground(new java.awt.Color(58, 59, 60));
        containerSettings.setLayout(new java.awt.BorderLayout());

        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/settings.png"))); // NOI18N
        settings.setContentAreaFilled(false);
        settings.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        settings.setIconTextGap(0);
        settings.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                settingsMouseMoved(evt);
            }
        });
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        containerSettings.add(settings, java.awt.BorderLayout.CENTER);

        topMenu.add(containerSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(964, 7, 40, 40));

        containerNotifications.setBackground(new java.awt.Color(58, 59, 60));
        containerNotifications.setLayout(new java.awt.BorderLayout());

        notifications.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/notifications.png"))); // NOI18N
        notifications.setContentAreaFilled(false);
        notifications.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        notifications.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                notificationsMouseMoved(evt);
            }
        });
        notifications.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                notificationsMouseExited(evt);
            }
        });
        containerNotifications.add(notifications, java.awt.BorderLayout.CENTER);

        topMenu.add(containerNotifications, new org.netbeans.lib.awtextra.AbsoluteConstraints(914, 7, 40, 40));

        containerUser.setBackground(new java.awt.Color(58, 59, 60));
        containerUser.setLayout(new java.awt.BorderLayout());

        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/user.png"))); // NOI18N
        user.setContentAreaFilled(false);
        user.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        user.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                userMouseMoved(evt);
            }
        });
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
        });
        containerUser.add(user, java.awt.BorderLayout.CENTER);

        topMenu.add(containerUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 7, 40, 40));

        jPanel1.setBackground(new java.awt.Color(24, 25, 26));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Configuración general de la cuenta");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(228, 230, 235));
        jSeparator2.setForeground(new java.awt.Color(228, 230, 235));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 902, 1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edad");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 902, 1));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 902, 1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo electrónico");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 902, 1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Número de celular");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexo");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jSeparator6.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator6.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 902, 1));

        jSeparator7.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator7.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 902, 1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de nacimiento");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        txtAge.setBackground(new java.awt.Color(0, 0, 0));
        txtAge.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtAge.setForeground(new java.awt.Color(102, 102, 102));
        txtAge.setText("19");
        txtAge.setBorder(null);
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        jPanel2.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 600, -1));

        txtName.setBackground(new java.awt.Color(0, 0, 0));
        txtName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(102, 102, 102));
        txtName.setText("Usuario");
        txtName.setBorder(null);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 600, -1));

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(0, 0, 0));
        txtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));
        txtEmail.setText("Usuario@hotmail.com");
        txtEmail.setBorder(null);
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 600, -1));

        txtNumber.setEditable(false);
        txtNumber.setBackground(new java.awt.Color(0, 0, 0));
        txtNumber.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtNumber.setForeground(new java.awt.Color(102, 102, 102));
        txtNumber.setText("6442574128");
        txtNumber.setBorder(null);
        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });
        jPanel2.add(txtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 600, -1));

        txtGender.setBackground(new java.awt.Color(0, 0, 0));
        txtGender.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtGender.setForeground(new java.awt.Color(102, 102, 102));
        txtGender.setText("Hombre");
        txtGender.setBorder(null);
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        jPanel2.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 600, -1));

        txtBirth.setBackground(new java.awt.Color(0, 0, 0));
        txtBirth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtBirth.setForeground(new java.awt.Color(102, 102, 102));
        txtBirth.setText("29 de octubre de 2001");
        txtBirth.setBorder(null);
        txtBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBirthActionPerformed(evt);
            }
        });
        jPanel2.add(txtBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 600, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
            .addComponent(topBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(topMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisposeButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisposeButtonMouseMoved
        DisposeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/DisposeButton2.png")));
    }//GEN-LAST:event_DisposeButtonMouseMoved

    private void DisposeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisposeButtonMouseExited
        DisposeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/DisposeButton.png")));
    }//GEN-LAST:event_DisposeButtonMouseExited

    private void DisposeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisposeButtonMousePressed
        if (evt.getClickCount() >= 0) {
            this.dispose();
        }
    }//GEN-LAST:event_DisposeButtonMousePressed

    private void MinimizeButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMouseMoved
        MinimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/MinimizeButton2.png")));
    }//GEN-LAST:event_MinimizeButtonMouseMoved

    private void MinimizeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMouseExited
        MinimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/MinimizeButton.png")));
    }//GEN-LAST:event_MinimizeButtonMouseExited

    private void MinimizeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonMousePressed
        if (evt.getClickCount() >= 0) {
            this.setExtendedState(1);
        }
    }//GEN-LAST:event_MinimizeButtonMousePressed

    private void FullScreenButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FullScreenButtonMouseMoved
        FullScreenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/FullScreenButton2.png")));
    }//GEN-LAST:event_FullScreenButtonMouseMoved

    private void FullScreenButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FullScreenButtonMouseExited
        FullScreenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/FullScreenButton.png")));
    }//GEN-LAST:event_FullScreenButtonMouseExited

    private void DisposeButtonWMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisposeButtonWMouseMoved
        DisposeButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/DisposeButtonW2.png")));
    }//GEN-LAST:event_DisposeButtonWMouseMoved

    private void DisposeButtonWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisposeButtonWMouseExited
        DisposeButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/DisposeButtonW.png")));
    }//GEN-LAST:event_DisposeButtonWMouseExited

    private void DisposeButtonWMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisposeButtonWMousePressed
        if (evt.getClickCount() >= 0) {
            this.dispose();
        }
    }//GEN-LAST:event_DisposeButtonWMousePressed

    private void FullScreenButtonWMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FullScreenButtonWMouseMoved
        FullScreenButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/FullScreenButtonW2.png")));
    }//GEN-LAST:event_FullScreenButtonWMouseMoved

    private void FullScreenButtonWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FullScreenButtonWMouseExited
        FullScreenButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/FullScreenButtonW.png")));
    }//GEN-LAST:event_FullScreenButtonWMouseExited

    private void MinimizeButtonWMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonWMouseMoved
        MinimizeButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/MinimizeButtonW2.png")));
    }//GEN-LAST:event_MinimizeButtonWMouseMoved

    private void MinimizeButtonWMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonWMouseExited
        MinimizeButtonW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/MinimizeButtonW.png")));
    }//GEN-LAST:event_MinimizeButtonWMouseExited

    private void MinimizeButtonWMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeButtonWMousePressed
        if (evt.getClickCount() >= 0) {
            this.setExtendedState(1);
        }
    }//GEN-LAST:event_MinimizeButtonWMousePressed

    private void topBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topBar1MouseDragged
        int X = evt.getXOnScreen();
        int Y = evt.getYOnScreen();

        setLocation(X - mouseX, Y - mouseY + 1);
    }//GEN-LAST:event_topBar1MouseDragged

    private void topBar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topBar1MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_topBar1MousePressed

    private void homeButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseMoved
        containerHome.setBackground(new Color(58,59,60));
    }//GEN-LAST:event_homeButtonMouseMoved

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        containerHome.setBackground(new Color(31,32,36));
    }//GEN-LAST:event_homeButtonMouseExited

    private void settingsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseMoved
        containerSettings.setBackground(new Color(84,86,86));
    }//GEN-LAST:event_settingsMouseMoved

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        containerSettings.setBackground(new Color(58,59,60));
    }//GEN-LAST:event_settingsMouseExited

    private void notificationsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationsMouseMoved
        containerNotifications.setBackground(new Color(84,86,86));
    }//GEN-LAST:event_notificationsMouseMoved

    private void notificationsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationsMouseExited
        containerNotifications.setBackground(new Color(58,59,60));
    }//GEN-LAST:event_notificationsMouseExited

    private void userMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseMoved
        containerUser.setBackground(new Color(84,86,86));
    }//GEN-LAST:event_userMouseMoved

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
        containerUser.setBackground(new Color(58,59,60));
    }//GEN-LAST:event_userMouseExited

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBirthActionPerformed

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
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DisposeButton;
    private javax.swing.JLabel DisposeButtonW;
    private javax.swing.JLabel FullScreenButton;
    private javax.swing.JLabel FullScreenButtonW;
    private javax.swing.JLabel MinimizeButton;
    private javax.swing.JLabel MinimizeButtonW;
    private javax.swing.JLabel Title1;
    private View.Components.RoundedPanel containerHome;
    private View.Components.RoundPanelText containerNotifications;
    private View.Components.RoundPanelText containerSearch;
    private View.Components.RoundPanelText containerSettings;
    private View.Components.RoundPanelText containerUser;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel logo;
    private javax.swing.JButton notifications;
    private javax.swing.JTextField search;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JButton settings;
    private javax.swing.JPanel topBar1;
    private javax.swing.JPanel topMenu;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
}