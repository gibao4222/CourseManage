/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import Custom.WrapLayout;
import DTO.CourseDTO;
import BLL.CourseBLL;
import BLL.OnlineCourseBLL;
import BLL.OnSiteCourseBLL;
import Custom.Card;
import Custom.Model_Card;
import DTO.OnSiteCourseDTO;
import DTO.OnlineCourseDTO;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import GUI.GUIMain;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.DefaultComboBoxModel;

public class QuanLyKhoaHocGUI extends javax.swing.JPanel {

    CourseBLL c = new CourseBLL();
    OnlineCourseBLL oc = new OnlineCourseBLL();
    OnSiteCourseBLL osc = new OnSiteCourseBLL();
    DefaultTableModel model;
    ArrayList<OnlineCourseDTO> onlineCourseArray = new ArrayList<>();
    ArrayList<OnSiteCourseDTO> onsiteCourseArray = new ArrayList<>();
    ArrayList<CourseDTO> coursearray = new ArrayList<>();
    /**
     * Creates new form QuanLyKhoaHocGUI
     */
    public QuanLyKhoaHocGUI() throws SQLException{
        initComponents();
        jPanel2.setLayout(new WrapLayout());
        onlineCourseArray = oc.readOnlineCourse();
        onsiteCourseArray = osc.readOnSiteCourse();
        coursearray = c.readCourse();
        load_cbIDCourse();
        cb_KindCourse5.setSelectedIndex(-1);
        cb_IDCourse5.setSelectedIndex(-1);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDialog_OnlineCourse = new javax.swing.JDialog();
        dgoc_txt_IDCourse = new javax.swing.JLabel();
        dgoc_txt_courseName = new javax.swing.JLabel();
        dgoc_txt_credits = new javax.swing.JLabel();
        dgoc_txt_idDepartment = new javax.swing.JLabel();
        dgoc_txt_URL = new javax.swing.JLabel();
        jDialog_OnSiteCourse = new javax.swing.JDialog();
        dgosc_txt_IDCourse = new javax.swing.JLabel();
        dgosc_txt_courseName = new javax.swing.JLabel();
        dgosc_txt_credits = new javax.swing.JLabel();
        dgosc_txt_idDepartment = new javax.swing.JLabel();
        dgosc_txt_Location = new javax.swing.JLabel();
        dgosc_txt_Time = new javax.swing.JLabel();
        dgosc_txt_Days = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new Custom.PanelRadius();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_Find = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cb_filter = new javax.swing.JComboBox<>();
        rb_OnlineCourse = new javax.swing.JRadioButton();
        rb_OnSiteCourse = new javax.swing.JRadioButton();
        panelRadius2 = new Custom.PanelRadius();
        panelRadius3 = new Custom.PanelRadius();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cb_KindCourse5 = new javax.swing.JComboBox<>();
        cb_IDCourse5 = new javax.swing.JComboBox<>();
        txt_CourseName5 = new javax.swing.JTextField();
        txt_DepartmentID5 = new javax.swing.JTextField();
        txt_Credits5 = new javax.swing.JTextField();
        txt_Location5 = new javax.swing.JTextField();
        txt_Days5 = new javax.swing.JTextField();
        txt_Time_House5 = new javax.swing.JTextField();
        txt_Time_Minute5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_URL5 = new javax.swing.JTextArea();
        btn_Add = new Custom.ButtonRadius();
        btn_Delete = new Custom.ButtonRadius();
        btn_Update = new Custom.ButtonRadius();
        panelRadius1 = new Custom.PanelRadius();
        jLabel18 = new javax.swing.JLabel();

        JDialog_OnlineCourse.setBackground(new java.awt.Color(255, 255, 255));
        JDialog_OnlineCourse.setSize(new Dimension(407,253));

        dgoc_txt_IDCourse.setText("ID Course:");

        dgoc_txt_courseName.setText("Name Course:");

        dgoc_txt_credits.setText("Creadits:");

        dgoc_txt_idDepartment.setText("ID Department:");

        dgoc_txt_URL.setText("URL: ");

        javax.swing.GroupLayout JDialog_OnlineCourseLayout = new javax.swing.GroupLayout(JDialog_OnlineCourse.getContentPane());
        JDialog_OnlineCourse.getContentPane().setLayout(JDialog_OnlineCourseLayout);
        JDialog_OnlineCourseLayout.setHorizontalGroup(
            JDialog_OnlineCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialog_OnlineCourseLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(JDialog_OnlineCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dgoc_txt_URL, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dgoc_txt_idDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JDialog_OnlineCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dgoc_txt_IDCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dgoc_txt_courseName, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
                    .addComponent(dgoc_txt_credits, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        JDialog_OnlineCourseLayout.setVerticalGroup(
            JDialog_OnlineCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JDialog_OnlineCourseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dgoc_txt_IDCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dgoc_txt_courseName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dgoc_txt_credits, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dgoc_txt_idDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dgoc_txt_URL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jDialog_OnSiteCourse.setBackground(new java.awt.Color(255, 255, 255));
        jDialog_OnSiteCourse.setSize(new Dimension(407,340));

        dgosc_txt_IDCourse.setText("ID Course:");

        dgosc_txt_courseName.setText("Name Course:");

        dgosc_txt_credits.setText("Creadits:");

        dgosc_txt_idDepartment.setText("ID Department:");

        dgosc_txt_Location.setText("URL: ");

        dgosc_txt_Time.setText("URL: ");

        dgosc_txt_Days.setText("URL: ");

        javax.swing.GroupLayout jDialog_OnSiteCourseLayout = new javax.swing.GroupLayout(jDialog_OnSiteCourse.getContentPane());
        jDialog_OnSiteCourse.getContentPane().setLayout(jDialog_OnSiteCourseLayout);
        jDialog_OnSiteCourseLayout.setHorizontalGroup(
            jDialog_OnSiteCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_OnSiteCourseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog_OnSiteCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dgosc_txt_Days, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dgosc_txt_Location, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dgosc_txt_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dgosc_txt_idDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialog_OnSiteCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dgosc_txt_IDCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dgosc_txt_courseName, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dgosc_txt_credits, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jDialog_OnSiteCourseLayout.setVerticalGroup(
            jDialog_OnSiteCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog_OnSiteCourseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dgosc_txt_IDCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dgosc_txt_courseName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dgosc_txt_credits, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dgosc_txt_idDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dgosc_txt_Location, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dgosc_txt_Days, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dgosc_txt_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(222, 229, 238));

        jScrollPane1.setBackground(new java.awt.Color(222, 229, 238));
        jScrollPane1.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(222, 229, 238));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel2);

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {

            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setSelectionBackground(new java.awt.Color(102, 153, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        txt_Find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_FindKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_FindKeyTyped(evt);
            }
        });

        jLabel5.setText("Lọc theo:");

        cb_filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã khóa học", "Tên khóa học", "Số tín chỉ", "Mã khoa" }));
        cb_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_filterActionPerformed(evt);
            }
        });
        cb_filter.setSelectedIndex(-1);

        buttonGroup1.add(rb_OnlineCourse);
        rb_OnlineCourse.setText("Online");
        rb_OnlineCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_OnlineCourseActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_OnSiteCourse);
        rb_OnSiteCourse.setText("On Site");
        rb_OnSiteCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_OnSiteCourseActionPerformed(evt);
            }
        });

        panelRadius2.setBackground(new java.awt.Color(255, 255, 255));
        panelRadius2.setRoundBottomLeft(30);
        panelRadius2.setRoundBottomRight(30);
        panelRadius2.setRoundTopLeft(30);
        panelRadius2.setRoundTopRight(30);

        panelRadius3.setBackground(new java.awt.Color(63, 86, 185));
        panelRadius3.setRoundTopLeft(30);
        panelRadius3.setRoundTopRight(30);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Information");

        javax.swing.GroupLayout panelRadius3Layout = new javax.swing.GroupLayout(panelRadius3);
        panelRadius3.setLayout(panelRadius3Layout);
        panelRadius3Layout.setHorizontalGroup(
            panelRadius3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRadius3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
        );
        panelRadius3Layout.setVerticalGroup(
            panelRadius3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadius3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jLabel1.setText("Mã khóa học");

        jLabel2.setText("Các ngày học");

        jLabel3.setText("Thời gian học");

        jLabel4.setText("Vị trí");

        jLabel6.setText("Tên khóa học");

        jLabel7.setText("Số tín chỉ");

        jLabel8.setText("Loại khóa học");

        jLabel9.setText("Mã khoa");

        jLabel10.setText("URL online");

        cb_KindCourse5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "On Site", "Online" }));
        cb_KindCourse5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_KindCourse5ActionPerformed(evt);
            }
        });

        cb_IDCourse5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_IDCourse5ActionPerformed(evt);
            }
        });

        txt_CourseName5.setEnabled(false);

        txt_DepartmentID5.setEnabled(false);

        txt_Credits5.setEnabled(false);

        txt_Location5.setEnabled(false);

        txt_Days5.setEnabled(false);

        txt_Time_House5.setEnabled(false);

        txt_Time_Minute5.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText(":");

        txt_URL5.setColumns(20);
        txt_URL5.setRows(5);
        jScrollPane3.setViewportView(txt_URL5);

        btn_Add.setForeground(new java.awt.Color(255, 255, 255));
        btn_Add.setText("Thêm");
        btn_Add.setBorderColor(new java.awt.Color(0, 255, 204));
        btn_Add.setColor(new java.awt.Color(102, 0, 255));
        btn_Add.setColorClick(new java.awt.Color(51, 0, 153));
        btn_Add.setColorOver(new java.awt.Color(102, 0, 204));
        btn_Add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Add.setRoundBottomLeft(10);
        btn_Add.setRoundBottomRight(10);
        btn_Add.setRoundTopLeft(10);
        btn_Add.setRoundTopRight(10);
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_Delete.setText("Xóa");
        btn_Delete.setBorderColor(new java.awt.Color(0, 255, 204));
        btn_Delete.setColor(new java.awt.Color(102, 0, 255));
        btn_Delete.setColorClick(new java.awt.Color(51, 0, 153));
        btn_Delete.setColorOver(new java.awt.Color(102, 0, 204));
        btn_Delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Delete.setRoundBottomLeft(10);
        btn_Delete.setRoundBottomRight(10);
        btn_Delete.setRoundTopLeft(10);
        btn_Delete.setRoundTopRight(10);
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        btn_Update.setForeground(new java.awt.Color(255, 255, 255));
        btn_Update.setText("Sửa");
        btn_Update.setBorderColor(new java.awt.Color(0, 255, 204));
        btn_Update.setColor(new java.awt.Color(102, 0, 255));
        btn_Update.setColorClick(new java.awt.Color(51, 0, 153));
        btn_Update.setColorOver(new java.awt.Color(102, 0, 204));
        btn_Update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Update.setRoundBottomLeft(10);
        btn_Update.setRoundBottomRight(10);
        btn_Update.setRoundTopLeft(10);
        btn_Update.setRoundTopRight(10);
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRadius2Layout = new javax.swing.GroupLayout(panelRadius2);
        panelRadius2.setLayout(panelRadius2Layout);
        panelRadius2Layout.setHorizontalGroup(
            panelRadius2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadius2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(panelRadius2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cb_IDCourse5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panelRadius2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRadius2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30))
                    .addComponent(txt_CourseName5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRadius2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(txt_Location5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(panelRadius2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRadius2Layout.createSequentialGroup()
                        .addGroup(panelRadius2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_Days5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))
                    .addGroup(panelRadius2Layout.createSequentialGroup()
                        .addGroup(panelRadius2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRadius2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRadius2Layout.createSequentialGroup()
                                .addComponent(txt_Credits5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_DepartmentID5))))
                .addGap(58, 58, 58)
                .addGroup(panelRadius2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cb_KindCourse5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(panelRadius2Layout.createSequentialGroup()
                        .addComponent(txt_Time_House5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Time_Minute5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
            .addGroup(panelRadius2Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRadius2Layout.createSequentialGroup()
                .addComponent(panelRadius3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRadius2Layout.setVerticalGroup(
            panelRadius2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadius2Layout.createSequentialGroup()
                .addGroup(panelRadius2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRadius2Layout.createSequentialGroup()
                        .addComponent(panelRadius3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelRadius2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRadius2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_CourseName5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Location5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRadius2Layout.createSequentialGroup()
                                .addGroup(panelRadius2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_DepartmentID5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(panelRadius2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_Credits5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Days5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRadius2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(8, 8, 8)
                                .addComponent(cb_IDCourse5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelRadius2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)
                        .addComponent(cb_KindCourse5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRadius2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Time_House5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Time_Minute5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addGap(18, 18, 18)
                .addGroup(panelRadius2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        panelRadius1.setBackground(new java.awt.Color(63, 86, 185));
        panelRadius1.setRoundBottomLeft(50);
        panelRadius1.setRoundTopRight(50);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("List Student");

        javax.swing.GroupLayout panelRadius1Layout = new javax.swing.GroupLayout(panelRadius1);
        panelRadius1.setLayout(panelRadius1Layout);
        panelRadius1Layout.setHorizontalGroup(
            panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRadius1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        panelRadius1Layout.setVerticalGroup(
            panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRadius1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(panelRadius1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rb_OnlineCourse)
                                .addGap(80, 80, 80)
                                .addComponent(rb_OnSiteCourse)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelRadius2, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cb_filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)
                        .addComponent(cb_filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelRadius2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_OnSiteCourse)
                            .addComponent(rb_OnlineCourse))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelRadius1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        String department = null;
        int credits = 0;
        if(i>=0){
            for(CourseDTO cc : coursearray)
                if(model.getValueAt(i, 1).equals(cc.getCourseID())){
                    department = cc.getDepartmant();
                    credits=cc.getCreadits();
                }
        }
        if(rb_OnlineCourse.isSelected()){
            cb_IDCourse5.setSelectedItem(model.getValueAt(i, 1).toString());
            txt_CourseName5.setText(model.getValueAt(i, 2).toString());
            txt_DepartmentID5.setText(credits+"");
            txt_Credits5.setText(department);
            cb_KindCourse5.setSelectedItem("Online");
            txt_URL5.setText(String.valueOf(model.getValueAt(i, 3)));
            try {
                jPanel2.removeAll();
                loadListOnlineCourse((int)model.getValueAt(i, 1));
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyKhoaHocGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            cb_IDCourse5.setSelectedItem(model.getValueAt(i, 1).toString());
            txt_CourseName5.setText(model.getValueAt(i, 2).toString());
            txt_DepartmentID5.setText(credits+"");
            txt_Credits5.setText(department);
            cb_KindCourse5.setSelectedItem("On Site");
            txt_Location5.setText(model.getValueAt(i, 3).toString());
            txt_Days5.setText(model.getValueAt(i, 4)+"");
            String str = model.getValueAt(i, 5)+"";
            String[] time = str.split(":");
            txt_Time_House5.setText(time[0]);
            txt_Time_Minute5.setText(time[1]);
            try {
                jPanel2.removeAll();
                loadListOnSiteCourse((int)model.getValueAt(i, 1));
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyKhoaHocGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void rb_OnlineCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_OnlineCourseActionPerformed
        try {
            // TODO add your handling code here:
            listOnlineCourse();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyKhoaHocGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rb_OnlineCourseActionPerformed

    private void rb_OnSiteCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_OnSiteCourseActionPerformed
        try {
            // TODO add your handling code here:
            listOnSiteCourse();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyKhoaHocGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rb_OnSiteCourseActionPerformed

    private void txt_FindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FindKeyReleased
        // TODO add your handling code here:
        
        if(rb_OnlineCourse.isSelected()){
            if(txt_Find.getText().isEmpty()){
                try {
                    listOnlineCourse();
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyKhoaHocGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                try {
                    DefaultTableModel model1 = convertOnlineCourse(oc.findOnlineCourse(cb_filter.getSelectedItem().toString(), txt_Find.getText()));
                    jTable1.setModel(model1);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyKhoaHocGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else{
            if(txt_Find.getText().isEmpty()){
                try {
                    listOnSiteCourse();
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyKhoaHocGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                try {
                    DefaultTableModel model1 = convertOnSiteCourse(osc.findOnSiteCourse(cb_filter.getSelectedItem().toString(), txt_Find.getText()));
                    jTable1.setModel(model1);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyKhoaHocGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_txt_FindKeyReleased

    private void cb_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_filterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_filterActionPerformed

    private void txt_FindKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_FindKeyTyped
        // TODO add your handling code here:
        String value = cb_filter.getSelectedItem().toString();
            switch(value){
                case "Mã khóa học":
                    char c = evt.getKeyChar();
                    if(!Character.isDigit(c))
                        evt.consume();
                    break;
                case "Số tín chỉ":
                    char d = evt.getKeyChar();
                    if(!Character.isDigit(d))
                        evt.consume();
                    break;
            }
    }//GEN-LAST:event_txt_FindKeyTyped

    private void cb_IDCourse5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_IDCourse5ActionPerformed
        // TODO add your handling code here:
        if(cb_IDCourse5.getSelectedIndex()==-1){
            txt_CourseName5.setText("");
            txt_Credits5.setText("");
            txt_DepartmentID5.setText("");
        }
        else{
            for(CourseDTO s : coursearray){
                if(s.getCourseID() == Integer.parseInt(cb_IDCourse5.getSelectedItem().toString())){
                    txt_CourseName5.setText(s.getTitle());
                    txt_Credits5.setText(s.getCreadits()+"");
                    txt_DepartmentID5.setText(s.getDepartmant());
                }
            }
        }

    }//GEN-LAST:event_cb_IDCourse5ActionPerformed

    private void cb_KindCourse5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_KindCourse5ActionPerformed
        // TODO add your handling code here:
        Object kindCourse;
        if(cb_KindCourse5.getSelectedIndex()==-1)
        kindCourse="";
        else
        kindCourse = cb_KindCourse5.getSelectedItem();
        checkKindCourse(kindCourse);

    }//GEN-LAST:event_cb_KindCourse5ActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code here:
        if(cb_KindCourse5.getSelectedIndex()==1){
            OnlineCourseDTO onlineCourse = new OnlineCourseDTO();
            onlineCourse.setCourseID(Integer.parseInt(cb_IDCourse5.getSelectedItem().toString()));
            onlineCourse.setUrl(txt_URL5.getText());
            try {
                if(oc.updateOnlineCourse(onlineCourse)==0){
                    JOptionPane.showMessageDialog(this, "Update failed");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Update success");
                    listOnlineCourse();
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyKhoaHocGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            OnSiteCourseDTO onSiteCourse = new OnSiteCourseDTO();
            onSiteCourse.setCourseID(Integer.parseInt(cb_IDCourse5.getSelectedItem().toString()));
            onSiteCourse.setLocation(txt_Location5.getText());
            onSiteCourse.setDays(txt_Days5.getText());
            Time time = new Time(Integer.parseInt(txt_Time_House5.getText()),Integer.parseInt(txt_Time_Minute5.getText()),0);
            onSiteCourse.setTime(time);
            try {
                if(osc.updateOnSiteCourse(onSiteCourse)==0){
                    JOptionPane.showMessageDialog(this, "Update failed");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Update success");
                    listOnSiteCourse();
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyKhoaHocGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                                        

    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        // TODO add your handling code here:
        if(cb_KindCourse5.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(this, "Vui long chon loai khoa hoc!");
        }
        else if(cb_KindCourse5.getSelectedIndex()==1){
            OnlineCourseDTO s = new OnlineCourseDTO();
            s.setCourseID(Integer.parseInt(cb_IDCourse5.getSelectedItem().toString()));
            s.setTitle(txt_CourseName5.getText());
            s.setUrl(txt_URL5.getText());
            try {
                if(oc.insertOnlineCourse(s)==0)
                JOptionPane.showMessageDialog(this, "Add failed");
                else{
                    JOptionPane.showMessageDialog(this, "Add success");
                    listOnlineCourse();
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyKhoaHocGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            OnSiteCourseDTO s = new OnSiteCourseDTO();
            s.setCourseID(Integer.parseInt(cb_IDCourse5.getSelectedItem().toString()));
            s.setTitle(txt_CourseName5.getText());
            s.setLocation(txt_Location5.getText());
            s.setDays(txt_Days5.getText());
            Time t = new Time(Integer.parseInt(txt_Time_House5.getText()),Integer.parseInt(txt_Time_Minute5.getText()),0);
            s.setTime(t);
            try {
                if(osc.insertOnSiteCourse(s)==0)
                JOptionPane.showMessageDialog(this, "Add failed");
                else{
                    JOptionPane.showMessageDialog(this, "Add success");
                    listOnSiteCourse();
                }
            } catch (SQLException ex) {
                Logger.getLogger(QuanLyKhoaHocGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        // TODO add your handling code here:
        int confirm =JOptionPane.showConfirmDialog(this,"Would you like to delete this course?","Confirm",JOptionPane.YES_NO_OPTION);
        if(confirm==JOptionPane.YES_OPTION){
            if(rb_OnlineCourse.isSelected()){
            try {
                if(oc.deleteOnlineCourse(Integer.parseInt(cb_IDCourse5.getSelectedItem().toString()))==0)
                JOptionPane.showMessageDialog(this, "Delete failed");
                else{
                    JOptionPane.showMessageDialog(this, "Delete success");
                    listOnlineCourse();
                }

            } catch (SQLException ex) {
                Logger.getLogger(QuanLyKhoaHocGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try {
                if(osc.deleteOnSiteCourse(Integer.parseInt(cb_IDCourse5.getSelectedItem().toString()))==0)
                JOptionPane.showMessageDialog(this, "Delete failed");
                else{
                    JOptionPane.showMessageDialog(this, "Delete success");
                    listOnSiteCourse();
                }

            } catch (SQLException ex) {
                Logger.getLogger(QuanLyKhoaHocGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
        
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
//        int i = jTable1.get();
//        String department = null;
//        int credits = 0;
//        if(i>=0){
//            for(CourseDTO cc : coursearray)
//                if(model.getValueAt(i, 1).equals(cc.getCourseID())){
//                    department = cc.getDepartmant();
//                    credits=cc.getCreadits();
//                }
//        }
//        if(rb_OnlineCourse.isSelected()){
//            dgoc_txt_IDCourse.setText("ID Course: " + model.getValueAt(i, 1));
//            dgoc_txt_courseName.setText("Course Name: "+ model.getValueAt(i, 2));
//            dgoc_txt_URL.setText("URL: "+model.getValueAt(i, 3));
//            dgoc_txt_credits.setText(credits+"");
//            dgoc_txt_idDepartment.setText(department);
//        }
        
    }//GEN-LAST:event_jTable1MouseEntered

    private DefaultTableModel convertOnlineCourse(ArrayList list){
        String[] columnNames = {"TT","CourseID","Title","URL"};
        Object[][] data = new Object[list.size()][4];
        for(int i=0;i<list.size();i++){
            OnlineCourseDTO s = (OnlineCourseDTO) list.get(i);
            data[i][0]=i+1;
            data[i][1]=s.getCourseID();
            data[i][2]=s.getTitle();
            data[i][3]=s.getUrl();
        }
        DefaultTableModel model = new DefaultTableModel(data,columnNames);
        return model;
    }
    private DefaultTableModel convertOnSiteCourse(ArrayList list){
        String[] columnNames = {"TT","CourseID","Title","Location","Days","Time"};
        Object[][] data = new Object[list.size()][6];
        for(int i=0;i<list.size();i++){
            OnSiteCourseDTO s = (OnSiteCourseDTO) list.get(i);
            data[i][0]=i+1;
            data[i][1]=s.getCourseID();
            data[i][2]=s.getTitle();
            data[i][3]=s.getLocation();
            data[i][4]=s.getDays();
            data[i][5]=s.getTime();
        }
        DefaultTableModel model = new DefaultTableModel(data,columnNames);
        return model;
    }
    
    private void listOnSiteCourse() throws SQLException{
        ArrayList list = osc.readOnSiteCourse();
        model = convertOnSiteCourse(list);
        jTable1.setModel(model);
}
    private void listOnlineCourse() throws SQLException{
        ArrayList list = oc.readOnlineCourse();
        model = convertOnlineCourse(list);
        jTable1.setModel(model);
}
    
    private void loadListOnlineCourse(int courseID) throws SQLException{
        ArrayList list = oc.readStudentOnlineCourse(courseID);
        for(int i=0;i<list.size();i++){
        Model_Card s = (Model_Card) list.get(i);
        CreatePanel(s);
        }
//        jPanel2.validate();
    }
    private void loadListOnSiteCourse(int courseID) throws SQLException{
        ArrayList list = osc.readStudentOnSiteCourse(courseID);
        for(int i=0;i<list.size();i++){
            Model_Card s = (Model_Card) list.get(i);
            CreatePanel(s);
        }
//        jPanel2.validate();
    }
    
    private void CreatePanel(Model_Card modelCard){
          Card card = new Card();
          card.setData(modelCard);
          jPanel2.add(card);
          
    }
    
    private void checkKindCourse(Object kindCourse){
        if(kindCourse.equals("")){
            cb_IDCourse5.setSelectedItem("");
            txt_URL5.setEnabled(false);
            txt_Location5.setEnabled(false);
            txt_Days5.setEnabled(false);
            txt_Time_House5.setEnabled(false);
            txt_Time_Minute5.setEnabled(false);
        }
        else if(kindCourse.equals("Online")){
            cb_IDCourse5.setSelectedItem("Online");
            txt_URL5.setEnabled(true);
            txt_Location5.setEnabled(false);
            txt_Days5.setEnabled(false);
            txt_Time_House5.setEnabled(false);
            txt_Time_Minute5.setEnabled(false);
       }
        else{
            cb_IDCourse5.setSelectedItem("On Site");
            txt_URL5.setEnabled(false);
            txt_Location5.setEnabled(true);
            txt_Days5.setEnabled(true);
            txt_Time_House5.setEnabled(true);
            txt_Time_Minute5.setEnabled(true);
        }   
    }
    

    private void load_cbIDCourse() throws SQLException{
        for(CourseDTO c : coursearray){
            cb_IDCourse5.addItem(String.valueOf(c.getCourseID()));
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog JDialog_OnlineCourse;
    private Custom.ButtonRadius btn_Add;
    private Custom.ButtonRadius btn_Delete;
    private Custom.ButtonRadius btn_Update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_IDCourse5;
    private javax.swing.JComboBox<String> cb_KindCourse5;
    private javax.swing.JComboBox<String> cb_filter;
    private javax.swing.JLabel dgoc_txt_IDCourse;
    private javax.swing.JLabel dgoc_txt_URL;
    private javax.swing.JLabel dgoc_txt_courseName;
    private javax.swing.JLabel dgoc_txt_credits;
    private javax.swing.JLabel dgoc_txt_idDepartment;
    private javax.swing.JLabel dgosc_txt_Days;
    private javax.swing.JLabel dgosc_txt_IDCourse;
    private javax.swing.JLabel dgosc_txt_Location;
    private javax.swing.JLabel dgosc_txt_Time;
    private javax.swing.JLabel dgosc_txt_courseName;
    private javax.swing.JLabel dgosc_txt_credits;
    private javax.swing.JLabel dgosc_txt_idDepartment;
    private javax.swing.JDialog jDialog_OnSiteCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private Custom.PanelRadius jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private Custom.PanelRadius panelRadius1;
    private Custom.PanelRadius panelRadius2;
    private Custom.PanelRadius panelRadius3;
    private javax.swing.JRadioButton rb_OnSiteCourse;
    private javax.swing.JRadioButton rb_OnlineCourse;
    private javax.swing.JTextField txt_CourseName5;
    private javax.swing.JTextField txt_Credits5;
    private javax.swing.JTextField txt_Days5;
    private javax.swing.JTextField txt_DepartmentID5;
    private javax.swing.JTextField txt_Find;
    private javax.swing.JTextField txt_Location5;
    private javax.swing.JTextField txt_Time_House5;
    private javax.swing.JTextField txt_Time_Minute5;
    private javax.swing.JTextArea txt_URL5;
    // End of variables declaration//GEN-END:variables
}
