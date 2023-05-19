import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.util.locale.LocaleUtils;
import javax.swing.JPanel;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZEHRABENGÜEMÜL
 */
public class billing extends javax.swing.JFrame {

    /**
     * Creates new form billing
     */
    public billing() {
        initComponents();
    }
    Connection Con = null;
    PreparedStatement Ps1, Ps2 = null;
    ResultSet Rs = null;
    Statement St = null;

    int quantity;
    int totalPrice = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        fatura_kaydet_btn = new javax.swing.JButton();
        fis_print_btn = new javax.swing.JButton();
        tc_field = new javax.swing.JTextField();
        fise_ekle_btn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        quant_field = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillingTable = new javax.swing.JTable();
        id_field = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(246, 242, 242));
        jPanel4.setPreferredSize(new java.awt.Dimension(1204, 650));

        jLabel11.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel11.setText("MÜSTERI ADI");

        jLabel14.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel14.setText("MUSTERI TC");

        name_field.setBackground(new java.awt.Color(245, 245, 245));

        fatura_kaydet_btn.setBackground(new java.awt.Color(255, 204, 204));
        fatura_kaydet_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        fatura_kaydet_btn.setText("KAYDET");
        fatura_kaydet_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        fatura_kaydet_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fatura_kaydet_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatura_kaydet_btnActionPerformed(evt);
            }
        });

        fis_print_btn.setBackground(new java.awt.Color(255, 204, 204));
        fis_print_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        fis_print_btn.setText("FATURAYI BASTIR");
        fis_print_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        fis_print_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fis_print_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fis_print_btnActionPerformed(evt);
            }
        });

        tc_field.setBackground(new java.awt.Color(245, 245, 245));

        fise_ekle_btn.setBackground(new java.awt.Color(255, 204, 204));
        fise_ekle_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        fise_ekle_btn.setText("FATURAYA EKLE");
        fise_ekle_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        fise_ekle_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fise_ekle_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fise_ekle_btnActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel18.setText("MIKTAR");

        jLabel19.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel19.setText("URUN ID");

        quant_field.setBackground(new java.awt.Color(245, 245, 245));

        jLabel20.setFont(new java.awt.Font("Imprint MT Shadow", 1, 25)); // NOI18N
        jLabel20.setText("MÜSTERI FATURASI");

        BillingTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BillingTable.setFont(new java.awt.Font("UD Digi Kyokasho NP-R", 0, 25)); // NOI18N
        BillingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ürün Adı", "Ürün Miktari", "Ürün Fiyatı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BillingTable.setRowHeight(30);
        BillingTable.setRowMargin(2);
        BillingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillingTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(BillingTable);

        id_field.setBackground(new java.awt.Color(245, 245, 245));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(1204, 263));

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

        jLabel22.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel22.setText("FATURALAR");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oo.png"))); // NOI18N

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pets.png"))); // NOI18N
        jButton4.setPreferredSize(new java.awt.Dimension(130, 80));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pets_btn(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 204, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/users.png"))); // NOI18N
        jButton5.setPreferredSize(new java.awt.Dimension(130, 80));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                users_btn(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer.png"))); // NOI18N
        jButton6.setText(" ");
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
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel22)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(428, 428, 428))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mewo-removebg-preview 1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(257, 757, Short.MAX_VALUE)
                .addComponent(fatura_kaydet_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(fis_print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tc_field, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(fise_ekle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(81, 81, 81)
                                    .addComponent(quant_field, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fis_print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fatura_kaydet_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tc_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quant_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fise_ekle_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    int row = 0;
    private void fise_ekle_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fise_ekle_btnActionPerformed
        if(id_field.getText().isEmpty() || quant_field.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Eksik Bilgi");
        }
        else{
            
            try {
                Con = DriverManager.getConnection("jdbc:mysql://aws.connect.psdb.cloud/petshop-db", "zh00010wu66b7f6ot8bb", "pscale_pw_irQPQskV5VYqpFnOoMs0ObjvFhjOtC8zm60UNwdMAfV");
                Ps1 = (PreparedStatement) Con.prepareStatement("select * from Products where `Urun ID` = ?");
                Ps1.setString(1, id_field.getText());
                Rs = Ps1.executeQuery();
                if(Rs.next()){
                    if(Integer.valueOf(quant_field.getText())>Integer.valueOf(Rs.getString("Urun Miktari"))){
                        JOptionPane.showMessageDialog(this, "Stoktaki miktardan fazla miktar girildi");
                    }
                    else{
                        BillingTable.setValueAt(Rs.getString("Urun Turu"),row,0);
                        BillingTable.setValueAt(quant_field.getText(),row,1);
                        BillingTable.setValueAt( Rs.getString("Urun Fiyati"),row,2);
                        row++;
                    }
                    totalPrice += Integer.valueOf(quant_field.getText())* Integer.valueOf(Rs.getString("Urun Fiyati"));
                }
                else{
                    JOptionPane.showMessageDialog(this, "Yanlıs Urun ID'si");
                }                
            } catch (SQLException ex) {
                Logger.getLogger(billing.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_fise_ekle_btnActionPerformed

    private void fis_print_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fis_print_btnActionPerformed
        // TODO add your handling code here:
        try {
            
            
            
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.20yy    HH:mm");
            String formattedDateTime = now.format(formatter);
            System.out.println(formattedDateTime);
            
            
            
            // Yeni bir PDF belgesi oluştur
            PDDocument document = new PDDocument();

            // Yeni bir sayfa oluştur
            PDPage page = new PDPage(PDRectangle.A4);
            document.addPage(page);

            // Sayfa içeriği için bir PDPageContentStream oluştur
            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            // Font dosyasını yükleyin
            PDType0Font font = PDType0Font.load(document, new File("C:\\Users\\ZEHRABENGÜEMÜL\\Desktop\\fatura"));

            // Metni belgeye ekle
            contentStream.setFont(font, 24);
            contentStream.beginText();
            contentStream.newLineAtOffset(190, 780);
            contentStream.showText("YILDIZ PETSHOP FATURA");
            contentStream.setFont(font, 13);
            contentStream.newLineAtOffset(300,40);
            contentStream.showText(formattedDateTime);
            contentStream.setFont(font, 14);
            contentStream.newLineAtOffset(-400, -80);
            contentStream.showText("Urun Adi");
            contentStream.newLineAtOffset(200, 0);
            contentStream.showText("Adet");
            contentStream.newLineAtOffset(200, 0);
            contentStream.showText("Fiyat");
            contentStream.newLineAtOffset(0, -20);
            for(int i = 0;i<row;i++){
                
                contentStream.newLineAtOffset(-400, -20);
                contentStream.showText(BillingTable.getValueAt(i, 0).toString());
                contentStream.newLineAtOffset(200, 0);
                contentStream.showText(BillingTable.getValueAt(i, 1).toString());
                contentStream.newLineAtOffset(200, 0);
                contentStream.showText(BillingTable.getValueAt(i, 2).toString());
                
            }
            contentStream.endText();

            // İçerik akışını kapat
            contentStream.close();

            // PDF belgesini kaydet
            document.save(new File("MMMOOO.pdf"));

            // PDF belgesini kapat
            document.close();

            System.out.println("PDF dosyası oluşturuldu.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        totalPrice = 0;
        row = 0;
    }//GEN-LAST:event_fis_print_btnActionPerformed

    private void fatura_kaydet_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatura_kaydet_btnActionPerformed
        for(int i = 0; i<row; i++){
            try {
                Con = DriverManager.getConnection("jdbc:mysql://aws.connect.psdb.cloud/petshop-db", "zh00010wu66b7f6ot8bb", "pscale_pw_irQPQskV5VYqpFnOoMs0ObjvFhjOtC8zm60UNwdMAfV");
                Ps1 = (PreparedStatement) Con.prepareStatement("Update Products set `Urun Miktari` = ? where `Urun Turu` = ?");
                Ps2 = Con.prepareStatement("Select * from Products where `Urun Turu` = ?");
                
                Ps2.setString(1, (String) BillingTable.getValueAt(i, 0));
                Rs = Ps2.executeQuery();
                Rs.next();
                quantity = Integer.valueOf(Rs.getString("Urun Miktari")) - Integer.valueOf((String) BillingTable.getValueAt(i, 1));                
                Ps1.setInt(1, quantity);               
                Ps1.setString(2, (String) BillingTable.getValueAt(i, 0));
                Ps1.executeUpdate();                               
            } catch (SQLException ex) {
                Logger.getLogger(billing.class.getName()).log(Level.SEVERE, null, ex);
            }               
        }
        for(int i = 0; i<row; i++){
            for(int j = 0; j<3; j++){
                BillingTable.setValueAt(null, i, j);
            }
        }        
        JOptionPane.showMessageDialog(this,"Faturanız Kaydedildi");
    }//GEN-LAST:event_fatura_kaydet_btnActionPerformed

    private void pets_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pets_btn
        // TODO add your handling code here:
	    dispose();
	    java.awt.EventQueue.invokeLater(() -> {
                try {
                    new pets().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(billing.class.getName()).log(Level.SEVERE, null, ex);
                }
	    });
    }//GEN-LAST:event_pets_btn

    private void users_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_users_btn
        // TODO add your handling code here:
	    dispose();
	    java.awt.EventQueue.invokeLater(() -> {
                try {
                    new users().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(billing.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(billing.class.getName()).log(Level.SEVERE, null, ex);
                }
	    });
    }//GEN-LAST:event_customers_btn

    private void billing_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billing_btn
        // TODO add your handling code here:
    }//GEN-LAST:event_billing_btn

    private void products_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_products_btn
        // TODO add your handling code here:
	    dispose();
	    java.awt.EventQueue.invokeLater(() -> {
                try {
                    new products().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(billing.class.getName()).log(Level.SEVERE, null, ex);
                }
	    });
    }//GEN-LAST:event_products_btn

    private void logout_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btn
        // TODO add your handling code here:
	    dispose();
	    java.awt.EventQueue.invokeLater(() -> {
		new login_page().setVisible(true);
	    });
    }//GEN-LAST:event_logout_btn

    private void BillingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillingTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BillingTableMouseClicked

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
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new billing().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillingTable;
    private javax.swing.JButton fatura_kaydet_btn;
    private javax.swing.JButton fis_print_btn;
    private javax.swing.JButton fise_ekle_btn;
    private javax.swing.JTextField id_field;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name_field;
    private javax.swing.JTextField quant_field;
    private javax.swing.JTextField tc_field;
    // End of variables declaration//GEN-END:variables
}
