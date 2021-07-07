
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vignesh
 */
public class AdminWindow extends javax.swing.JFrame {
    
    /**
     * Creates new form AdminWindow
     */
    DefaultTableModel dtm;       
    java.sql.Connection con;
    ResultSet rs;
    Statement stmt;

    public AdminWindow() {
        initComponents();
        //obj12 = new ConnectionSQL();
        
    }
    void ConnectionSQL(){
        try
        {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\DIVAKAR\\Documents\\Database\\Register");
            stmt= con.createStatement();
            System.out.println("Success");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Problem with connection of database");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 125));
        setResizable(false);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vignesh\\Documents\\Needed icons\\icons\\png\\black\\16x16\\search.png")); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Record Search");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }

        )
    );
    jScrollPane1.setViewportView(jTable1);

    Back.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    Back.setIcon(new javax.swing.ImageIcon("C:\\Users\\vignesh\\Documents\\Needed icons\\ic_arrow_back_black_18dp.png")); // NOI18N
    Back.setText("Back");
    Back.setMaximumSize(new java.awt.Dimension(90, 40));
    Back.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            BackActionPerformed(evt);
        }
    });

    jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
    jLabel2.setText("PRN");

    buttonGroup1.add(jRadioButton1);
    jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    jRadioButton1.setSelected(true);
    jRadioButton1.setText("Student Details");

    buttonGroup1.add(jRadioButton2);
    jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    jRadioButton2.setText("Lab Use");
    jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jRadioButton2ActionPerformed(evt);
        }
    });

    jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vignesh\\Documents\\Needed icons\\print.png")); // NOI18N
    jButton2.setText(" Print");
    jButton2.setMaximumSize(new java.awt.Dimension(90, 40));
    jButton2.setPreferredSize(new java.awt.Dimension(91, 35));
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
    jButton3.setText("Date/Time");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
        }
    });

    jMenu1.setText("File");

    jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
    jMenuItem3.setText("Open Report");
    jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem3ActionPerformed(evt);
        }
    });
    jMenu1.add(jMenuItem3);

    jMenuItem6.setText("Export Report");
    jMenu1.add(jMenuItem6);
    jMenu1.add(jSeparator1);

    jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
    jMenuItem8.setText("Exit");
    jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem8ActionPerformed(evt);
        }
    });
    jMenu1.add(jMenuItem8);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("Options");
    jMenu2.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            jMenu2ItemStateChanged(evt);
        }
    });

    jMenuItem9.setText("Admin Privileges");
    jMenuItem9.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            jMenuItem9ItemStateChanged(evt);
        }
    });
    jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem9ActionPerformed(evt);
        }
    });
    jMenu2.add(jMenuItem9);

    jMenuBar1.add(jMenu2);

    jMenu6.setText("Help");

    jMenuItem11.setText("Help Contents");
    jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem11ActionPerformed(evt);
        }
    });
    jMenu6.add(jMenuItem11);
    jMenu6.add(jSeparator2);

    jMenu5.setText("Developers");
    jMenu6.add(jMenu5);

    jMenuBar1.add(jMenu6);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(51, 51, 51))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField1)
                            .addGap(18, 18, 18)))
                    .addComponent(jRadioButton1)
                    .addGap(18, 18, 18)
                    .addComponent(jRadioButton2)
                    .addGap(47, 47, 47)
                    .addComponent(jButton1))
                .addGroup(layout.createSequentialGroup()
                    .addGap(381, 381, 381)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addGap(32, 32, 32)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGap(62, 62, 62))
        .addGroup(layout.createSequentialGroup()
            .addGap(51, 51, 51)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(28, 28, 28)
            .addComponent(jLabel3)
            .addGap(26, 26, 26)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jRadioButton1)
                .addComponent(jRadioButton2)
                .addComponent(jButton1))
            .addGap(30, 30, 30)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(40, 40, 40)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addComponent(jButton3))
            .addGap(42, 42, 42))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents
    public ArrayList<StudentRef> ProMems(String ValToSearch)
    {
        ArrayList<StudentRef> prom;
        prom = new ArrayList<StudentRef>();
        String searchquery="";
        try
        {
            stmt = con.createStatement();
            if(jRadioButton1.isSelected())
            {
                searchquery="SELECT * FROM StudentRef WHERE PRN LIKE '%"+ValToSearch+"%'";
            }
            else 
            {
                searchquery="SELECT * FROM Sample WHERE PRN LIKE '%"+ValToSearch+"%'";
            }
                rs=stmt.executeQuery(searchquery);
                StudentRef prom1;
                while(rs.next())
                {
                    prom1 = new StudentRef(rs.getString("PRN"),rs.getString("NAME"),rs.getString("CLASS"),rs.getString("PHONE"));
                    prom.add(prom1);
                }
            
            /*else 
            {
                searchquery="SELECT * FROM Sample WHERE PRN LIKE '%"+ValToSearch+"%'";
            }*/
            
            
        }
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null,e);
        }
        
        return prom;
    }
    public ArrayList<Sample> ProMems2(String ValToSearch)
    {
        ArrayList<Sample> prom2;
        prom2 = new ArrayList<Sample>();
        String searchquery="";
        try
        {
            stmt = con.createStatement();
            if(jRadioButton1.isSelected())
            {
                searchquery="SELECT * FROM StudentRef WHERE PRN LIKE '%"+ValToSearch+"%'";
            }
            else 
            {
                searchquery="SELECT * FROM Sample WHERE PRN LIKE '%"+ValToSearch+"%'";
            }
                rs=stmt.executeQuery(searchquery);
                Sample prom3;
                while(rs.next())
                {
                    prom3 = new Sample(rs.getString("PRN"),rs.getString("CHECKIN"),rs.getString("CHECKOUT"));
                    prom2.add(prom3);
                }
            
            /*else 
            {
                searchquery="SELECT * FROM Sample WHERE PRN LIKE '%"+ValToSearch+"%'";
            }*/
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null,e);
        }
        
        return prom2;
    }
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenuItem9ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ItemStateChanged

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdminPrivelages().setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenu2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ItemStateChanged

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ConnectionSQL();
        ArrayList<StudentRef> pm = ProMems(jTextField1.getText());
        ArrayList<Sample> pd = ProMems2(jTextField1.getText());
        DefaultTableModel model = new DefaultTableModel()
        { @Override
            public boolean isCellEditable(int row, int column) {
            return false;
        }
        };
        if(jRadioButton1.isSelected())
        {
            model.setColumnIdentifiers(new Object[]{"PRN","NAME","CLASS","PHONE"});
            Object[]row=new Object[4];
            for(int i=0;i<pm.size();i++)
            {
                row[0] = pm.get(i).getPrn();
                row[1] = pm.get(i).getName();
                row[2] = pm.get(i).getClas();
                row[3] = pm.get(i).getPhone();
                model.addRow(row);
                
            }
            System.out.println("Reached Here!!");
        }
        else
        {
            
                model.setColumnIdentifiers(new Object[]{"PRN","CHECK IN","CHECK OUT"});
                Object[]row=new Object[3];
                for(int i=0;i<pd.size();i++)
                {
                    row[0]=pd.get(i).getPrn();
                    row[1]=pd.get(i).getCheckin();
                    row[2]=pd.get(i).getCheckout();
                    model.addRow(row);
                }
         
        }
        jTable1.setModel(model);
        try
        {
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e){}
        
        
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AdminPrivelages().setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
            jTable1.print();
        }
        catch(Exception e){}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Time().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
