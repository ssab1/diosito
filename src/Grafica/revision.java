/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import Codigo.Creacion_bbdd;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author basti
 */
public class revision extends javax.swing.JFrame {

    Creacion_bbdd cb;
    public revision() {
        this.setResizable(false);
        initComponents();
        configurarRB();
        configurarRBB();
        configurarRBBB();
        setLocationRelativeTo(null);
        cb = new Creacion_bbdd();
    }
    public void configurarRB(){
        ButtonGroup botones = new ButtonGroup();
        
        botones.add(rb_masculino);
        botones.add(rb_femenino);
        botones.add(rb_otro);
        rb_otro.setSelected(true);
    }
        public void configurarRBB(){
        ButtonGroup botones = new ButtonGroup();
        
        botones.add(rb_bf);
        botones.add(rb_ba);
        rb_bf.setSelected(true);
    }
    public void configurarRBBB(){
        ButtonGroup botones = new ButtonGroup();
        
        botones.add(rb_pasb);
        botones.add(rb_pasa);
        rb_pasa.setSelected(true);
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        campo_apellido = new javax.swing.JTextField();
        campo_rut = new javax.swing.JTextField();
        campo_nusuario = new javax.swing.JTextField();
        btn_ingresarusu = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        campo_contrasena = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dl_userr = new javax.swing.JTextField();
        dl_user = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        rb_masculino = new javax.swing.JRadioButton();
        rb_femenino = new javax.swing.JRadioButton();
        rb_otro = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblrut = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        campo_codigo = new javax.swing.JTextField();
        campo_nompro = new javax.swing.JTextField();
        campo_cantpro = new javax.swing.JTextField();
        btn_ingpro = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btn_modificarproduc = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rb_bf = new javax.swing.JRadioButton();
        rb_ba = new javax.swing.JRadioButton();
        rb_pasb = new javax.swing.JRadioButton();
        rb_pasa = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        campo_revisarcodigo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblrevisar = new javax.swing.JTable();
        btn_codver = new javax.swing.JButton();
        btn_vertodos = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre usuario:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellido:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rut:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contraseña:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sexo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));
        jPanel1.add(campo_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, -1));
        jPanel1.add(campo_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 110, -1));
        jPanel1.add(campo_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 110, -1));
        jPanel1.add(campo_nusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 110, -1));

        btn_ingresarusu.setText("Ingresar usuario");
        btn_ingresarusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarusuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ingresarusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Crear usuario:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));
        jPanel1.add(campo_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 110, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("<html>Ingrese RUT de usuario a eliminar:</html>");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 140, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 90, 120));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grupo.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 90, 130));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/veruser.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 100, 80));
        jPanel1.add(dl_userr, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 130, -1));

        dl_user.setText("Eliminar usuario");
        dl_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dl_userActionPerformed(evt);
            }
        });
        jPanel1.add(dl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 120, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Eliminar Usuario:");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        rb_masculino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_masculino.setForeground(new java.awt.Color(255, 255, 255));
        rb_masculino.setText("Masculino");
        rb_masculino.setContentAreaFilled(false);
        jPanel1.add(rb_masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        rb_femenino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_femenino.setForeground(new java.awt.Color(255, 255, 255));
        rb_femenino.setText("Femenino");
        rb_femenino.setContentAreaFilled(false);
        jPanel1.add(rb_femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        rb_otro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_otro.setForeground(new java.awt.Color(255, 255, 255));
        rb_otro.setText("Otro");
        rb_otro.setContentAreaFilled(false);
        jPanel1.add(rb_otro, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        jButton3.setText("Ver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        tblrut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "RUT", "NOMBRE", "APELLIDO"
            }
        ));
        jScrollPane1.setViewportView(tblrut);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 260, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bodeeee.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 470));

        jTabbedPane1.addTab("Gestionar usuarios", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Categoria:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Codigo:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Nombre:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Seccion:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Cantidad:");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel2.add(campo_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 110, -1));
        jPanel2.add(campo_nompro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));
        jPanel2.add(campo_cantpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, -1));

        btn_ingpro.setText("Ingresar producto");
        btn_ingpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingproActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ingpro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Ingreso producto nuevo:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cajas.png"))); // NOI18N
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        btn_modificarproduc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificare.png"))); // NOI18N
        btn_modificarproduc.setContentAreaFilled(false);
        btn_modificarproduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarproducActionPerformed(evt);
            }
        });
        jPanel2.add(btn_modificarproduc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cajas.png"))); // NOI18N
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cajas.png"))); // NOI18N
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Modificar producto");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        rb_bf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_bf.setForeground(new java.awt.Color(255, 255, 255));
        rb_bf.setText("Bebidas de fantasia");
        rb_bf.setContentAreaFilled(false);
        jPanel2.add(rb_bf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        rb_ba.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_ba.setForeground(new java.awt.Color(255, 255, 255));
        rb_ba.setText("Bebidas alcoholica");
        rb_ba.setContentAreaFilled(false);
        jPanel2.add(rb_ba, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        rb_pasb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_pasb.setForeground(new java.awt.Color(255, 255, 255));
        rb_pasb.setText("0-125 Bebidas de fantasia");
        rb_pasb.setContentAreaFilled(false);
        jPanel2.add(rb_pasb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        rb_pasa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rb_pasa.setForeground(new java.awt.Color(255, 255, 255));
        rb_pasa.setText("126-200 Bebidas acoholica");
        rb_pasa.setContentAreaFilled(false);
        jPanel2.add(rb_pasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bodeeee.jpg"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 470));

        jTabbedPane1.addTab("Gestion productos", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 110, -1));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 110, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Codigo:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton4.setText("Ingresar");
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("<html>Ingreso producto por codigo:</html>");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Ver datos del codigo:");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, -1, -1));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 120, -1));
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 120, -1));

        jButton5.setText("Retiro");
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));
        jPanel3.add(campo_revisarcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 140, -1));

        tblrevisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblrevisar);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 370, 200));

        btn_codver.setText("Buscar");
        btn_codver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_codverActionPerformed(evt);
            }
        });
        jPanel3.add(btn_codver, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, -1, -1));

        btn_vertodos.setText("Mostrar todos");
        btn_vertodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vertodosActionPerformed(evt);
            }
        });
        jPanel3.add(btn_vertodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/camion.png"))); // NOI18N
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 130, 130));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Salida productos:");
        jPanel3.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Codigo:");
        jPanel3.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Cantidad:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jButton8.setText("Aceptar");
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bodeeee.jpg"))); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 480));

        jTabbedPane1.addTab("Ingreso y salida productos", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarusuActionPerformed

        if (campo_contrasena.getText().equals("") || campo_nombre.getText().equals("") ||campo_apellido.getText().equals("") ||
            campo_rut.getText().equals("") || campo_nusuario.getText().equals("") ) {
            
            JOptionPane.showMessageDialog(null, "Hay campos vacios!!","Mensaje",JOptionPane.DEFAULT_OPTION);
        }else{

            String contrasena = campo_contrasena.getText();
            String nombre = campo_nombre.getText();
            String apellido = campo_apellido.getText();
            String rut = campo_rut.getText();
           
            String nm_usuario = campo_nusuario.getText();
            
            String m,f;
            if (rb_masculino.isSelected()) {
                m="Masculino";
                cb.IDUSUARIO(nombre, apellido, rut, m, nm_usuario, contrasena);
                campo_contrasena.setText("");
                campo_nombre.setText("");
                campo_apellido.setText("");
                campo_rut.setText("");
                campo_nusuario.setText("");
            }else if(rb_femenino.isSelected()){
                m="Femenino";
                cb.IDUSUARIO(nombre, apellido, rut, m, nm_usuario, contrasena);
                campo_contrasena.setText("");
                campo_nombre.setText("");
                campo_apellido.setText("");
                campo_rut.setText("");
                campo_nusuario.setText("");
            }else{
                m="Otro";
                cb.IDUSUARIO(nombre, apellido, rut, m, nm_usuario, contrasena);
                campo_contrasena.setText("");
                campo_nombre.setText("");
                campo_apellido.setText("");
                campo_rut.setText("");
                campo_nusuario.setText("");
            }
            
        }

    }//GEN-LAST:event_btn_ingresarusuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nuevamod mu = new nuevamod();
        
        mu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dl_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dl_userActionPerformed
        if (dl_userr.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo esta vacio!!","Mensaje",JOptionPane.DEFAULT_OPTION);
        }else{
           
          String rutsu=dl_userr.getText();
          cb.DELUSUARIO(rutsu);
          dl_userr.setText("");
        }

    }//GEN-LAST:event_dl_userActionPerformed

    private void btn_ingproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingproActionPerformed
        
        
        if (campo_codigo.getText().equals("") || campo_nompro.getText().equals("") || campo_cantpro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios!!","Mensaje",JOptionPane.DEFAULT_OPTION);
        }else{
        
        int codigo =Integer.parseInt(campo_codigo.getText());
        String nombre = campo_nompro.getText();
        int cantidad = Integer.parseInt(campo_cantpro.getText());
        int a,c;
        if (rb_bf.isSelected()&&rb_pasb.isSelected()) {
            a=1;
            c=1;
            cb.IDProducto(codigo, nombre, cantidad, a, c);
        }else if (rb_ba.isSelected()&&rb_pasa.isSelected()){
            a=2;
            c=2;
            cb.IDProducto(codigo, nombre, cantidad, a, c);
        }
        }
    }//GEN-LAST:event_btn_ingproActionPerformed

    private void btn_codverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_codverActionPerformed
        if (campo_revisarcodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo esta vacio!!","Mensaje",JOptionPane.DEFAULT_OPTION);
        }else{
        int cod=Integer.parseInt(campo_revisarcodigo.getText());
//        String cod = campo_revisarcodigo.getText();
        cb.verporcod(tblrevisar, cod);
        }
    }//GEN-LAST:event_btn_codverActionPerformed

    private void btn_vertodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vertodosActionPerformed
        cb.verporcodtodos(tblrevisar);
    }//GEN-LAST:event_btn_vertodosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed


        if (dl_userr.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo esta vacio!!","Mensaje",JOptionPane.DEFAULT_OPTION);
        }else{
        String rut = dl_userr.getText();
        cb.mostrarrut(tblrut, rut);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_modificarproducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarproducActionPerformed
        modificarproducto mp = new modificarproducto();
        
        mp.setVisible(true);        
    }//GEN-LAST:event_btn_modificarproducActionPerformed

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
            java.util.logging.Logger.getLogger(revision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(revision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(revision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(revision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new revision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_codver;
    private javax.swing.JButton btn_ingpro;
    private javax.swing.JButton btn_ingresarusu;
    private javax.swing.JButton btn_modificarproduc;
    private javax.swing.JButton btn_vertodos;
    private javax.swing.JTextField campo_apellido;
    private javax.swing.JTextField campo_cantpro;
    private javax.swing.JTextField campo_codigo;
    private javax.swing.JPasswordField campo_contrasena;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_nompro;
    private javax.swing.JTextField campo_nusuario;
    private javax.swing.JTextField campo_revisarcodigo;
    private javax.swing.JTextField campo_rut;
    private javax.swing.JButton dl_user;
    private javax.swing.JTextField dl_userr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JRadioButton rb_ba;
    private javax.swing.JRadioButton rb_bf;
    private javax.swing.JRadioButton rb_femenino;
    private javax.swing.JRadioButton rb_masculino;
    private javax.swing.JRadioButton rb_otro;
    private javax.swing.JRadioButton rb_pasa;
    private javax.swing.JRadioButton rb_pasb;
    private javax.swing.JTable tblrevisar;
    private javax.swing.JTable tblrut;
    // End of variables declaration//GEN-END:variables
}
