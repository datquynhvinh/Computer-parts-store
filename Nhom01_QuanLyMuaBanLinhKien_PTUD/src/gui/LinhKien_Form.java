package gui;

import TableModel.LK_TableModel;
import com.toedter.calendar.JDateChooser;

import BUS.CheckingMethod;
import dao.*;
import entity.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LinhKien_Form extends JPanel {
    JPanel pnNorth,pnCenter1,pnWest1,pnCenter,pnSouth;
    JLabel lblMa,lblTen,lblNgaySX,lblBaoHanh,lblTinhTrang,lblDonViTinh,lblGia,lblLoai,lblMoTa,lblNhaSX,lbImage,lblSoLuong;
    JTextField txtMa,txtTen,txtNhaSX,txtDonViTinh,txtGia,txtMoTa,txtSoLuong,txtTinhTrang;
    JButton btnThem,btnXoa,btnSua,btnLuu,btnThoat,btnSuaAnh;
    ImageIcon icon;
    ImageIcon lk [];
    JComboBox cbcGT,cbcChucVu,cbcBaoHanh,cbcLoai,cbcNhaSX,cbcDonVi;
    JDateChooser ngaySanXuat;
    LinhKien_DAO lkDao;
    LK_TableModel tableModel;
    public LinhKien_Form(){
        doshow();
    }

    private void doshow() {
        this.setLayout(new BorderLayout());
        //pn_North
        pnNorth = new JPanel();
        JPanel pnNorth1 = new JPanel();
        pnNorth.setLayout(new BorderLayout());
        JLabel lblTieuDe = new JLabel("QUẢN LÝ LINH KIỆN");
        lblTieuDe.setFont(new Font("Arial", Font.BOLD, 20));
        lblTieuDe.setForeground(Color.BLUE);
        pnNorth1.add(lblTieuDe);
        pnNorth.add(pnNorth1,BorderLayout.NORTH);


        //pnWest
        pnWest1 = new JPanel();
        JPanel pn1 = new JPanel();
        JPanel pn2 = new JPanel();
        pn1.setLayout(new BorderLayout());
        pn2.setLayout(new BorderLayout());
        pnWest1.setLayout(new BorderLayout());
        JButton btn1 = new JButton("<");
        pn1.add(btn1,BorderLayout.SOUTH);

        JButton btn2 = new JButton(">");
        pn2.add(btn2,BorderLayout.SOUTH);
        pnWest1.setLayout(new BorderLayout());
        pnWest1.setPreferredSize(new Dimension(185,150));
        //pnWest1.setBorder(BorderFactory.createLineBorder(Color.red));
        lbImage = new JLabel();
        btnSuaAnh = new JButton("Chỉnh sửa ảnh");
        btnSuaAnh.setFont(new Font("Arial",Font.ITALIC,13));
        btnSuaAnh.setIcon(new ImageIcon(getClass().getResource("/images_menu/suaAnh.png")));
        btnSuaAnh.setPreferredSize(new Dimension(70,30));
        btnSuaAnh.setVisible(true);

        //File
        final JFileChooser  fileDialog = new JFileChooser();
        JFrame cha = new JFrame();
        btnSuaAnh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnVal = fileDialog.showOpenDialog(cha);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    java.io.File file = fileDialog.getSelectedFile();
//                    statusLabel.setText("File Selected :"
//                            + file.getParent());
                    lbImage.setIcon(new ImageIcon(file.getPath()));
                    System.out.println(file.getPath());
                }
                else{
                }
            }
        });
        icon = new ImageIcon("src\\images_LinhKien\\linhkien11.png");
        lbImage.setPreferredSize(new Dimension(110,145));
        //lbImage.setIcon(new ImageIcon(getClass().getResource("/images/user11.png")));
        lbImage.setIcon(icon);
        pnWest1.add(lbImage,BorderLayout.CENTER);
        pnWest1.add(btnSuaAnh,BorderLayout.SOUTH);
        pnWest1.add(pn1,BorderLayout.WEST);
        pnWest1.add(pn2,BorderLayout.EAST);
        //pnCenter
        pnCenter1 = new JPanel();
        Box b,b1,b2,b3,b4,b5;
        b = Box.createVerticalBox();
        b.setPreferredSize(new Dimension(860,180));

        b.add(b1 = Box.createHorizontalBox());
        b1.add(lblMa = new JLabel("Mã Linh Kiện: "));
        b1.add(txtMa = new JTextField(30));
        b1.add(Box.createHorizontalStrut(20));
        b1.add(lblTen = new JLabel("Tên Linh Kiện:    "));
        b1.add(txtTen = new JTextField(30));
        b.add(Box.createVerticalStrut(10));

        b.add(b2 = Box.createHorizontalBox());
        b2.add(lblBaoHanh = new JLabel("Bảo Hành: "));
        cbcBaoHanh = new JComboBox<>();
        cbcBaoHanh.addItem("6 tháng");
        cbcBaoHanh.addItem("12 tháng");
        cbcBaoHanh.addItem("24 tháng");
        cbcBaoHanh.addItem("36 tháng");
        cbcBaoHanh.setPreferredSize(new Dimension(322,20));
        b2.add(cbcBaoHanh);
        b2.add(Box.createHorizontalStrut(20));
        b2.add(lblNgaySX = new JLabel("Ngày Sản Xuất:    "));
        ngaySanXuat = new JDateChooser();
        //ngaySanXuat.setSize(new Dimension(30,20));
        ngaySanXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ngaySanXuat.setDateFormatString("yyyy-MM-dd");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = Date.valueOf(LocalDate.now());
            System.out.println("Date: " + date);
            ngaySanXuat.setDate(date);
        } catch (Exception e) {
            e.printStackTrace();
        }

        b2.add(ngaySanXuat);
        b.add(Box.createVerticalStrut(10));

        b.add(b3 = Box.createHorizontalBox());
        b3.add(lblTinhTrang = new JLabel("Tình Trạng: "));
        b3.add(txtTinhTrang = new JTextField(30));
