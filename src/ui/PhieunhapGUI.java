
package ui;

import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;


public class PhieunhapGUI extends javax.swing.JPanel {


    public PhieunhapGUI() {
        initComponents();
        Giaodien.setLayout(new CardLayout());
        Giaodien.add(Xem, "Xem");
        Giaodien.add(Them, "Them");
        Giaodien.add(Chitiet, "Chitiet");
        JTableHeader header = tbXemPhieunhap.getTableHeader(); 
        header.setFont(new Font("Arial", Font.BOLD, 16));
        ((DefaultTableCellRenderer) header.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        JTableHeader headerT = tbNhaphang.getTableHeader(); 
        headerT.setFont(new Font("Arial", Font.BOLD, 16));
        ((DefaultTableCellRenderer) headerT.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        JTableHeader headerTt = tbThanhtoan.getTableHeader(); 
        headerTt.setFont(new Font("Arial", Font.BOLD, 16));
        ((DefaultTableCellRenderer) headerTt.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        JTableHeader headerCT = tbChitiet.getTableHeader(); 
        headerCT.setFont(new Font("Arial", Font.BOLD, 16));
        ((DefaultTableCellRenderer) headerCT.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tbNhaphang.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        
        tbXemPhieunhap.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbNhaphang.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbNhaphang.getColumnModel().getColumn(1).setPreferredWidth(200);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ThanhChucnang = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Giaodien = new javax.swing.JPanel();
        Xem = new javax.swing.JPanel();
        PanTimkiem = new javax.swing.JPanel();
        Timkiem = new javax.swing.JLabel();
        txtTimkiem = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbXemPhieunhap = new javax.swing.JTable();
        Them = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbNhaphang = new javax.swing.JTable();
        btnThemSach = new javax.swing.JButton();
        Nhapsoluong = new javax.swing.JLabel();
        txtSoluong = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbThanhtoan = new javax.swing.JTable();
        btnHuy = new javax.swing.JButton();
        Hinhthucnhap = new javax.swing.JLabel();
        cbHinhthucnhap = new javax.swing.JComboBox<>();
        MaPhieunhap = new javax.swing.JLabel();
        txtMaPhieunhap = new javax.swing.JLabel();
        NhanvienNhap = new javax.swing.JLabel();
        txtNhanvienNhap = new javax.swing.JLabel();
        NguonNhap = new javax.swing.JLabel();
        cbNguonnhap = new javax.swing.JComboBox<>();
        Tongtien = new javax.swing.JLabel();
        Sotien = new javax.swing.JLabel();
        btnNhaphang = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Chitiet = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        MaPhieunhap2 = new javax.swing.JLabel();
        Nhanviennhap2 = new javax.swing.JLabel();
        Nguonnhap = new javax.swing.JLabel();
        ThoigianNhap = new javax.swing.JLabel();
        HinhthucNhap = new javax.swing.JLabel();
        txMaPhieu = new javax.swing.JLabel();
        txNhanvien = new javax.swing.JLabel();
        txHinhthuc = new javax.swing.JLabel();
        txNguonnhap = new javax.swing.JLabel();
        txThoigian = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbChitiet = new javax.swing.JTable();

        jPanel1.setPreferredSize(new java.awt.Dimension(1210, 640));

        ThanhChucnang.setBackground(new java.awt.Color(255, 255, 255));
        ThanhChucnang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));

        jButton4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton4.setText("Xem");
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenXem(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton2.setText("Thêm");
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenThem(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton3.setText("Xóa phiếu");
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Xoa(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jButton1.setText("Chi tiết");
        jButton1.setToolTipText("");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenChitiet(evt);
            }
        });

        javax.swing.GroupLayout ThanhChucnangLayout = new javax.swing.GroupLayout(ThanhChucnang);
        ThanhChucnang.setLayout(ThanhChucnangLayout);
        ThanhChucnangLayout.setHorizontalGroup(
            ThanhChucnangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThanhChucnangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );
        ThanhChucnangLayout.setVerticalGroup(
            ThanhChucnangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThanhChucnangLayout.createSequentialGroup()
                .addGroup(ThanhChucnangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Giaodien.setBackground(new java.awt.Color(255, 255, 255));
        Giaodien.setLayout(new java.awt.CardLayout());

        PanTimkiem.setBackground(new java.awt.Color(0, 122, 77));

        Timkiem.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Timkiem.setForeground(new java.awt.Color(255, 255, 255));
        Timkiem.setText("Tìm kiếm:");

        txtTimkiem.setBackground(new java.awt.Color(238, 242, 240));
        txtTimkiem.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        txtTimkiem.setText("jTextField9");

        btnTimkiem.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnTimkiem.setForeground(new java.awt.Color(0, 122, 77));
        btnTimkiem.setText("Tìm kiếm");

        javax.swing.GroupLayout PanTimkiemLayout = new javax.swing.GroupLayout(PanTimkiem);
        PanTimkiem.setLayout(PanTimkiemLayout);
        PanTimkiemLayout.setHorizontalGroup(
            PanTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanTimkiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Timkiem)
                .addGap(18, 18, 18)
                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(595, Short.MAX_VALUE))
        );
        PanTimkiemLayout.setVerticalGroup(
            PanTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanTimkiemLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(PanTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Timkiem)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem))
                .addGap(10, 10, 10))
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 3, 3, new java.awt.Color(153, 153, 153)));

        tbXemPhieunhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"was", null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã phiếu nhập", "Tên cơ sở", "Loại nhập", "Tổng tiền", "Số lượng sách", "Ngày nhập"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbXemPhieunhap.setGridColor(new java.awt.Color(0, 0, 0));
        tbXemPhieunhap.setRowHeight(35);
        tbXemPhieunhap.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tbXemPhieunhap.setSelectionForeground(new java.awt.Color(0, 51, 51));
        tbXemPhieunhap.setShowVerticalLines(true);
        jScrollPane1.setViewportView(tbXemPhieunhap);

        javax.swing.GroupLayout XemLayout = new javax.swing.GroupLayout(Xem);
        Xem.setLayout(XemLayout);
        XemLayout.setHorizontalGroup(
            XemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanTimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        XemLayout.setVerticalGroup(
            XemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(XemLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(PanTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
        );

        Giaodien.add(Xem, "Xem");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        tbNhaphang.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        tbNhaphang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Xàm", "100"},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Loại sách", "Đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbNhaphang.setGridColor(new java.awt.Color(153, 153, 153));
        tbNhaphang.setRowHeight(35);
        tbNhaphang.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tbNhaphang.setSelectionForeground(new java.awt.Color(0, 51, 51));
        tbNhaphang.setShowVerticalLines(true);
        jScrollPane2.setViewportView(tbNhaphang);

        btnThemSach.setBackground(new java.awt.Color(0, 122, 77));
        btnThemSach.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnThemSach.setForeground(new java.awt.Color(255, 255, 255));
        btnThemSach.setText("Thêm sách");

        Nhapsoluong.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Nhapsoluong.setText("Nhập số lượng:");

        txtSoluong.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtSoluong.setText("jTextField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Nhapsoluong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nhapsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(btnThemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));

        jScrollPane3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        tbThanhtoan.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        tbThanhtoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Xàm", "100", "5", "500"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Loại sách", "Đơn giá", "Số lượng", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbThanhtoan.setGridColor(new java.awt.Color(153, 153, 153));
        tbThanhtoan.setRowHeight(35);
        tbThanhtoan.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tbThanhtoan.setSelectionForeground(new java.awt.Color(0, 51, 51));
        tbThanhtoan.setShowVerticalLines(true);
        jScrollPane3.setViewportView(tbThanhtoan);

        btnHuy.setBackground(new java.awt.Color(204, 0, 51));
        btnHuy.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setText("Hủy thêm");

        Hinhthucnhap.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Hinhthucnhap.setText("Hình thức nhập:");

        cbHinhthucnhap.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        cbHinhthucnhap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mua bán", "Quyên góp/ Hỗ trợ" }));

        MaPhieunhap.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        MaPhieunhap.setText("Mã phiếu nhập:");

        txtMaPhieunhap.setBackground(new java.awt.Color(153, 153, 153));
        txtMaPhieunhap.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txtMaPhieunhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMaPhieunhap.setText("Tự tạo mã phiếu nhập");
        txtMaPhieunhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NhanvienNhap.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        NhanvienNhap.setText("Nhân viên nhập:");

        txtNhanvienNhap.setBackground(new java.awt.Color(153, 153, 153));
        txtNhanvienNhap.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txtNhanvienNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNhanvienNhap.setText("Truy xuất tên tài khoản");
        txtNhanvienNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NguonNhap.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        NguonNhap.setText("Nguồn nhập:");

        cbNguonnhap.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        cbNguonnhap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Truy xuất cơ sở nguồn nhập" }));

        Tongtien.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Tongtien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tongtien.setText("Tổng tiền:");

        Sotien.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        Sotien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sotien.setText("500");

        btnNhaphang.setBackground(new java.awt.Color(0, 122, 77));
        btnNhaphang.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnNhaphang.setForeground(new java.awt.Color(255, 255, 255));
        btnNhaphang.setText("Nhập hàng");

        jSeparator1.setBackground(new java.awt.Color(0, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Hinhthucnhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbHinhthucnhap, 0, 190, Short.MAX_VALUE)
                        .addComponent(MaPhieunhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMaPhieunhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNhanvienNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                        .addComponent(NhanvienNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(NguonNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbNguonnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sotien, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnNhaphang, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Hinhthucnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbHinhthucnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(MaPhieunhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaPhieunhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(NhanvienNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNhanvienNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(NguonNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbNguonnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Sotien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNhaphang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout ThemLayout = new javax.swing.GroupLayout(Them);
        Them.setLayout(ThemLayout);
        ThemLayout.setHorizontalGroup(
            ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThemLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ThemLayout.setVerticalGroup(
            ThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Giaodien.add(Them, "Them");

        Chitiet.setBackground(new java.awt.Color(255, 255, 255));
        Chitiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));

        jPanel4.setBackground(new java.awt.Color(0, 122, 77));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("THÔNG TIN CHI TIẾT PHIẾU NHẬP");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MaPhieunhap2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MaPhieunhap2.setText("Mã phiếu nhập:");

        Nhanviennhap2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Nhanviennhap2.setText("Nhân viên nhập:");

        Nguonnhap.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Nguonnhap.setText("Cơ sở:");

        ThoigianNhap.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ThoigianNhap.setText("Thời gian lập phiếu:");

        HinhthucNhap.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        HinhthucNhap.setText("Hình thức nhập:");

        txMaPhieu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txMaPhieu.setText("Truy xuất mã phiếu");
        txMaPhieu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txNhanvien.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txNhanvien.setText("Truy xuất tên nv nhập");
        txNhanvien.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txHinhthuc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txHinhthuc.setText("Truy xuất hình thức");
        txHinhthuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txNguonnhap.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txNguonnhap.setText("Truy xuất tên cơ sở");
        txNguonnhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txThoigian.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txThoigian.setText("Truy xuất tgian");
        txThoigian.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));

        tbChitiet.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        tbChitiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên sách", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbChitiet.setGridColor(new java.awt.Color(0, 0, 0));
        tbChitiet.setRowHeight(35);
        tbChitiet.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tbChitiet.setSelectionForeground(new java.awt.Color(0, 51, 51));
        tbChitiet.setShowVerticalLines(true);
        jScrollPane4.setViewportView(tbChitiet);

        javax.swing.GroupLayout ChitietLayout = new javax.swing.GroupLayout(Chitiet);
        Chitiet.setLayout(ChitietLayout);
        ChitietLayout.setHorizontalGroup(
            ChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ChitietLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaPhieunhap2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(ChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nhanviennhap2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(ChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HinhthucNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txHinhthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112)
                .addGroup(ChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txNguonnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nguonnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(ChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txThoigian, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(ThoigianNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        ChitietLayout.setVerticalGroup(
            ChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChitietLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaPhieunhap2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nhanviennhap2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThoigianNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HinhthucNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nguonnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ChitietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txHinhthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNguonnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txThoigian, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
        );

        Giaodien.add(Chitiet, "Chitiet");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ThanhChucnang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Giaodien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ThanhChucnang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(Giaodien, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
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

    private void ChuyenXem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenXem
        CardLayout card = (CardLayout) Giaodien.getLayout();
        card.show(Giaodien, "Xem");
    }//GEN-LAST:event_ChuyenXem

    private void ChuyenThem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenThem
        CardLayout card = (CardLayout) Giaodien.getLayout();
        card.show(Giaodien, "Them");
    }//GEN-LAST:event_ChuyenThem

    private void Xoa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Xoa
        CardLayout card = (CardLayout) Giaodien.getLayout();
        card.show(Giaodien, "Xoa");
    }//GEN-LAST:event_Xoa

    private void ChuyenChitiet(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenChitiet
        CardLayout card = (CardLayout) Giaodien.getLayout();
        card.show(Giaodien, "Chitiet");
    }//GEN-LAST:event_ChuyenChitiet

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
            java.util.logging.Logger.getLogger(UIa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Chitiet;
    private javax.swing.JPanel Giaodien;
    private javax.swing.JLabel HinhthucNhap;
    private javax.swing.JLabel Hinhthucnhap;
    private javax.swing.JLabel MaPhieunhap;
    private javax.swing.JLabel MaPhieunhap2;
    private javax.swing.JLabel NguonNhap;
    private javax.swing.JLabel Nguonnhap;
    private javax.swing.JLabel NhanvienNhap;
    private javax.swing.JLabel Nhanviennhap2;
    private javax.swing.JLabel Nhapsoluong;
    private javax.swing.JPanel PanTimkiem;
    private javax.swing.JLabel Sotien;
    private javax.swing.JPanel ThanhChucnang;
    private javax.swing.JPanel Them;
    private javax.swing.JLabel ThoigianNhap;
    private javax.swing.JLabel Timkiem;
    private javax.swing.JLabel Tongtien;
    private javax.swing.JPanel Xem;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnNhaphang;
    private javax.swing.JButton btnThemSach;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JComboBox<String> cbHinhthucnhap;
    private javax.swing.JComboBox<String> cbNguonnhap;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbChitiet;
    private javax.swing.JTable tbNhaphang;
    private javax.swing.JTable tbThanhtoan;
    private javax.swing.JTable tbXemPhieunhap;
    private javax.swing.JLabel txHinhthuc;
    private javax.swing.JLabel txMaPhieu;
    private javax.swing.JLabel txNguonnhap;
    private javax.swing.JLabel txNhanvien;
    private javax.swing.JLabel txThoigian;
    private javax.swing.JLabel txtMaPhieunhap;
    private javax.swing.JLabel txtNhanvienNhap;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}
