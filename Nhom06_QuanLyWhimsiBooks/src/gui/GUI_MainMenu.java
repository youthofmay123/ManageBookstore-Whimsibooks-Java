package gui;

import enums.Enum_TabMainMenu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.naming.CompoundName;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

import com.formdev.flatlaf.FlatIntelliJLaf;

import connectDB.ConnectDB;
import utilities.ColorProcessing;
import utilities.WindowTitle;

/**
 *
 * @author duong
 */
public class GUI_MainMenu extends javax.swing.JFrame {
    private int sizeIconBar = 30;
    
    /*
        Phần khai báo các biến
    */
    private TAB_BanHang tabBanHang;
    private TAB_SanPham tabSanPham;
    private TAB_NhaCungCap tabNhaCungCap;
    private TAB_KhuyenMai tabKhuyenMai;
    private Enum_TabMainMenu currentSelectedTab;
    private JButton isFocusTab;
    
    public GUI_MainMenu() {

    	ConnectDB.getInstance().connect();
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        utilities.ImageProcessing.scaleImageFitToLabel(lblLogo, new ImageIcon(this.getClass().getResource("/img/logo/whimsibooks-logo.png")));
        cboUser.setFocusable(false);
        cboUser.enableInputMethods(false);
        cboUser.setPopupVisible(false);
        jPannelSplit.setBorder(null);
        
        // Khởi tạo line chia cắt menu màu xanh.
        //Border pannelBorder =  BorderFactory.createMatteBorder(0, 0, 0, 1, ColorProcessing.rgbColor(15, 102, 165));
        //pannelLeft.setBorder(pannelBorder);
        
        // Khởi instance title
        WindowTitle.getInstance().setJf(this);
        
        // Khởi tạo các tab
        tabBanHang = new TAB_BanHang();
        tabSanPham = new TAB_SanPham();
        tabNhaCungCap = new TAB_NhaCungCap();
        tabKhuyenMai = new TAB_KhuyenMai();
        // Phần xử lý chuyển đổi tab
        currentSelectedTab = Enum_TabMainMenu.KHONG_MO_TAB_NAO;
    }

    /*
        Default test start
    */
    
    public void activateGUITest(){
        tabSwitcher(tabBanHang, Enum_TabMainMenu.BAN_HANG, btnTabBanHang);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jFrame2 = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboUser = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jPannelSplit = new javax.swing.JSplitPane();
        panelRight = new javax.swing.JPanel();
        pannelLeft = new javax.swing.JPanel();
        btnTabBanHang = new javax.swing.JButton();
        btnTabSanPham = new javax.swing.JButton();
        btnTabKhuyenMai = new javax.swing.JButton();
        btnTabThongKe = new javax.swing.JButton();
        btnTabNhanVien = new javax.swing.JButton();
        btnTabKhachHang = new javax.swing.JButton();
        btnTabNhaCungCap = new javax.swing.JButton();
        btnTabDangXuat = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        cboUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboUser.setMaximumRowCount(2);
        cboUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chào, Dương Thái Bảo", "Đăng xuất" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 654, Short.MAX_VALUE)
                .addComponent(cboUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(36, 36, 36))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPannelSplit.setDividerSize(4);
        jPannelSplit.setForeground(new java.awt.Color(255, 255, 255));
        jPannelSplit.setToolTipText("");
        jPannelSplit.setFocusable(false);

        panelRight.setLayout(new java.awt.BorderLayout());
        jPannelSplit.setRightComponent(panelRight);

        java.awt.GridBagLayout jPanel5Layout = new java.awt.GridBagLayout();
        jPanel5Layout.columnWidths = new int[] {0, 23, 0, 23, 0};
        jPanel5Layout.rowHeights = new int[] {0, 16, 0, 16, 0, 16, 0, 16, 0, 16, 0, 16, 0, 16, 0, 16, 0, 16, 0};
        pannelLeft.setLayout(jPanel5Layout);

        btnTabBanHang.setBackground(new java.awt.Color(15, 145, 239));
        btnTabBanHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTabBanHang.setForeground(new java.awt.Color(255, 255, 255));
        btnTabBanHang.setIcon(
            utilities.ImageProcessing.resizeIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/ico-banhang.png"))
                , sizeIconBar, sizeIconBar)
        );
        btnTabBanHang.setText("Bán hàng");
        btnTabBanHang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnTabBanHang.setFocusable(false);
        btnTabBanHang.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnTabBanHang.setIconTextGap(25);
        btnTabBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 0.1;
        pannelLeft.add(btnTabBanHang, gridBagConstraints);

