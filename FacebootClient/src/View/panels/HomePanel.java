/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.panels;

import Faceboot.App;
import Faceboot.AppState;
import View.Components.CustomScrollBarUI;
import View.Components.TextPrompt;
import java.awt.Color;

/**
 *
 * @author orlandocamacho
 */
public class HomePanel extends javax.swing.JPanel {

     private int PostOffset;
    
    /**
     * Creates new form LogInPanel
     */
    public HomePanel() {
        initComponents();
        new TextPrompt("Buscar en faceboot", search);
        new TextPrompt("Buscar usuarios", searchUsers);
        
        postScrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        usersScrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        content = new javax.swing.JPanel();
        users = new javax.swing.JPanel();
        usersScrollPane = new javax.swing.JScrollPane();
        scrollUsers = new javax.swing.JPanel();
        containerUserSearch = new View.Components.RoundPanelText();
        searchIcon1 = new javax.swing.JLabel();
        searchUsers = new javax.swing.JTextField();
        userChat1 = new View.Components.UserChat();
        userChat2 = new View.Components.UserChat();
        userChat3 = new View.Components.UserChat();
        userChat4 = new View.Components.UserChat();
        userChat5 = new View.Components.UserChat();
        userChat6 = new View.Components.UserChat();
        posts = new javax.swing.JPanel();
        postScrollPane = new javax.swing.JScrollPane();
        scrollPosts = new javax.swing.JPanel();
        addPostRoundedPane = new View.Components.RoundedPanel();
        containerUser1 = new View.Components.RoundPanelText();
        user1 = new javax.swing.JButton();
        containerPost = new View.Components.RoundPanelText();
        postButton = new javax.swing.JButton();
        containerPhoto = new View.Components.RoundedPanel();
        addPhoto = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        post4 = new View.Components.Post();
        post3 = new View.Components.Post();

        setBackground(new java.awt.Color(23, 24, 26));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topMenu.setBackground(new java.awt.Color(31, 32, 36));
        topMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/flogo.png"))); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
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
                .addContainerGap(21, Short.MAX_VALUE))
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

