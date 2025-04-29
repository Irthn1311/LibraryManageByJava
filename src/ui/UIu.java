package ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;


public class UIu extends javax.swing.JFrame {
    
    private JButton selectedButton = null;
    public CardLayout card = new CardLayout();
    
    public UIu() {
        initComponents();
        JTableHeader header = tblThongbao.getTableHeader(); 
        header.setFont(new Font("Arial", Font.BOLD, 16));
        ((DefaultTableCellRenderer) header.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        JTableHeader headerSm = tblSachMuon.getTableHeader(); 
        headerSm.setFont(new Font("Arial", Font.BOLD, 16));
        ((DefaultTableCellRenderer) headerSm.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        JTableHeader headerS = tblSach.getTableHeader(); 
        headerS.setFont(new Font("Arial", Font.BOLD, 16));
        ((DefaultTableCellRenderer) headerS.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        pnlContent.setLayout(card);
        pnlContent.add(pnlFormTrangChu, "FormTrangchu");
        pnlContent.add(pnlFormSach, "FormSach");
        pnlContent.add(pnlFormThongBao, "FormThongbao");
        pnlContent.add(pnlFormSachMuon, "FormSachmuon");
        pnlContent.add(FormCaNhan, "FormCanhan");
        tblThongbao.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblThongbao.getColumnModel().getColumn(1).setPreferredWidth(850);
        tblThongbao.getColumnModel().getColumn(2).setPreferredWidth(250);
        tblSachMuon.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblSachMuon.getColumnModel().getColumn(1).setPreferredWidth(500);
        tblSachMuon.getColumnModel().getColumn(2).setPreferredWidth(180);
        tblSachMuon.getColumnModel().getColumn(3).setPreferredWidth(180);
        tblSachMuon.getColumnModel().getColumn(4).setPreferredWidth(120);
        tblSachMuon.getColumnModel().getColumn(5).setPreferredWidth(120);
        tblSach.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblSach.getColumnModel().getColumn(1).setPreferredWidth(650);
        tblSach.getColumnModel().getColumn(2).setPreferredWidth(150);
        tblSach.getColumnModel().getColumn(3).setPreferredWidth(200);
        tblSach.getColumnModel().getColumn(4).setPreferredWidth(100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FormDoconline = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        TenSach = new javax.swing.JLabel();
        TheLoai = new javax.swing.JLabel();
        NgonNgu = new javax.swing.JLabel();
        NXB1 = new javax.swing.JLabel();
        NamXuatBan = new javax.swing.JLabel();
        HinhthucMuon = new javax.swing.JLabel();
        txTenSach = new javax.swing.JLabel();
        txTheLoai = new javax.swing.JLabel();
        txNgonNgu = new javax.swing.JLabel();
        txNXB1 = new javax.swing.JLabel();
        txNamXuatBan = new javax.swing.JLabel();
        txHinhthucMuon = new javax.swing.JLabel();
        Thongtin1 = new javax.swing.JLabel();
        Thongtin2 = new javax.swing.JLabel();
        btnXemPDF = new javax.swing.JButton();
        FormMuonsach = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        Tensach = new javax.swing.JLabel();
        txTensach = new javax.swing.JLabel();
        Theloai = new javax.swing.JLabel();
        txTheloai = new javax.swing.JLabel();
        Ngonngu = new javax.swing.JLabel();
        txNgonngu = new javax.swing.JLabel();
        NXB = new javax.swing.JLabel();
        txNXB = new javax.swing.JLabel();
        NamXB = new javax.swing.JLabel();
        txNamXB = new javax.swing.JLabel();
        Hinhthuc = new javax.swing.JLabel();
        txHinhthuc = new javax.swing.JLabel();
        Giaithich1 = new javax.swing.JLabel();
        Giaithich2 = new javax.swing.JLabel();
        btnDatmuon = new javax.swing.JButton();
        Form = new javax.swing.JLabel();
        ChonNgay1 = new com.toedter.calendar.JDateChooser();
        To = new javax.swing.JLabel();
        ChonNgay2 = new com.toedter.calendar.JDateChooser();
        FormDanhgia = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        Tensach1 = new javax.swing.JLabel();
        txTensach1 = new javax.swing.JLabel();
        Theloai1 = new javax.swing.JLabel();
        txTheloai1 = new javax.swing.JLabel();
        Ngonngu1 = new javax.swing.JLabel();
        txNgonngu1 = new javax.swing.JLabel();
        NXB2 = new javax.swing.JLabel();
        txNXB2 = new javax.swing.JLabel();
        NamXB1 = new javax.swing.JLabel();
        txNamXB1 = new javax.swing.JLabel();
        Hinhthuc1 = new javax.swing.JLabel();
        txHinhthuc1 = new javax.swing.JLabel();
        Danhgia = new javax.swing.JLabel();
        Nhapso = new javax.swing.JTextField();
        btnXacnhanDG = new javax.swing.JButton();
        FormGiahan = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        Tensach2 = new javax.swing.JLabel();
        txTensach2 = new javax.swing.JLabel();
        Theloai2 = new javax.swing.JLabel();
        txTheloai2 = new javax.swing.JLabel();
        Ngonngu2 = new javax.swing.JLabel();
        txNgonngu2 = new javax.swing.JLabel();
        NXB3 = new javax.swing.JLabel();
        txNXB3 = new javax.swing.JLabel();
        NamXB2 = new javax.swing.JLabel();
        txNamXB2 = new javax.swing.JLabel();
        Hinhthuc2 = new javax.swing.JLabel();
        txHinhthuc2 = new javax.swing.JLabel();
        btnXacnhanDG1 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        pnlNavMenu = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btnTrangChu = new javax.swing.JButton();
        btnThongBao = new javax.swing.JButton();
        btnSachMuon = new javax.swing.JButton();
        btnThongTin = new javax.swing.JButton();
        btnSach = new javax.swing.JButton();
        pnlContent = new javax.swing.JPanel();
        pnlFormTrangChu = new javax.swing.JPanel();
        pnlContactInfo = new javax.swing.JPanel();
        lblPhone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblMainImage = new javax.swing.JLabel();
        pnlTimKiemTrangChu = new javax.swing.JPanel();
        lblTimKiemTrangChu = new javax.swing.JLabel();
        cboTimKiemTrangChu = new javax.swing.JComboBox<>();
        txtTimKiemTrangChu = new javax.swing.JTextField();
        btnTimKiemTrangChu = new javax.swing.JButton();
        lblExtraImage = new javax.swing.JLabel();
        pnlFormSach = new javax.swing.JPanel();
        pnlTimKiemSach = new javax.swing.JPanel();
        lblTimKiemSach = new javax.swing.JLabel();
        txtTimKiemSach = new javax.swing.JTextField();
        btnTimKiemSach = new javax.swing.JButton();
        cboTimKiemSach = new javax.swing.JComboBox<>();
        btnChiTietSach = new javax.swing.JButton();
        scrTableSach = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        pnlFormThongBao = new javax.swing.JPanel();
        scrTableThongBao = new javax.swing.JScrollPane();
        tblThongbao = new javax.swing.JTable();
        pnlFormSachMuon = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        scrTablePhieuMuon = new javax.swing.JScrollPane();
        tblSachMuon = new javax.swing.JTable();
        pnlTimKiemSachMuon = new javax.swing.JPanel();
        cboTimKiemSachMuon = new javax.swing.JComboBox<>();
        btnDanhGiaPhieuMuon = new javax.swing.JButton();
        btnGiaHanPhieuMuon = new javax.swing.JButton();
        FormCaNhan = new javax.swing.JPanel();
        lblTenDocGiaCaNhan = new javax.swing.JLabel();
        lblNgaySinhCaNhan = new javax.swing.JLabel();
        lblGioiTinhCaNhan = new javax.swing.JLabel();
        lblSoDienThoaiCaNhan = new javax.swing.JLabel();
        lblDiaChiCaNhan = new javax.swing.JLabel();
        opTenDocGiaCaNhan = new javax.swing.JLabel();
        opNgaySinhCaNhan = new javax.swing.JLabel();
        opGioiTinhCaNhan = new javax.swing.JLabel();
        opSoDienThoaiCaNhan = new javax.swing.JLabel();
        opDiaChiCaNhan = new javax.swing.JLabel();
        lblThongTinCaNhan = new javax.swing.JLabel();
        lblThongTinTheCaNhan = new javax.swing.JLabel();
        lblMaTheCaNhan = new javax.swing.JLabel();
        lblNgayCapTheCaNhan = new javax.swing.JLabel();
        lblNgayHetHanTheCaNhan = new javax.swing.JLabel();
        opNgayHetHanTheCaNhan = new javax.swing.JLabel();
        opNgayCapTheCaNhan = new javax.swing.JLabel();
        opMaTheTheCaNhan = new javax.swing.JLabel();

        FormDoconline.setModal(true);
        FormDoconline.setSize(new java.awt.Dimension(500, 420));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel4.setPreferredSize(new java.awt.Dimension(500, 400));

        TenSach.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        TenSach.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TenSach.setText("Tên sách:");

        TheLoai.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        TheLoai.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TheLoai.setText("Thể loại:");

        NgonNgu.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        NgonNgu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NgonNgu.setText("Ngôn ngữ:");

        NXB1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        NXB1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NXB1.setText("Nhà xuất bản:");

        NamXuatBan.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        NamXuatBan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NamXuatBan.setText("Năm xuất bản:");

        HinhthucMuon.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        HinhthucMuon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        HinhthucMuon.setText("Hình thức mượn:");

        txTenSach.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txTenSach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txTenSach.setText("truy xuất");

        txTheLoai.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txTheLoai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txTheLoai.setText("truy xuất");

        txNgonNgu.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txNgonNgu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txNgonNgu.setText("truy xuất");

        txNXB1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txNXB1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txNXB1.setText("truy xuất");

        txNamXuatBan.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txNamXuatBan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txNamXuatBan.setText("truy xuất");

        txHinhthucMuon.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txHinhthucMuon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txHinhthucMuon.setText("truy xuất");

        Thongtin1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Thongtin1.setText("Bạn có thể tới thư viện để đọc quyển này. ");

        Thongtin2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        Thongtin2.setText("Nếu không tiện, bạn có thể đọc thông qua file pdf");

        btnXemPDF.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btnXemPDF.setText("PDF");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Thongtin2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HinhthucMuon)
                            .addComponent(NamXuatBan)
                            .addComponent(NXB1)
                            .addComponent(NgonNgu)
                            .addComponent(TheLoai)
                            .addComponent(TenSach))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNgonNgu, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNXB1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNamXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txHinhthucMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Thongtin1))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXemPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TenSach)
                    .addComponent(txTenSach))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TheLoai)
                    .addComponent(txTheLoai))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NgonNgu)
                    .addComponent(txNgonNgu))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NXB1)
                    .addComponent(txNXB1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamXuatBan)
                    .addComponent(txNamXuatBan))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HinhthucMuon)
                    .addComponent(txHinhthucMuon))
                .addGap(48, 48, 48)
                .addComponent(Thongtin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Thongtin2)
                .addGap(18, 18, 18)
                .addComponent(btnXemPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout FormDoconlineLayout = new javax.swing.GroupLayout(FormDoconline.getContentPane());
        FormDoconline.getContentPane().setLayout(FormDoconlineLayout);
        FormDoconlineLayout.setHorizontalGroup(
            FormDoconlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(FormDoconlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FormDoconlineLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        FormDoconlineLayout.setVerticalGroup(
            FormDoconlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(FormDoconlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FormDoconlineLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        FormMuonsach.setModal(true);
        FormMuonsach.setSize(new java.awt.Dimension(570, 440));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(550, 400));

        Tensach.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Tensach.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Tensach.setText("Tên sách:");

        txTensach.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txTensach.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txTensach.setText("truy xuất");

        Theloai.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Theloai.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Theloai.setText("Thể loại:");

        txTheloai.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txTheloai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txTheloai.setText("truy xuất");

        Ngonngu.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Ngonngu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Ngonngu.setText("Ngôn ngữ:");

        txNgonngu.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txNgonngu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txNgonngu.setText("truy xuất");

        NXB.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        NXB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NXB.setText("Nhà xuất bản:");

        txNXB.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txNXB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txNXB.setText("truy xuất");

        NamXB.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        NamXB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NamXB.setText("Năm xuất bản:");

        txNamXB.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txNamXB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txNamXB.setText("truy xuất");

        Hinhthuc.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Hinhthuc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Hinhthuc.setText("Hình thức mượn:");

        txHinhthuc.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txHinhthuc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txHinhthuc.setText("truy xuất");

        Giaithich1.setFont(new java.awt.Font("Arial", 2, 13)); // NOI18N
        Giaithich1.setText("Bạn có thể tới thư viện để đọc quyển này. ");

        Giaithich2.setFont(new java.awt.Font("Arial", 2, 13)); // NOI18N
        Giaithich2.setText("Nếu bạn muốn đọc ở nhà, có thể mượn sách");

        btnDatmuon.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btnDatmuon.setText("Đặt mượn");

        Form.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Form.setText("Từ");

        To.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        To.setText("Đến");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDatmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Giaithich2)
                    .addComponent(Giaithich1)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(Form)
                            .addGap(18, 18, 18)
                            .addComponent(ChonNgay1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(65, 65, 65)
                            .addComponent(To)
                            .addGap(18, 18, 18)
                            .addComponent(ChonNgay2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Hinhthuc)
                                .addComponent(NamXB)
                                .addComponent(NXB)
                                .addComponent(Ngonngu)
                                .addComponent(Theloai)
                                .addComponent(Tensach))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txTensach, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txNgonngu, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txHinhthuc, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tensach)
                    .addComponent(txTensach))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Theloai)
                    .addComponent(txTheloai))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ngonngu)
                    .addComponent(txNgonngu))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NXB)
                    .addComponent(txNXB))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamXB)
                    .addComponent(txNamXB))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hinhthuc)
                    .addComponent(txHinhthuc))
                .addGap(32, 32, 32)
                .addComponent(Giaithich1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Giaithich2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(Form))
                        .addComponent(To, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ChonNgay2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ChonNgay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDatmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout FormMuonsachLayout = new javax.swing.GroupLayout(FormMuonsach.getContentPane());
        FormMuonsach.getContentPane().setLayout(FormMuonsachLayout);
        FormMuonsachLayout.setHorizontalGroup(
            FormMuonsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(FormMuonsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FormMuonsachLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        FormMuonsachLayout.setVerticalGroup(
            FormMuonsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(FormMuonsachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(FormMuonsachLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        FormDanhgia.setSize(new java.awt.Dimension(550, 450));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(500, 400));

        Tensach1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Tensach1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Tensach1.setText("Tên sách:");

        txTensach1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txTensach1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txTensach1.setText("truy xuất");

        Theloai1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Theloai1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Theloai1.setText("Thể loại:");

        txTheloai1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txTheloai1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txTheloai1.setText("truy xuất");

        Ngonngu1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Ngonngu1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Ngonngu1.setText("Ngôn ngữ:");

        txNgonngu1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txNgonngu1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txNgonngu1.setText("truy xuất");

        NXB2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        NXB2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NXB2.setText("Nhà xuất bản:");

        txNXB2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txNXB2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txNXB2.setText("truy xuất");

        NamXB1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        NamXB1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NamXB1.setText("Năm xuất bản:");

        txNamXB1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txNamXB1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txNamXB1.setText("truy xuất");

        Hinhthuc1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Hinhthuc1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Hinhthuc1.setText("Hình thức mượn:");

        txHinhthuc1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txHinhthuc1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txHinhthuc1.setText("truy xuất");

        Danhgia.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Danhgia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Danhgia.setText("Đánh giá (1-5):");

        Nhapso.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Nhapso.setForeground(new java.awt.Color(153, 153, 153));
        Nhapso.setText("Nhập số");

        btnXacnhanDG.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btnXacnhanDG.setText("Xác nhận");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Hinhthuc1)
                    .addComponent(NamXB1)
                    .addComponent(NXB2)
                    .addComponent(Ngonngu1)
                    .addComponent(Theloai1)
                    .addComponent(Tensach1)
                    .addComponent(Danhgia))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txTensach1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txTheloai1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNgonngu1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNXB2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNamXB1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txHinhthuc1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Nhapso, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXacnhanDG, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tensach1)
                    .addComponent(txTensach1))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Theloai1)
                    .addComponent(txTheloai1))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ngonngu1)
                    .addComponent(txNgonngu1))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NXB2)
                    .addComponent(txNXB2))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamXB1)
                    .addComponent(txNamXB1))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hinhthuc1)
                    .addComponent(txHinhthuc1))
                .addGap(55, 55, 55)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Danhgia)
                    .addComponent(Nhapso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(btnXacnhanDG, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout FormDanhgiaLayout = new javax.swing.GroupLayout(FormDanhgia.getContentPane());
        FormDanhgia.getContentPane().setLayout(FormDanhgiaLayout);
        FormDanhgiaLayout.setHorizontalGroup(
            FormDanhgiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(FormDanhgiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
        );
        FormDanhgiaLayout.setVerticalGroup(
            FormDanhgiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(FormDanhgiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
        );

        FormGiahan.setSize(new java.awt.Dimension(580, 400));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(550, 450));

        Tensach2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Tensach2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Tensach2.setText("Tên sách:");

        txTensach2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txTensach2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txTensach2.setText("truy xuất");

        Theloai2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Theloai2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Theloai2.setText("Thể loại:");

        txTheloai2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txTheloai2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txTheloai2.setText("truy xuất");

        Ngonngu2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Ngonngu2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Ngonngu2.setText("Ngôn ngữ:");

        txNgonngu2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txNgonngu2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txNgonngu2.setText("truy xuất");

        NXB3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        NXB3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NXB3.setText("Nhà xuất bản:");

        txNXB3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txNXB3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txNXB3.setText("truy xuất");

        NamXB2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        NamXB2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NamXB2.setText("Năm xuất bản:");

        txNamXB2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txNamXB2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txNamXB2.setText("truy xuất");

        Hinhthuc2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        Hinhthuc2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Hinhthuc2.setText("Hình thức mượn:");

        txHinhthuc2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        txHinhthuc2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txHinhthuc2.setText("truy xuất");

        btnXacnhanDG1.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        btnXacnhanDG1.setText("Gia hạn");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("Bạn có thể gia hạn thêm 1 tuần");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(422, Short.MAX_VALUE)
                .addComponent(btnXacnhanDG1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Hinhthuc2)
                        .addComponent(NamXB2)
                        .addComponent(NXB3)
                        .addComponent(Ngonngu2)
                        .addComponent(Theloai2)
                        .addComponent(Tensach2))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txTensach2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txTheloai2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txNgonngu2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txNXB3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txNamXB2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txHinhthuc2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(103, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(269, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(btnXacnhanDG1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tensach2)
                        .addComponent(txTensach2))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Theloai2)
                        .addComponent(txTheloai2))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Ngonngu2)
                        .addComponent(txNgonngu2))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NXB3)
                        .addComponent(txNXB3))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NamXB2)
                        .addComponent(txNamXB2))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Hinhthuc2)
                        .addComponent(txHinhthuc2))
                    .addContainerGap(148, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout FormGiahanLayout = new javax.swing.GroupLayout(FormGiahan.getContentPane());
        FormGiahan.getContentPane().setLayout(FormGiahanLayout);
        FormGiahanLayout.setHorizontalGroup(
            FormGiahanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
            .addGroup(FormGiahanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormGiahanLayout.createSequentialGroup()
                    .addContainerGap(15, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );
        FormGiahanLayout.setVerticalGroup(
            FormGiahanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
            .addGroup(FormGiahanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormGiahanLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel19.setText("jLabel19");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1400, 700));

        pnlMain.setPreferredSize(new java.awt.Dimension(1400, 700));

        pnlNavMenu.setBackground(new java.awt.Color(255, 255, 255));
        pnlNavMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        pnlNavMenu.setPreferredSize(new java.awt.Dimension(1200, 120));

        logo.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo3.png"))); // NOI18N
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnTrangChu.setBackground(new java.awt.Color(238, 242, 240));
        btnTrangChu.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnTrangChu.setText("Trang chủ");
        btnTrangChu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenTrangchu(evt);
            }
        });

        btnThongBao.setBackground(new java.awt.Color(238, 242, 240));
        btnThongBao.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnThongBao.setText("Thông báo");
        btnThongBao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
        btnThongBao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenThongbao(evt);
            }
        });

        btnSachMuon.setBackground(new java.awt.Color(238, 242, 240));
        btnSachMuon.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnSachMuon.setText("Quản lý sách mượn");
        btnSachMuon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
        btnSachMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenSachmuon(evt);
            }
        });

        btnThongTin.setBackground(new java.awt.Color(238, 242, 240));
        btnThongTin.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnThongTin.setText("Thông tin cá nhân");
        btnThongTin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
        btnThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenCanhan(evt);
            }
        });

        btnSach.setBackground(new java.awt.Color(238, 240, 242));
        btnSach.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnSach.setText("Sách");
        btnSach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0), 2));
        btnSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChuyenSach(evt);
            }
        });

        javax.swing.GroupLayout pnlNavMenuLayout = new javax.swing.GroupLayout(pnlNavMenu);
        pnlNavMenu.setLayout(pnlNavMenuLayout);
        pnlNavMenuLayout.setHorizontalGroup(
            pnlNavMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addGap(40, 40, 40)
                .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnSach, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnSachMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNavMenuLayout.setVerticalGroup(
            pnlNavMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavMenuLayout.createSequentialGroup()
                .addGroup(pnlNavMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNavMenuLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(pnlNavMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSachMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSach, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlNavMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnlContent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 3));
        pnlContent.setLayout(new java.awt.CardLayout());

        pnlFormTrangChu.setPreferredSize(new java.awt.Dimension(1200, 553));

        pnlContactInfo.setBackground(new java.awt.Color(0, 122, 77));
        pnlContactInfo.setPreferredSize(new java.awt.Dimension(1200, 60));

        lblPhone.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/phone3.png"))); // NOI18N
        lblPhone.setText("0123.456.789");

        lblEmail.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/email.png"))); // NOI18N
        lblEmail.setText("library.vippro@gmail.com");

        javax.swing.GroupLayout pnlContactInfoLayout = new javax.swing.GroupLayout(pnlContactInfo);
        pnlContactInfo.setLayout(pnlContactInfoLayout);
        pnlContactInfoLayout.setHorizontalGroup(
            pnlContactInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContactInfoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblPhone)
                .addGap(30, 30, 30)
                .addComponent(lblEmail)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContactInfoLayout.setVerticalGroup(
            pnlContactInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContactInfoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlContactInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(lblEmail))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        lblMainImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/poster.png"))); // NOI18N
        lblMainImage.setText("jLabel1");
        lblMainImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        pnlTimKiemTrangChu.setBackground(new java.awt.Color(238, 242, 240));
        pnlTimKiemTrangChu.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 1, 3, 1, new java.awt.Color(0, 122, 77)));

        lblTimKiemTrangChu.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblTimKiemTrangChu.setText("Tìm kiếm");

        cboTimKiemTrangChu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Sách", "Thể loại" }));

        txtTimKiemTrangChu.setFont(new java.awt.Font("Arial", 2, 15)); // NOI18N
        txtTimKiemTrangChu.setText("Nhập từ khóa.....");

        btnTimKiemTrangChu.setBackground(new java.awt.Color(0, 122, 77));
        btnTimKiemTrangChu.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnTimKiemTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiemTrangChu.setText("Tìm kiếm");

        javax.swing.GroupLayout pnlTimKiemTrangChuLayout = new javax.swing.GroupLayout(pnlTimKiemTrangChu);
        pnlTimKiemTrangChu.setLayout(pnlTimKiemTrangChuLayout);
        pnlTimKiemTrangChuLayout.setHorizontalGroup(
            pnlTimKiemTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKiemTrangChuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlTimKiemTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTimKiemTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTimKiemTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnTimKiemTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlTimKiemTrangChuLayout.createSequentialGroup()
                            .addComponent(cboTimKiemTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtTimKiemTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlTimKiemTrangChuLayout.setVerticalGroup(
            pnlTimKiemTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKiemTrangChuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTimKiemTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTimKiemTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboTimKiemTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiemTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTimKiemTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        lblExtraImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/decor.png"))); // NOI18N
        lblExtraImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout pnlFormTrangChuLayout = new javax.swing.GroupLayout(pnlFormTrangChu);
        pnlFormTrangChu.setLayout(pnlFormTrangChuLayout);
        pnlFormTrangChuLayout.setHorizontalGroup(
            pnlFormTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContactInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 1222, Short.MAX_VALUE)
            .addComponent(lblMainImage, javax.swing.GroupLayout.PREFERRED_SIZE, 1218, Short.MAX_VALUE)
            .addGroup(pnlFormTrangChuLayout.createSequentialGroup()
                .addComponent(pnlTimKiemTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblExtraImage))
        );
        pnlFormTrangChuLayout.setVerticalGroup(
            pnlFormTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormTrangChuLayout.createSequentialGroup()
                .addComponent(pnlContactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblMainImage, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(pnlFormTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTimKiemTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblExtraImage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlContent.add(pnlFormTrangChu, "FormTrangchu");

        pnlFormSach.setBackground(new java.awt.Color(255, 255, 255));

        pnlTimKiemSach.setBackground(new java.awt.Color(0, 122, 77));

        lblTimKiemSach.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        lblTimKiemSach.setForeground(new java.awt.Color(255, 255, 255));
        lblTimKiemSach.setText("Tìm kiếm:");

        txtTimKiemSach.setBackground(new java.awt.Color(238, 242, 240));
        txtTimKiemSach.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        btnTimKiemSach.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnTimKiemSach.setForeground(new java.awt.Color(0, 122, 77));
        btnTimKiemSach.setText("Tìm kiếm");
        btnTimKiemSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemSachActionPerformed(evt);
            }
        });

        cboTimKiemSach.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        cboTimKiemSach.setForeground(new java.awt.Color(0, 122, 77));
        cboTimKiemSach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Sách", "Thể loại" }));

        btnChiTietSach.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnChiTietSach.setForeground(new java.awt.Color(0, 122, 77));
        btnChiTietSach.setText("Chi tiết");
        btnChiTietSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChitietSach(evt);
            }
        });

        javax.swing.GroupLayout pnlTimKiemSachLayout = new javax.swing.GroupLayout(pnlTimKiemSach);
        pnlTimKiemSach.setLayout(pnlTimKiemSachLayout);
        pnlTimKiemSachLayout.setHorizontalGroup(
            pnlTimKiemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKiemSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTimKiemSach)
                .addGap(18, 18, 18)
                .addComponent(txtTimKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cboTimKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnTimKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                .addComponent(btnChiTietSach, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTimKiemSachLayout.setVerticalGroup(
            pnlTimKiemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTimKiemSachLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(pnlTimKiemSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTimKiemSach)
                    .addComponent(txtTimKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiemSach)
                    .addComponent(cboTimKiemSach)
                    .addComponent(btnChiTietSach))
                .addGap(9, 9, 9))
        );

        tblSach.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, "Đọc PDF", null},
                {null, null, null, "Mượn về", null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên sách", "Thể loại", "Hình thức đọc", "Số sao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSach.setGridColor(new java.awt.Color(0, 0, 0));
        tblSach.setRowHeight(35);
        tblSach.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblSach.setSelectionForeground(new java.awt.Color(0, 51, 51));
        tblSach.setShowVerticalLines(true);
        scrTableSach.setViewportView(tblSach);

        javax.swing.GroupLayout pnlFormSachLayout = new javax.swing.GroupLayout(pnlFormSach);
        pnlFormSach.setLayout(pnlFormSachLayout);
        pnlFormSachLayout.setHorizontalGroup(
            pnlFormSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTimKiemSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrTableSach)
        );
        pnlFormSachLayout.setVerticalGroup(
            pnlFormSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormSachLayout.createSequentialGroup()
                .addComponent(pnlTimKiemSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrTableSach, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
        );

        pnlContent.add(pnlFormSach, "FormSach");

        pnlFormThongBao.setBackground(new java.awt.Color(255, 255, 255));
        pnlFormThongBao.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        tblThongbao.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        tblThongbao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "STT", "Nội dung", "Ngày gửi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblThongbao.setGridColor(new java.awt.Color(0, 0, 0));
        tblThongbao.setRowHeight(35);
        tblThongbao.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblThongbao.setSelectionForeground(new java.awt.Color(0, 51, 51));
        tblThongbao.setShowVerticalLines(true);
        scrTableThongBao.setViewportView(tblThongbao);

        javax.swing.GroupLayout pnlFormThongBaoLayout = new javax.swing.GroupLayout(pnlFormThongBao);
        pnlFormThongBao.setLayout(pnlFormThongBaoLayout);
        pnlFormThongBaoLayout.setHorizontalGroup(
            pnlFormThongBaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrTableThongBao, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
        );
        pnlFormThongBaoLayout.setVerticalGroup(
            pnlFormThongBaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormThongBaoLayout.createSequentialGroup()
                .addComponent(scrTableThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 383, Short.MAX_VALUE))
        );

        pnlContent.add(pnlFormThongBao, "FormThongbao");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblSachMuon.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        tblSachMuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên sách mượn", "Ngày mượn", "Hạn trả", "Tình trạng", "Đánh giá"
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
        tblSachMuon.setGridColor(new java.awt.Color(0, 0, 0));
        tblSachMuon.setRowHeight(35);
        tblSachMuon.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblSachMuon.setSelectionForeground(new java.awt.Color(0, 51, 51));
        tblSachMuon.setShowVerticalLines(true);
        scrTablePhieuMuon.setViewportView(tblSachMuon);

        pnlTimKiemSachMuon.setBackground(new java.awt.Color(0, 122, 77));

        cboTimKiemSachMuon.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        cboTimKiemSachMuon.setForeground(new java.awt.Color(0, 122, 77));
        cboTimKiemSachMuon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang mượn", "Trễ hạn" }));

        btnDanhGiaPhieuMuon.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnDanhGiaPhieuMuon.setForeground(new java.awt.Color(0, 122, 77));
        btnDanhGiaPhieuMuon.setText("Đánh giá");
        btnDanhGiaPhieuMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhGiaPhieuMuonChitietSach(evt);
            }
        });

        btnGiaHanPhieuMuon.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btnGiaHanPhieuMuon.setForeground(new java.awt.Color(0, 122, 77));
        btnGiaHanPhieuMuon.setText("Gia hạn");
        btnGiaHanPhieuMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GiaodienGiahan(evt);
            }
        });

        javax.swing.GroupLayout pnlTimKiemSachMuonLayout = new javax.swing.GroupLayout(pnlTimKiemSachMuon);
        pnlTimKiemSachMuon.setLayout(pnlTimKiemSachMuonLayout);
        pnlTimKiemSachMuonLayout.setHorizontalGroup(
            pnlTimKiemSachMuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKiemSachMuonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboTimKiemSachMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGiaHanPhieuMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDanhGiaPhieuMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlTimKiemSachMuonLayout.setVerticalGroup(
            pnlTimKiemSachMuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTimKiemSachMuonLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(pnlTimKiemSachMuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTimKiemSachMuon)
                    .addComponent(btnDanhGiaPhieuMuon)
                    .addComponent(btnGiaHanPhieuMuon))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrTablePhieuMuon, javax.swing.GroupLayout.DEFAULT_SIZE, 1218, Short.MAX_VALUE)
            .addComponent(pnlTimKiemSachMuon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(pnlTimKiemSachMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(scrTablePhieuMuon, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFormSachMuonLayout = new javax.swing.GroupLayout(pnlFormSachMuon);
        pnlFormSachMuon.setLayout(pnlFormSachMuonLayout);
        pnlFormSachMuonLayout.setHorizontalGroup(
            pnlFormSachMuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlFormSachMuonLayout.setVerticalGroup(
            pnlFormSachMuonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormSachMuonLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlContent.add(pnlFormSachMuon, "FormSachmuon");

        FormCaNhan.setBackground(new java.awt.Color(255, 255, 255));

        lblTenDocGiaCaNhan.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lblTenDocGiaCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTenDocGiaCaNhan.setText("Tên độc giả:");

        lblNgaySinhCaNhan.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lblNgaySinhCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNgaySinhCaNhan.setText("Ngày sinh:");

        lblGioiTinhCaNhan.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lblGioiTinhCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGioiTinhCaNhan.setText("Giới tính:");

        lblSoDienThoaiCaNhan.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lblSoDienThoaiCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSoDienThoaiCaNhan.setText("Số điện thoại:");

        lblDiaChiCaNhan.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lblDiaChiCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDiaChiCaNhan.setText("Địa chỉ:");

        opTenDocGiaCaNhan.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        opTenDocGiaCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        opTenDocGiaCaNhan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        opNgaySinhCaNhan.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        opNgaySinhCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        opNgaySinhCaNhan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        opGioiTinhCaNhan.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        opGioiTinhCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        opGioiTinhCaNhan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        opSoDienThoaiCaNhan.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        opSoDienThoaiCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        opSoDienThoaiCaNhan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        opDiaChiCaNhan.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        opDiaChiCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        opDiaChiCaNhan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        lblThongTinCaNhan.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lblThongTinCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblThongTinCaNhan.setText("Thông tin cá nhân:");

        lblThongTinTheCaNhan.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        lblThongTinTheCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblThongTinTheCaNhan.setText("Thông tin thẻ:");

        lblMaTheCaNhan.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lblMaTheCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMaTheCaNhan.setText("Mã thẻ:");

        lblNgayCapTheCaNhan.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lblNgayCapTheCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNgayCapTheCaNhan.setText("Ngày cấp:");

        lblNgayHetHanTheCaNhan.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        lblNgayHetHanTheCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNgayHetHanTheCaNhan.setText("Ngày hết hạn:");

        opNgayHetHanTheCaNhan.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        opNgayHetHanTheCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        opNgayHetHanTheCaNhan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        opNgayCapTheCaNhan.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        opNgayCapTheCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        opNgayCapTheCaNhan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        opMaTheTheCaNhan.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        opMaTheTheCaNhan.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        opMaTheTheCaNhan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout FormCaNhanLayout = new javax.swing.GroupLayout(FormCaNhan);
        FormCaNhan.setLayout(FormCaNhanLayout);
        FormCaNhanLayout.setHorizontalGroup(
            FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormCaNhanLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FormCaNhanLayout.createSequentialGroup()
                        .addGroup(FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNgayHetHanTheCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNgayCapTheCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FormCaNhanLayout.createSequentialGroup()
                                .addComponent(lblThongTinTheCaNhan)
                                .addGap(18, 18, 18)
                                .addComponent(lblMaTheCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addGroup(FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opMaTheTheCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opNgayCapTheCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opNgayHetHanTheCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FormCaNhanLayout.createSequentialGroup()
                        .addGroup(FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDiaChiCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSoDienThoaiCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGioiTinhCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNgaySinhCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(FormCaNhanLayout.createSequentialGroup()
                                .addComponent(lblThongTinCaNhan)
                                .addGap(18, 18, 18)
                                .addComponent(lblTenDocGiaCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addGroup(FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opTenDocGiaCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opNgaySinhCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opGioiTinhCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opSoDienThoaiCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opDiaChiCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(484, Short.MAX_VALUE))
        );
        FormCaNhanLayout.setVerticalGroup(
            FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormCaNhanLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormCaNhanLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTenDocGiaCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opTenDocGiaCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblThongTinCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgaySinhCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opNgaySinhCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGioiTinhCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opGioiTinhCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSoDienThoaiCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opSoDienThoaiCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiaChiCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opDiaChiCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormCaNhanLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaTheCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opMaTheTheCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblThongTinTheCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgayCapTheCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opNgayCapTheCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(FormCaNhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgayHetHanTheCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opNgayHetHanTheCaNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pnlContent.add(FormCaNhan, "FormCanhan");

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlNavMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 1228, Short.MAX_VALUE)
                    .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnlNavMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChuyenTrangchu(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenTrangchu
        CardLayout card = (CardLayout) pnlContent.getLayout();
        card.show(pnlContent, "FormTrangchu");
    }//GEN-LAST:event_ChuyenTrangchu

    private void ChuyenSach(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenSach
        CardLayout card = (CardLayout) pnlContent.getLayout();
        card.show(pnlContent, "FormSach");
    }//GEN-LAST:event_ChuyenSach

    private void ChuyenThongbao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenThongbao
        CardLayout card = (CardLayout) pnlContent.getLayout();
        card.show(pnlContent, "FormThongbao");
    }//GEN-LAST:event_ChuyenThongbao

    private void ChuyenSachmuon(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenSachmuon
        CardLayout card = (CardLayout) pnlContent.getLayout();
        card.show(pnlContent, "FormSachmuon");
    }//GEN-LAST:event_ChuyenSachmuon

    private void ChuyenCanhan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChuyenCanhan
        CardLayout card = (CardLayout) pnlContent.getLayout();
        card.show(pnlContent, "FormCanhan");
    }//GEN-LAST:event_ChuyenCanhan

    private void ChitietSach(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChitietSach
        int selectedRow = tblSach.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng trước!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }


        String hinhThuc = tblSach.getValueAt(selectedRow, 3).toString();

        if (hinhThuc.equalsIgnoreCase("Đọc PDF")) {
            FormDoconline.setLocationRelativeTo(null);
            FormDoconline.setVisible(true);
            
        }
        else {
            FormMuonsach.setLocationRelativeTo(null);
            FormMuonsach.setVisible(true);
        }
    }//GEN-LAST:event_ChitietSach

    private void btnDanhGiaPhieuMuonChitietSach(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhGiaPhieuMuonChitietSach
        int selectedRow = tblSachMuon.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng trước!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }


            FormDanhgia.setLocationRelativeTo(null);
            FormDanhgia.setVisible(true);

    }//GEN-LAST:event_btnDanhGiaPhieuMuonChitietSach

    private void GiaodienGiahan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GiaodienGiahan
        int selectedRow = tblSachMuon.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng trước!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            return;
        }


            FormGiahan.setLocationRelativeTo(null);
            FormGiahan.setVisible(true);
    }//GEN-LAST:event_GiaodienGiahan

    private void btnTimKiemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemSachActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(UIu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser ChonNgay1;
    private com.toedter.calendar.JDateChooser ChonNgay2;
    private javax.swing.JLabel Danhgia;
    private javax.swing.JLabel Form;
    private javax.swing.JPanel FormCaNhan;
    private javax.swing.JDialog FormDanhgia;
    private javax.swing.JDialog FormDoconline;
    private javax.swing.JDialog FormGiahan;
    private javax.swing.JDialog FormMuonsach;
    private javax.swing.JLabel Giaithich1;
    private javax.swing.JLabel Giaithich2;
    private javax.swing.JLabel Hinhthuc;
    private javax.swing.JLabel Hinhthuc1;
    private javax.swing.JLabel Hinhthuc2;
    private javax.swing.JLabel HinhthucMuon;
    private javax.swing.JLabel NXB;
    private javax.swing.JLabel NXB1;
    private javax.swing.JLabel NXB2;
    private javax.swing.JLabel NXB3;
    private javax.swing.JLabel NamXB;
    private javax.swing.JLabel NamXB1;
    private javax.swing.JLabel NamXB2;
    private javax.swing.JLabel NamXuatBan;
    private javax.swing.JLabel NgonNgu;
    private javax.swing.JLabel Ngonngu;
    private javax.swing.JLabel Ngonngu1;
    private javax.swing.JLabel Ngonngu2;
    private javax.swing.JTextField Nhapso;
    private javax.swing.JLabel TenSach;
    private javax.swing.JLabel Tensach;
    private javax.swing.JLabel Tensach1;
    private javax.swing.JLabel Tensach2;
    private javax.swing.JLabel TheLoai;
    private javax.swing.JLabel Theloai;
    private javax.swing.JLabel Theloai1;
    private javax.swing.JLabel Theloai2;
    private javax.swing.JLabel Thongtin1;
    private javax.swing.JLabel Thongtin2;
    private javax.swing.JLabel To;
    private javax.swing.JButton btnChiTietSach;
    private javax.swing.JButton btnDanhGiaPhieuMuon;
    private javax.swing.JButton btnDatmuon;
    private javax.swing.JButton btnGiaHanPhieuMuon;
    private javax.swing.JButton btnSach;
    private javax.swing.JButton btnSachMuon;
    private javax.swing.JButton btnThongBao;
    private javax.swing.JButton btnThongTin;
    private javax.swing.JButton btnTimKiemSach;
    private javax.swing.JButton btnTimKiemTrangChu;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JButton btnXacnhanDG;
    private javax.swing.JButton btnXacnhanDG1;
    private javax.swing.JButton btnXemPDF;
    private javax.swing.JComboBox<String> cboTimKiemSach;
    private javax.swing.JComboBox<String> cboTimKiemSachMuon;
    private javax.swing.JComboBox<String> cboTimKiemTrangChu;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblDiaChiCaNhan;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblExtraImage;
    private javax.swing.JLabel lblGioiTinhCaNhan;
    private javax.swing.JLabel lblMaTheCaNhan;
    private javax.swing.JLabel lblMainImage;
    private javax.swing.JLabel lblNgayCapTheCaNhan;
    private javax.swing.JLabel lblNgayHetHanTheCaNhan;
    private javax.swing.JLabel lblNgaySinhCaNhan;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSoDienThoaiCaNhan;
    private javax.swing.JLabel lblTenDocGiaCaNhan;
    private javax.swing.JLabel lblThongTinCaNhan;
    private javax.swing.JLabel lblThongTinTheCaNhan;
    private javax.swing.JLabel lblTimKiemSach;
    private javax.swing.JLabel lblTimKiemTrangChu;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel opDiaChiCaNhan;
    private javax.swing.JLabel opGioiTinhCaNhan;
    private javax.swing.JLabel opMaTheTheCaNhan;
    private javax.swing.JLabel opNgayCapTheCaNhan;
    private javax.swing.JLabel opNgayHetHanTheCaNhan;
    private javax.swing.JLabel opNgaySinhCaNhan;
    private javax.swing.JLabel opSoDienThoaiCaNhan;
    private javax.swing.JLabel opTenDocGiaCaNhan;
    private javax.swing.JPanel pnlContactInfo;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlFormSach;
    private javax.swing.JPanel pnlFormSachMuon;
    private javax.swing.JPanel pnlFormThongBao;
    private javax.swing.JPanel pnlFormTrangChu;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlNavMenu;
    private javax.swing.JPanel pnlTimKiemSach;
    private javax.swing.JPanel pnlTimKiemSachMuon;
    private javax.swing.JPanel pnlTimKiemTrangChu;
    private javax.swing.JScrollPane scrTablePhieuMuon;
    private javax.swing.JScrollPane scrTableSach;
    private javax.swing.JScrollPane scrTableThongBao;
    private javax.swing.JTable tblSach;
    private javax.swing.JTable tblSachMuon;
    private javax.swing.JTable tblThongbao;
    private javax.swing.JLabel txHinhthuc;
    private javax.swing.JLabel txHinhthuc1;
    private javax.swing.JLabel txHinhthuc2;
    private javax.swing.JLabel txHinhthucMuon;
    private javax.swing.JLabel txNXB;
    private javax.swing.JLabel txNXB1;
    private javax.swing.JLabel txNXB2;
    private javax.swing.JLabel txNXB3;
    private javax.swing.JLabel txNamXB;
    private javax.swing.JLabel txNamXB1;
    private javax.swing.JLabel txNamXB2;
    private javax.swing.JLabel txNamXuatBan;
    private javax.swing.JLabel txNgonNgu;
    private javax.swing.JLabel txNgonngu;
    private javax.swing.JLabel txNgonngu1;
    private javax.swing.JLabel txNgonngu2;
    private javax.swing.JLabel txTenSach;
    private javax.swing.JLabel txTensach;
    private javax.swing.JLabel txTensach1;
    private javax.swing.JLabel txTensach2;
    private javax.swing.JLabel txTheLoai;
    private javax.swing.JLabel txTheloai;
    private javax.swing.JLabel txTheloai1;
    private javax.swing.JLabel txTheloai2;
    private javax.swing.JTextField txtTimKiemSach;
    private javax.swing.JTextField txtTimKiemTrangChu;
    // End of variables declaration//GEN-END:variables
}
