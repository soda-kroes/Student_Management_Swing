
package student_pro;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Student_update extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet r;
    String sql;
    public Student_update() {
        initComponents();
    }

    Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Show_student","root","");
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Error: "+e.getMessage());
        }
        return con;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_name1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rd_male1 = new javax.swing.JRadioButton();
        rd_female = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        cb_address = new javax.swing.JComboBox<>();
        cb_course = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cb_time = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cb_room1 = new javax.swing.JComboBox<>();
        cb_school = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        ch_monfri = new javax.swing.JCheckBox();
        ch_satsun = new javax.swing.JCheckBox();
        btn_delete = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_id1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        btn_search2 = new javax.swing.JButton();
        btn_search3 = new javax.swing.JButton();
        btn_back1 = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btn_search = new javax.swing.JButton();
        btn_search1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        home = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();
        menu_about = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(837, 640));
        setMinimumSize(new java.awt.Dimension(837, 640));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Student_pro\\src\\image\\e1-removebg-preview (1).png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 30, 170, 140);

        jLabel2.setFont(new java.awt.Font("AKbalthom Chamnap Chhun", 1, 24)); // NOI18N
        jLabel2.setText("\"Build Your IT  Skill\"");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 240, 300, 45);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel3.setText("ENGINEERING OF TECHNOLOGY AND ELECTRONIC");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 160, 680, 60);

        jLabel4.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel4.setText("Stu_ID            : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 310, 130, 23);

        txt_name1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(txt_name1);
        txt_name1.setBounds(580, 290, 220, 30);

        jLabel5.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel5.setText("Name        : ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(470, 300, 110, 23);

        jLabel6.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel6.setText("Gender            : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 350, 140, 23);

        rd_male1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        rd_male1.setText("Male");
        getContentPane().add(rd_male1);
        rd_male1.setBounds(210, 350, 100, 22);

        rd_female.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        rd_female.setText("Female");
        getContentPane().add(rd_female);
        rd_female.setBounds(340, 350, 90, 22);

        jLabel7.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel7.setText("Address    : ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 350, 130, 23);

        cb_address.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb_address.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kompot", "Keb", "Preas Seyhaknuk", "Kompong Chhnang", "Por Sat", "Batt Dombong", "Pai Len", "Bun Teaymeanchy", "Seim Reab", "Kom Pongthom", "Kom PongCham", "Prey Veng", "Svay Rean", "Takeo", "Kandal", "Kom Pongspy", "Kro Ches", "Steung Treng", "Mundul Kiri", "Preas Vihea", "Rathanak Kiri", "Khus Koh", "Oudor Meanchy" }));
        getContentPane().add(cb_address);
        cb_address.setBounds(580, 350, 220, 30);

        cb_course.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb_course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C , C++, OPP", "Java Programing", "C# Programing", "Web Back_end", "Web Front_end", "Mobile Developer", "Network", "Cyber Security", " ", " " }));
        cb_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_courseActionPerformed(evt);
            }
        });
        getContentPane().add(cb_course);
        cb_course.setBounds(210, 400, 220, 30);

        jLabel8.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel8.setText("Course            : ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 400, 140, 23);

        jLabel9.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel9.setText("Price         : ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(470, 400, 140, 23);

        txt_price.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(txt_price);
        txt_price.setBounds(580, 400, 220, 30);

        jLabel10.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel10.setText("Time               : ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 450, 140, 23);

        cb_time.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb_time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00-9:00am", "10:00-11:00am", "1:00-2:00pm", "3:00-4:00pm", "5:00-6:00pm", "6:00-7:00pm" }));
        getContentPane().add(cb_time);
        cb_time.setBounds(210, 450, 220, 30);

        jLabel11.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel11.setText("Room        : ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(470, 450, 130, 23);

        cb_room1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb_room1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ETEC01", "ETEC02", "ETEC03", "ETEC04", "ETEC05", "ETEC06" }));
        cb_room1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_room1ActionPerformed(evt);
            }
        });
        getContentPane().add(cb_room1);
        cb_room1.setBounds(580, 440, 220, 30);

        cb_school.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cb_school.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RUPP", "SETEC", "ITC", "RULE", "NPIC", "ETEC" }));
        getContentPane().add(cb_school);
        cb_school.setBounds(210, 500, 220, 30);

        jLabel12.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel12.setText("Day         : ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(480, 500, 100, 23);

        ch_monfri.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        ch_monfri.setText("Mon_Fri");
        getContentPane().add(ch_monfri);
        ch_monfri.setBounds(590, 500, 100, 22);

        ch_satsun.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        ch_satsun.setText("Sat_Sun");
        getContentPane().add(ch_satsun);
        ch_satsun.setBounds(690, 500, 110, 22);

        btn_delete.setBackground(new java.awt.Color(102, 102, 255));
        btn_delete.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(102, 102, 102));
        btn_delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Student_pro\\src\\image\\cancel1.png")); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete);
        btn_delete.setBounds(450, 560, 110, 36);

        jLabel13.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        jLabel13.setText("From_School    : ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 500, 150, 23);

        txt_id1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        getContentPane().add(txt_id1);
        txt_id1.setBounds(200, 300, 220, 30);

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(830, 0, 10, 640);

        jPanel5.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 830, 10);

        jPanel6.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 640, 840, 10);

        jPanel8.setBackground(new java.awt.Color(51, 51, 255));

        jPanel9.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel8);
        jPanel8.setBounds(0, 0, 10, 640);

        btn_search2.setBackground(new java.awt.Color(255, 153, 153));
        btn_search2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search2);
        btn_search2.setBounds(0, 0, 28, 12);

        btn_search3.setBackground(new java.awt.Color(255, 153, 153));
        btn_search3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search3);
        btn_search3.setBounds(0, 0, 28, 12);

        btn_back1.setBackground(new java.awt.Color(102, 102, 255));
        btn_back1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        btn_back1.setForeground(new java.awt.Color(102, 102, 102));
        btn_back1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Student_pro\\src\\image\\back.png")); // NOI18N
        btn_back1.setText("Back");
        btn_back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back1);
        btn_back1.setBounds(600, 560, 110, 36);

        btn_update.setBackground(new java.awt.Color(102, 102, 255));
        btn_update.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 18)); // NOI18N
        btn_update.setForeground(new java.awt.Color(102, 102, 102));
        btn_update.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Student_pro\\src\\image\\submit.png")); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update);
        btn_update.setBounds(300, 560, 120, 36);

        jPanel7.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(10, 620, 830, 10);

        btn_search.setBackground(new java.awt.Color(255, 153, 153));
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search);
        btn_search.setBounds(0, 0, 28, 12);

        btn_search1.setBackground(new java.awt.Color(255, 153, 153));
        btn_search1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btn_search1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Student_pro\\src\\image\\loupe.png")); // NOI18N
        btn_search1.setText("Search");
        btn_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search1);
        btn_search1.setBounds(680, 250, 120, 30);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 806, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 10, 820, 610);

        jMenu1.setText("File");

        home.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        home.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Student_pro\\src\\image\\home.png")); // NOI18N
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jMenu1.add(home);

        logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Student_pro\\src\\image\\logout.png")); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu1.add(logout);

        jMenuBar1.add(jMenu1);

        menu_about.setText("About");

        about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        menu_about.add(about);

        jMenuBar1.add(menu_about);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(855, 688));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cb_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_courseActionPerformed
        int op = cb_course.getSelectedIndex();
        double price=0;
        switch(op){
            case 0:{
                price=69.99;
            }break;
            case 1:{
                price=89.99;
            }break;
            case 2:{
                price=89.99;
            }
            case 3:{
                price=79.99;
            }
            case 4:{
                price=79.99;
            }break;
            case 5:{
                price=105.99;
            }break;
            case 6:{
                price=69.99;
            }break;
            case 7:{
                price=199.99;
            }break;
        }
        txt_price.setText(String.valueOf(price));
    }//GEN-LAST:event_cb_courseActionPerformed

    private void cb_room1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_room1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_room1ActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
              try {
            int id = Integer.parseInt(txt_id1.getText());
            sql = "DELETE FROM show_stu WHERE id = '"+id+"'";
            ps=connection().prepareStatement(sql);
            ps.executeUpdate();
            dispose();
                ShowStudent show_stu = new ShowStudent();
               show_stu.show();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_search2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search2ActionPerformed
  
    }//GEN-LAST:event_btn_search2ActionPerformed

    private void btn_search3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search3ActionPerformed
        
    }//GEN-LAST:event_btn_search3ActionPerformed

    private void btn_back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back1ActionPerformed
       Home.main(null);
    }//GEN-LAST:event_btn_back1ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        dispose();
        Home home = new Home();
        home.show();
    }//GEN-LAST:event_homeActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        dispose();
        Login login = new Login();
        login.show();
    }//GEN-LAST:event_logoutActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        dispose();
        About about= new About();
        about.show();
    }//GEN-LAST:event_aboutActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
       try {
            int id = Integer.parseInt(txt_id1.getText());
            String name=txt_name1.getText();
            String gender;
            if(rd_male1.isSelected()){
                gender="Male";
            }
            else{
                gender="Female";
            }
            String address = cb_address.getSelectedItem().toString();
            String course = cb_course.getSelectedItem().toString();
            float price = Float.parseFloat(txt_price.getText());
            String time = cb_time.getSelectedItem().toString();
            String room = cb_room1.getSelectedItem().toString();
            String school = cb_school.getSelectedItem().toString();
            String day;
            if(ch_monfri.isSelected()){
                day="Mon_Fri";
            }
            else{
                day="Sat_Sun";
            }
            sql="UPDATE add_student SET name=?,gender=?,address=?,course=?,price=?,time=?,room=?,school=?,day=? WHERE id=?";
            ps=connection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, address);
            ps.setString(4, course);
            ps.setFloat(5, price);
            ps.setString(6, time);
            ps.setString(7, room);
            ps.setString(8, school);
            ps.setString(9, day);
            ps.setInt(10, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Successful.");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search1ActionPerformed
        try {
            int std_id = Integer.parseInt(txt_id1.getText());
            sql="SELECT * FROM show_stu WHERE id='"+std_id+"'";
            ps=connection().prepareStatement(sql);
            r=ps.executeQuery();
            if(r.next()){
                txt_name1.setText(r.getString(2));
                String gender = r.getString(3);
                if(gender.equals("Male")){
                    rd_male1.setSelected(true);
                }
                else{
                    rd_female.setSelected(true);
                }
                cb_address.setSelectedItem(r.getString(4));
                cb_course.setSelectedItem(r.getString(5));
                txt_price.setText(r.getString(6));
                cb_time.setSelectedItem(r.getString(7));
                cb_room1.setSelectedItem(r.getString(8));
                cb_school.setSelectedItem(r.getString(9));
                String day = r.getString(10);
                if(day.equals("Mon_Fri")){
                    ch_monfri.setSelected(true);
                }
                else{
                    ch_satsun.setSelected(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_search1ActionPerformed

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
            java.util.logging.Logger.getLogger(Student_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JButton btn_back1;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_search1;
    private javax.swing.JButton btn_search2;
    private javax.swing.JButton btn_search3;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_address;
    private javax.swing.JComboBox<String> cb_course;
    private javax.swing.JComboBox<String> cb_room1;
    private javax.swing.JComboBox<String> cb_school;
    private javax.swing.JComboBox<String> cb_time;
    private javax.swing.JCheckBox ch_monfri;
    private javax.swing.JCheckBox ch_satsun;
    private javax.swing.JMenuItem home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenu menu_about;
    private javax.swing.JRadioButton rd_female;
    private javax.swing.JRadioButton rd_male1;
    private javax.swing.JTextField txt_id1;
    private javax.swing.JTextField txt_name1;
    private javax.swing.JTextField txt_price;
    // End of variables declaration//GEN-END:variables
}
