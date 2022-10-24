
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author juhoonlee
 */
public class MainFrame extends javax.swing.JFrame {
    int iMenu_idx = 0;
    int ix, iy, width, height;
    Color cData = new Color(0, 0, 255);
    
    Font objFont;
    String strData = null;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        
        jPopupMenu1.add(mnuFile_Open);
        jPopupMenu1.add(mnuFile_Save);
        jPopupMenu1.addSeparator();
        jPopupMenu1.add(mnuFile_Exit);
    }
    
    public void paint(Graphics g){
        super.paintComponents(g);
        g.setColor(cData);
        switch(iMenu_idx){
            case 31:
                g.drawLine(ix, iy, 250, 250);
                break;
            case 32:
                g.drawLine(ix, iy, width, height);
                g.fillOval(ix, iy, width, height);
                break;
            case 33:
                g.drawRect(ix, iy, width, height);
                g.fillRect(ix, iy, width, height);
                break;
            case 41:
                strData = "Arial font";
                g.setFont(objFont);
                g.drawString(strData, ix, iy);
            case 42:
                strData = "궁서체 입니다";
                g.setFont(objFont);
                g.drawString(strData, ix, iy);
            case 43:
                strData = "돋음체 입니다";
                g.setFont(objFont);
                g.drawString(strData, ix, iy);
            default:
                break;
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

        jFileChooser1 = new javax.swing.JFileChooser();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuFile_Open = new javax.swing.JRadioButtonMenuItem();
        mnuFile_Save = new javax.swing.JRadioButtonMenuItem();
        mnuFile_Exit = new javax.swing.JRadioButtonMenuItem();
        mnuEdit = new javax.swing.JMenu();
        mnuGraphic = new javax.swing.JMenu();
        mnuGraphic_Line = new javax.swing.JMenuItem();
        mnuGraphic_Ellipse = new javax.swing.JMenuItem();
        mnuGraphic_Rectangle = new javax.swing.JMenuItem();
        munFont = new javax.swing.JMenu();
        mnuFont_Arial = new javax.swing.JMenuItem();
        mnuFont_Gungseo = new javax.swing.JMenuItem();
        mnuFont_Dotum = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        mnuFile.setText("File");

        mnuFile_Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFile_Open.setSelected(true);
        mnuFile_Open.setText("열기(Open)");
        mnuFile_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFile_OpenActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFile_Open);

        mnuFile_Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFile_Save.setSelected(true);
        mnuFile_Save.setText("저장(Save)");
        mnuFile_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFile_SaveActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFile_Save);

        mnuFile_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFile_Exit.setSelected(true);
        mnuFile_Exit.setText("종료(Exit)");
        mnuFile_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFile_ExitActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFile_Exit);

        jMenuBar1.add(mnuFile);

        mnuEdit.setText("Edit");
        jMenuBar1.add(mnuEdit);

        mnuGraphic.setText("Graphic");

        mnuGraphic_Line.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuGraphic_Line.setText("Line");
        mnuGraphic_Line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGraphic_LineActionPerformed(evt);
            }
        });
        mnuGraphic_Line.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mnuGraphic_LineKeyPressed(evt);
            }
        });
        mnuGraphic.add(mnuGraphic_Line);

        mnuGraphic_Ellipse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuGraphic_Ellipse.setText("Ellipse");
        mnuGraphic_Ellipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGraphic_EllipseActionPerformed(evt);
            }
        });
        mnuGraphic_Ellipse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mnuGraphic_EllipseKeyPressed(evt);
            }
        });
        mnuGraphic.add(mnuGraphic_Ellipse);

        mnuGraphic_Rectangle.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuGraphic_Rectangle.setText("Rectangle");
        mnuGraphic_Rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGraphic_RectangleActionPerformed(evt);
            }
        });
        mnuGraphic_Rectangle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mnuGraphic_RectangleKeyPressed(evt);
            }
        });
        mnuGraphic.add(mnuGraphic_Rectangle);

        jMenuBar1.add(mnuGraphic);

        munFont.setText("Font");

        mnuFont_Arial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFont_Arial.setText("Arial");
        mnuFont_Arial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFont_ArialActionPerformed(evt);
            }
        });
        mnuFont_Arial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mnuFont_ArialKeyPressed(evt);
            }
        });
        munFont.add(mnuFont_Arial);

        mnuFont_Gungseo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFont_Gungseo.setText("궁서체");
        mnuFont_Gungseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFont_GungseoActionPerformed(evt);
            }
        });
        mnuFont_Gungseo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mnuFont_GungseoKeyPressed(evt);
            }
        });
        munFont.add(mnuFont_Gungseo);

        mnuFont_Dotum.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFont_Dotum.setText("돋음체");
        mnuFont_Dotum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFont_DotumActionPerformed(evt);
            }
        });
        mnuFont_Dotum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mnuFont_DotumKeyPressed(evt);
            }
        });
        munFont.add(mnuFont_Dotum);

        jMenuBar1.add(munFont);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuGraphic_LineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGraphic_LineActionPerformed
        this.setTitle("Line Menu Click.!");
        ix = 100;
        iy = 100;
        iMenu_idx = 31;
        this.repaint();
        
    }//GEN-LAST:event_mnuGraphic_LineActionPerformed

    private void mnuGraphic_EllipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGraphic_EllipseActionPerformed
        this.setTitle("Ellipse Menu Click.!");
        ix = iy = 100;
        width = height = 100;
        iMenu_idx = 32;
        this.repaint();
    }//GEN-LAST:event_mnuGraphic_EllipseActionPerformed

    private void mnuGraphic_RectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGraphic_RectangleActionPerformed
        this.setTitle("Ractangle Menu Click.!");
        ix = iy = 100;
        width = height = 100;
        iMenu_idx = 33;
        this.repaint();
    }//GEN-LAST:event_mnuGraphic_RectangleActionPerformed

    private void mnuGraphic_LineKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnuGraphic_LineKeyPressed
        this.setTitle("Line Menu Click.!");
        ix = 100;
        iy = 100;
        iMenu_idx = 31;
        this.repaint();
    }//GEN-LAST:event_mnuGraphic_LineKeyPressed

    private void mnuGraphic_EllipseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnuGraphic_EllipseKeyPressed
        this.setTitle("Ellipse Menu Click.!");
        ix = iy = 100;
        width = height = 100;
        iMenu_idx = 32;
        this.repaint();
    }//GEN-LAST:event_mnuGraphic_EllipseKeyPressed

    private void mnuGraphic_RectangleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnuGraphic_RectangleKeyPressed
        this.setTitle("Ractangle Menu Click.!");
        ix = iy = 100;
        width = height = 100;
        iMenu_idx = 33;
        this.repaint();
    }//GEN-LAST:event_mnuGraphic_RectangleKeyPressed

    private void mnuFile_OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFile_OpenActionPerformed
        jFileChooser1.showOpenDialog(null);
    }//GEN-LAST:event_mnuFile_OpenActionPerformed

    private void mnuFile_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFile_SaveActionPerformed
        jFileChooser1.showSaveDialog(null);
    }//GEN-LAST:event_mnuFile_SaveActionPerformed

    private void mnuFile_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFile_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuFile_ExitActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (evt.getButton() == 3){
            jPopupMenu1.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_formMouseClicked

    private void mnuFont_ArialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFont_ArialActionPerformed
        ix = 10;
        iy = 100;
        objFont = new Font("Arial", Font.PLAIN, 24);
        iMenu_idx = 41;
        this.repaint();
    }//GEN-LAST:event_mnuFont_ArialActionPerformed

    private void mnuFont_GungseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFont_GungseoActionPerformed
        ix = 10;
        iy = 100;
        objFont = new Font("궁서체", Font.BOLD, 24);
        iMenu_idx = 42;
        this.repaint();
    }//GEN-LAST:event_mnuFont_GungseoActionPerformed

    private void mnuFont_DotumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFont_DotumActionPerformed
        ix = 10;
        iy = 100;
        objFont = new Font("돋음체", Font.ITALIC, 24);
        iMenu_idx = 43;
        this.repaint();
    }//GEN-LAST:event_mnuFont_DotumActionPerformed

    private void mnuFont_ArialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnuFont_ArialKeyPressed
        ix = 10;
        iy = 100;
        objFont = new Font("Arial", Font.PLAIN, 24);
        iMenu_idx = 41;
        this.repaint();
    }//GEN-LAST:event_mnuFont_ArialKeyPressed

    private void mnuFont_GungseoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnuFont_GungseoKeyPressed
        ix = 10;
        iy = 100;
        objFont = new Font("궁서체", Font.BOLD, 24);
        iMenu_idx = 42;
        this.repaint();
    }//GEN-LAST:event_mnuFont_GungseoKeyPressed

    private void mnuFont_DotumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnuFont_DotumKeyPressed
        ix = 10;
        iy = 100;
        objFont = new Font("돋음체", Font.ITALIC, 24);
        iMenu_idx = 43;
        this.repaint();
    }//GEN-LAST:event_mnuFont_DotumKeyPressed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenu mnuEdit;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JRadioButtonMenuItem mnuFile_Exit;
    private javax.swing.JRadioButtonMenuItem mnuFile_Open;
    private javax.swing.JRadioButtonMenuItem mnuFile_Save;
    private javax.swing.JMenuItem mnuFont_Arial;
    private javax.swing.JMenuItem mnuFont_Dotum;
    private javax.swing.JMenuItem mnuFont_Gungseo;
    private javax.swing.JMenu mnuGraphic;
    private javax.swing.JMenuItem mnuGraphic_Ellipse;
    private javax.swing.JMenuItem mnuGraphic_Line;
    private javax.swing.JMenuItem mnuGraphic_Rectangle;
    private javax.swing.JMenu munFont;
    // End of variables declaration//GEN-END:variables
}