        btnTabSanPham.setBackground(Color.white);
        btnTabSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTabSanPham.setForeground(new java.awt.Color(15, 102, 165));
        btnTabSanPham.setIcon(
            utilities.ImageProcessing.resizeIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon/ico-sanpham.png"))
                , sizeIconBar, sizeIconBar)
        );
        btnTabSanPham.setText("Sản phẩm");
        btnTabSanPham.setToolTipText("");
        btnTabSanPham.setFocusable(false);
        btnTabSanPham.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnTabSanPham.setIconTextGap(25);
        btnTabSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.1;
        pannelLeft.add(btnTabSanPham, gridBagConstraints);

        btnTabKhuyenMai.setBackground(Color.white);
        btnTabKhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTabKhuyenMai.setForeground(new java.awt.Color(15, 102, 165));
        btnTabKhuyenMai.setIcon(
            utilities.ImageProcessing.resizeIcon(new javax.swing.ImageIcon(
                getClass().getResource("/img/icon/ico-khuyenmai.png"))
            , sizeIconBar, sizeIconBar)
    );
    btnTabKhuyenMai.setText("Khuyến mãi");
    btnTabKhuyenMai.setFocusable(false);
    btnTabKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
    btnTabKhuyenMai.setIconTextGap(25);
    btnTabKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnTabActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.ipadx = 39;
    gridBagConstraints.ipady = 7;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
    gridBagConstraints.weightx = 0.1;
    pannelLeft.add(btnTabKhuyenMai, gridBagConstraints);

    btnTabThongKe.setBackground(Color.white);
    btnTabThongKe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    btnTabThongKe.setForeground(new java.awt.Color(15, 102, 165));
    btnTabThongKe.setIcon(utilities.ImageProcessing.resizeIcon(new javax.swing.ImageIcon(
        getClass().getResource("/img/icon/ico-thongke.png"))
    , sizeIconBar, sizeIconBar)
    );
    btnTabThongKe.setText("Thống kê");
    btnTabThongKe.setFocusable(false);
    btnTabThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
    btnTabThongKe.setIconTextGap(25);
    btnTabThongKe.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnTabActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.ipadx = 39;
    gridBagConstraints.ipady = 7;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
    gridBagConstraints.weightx = 0.1;
    pannelLeft.add(btnTabThongKe, gridBagConstraints);

    btnTabNhanVien.setBackground(Color.white);
    btnTabNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    btnTabNhanVien.setForeground(new java.awt.Color(15, 102, 165));
    btnTabNhanVien.setIcon(utilities.ImageProcessing.resizeIcon(new javax.swing.ImageIcon(
        getClass().getResource("/img/icon/ico-nhanvien.png"))  
    , sizeIconBar, sizeIconBar));
    btnTabNhanVien.setText("Nhân viên");
    btnTabNhanVien.setFocusable(false);
    btnTabNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
    btnTabNhanVien.setIconTextGap(25);
    btnTabNhanVien.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnTabActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.ipadx = 39;
    gridBagConstraints.ipady = 7;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
    gridBagConstraints.weightx = 0.1;
    pannelLeft.add(btnTabNhanVien, gridBagConstraints);

    btnTabKhachHang.setBackground(Color.white);
    btnTabKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    btnTabKhachHang.setForeground(new java.awt.Color(15, 102, 165));
    btnTabKhachHang.setIcon(utilities.ImageProcessing.resizeIcon(new javax.swing.ImageIcon(
        getClass().getResource("/img/icon/ico-khachhang.png"))  
    , sizeIconBar, sizeIconBar));
    btnTabKhachHang.setText("Khách hàng");
    btnTabKhachHang.setFocusable(false);
    btnTabKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
    btnTabKhachHang.setIconTextGap(25);
    btnTabKhachHang.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnTabActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.ipadx = 39;
    gridBagConstraints.ipady = 7;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
    gridBagConstraints.weightx = 0.1;
    pannelLeft.add(btnTabKhachHang, gridBagConstraints);

    btnTabNhaCungCap.setBackground(Color.white);
    btnTabNhaCungCap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    btnTabNhaCungCap.setForeground(new java.awt.Color(15, 102, 165));
    btnTabNhaCungCap.setIcon(utilities.ImageProcessing.resizeIcon(new javax.swing.ImageIcon(
        getClass().getResource("/img/icon/ico-nhacungcap.png"))  
    , sizeIconBar, sizeIconBar));
    btnTabNhaCungCap.setText("Nhà cung cấp");
    btnTabNhaCungCap.setFocusable(false);
    btnTabNhaCungCap.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
    btnTabNhaCungCap.setIconTextGap(25);
    btnTabNhaCungCap.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnTabActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.ipadx = 39;
    gridBagConstraints.ipady = 7;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
    gridBagConstraints.weightx = 0.1;
    pannelLeft.add(btnTabNhaCungCap, gridBagConstraints);

    btnTabDangXuat.setBackground(Color.white);
    btnTabDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
    btnTabDangXuat.setForeground(new java.awt.Color(15, 102, 165));
    btnTabDangXuat.setIcon(utilities.ImageProcessing.resizeIcon(new javax.swing.ImageIcon(
        getClass().getResource("/img/icon/btn-logout.png"))
    , sizeIconBar, sizeIconBar));
    btnTabDangXuat.setText("Đăng xuất");
    btnTabDangXuat.setFocusable(false);
    btnTabDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
    btnTabDangXuat.setIconTextGap(25);
    btnTabDangXuat.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnTabActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.ipadx = 39;
    gridBagConstraints.ipady = 7;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
    gridBagConstraints.weightx = 0.4;
    pannelLeft.add(btnTabDangXuat, gridBagConstraints);

    jPannelSplit.setLeftComponent(pannelLeft);

    jPanel6.add(jPannelSplit, java.awt.BorderLayout.CENTER);

    getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTabActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnTabActionPerformed
        // TODO add your handling code here:
    	// Tab bán hàng
       if (evt.getSource().equals(btnTabBanHang)){
    	   tabSwitcher(tabBanHang, Enum_TabMainMenu.BAN_HANG, btnTabBanHang);
    	   return;
       } 
       
       // Tab sản phẩm 
       if (evt.getSource().equals(btnTabSanPham)){
    	   tabSwitcher(tabSanPham, Enum_TabMainMenu.SAN_PHAM, btnTabSanPham);
    	   return;
       }
       // Tab nhà cung cấp
       if (evt.getSource().equals(btnTabNhaCungCap)){
    	   tabSwitcher(tabNhaCungCap, Enum_TabMainMenu.NHA_CUNG_CAP, btnTabNhaCungCap);
    	   return;
       }
       // Tab khuyến mãi
       if (evt.getSource().equals(btnTabKhuyenMai)){
    	   tabSwitcher(tabKhuyenMai, Enum_TabMainMenu.KHUYEN_MAI, btnTabKhuyenMai);
    	   return;
       }

    }//GEN-LAST:event_btnTabActionPerformed

    public void tabSwitcher(JPanel panelChuyen, Enum_TabMainMenu tabMoi, JButton btnTab) {
    	Component oldCom;
		if (currentSelectedTab == tabMoi)
			return;
		
		
		if (panelRight.getComponentCount() > 0) {
			isFocusTab.setBackground(Color.white);
	        btnTabSanPham.setForeground(new java.awt.Color(15, 102, 165));
			isFocusTab.setForeground(new java.awt.Color(15, 102, 165));
			oldCom = panelRight.getComponent(0);
			oldCom.setVisible(false);
			panelRight.remove(oldCom);
		}
		
		isFocusTab = btnTab;
		isFocusTab.setBackground(new java.awt.Color(15, 145, 239));
		isFocusTab.setForeground(new java.awt.Color(255, 255, 255));
		currentSelectedTab = tabMoi;
		panelChuyen.setVisible(true);
		panelRight.add(panelChuyen);
		panelRight.revalidate();
	}
	

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTabBanHang;
    private javax.swing.JButton btnTabDangXuat;
    private javax.swing.JButton btnTabKhachHang;
    private javax.swing.JButton btnTabKhuyenMai;
    private javax.swing.JButton btnTabNhaCungCap;
    private javax.swing.JButton btnTabNhanVien;
    private javax.swing.JButton btnTabSanPham;
    private javax.swing.JButton btnTabThongKe;
    private javax.swing.JComboBox<String> cboUser;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSplitPane jPannelSplit;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel panelRight;
    private javax.swing.JPanel pannelLeft;
    // End of variables declaration//GEN-END:variables
}
