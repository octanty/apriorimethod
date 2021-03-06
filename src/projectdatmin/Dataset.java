/*
 * ProjectDatminAboutBox.java
 */

package projectdatmin;

import javax.swing.JButton;
import org.jdesktop.application.Action;

public class Dataset extends javax.swing.JDialog {

    public Dataset(java.awt.Frame parent) {
        super(parent);
        initComponents();
        JButton closeButton = null;
        getRootPane().setDefaultButton(closeButton);
    }

    @Action public void closeAboutBox() {
        dispose();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(projectdatmin.ProjectDatminApp.class).getContext().getResourceMap(Dataset.class);
        setTitle(resourceMap.getString("title")); // NOI18N
        setModal(true);
        setName("aboutBox"); // NOI18N
        setResizable(false);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Engineering", "Social", "Engineering", "Science", "Engineering", "Politic", "Engineering", "Engineering", "Engineering", "Social\""},
                {"Social", "Politic", "Social", null, "Social", "Religion", "Religion", "Social", null, "Politic"},
                {"Religion", null, "Science", null, "Politic", null, "Science", "Politic", null, null},
                {null, null, null, null, null, null, "Social", "Science", null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Transaksi 1", "Transaksi 2", "Transaksi3", "Transaksi 4", "Transaksi 5", "Transaksi 6", "Transaksi 7", "Transaksi 8", "Transaksi 9", "Transaksi 10"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setToolTipText(resourceMap.getString("table.toolTipText")); // NOI18N
        table.setName("table"); // NOI18N
        table.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("table.columnModel.title0")); // NOI18N
        table.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("table.columnModel.title1")); // NOI18N
        table.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("table.columnModel.title2")); // NOI18N
        table.getColumnModel().getColumn(3).setHeaderValue(resourceMap.getString("table.columnModel.title3")); // NOI18N
        table.getColumnModel().getColumn(4).setHeaderValue(resourceMap.getString("table.columnModel.title4")); // NOI18N
        table.getColumnModel().getColumn(5).setHeaderValue(resourceMap.getString("table.columnModel.title5")); // NOI18N
        table.getColumnModel().getColumn(6).setHeaderValue(resourceMap.getString("table.columnModel.title6")); // NOI18N
        table.getColumnModel().getColumn(7).setHeaderValue(resourceMap.getString("table.columnModel.title7")); // NOI18N
        table.getColumnModel().getColumn(8).setHeaderValue(resourceMap.getString("table.columnModel.title8")); // NOI18N
        table.getColumnModel().getColumn(9).setHeaderValue(resourceMap.getString("table.columnModel.title9")); // NOI18N

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void tableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableAncestorAdded
// TODO add your handling code here:
}//GEN-LAST:event_tableAncestorAdded
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
    
}