        topMenu.add(containerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 7, 190, 40));

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
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
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
        settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsActionPerformed(evt);
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
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        containerUser.add(user, java.awt.BorderLayout.CENTER);

        topMenu.add(containerUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(864, 7, 40, 40));

        add(topMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 57));

        content.setBackground(new java.awt.Color(23, 24, 26));
        content.setFocusable(false);
        content.setPreferredSize(new java.awt.Dimension(1280, 670));
        content.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users.setBackground(new java.awt.Color(23, 24, 26));
        users.setLayout(new javax.swing.BoxLayout(users, javax.swing.BoxLayout.LINE_AXIS));

        usersScrollPane.setBackground(new java.awt.Color(23, 24, 26));
        usersScrollPane.setBorder(null);
        usersScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        usersScrollPane.setPreferredSize(new java.awt.Dimension(100, 1000));

        scrollUsers.setBackground(new java.awt.Color(23, 24, 26));
        scrollUsers.setPreferredSize(new java.awt.Dimension(257, 1000));
        scrollUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        containerUserSearch.setBackground(new java.awt.Color(58, 59, 60));
        containerUserSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/search.png"))); // NOI18N
        containerUserSearch.add(searchIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        searchUsers.setBackground(new java.awt.Color(58, 59, 60));
        searchUsers.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        searchUsers.setForeground(new java.awt.Color(204, 204, 204));
        searchUsers.setBorder(null);
        searchUsers.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        containerUserSearch.add(searchUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 0, 150, 30));

        scrollUsers.add(containerUserSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 210, -1));
        scrollUsers.add(userChat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        scrollUsers.add(userChat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        scrollUsers.add(userChat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        scrollUsers.add(userChat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        scrollUsers.add(userChat5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
        scrollUsers.add(userChat6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        usersScrollPane.setViewportView(scrollUsers);

        users.add(usersScrollPane);

        content.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 0, 257, 628));

        posts.setBackground(new java.awt.Color(23, 24, 26));
        posts.setLayout(new javax.swing.BoxLayout(posts, javax.swing.BoxLayout.Y_AXIS));

        postScrollPane.setBackground(new java.awt.Color(23, 24, 26));
        postScrollPane.setBorder(null);
        postScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        scrollPosts.setBackground(new java.awt.Color(23, 24, 26));
        scrollPosts.setPreferredSize(new java.awt.Dimension(738, 1000));
        scrollPosts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addPostRoundedPane.setBackground(new java.awt.Color(35, 36, 37));
        addPostRoundedPane.setMinimumSize(new java.awt.Dimension(734, 280));
        addPostRoundedPane.setPreferredSize(new java.awt.Dimension(734, 110));
        addPostRoundedPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        containerUser1.setBackground(new java.awt.Color(58, 59, 60));
        containerUser1.setLayout(new java.awt.BorderLayout());

        user1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/user.png"))); // NOI18N
        user1.setContentAreaFilled(false);
        user1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        containerUser1.add(user1, java.awt.BorderLayout.CENTER);

        addPostRoundedPane.add(containerUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        containerPost.setBackground(new java.awt.Color(58, 59, 60));
        containerPost.setForeground(new java.awt.Color(204, 204, 204));
        containerPost.setLayout(new java.awt.BorderLayout());

        postButton.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        postButton.setForeground(new java.awt.Color(153, 153, 153));
        postButton.setText("¿Qué estás pensando?");
        postButton.setContentAreaFilled(false);
        postButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        postButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        postButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                postButtonMouseMoved(evt);
            }
        });
        postButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                postButtonMouseExited(evt);
            }
        });
        postButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postButtonActionPerformed(evt);
            }
        });
        containerPost.add(postButton, java.awt.BorderLayout.CENTER);

        addPostRoundedPane.add(containerPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 644, 40));

        containerPhoto.setBackground(new java.awt.Color(35, 36, 37));
        containerPhoto.setLayout(new java.awt.BorderLayout());

        addPhoto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addPhoto.setForeground(new java.awt.Color(153, 153, 153));
        addPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/insertPhoto.png"))); // NOI18N
        addPhoto.setText("Foto");
        addPhoto.setContentAreaFilled(false);
        addPhoto.setIconTextGap(10);
        addPhoto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                addPhotoMouseMoved(evt);
            }
        });
        addPhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addPhotoMouseExited(evt);
            }
        });
        addPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPhotoActionPerformed(evt);
            }
        });
        containerPhoto.add(addPhoto, java.awt.BorderLayout.CENTER);

        addPostRoundedPane.add(containerPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 216, 40));
        addPostRoundedPane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 694, 10));

        scrollPosts.add(addPostRoundedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 120));
        scrollPosts.add(post4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));
        scrollPosts.add(post3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        postScrollPane.setViewportView(scrollPosts);

        posts.add(postScrollPane);

        content.add(posts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 774, 628));

        add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 57, 1024, 628));
    }// </editor-fold>//GEN-END:initComponents

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        App.GetSingleton().SetState(AppState.Home);
    }//GEN-LAST:event_logoMouseClicked

    private void homeButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseMoved
        containerHome.setBackground(new Color(58,59,60));
    }//GEN-LAST:event_homeButtonMouseMoved

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        containerHome.setBackground(new Color(31,32,36));
    }//GEN-LAST:event_homeButtonMouseExited

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        App.GetSingleton().SetState(AppState.Home);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void settingsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseMoved
        containerSettings.setBackground(new Color(84,86,86));
    }//GEN-LAST:event_settingsMouseMoved

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        containerSettings.setBackground(new Color(58,59,60));
    }//GEN-LAST:event_settingsMouseExited

    private void settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsActionPerformed
        App.GetSingleton().SetState(AppState.Settings);
    }//GEN-LAST:event_settingsActionPerformed

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

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        App.GetSingleton().SetState(AppState.Profile);
    }//GEN-LAST:event_userActionPerformed

    private void postButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postButtonMouseMoved
        containerPost.setBackground(new Color(78,78,79));
    }//GEN-LAST:event_postButtonMouseMoved

    private void postButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_postButtonMouseExited
        containerPost.setBackground(new Color(58,59,60));
    }//GEN-LAST:event_postButtonMouseExited

    private void postButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postButtonActionPerformed
        App.GetSingleton().SetState(AppState.CreatePost);
    }//GEN-LAST:event_postButtonActionPerformed

    private void addPhotoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPhotoMouseMoved
        containerPhoto.setBackground(new Color(58,59,60));
    }//GEN-LAST:event_addPhotoMouseMoved

    private void addPhotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPhotoMouseExited
        containerPhoto.setBackground(new Color(35,36,37));
    }//GEN-LAST:event_addPhotoMouseExited

    private void addPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPhotoActionPerformed
        App.GetSingleton().SetState(AppState.CreatePost);
    }//GEN-LAST:event_addPhotoActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        PostOffset = 0;
        App.GetSingleton().Client.DoFetchPosts(PostOffset);
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPhoto;
    private View.Components.RoundedPanel addPostRoundedPane;
    private View.Components.RoundedPanel containerHome;
    private View.Components.RoundPanelText containerNotifications;
    private View.Components.RoundedPanel containerPhoto;
    private View.Components.RoundPanelText containerPost;
    private View.Components.RoundPanelText containerSearch;
    private View.Components.RoundPanelText containerSettings;
    private View.Components.RoundPanelText containerUser;
    private View.Components.RoundPanelText containerUser1;
    private View.Components.RoundPanelText containerUserSearch;
    private javax.swing.JPanel content;
    private javax.swing.JButton homeButton;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton notifications;
    private View.Components.Post post3;
    private View.Components.Post post4;
    private javax.swing.JButton postButton;
    private javax.swing.JScrollPane postScrollPane;
    private javax.swing.JPanel posts;
    private javax.swing.JPanel scrollPosts;
    private javax.swing.JPanel scrollUsers;
    private javax.swing.JTextField search;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JLabel searchIcon1;
    private javax.swing.JTextField searchUsers;
    private javax.swing.JButton settings;
    private javax.swing.JPanel topMenu;
    private javax.swing.JButton user;
    private javax.swing.JButton user1;
    private View.Components.UserChat userChat1;
    private View.Components.UserChat userChat2;
    private View.Components.UserChat userChat3;
    private View.Components.UserChat userChat4;
    private View.Components.UserChat userChat5;
    private View.Components.UserChat userChat6;
    private javax.swing.JPanel users;
    private javax.swing.JScrollPane usersScrollPane;
    // End of variables declaration//GEN-END:variables
}