//        txtTinhTrang.setText("Mới - FullBox 100%");
        b3.add(Box.createHorizontalStrut(20));
        b3.add(lblLoai = new JLabel("Loại Linh Kiện: "));
        cbcLoai = new JComboBox<>();
        cbcLoai.addItem("Màn hình");
        cbcLoai.addItem("Bàn phím");
        cbcLoai.addItem("Chuột + Lót chuột");
        cbcLoai.addItem("Tai nghe Gaming");
        cbcLoai.addItem("Mainboard - Bo mạch chủ");
        cbcLoai.addItem("CPU - Bộ vi xử lý");
        cbcLoai.addItem("Ram - Bộ nhớ trong");
        cbcLoai.addItem("VGA - Card màn hình");
        cbcLoai.addItem("SSD - Ổ cứng");
        cbcLoai.addItem("PSU - Nguồn máy tính");
        cbcLoai.addItem("CASE - Vỏ máy tính");
        cbcLoai.addItem("Tản nhiệt - Fan RGB");
        cbcLoai.setPreferredSize(new Dimension(325,20));
        b3.add(cbcLoai);
        b.add(Box.createVerticalStrut(10));

        b.add(b4 = Box.createHorizontalBox());
        b4.add(lblDonViTinh = new JLabel("Đơn Vị Tính: "));
        b4.add(txtDonViTinh = new JTextField(30));
        b4.add(Box.createHorizontalStrut(20));
        b4.add(lblGia = new JLabel("Đơn Giá:    "));
        b4.add(txtGia = new JTextField(30));
        b.add(Box.createVerticalStrut(10));

        b.add(b5 = Box.createHorizontalBox());
        b5.add(lblSoLuong = new JLabel("Số Lượng:    "));
        b5.add(txtSoLuong = new JTextField(30));
        b5.add(Box.createHorizontalStrut(20));
        b5.add(lblNhaSX = new JLabel("Nhà Sản Xuất:    "));
        cbcNhaSX = new JComboBox<>();
        cbcNhaSX.addItem("Razer");
        cbcNhaSX.addItem("HyperX");
        cbcNhaSX.addItem("HP");
        cbcNhaSX.addItem("Asus");
        cbcNhaSX.addItem("SamSung");
        cbcNhaSX.addItem("Dell");
        cbcNhaSX.addItem("MSI");
        cbcNhaSX.addItem("AOC");
        cbcNhaSX.addItem("Gigabyte");
        cbcNhaSX.addItem("Lenovo");
        cbcNhaSX.addItem("Logitech");
        cbcNhaSX.addItem("Leopold");
        cbcNhaSX.addItem("Dare - U");
        cbcNhaSX.addItem("Microsoft");
        cbcNhaSX.addItem("Corsair");
        cbcNhaSX.setPreferredSize(new Dimension(322,20));
        b5.add(cbcNhaSX);



        pnCenter1.add(b);
        pnNorth.add(pnWest1,BorderLayout.WEST);
        pnNorth.add(pnCenter1,BorderLayout.CENTER);

        lblBaoHanh.setPreferredSize(lblNgaySX.getPreferredSize());
        lblDonViTinh.setPreferredSize(lblNgaySX.getPreferredSize());
        lblGia.setPreferredSize(lblNgaySX.getPreferredSize());
        lblMa.setPreferredSize(lblNgaySX.getPreferredSize());
        lblTen.setPreferredSize(lblNgaySX.getPreferredSize());
        lblLoai.setPreferredSize(lblNgaySX.getPreferredSize());
        lblNhaSX.setPreferredSize(lblNgaySX.getPreferredSize());
        lblSoLuong.setPreferredSize(lblNgaySX.getPreferredSize());
        lblTinhTrang.setPreferredSize(lblNgaySX.getPreferredSize());

        //Center
        TitledBorder tileDanhSach = new TitledBorder("Danh sách linh kiện");

        //pnSouth.setPreferredSize(new Dimension(1030,60));
        pnCenter = new JPanel();
        pnCenter.setBorder(tileDanhSach);
        lkDao = new LinhKien_DAO();
        tableModel = new LK_TableModel(lkDao.getLS());
        JTable table = new JTable(tableModel);

        //Sự kiện Table
        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int r = table.getSelectedRow();
                if(r != -1){
                    ImageIcon icon;
                    txtMa.setText(table.getValueAt(r,0).toString());
                    txtTen.setText(table.getValueAt(r,1).toString());
                    cbcBaoHanh.setSelectedItem(table.getValueAt(r,2).toString());
                    ngaySanXuat.setDate(Date.valueOf(table.getValueAt(r,3).toString()));
                    txtTinhTrang.setText(table.getValueAt(r,4).toString());
                    txtTinhTrang.setEditable(false);
                    cbcLoai.setSelectedItem(table.getValueAt(r,8).toString());
                    txtDonViTinh.setText(table.getValueAt(r,6).toString());
                    txtGia.setText(table.getValueAt(r,7).toString());
                    txtSoLuong.setText(table.getValueAt(r,5).toString());
                    cbcNhaSX.setSelectedItem(table.getValueAt(r,9).toString());
                    String [] p = table.getValueAt(r,10).toString().trim().split("-");
                    System.out.println(p[0]);
                    System.out.println(p[1]);
                    System.out.println(p[2]);
                    System.out.println(p.length);
//                    System.out.println(p[3]);

                    if(table.getValueAt(r,10).toString().trim().contains("C:\\")){
//                        System.out.println("Chuoi: "+table.getValueAt(r,10).toString().trim());
                         icon = new ImageIcon(table.getValueAt(r,10).toString().trim());
                    }else{
//                        System.out.println("Chuoiq"+p[0]);
                         icon = new javax.swing.ImageIcon(getClass().getResource(p[0]));
                    }

                    lbImage.setIcon(icon);
//                    System.out.println(p.length);

                    btn1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.out.println(icon.getDescription());
                            for(int i = p.length-1; i >= 0; i--){
                                if(lbImage.getIcon().toString().contains(p[i])) {
                                    if (i == 0) {
                                        lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(p[p.length - 1])));
                                    } else {
                                        lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(p[i - 1])));
                                    }
                                    break;
                                }
                            }
                            icon.setDescription(lbImage.getIcon().toString());
