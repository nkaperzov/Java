/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TicTacToe extends javax.swing.JFrame {

    boolean player = false;
    boolean gameEnded = false;
    
    public TicTacToe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        txt.setEditable(false);
        txt.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txt.setText("MAKE AN ACTION");
        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
            
    private void GameEnded()
    {
          if(txt.getText().equals("PLAYER 1 WON") || txt.getText().equals("PLAYER 2 WON")){
            gameEnded = true;
        }
        else
        {
            gameEnded = false;
        }
          if (gameEnded == true)
          {
              b1.setEnabled(false);
              b2.setEnabled(false);
              b3.setEnabled(false);
              b4.setEnabled(false);
              b5.setEnabled(false);
              b6.setEnabled(false);
              b7.setEnabled(false);
              b8.setEnabled(false);
              b9.setEnabled(false);
          }
              
    }
    
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

        
        if (player == true) {
            b1.setText("X");
        } else {
            b1.setText("O");
        }
        
      
       
        player = !player;
        b1.setEnabled(false);
        if (b1.getText().equals("X") && b4.getText().equals("X") && b7.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b1.getText().equals("O") && b4.getText().equals("O") && b7.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else if (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else if (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else {
            txt.setText("NEXT TURN");
        }
        GameEnded();
        
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        
        if (player == true) {
            b2.setText("X");
        } else {
            b2.setText("O");
        }
        player = !player;
        b2.setEnabled(false);
        if (b3.getText().equals("X") && b1.getText().equals("X") && b2.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b3.getText().equals("O") && b1.getText().equals("O") && b2.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else if (b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else {
            txt.setText("NEXT TURN");
        }
        GameEnded();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if (player == true) {
            b3.setText("X");
        } else {
            b3.setText("O");
        }
        player = !player;
        b3.setEnabled(false);
        if (b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b7.getText().equals("X") && b5.getText().equals("X") && b3.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b3.getText().equals("X") && b6.getText().equals("X") && b9.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else if (b7.getText().equals("O") && b5.getText().equals("O") && b3.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else if (b3.getText().equals("O") && b6.getText().equals("O") && b9.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else {
            txt.setText("NEXT TURN");
        }
        GameEnded();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if (player == true) {
            b4.setText("X");
        } else {
            b4.setText("O");
        }
        player = !player;
        b4.setEnabled(false);
        if (b1.getText().equals("X") && b4.getText().equals("X") && b7.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b4.getText().equals("X") && b6.getText().equals("X") && b5.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b1.getText().equals("O") && b4.getText().equals("O") && b7.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else if (b4.getText().equals("O") && b6.getText().equals("O") && b5.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else {
            txt.setText("NEXT TURN");
        }
        GameEnded();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if (player == true) {
            b5.setText("X");
        } else {
            b5.setText("O");
        }
        
        player = !player;
        b5.setEnabled(false);
        if (b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b7.getText().equals("X") && b5.getText().equals("X") && b3.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else if (b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else if (b7.getText().equals("O") && b5.getText().equals("O") && b3.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else if (b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else {
            txt.setText("NEXT TURN");
        }
        GameEnded();

    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if (player == true) {
            b6.setText("X");
        } else {
            b6.setText("O");
        }
        player = !player;
        b6.setEnabled(false);
        if (b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b3.getText().equals("X") && b6.getText().equals("X") && b9.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else if (b3.getText().equals("O") && b6.getText().equals("O") && b9.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else {
            txt.setText("NEXT TURN");
        }
        GameEnded();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if (player == true) {
            b7.setText("X");
        } else {
            b7.setText("O");
        }
        player = !player;
        b7.setEnabled(false);
        if (b7.getText().equals("X") && b5.getText().equals("X") && b3.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b7.getText().equals("X") && b4.getText().equals("X") && b1.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b7.getText().equals("O") && b5.getText().equals("O") && b3.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else if (b7.getText().equals("O") && b4.getText().equals("O") && b1.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else if (b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else {
            txt.setText("NEXT TURN");
        }
        GameEnded();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if (player == true) {
            b8.setText("X");
        } else {
            b8.setText("O");
        }
        player = !player;
        b8.setEnabled(false);
               if (b8.getText().equals("X") && b7.getText().equals("X") && b9.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b8.getText().equals("X") && b5.getText().equals("X") && b2.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b8.getText().equals("O") && b7.getText().equals("O") && b9.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else if (b8.getText().equals("O") && b5.getText().equals("O") && b2.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else {
            txt.setText("NEXT TURN");
        }
               GameEnded();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if (player == true) {
            b9.setText("X");
        } else {
            b9.setText("O");
        }
        player = !player;
        b9.setEnabled(false);
        if (b9.getText().equals("X") && b7.getText().equals("X") && b8.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b9.getText().equals("X") && b6.getText().equals("X") && b3.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b9.getText().equals("X") && b5.getText().equals("X") && b1.getText().equals("X")) {
            txt.setText("PLAYER 2 WON");
        } else if (b9.getText().equals("O") && b6.getText().equals("O") && b3.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else if (b9.getText().equals("O") && b5.getText().equals("O") && b1.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else if (b9.getText().equals("O") && b7.getText().equals("O") && b8.getText().equals("O")) {
            txt.setText("PLAYER 1 WON");
        } else {
            txt.setText("NEXT TURN");
        }
        
        GameEnded();
    }//GEN-LAST:event_b9ActionPerformed

        
    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
       
  
    }//GEN-LAST:event_txtActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
