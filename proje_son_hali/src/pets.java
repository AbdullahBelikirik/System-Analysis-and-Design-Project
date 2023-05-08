
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZEHRABENGÜEMÜL
 */
public class pets extends javax.swing.JFrame {
    Connection Con = null;
    PreparedStatement Ps = null;
    ResultSet Rs = null;
    Statement St = null;
    /**
     * Creates new form pets
     */
    public pets() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        hayvan_sil_btn = new javax.swing.JButton();
        hayvan_kaydet_btn = new javax.swing.JButton();
        hayvan_duzenle_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        petsTable = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        ıd_field = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        species_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(230, 230, 230));

        jLabel11.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel11.setText("ID");

        jLabel13.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel13.setText("TURU");

        hayvan_sil_btn.setBackground(new java.awt.Color(255, 204, 204));
        hayvan_sil_btn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        hayvan_sil_btn.setText("SIL");
        hayvan_sil_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        hayvan_sil_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hayvan_sil_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hayvan_sil_btnActionPerformed(evt);
            }
        });

        hayvan_kaydet_btn.setBackground(new java.awt.Color(255, 204, 204));
        hayvan_kaydet_btn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        hayvan_kaydet_btn.setText("KAYDET");
        hayvan_kaydet_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        hayvan_kaydet_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hayvan_kaydet_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hayvan_kaydet_btnActionPerformed(evt);
            }
        });

        hayvan_duzenle_btn.setBackground(new java.awt.Color(255, 204, 204));
        hayvan_duzenle_btn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        hayvan_duzenle_btn.setText("DÜZENLE");
        hayvan_duzenle_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        hayvan_duzenle_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hayvan_duzenle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hayvan_duzenle_btnActionPerformed(evt);
            }
        });

        petsTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        petsTable.setFont(new java.awt.Font("UD Digi Kyokasho NP-R", 0, 25)); // NOI18N
        petsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Tür"
            }
        ));
        petsTable.setRowHeight(30);
        petsTable.setRowMargin(2);
        jScrollPane1.setViewportView(petsTable);

        jLabel15.setFont(new java.awt.Font("Imprint MT Shadow", 1, 25)); // NOI18N
        jLabel15.setText("HAYVAN LISTESI");

        ıd_field.setBackground(new java.awt.Color(245, 245, 245));
        ıd_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ıd_fieldActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(1204, 163));

        jLabel3.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel3.setText("HAYVANLAR");

        jLabel4.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel4.setText("KULLANICILAR");

        jLabel8.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel8.setText("MÜSTERILER");

        jLabel9.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel9.setText("ÜRÜNLER");

        jLabel10.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel10.setText("       CIKIS");

        jLabel14.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel14.setText("FATURALAR");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oo.png"))); // NOI18N

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pets_btn(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/users.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                users_btn(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customers_btn(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 204, 204));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bill.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billing_btn(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 204, 204));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1375593-200-removebg-preview 1.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                products_btn(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 204, 204));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btn(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        species_field.setBackground(new java.awt.Color(245, 245, 245));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGap(28, 28, 28))
                    .addComponent(hayvan_kaydet_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(hayvan_sil_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(hayvan_duzenle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(species_field, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ıd_field, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ıd_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(species_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hayvan_sil_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hayvan_kaydet_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hayvan_duzenle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displayPets() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        Con = DriverManager.getConnection("jdbc:mysql://aws.connect.psdb.cloud/petshop-db", "zh00010wu66b7f6ot8bb", "pscale_pw_irQPQskV5VYqpFnOoMs0ObjvFhjOtC8zm60UNwdMAfV");
        St = Con.createStatement();
        Rs = St.executeQuery("Select * from Pets");

        ResultSetMetaData metaData = Rs.getMetaData();
        int columnCount = metaData.getColumnCount();
        String[] columnNames = new String[columnCount];
        for (int i = 1; i <= columnCount; i++) {
            columnNames[i - 1] = metaData.getColumnName(i);
        }

        // DefaultTableModel nesnesini oluştur ve sütun bilgilerini ekle
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        // ResultSet nesnesinden verileri tabloya ekle
        while (Rs.next()) {
            Object[] row = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                row[i - 1] = Rs.getObject(i);
            }
            tableModel.addRow(row);
        }

        // JTable nesnesini oluştur ve verileri ekleyerek göster
        petsTable.setModel(tableModel);
        //JOptionPane.showMessageDialog(null, new JScrollPane(table), "Table", JOptionPane.PLAIN_MESSAGE);

        // Kaynakları serbest bırak
        Rs.close();
        St.close();
        Con.close();
    }
    private void hayvan_sil_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hayvan_sil_btnActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        try {
            Con = DriverManager.getConnection("jdbc:mysql://aws.connect.psdb.cloud/petshop-db", "zh00010wu66b7f6ot8bb", "pscale_pw_irQPQskV5VYqpFnOoMs0ObjvFhjOtC8zm60UNwdMAfV");
            Ps = (PreparedStatement) Con.prepareStatement("delete from Pets where PetId = ?");

            int selectedRowIndex = petsTable.getSelectedRow();
            if (selectedRowIndex != -1) {
                String userName = (String) petsTable.getValueAt(selectedRowIndex, 0);
                Ps.setString(1, userName);
                Ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Hayvan Silindi");
            } else {
                JOptionPane.showMessageDialog(this, "Sileceğiniz hayvanı seçmeniz gerekmektedir");
            }
            Ps.close();
            Con.close();
            displayPets();
        } catch (SQLException ex) {
            Logger.getLogger(users.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_hayvan_sil_btnActionPerformed

    private void hayvan_kaydet_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hayvan_kaydet_btnActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        if (ıd_field.getText().isEmpty() || species_field.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Eksik Bilgi");
        } else {
            try {
                Con = DriverManager.getConnection("jdbc:mysql://aws.connect.psdb.cloud/petshop-db", "zh00010wu66b7f6ot8bb", "pscale_pw_irQPQskV5VYqpFnOoMs0ObjvFhjOtC8zm60UNwdMAfV");
                Ps = (PreparedStatement) Con.prepareStatement("insert into Pets(PetId, PetSpecies) VALUES(?,?)");
                Ps.setString(1, ıd_field.getText());
                Ps.setString(2, species_field.getText());
                Ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Kullanıcı Eklendi");
                Con.close();
                displayPets();
            } catch (SQLException ex) {
                Logger.getLogger(users.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, ex);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_hayvan_kaydet_btnActionPerformed

    private void hayvan_duzenle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hayvan_duzenle_btnActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(users.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Con = DriverManager.getConnection("jdbc:mysql://aws.connect.psdb.cloud/petshop-db", "zh00010wu66b7f6ot8bb", "pscale_pw_irQPQskV5VYqpFnOoMs0ObjvFhjOtC8zm60UNwdMAfV");
            Ps = (PreparedStatement) Con.prepareStatement("Update Pets Set PetId = ? , PetSpecies = ? where PetId = ?");

            int selectedRowIndex = petsTable.getSelectedRow();
            if (selectedRowIndex != -1) {

                String oldUserName = (String) petsTable.getValueAt(selectedRowIndex, 0);
                if (ıd_field.getText().isEmpty() || species_field.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Eksik Bilgi");
                } else {
                    Ps.setString(1, ıd_field.getText());
                    Ps.setString(2, species_field.getText());
                    Ps.setString(3, oldUserName);
                    Ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Kullanıcı Güncellendi");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Güncelleyeceğiniz kullancıyı seçmeniz gerekmektedir");
            }
            Ps.close();
            Con.close();
            displayPets();
        } catch (SQLException ex) {
            Logger.getLogger(users.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_hayvan_duzenle_btnActionPerformed

    private void pets_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pets_btn
        // TODO add your handling code here:
    }//GEN-LAST:event_pets_btn

    private void users_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_users_btn
        // TODO add your handling code here:
	    dispose();
	    java.awt.EventQueue.invokeLater(() -> {
                try {
                    new users().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(pets.class.getName()).log(Level.SEVERE, null, ex);
                }
	    });
    }//GEN-LAST:event_users_btn

    private void customers_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customers_btn
        // TODO add your handling code here:
	    dispose();
	    java.awt.EventQueue.invokeLater(() -> {
                try {
                    new customers().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(pets.class.getName()).log(Level.SEVERE, null, ex);
                }
	    });
    }//GEN-LAST:event_customers_btn

    private void billing_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billing_btn
        // TODO add your handling code here:
	    dispose();
	    java.awt.EventQueue.invokeLater(() -> {
		new billing().setVisible(true);
	    });
    }//GEN-LAST:event_billing_btn

    private void products_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_products_btn
        // TODO add your handling code here:
	    dispose();
	    java.awt.EventQueue.invokeLater(() -> {
		new products().setVisible(true);
	    });
    }//GEN-LAST:event_products_btn

    private void logout_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btn
        // TODO add your handling code here:
	    dispose();
	    java.awt.EventQueue.invokeLater(() -> {
		new login_page().setVisible(true);
	    });
    }//GEN-LAST:event_logout_btn

    private void ıd_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ıd_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ıd_fieldActionPerformed

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
            java.util.logging.Logger.getLogger(pets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new pets().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hayvan_duzenle_btn;
    private javax.swing.JButton hayvan_kaydet_btn;
    private javax.swing.JButton hayvan_sil_btn;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable petsTable;
    private javax.swing.JTextField species_field;
    private javax.swing.JTextField ıd_field;
    // End of variables declaration//GEN-END:variables
}
