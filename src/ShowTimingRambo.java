
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhruv
 */
public class ShowTimingRambo extends javax.swing.JFrame {

    /**
     * Creates new form ShowTimingRambo
     */
    
     Connection conn;
     Statement stmt;
     ResultSet rs;
     String[] timings=new String[100];
       String[] theatres=new String[100];
    public ShowTimingRambo() throws SQLException {
        initComponents();
         
        
        conn = databaseConnection.connection();
        stmt = conn.createStatement();
        String sql="Select * from Theatres";
        rs=stmt.executeQuery(sql);
        String theatre="",timing="";
        int i=0;
        String[] timings=new String[100];
        String[] theatres=new String[100];
        while(rs.next())
            {
               
                if("Rambo: Last Blood".equals(rs.getString("MovieName")))
                {
                
                   theatre = rs.getString("TheatreName");
                   timing=rs.getString("ShowTiming");
                   timings[i]=timing;
                   theatres[i]=theatre;
                   i++;
                   System.out.println(theatre);
                }

            }
        theatre1.setText(theatres[2]);
        
        timing1.setText(timings[2]);
        
        theatre4.setText(theatres[3]);
        timing2.setText(timings[3]);
        
        
        theatre3.setText(theatres[1]);
        timing3.setText(timings[0]);
        timing4.setText(timings[1]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        theatre2 = new javax.swing.JPanel();
        theatre1 = new javax.swing.JLabel();
        timing1 = new javax.swing.JButton();
        theatre4 = new javax.swing.JLabel();
        timing2 = new javax.swing.JButton();
        theatre3 = new javax.swing.JLabel();
        timing3 = new javax.swing.JButton();
        timing4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\dhruv\\OneDrive\\Desktop\\Project icons\\movietiming.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        theatre2.setBackground(new java.awt.Color(255, 255, 255));
        theatre2.setForeground(new java.awt.Color(255, 0, 102));
        theatre2.setPreferredSize(new java.awt.Dimension(825, 715));

        theatre1.setBackground(new java.awt.Color(255, 255, 255));
        theatre1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        theatre1.setForeground(new java.awt.Color(255, 0, 102));
        theatre1.setText("jLabel1");

        timing1.setBackground(new java.awt.Color(255, 0, 51));
        timing1.setForeground(new java.awt.Color(255, 255, 255));
        timing1.setText("jButton1");
        timing1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timing1ActionPerformed(evt);
            }
        });

        theatre4.setBackground(new java.awt.Color(255, 255, 255));
        theatre4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        theatre4.setForeground(new java.awt.Color(255, 0, 102));
        theatre4.setText("jLabel1");

        timing2.setBackground(new java.awt.Color(255, 51, 51));
        timing2.setForeground(new java.awt.Color(255, 255, 255));
        timing2.setText("jButton1");
        timing2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timing2ActionPerformed(evt);
            }
        });

        theatre3.setBackground(new java.awt.Color(255, 255, 255));
        theatre3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        theatre3.setForeground(new java.awt.Color(255, 0, 102));
        theatre3.setText("jLabel2");

        timing3.setBackground(new java.awt.Color(255, 0, 51));
        timing3.setForeground(new java.awt.Color(255, 255, 255));
        timing3.setText("jButton1");
        timing3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timing3ActionPerformed(evt);
            }
        });

        timing4.setBackground(new java.awt.Color(255, 0, 51));
        timing4.setForeground(new java.awt.Color(255, 255, 255));
        timing4.setText("jButton2");
        timing4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timing4ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rambo");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dhruv\\OneDrive\\Desktop\\Project icons\\rambofinal.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(180, 180, 180)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\dhruv\\OneDrive\\Desktop\\Project icons\\movietiming.jpg")); // NOI18N

        javax.swing.GroupLayout theatre2Layout = new javax.swing.GroupLayout(theatre2);
        theatre2.setLayout(theatre2Layout);
        theatre2Layout.setHorizontalGroup(
            theatre2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(theatre2Layout.createSequentialGroup()
                .addGroup(theatre2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(theatre2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(timing3)
                        .addGap(56, 56, 56)
                        .addComponent(timing4))
                    .addGroup(theatre2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(theatre2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(timing1)
                            .addComponent(timing2)
                            .addComponent(theatre4, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                            .addComponent(theatre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(theatre3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        theatre2Layout.setVerticalGroup(
            theatre2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(theatre2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(theatre2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(theatre2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(theatre1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(timing1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(theatre4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(timing2)
                        .addGap(30, 30, 30)
                        .addComponent(theatre3)
                        .addGap(33, 33, 33)
                        .addGroup(theatre2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timing4)
                            .addComponent(timing3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, theatre2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(theatre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(theatre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timing1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timing1ActionPerformed
         try {
             // TODO add your handling code here:
//         SeatingArrangement1 obj1=new SeatingArrangement1("Rambo: Last Blood",timings[2]);
SeatingArrangement1 obj1=new SeatingArrangement1("Rambo: Last Blood",timing1.getText(),theatre1.getText());
this.setVisible(false);
obj1.setVisible(true);
         } catch (SQLException ex) {
             Logger.getLogger(ShowTimingRambo.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_timing1ActionPerformed

    private void timing4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timing4ActionPerformed
         try {
             // TODO add your handling code here:
             SeatingArrangement1 obj1=new SeatingArrangement1("Rambo: Last Blood",timing4.getText(),theatre3.getText());
             this.setVisible(false);
             obj1.setVisible(true);
         } catch (SQLException ex) {
             Logger.getLogger(ShowTimingRambo.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_timing4ActionPerformed

    private void timing2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timing2ActionPerformed
         try {
             // TODO add your handling code here:
             SeatingArrangement1 obj1=new SeatingArrangement1("Rambo: Last Blood",timing2.getText(),theatre4.getText());
             this.setVisible(false);
             obj1.setVisible(true);
         } catch (SQLException ex) {
             Logger.getLogger(ShowTimingRambo.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_timing2ActionPerformed

    private void timing3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timing3ActionPerformed
         try {
             // TODO add your handling code here:
             SeatingArrangement1 obj1=new SeatingArrangement1("Rambo: Last Blood",timings[0],theatre3.getText());
             this.setVisible(false);
             obj1.setVisible(true);
         } catch (SQLException ex) {
             Logger.getLogger(ShowTimingRambo.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_timing3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
             // TODO add your handling code here:
             NowShowing obj1=new NowShowing();
             this.setVisible(false);
             obj1.setVisible(true);
         } catch (SQLException ex) {
             Logger.getLogger(ShowTimingRambo.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShowTimingRambo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowTimingRambo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowTimingRambo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowTimingRambo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ShowTimingRambo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ShowTimingRambo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel theatre1;
    private javax.swing.JPanel theatre2;
    private javax.swing.JLabel theatre3;
    private javax.swing.JLabel theatre4;
    private javax.swing.JButton timing1;
    private javax.swing.JButton timing2;
    private javax.swing.JButton timing3;
    private javax.swing.JButton timing4;
    // End of variables declaration//GEN-END:variables
}
