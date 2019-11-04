
import java.awt.Color;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhruv
 */


public class SeatingArrangement1 extends javax.swing.JFrame 
{

    /**
     * Creates new form SeatingArrangement1
     */
    
     
     
    private int a1=0, a2=0, a3=0, a4=0, a5=0, a6=0, b1=0, b2=0, b3=0, b4=0, c1=0, c2=0, c3=0, c4=0, d1=0, d2=0, d3=0;
    private int d4=0, e1=0, e2=0, e3=0, e4=0, e5=0, e6=0;
    int c=0;
    String ua1="0",ua2="0",ua3="0",ua4="0",ua5="0",ua6="0",ub1="0",ub2="0",ub3="0",ub4="0",uc1="0",uc2="0",uc3="0",uc4="0",ud1="",ud2="0",ud3="0",ud4="0",ue1="0",ue2="0",ue3="0",ue4="0",ue5="0",ue6="0";
    String wa1="0",wa2="0",wa3="0",wa4="0",wa5="0",wa6="0",wb1="0",wb2="0",wb3="0",wb4="0",
           wc1="0",wc2="0",wc3="0",wc4="0",wd1="0",wd2="0",wd3="0",wd4="0",we1="0",we2="0",
            we3="0",we4="0",we5="0",we6="0";
    String b="";
    private int count=0;
    String txt;
    String pass="";
    String time="";
    String theatre="";

   
    public String[] seats = new String[25];
//    private Object totalamount;
//    private Object A2;
//    private Object A1;
//    private Object A3;
    public SeatingArrangement1()
    {
        
    
    }
    public SeatingArrangement1(String x,String y,String z) throws SQLException {
        initComponents();
        
         time=y;
         theatre=z;
         pass=x;
        
             Connection conn = databaseConnection.connection();
        Statement stmt=conn.createStatement();
        String sql="Select * from seats";
        ResultSet rs=stmt.executeQuery(sql);
        
         
        while(rs.next())
        {
            if(rs.getString("MovieName").equals(x) && rs.getString("Time").equals(y)){
        ua1=rs.getString("A1");              ua2=rs.getString("A2");
        ua3=rs.getString("A3");              ua4=rs.getString("A4");
        ua5=rs.getString("A5");              ua6=rs.getString("A6");
        ub1=rs.getString("B1");              ub2=rs.getString("B2");
        ub3=rs.getString("B3");
        ub4=rs.getString("B4");              uc1=rs.getString("C1");
        uc2=rs.getString("C2");              uc3=rs.getString("C3");
        uc4=rs.getString("C4");              ud1=rs.getString("D1");
        ud2=rs.getString("D2");
        ud3=rs.getString("D3");              ud4=rs.getString("D4");
        ue1=rs.getString("E1");              ue2=rs.getString("E2");
        ue3=rs.getString("E3");              ue4=rs.getString("E4");
        ue5=rs.getString("E5");              ue6=rs.getString("E6");
        }}
        if(ua1.equals("1"))      { A1.setBackground(Color.black);wa1="1";}
         if(ua2.equals("1"))     { A2.setBackground(Color.black);wa2="1";}
          if(ua3.equals("1"))     {A3.setBackground(Color.black);wa3="1";}
          if(ua4.equals("1"))    { A4.setBackground(Color.black); wa4="1";}
            if(ua5.equals("1"))     { A6.setBackground(Color.black);wa5="1";}
             if(ua6.equals("1"))     { A2.setBackground(Color.black);wa6="1";}
         if(ub1.equals("1"))     {  B1.setBackground(Color.black); wb1="1";}
        if(ub2.equals("1"))   { B2.setBackground(Color.black); wb2="1";}
        if(ub3.equals("1"))   {   B3.setBackground(Color.black);wb3="1";}
        if(ub4.equals("1"))     {  B4.setBackground(Color.black);wb4="1";}
        if(uc1.equals("1"))     {C1.setBackground(Color.black);wc1="1";}
        if(uc2.equals("1"))     {  C2.setBackground(Color.black);wc2="1";}
        if(uc3.equals("1"))    { C3.setBackground(Color.black); wc3="1";}
        if(uc4.equals("1"))     {   C4.setBackground(Color.black);wc4="1";} 
        if(ud1.equals("1"))    {  D1.setBackground(Color.black);  wd1="1";}
        if(ud2.equals("1"))    { D2.setBackground(Color.black);  wd2="1";}
        if(ud3.equals("1"))    {   D3.setBackground(Color.black); wd3="1";} 
        if(ud4.equals("1"))    {  D4.setBackground(Color.black);wd4="1";}
        if(ue1.equals("1"))    {   E1.setBackground(Color.black);we1="1";}
        if(ue2.equals("1"))    {  E2.setBackground(Color.black);we2="1";}
        if(ue3.equals("1"))     {  E3.setBackground(Color.black);we3="1";}
        if(ue4.equals("1"))  {   E4.setBackground(Color.black);we4="1";}
        if(ue5.equals("1"))    { E5.setBackground(Color.black);we5="1";}
        if(ue6.equals("1"))    {  E6.setBackground(Color.black);we6="1";}
        

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        abc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        A1 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        D2 = new javax.swing.JButton();
        D3 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        E4 = new javax.swing.JButton();
        E5 = new javax.swing.JButton();
        E6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jButton3.setText("jButton2");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("                    s    c    r    e    e   n");

        jLabel3.setFont(new java.awt.Font("HP Simplified", 1, 48)); // NOI18N
        jLabel3.setText("SCREEN 1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total Amount:");

        abc.setBackground(new java.awt.Color(255, 0, 0));
        abc.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        abc.setForeground(new java.awt.Color(255, 255, 255));
        abc.setText("Confirm Seats");
        abc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abcActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total Amount:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dhruv\\OneDrive\\Desktop\\Project icons\\black.jpg")); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 0, 51));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("- Available Seats");

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\dhruv\\OneDrive\\Desktop\\Project icons\\red2.jpg")); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\dhruv\\OneDrive\\Desktop\\Project icons\\grey.jpg")); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel11.setBackground(new java.awt.Color(255, 0, 51));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("- Your Seats");

        jLabel13.setBackground(new java.awt.Color(255, 0, 51));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("- Unavailable Seats");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(abc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(70, 70, 70)
                .addComponent(abc)
                .addGap(121, 121, 121))
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(550, 0, 270, 590);

        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        jPanel2.add(A1);
        A1.setBounds(60, 120, 40, 40);

        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });
        jPanel2.add(A3);
        A3.setBounds(210, 120, 40, 40);

        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });
        jPanel2.add(A4);
        A4.setBounds(280, 120, 40, 40);

        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });
        jPanel2.add(A5);
        A5.setBounds(350, 120, 40, 40);
        jPanel2.add(A6);
        A6.setBounds(420, 120, 40, 40);

        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });
        jPanel2.add(A2);
        A2.setBounds(140, 120, 40, 40);

        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel2.add(B1);
        B1.setBounds(60, 180, 40, 40);

        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        jPanel2.add(B2);
        B2.setBounds(140, 180, 40, 40);

        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        jPanel2.add(B3);
        B3.setBounds(350, 180, 40, 40);

        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        jPanel2.add(B4);
        B4.setBounds(420, 180, 40, 40);

        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        jPanel2.add(C1);
        C1.setBounds(60, 270, 40, 40);

        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        jPanel2.add(C2);
        C2.setBounds(140, 270, 40, 40);

        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        jPanel2.add(C3);
        C3.setBounds(350, 260, 40, 40);

        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });
        jPanel2.add(C4);
        C4.setBounds(420, 260, 40, 40);

        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });
        jPanel2.add(D1);
        D1.setBounds(60, 330, 40, 40);

        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });
        jPanel2.add(D2);
        D2.setBounds(140, 330, 40, 40);

        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });
        jPanel2.add(D3);
        D3.setBounds(350, 320, 40, 40);

        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });
        jPanel2.add(D4);
        D4.setBounds(420, 320, 40, 40);

        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });
        jPanel2.add(E1);
        E1.setBounds(60, 390, 40, 40);

        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });
        jPanel2.add(E2);
        E2.setBounds(140, 390, 40, 40);

        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });
        jPanel2.add(E3);
        E3.setBounds(210, 390, 40, 40);

        E4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E4ActionPerformed(evt);
            }
        });
        jPanel2.add(E4);
        E4.setBounds(280, 390, 40, 40);

        E5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E5ActionPerformed(evt);
            }
        });
        jPanel2.add(E5);
        E5.setBounds(350, 390, 40, 40);

        E6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E6ActionPerformed(evt);
            }
        });
        jPanel2.add(E6);
        E6.setBounds(420, 390, 40, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("                    s    c    r    e    e   n");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(60, 470, 300, 28);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("-------------------REGULAR-----------------");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(80, 230, 370, 20);

        jLabel5.setFont(new java.awt.Font("HP Simplified", 1, 48)); // NOI18N
        jLabel5.setText("SCREEN 1");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(170, 10, 192, 57);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel14.setText("-------------------EXECUTIVE-----------------");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(60, 90, 370, 20);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dhruv\\OneDrive\\Desktop\\Project icons\\back.jpg")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(20, 10, 50, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
         if(ua1.equals("0"))
        {
          a1++;
        if(a1%2!=0){
            A1.setBackground(Color.red);
            seats[count] = "A1";
            count++;
            c=c+300;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wa1="1";
        }
        else {
            A1.setBackground(Color.white);
            count--;
            c=c-300;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wa1="0";
        }
        }
               
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
                if(ua2.equals("0"))
        {
       
         a2++;
        if(a2%2!=0){
            A2.setBackground(Color.red);
            seats[count] = "A2";
            count++;
            c=c+300;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wa2="1";
        }
        else {
            A2.setBackground(Color.white);
            count--;
            c=c-300;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wa2="0";}}

    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
                 a3++;
        if(a3%2!=0){
            A3.setBackground(Color.red);
            seats[count] = "A3";
            count++;
            c=c+300;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wa3="1";
        }
        else {
            A3.setBackground(Color.white);
            count--;
            c=c-300;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wa3="0";
        }
        

    }//GEN-LAST:event_A3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        // TODO add your handling code here:
         if(ua4.equals("0"))
        {
          a4++;
        if(a4%2!=0){
            A4.setBackground(Color.red);
            seats[count] = "A4";
            count++;
            c=c+300;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wa4="1";
        }
        else {
            A4.setBackground(Color.white);
            count--;
            c=c-300;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wa4="0";
        }
        }

    }//GEN-LAST:event_A4ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        // TODO a
         if(ua5.equals("0"))
        {
          a5++;
        if(a4%2!=0){
            A5.setBackground(Color.red);
            seats[count] = "A5";
            count++;
            c=c+300;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wa5="1";
        }
        else {
            A5.setBackground(Color.white);
            count--;
            c=c-300;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wa5="0";
        }
        }
       
    }//GEN-LAST:event_A5ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
        // TODO add your handling code here:
         if(ue2.equals("0"))
        {
          e2++;
        if(e2%2!=0){
            E2.setBackground(Color.red);
            seats[count] = "E2";
            count++;
            c=c+200;
            b=String.valueOf(c);
            jLabel12.setText(b);
            we2="1";
        }
        else {
            E2.setBackground(Color.white);
            count--;
            c=c-200;
            b=String.valueOf(c);
            jLabel12.setText(b);
            we2="0";
        }
        }
    }//GEN-LAST:event_E2ActionPerformed

    private void abcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abcActionPerformed
        try {
            // TODO add your handling code here:
            
            txt="";
            
            for(int m=0;m<count;m++)
            {
                txt+=seats[m];
                if(m!=count-1)
                    txt+=',';
            }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/movies?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root","" );
            PreparedStatement pr = con.prepareStatement("insert into seats values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pr.setString(1,wa1 );   pr.setString(2,wa2 );   pr.setString(5, wa5);
            pr.setString(3,wa3 );   pr.setString(4, wa4);   pr.setString(6,wa6);
            pr.setString(7,wb1 );   pr.setString(8, wb2);   pr.setString(9,wb3);
            pr.setString(10,wb4 );   pr.setString(11, wc1);   pr.setString(12,wc2);
            pr.setString(13,wc3 );   pr.setString(14, wc4);   pr.setString(15,wd1);
            pr.setString(16,wd2 );   pr.setString(17, wd3);   pr.setString(18,wd4);
            pr.setString(19,we1 );   pr.setString(20, we2);   pr.setString(21,we3);
            pr.setString(22,we4 );   pr.setString(23, we5);   pr.setString(24,we6);
            pr.setString(25,pass); pr.setString(26,time);
//            int i = pr.executeUpdate();
pr.executeUpdate();
//System.out.println(wa1);

BookedScreen obj = new BookedScreen(txt,pass,time,theatre,b);
this.setVisible(false);
obj.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SeatingArrangement1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SeatingArrangement1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_abcActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        // TODO add your handling code here:        if(ue1.equals("0"))
        {
        e1++;
        if(e1%2!=0){
            E1.setBackground(Color.red);
            seats[count] = "E1";
            count++;
            c=c+120;we1="1";
            b=String.valueOf(c);
            jLabel12.setText(b);
        }
        else {
            E1.setBackground(Color.white);
            count--;
            c=c-120;
            b=String.valueOf(c);we1="0";
            jLabel12.setText(b);
        }
        }

    }//GEN-LAST:event_E1ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        // TODO add your handling code here:
                if(ue3.equals("0"))
        {
        e3++;
        if(e3%2!=0){
            E3.setBackground(Color.red);
            seats[count] = "E3";
            count++;
            c=c+120;we3="1";
            b=String.valueOf(c);
            jLabel12.setText(b);
        }
        else {
            E3.setBackground(Color.white);
            count--;
            c=c-120;
            b=String.valueOf(c);we3="0";
            jLabel12.setText(b);
        }
        }

    }//GEN-LAST:event_E3ActionPerformed

    private void E4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E4ActionPerformed
        // TODO add your handling code here:
                if(ue4.equals("0"))
        {
        e4++;
        if(e4%2!=0){
            E4.setBackground(Color.red);
            seats[count] = "E4";
            count++;
            c=c+120;we4="1";
            b=String.valueOf(c);
            jLabel12.setText(b);
        }
        else {
            E4.setBackground(Color.white);
            count--;
            c=c-120;
            b=String.valueOf(c);we4="0";
            jLabel12.setText(b);
        }
        }

    }//GEN-LAST:event_E4ActionPerformed

    private void E5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E5ActionPerformed
        // TODO add your handling code here:
                if(ue5.equals("0"))
        {
        e5++;
        if(e5%2!=0){
            E5.setBackground(Color.red);
            seats[count] = "E5";
            count++;
            c=c+120;we5="1";
            b=String.valueOf(c);
            jLabel12.setText(b);
        }
        else {
            E5.setBackground(Color.white);
            count--;
            c=c-120;
            b=String.valueOf(c);we5="0";
            jLabel12.setText(b);
        }
        }

    }//GEN-LAST:event_E5ActionPerformed

    private void E6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E6ActionPerformed
        // TODO add your handling code here:
                if(ue6.equals("0"))
        {
        e6++;
        if(e6%2!=0){
            E6.setBackground(Color.red);
            seats[count] = "E6";
            count++;
            c=c+120;we6="1";
            b=String.valueOf(c);
            jLabel12.setText(b);
        }
        else {
            E6.setBackground(Color.white);
            count--;
            c=c-120;
            b=String.valueOf(c);we6="0";
            jLabel12.setText(b);
        }
        }

    }//GEN-LAST:event_E6ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        // TODO add your handling code here:
        
                if(ud1.equals("0"))
        { 
        d1++;
        
        if(d1%2!=0){
            D1.setBackground(Color.red);
            seats[count] = "D1";
            count++;
            c=c+200;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wd1="1";
        }
        else {
            D1.setBackground(Color.white);
            count--;
            c=c-200;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wd1="0";
        }
        }

    }//GEN-LAST:event_D1ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        // TODO add your handling code here:
                if(ud2.equals("0"))
        {
        d2++;
      
        if(d2%2!=0){
            D2.setBackground(Color.red);
            seats[count] = "D2";
            count++;
            c=c+200;
            b=String.valueOf(c); wd2="1";
            jLabel12.setText(b);
        }
        else {
            D2.setBackground(Color.white);
            count--;
            c=c-200;
            b=String.valueOf(c);wd2="0";
            jLabel12.setText(b);
        }
        }

    }//GEN-LAST:event_D2ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        // TODO add your handling code here:
                if(ud3.equals("0"))
        {
        d3++;
        if(d3%2!=0){
            D3.setBackground(Color.red);
            seats[count] = "D3";
            count++;
            c=c+200;
            b=String.valueOf(c);wd3="1";
            jLabel12.setText(b);
        }
        else {
            D3.setBackground(Color.white);
            count--;
            c=c-200;wd3="0";
            b=String.valueOf(c);
            jLabel12.setText(b);
        }
        }

    }//GEN-LAST:event_D3ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        // TODO add your handling code here:
                if(ud4.equals("0"))
        {
        d4++;
        if(d4%2!=0){
            D4.setBackground(Color.red);
            seats[count] = "D4";
            count++;
            c=c+200;wd4="1";
            b=String.valueOf(c);
            jLabel12.setText(b);
        }
        else {
            D4.setBackground(Color.white);
            count--;
            c=c-200;wd4="0";
            b=String.valueOf(c);
            jLabel12.setText(b);
        }
        }

    }//GEN-LAST:event_D4ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
                if(uc1.equals("0"))
        {
        c1++;
        if(c1%2!=0){
            C1.setBackground(Color.red);
            seats[count] = "C1";
            count++;
            c=c+200;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wc1="1";
        }
        else {
            C1.setBackground(Color.white);
            count--;
            c=c-200;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wc1="0";
        }
        }

    }//GEN-LAST:event_C1ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
                if(uc4.equals("0"))
        {
        c4++;
        if(c4%2!=0){
            C4.setBackground(Color.red);
            seats[count] = "C4";
            count++;
            c=c+200;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wc4="1";
        }
        else {
            C4.setBackground(Color.white);
            count--;
            c=c-200;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wc4="0";
        }
        }

    }//GEN-LAST:event_C4ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
           if(uc3.equals("0"))
        {
        c3++;
        if(c3%2!=0){
            C3.setBackground(Color.red);
            seats[count] = "C3";
            count++;
            c=c+200;
            b=String.valueOf(c);
            wc3="1";
            jLabel12.setText(b);
        }
        else {
            C3.setBackground(Color.white);
            count--;
            c=c-200;
            b=String.valueOf(c);
            wc3="0";
            jLabel12.setText(b);
        }
        }

    }//GEN-LAST:event_C3ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
         if(uc2.equals("0"))
        {
         c2++;
        if(c2%2!=0){
            C2.setBackground(Color.red);
            seats[count] = "C2";
            count++;
            c=c+200;
            b=String.valueOf(c);
            wc2="1";
            jLabel12.setText(b);
        }
        else {
            C2.setBackground(Color.white);
            count--;
            c=c-200;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wc2="0";
        }
        }

    }//GEN-LAST:event_C2ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
          if(ub1.equals("0"))
        {
        b1++;
         
        if(b1%2!=0){
            B1.setBackground(Color.red);
            seats[count] = "B1";
            count++;
            c=c+300;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wb1="1";
        }
        else {
            B1.setBackground(Color.white);
            count--;
            c=c-300;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wb1="0";
        }
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
                if(ub4.equals("0"))
        {
        b4++;
         
        if(b4%2!=0){
            B4.setBackground(Color.red);
            seats[count] = "B4";
            count++;
            c=c+300;
            b=String.valueOf(c);
            jLabel8.setText(b);
            wb4="1";
        }
        else {
            B4.setBackground(Color.white);
            count--;
            c=c-300;
            b=String.valueOf(c);
            jLabel8.setText(b);
            wb4="0";
        }
        }

    }//GEN-LAST:event_B4ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
          if(ub3.equals("0"))
        {
        b3++;
         
        if(b3%2!=0){
            B3.setBackground(Color.red);
            seats[count] = "B3";
            count++;
            c=c+300;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wb3="1";
        }
        else {
            B3.setBackground(Color.white);
            count--;
            c=c-300;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wb3="0";
        }
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
          if(ub2.equals("0"))
        {
        b2++;
         
        if(b2%2!=0){
            B2.setBackground(Color.red);
            seats[count] = "B2";
            count++;
            c=c+300;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wb2="1";
        }
        else {
            B2.setBackground(Color.white);
            count--;
            c=c-300;
            b=String.valueOf(c);
            jLabel12.setText(b);
            wb2="0";
        }
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            NowShowing obj = new NowShowing();
            this.setVisible(false);
            obj.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SeatingArrangement1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
            java.util.logging.Logger.getLogger(SeatingArrangement1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatingArrangement1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatingArrangement1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatingArrangement1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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
            java.util.logging.Logger.getLogger(SeatingArrangement1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatingArrangement1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatingArrangement1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatingArrangement1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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
            java.util.logging.Logger.getLogger(SeatingArrangement1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatingArrangement1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatingArrangement1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatingArrangement1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeatingArrangement1().setVisible(true);
            }
        
        
        
            
        
         
         
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton D1;
    private javax.swing.JButton D2;
    private javax.swing.JButton D3;
    private javax.swing.JButton D4;
    private javax.swing.JButton E1;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton E4;
    private javax.swing.JButton E5;
    private javax.swing.JButton E6;
    private javax.swing.JButton abc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    static class setVisible {

        public setVisible(boolean b) {
        }
    }

    private static class conn {

        public conn() {
        }
    }

    private static class rs {

        public rs() {
        }
    }
}
