
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
public class ShowTiming extends javax.swing.JFrame {
        Connection conn;
        Statement stmt;
        ResultSet rs;
        String[] timings=new String[100];
        String[] theatres=new String[100];
    /**
     * Creates new form ShowTiming
     */
       public ShowTiming() throws SQLException {
        initComponents();
        
        conn = databaseConnection.connection();
        stmt = conn.createStatement();
        String sql="Select * from Theatres";
        rs=stmt.executeQuery(sql);
        String theatre="",timing="";
        int i=0;
        
        while(rs.next())
            {
               
                if("Joker (2019)".equals(rs.getString("MovieName")))
                {
                
                   theatre = rs.getString("TheatreName");
                   timing=rs.getString("ShowTiming");
                   timings[i]=timing;
                   theatres[i]=theatre;
                   i++;
                   System.out.println(theatre);
                }

            }
        abc.setText(theatres[2]);
        timing2.setText(timings[3]);
        timing1.setText(timings[2]);
        
        jLabel1.setText(theatres[1]);
        timing3.setText(timings[1]);
        
        jLabel2.setText(theatres[0]);
        timing4.setText(timings[0]);
        
       }
        //jLabel1

    ShowTiming(String joker_2019) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        abc = new javax.swing.JLabel();
        timing1 = new javax.swing.JButton();
        timing2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        timing3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        timing4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 0, 51));

        abc.setBackground(new java.awt.Color(255, 255, 255));
        abc.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        abc.setForeground(new java.awt.Color(255, 0, 51));
        abc.setText("jLabel1");

        timing1.setBackground(new java.awt.Color(255, 51, 51));
        timing1.setForeground(new java.awt.Color(255, 255, 255));
        timing1.setText("jButton1");
        timing1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timing1ActionPerformed(evt);
            }
        });

        timing2.setBackground(new java.awt.Color(255, 51, 51));
        timing2.setForeground(new java.awt.Color(255, 255, 255));
        timing2.setText("jButton1");
        timing2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timing2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("jLabel1");

        timing3.setBackground(new java.awt.Color(255, 51, 51));
        timing3.setForeground(new java.awt.Color(255, 255, 255));
        timing3.setText("jButton1");
        timing3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timing3ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("jLabel2");

        timing4.setBackground(new java.awt.Color(255, 51, 51));
        timing4.setForeground(new java.awt.Color(255, 255, 255));
        timing4.setText("jButton2");
        timing4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timing4ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("JOKER (2019)");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\dhruv\\OneDrive\\Desktop\\Project icons\\jokerfinal.jpg")); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\dhruv\\OneDrive\\Desktop\\Project icons\\movietiming.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timing4)
                    .addComponent(jLabel2)
                    .addComponent(abc, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(timing1)
                        .addGap(37, 37, 37)
                        .addComponent(timing2))
                    .addComponent(jLabel1)
                    .addComponent(timing3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(abc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timing1)
                            .addComponent(timing2))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(timing3)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)
                        .addComponent(timing4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2165, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timing4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timing4ActionPerformed
            try {
                // TODO add your handling code here:
                SeatingArrangement1 obj1=new SeatingArrangement1("Joker (2019)",timings[0],theatres[0]);
                this.setVisible(false);
//                new SeatingArrangement1("Joker (2019)",timings[0],theatres[0]);
                obj1.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ShowTiming.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_timing4ActionPerformed

    private void timing3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timing3ActionPerformed
            try {
                // TODO add your handling code here:
                SeatingArrangement1 obj1=new SeatingArrangement1("Joker (2019)",timings[1],theatres[1]);
                this.setVisible(false);
//                new SeatingArrangement1("Joker (2019)",timings[1],theatres[1]);
                obj1.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ShowTiming.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_timing3ActionPerformed

    private void timing1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timing1ActionPerformed
            try {
                // TODO add your handling code here:
                SeatingArrangement1 obj1=new SeatingArrangement1("Joker (2019)",timings[2],theatres[2]);
                this.setVisible(false);
//                new SeatingArrangement1("Joker (2019)",timings[2],theatres[2]);
                obj1.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ShowTiming.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_timing1ActionPerformed

    private void timing2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timing2ActionPerformed
            try {
                // TODO add your handling code here:
                SeatingArrangement1 obj1=new SeatingArrangement1("Joker (2019)",timings[3],theatres[2]);
                this.setVisible(false);
//                new SeatingArrangement1("Joker (2019)",timings[3],theatres[2]);
                obj1.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ShowTiming.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_timing2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try {
                // TODO add your handling code here:
                NowShowing obj1=new NowShowing();
                this.setVisible(false);
                obj1.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ShowTiming.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(ShowTiming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowTiming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowTiming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowTiming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ShowTiming().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ShowTiming.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton timing1;
    private javax.swing.JButton timing2;
    private javax.swing.JButton timing3;
    private javax.swing.JButton timing4;
    // End of variables declaration//GEN-END:variables

    private void SetVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
