/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kiddy
 */
public class TabelFrame extends javax.swing.JFrame {

    // Variable table model
    private DefaultTableModel model;
    
    // Variable table temporary model
    private DefaultTableModel tempModel;
    
    // Variable current id
    private int id = 0;
    
    // Varieble id yang dipilih
    private int selectedId = 0;
    
    /**
     * Creates new form TabelFrame
     */
    public TabelFrame() {
        initComponents();
        
        // Memanggil fungsi init table
        this.initTable();
    }
    
    private void initTable() {
        // Initialize Table
        model = new DefaultTableModel();
        tb_data.setModel(model);
        
        // Menambahkan kolom awal pada bagian atas
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Phone Number");
        model.addColumn("Gender");
        
        // Membuat tombol agar tidak terlihat saat pertama kali dijalankan
        btn_delete.setVisible(false); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_data = new javax.swing.JTable();
        tf_phone = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        tf_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cb_gender = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tf_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_dataMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_data);

        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama");

        jLabel2.setText("Nomor Telfon");

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jLabel3.setText("Jenis Kelamin");

        cb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pria", "Wanita", "Waria", "Non Gender", "Hemaprodite" }));

        jLabel4.setText("ID");

        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tf_name, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_phone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cb_gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete)
                    .addComponent(btn_submit))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetForm() {
        // Mengembalikan id yang dipilih menjadi 0
        this.selectedId = 0;
        
        // Menghapus text field
        tf_name.setText("");
        tf_phone.setText("");
        tf_search.setText("");
        
        // Mengembalikan posisi index gender menjadi 0, yaitu Pria.
        cb_gender.setSelectedIndex(0);
        
        // Menghilangkan tombol hapus kembali
        btn_delete.setVisible(false);
        
        tb_data.setModel(model);
    }
    
    // Fungsi untuk mengambil baris yang diklik
    private String getSelectedRow() {
         int selectedRowIndex = tb_data.getSelectedRow();
         Object selectedObject = (Object) tb_data.getModel().getValueAt(
            selectedRowIndex, 0 // Mendapatkan data ID pada kolom ke 0
         );
         
         return String.valueOf(selectedObject);    
    }
    
    // Fungsi untuk menambahkan data ke model tabel
    private void store() {
        String name = tf_name.getText();
        String phone = tf_phone.getText();
        String gender = cb_gender.getSelectedItem().toString();

        this.id = this.id + 1;
        String id = String.valueOf(this.id);

        Object[] obj = new Object[]{
            id,
            name,
            phone,
            gender
        };
        
        this.model.addRow(obj);
    }
    
    // Fungsi untuk mengubah data yang ada pada tabel
    private void update() {
        String selectedId = String.valueOf(this.selectedId);
        
        String name = tf_name.getText();
        String phone = tf_phone.getText();
        String gender = cb_gender.getSelectedItem().toString();
        
        for (int i = 0; model.getRowCount() > i; i++) {
            String id = (String) model.getValueAt(i, 0);
            
            if (id.equals(selectedId)) {
                model.setValueAt(name, i, 1);
                model.setValueAt(phone, i, 2);
                model.setValueAt(gender, i, 3);
                break;
            }
        }
    }
    
    // Fungsi apabila tombol submit ditekan
    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        String validation = this.validateForm();
        
        if(validation.length() > 0) {
            JOptionPane.showMessageDialog(null, validation, "Validation Error!", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        if (this.selectedId > 0) {
            this.update();
        } else {
            this.store();
        }
        
        this.resetForm();
    }//GEN-LAST:event_btn_submitActionPerformed

    // Fungsi apabila baris pada tabel ditekan oleh mouse
    private void tb_dataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_dataMousePressed
        // TODO add your handling code here:
        String row = this.getSelectedRow(); //2
        this.search(row);
        
        tf_search.setText(String.valueOf(this.selectedId));
    }//GEN-LAST:event_tb_dataMousePressed

    // Fungsi apabila tombol delete ditekan
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tb_data.getSelectedRow();
        model.removeRow(selectedRowIndex);
        
        this.resetForm();
    }//GEN-LAST:event_btn_deleteActionPerformed
    
    private void search(String _id) {
        
        String name = null;
        String phone = null;
        String gender = null;

        // Pencarian baris dan kolom pada model tabel
        for (int i = 0; model.getRowCount() > i; i++) {
            String id = (String) model.getValueAt(i, 0); //1
            
            if (id.equals(_id)) {
                this.selectedId = Integer.parseInt(id);
                
                name = (String) model.getValueAt(i, 1);
                phone = (String) model.getValueAt(i, 2);
                gender = (String) model.getValueAt(i, 3);
                
                // Tombol 
                btn_delete.setVisible(true);
                break;
            }
            
        }
        
        if(name == null) {
            this.selectedId = 0;
        }
        
        tf_name.setText(name);
        tf_phone.setText(phone);
        cb_gender.setSelectedItem(gender);
    }
    
    private String validateForm() {
        List<String> flag = new ArrayList<String>();
        String alert = "";

        String name = tf_name.getText();
        
        if(name.length() < 1) {
            flag.add("Nama tidak boleh kosong!");
        }
        
        if(!name.matches("[a-zA-Z]+")){
            flag.add("Nama hanya boleh berisi karakter saja!");
        }
        
        String phone = tf_phone.getText();
        
        if(phone.length() < 1) {
            flag.add("Nomor telfon tidak boleh kosong!");
        }
        
        if(!phone.matches("[0-9]+")){
            flag.add("Nomor telfon hanya boleh berisi angka saja!");
        }
        
        if (flag.size() > 0) {
            for (String msg : flag) {
                alert += (msg + "\n");
            }
        }
        
        return alert;
    }
    
    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        tempModel = new DefaultTableModel();
        tb_data.setModel(tempModel);
        
        // Menambahkan kolom awal pada bagian atas
        tempModel.addColumn("ID");
        tempModel.addColumn("Name");
        tempModel.addColumn("Phone Number");
        tempModel.addColumn("Gender");
        
        String id = tf_search.getText();
        
        this.search(id);
        
        if (this.selectedId < 1) {
            JOptionPane.showMessageDialog(null, "We can't found any data", "Data not found", JOptionPane.INFORMATION_MESSAGE);
            this.resetForm();
            return;
        }
        
        Object[] obj = new Object[]{
            this.selectedId,
            tf_name.getText(),
            tf_phone.getText(),
            cb_gender.getSelectedItem().toString()
        };
        
        tempModel.addRow(obj);
    }//GEN-LAST:event_btn_searchActionPerformed

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
            java.util.logging.Logger.getLogger(TabelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_submit;
    private javax.swing.JComboBox<String> cb_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_data;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_phone;
    private javax.swing.JTextField tf_search;
    // End of variables declaration//GEN-END:variables
}