//                            System.out.println(lbImage.getIcon().toString());
                        }
                    });
                    btn2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.out.println(icon.toString());
                            for(int i = 0; i < p.length; i++){
                                if(lbImage.getIcon().toString().contains(p[i])) {
                                    if (i != (p.length - 1)) {
                                        lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(p[i + 1])));
//                                        break;
                                    } else {
                                        lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(p[0])));
//                                        break;
                                    }
                                    break;
                                }
                            }
                            icon.setDescription(lbImage.getIcon().toString());
//                            System.out.println(lbImage.getIcon().toString());
                        }
                    });
                    icon.setDescription(lbImage.getIcon().toString());
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        JScrollPane sc = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sc.setPreferredSize(new Dimension(980,210));
        pnCenter.add(sc);
        //South
        TitledBorder tileTacvu = new TitledBorder("Tác vụ");
        pnSouth = new JPanel();
        pnSouth.setBorder(tileTacvu);
        pnSouth.setPreferredSize(new Dimension(1030,70));
        btnThem = new JButton("Thêm Linh Kiện");
        btnThem.setIcon(new ImageIcon(getClass().getResource("/images_menu/them.png")));
        //Su kien Them
        btnThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbImage.setIcon(new ImageIcon("src\\images_LinhKien\\linhkien11.png"));
                btnSuaAnh.setText("Chỉnh sửa ảnh");
                btnSuaAnh.setEnabled(true);
                txtMa.setEnabled(true);
                txtMa.setText("");
                txtTen.setText("");
                txtTinhTrang.setText("Mới - FullBox 100%");
                txtTinhTrang.setEditable(false);
                txtGia.setText("");
                txtDonViTinh.setText("");
                txtSoLuong.setText("");
                txtMa.setEditable(false);
                txtTen.requestFocus();
                btnSua.setEnabled(false);
                btnXoa.setEnabled(false);
            }
        });
        btnXoa = new JButton("Xóa Linh Kiện");
        btnXoa.setIcon(new ImageIcon(getClass().getResource("/images_menu/xoa.png")));
        //Sự kiện xóa
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int r = table.getSelectedRow();
                if(r != -1) {
                    int tb = JOptionPane.showConfirmDialog(null,"Bạn chắc chắn muốn xóa dòng này?","Delete",
                            JOptionPane.YES_NO_OPTION);
                    if(tb == JOptionPane.YES_OPTION) {
                        String maX = tableModel.getValueAt(r, 0).toString();
                        System.out.println(maX);
                        if (lkDao.deleteLK(maX)) {
                            try {
                                clearText();
                                table.setModel(new LK_TableModel(lkDao.getLS()));
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        }
                        clearText();
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Bạn chưa chọn dòng cần xóa!");
                }
            }
        });
        btnSua = new JButton("Sửa TT Linh Kiện");
        btnSua.setIcon(new ImageIcon(getClass().getResource("/images_menu/sua.png")));

        //Su Kien Sua
        btnSua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 if(CheckingMethod.checkTenLK(txtTen.getText().trim())==false){
                     JOptionPane.showMessageDialog(null,"Tên linh kiện không hợp lệ !");
            	 }else	if(CheckingMethod.checkDonvitinh(txtDonViTinh.getText().trim())==false){
                  	JOptionPane.showMessageDialog(null,"Đơn vị tính không hợp lệ !");
                 }else	if(CheckingMethod.checkDongia(txtGia.getText().trim())==false){
                 	JOptionPane.showMessageDialog(null,"Đơn giá không hợp lệ !");
                 }else 	if(CheckingMethod.checkSoluong(txtSoLuong.getText().trim())==false){
                     JOptionPane.showMessageDialog(null,"Số lượng không hợp lệ !");
                 }else {
                String dateTime = (String) formatter.format(ngaySanXuat.getDate());
                btnSuaAnh.setEnabled(true);
                int r = table.getSelectedRow();
                txtMa.setEnabled(false);
                if(r != -1){
                    btnSuaAnh.setText("Chỉnh sửa ảnh");
                    btnSuaAnh.setVisible(true);String maS = tableModel.getValueAt(r, 0).toString();
                    LinhKien lkSua = new LinhKien(maS, txtTen.getText(), cbcBaoHanh.getSelectedItem().toString(), java.sql.Date.valueOf(dateTime),
                            txtTinhTrang.getText(), txtDonViTinh.getText(),Double.parseDouble(txtGia.getText()),Integer.parseInt(txtSoLuong.getText()),
                            icon.getDescription());
                    LoaiLinhKien_DAO loaiLinhKien_dao = new LoaiLinhKien_DAO();
                    NhaSanXuat_DAO nhaSanXuat_dao = new NhaSanXuat_DAO();
                    LoaiLinhKien llk = loaiLinhKien_dao.TimKiemTen(cbcLoai.getSelectedItem().toString());
                    NhaSanXuat nsx = nhaSanXuat_dao.TimKiemTen(cbcNhaSX.getSelectedItem().toString());
                    lkSua.setLoaiLinhKien(llk);lkSua.setNhaSanXuat(nsx);
                    System.out.println(lkSua);
                    if (lkDao.updateLinhKien(maS, lkSua)) {
                        try {
                            clearText();
                            table.setModel(new LK_TableModel(lkDao.getLS()));
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                	}
                 }
            }
        });

        btnLuu = new JButton("Lưu Thông Tin");
        btnLuu.setIcon(new ImageIcon(getClass().getResource("/images_menu/luu.png")));

        //Su kien luu
        btnLuu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 if(CheckingMethod.checkTenLK(txtTen.getText().trim())==false){
                     JOptionPane.showMessageDialog(null,"Tên linh kiện không hợp lệ !");
            	 }else	if(CheckingMethod.checkDonvitinh(txtDonViTinh.getText().trim())==false){
                   	JOptionPane.showMessageDialog(null,"Đơn vị tính không hợp lệ !");
                 }else	if(CheckingMethod.checkDongia(txtGia.getText().trim())==false){
                 	JOptionPane.showMessageDialog(null,"Đơn giá không hợp lệ !");
                 }else 	if(CheckingMethod.checkSoluong(txtSoLuong.getText().trim())==false){
                     JOptionPane.showMessageDialog(null,"Số lượng không hợp lệ !");
                 }else {
                btnSuaAnh.setEnabled(false);
                String dateTime = (String) formatter.format(ngaySanXuat.getDate());
                LinhKien lk = new LinhKien(txtMa.getText().trim(), txtTen.getText().trim(),
                        cbcBaoHanh.getSelectedItem().toString(),
                        java.sql.Date.valueOf(dateTime),
                        txtTinhTrang.getText().trim(),
                        txtDonViTinh.getText().trim(),
                        Double.valueOf(txtGia.getText()),
                        Integer.valueOf(txtSoLuong.getText()),
                        icon.getDescription());
                LoaiLinhKien_DAO llkDao = new LoaiLinhKien_DAO();
                LoaiLinhKien llk;
                NhaSanXuat_DAO nsxDao = new NhaSanXuat_DAO();
                NhaSanXuat nsx;
                if(llkDao.TimKiemTen(cbcLoai.getSelectedItem().toString()) != null) {
                    llk = llkDao.TimKiemTen(cbcLoai.getSelectedItem().toString());
                    lk.setLoaiLinhKien(llk);
                    if(nsxDao.TimKiemTen(cbcNhaSX.getSelectedItem().toString()) != null) {
                    	nsx = nsxDao.TimKiemTen(cbcNhaSX.getSelectedItem().toString());
                    	lk.setNhaSanXuat(nsx);
                    if(lkDao.addLinhKien(lk)) {
                        try {
                            table.setModel(new LK_TableModel(lkDao.getLS()));
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                    
                    } else {
                        JOptionPane.showMessageDialog(null, "Chưa chọn nhà sản xuất");
                    } 
                } else {
                    JOptionPane.showMessageDialog(null, "Chưa chọn loại linh kiện");
                    
                }
                clearText();
                table.setModel(new LK_TableModel(lkDao.getLS()));
                System.out.println(table.getRowCount());

                // tableModel.fireTableDataChanged();

                }
                 }
            
        });
        btnThoat = new JButton("Thoát chức năng");
        btnThoat.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		removeAll();
                LinhKien_Form lk = new LinhKien_Form();
                add(lk);
                validate();
        	}
        });
        btnThoat.setIcon(new ImageIcon(getClass().getResource("/images_menu/thoat.png")));
        pnSouth.add(btnThem);
        pnSouth.add(btnXoa);
        pnSouth.add(btnSua);
        pnSouth.add(btnLuu);
        pnSouth.add(btnThoat);

        this.add(pnNorth,BorderLayout.NORTH);

        this.add(pnCenter,BorderLayout.CENTER);

        this.add(pnSouth,BorderLayout.SOUTH);
    }
    public void clearText(){
        txtMa.setText("");
        txtTen.setText(""); 
        txtTinhTrang.setText("");
        txtGia.setText("");
        txtDonViTinh.setText("");
        txtSoLuong.setText("");
        txtGia.setText("");
        btnSua.setEnabled(true);
        btnXoa.setEnabled(true);
    }
}
