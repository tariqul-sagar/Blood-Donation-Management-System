
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruhan
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    DatabaseConnection db;

    public login() {
        db=new DatabaseConnection();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        li = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        usertxt = new javax.swing.JTextField();
        passtxt = new javax.swing.JPasswordField();
        jButton6 = new javax.swing.JButton();
        reg = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        regusertxt = new javax.swing.JTextField();
        regpasstxt = new javax.swing.JPasswordField();
        regcpasstxt = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(832, 600));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turn-off.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(735, 20, 90, 50);

        li.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Log In", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        li.setToolTipText("");
        li.setOpaque(false);
        li.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avatar (1).png"))); // NOI18N
        li.add(jLabel1);
        jLabel1.setBounds(20, 20, 40, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/key.png"))); // NOI18N
        li.add(jLabel2);
        jLabel2.setBounds(20, 120, 32, 60);

        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));
        li.add(jSeparator1);
        jSeparator1.setBounds(60, 80, 189, 20);

        jSeparator2.setForeground(new java.awt.Color(51, 0, 51));
        li.add(jSeparator2);
        jSeparator2.setBounds(58, 161, 190, 40);

        jButton3.setBackground(new java.awt.Color(204, 0, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh.png"))); // NOI18N
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        li.add(jButton3);
        jButton3.setBounds(50, 220, 69, 42);

        usertxt.setBackground(new java.awt.Color(178, 215, 255));
        usertxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        usertxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usertxt.setBorder(null);
        usertxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usertxt.setOpaque(false);
        li.add(usertxt);
        usertxt.setBounds(60, 50, 190, 30);

        passtxt.setBackground(new java.awt.Color(178, 215, 255));
        passtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passtxt.setBorder(null);
        passtxt.setOpaque(false);
        li.add(passtxt);
        passtxt.setBounds(60, 130, 190, 30);

        jButton6.setBackground(new java.awt.Color(255, 102, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/in.png"))); // NOI18N
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        li.add(jButton6);
        jButton6.setBounds(160, 220, 81, 42);

        getContentPane().add(li);
        li.setBounds(50, 240, 280, 310);

        reg.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Register", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N
        reg.setOpaque(false);
        reg.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Username               :");
        reg.add(jLabel3);
        jLabel3.setBounds(20, 50, 127, 25);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Password                 :");
        reg.add(jLabel4);
        jLabel4.setBounds(20, 110, 129, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Confirm Password   :");
        reg.add(jLabel5);
        jLabel5.setBounds(20, 170, 130, 30);

        regusertxt.setBackground(new java.awt.Color(178, 215, 255));
        regusertxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regusertxt.setOpaque(false);
        reg.add(regusertxt);
        regusertxt.setBounds(160, 50, 161, 30);

        regpasstxt.setBackground(new java.awt.Color(178, 215, 255));
        regpasstxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regpasstxt.setOpaque(false);
        reg.add(regpasstxt);
        regpasstxt.setBounds(160, 110, 161, 30);

        regcpasstxt.setBackground(new java.awt.Color(178, 215, 255));
        regcpasstxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        regcpasstxt.setOpaque(false);
        reg.add(regcpasstxt);
        regcpasstxt.setBounds(160, 170, 161, 30);

        jButton4.setBackground(new java.awt.Color(204, 0, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh.png"))); // NOI18N
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        reg.add(jButton4);
        jButton4.setBounds(67, 240, 90, 47);

        jButton5.setBackground(new java.awt.Color(255, 102, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/in.png"))); // NOI18N
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        reg.add(jButton5);
        jButton5.setBounds(200, 240, 92, 47);

        getContentPane().add(reg);
        reg.setBounds(470, 240, 340, 310);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Daffodil International University");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 40, 280, 20);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jLabel8.setText("Blood Donor Management System");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 70, 530, 27);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 840, 640);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 840, 120);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(770, 0, 70, 580);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 560, 800, 532);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(730, 550, 110, 70);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s006_LightBlue.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(800, -6, 800, 110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        usertxt.setText(null);
        passtxt.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        regusertxt.setText(null);
        regpasstxt.setText(null);
        regcpasstxt.setText(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        
        String userr=usertxt.getText();
        String passs=passtxt.getText();
        
        try{                                                            //Database exception handelling
            Statement st=db.getDbStatement();
           ResultSet rs=st.executeQuery("select *from user");           // Searching result
           
           int count=0;
           
           while(rs.next()){
               String s1=rs.getString("Username");
               String s2=rs.getString("Password");
               
               if(s1.equals(userr) && s2.equals(passs)){              //comparing
                   
                   int check=JOptionPane.showConfirmDialog(null,"Are you Admin?","Choose your roll........",JOptionPane.YES_NO_OPTION);
                    if(check==0){
                        Admin a=new Admin();
                        close();
                        a.setVisible(true);
                    }
                    if(check==1){
                        
                        String update="UPDATE `userselection` SET `user`='"+usertxt.getText()+"' WHERE 1";  // User update
                        executeSQLQuery2(update);
                        
                        Profile p=new Profile();
                        p.setVisible(true);
                        close();
                                
                    }
                    count++;
                    break;
               }
           }
           
           if(count==0){
               JOptionPane.showMessageDialog(null,"Invalid Username/Password","Sorry !!!",JOptionPane.YES_OPTION);
           }
           
       }catch(Exception e){
            System.out.println(e);
       }
        
        
        //option show
        
//        int check=JOptionPane.showConfirmDialog(null,"Are you Admin?","Choose your roll........",JOptionPane.YES_NO_OPTION);
//        if(check==0){
//            Admin a=new Admin();
//            close();
//            a.setVisible(true);
//        }
//        if(check==1){
//            
//            
//        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String name=regusertxt.getText();
        String pass=regpasstxt.getText();
        String cpass=regcpasstxt.getText();
        
        if(name.equals("") || pass.equals("") || cpass.equals("")){        //No field cant be empty
            JOptionPane.showMessageDialog(null,"Please fill up all Field.","Alert",JOptionPane.WARNING_MESSAGE);   
        }else{
           if(name.length()<4 || pass.length()<4){                                  // name/pass must be grater than 3
               JOptionPane.showMessageDialog(null,"Username/Password length must be grater then 3!","Alert",JOptionPane.WARNING_MESSAGE); 
           }else{
                                      //checking admin approval correct or not
                    if(pass.equals(cpass)){           // If admin approval correct
                        
                        boolean check=false;
                        
                        try{                                                            //Database exception handelling

                                Statement st=db.getDbStatement();
                                ResultSet rs=st.executeQuery("select *from user");           // Searching result
           
                                int count=0;
           
                                while(rs.next()){
                                    String s1=rs.getString("Username");
                                    
                                    if(s1.equals(name)){
                                        check=true;
                                    }
                                }
           
                            }catch(Exception e){
            
                            }
                        
                        if(check){
                            JOptionPane.showMessageDialog(null,"Username Already Exists.\n       Try Another One.","Alert",JOptionPane.WARNING_MESSAGE);
                            regusertxt.setText(null);
                        }else{
                            CompleteProfile cp=new CompleteProfile();
                            close();
                            cp.getItems(name, pass);
                            cp.setVisible(true);
                             
                        }
                        
                        
                        //code will go here
                           
                        //code will end here
                    }else{
                        JOptionPane.showMessageDialog(null,"Check Confirm Password field.","Alert",JOptionPane.WARNING_MESSAGE);

                    }
                
                
        
              }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    
    
    private void executeSQLQuery2(String query) {
       try{
           Statement st=db.getDbStatement();
          
           if(st.executeUpdate(query)==1){          // For update
               
//ys/no code hbe
           }else{
               
           }
           
           
       }catch(Exception e){
            
       }
    }
    
    
    
    private void executeSQLQuery(String query) {
       try{

           Statement st=db.getDbStatement();
          
           if(st.executeUpdate(query)==1){
               JOptionPane.showMessageDialog(null,"Registration Successful!!","Congrats..",JOptionPane.INFORMATION_MESSAGE);
               regusertxt.setText(null);
               regpasstxt.setText(null);
               regcpasstxt.setText(null);
               
               CompleteProfile cp=new CompleteProfile();
               close();
               cp.setVisible(true);
               
//ys/no code hbe
           }else{
               JOptionPane.showMessageDialog(null,"Registration Unsuccessful!!","Sorry!",JOptionPane.WARNING_MESSAGE); 
           }
           
           
       }catch(Exception e){
            
       }
    }
    
    
    public void close(){           // for closing background window  use this function and then dispose class
        WindowEvent winclose=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
    }
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel li;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JPanel reg;
    private javax.swing.JPasswordField regcpasstxt;
    private javax.swing.JPasswordField regpasstxt;
    private javax.swing.JTextField regusertxt;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}