package form;

import DataBaseConnection.DataBaseConnection;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frmLogin {
	static String username;
	

	public frmLogin() throws ClassNotFoundException {
		JFrame frame = new JFrame("Login Window");
		JLabel lblUsernamename = new JLabel("Tên đăng nhập:");
		lblUsernamename.setBounds(50, 100, 100, 30);
		JLabel lblPassword = new JLabel("Mật khẩu:");
		lblPassword.setBounds(50, 150, 100, 30);

		JTextField tfUsername = new JTextField();
		tfUsername.setBounds(150, 100, 150, 30);
		// pt: PassText
		JPasswordField ptPassword = new JPasswordField();
		ptPassword.setBounds(150, 150, 150, 30);

		JButton btnLogin = new JButton("Đăng nhập");
		btnLogin.setBounds(100, 200, 100, 30);

		JButton btnRegister = new JButton("Đăng ký");
		btnRegister.setBounds(220, 200, 100, 30);
		
		// Xử lí sự kiện khi click nút Đăng nhập
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				username = tfUsername.getText();
				String password = new String(ptPassword.getPassword());
//				String user_name = "";
				String pass_word = "";
				Connection cnt = null;
				PreparedStatement stm = null;
				try {
					cnt = DataBaseConnection.getConnection();
					if (cnt != null) {
						String sql = "SELECT pass_word FROM tbkhachhang WHERE user_name = ?";
						stm = cnt.prepareStatement(sql);
						stm.setString(1, username);
						ResultSet rs = stm.executeQuery();
						
						// Lấy password tương ứng với username
						while (rs.next()) {
//							user_name = rs.getString("user_name");
							pass_word = rs.getString("pass_word");
						}
					}
					
					// Xử lý nếu username là addmin
					if (username.equals("admin")) {
						if (password.equals(pass_word)) {
							JOptionPane.showMessageDialog(frame, "Đăng nhập thành công");
							frame.setVisible(false);
							
							// Hiển thị form frmAllProductAdmin
							frmAllProductAdmin windowAdmin = new frmAllProductAdmin();
							windowAdmin.setVisible(true);
						} else {
							JOptionPane.showMessageDialog(frame, "Tên đăng nhập hoặc mật khẩu không đúng");
						}
					} else {
						if (password.equals(pass_word)) {
							JOptionPane.showMessageDialog(frame, "Đăng nhập thành công");
							frame.setVisible(false);
							
							// Hiển thị form frmItemClient
							frmItemClient windowClient = new frmItemClient();
							windowClient.setVisible(true);
						} else {
							JOptionPane.showMessageDialog(frame, "Tên đăng nhập hoặc mật khẩu không đúng");
						}
					}
					System.out.println("Username: " + username);
				} catch (ClassNotFoundException ex) {
					Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
				} catch (SQLException ex) {
					Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
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

			}
		});

		// Xử lý sự kiện khi nhấn phím Enter
		btnLogin.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					username = tfUsername.getText();
					String password = new String(ptPassword.getPassword());
					String pass_word = "";
					Connection cnt = null;
					PreparedStatement stm = null;
					try {
						cnt = DataBaseConnection.getConnection();
						if (cnt != null) {
							String sql = "SELECT pass_word FROM tbkhachhang WHERE user_name = ?";
							stm = cnt.prepareStatement(sql);
							stm.setString(1, username);
							ResultSet rs = stm.executeQuery();
							while (rs.next()) {
								pass_word = rs.getString("pass_word");
							}
						}
						if (username.equals("admin")) {
							if (password.equals(pass_word)) {
								JOptionPane.showMessageDialog(frame, "Đăng nhập thành công");
								frame.setVisible(false);
								frmAllProductAdmin windowAdmin = new frmAllProductAdmin();
								windowAdmin.setVisible(true);
							} else {
								JOptionPane.showMessageDialog(frame, "Tên đăng nhập hoặc mật khẩu không đúng");
							}
						} else {
							if (password.equals(pass_word)) {
								JOptionPane.showMessageDialog(frame, "Đăng nhập thành công");
								frame.setVisible(false);
								frmItemClient windowClient = new frmItemClient();
								windowClient.setVisible(true);
							} else {
								JOptionPane.showMessageDialog(frame, "Tên đăng nhập hoặc mật khẩu không đúng");
							}
						}
						System.out.println("Username: " + username);
					} catch (ClassNotFoundException ex) {
						Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
					} catch (SQLException ex) {
						Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
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

				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
//				throw new UnsupportedOperationException("Not supported yet.");
			}

			@Override
			public void keyReleased(KeyEvent e) {

//				throw new UnsupportedOperationException("Not supported yet.");
			}
		});

		// Xử lý sự kiện khi click nút Đăng ký
		btnRegister.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frmRegister windowRegister = new frmRegister();
				windowRegister.setVisible(true);
			}

		});
		// Add components to the frame
		frame.add(lblUsernamename);
		frame.add(lblPassword);
		frame.add(tfUsername);
		frame.add(ptPassword);
		frame.add(btnLogin);
		frame.add(btnRegister);

		// Frame settings
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setVisible(true);
	}
	
	void setUsername(String username) {
		this.username = username;
	}
	
	public static String getUsername() {
		return username;
	}

	public static void main(String[] args) {
//        frmDangNhap login = new frmDangNhap();
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new frmLogin();
				} catch (ClassNotFoundException ex) {
					Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		});
	}
}
