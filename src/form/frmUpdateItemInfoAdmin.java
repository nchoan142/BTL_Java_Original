package form;

import DataBaseConnection.DataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static form.frmAllProductAdmin.listID;

/**
 *
 * @author NguyenCongHoan
 */
public class frmUpdateItemInfoAdmin extends javax.swing.JFrame {

//	static Vector listID = new Vector();
//	listID = frmAllProductAdmin.listID;
	int id;
	String itemCode = "";
	String itemName = "";
	int itemPrice;
	int itemAmount;
	String itemLinkImage = "";
	
	public frmUpdateItemInfoAdmin() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnChangeInfo = new javax.swing.JButton();
        tfItemCode = new javax.swing.JTextField();
        tfItemName = new javax.swing.JTextField();
        tfItemPrice = new javax.swing.JTextField();
        tfItemAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfItemLinkImage = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("WindowUpdateInfo");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sửa thông tin sản phẩm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jLabel1.setText("Mã sản phẩm:");

        jLabel2.setText("Tên sản phẩm:");

        jLabel3.setText("Đơn giá:");

        jLabel4.setText("Số lượng:");

        btnChangeInfo.setBackground(new java.awt.Color(204, 204, 204));
        btnChangeInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChangeInfo.setText("Sửa thông tin");
        btnChangeInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeInfoActionPerformed(evt);
            }
        });

        tfItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfItemNameActionPerformed(evt);
            }
        });

        tfItemPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfItemPriceActionPerformed(evt);
            }
        });

        tfItemAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfItemAmountActionPerformed(evt);
            }
        });

        jLabel6.setText("Link ảnh:");

        tfItemLinkImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfItemLinkImageActionPerformed(evt);
            }
        });
        tfItemLinkImage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfItemLinkImageKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfItemLinkImage))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfItemAmount))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfItemPrice))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfItemName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnChangeInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfItemAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfItemLinkImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnChangeInfo)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeInfoActionPerformed
        Connection cnt = null;
		PreparedStatement stm = null;
		
		try {
			
			cnt = DataBaseConnection.getConnection();
			String updateSQL1 = "UPDATE tbsanpham SET ma_san_pham = ? WHERE id = ?";
			String updateSQL2 = "UPDATE tbsanpham SET ten_san_pham = ? WHERE id = ?";
			String updateSQL3 = "UPDATE tbsanpham SET gia = ? WHERE id = ?";
			String updateSQL4 = "UPDATE tbsanpham SET so_luong = ? WHERE id = ?";
			String updateSQL5 = "UPDATE tbsanpham SET link_image = ? WHERE id = ?";
			
			
			String itemCode = tfItemCode.getText();
			String itemName = tfItemName.getText();
			String itemPrice = tfItemPrice.getText();
			String itemAmount = tfItemAmount.getText();
			String linkImage = tfItemLinkImage.getText();
			
			if(itemCode.isEmpty() && itemName.isEmpty() && itemPrice.isEmpty() && itemAmount.isEmpty() && linkImage.isEmpty()) {
				JOptionPane.showMessageDialog(this, "Không có dữ liệu");
			} else if (!itemCode.isEmpty() && !itemName.isEmpty() && !itemPrice.isEmpty() && !itemAmount.isEmpty() && !linkImage.isEmpty()) {
				
				JOptionPane.showMessageDialog(this, "Đã sửa thông tin");
				stm = cnt.prepareStatement(updateSQL1);
				stm.setString(1, itemCode);
				stm.setInt(2, id);
				stm.executeUpdate();

				
				stm = cnt.prepareStatement(updateSQL2);
				stm.setString(1, itemName);
				stm.setInt(2, id);
				stm.executeUpdate();

				
				
				stm = cnt.prepareStatement(updateSQL3);
				stm.setInt(1, Integer.parseInt(itemPrice));
				stm.setInt(2, id);
				stm.executeUpdate();

				
				
				stm = cnt.prepareStatement(updateSQL4);
				stm.setInt(1, Integer.parseInt(itemAmount));
				stm.setInt(2, id);
				stm.executeUpdate();

			
				
				stm = cnt.prepareStatement(updateSQL5);
				stm.setString(1, linkImage);
				stm.setInt(2, id);
				stm.executeUpdate();
				
				frmAllProductAdmin.dataTable1.setValueAt(itemCode, frmAllProductAdmin.selectedRow, 0);
				frmAllProductAdmin.dataTable1.setValueAt(itemName, frmAllProductAdmin.selectedRow, 1);
				frmAllProductAdmin.dataTable1.setValueAt(itemPrice, frmAllProductAdmin.selectedRow, 2);
				frmAllProductAdmin.dataTable1.setValueAt(itemAmount, frmAllProductAdmin.selectedRow, 3);
				frmAllProductAdmin.dataTable1.setValueAt(linkImage, frmAllProductAdmin.selectedRow, 4);
			} else {
				if (!itemCode.isEmpty()) {
					JOptionPane.showMessageDialog(this, "Đã sửa thông tin");
					stm = cnt.prepareStatement(updateSQL1);
					stm.setString(1, itemCode);
					stm.setInt(2, id);
					stm.executeUpdate();
					frmAllProductAdmin.dataTable1.setValueAt(itemCode, frmAllProductAdmin.selectedRow, 0);					
				}

				if (!itemName.isEmpty()) {
					JOptionPane.showMessageDialog(this, "Đã sửa thông tin");
					stm = cnt.prepareStatement(updateSQL2);
					stm.setString(1, itemName);
					stm.setInt(2, id);
					stm.executeUpdate();
					frmAllProductAdmin.dataTable1.setValueAt(itemName, frmAllProductAdmin.selectedRow, 1);
				}

				if (!itemPrice.isEmpty()) {
					JOptionPane.showMessageDialog(this, "Đã sửa thông tin");
					stm = cnt.prepareStatement(updateSQL3);
					stm.setInt(1, Integer.parseInt(itemPrice));
					stm.setInt(2, id);
					stm.executeUpdate();
					frmAllProductAdmin.dataTable1.setValueAt(itemPrice, frmAllProductAdmin.selectedRow, 2);
				}

				if (!itemAmount.isEmpty()) {
					JOptionPane.showMessageDialog(this, "Đã sửa thông tin");
					stm = cnt.prepareStatement(updateSQL4);
					stm.setInt(1, Integer.parseInt(itemAmount));
					stm.setInt(2, id);
					stm.executeUpdate();
					frmAllProductAdmin.dataTable1.setValueAt(itemAmount, frmAllProductAdmin.selectedRow, 3);
				}

				if (!linkImage.isEmpty()) {
					JOptionPane.showMessageDialog(this, "Đã sửa thông tin");
					stm = cnt.prepareStatement(updateSQL5);
					stm.setString(1, linkImage);
					stm.setInt(2, id);
					stm.executeUpdate();
					frmAllProductAdmin.dataTable1.setValueAt(linkImage, frmAllProductAdmin.selectedRow, 4);
				}
			}
//			if (!itemCode.isEmpty()) {
//				JOptionPane.showMessageDialog(this, "Đã sửa thông tin");
//				stm = cnt.prepareStatement(updateSQL1);
//				stm.setString(1, itemCode);
//				stm.setInt(2, id);
//				stm.executeUpdate();
//			}
//
//			if (!itemName.isEmpty()) {
//				JOptionPane.showMessageDialog(this, "Đã sửa thông tin");
//				stm = cnt.prepareStatement(updateSQL2);
//				stm.setString(1, itemName);
//				stm.setInt(2, id);
//				stm.executeUpdate();
//
//			}
//
//			if (!itemPrice.isEmpty()) {
//				JOptionPane.showMessageDialog(this, "Đã sửa thông tin");
//				stm = cnt.prepareStatement(updateSQL3);
//				stm.setInt(1, Integer.parseInt(itemPrice));
//				stm.setInt(2, id);
//				stm.executeUpdate();
//
//			}
//
//			if (!itemAmount.isEmpty()) {
//				JOptionPane.showMessageDialog(this, "Đã sửa thông tin");
//				stm = cnt.prepareStatement(updateSQL4);
//				stm.setInt(1, Integer.parseInt(itemAmount));
//				stm.setInt(2, id);
//				stm.executeUpdate();
//
//			}
//
//			if (!linkImage.isEmpty()) {
//				JOptionPane.showMessageDialog(this, "Đã sửa thông tin");
//				stm = cnt.prepareStatement(updateSQL5);
//				stm.setString(1, linkImage);
//				stm.setInt(2, id);
//				stm.executeUpdate();
//
//			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (stm != null) {
					stm.close();
				}

				if (cnt != null) {
					cnt.close();
				}

			} catch (SQLException ex) {
				Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
//		stm = cnt.prepareStatement(updateSQL);
//		for(int i = 0; i < listItem.size(); i++) {
//			int amount = (int)listItem.get(i).get(1);
//			int amountChange = listItemAmount.get(i) - amount;
//			stm.setInt(1, amountChange);
//			stm.setString(2, (String)listItem.get(i).get(0));
//			stm.executeUpdate();
//		}
    }//GEN-LAST:event_btnChangeInfoActionPerformed

    private void tfItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfItemNameActionPerformed

    private void tfItemPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfItemPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfItemPriceActionPerformed

    private void tfItemAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfItemAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfItemAmountActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
		System.out.println("Da mo form");
		System.out.println("user_name: " + frmLogin.username);
		System.out.println("frmAllProductAdmin.listID: " + frmAllProductAdmin.listID);
		System.out.println("frmAllProductAdmin.selectedRow: " + frmAllProductAdmin.selectedRow);
		
		id = (int) frmAllProductAdmin.listID.get(frmAllProductAdmin.selectedRow);
		System.out.println("id: " + id);
    }//GEN-LAST:event_formWindowOpened

    private void tfItemLinkImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfItemLinkImageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfItemLinkImageActionPerformed

    private void tfItemLinkImageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfItemLinkImageKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfItemLinkImageKeyPressed

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
			java.util.logging.Logger.getLogger(frmUpdateItemInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(frmUpdateItemInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(frmUpdateItemInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(frmUpdateItemInfoAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new frmUpdateItemInfoAdmin().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfItemAmount;
    private javax.swing.JTextField tfItemCode;
    private javax.swing.JTextField tfItemLinkImage;
    private javax.swing.JTextField tfItemName;
    private javax.swing.JTextField tfItemPrice;
    // End of variables declaration//GEN-END:variables
}
