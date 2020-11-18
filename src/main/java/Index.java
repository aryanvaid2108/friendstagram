import java.awt.Component;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.*;  

public class Index extends javax.swing.JFrame {
    User selectedUser;
    ProfileManager profileManager = new ProfileManager();
    User currentUser = new User();
    Database db = new Database();
    
    DefaultListModel friendList = new DefaultListModel();
    DefaultListModel suggestedFriends = new DefaultListModel();
    DefaultListModel searchedUser = new DefaultListModel();
    DefaultListModel friendsFriends = new DefaultListModel();

    ValidationFunctions vf = new ValidationFunctions();
    
    public Index() {
        /*initial view of the sign in page */
        initComponents();
        homeScreenPanel.setVisible(true);
        otherScreenPanel.setVisible(false);
        signInPanel.setVisible(true);
        signUpPanel.setVisible(false);
        signOutPanel.setVisible(false);
        setDetailsPanel.setVisible(false);
        aboutMePanel.setVisible(false);
        securitySettingsPanel.setVisible(false);
        changePasswordPanel.setVisible(false);
        securityQuestionsPanel.setVisible(false);
        friendListPanel.setVisible(false);
        discoverPanel.setVisible(false);
        otherUserPanel.setVisible(false);

        //Update usersList from the database
        
        File file = new File("database.txt");
        if(file.length()!=0){      
            try {
                db.setValues(profileManager.profilesList);
            }catch(IOException e){
                e.getStackTrace();
            }
        }
        for(User ele:profileManager.profilesList){
               System.out.println(ele.getUsername());      
        }
    }
    
    private void navigateToSignUpPage(){
        /*Navigating to the sign up page */

        homeScreenPanel.setVisible(true);
        otherScreenPanel.setVisible(false);
        signInPanel.setVisible(false);
        signUpPanel.setVisible(true);
        signOutPanel.setVisible(false);
        setDetailsPanel.setVisible(false);
        aboutMePanel.setVisible(false);
        securitySettingsPanel.setVisible(false);
        changePasswordPanel.setVisible(false);
        securityQuestionsPanel.setVisible(false);
        friendListPanel.setVisible(false);
        discoverPanel.setVisible(false);
        otherUserPanel.setVisible(false);
        
    }
    
