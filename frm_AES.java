/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tieuhoangphuc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.swing.JOptionPane;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
/**
 *
 * @author NITRO-5
 */
public class frm_AES extends javax.swing.JFrame {
     String user, pass, xacthuc;
        SecretKey secretKey;
        byte[] byteCipherText;
        
            /**
     * Creates new form frm_AES
     */
    public frm_AES() {
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

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_ten = new javax.swing.JTextField();
        txt_matkhau = new javax.swing.JTextField();
        txt_dangky = new javax.swing.JTextField();
        btn_Dangnhap = new javax.swing.JButton();
        btn_dangky = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_plain = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_cip = new javax.swing.JTextArea();
        btn_mahoa = new javax.swing.JButton();
        btn_giaima = new javax.swing.JButton();
        btn_ghi = new javax.swing.JButton();
        btn_mo = new javax.swing.JButton();

        jTextField2.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MẬT MÃ aes");

        btn_Dangnhap.setText("DANG NHAP");
        btn_Dangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DangnhapActionPerformed(evt);
            }
        });

        btn_dangky.setText("dang ky");
        btn_dangky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangkyActionPerformed(evt);
            }
        });

        jLabel2.setText("mã đăng ký");

        jLabel3.setText("mat khau");

        jLabel4.setText("ten");

        txt_plain.setColumns(20);
        txt_plain.setRows(5);
        jScrollPane1.setViewportView(txt_plain);

        jLabel5.setText("plain text");

        jLabel6.setText("Cipher");

        txt_cip.setColumns(20);
        txt_cip.setRows(5);
        jScrollPane2.setViewportView(txt_cip);

        btn_mahoa.setText("ma hoa");
        btn_mahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mahoaActionPerformed(evt);
            }
        });

        btn_giaima.setText("giai ma");
        btn_giaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_giaimaActionPerformed(evt);
            }
        });

        btn_ghi.setText("ghi file");
        btn_ghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ghiActionPerformed(evt);
            }
        });

        btn_mo.setText("mo flie");
        btn_mo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_matkhau)
                                .addComponent(txt_ten)
                                .addComponent(txt_dangky, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Dangnhap)
                                        .addGap(73, 73, 73)
                                        .addComponent(btn_dangky))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btn_mahoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_giaima)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ghi)
                        .addGap(18, 18, 18)
                        .addComponent(btn_mo)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_dangky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_dangky)
                            .addComponent(btn_Dangnhap))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mahoa)
                    .addComponent(btn_giaima)
                    .addComponent(btn_ghi)
                    .addComponent(btn_mo))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dangkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dangkyActionPerformed
        // TODO add your handling code here:
         try {
        String user = txt_ten.getText();
        String pass = txt_matkhau.getText();
        String xacthuc = user + pass;

        BufferedWriter bw = null;
        String fileName = "D:\\AES.txt";
        bw = new BufferedWriter(new FileWriter(fileName));
        bw.write(xacthuc);
        bw.close();

        JOptionPane.showMessageDialog(null, "Bạn đã đăng kí thành công!");
        txt_dangky.setText(xacthuc.getBytes().toString());
    } catch (IOException ex) {  
    }
    }//GEN-LAST:event_btn_dangkyActionPerformed

    private void btn_DangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DangnhapActionPerformed
        // TODO add your handling code here:
        try {
       
        String user = txt_ten.getText();
        String pass = txt_matkhau.getText();
        String xacthuc = user + pass;


        BufferedReader br = null;
        String fileName = "D:\\AES.txt";
        br = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();
        char[] ca = new char[5];
        while (br.ready()) {
            int len = br.read(ca);
            sb.append(ca, 0, len);
        }
        br.close();
        String chuoi = sb.toString();

    
        boolean k = xacthuc.equals(chuoi);
        if (k == true) {
          
            JOptionPane.showMessageDialog(null, "Dang nhap thanh cong!");
        
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            SecretKey secretKey = keyGen.generateKey();
        } else {
        
            JOptionPane.showMessageDialog(null, "Dang nhap that bai");
        }
        txt_dangky.setText(chuoi.getBytes().toString());
    } catch (NoSuchAlgorithmException ex) {
      
    } catch (Exception ex) {
      
    }
    }//GEN-LAST:event_btn_DangnhapActionPerformed

    private void btn_mahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mahoaActionPerformed
        // TODO add your handling code here:                                       
    try {
        if (secretKey == null) {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            secretKey = keyGen.generateKey();
        }

        Cipher aesCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        aesCipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] iv = aesCipher.getIV();

        String strData = txt_plain.getText();
        byte[] byteDataToEncrypt = strData.getBytes();
        byteCipherText = aesCipher.doFinal(byteDataToEncrypt);
        
        String strCipherText = Base64.getEncoder().encodeToString(byteCipherText);
        String strIV = Base64.getEncoder().encodeToString(iv);

        txt_cip.setText(strCipherText + ":" + strIV);
        
    } catch (Exception ex) {
        ex.printStackTrace();
    }


    }//GEN-LAST:event_btn_mahoaActionPerformed

    private void btn_giaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_giaimaActionPerformed
        // TODO add your handling code here:
                                              
    try {
        String cipherTextWithIV = txt_cip.getText();
        String[] parts = cipherTextWithIV.split(":");
        String cipherText = parts[0];
        String strIV = parts[1];
        
        byte[] byteCipherText = Base64.getDecoder().decode(cipherText);
        byte[] iv = Base64.getDecoder().decode(strIV);
        
        Cipher aesCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        aesCipher.init(Cipher.DECRYPT_MODE, secretKey, new IvParameterSpec(iv));

        byte[] byteDecryptedText = aesCipher.doFinal(byteCipherText);
        String strDecryptedText = new String(byteDecryptedText);

        txt_cip.setText(strDecryptedText);
        
    } catch (Exception ex) {
        ex.printStackTrace();
    }

    }//GEN-LAST:event_btn_giaimaActionPerformed

    private void btn_ghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ghiActionPerformed
        // TODO add your handling code here:
        try {
        BufferedWriter bw = null;
        String fileName = "D:\\GhiAES.txt";
        String s = txt_cip.getText();

        bw = new BufferedWriter(new FileWriter(fileName));
        bw.write(s);
        bw.close();

        JOptionPane.showMessageDialog(null, "Da ghi file");
    } catch (IOException ex) {
  
    }
    }//GEN-LAST:event_btn_ghiActionPerformed

    private void btn_moActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moActionPerformed
        // TODO add your handling code here:
         try {
        BufferedReader br = null;
        String fileName = "D:\\GhiAES.txt";
        String s = txt_cip.getText(); 
        br = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();

        JOptionPane.showMessageDialog(null, "Da mo file");

        char[] ca = new char[5];
        while (br.ready()) {
            int len = br.read(ca);
            sb.append(ca, 0, len);
        }

        br.close();
        String chuoi = sb.toString();
        txt_plain.setText(chuoi);
    } catch (IOException ex) {
    
    }
    }//GEN-LAST:event_btn_moActionPerformed

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
            java.util.logging.Logger.getLogger(frm_AES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_AES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_AES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_AES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_AES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Dangnhap;
    private javax.swing.JButton btn_dangky;
    private javax.swing.JButton btn_ghi;
    private javax.swing.JButton btn_giaima;
    private javax.swing.JButton btn_mahoa;
    private javax.swing.JButton btn_mo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea txt_cip;
    private javax.swing.JTextField txt_dangky;
    private javax.swing.JTextField txt_matkhau;
    private javax.swing.JTextArea txt_plain;
    private javax.swing.JTextField txt_ten;
    // End of variables declaration//GEN-END:variables
}
