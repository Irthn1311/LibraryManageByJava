
package ui;

import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;


public class PhieumuonGUI extends javax.swing.JPanel {

    /**
     * Creates new form PhieumuonGUI
     */
    public PhieumuonGUI() {
        initComponents();
        Giaodien.setLayout(new CardLayout());
        Giaodien.add(Phieumuon, "Phieumuon");
        Giaodien.add(Traphat, "Traphat");
        JTableHeader header = tbPhieumuon.getTableHeader(); 
        header.setFont(new Font("Arial", Font.BOLD, 16));
        ((DefaultTableCellRenderer) header.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        JTableHeader headerTp = tbTraphat.getTableHeader(); 
        headerTp.setFont(new Font("Arial", Font.BOLD, 16));
        ((DefaultTableCellRenderer) headerTp.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanThongtin = new javax.swing.JPanel();
        MaDG = new javax.swing.JLabel();
        MaSach = new javax.swing.JLabel();
        NgaytraTT = new javax.swing.JLabel();
        txtMaDG = new javax.swing.JTextField();
        Ngaymuon = new javax.swing.JLabel();
        NgaytraDK = new javax.swing.JLabel();
        txtNgaytraDK = new com.toedter.calendar.JDateChooser();
        txtNgaytraTT = new com.toedter.calendar.JDateChooser();
        txtNgaymuon = new com.toedter.calendar.JDateChooser();
        txtMaSach = new javax.swing.JTextField();
        TenDG = new javax.swing.JLabel();
        txtTenDG = new javax.swing.JTextField();
        TenSach = new javax.swing.JLabel();
        txtTenSach = new javax.swing.JTextField();
        btnTrangthai = new javax.swing.JButton();
        btnTraphat = new javax.swing.JButton();
        Giaodien = new javax.swing.JPanel();
        Phieumuon = new javax.swing.JPanel();
        PanTimkiem1 = new javax.swing.JPanel();
        Timkiem = new javax.swing.JLabel();
        txtTimkiem = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        cbLocTrangthai = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPhieumuon = new javax.swing.JTable();
        Traphat = new javax.swing.JPanel();
        PanTimkiem2 = new javax.swing.JPanel();
        Timkiem2 = new javax.swing.JLabel();
        txtTimkiem2 = new javax.swing.JTextField();
        btnTimkiem2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTraphat = new javax.swing.JTable();

        jPanel1.setPreferredSize(new java.awt.Dimension(1210, 640));

        PanThongtin.setBackground(new java.awt.Color(255, 255, 255));
        PanThongtin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));

        MaDG.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MaDG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MaDG.setText("Mã độc giả:");

        MaSach.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MaSach.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MaSach.setText("Mã sách:");

        NgaytraTT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NgaytraTT.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NgaytraTT.setText("Ngày trả thực tế:");

        txtMaDG.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMaDG.setText("jTextField1");

        Ngaymuon.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Ngaymuon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Ngaymuon.setText("Ngày mượn:");

        NgaytraDK.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NgaytraDK.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NgaytraDK.setText("Ngày trả dự kiến:");

        txtMaSach.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMaSach.setText("jTextField1");

        TenDG.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TenDG.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TenDG.setText("Tên độc giả:");

        txtTenDG.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTenDG.setText("jTextField1");

        TenSach.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TenSach.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TenSach.setText("Tên sách:");

        txtTenSach.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTenSach.setText("jTextField1");

        javax.swing.GroupLayout PanThongtinLayout = new javax.swing.GroupLayout(PanThongtin);
        PanThongtin.setLayout(PanThongtinLayout);
        PanThongtinLayout.setHorizontalGroup(
            PanThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanThongtinLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanThongtinLayout.createSequentialGroup()
                        .addGroup(PanThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(MaDG)
                            .addComponent(MaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(PanThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanThongtinLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(TenDG)
                        .addGap(28, 28, 28)
                        .addComponent(txtTenDG, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(PanThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NgaytraTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ngaymuon, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NgaytraDK, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PanThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNgaytraDK, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaytraTT, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaymuon, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        PanThongtinLayout.setVerticalGroup(
            PanThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanThongtinLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanThongtinLayout.createSequentialGroup()
                        .addGroup(PanThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgaymuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ngaymuon, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(PanThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgaytraDK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NgaytraDK, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(PanThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNgaytraTT, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                            .addComponent(NgaytraTT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanThongtinLayout.createSequentialGroup()
                        .addGroup(PanThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaDG))
                        .addGap(20, 20, 20)
                        .addGroup(PanThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TenDG))
                        .addGap(20, 20, 20)
                        .addGroup(PanThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaSach)
                            .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(PanThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TenSach)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnTrangthai.setBackground(new java.awt.Color(255, 255, 204));
        btnTrangthai.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnTrangthai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/load.png"))); // NOI18N
        btnTrangthai.setText("\"Đã trả\"");
        btnTrangthai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTrangthai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTrangthai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenPhieumuon(evt);
            }
        });

        btnTraphat.setBackground(new java.awt.Color(255, 102, 102));
        btnTraphat.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btnTraphat.setText("Tra phạt");
        btnTraphat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTraphat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTraphat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenTraphat(evt);
            }
        });

        Giaodien.setBackground(new java.awt.Color(255, 255, 255));
        Giaodien.setLayout(new java.awt.CardLayout());

        PanTimkiem1.setBackground(new java.awt.Color(0, 122, 77));

        Timkiem.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Timkiem.setForeground(new java.awt.Color(255, 255, 255));
        Timkiem.setText("Tìm kiếm:");

        txtTimkiem.setBackground(new java.awt.Color(238, 242, 240));
        txtTimkiem.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtTimkiem.setText("jTextField9");

        btnTimkiem.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnTimkiem.setForeground(new java.awt.Color(0, 122, 77));
        btnTimkiem.setText("Tìm kiếm");

        cbLocTrangthai.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        cbLocTrangthai.setForeground(new java.awt.Color(0, 122, 77));
        cbLocTrangthai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang mượn", "Đã trả", "Đã quá hạn" }));

        javax.swing.GroupLayout PanTimkiem1Layout = new javax.swing.GroupLayout(PanTimkiem1);
        PanTimkiem1.setLayout(PanTimkiem1Layout);
        PanTimkiem1Layout.setHorizontalGroup(
            PanTimkiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanTimkiem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Timkiem)
                .addGap(18, 18, 18)
                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbLocTrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(458, Short.MAX_VALUE))
        );
        PanTimkiem1Layout.setVerticalGroup(
            PanTimkiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanTimkiem1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanTimkiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanTimkiem1Layout.createSequentialGroup()
                        .addComponent(cbLocTrangthai)
                        .addGap(1, 1, 1))
                    .addGroup(PanTimkiem1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(PanTimkiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Timkiem)
                            .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimkiem))))
                .addGap(10, 10, 10))
        );

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbPhieumuon.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        tbPhieumuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"P01", null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu", "Mã ĐG", "Mã sách", "Ngày mượn", "Hẹn trả dự kiến", "Ngày trả thực tế", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPhieumuon.setGridColor(new java.awt.Color(0, 0, 0));
        tbPhieumuon.setRowHeight(35);
        tbPhieumuon.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tbPhieumuon.setSelectionForeground(new java.awt.Color(0, 51, 51));
        tbPhieumuon.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tbPhieumuon);

        javax.swing.GroupLayout PhieumuonLayout = new javax.swing.GroupLayout(Phieumuon);
        Phieumuon.setLayout(PhieumuonLayout);
        PhieumuonLayout.setHorizontalGroup(
            PhieumuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanTimkiem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        PhieumuonLayout.setVerticalGroup(
            PhieumuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PhieumuonLayout.createSequentialGroup()
                .addComponent(PanTimkiem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        Giaodien.add(Phieumuon, "Phieumuon");

        PanTimkiem2.setBackground(new java.awt.Color(0, 122, 77));

        Timkiem2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Timkiem2.setForeground(new java.awt.Color(255, 255, 255));
        Timkiem2.setText("Tìm kiếm:");

        txtTimkiem2.setBackground(new java.awt.Color(238, 242, 240));
        txtTimkiem2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtTimkiem2.setText("jTextField9");

        btnTimkiem2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnTimkiem2.setForeground(new java.awt.Color(0, 122, 77));
        btnTimkiem2.setText("Tìm kiếm");

        javax.swing.GroupLayout PanTimkiem2Layout = new javax.swing.GroupLayout(PanTimkiem2);
        PanTimkiem2.setLayout(PanTimkiem2Layout);
        PanTimkiem2Layout.setHorizontalGroup(
            PanTimkiem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanTimkiem2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Timkiem2)
                .addGap(18, 18, 18)
                .addComponent(txtTimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(611, Short.MAX_VALUE))
        );
        PanTimkiem2Layout.setVerticalGroup(
            PanTimkiem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanTimkiem2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(PanTimkiem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Timkiem2)
                    .addComponent(txtTimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem2))
                .addGap(10, 10, 10))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbTraphat.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        tbTraphat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"110", "df", "ckaos", "a123", "CNTT", "23", "100000"},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu mượn", "Mã độc giả", "Tên độc giả", "Mã sách", "Tên sách", "Số ngày quá hạn", "Tiền phạt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTraphat.setGridColor(new java.awt.Color(0, 0, 0));
        tbTraphat.setRowHeight(35);
        tbTraphat.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tbTraphat.setSelectionForeground(new java.awt.Color(0, 51, 51));
        tbTraphat.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tbTraphat);

        javax.swing.GroupLayout TraphatLayout = new javax.swing.GroupLayout(Traphat);
        Traphat.setLayout(TraphatLayout);
        TraphatLayout.setHorizontalGroup(
            TraphatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanTimkiem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        TraphatLayout.setVerticalGroup(
            TraphatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TraphatLayout.createSequentialGroup()
                .addComponent(PanTimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        Giaodien.add(Traphat, "Traphat");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Giaodien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PanThongtin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnTrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTraphat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanThongtin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTraphat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(Giaodien, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ChuyenPhieumuon(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenPhieumuon
        CardLayout card = (CardLayout) Giaodien.getLayout();
        card.show(Giaodien, "Phieumuon");
    }//GEN-LAST:event_ChuyenPhieumuon

    private void ChuyenTraphat(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenTraphat
        CardLayout card = (CardLayout) Giaodien.getLayout();
        card.show(Giaodien, "Traphat");
    }//GEN-LAST:event_ChuyenTraphat


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Giaodien;
    private javax.swing.JLabel MaDG;
    private javax.swing.JLabel MaSach;
    private javax.swing.JLabel Ngaymuon;
    private javax.swing.JLabel NgaytraDK;
    private javax.swing.JLabel NgaytraTT;
    private javax.swing.JPanel PanThongtin;
    private javax.swing.JPanel PanTimkiem1;
    private javax.swing.JPanel PanTimkiem2;
    private javax.swing.JPanel Phieumuon;
    private javax.swing.JLabel TenDG;
    private javax.swing.JLabel TenSach;
    private javax.swing.JLabel Timkiem;
    private javax.swing.JLabel Timkiem2;
    private javax.swing.JPanel Traphat;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnTimkiem2;
    private javax.swing.JButton btnTrangthai;
    private javax.swing.JButton btnTraphat;
    private javax.swing.JComboBox<String> cbLocTrangthai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbPhieumuon;
    private javax.swing.JTable tbTraphat;
    private javax.swing.JTextField txtMaDG;
    private javax.swing.JTextField txtMaSach;
    private com.toedter.calendar.JDateChooser txtNgaymuon;
    private com.toedter.calendar.JDateChooser txtNgaytraDK;
    private com.toedter.calendar.JDateChooser txtNgaytraTT;
    private javax.swing.JTextField txtTenDG;
    private javax.swing.JTextField txtTenSach;
    private javax.swing.JTextField txtTimkiem;
    private javax.swing.JTextField txtTimkiem2;
    // End of variables declaration//GEN-END:variables
}