    private void navigateToSetDetails(){
        /*Navigating to the set details page where a user can update his profile information */

        homeScreenPanel.setVisible(false);
        otherScreenPanel.setVisible(true);
        signInPanel.setVisible(false);
        signUpPanel.setVisible(false);
        signOutPanel.setVisible(false);
        setDetailsPanel.setVisible(true);
        aboutMePanel.setVisible(false);
        securitySettingsPanel.setVisible(false);
        changePasswordPanel.setVisible(false);
        securityQuestionsPanel.setVisible(false);
        friendListPanel.setVisible(false);
        discoverPanel.setVisible(false);
        otherUserPanel.setVisible(false);
    
        
        // Pre Set values in the form       
        firstNameText1.setText(currentUser.getFirstName()); 
        lastNameText1.setText(currentUser.getLastName());
        userNameText1.setText(currentUser.getUsername());
        emailText2.setText(currentUser.getEmail());
        monthBox1.setSelectedItem(currentUser.getMonth());
        dayBox1.setSelectedItem(currentUser.getDay());
        yearBox1.setSelectedItem(currentUser.getYear());
        statusTextArea.setText(currentUser.getStatus());    
        phoneNumberText1.setText(currentUser.getPhoneNumber());
        BufferedImage img = null;
            try {
                img = ImageIO.read(new File(currentUser.getProfilePicturePath()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        Image dimg = img.getScaledInstance(profilePictureLabel.getWidth(), profilePictureLabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(dimg);
        profilePictureLabel.setIcon(image);
    }
        
    private void navigateToAboutMe(){
        /*Navigating to the about me page where a user can view his profile information */
        
        homeScreenPanel.setVisible(false);
        otherScreenPanel.setVisible(true);
        signInPanel.setVisible(false);
        signUpPanel.setVisible(false);
        signOutPanel.setVisible(false);  
        setDetailsPanel.setVisible(false);
        aboutMePanel.setVisible(true);
        securitySettingsPanel.setVisible(false);
        changePasswordPanel.setVisible(false);
        signOutPanel.setVisible(false);
        securityQuestionsPanel.setVisible(false);
        friendListPanel.setVisible(false);
        discoverPanel.setVisible(false);
        otherUserPanel.setVisible(false);

       
        // Set values in the form 
        firstNameText.setText(currentUser.getFirstName()); 
        lastNameText.setText(currentUser.getLastName());
        userNameText.setText(currentUser.getUsername());
        emailText1.setText(currentUser.getEmail());
        monthBox.setText(currentUser.getMonth());
        dayBox.setText(currentUser.getDay());
        yearBox.setText(currentUser.getYear());
        phoneNumberText.setText(currentUser.getPhoneNumber());
        statusTextArea1.setText(currentUser.getStatus()); 
        BufferedImage img = null;
            try {
                img = ImageIO.read(new File(currentUser.getProfilePicturePath()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        Image dimg = img.getScaledInstance(profilePictureLabel.getWidth(), profilePictureLabel.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(dimg);
       ProfilePictureLabel.setIcon(image);
  
        if(currentUser.getGender().equals("Male")){
            genderText.setText("Male");
        }else if(currentUser.getGender().equals("Female")){
            genderText.setText("Female");
        }else if(currentUser.getGender().equals("Prefer not to say")){
            genderText.setText("Prefer not to say");
        }else{
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        homeScreenPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        signInPanel = new javax.swing.JPanel();
        usernameText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        forgotPasswordButton = new javax.swing.JButton();
        signInButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        createAccountButton = new javax.swing.JButton();
        errorText = new javax.swing.JTextField();
        signUpPanel = new javax.swing.JPanel();
        errorText1 = new javax.swing.JTextField();
        usernameText1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        passwordText1 = new javax.swing.JPasswordField();
        rePasswordText = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        termsCheckBox = new javax.swing.JCheckBox();
        signOutPanel = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        signInButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        otherScreenPanel = new javax.swing.JPanel();
        aboutMePanel = new javax.swing.JPanel();
        ProfilePictureLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        emailText1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        phoneNumberText = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        statusText = new javax.swing.JScrollPane();
        statusTextArea1 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        genderText = new javax.swing.JTextField();
        editProfileButton = new javax.swing.JButton();
        yearBox = new javax.swing.JTextField();
        monthBox = new javax.swing.JTextField();
        dayBox = new javax.swing.JTextField();
        signOutButton = new javax.swing.JButton();
        aboutMeButton = new javax.swing.JButton();
        discoverButton = new javax.swing.JButton();
        setDetailsPanel = new javax.swing.JPanel();
        profilePictureLabel = new javax.swing.JLabel();
        changePicButton = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        firstNameText1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lastNameText1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        userNameText1 = new javax.swing.JTextField();
        emailText2 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        phoneNumberText1 = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        monthBox1 = new javax.swing.JComboBox<>();
        dayBox1 = new javax.swing.JComboBox<>();
        yearBox1 = new javax.swing.JComboBox<>();
        securitySettingsButton = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        statusText1 = new javax.swing.JScrollPane();
        statusTextArea = new javax.swing.JTextArea();
        setStatusButton = new javax.swing.JButton();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        otherRadioButton = new javax.swing.JRadioButton();
        jLabel37 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        securitySettingsPanel = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        changePasswordButton = new javax.swing.JButton();
        setSecurityQuesButton = new javax.swing.JButton();
        deleteAccountButton = new javax.swing.JButton();
        changePasswordPanel = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        existingPasswordText = new javax.swing.JPasswordField();
        jLabel41 = new javax.swing.JLabel();
        newPasswordText = new javax.swing.JPasswordField();
        jLabel45 = new javax.swing.JLabel();
        newPasswordText1 = new javax.swing.JPasswordField();
        errorText2 = new javax.swing.JTextField();
        securityQuestionsPanel = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        setSecurityQuesButton1 = new javax.swing.JButton();
        question1Box = new javax.swing.JComboBox<>();
        question2Box = new javax.swing.JComboBox<>();
        question3Box = new javax.swing.JComboBox<>();
        answer1Text = new javax.swing.JTextField();
        answer2Text = new javax.swing.JTextField();
        answer3Box = new javax.swing.JTextField();
        friendListPanel = new javax.swing.JPanel();
        nameLabel1 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        noOfFriendsLabel = new javax.swing.JLabel();
        dpLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel47 = new javax.swing.JLabel();
        statusText3 = new javax.swing.JScrollPane();
        statusBar1 = new javax.swing.JTextArea();
        jLabel49 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        usernameLabel1 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        genderLabel1 = new javax.swing.JLabel();
        friendsButton = new javax.swing.JButton();
        discoverPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel46 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        searchBar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        otherUserPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        nofriends = new javax.swing.JLabel();
        displayPictureLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        addFriendButton = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        statusText2 = new javax.swing.JScrollPane();
        statusBar = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        homeScreenPanel.setBackground(new java.awt.Color(52, 73, 94));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Savoye LET", 0, 60)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Friendstagram");

        signInPanel.setBackground(new java.awt.Color(255, 255, 255));

        usernameText.setText("Aryan");
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(191, 191, 191));
        jLabel7.setText("Username or Email");

        jLabel8.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(191, 191, 191));
        jLabel8.setText("Password");

        passwordText.setText("Aryan2108$");
        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });

        forgotPasswordButton.setBackground(new java.awt.Color(255, 255, 255));
        forgotPasswordButton.setFont(new java.awt.Font("PingFang SC", 1, 10)); // NOI18N
        forgotPasswordButton.setForeground(new java.awt.Color(77, 175, 124));
        forgotPasswordButton.setText("Forgot Password?");
        forgotPasswordButton.setBorder(null);
        forgotPasswordButton.setBorderPainted(false);
        forgotPasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPasswordButtonActionPerformed(evt);
            }
        });

        signInButton.setBackground(new java.awt.Color(80, 82, 80));
        signInButton.setFont(new java.awt.Font("PingFang SC", 1, 13)); // NOI18N
        signInButton.setForeground(new java.awt.Color(255, 255, 255));
        signInButton.setText("Sign In");
        signInButton.setBorder(null);
        signInButton.setBorderPainted(false);
        signInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInButtonMouseClicked(evt);
            }
        });
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("PingFang SC", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(191, 191, 191));
        jLabel9.setText("First time?");

        createAccountButton.setBackground(new java.awt.Color(255, 255, 255));
        createAccountButton.setFont(new java.awt.Font("PingFang SC", 1, 12)); // NOI18N
        createAccountButton.setForeground(new java.awt.Color(26, 102, 201));
        createAccountButton.setText("Create Account");
        createAccountButton.setBorder(null);
        createAccountButton.setBorderPainted(false);
        createAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountButtonMouseClicked(evt);
            }
        });
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        errorText.setEditable(false);
        errorText.setFont(new java.awt.Font("PingFang SC", 0, 11)); // NOI18N
        errorText.setForeground(new java.awt.Color(217, 30, 24));
        errorText.setBorder(null);

        javax.swing.GroupLayout signInPanelLayout = new javax.swing.GroupLayout(signInPanel);
        signInPanel.setLayout(signInPanelLayout);
        signInPanelLayout.setHorizontalGroup(
            signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signInPanelLayout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signInPanelLayout.createSequentialGroup()
                        .addGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(signInPanelLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createAccountButton))
                            .addGroup(signInPanelLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signInPanelLayout.createSequentialGroup()
                        .addComponent(forgotPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
            .addGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(signInPanelLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(usernameText, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                        .addComponent(passwordText))
                    .addContainerGap(66, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signInPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(errorText)
                    .addContainerGap()))
        );
        signInPanelLayout.setVerticalGroup(
            signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signInPanelLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(forgotPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(signInButton)
                .addGap(219, 219, 219)
                .addGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(createAccountButton))
                .addContainerGap())
            .addGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(signInPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(errorText, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(299, Short.MAX_VALUE)))
        );

        signUpPanel.setBackground(new java.awt.Color(255, 255, 255));

        errorText1.setEditable(false);
        errorText1.setFont(new java.awt.Font("PingFang SC", 0, 11)); // NOI18N
        errorText1.setForeground(new java.awt.Color(217, 30, 24));
        errorText1.setBorder(null);

        usernameText1.setText("Aryan");
        usernameText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameText1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(191, 191, 191));
        jLabel13.setText("Username");

        jLabel14.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(191, 191, 191));
        jLabel14.setText("Password");

        passwordText1.setText("Aryan2108$");
        passwordText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordText1ActionPerformed(evt);
            }
        });

        rePasswordText.setText("Aryan2108$");
        rePasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rePasswordTextActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(191, 191, 191));
        jLabel10.setText("Re Password");

        emailText.setText("aryanvaid2108@gmail.com");
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(191, 191, 191));
        jLabel11.setText("Email");

        signUpButton.setBackground(new java.awt.Color(80, 82, 80));
        signUpButton.setFont(new java.awt.Font("PingFang SC", 1, 13)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setText("Sign Up");
        signUpButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        signUpButton.setBorderPainted(false);
        signUpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpButtonMouseClicked(evt);
            }
        });
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        termsCheckBox.setSelected(true);
        termsCheckBox.setText("I have read the privacy policy");
        termsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termsCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signUpPanelLayout = new javax.swing.GroupLayout(signUpPanel);
        signUpPanel.setLayout(signUpPanelLayout);
        signUpPanelLayout.setHorizontalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signUpPanelLayout.createSequentialGroup()
                        .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(signUpPanelLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(signUpPanelLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(termsCheckBox)
                                    .addComponent(rePasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(passwordText1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)
                                    .addComponent(usernameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signUpPanelLayout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(errorText1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        signUpPanelLayout.setVerticalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(errorText1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rePasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(termsCheckBox)
                .addGap(18, 18, 18)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        signOutPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("PingFang SC", 1, 15)); // NOI18N
        jLabel42.setText("You have Signed Out safetly");

        jLabel43.setText("to Sign In again");

        signInButton1.setForeground(new java.awt.Color(26, 102, 201));
        signInButton1.setText("Click here");
        signInButton1.setBorder(null);
        signInButton1.setBorderPainted(false);
        signInButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInButton1MouseClicked(evt);
            }
        });
        signInButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signOutPanelLayout = new javax.swing.GroupLayout(signOutPanel);
        signOutPanel.setLayout(signOutPanelLayout);
        signOutPanelLayout.setHorizontalGroup(
            signOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signOutPanelLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(signOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signOutPanelLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signOutPanelLayout.createSequentialGroup()
                        .addComponent(signInButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        signOutPanelLayout.setVerticalGroup(
            signOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signOutPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(signOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(signInButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(420, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signInPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(signUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(signOutPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(signUpPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 90, Short.MAX_VALUE)
                    .addComponent(signOutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel1.setFont(new java.awt.Font("Herculanum", 0, 70)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("life");

        jLabel2.setFont(new java.awt.Font("Herculanum", 0, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("is Better ");

        jLabel3.setFont(new java.awt.Font("Herculanum", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("with");

        jLabel5.setFont(new java.awt.Font("Herculanum", 0, 40)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Friends");

        jLabel6.setFont(new java.awt.Font("Herculanum", 0, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(":)");

        javax.swing.GroupLayout homeScreenPanelLayout = new javax.swing.GroupLayout(homeScreenPanel);
        homeScreenPanel.setLayout(homeScreenPanelLayout);
        homeScreenPanelLayout.setHorizontalGroup(
            homeScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeScreenPanelLayout.createSequentialGroup()
                .addGroup(homeScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeScreenPanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(homeScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(homeScreenPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5))))
                    .addGroup(homeScreenPanelLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel6))
                    .addGroup(homeScreenPanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homeScreenPanelLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        homeScreenPanelLayout.setVerticalGroup(
            homeScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(homeScreenPanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(homeScreenPanel, "card2");

        otherScreenPanel.setBackground(new java.awt.Color(52, 73, 94));

        aboutMePanel.setBackground(new java.awt.Color(255, 255, 255));

        ProfilePictureLabel.setBackground(new java.awt.Color(0, 0, 0));
        ProfilePictureLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel15.setFont(new java.awt.Font("PingFang SC", 0, 24)); // NOI18N
        jLabel15.setText("About Me");

        jLabel16.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(191, 191, 191));
        jLabel16.setText("First Name");

        firstNameText.setEditable(false);
        firstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(191, 191, 191));
        jLabel17.setText("Last Name");

        jLabel18.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(191, 191, 191));
        jLabel18.setText("Username");

        lastNameText.setEditable(false);
        lastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(191, 191, 191));
        jLabel19.setText("Email");

        userNameText.setEditable(false);
        userNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextActionPerformed(evt);
            }
        });

        emailText1.setEditable(false);
        emailText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailText1ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(191, 191, 191));
        jLabel20.setText("Gender");

        jLabel21.setFont(new java.awt.Font("PingFang SC", 1, 8)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(217, 30, 24));
        jLabel21.setText("*Phone Number is private ");

        jLabel22.setFont(new java.awt.Font("PingFang SC", 1, 8)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(217, 30, 24));
        jLabel22.setText("*Email is private ");

        jLabel23.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(191, 191, 191));
        jLabel23.setText("Phone Number");

        phoneNumberText.setEditable(false);
        phoneNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextActionPerformed(evt);
            }
        });

        jLabel24.setText("Status");

        statusTextArea1.setEditable(false);
        statusTextArea1.setColumns(20);
        statusTextArea1.setLineWrap(true);
        statusTextArea1.setRows(3);
        statusTextArea1.setTabSize(3);
        statusText.setViewportView(statusTextArea1);

        jLabel25.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(191, 191, 191));
        jLabel25.setText("Date of birth");

        genderText.setEditable(false);
        genderText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderTextActionPerformed(evt);
            }
        });

        editProfileButton.setText("Edit Profile");
        editProfileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editProfileButtonMouseClicked(evt);
            }
        });

        yearBox.setEditable(false);

        monthBox.setEditable(false);
        monthBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthBoxActionPerformed(evt);
            }
        });

        dayBox.setEditable(false);

        javax.swing.GroupLayout aboutMePanelLayout = new javax.swing.GroupLayout(aboutMePanel);
        aboutMePanel.setLayout(aboutMePanelLayout);
        aboutMePanelLayout.setHorizontalGroup(
            aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutMePanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ProfilePictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jLabel24)
                    .addComponent(statusText, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutMePanelLayout.createSequentialGroup()
                        .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18)
                            .addComponent(userNameText)
                            .addComponent(firstNameText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                        .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutMePanelLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(120, 120, 120))
                            .addGroup(aboutMePanelLayout.createSequentialGroup()
                                .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(editProfileButton)
                                    .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(aboutMePanelLayout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel22))
                                        .addComponent(emailText1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(lastNameText)))
                                .addContainerGap())))
                    .addGroup(aboutMePanelLayout.createSequentialGroup()
                        .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneNumberText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genderText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(aboutMePanelLayout.createSequentialGroup()
                        .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(aboutMePanelLayout.createSequentialGroup()
                                .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20)
                            .addGroup(aboutMePanelLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        aboutMePanelLayout.setVerticalGroup(
            aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutMePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutMePanelLayout.createSequentialGroup()
                        .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(editProfileButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(3, 3, 3)
                        .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(aboutMePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20))
                    .addGroup(aboutMePanelLayout.createSequentialGroup()
                        .addComponent(ProfilePictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusText, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genderText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        signOutButton.setFont(new java.awt.Font("PingFang SC", 0, 13)); // NOI18N
        signOutButton.setText("Sign Out");
        signOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signOutButtonMouseClicked(evt);
            }
        });
        signOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutButtonActionPerformed(evt);
            }
        });

        aboutMeButton.setFont(new java.awt.Font("PingFang SC", 1, 13)); // NOI18N
        aboutMeButton.setText("About Me");
        aboutMeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMeButtonMouseClicked(evt);
            }
        });
        aboutMeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMeButtonActionPerformed(evt);
            }
        });

        discoverButton.setFont(new java.awt.Font("PingFang SC", 0, 13)); // NOI18N
        discoverButton.setText("Discover Friends");
        discoverButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                discoverButtonMouseClicked(evt);
            }
        });

        setDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));

        profilePictureLabel.setBackground(new java.awt.Color(0, 0, 0));
        profilePictureLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        changePicButton.setText("Change Picture");
        changePicButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePicButtonMouseClicked(evt);
            }
        });
        changePicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePicButtonActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("PingFang SC", 0, 24)); // NOI18N
        jLabel27.setText("About Me");

        jLabel28.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(191, 191, 191));
        jLabel28.setText("First Name");

        firstNameText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameText1ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(191, 191, 191));
        jLabel29.setText("Last Name");

        jLabel30.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(191, 191, 191));
        jLabel30.setText("Username");

        lastNameText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameText1ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(191, 191, 191));
        jLabel31.setText("Email");

        userNameText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameText1ActionPerformed(evt);
            }
        });

        emailText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailText2ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(191, 191, 191));
        jLabel32.setText("Gender");

        jLabel33.setFont(new java.awt.Font("PingFang SC", 1, 8)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(217, 30, 24));
        jLabel33.setText("*Phone Number is private ");

        jLabel34.setFont(new java.awt.Font("PingFang SC", 1, 8)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(217, 30, 24));
        jLabel34.setText("*Email is private ");

        jLabel35.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(191, 191, 191));
        jLabel35.setText("Phone Number");

        phoneNumberText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberText1ActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("PingFang SC", 1, 13)); // NOI18N
        updateButton.setText("Update ");
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });

        monthBox1.setEditable(true);
        monthBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        dayBox1.setEditable(true);
        dayBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        yearBox1.setEditable(true);
        yearBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900" }));

        securitySettingsButton.setFont(new java.awt.Font("PingFang SC", 0, 13)); // NOI18N
        securitySettingsButton.setForeground(new java.awt.Color(217, 30, 24));
        securitySettingsButton.setText("Security Settings");
        securitySettingsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                securitySettingsButtonMouseClicked(evt);
            }
        });

        jLabel36.setText("Status");

        statusTextArea.setColumns(20);
        statusTextArea.setLineWrap(true);
        statusTextArea.setRows(3);
        statusTextArea.setTabSize(3);
        statusText1.setViewportView(statusTextArea);

        setStatusButton.setText("Set");

        maleRadioButton.setText("Male");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        femaleRadioButton.setText("Female");

        otherRadioButton.setText("Prefer not to say");

        jLabel37.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(191, 191, 191));
        jLabel37.setText("Date of birth");

        deleteButton.setFont(new java.awt.Font("PingFang SC", 1, 13)); // NOI18N
        deleteButton.setText("Delete account ");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout setDetailsPanelLayout = new javax.swing.GroupLayout(setDetailsPanel);
        setDetailsPanel.setLayout(setDetailsPanelLayout);
        setDetailsPanelLayout.setHorizontalGroup(
            setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setDetailsPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profilePictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(changePicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(statusText1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(setStatusButton))
                .addGap(18, 18, 18)
                .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setDetailsPanelLayout.createSequentialGroup()
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(securitySettingsButton)
                        .addGap(36, 36, 36))
                    .addGroup(setDetailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(setDetailsPanelLayout.createSequentialGroup()
                        .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(setDetailsPanelLayout.createSequentialGroup()
                                .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(monthBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(setDetailsPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel32)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(setDetailsPanelLayout.createSequentialGroup()
                                        .addComponent(maleRadioButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(otherRadioButton))
                                    .addGroup(setDetailsPanelLayout.createSequentialGroup()
                                        .addComponent(dayBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yearBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel37)
                            .addComponent(phoneNumberText1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(187, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setDetailsPanelLayout.createSequentialGroup()
                        .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27)
                            .addComponent(jLabel30)
                            .addComponent(userNameText1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(firstNameText1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setDetailsPanelLayout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(120, 120, 120))
                            .addGroup(setDetailsPanelLayout.createSequentialGroup()
                                .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(setDetailsPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel34))
                                    .addComponent(emailText2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        setDetailsPanelLayout.setVerticalGroup(
            setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setDetailsPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setDetailsPanelLayout.createSequentialGroup()
                        .addComponent(profilePictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(changePicButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(setDetailsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addGap(3, 3, 3)
                        .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel31)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userNameText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneNumberText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setDetailsPanelLayout.createSequentialGroup()
                        .addComponent(statusText1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(setStatusButton))
                    .addGroup(setDetailsPanelLayout.createSequentialGroup()
                        .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monthBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dayBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(maleRadioButton)
                            .addComponent(femaleRadioButton)
                            .addComponent(otherRadioButton))))
                .addGap(10, 10, 10)
                .addGroup(setDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(securitySettingsButton)
                    .addComponent(deleteButton))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        securitySettingsPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel38.setFont(new java.awt.Font("PingFang SC", 0, 24)); // NOI18N
        jLabel38.setText("Security Settings");

        changePasswordButton.setText("Change Password");
        changePasswordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePasswordButtonMouseClicked(evt);
            }
        });

        setSecurityQuesButton.setText("Set Security Questions");
        setSecurityQuesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setSecurityQuesButtonMouseClicked(evt);
            }
        });

        deleteAccountButton.setForeground(new java.awt.Color(217, 30, 24));
        deleteAccountButton.setText("Delete Account");

        javax.swing.GroupLayout securitySettingsPanelLayout = new javax.swing.GroupLayout(securitySettingsPanel);
        securitySettingsPanel.setLayout(securitySettingsPanelLayout);
        securitySettingsPanelLayout.setHorizontalGroup(
            securitySettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(securitySettingsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(securitySettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteAccountButton)
                    .addComponent(setSecurityQuesButton)
                    .addComponent(changePasswordButton)
                    .addComponent(jLabel38))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        securitySettingsPanelLayout.setVerticalGroup(
            securitySettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(securitySettingsPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel38)
                .addGap(18, 18, 18)
                .addComponent(changePasswordButton)
                .addGap(28, 28, 28)
                .addComponent(setSecurityQuesButton)
                .addGap(26, 26, 26)
                .addComponent(deleteAccountButton)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        changePasswordPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel39.setFont(new java.awt.Font("PingFang SC", 0, 24)); // NOI18N
        jLabel39.setText("Change Password");

        jButton1.setText("Change Password");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(191, 191, 191));
        jLabel40.setText("Enter Existing Password");

        jLabel41.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(191, 191, 191));
        jLabel41.setText("Enter New Password");

        jLabel45.setFont(new java.awt.Font("PingFang SC", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(191, 191, 191));
        jLabel45.setText("Re Enter New Password");

        errorText2.setFont(new java.awt.Font("PingFang SC", 0, 13)); // NOI18N
        errorText2.setForeground(new java.awt.Color(217, 30, 24));
        errorText2.setBorder(null);
        errorText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorText2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout changePasswordPanelLayout = new javax.swing.GroupLayout(changePasswordPanel);
        changePasswordPanel.setLayout(changePasswordPanelLayout);
        changePasswordPanelLayout.setHorizontalGroup(
            changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39)
                    .addGroup(changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(newPasswordText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(existingPasswordText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newPasswordText1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(errorText2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        changePasswordPanelLayout.setVerticalGroup(
            changePasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePasswordPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel39)
                .addGap(3, 3, 3)
                .addComponent(errorText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(existingPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addGap(1, 1, 1)
                .addComponent(newPasswordText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        securityQuestionsPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel44.setFont(new java.awt.Font("PingFang SC", 0, 24)); // NOI18N
        jLabel44.setText("Set Security Questions");

        setSecurityQuesButton1.setText("Set Security Questions");
        setSecurityQuesButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setSecurityQuesButton1ActionPerformed(evt);
            }
        });

        question1Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What Is your favorite book?", "What is the name of the road you grew up on?", "What is your mother’s maiden name?", "What was the name of your first/current/favorite pet?", "What was the first company that you worked for?", "Where did you meet your spouse?", "Where did you go to high school/college?", "What is your favorite food?", "What city were you born in?", "Where is your favorite place to vacation?" }));

        question2Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What Is your favorite book?", "What is the name of the road you grew up on?", "What is your mother’s maiden name?", "What was the name of your first/current/favorite pet?", "What was the first company that you worked for?", "Where did you meet your spouse?", "Where did you go to high school/college?", "What is your favorite food?", "What city were you born in?", "Where is your favorite place to vacation?" }));

        question3Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What Is your favorite book?", "What is the name of the road you grew up on?", "What is your mother’s maiden name?", "What was the name of your first/current/favorite pet?", "What was the first company that you worked for?", "Where did you meet your spouse?", "Where did you go to high school/college?", "What is your favorite food?", "What city were you born in?", "Where is your favorite place to vacation?" }));

        answer1Text.setToolTipText("");

        answer2Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer2TextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout securityQuestionsPanelLayout = new javax.swing.GroupLayout(securityQuestionsPanel);
        securityQuestionsPanel.setLayout(securityQuestionsPanelLayout);
        securityQuestionsPanelLayout.setHorizontalGroup(
            securityQuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(securityQuestionsPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(securityQuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setSecurityQuesButton1)
                    .addComponent(question1Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(question2Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(question3Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(securityQuestionsPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(securityQuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(answer3Box, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(answer1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(answer2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(438, Short.MAX_VALUE))
        );
        securityQuestionsPanelLayout.setVerticalGroup(
            securityQuestionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(securityQuestionsPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel44)
                .addGap(18, 18, 18)
                .addComponent(question1Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answer1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(question2Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answer2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(question3Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answer3Box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(setSecurityQuesButton1)
                .addGap(54, 54, 54))
        );

        friendListPanel.setBackground(new java.awt.Color(255, 255, 255));

        nameLabel1.setText("Name");

        jLabel48.setText("Friends:");

        noOfFriendsLabel.setText("jLabel49");

        dpLabel.setBackground(new java.awt.Color(0, 0, 0));
        dpLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Friend 1", "Friend 2", "Friend 3", "Friend 4", "Friend 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel47.setText("Status");

        statusBar1.setEditable(false);
        statusBar1.setColumns(20);
        statusBar1.setLineWrap(true);
        statusBar1.setRows(3);
        statusBar1.setTabSize(3);
        statusText3.setViewportView(statusBar1);

        jLabel49.setText("Name:");

        jLabel54.setText("Username:");

        usernameLabel1.setText("Username");

        jLabel55.setText("Gender:");

        genderLabel1.setText("Gender");

        javax.swing.GroupLayout friendListPanelLayout = new javax.swing.GroupLayout(friendListPanel);
        friendListPanel.setLayout(friendListPanelLayout);
        friendListPanelLayout.setHorizontalGroup(
            friendListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(friendListPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(friendListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusText3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(friendListPanelLayout.createSequentialGroup()
                        .addGroup(friendListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(jLabel48)
                            .addComponent(jLabel47)
                            .addComponent(jLabel49)
                            .addComponent(jLabel55))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(friendListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(noOfFriendsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(usernameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(genderLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        friendListPanelLayout.setVerticalGroup(
            friendListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(friendListPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(friendListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(friendListPanelLayout.createSequentialGroup()
                        .addComponent(dpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(friendListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel1)
                            .addComponent(jLabel49))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(friendListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel1)
                            .addComponent(jLabel54))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(friendListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(genderLabel1))
                        .addGap(12, 12, 12)
                        .addGroup(friendListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noOfFriendsLabel)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusText3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        friendsButton.setFont(new java.awt.Font("PingFang SC", 0, 13)); // NOI18N
        friendsButton.setText("Friend List ");
        friendsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friendsButtonMouseClicked(evt);
            }
        });
        friendsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friendsButtonActionPerformed(evt);
            }
        });

        discoverPanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jScrollPane2.setViewportView(jList2);

        jLabel46.setFont(new java.awt.Font("PingFang SC", 0, 24)); // NOI18N
        jLabel46.setText("Search for people");

        jLabel51.setFont(new java.awt.Font("PingFang SC", 0, 24)); // NOI18N
        jLabel51.setText("Suggested for you");

        jScrollPane3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jList3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jList3.setAutoscrolls(false);
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jList3MouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(jList3);

        searchButton.setText("Search");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout discoverPanelLayout = new javax.swing.GroupLayout(discoverPanel);
        discoverPanel.setLayout(discoverPanelLayout);
        discoverPanelLayout.setHorizontalGroup(
            discoverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(discoverPanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, discoverPanelLayout.createSequentialGroup()
                .addGroup(discoverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(discoverPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(searchButton))
                    .addGroup(discoverPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        discoverPanelLayout.setVerticalGroup(
            discoverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, discoverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(discoverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(discoverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(discoverPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(discoverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        otherUserPanel.setBackground(new java.awt.Color(255, 255, 255));

        nameLabel.setText("Name");

        jLabel53.setText("Friends:");

        displayPictureLabel.setBackground(new java.awt.Color(0, 0, 0));
        displayPictureLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jList4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList4);

        addFriendButton.setText("Add Friend");
        addFriendButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addFriendButtonMouseClicked(evt);
            }
        });
        addFriendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFriendButtonActionPerformed(evt);
            }
        });

        jLabel26.setText("Status");

        statusBar.setEditable(false);
        statusBar.setColumns(20);
        statusBar.setLineWrap(true);
        statusBar.setRows(3);
        statusBar.setTabSize(3);
        statusText2.setViewportView(statusBar);

        jLabel12.setText("Gender:");

        usernameLabel.setText("Username");

        jLabel50.setText("Name:");

        jLabel52.setText("Username:");

        genderLabel.setText("Gender");

        javax.swing.GroupLayout otherUserPanelLayout = new javax.swing.GroupLayout(otherUserPanel);
        otherUserPanel.setLayout(otherUserPanelLayout);
        otherUserPanelLayout.setHorizontalGroup(
            otherUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherUserPanelLayout.createSequentialGroup()
                .addGroup(otherUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(otherUserPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(otherUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(displayPictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusText2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addGroup(otherUserPanelLayout.createSequentialGroup()
                                .addGroup(otherUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(otherUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nofriends, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(genderLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(otherUserPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(addFriendButton)))
                .addGap(84, 84, 84)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
        otherUserPanelLayout.setVerticalGroup(
            otherUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherUserPanelLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(otherUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otherUserPanelLayout.createSequentialGroup()
                        .addComponent(displayPictureLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(otherUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(jLabel50))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(otherUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel53))
                    .addComponent(nofriends, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(otherUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusText2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addFriendButton)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otherUserPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout otherScreenPanelLayout = new javax.swing.GroupLayout(otherScreenPanel);
        otherScreenPanel.setLayout(otherScreenPanelLayout);
        otherScreenPanelLayout.setHorizontalGroup(
            otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherScreenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aboutMeButton)
                .addGap(39, 39, 39)
                .addComponent(discoverButton)
                .addGap(38, 38, 38)
                .addComponent(friendsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addComponent(signOutButton)
                .addGap(17, 17, 17))
            .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(aboutMePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(setDetailsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(securitySettingsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(changePasswordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(securityQuestionsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(friendListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(discoverPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(otherUserPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        otherScreenPanelLayout.setVerticalGroup(
            otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherScreenPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aboutMeButton)
                    .addComponent(signOutButton)
                    .addComponent(discoverButton)
                    .addComponent(friendsButton))
                .addContainerGap(538, Short.MAX_VALUE))
            .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otherScreenPanelLayout.createSequentialGroup()
                    .addGap(0, 74, Short.MAX_VALUE)
                    .addComponent(aboutMePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otherScreenPanelLayout.createSequentialGroup()
                    .addGap(0, 77, Short.MAX_VALUE)
                    .addComponent(setDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otherScreenPanelLayout.createSequentialGroup()
                    .addGap(0, 76, Short.MAX_VALUE)
                    .addComponent(securitySettingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otherScreenPanelLayout.createSequentialGroup()
                    .addContainerGap(80, Short.MAX_VALUE)
                    .addComponent(changePasswordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otherScreenPanelLayout.createSequentialGroup()
                    .addGap(0, 73, Short.MAX_VALUE)
                    .addComponent(securityQuestionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otherScreenPanelLayout.createSequentialGroup()
                    .addGap(0, 72, Short.MAX_VALUE)
                    .addComponent(friendListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otherScreenPanelLayout.createSequentialGroup()
                    .addGap(0, 69, Short.MAX_VALUE)
                    .addComponent(discoverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(otherScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otherScreenPanelLayout.createSequentialGroup()
                    .addGap(0, 70, Short.MAX_VALUE)
                    .addComponent(otherUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(otherScreenPanel, "card3");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextActionPerformed

    private void forgotPasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPasswordButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotPasswordButtonActionPerformed

    private void signInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButtonMouseClicked
        int flag = 0;
        for(User ele:profileManager.profilesList){
            if(ele.getUsername().equals(usernameText.getText())){
                if(ele.getPassword().equals(String.copyValueOf(passwordText.getPassword()))){
                    flag = 1;
                    currentUser = ele;
                    navigateToAboutMe();
                    errorText.setText("");
                }else{
                    errorText.setText("Incorrect Password");
                }
            }
        }
        if(flag == 0){
            errorText.setText("User not found");
        }
    }//GEN-LAST:event_signInButtonMouseClicked

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInButtonActionPerformed

    private void createAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountButtonMouseClicked
        navigateToSignUpPage();
    }//GEN-LAST:event_createAccountButtonMouseClicked

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void usernameText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameText1ActionPerformed

    private void passwordText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordText1ActionPerformed

    private void rePasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rePasswordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rePasswordTextActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void signUpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpButtonMouseClicked
        if(termsCheckBox.isSelected()){
            String result = vf.checkPossibleCredentials(usernameText1.getText(),String.copyValueOf(passwordText1.getPassword()),String.copyValueOf(rePasswordText.getPassword()),emailText.getText());
            if(result.equals("No error")){
                //Create a new user and update the list of users
                User newUser = new User(usernameText1.getText(),String.copyValueOf(passwordText1.getPassword()),emailText.getText());
                profileManager.profilesList.add(newUser);
                currentUser = newUser;
//                try {
//                    db.writeToDatabase(currentUser);
//                }catch(IOException e){
//                    e.getStackTrace();
//                }
                System.out.println(profileManager.profilesList.isEmpty());
                //Display all users
                for(User ele:profileManager.profilesList){
                    System.out.println("Username:" + ele.getUsername());
                }
                //Reset the signUp form
                //**Insert Code**
                
                //Go to Set Details page
                navigateToSetDetails();
            }else{
                errorText1.setText(result);
            }
        }else{
            errorText1.setText("* Please check the privacy box!");
        }      
    }//GEN-LAST:event_signUpButtonMouseClicked

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void termsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termsCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_termsCheckBoxActionPerformed

    private void signOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signOutButtonMouseClicked
        homeScreenPanel.setVisible(true);
        otherScreenPanel.setVisible(false);
        signInPanel.setVisible(false);
        signUpPanel.setVisible(false);
        signOutPanel.setVisible(true);
        setDetailsPanel.setVisible(false);
        aboutMePanel.setVisible(false);
        securitySettingsPanel.setVisible(false);
        changePasswordPanel.setVisible(false);
        securityQuestionsPanel.setVisible(false);
        friendListPanel.setVisible(false);
        discoverPanel.setVisible(false);
        otherUserPanel.setVisible(false);
       
    }//GEN-LAST:event_signOutButtonMouseClicked

    private void signOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signOutButtonActionPerformed

    private void firstNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextActionPerformed

    private void lastNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextActionPerformed

    private void userNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextActionPerformed

    private void emailText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailText1ActionPerformed

    private void phoneNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextActionPerformed

    private void genderTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderTextActionPerformed

    private void editProfileButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProfileButtonMouseClicked
        navigateToSetDetails();
    }//GEN-LAST:event_editProfileButtonMouseClicked

    private void monthBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthBoxActionPerformed

    private void changePicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePicButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changePicButtonActionPerformed

    private void firstNameText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameText1ActionPerformed

    private void lastNameText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameText1ActionPerformed

    private void userNameText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameText1ActionPerformed

    private void emailText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailText2ActionPerformed

    private void phoneNumberText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberText1ActionPerformed

    private void securitySettingsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_securitySettingsButtonMouseClicked
        homeScreenPanel.setVisible(false);
        otherScreenPanel.setVisible(true);
        signInPanel.setVisible(false);
        signUpPanel.setVisible(false);
        signOutPanel.setVisible(false);  
        setDetailsPanel.setVisible(false);
        aboutMePanel.setVisible(false);
        securitySettingsPanel.setVisible(true);
        changePasswordPanel.setVisible(false);
        securityQuestionsPanel.setVisible(false);
        friendListPanel.setVisible(false);
        discoverPanel.setVisible(false);
        otherUserPanel.setVisible(false);
        
    }//GEN-LAST:event_securitySettingsButtonMouseClicked

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioButtonActionPerformed

    private void changePasswordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswordButtonMouseClicked
        homeScreenPanel.setVisible(false);
        otherScreenPanel.setVisible(true);
        signInPanel.setVisible(false);
        signUpPanel.setVisible(false);
        signOutPanel.setVisible(false);   
        setDetailsPanel.setVisible(false);
        aboutMePanel.setVisible(false);
        securitySettingsPanel.setVisible(false);
        changePasswordPanel.setVisible(true);
        securityQuestionsPanel.setVisible(false);
        friendListPanel.setVisible(false);
        discoverPanel.setVisible(false);
        otherUserPanel.setVisible(false);

    }//GEN-LAST:event_changePasswordButtonMouseClicked

    private void setSecurityQuesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setSecurityQuesButtonMouseClicked
        homeScreenPanel.setVisible(false);
        otherScreenPanel.setVisible(true);
        signInPanel.setVisible(false);
        signUpPanel.setVisible(false);
        signOutPanel.setVisible(false);  
        setDetailsPanel.setVisible(false);
        aboutMePanel.setVisible(false);
        securitySettingsPanel.setVisible(false);
        changePasswordPanel.setVisible(false);
        securityQuestionsPanel.setVisible(true);
        friendListPanel.setVisible(false);
        discoverPanel.setVisible(false);
        otherUserPanel.setVisible(false);
     
    }//GEN-LAST:event_setSecurityQuesButtonMouseClicked

    private void aboutMeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMeButtonMouseClicked
        navigateToAboutMe();
    }//GEN-LAST:event_aboutMeButtonMouseClicked

    private void signInButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInButton1MouseClicked
        homeScreenPanel.setVisible(true);
        otherScreenPanel.setVisible(false);
        signInPanel.setVisible(true);
        signUpPanel.setVisible(false);
        signOutPanel.setVisible(false);   
        setDetailsPanel.setVisible(false);
        aboutMePanel.setVisible(false);
        securitySettingsPanel.setVisible(false);
        changePasswordPanel.setVisible(false);
        securityQuestionsPanel.setVisible(false);
        friendListPanel.setVisible(false);
        discoverPanel.setVisible(false);
        otherUserPanel.setVisible(false);


    }//GEN-LAST:event_signInButton1MouseClicked

    private void signInButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signInButton1ActionPerformed

    private void setSecurityQuesButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setSecurityQuesButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setSecurityQuesButton1ActionPerformed

    private void answer2TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer2TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer2TextActionPerformed

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        String month = (String)monthBox1.getSelectedItem();
        String day = (String)dayBox1.getSelectedItem();
        String year = (String)yearBox1.getSelectedItem();
        
        //Set Details here 
        currentUser.setFirstName(firstNameText1.getText());
        currentUser.setLastName(lastNameText1.getText());
        currentUser.setPhoneNumber(phoneNumberText1.getText());
        currentUser.setMonth(month);
        currentUser.setDay(day);
        currentUser.setYear(year);
        currentUser.setStatus(statusTextArea.getText());
        currentUser.setProfilePicture(profilePictureLabel.getIcon());

        if(maleRadioButton.isSelected()){
            currentUser.setGender("Male");
        }else if(femaleRadioButton.isSelected()){
            currentUser.setGender("Female");
        }else if(otherRadioButton.isSelected()){
            currentUser.setGender("Prefer not to say");        
        }
        else{
        }
        
        try {
            db.writeToDatabase(currentUser);
        }catch(IOException e){
            e.getStackTrace();
        }
        
        navigateToAboutMe();
    }//GEN-LAST:event_updateButtonMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String existingPassword = String.copyValueOf(existingPasswordText.getPassword());
        String newPassword = String.copyValueOf(newPasswordText.getPassword());
        String rePassword = String.copyValueOf(newPasswordText1.getPassword());
        if(currentUser.getPassword().equals(existingPassword)){
           if(vf.validatePassword(newPassword,newPassword).equals("No error")){
                currentUser.setPassword(newPassword);
                errorText2.setText("* New Password set successfully!");
           }else{
            errorText2.setText(vf.validatePassword(newPassword,newPassword));
           }
    }//GEN-LAST:event_jButton1MouseClicked
  }
    private void errorText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorText2ActionPerformed

    private void discoverButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_discoverButtonMouseClicked
        homeScreenPanel.setVisible(false);
        otherScreenPanel.setVisible(true);
        signInPanel.setVisible(false);
        signUpPanel.setVisible(false);
        signOutPanel.setVisible(false);  
        setDetailsPanel.setVisible(false);
        aboutMePanel.setVisible(false);
        securitySettingsPanel.setVisible(false);
        changePasswordPanel.setVisible(false);
        securityQuestionsPanel.setVisible(false);
        friendListPanel.setVisible(false);
        discoverPanel.setVisible(true);
        otherUserPanel.setVisible(false);

    }//GEN-LAST:event_discoverButtonMouseClicked

    private void friendsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friendsButtonMouseClicked
        homeScreenPanel.setVisible(false);
        otherScreenPanel.setVisible(true);
        signInPanel.setVisible(false);
        signUpPanel.setVisible(false);
        signOutPanel.setVisible(false);  
        setDetailsPanel.setVisible(false);
        aboutMePanel.setVisible(false);
        securitySettingsPanel.setVisible(false);
        changePasswordPanel.setVisible(false);
        securityQuestionsPanel.setVisible(false);
        friendListPanel.setVisible(true);
        discoverPanel.setVisible(false);
        otherUserPanel.setVisible(false);

        
        nameLabel1.setText(currentUser.getFirstName()+" "+currentUser.getLastName());
        noOfFriendsLabel.setText(String.valueOf(currentUser.getNumberOfFriends()));
        statusBar1.setText(currentUser.getStatus());
        genderLabel1.setText(currentUser.getGender());
        usernameLabel1.setText(currentUser.getUsername());
        
        //Set DP
        BufferedImage img = null;
                try {
                    img = ImageIO.read(new File(currentUser.getProfilePicturePath()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
              Image dimg = img.getScaledInstance(dpLabel.getWidth(), dpLabel.getHeight(),Image.SCALE_SMOOTH);
              ImageIcon image = new ImageIcon(dimg);
              dpLabel.setIcon(image);
        
        //Populate friends list 
        friendList.clear();
        selectedUserIndex.clear();

            for(User friend: currentUser.getFriends()){
                selectedUserIndex.add(friend);
                 img = null;
            try {
                img = ImageIO.read(new File(friend.getProfilePicturePath()));
            } catch (IOException e) {
                e.printStackTrace();
            }
              image = new ImageIcon(img);
                friendList.addElement(new ImgsNText(friend.getFirstName() + friend.getLastName(),image));
            }
        jList1.setCellRenderer(new Renderer());
        jList1.setModel(friendList);
    }//GEN-LAST:event_friendsButtonMouseClicked

    private void friendsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friendsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_friendsButtonActionPerformed

    private void changePicButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePicButtonMouseClicked
        JFileChooser fileChooser = new JFileChooser();
            int status = fileChooser.showOpenDialog(null);
            if (status == JFileChooser.APPROVE_OPTION)
            {
              File selectedFile =
                      fileChooser.getSelectedFile();
              
              BufferedImage img = null;
                try {
                    img = ImageIO.read(new File(selectedFile.getPath()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
              Image dimg = img.getScaledInstance(profilePictureLabel.getWidth(), profilePictureLabel.getHeight(),Image.SCALE_SMOOTH);
              ImageIcon image = new ImageIcon(dimg);
              profilePictureLabel.setIcon(image);
              currentUser.setProfilePicturePath(selectedFile.getPath());
            }
    }//GEN-LAST:event_changePicButtonMouseClicked
    ArrayList<User> selectedUserIndex = new ArrayList<>();

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        selectedUserIndex.clear();
        searchedUser.clear();
        String findUser;
        findUser = searchBar.getText();
        for(User user: profileManager.profilesList ){
            if(findUser.equals(user.getUsername())){
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new File(user.getProfilePicturePath()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Image dimg = img.getScaledInstance(jList3.getWidth(), jList3.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(img);
                searchedUser.addElement(new ImgsNText(user.getFirstName() + user.getLastName(),image));
                selectedUserIndex.add(user);
                jList3.setCellRenderer(new Renderer());
                jList3.setModel(searchedUser);
            }
        }   
    }//GEN-LAST:event_searchButtonMouseClicked

    private void jList3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseEntered

    }//GEN-LAST:event_jList3MouseEntered

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        
        int x =  jList3.getSelectedIndex();
        selectedUser = selectedUserIndex.get(x); 
        
        searchedUser.clear();
        friendList.clear();
        homeScreenPanel.setVisible(false);
        otherScreenPanel.setVisible(true);
        signInPanel.setVisible(false);
        signUpPanel.setVisible(false);
        signOutPanel.setVisible(false);  
        setDetailsPanel.setVisible(false);
        aboutMePanel.setVisible(false);
        securitySettingsPanel.setVisible(false);
        changePasswordPanel.setVisible(false);
        securityQuestionsPanel.setVisible(false);
        friendListPanel.setVisible(false);
        discoverPanel.setVisible(false);
        otherUserPanel.setVisible(true);
        
        nameLabel.setText(selectedUser.getFirstName() + " " + selectedUser.getLastName());
        nofriends.setText(String.valueOf(selectedUser.getNumberOfFriends()));
        statusBar.setText(selectedUser.getStatus());
        usernameLabel.setText(selectedUser.getUsername());
        genderLabel.setText(selectedUser.getGender());
        
        
        
        BufferedImage img = null;
            try {
                img = ImageIO.read(new File(selectedUser.getProfilePicturePath()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Image dimg = img.getScaledInstance(displayPictureLabel.getWidth(), displayPictureLabel.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(dimg);
            displayPictureLabel.setIcon(image);
//            selectedUserIndex.clear();
        //Check if friend
        int flag=0;
        
        for(User selectedUserFriends:selectedUser.getFriends()){
            if(selectedUserFriends.getUsername()==currentUser.getUsername()){
                flag=1;
            }
        }                  
        if(flag ==1){
        selectedUserIndex.clear();
        for(User selectedUserFriends:selectedUser.getFriends()){
            selectedUserIndex.add(selectedUserFriends);
            //Populate the list
                img = null;
                try {
                    img = ImageIO.read(new File(selectedUserFriends.getProfilePicturePath()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                dimg = img.getScaledInstance(jList4.getWidth(), jList4.getHeight(),Image.SCALE_SMOOTH);
                image = new ImageIcon(img);
                friendList.addElement(new ImgsNText(selectedUserFriends.getFirstName() + selectedUserFriends.getLastName(),image));
                jList4.setCellRenderer(new Renderer());
                jList4.setModel(friendList);
            }
        }
    }//GEN-LAST:event_jList3MouseClicked

    private void addFriendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFriendButtonActionPerformed

    }//GEN-LAST:event_addFriendButtonActionPerformed

    private void addFriendButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFriendButtonMouseClicked
        friendsFriends.clear();
        int flag =0;
        
        for(User friend:selectedUser.getFriends()){
            if(friend.getUsername().equals(currentUser.getUsername())){
                flag = 1;
            }
        }
        
        if(flag!=1){
            profileManager.createFriendship(currentUser,selectedUser);
            try {
                db.writeToDatabase(currentUser);
                db.writeToDatabase(selectedUser);
            }catch(IOException e){
                e.getStackTrace();
            }
        }
        
        selectedUserIndex.clear();
            for(User friend: selectedUser.getFriends()){
                selectedUserIndex.add(friend);
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new File(friend.getProfilePicturePath()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //                Image dimg = img.getScaledInstance(displayPictureLabel.getWidth(), displayPictureLabel.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon image = new ImageIcon(img);
                friendsFriends.addElement(new ImgsNText(friend.getFirstName() + friend.getLastName(),image));
            }
        
        jList4.setCellRenderer(new Renderer());
        jList4.setModel(friendsFriends);   
    }//GEN-LAST:event_addFriendButtonMouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        
        
        int x =  jList1.getSelectedIndex();                
        User selectedUser = selectedUserIndex.get(x);
        
        friendList.clear();
        homeScreenPanel.setVisible(false);
        otherScreenPanel.setVisible(true);
        signInPanel.setVisible(false);
        signUpPanel.setVisible(false);
        signOutPanel.setVisible(false);  
        setDetailsPanel.setVisible(false);
        aboutMePanel.setVisible(false);
        securitySettingsPanel.setVisible(false);
        changePasswordPanel.setVisible(false);
        securityQuestionsPanel.setVisible(false);
        friendListPanel.setVisible(false);
        discoverPanel.setVisible(false);
        otherUserPanel.setVisible(true);
        
        nameLabel.setText(selectedUser.getFirstName() + " " + selectedUser.getLastName());
        nofriends.setText(String.valueOf(selectedUser.getNumberOfFriends()));
        statusBar.setText(selectedUser.getStatus());
        usernameLabel.setText(selectedUser.getUsername());
        genderLabel.setText(selectedUser.getGender());
        
        BufferedImage img = null;
            try {
                img = ImageIO.read(new File(selectedUser.getProfilePicturePath()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Image dimg = img.getScaledInstance(displayPictureLabel.getWidth(), displayPictureLabel.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(dimg);
            displayPictureLabel.setIcon(image);
            selectedUserIndex.clear();
            
        //Check if friend
        for(User selectedUserFriends:selectedUser.getFriends()){
            selectedUserIndex.add(selectedUserFriends);
            //Populate the list
                img = null;
                try {
                    img = ImageIO.read(new File(selectedUserFriends.getProfilePicturePath()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                dimg = img.getScaledInstance(jList4.getWidth(), jList4.getHeight(),Image.SCALE_SMOOTH);
                image = new ImageIcon(img);
                friendList.addElement(new ImgsNText(selectedUserFriends.getFirstName() + selectedUserFriends.getLastName(),image));
                jList4.setCellRenderer(new Renderer());
                jList4.setModel(friendList); 
        }
        
    }//GEN-LAST:event_jList1MouseClicked

    private void jList4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList4MouseClicked
        
        int x =  jList4.getSelectedIndex();
        System.out.print(x + "Clicked in list 4");
        for(User ele:selectedUserIndex) System.out.print(ele.getUsername() + " ");
        User selectedUser = selectedUserIndex.get(x);
        
        friendList.clear();
        homeScreenPanel.setVisible(false);
        otherScreenPanel.setVisible(true);
        signInPanel.setVisible(false);
        signUpPanel.setVisible(false);
        signOutPanel.setVisible(false);  
        setDetailsPanel.setVisible(false);
        aboutMePanel.setVisible(false);
        securitySettingsPanel.setVisible(false);
        changePasswordPanel.setVisible(false);
        securityQuestionsPanel.setVisible(false);
        friendListPanel.setVisible(false);
        discoverPanel.setVisible(false);
        otherUserPanel.setVisible(true);
        
        
        nameLabel.setText(selectedUser.getFirstName() + " " + selectedUser.getLastName());
        nofriends.setText(String.valueOf(selectedUser.getNumberOfFriends()));
        statusBar.setText(selectedUser.getStatus());
        usernameLabel.setText(selectedUser.getUsername());
        genderLabel.setText(selectedUser.getGender());
        
        BufferedImage img = null;
            try {
                img = ImageIO.read(new File(selectedUser.getProfilePicturePath()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Image dimg = img.getScaledInstance(displayPictureLabel.getWidth(), displayPictureLabel.getHeight(),Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(dimg);
            displayPictureLabel.setIcon(image);
            
        int flag=0;    
        //Check if friend
        for(User selectedUserFriends:selectedUser.getFriends()){
            if(selectedUserFriends.getUsername().equals(currentUser.getUsername()))
                flag =1;
           }
       if(flag==1){
        selectedUserIndex.clear();
        for(User selectedUserFriends:selectedUser.getFriends()){
            //Populate the list
                selectedUserIndex.add(selectedUserFriends);
                img = null;
                try {
                    img = ImageIO.read(new File(selectedUserFriends.getProfilePicturePath()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                dimg = img.getScaledInstance(jList4.getWidth(), jList4.getHeight(),Image.SCALE_SMOOTH);
                image = new ImageIcon(img);
                friendList.addElement(new ImgsNText(selectedUserFriends.getFirstName() + selectedUserFriends.getLastName(),image));
                jList4.setCellRenderer(new Renderer());
                jList4.setModel(friendList);
        }
       }
    }//GEN-LAST:event_jList4MouseClicked
    private void aboutMeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMeButtonActionPerformed
    }//GEN-LAST:event_aboutMeButtonActionPerformed

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ProfilePictureLabel;
    private javax.swing.JButton aboutMeButton;
    private javax.swing.JPanel aboutMePanel;
    private javax.swing.JButton addFriendButton;
    private javax.swing.JTextField answer1Text;
    private javax.swing.JTextField answer2Text;
    private javax.swing.JTextField answer3Box;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JPanel changePasswordPanel;
    private javax.swing.JButton changePicButton;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JTextField dayBox;
    private javax.swing.JComboBox<String> dayBox1;
    private javax.swing.JButton deleteAccountButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton discoverButton;
    private javax.swing.JPanel discoverPanel;
    private javax.swing.JLabel displayPictureLabel;
    private javax.swing.JLabel dpLabel;
    private javax.swing.JButton editProfileButton;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField emailText1;
    private javax.swing.JTextField emailText2;
    private javax.swing.JTextField errorText;
    private javax.swing.JTextField errorText1;
    private javax.swing.JTextField errorText2;
    private javax.swing.JPasswordField existingPasswordText;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JTextField firstNameText1;
    private javax.swing.JButton forgotPasswordButton;
    private javax.swing.JPanel friendListPanel;
    private javax.swing.JButton friendsButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel genderLabel1;
    private javax.swing.JTextField genderText;
    private javax.swing.JPanel homeScreenPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JTextField lastNameText1;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JTextField monthBox;
    private javax.swing.JComboBox<String> monthBox1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JPasswordField newPasswordText;
    private javax.swing.JPasswordField newPasswordText1;
    private javax.swing.JLabel noOfFriendsLabel;
    private javax.swing.JLabel nofriends;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JPanel otherScreenPanel;
    private javax.swing.JPanel otherUserPanel;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JPasswordField passwordText1;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JTextField phoneNumberText1;
    private javax.swing.JLabel profilePictureLabel;
    private javax.swing.JComboBox<String> question1Box;
    private javax.swing.JComboBox<String> question2Box;
    private javax.swing.JComboBox<String> question3Box;
    private javax.swing.JPasswordField rePasswordText;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel securityQuestionsPanel;
    private javax.swing.JButton securitySettingsButton;
    private javax.swing.JPanel securitySettingsPanel;
    private javax.swing.JPanel setDetailsPanel;
    private javax.swing.JButton setSecurityQuesButton;
    private javax.swing.JButton setSecurityQuesButton1;
    private javax.swing.JButton setStatusButton;
    private javax.swing.JButton signInButton;
    private javax.swing.JButton signInButton1;
    private javax.swing.JPanel signInPanel;
    private javax.swing.JButton signOutButton;
    private javax.swing.JPanel signOutPanel;
    private javax.swing.JButton signUpButton;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JTextArea statusBar;
    private javax.swing.JTextArea statusBar1;
    private javax.swing.JScrollPane statusText;
    private javax.swing.JScrollPane statusText1;
    private javax.swing.JScrollPane statusText2;
    private javax.swing.JScrollPane statusText3;
    private javax.swing.JTextArea statusTextArea;
    private javax.swing.JTextArea statusTextArea1;
    private javax.swing.JCheckBox termsCheckBox;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField userNameText;
    private javax.swing.JTextField userNameText1;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JTextField usernameText;
    private javax.swing.JTextField usernameText1;
    private javax.swing.JTextField yearBox;
    private javax.swing.JComboBox<String> yearBox1;
    // End of variables declaration//GEN-END:variables
}

