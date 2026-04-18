package vista;

import java.awt.Color;


public class FromNiveles extends javax.swing.JFrame {
    
    private TableroSudoku tableroSudoku;
    
    private int xPos,yPos;
    
    public FromNiveles(TableroSudoku tableroSudoku) {
        this.tableroSudoku = tableroSudoku;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLDificultad = new javax.swing.JLabel();
        JPDificil = new javax.swing.JPanel();
        JLDificil = new javax.swing.JLabel();
        JPFacil = new javax.swing.JPanel();
        JLFacil = new javax.swing.JLabel();
        JPNormal = new javax.swing.JPanel();
        JLNormal = new javax.swing.JLabel();
        JPCerrar = new javax.swing.JPanel();
        JLCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(221, 245, 242));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 107, 149), 10, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 400));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(null);

        JLDificultad.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        JLDificultad.setForeground(new java.awt.Color(0, 107, 149));
        JLDificultad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLDificultad.setText("DIFICULTAD");
        jPanel1.add(JLDificultad);
        JLDificultad.setBounds(0, 90, 300, 35);

        JPDificil.setBackground(new java.awt.Color(167, 242, 238));
        JPDificil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 107, 149), 10, true));
        JPDificil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPDificilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPDificilMouseExited(evt);
            }
        });

        JLDificil.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        JLDificil.setForeground(new java.awt.Color(0, 107, 149));
        JLDificil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLDificil.setText("DIFÍCIL");
        JLDificil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLDificilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLDificilMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JLDificilMousePressed(evt);
            }
        });

        javax.swing.GroupLayout JPDificilLayout = new javax.swing.GroupLayout(JPDificil);
        JPDificil.setLayout(JPDificilLayout);
        JPDificilLayout.setHorizontalGroup(
            JPDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLDificil, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        JPDificilLayout.setVerticalGroup(
            JPDificilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLDificil, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPDificil);
        JPDificil.setBounds(55, 300, 190, 60);

        JPFacil.setBackground(new java.awt.Color(167, 242, 238));
        JPFacil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 107, 149), 10, true));
        JPFacil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPFacilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPFacilMouseExited(evt);
            }
        });

        JLFacil.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        JLFacil.setForeground(new java.awt.Color(0, 107, 149));
        JLFacil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLFacil.setText("FACÍL");
        JLFacil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLFacilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLFacilMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JLFacilMousePressed(evt);
            }
        });

        javax.swing.GroupLayout JPFacilLayout = new javax.swing.GroupLayout(JPFacil);
        JPFacil.setLayout(JPFacilLayout);
        JPFacilLayout.setHorizontalGroup(
            JPFacilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPFacilLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPFacilLayout.setVerticalGroup(
            JPFacilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLFacil, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPFacil);
        JPFacil.setBounds(55, 160, 190, 60);

        JPNormal.setBackground(new java.awt.Color(167, 242, 238));
        JPNormal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 107, 149), 10, true));
        JPNormal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPNormalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPNormalMouseExited(evt);
            }
        });

        JLNormal.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        JLNormal.setForeground(new java.awt.Color(0, 107, 149));
        JLNormal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLNormal.setText("NORMAL");
        JLNormal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLNormalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLNormalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JLNormalMousePressed(evt);
            }
        });

        javax.swing.GroupLayout JPNormalLayout = new javax.swing.GroupLayout(JPNormal);
        JPNormal.setLayout(JPNormalLayout);
        JPNormalLayout.setHorizontalGroup(
            JPNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPNormalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPNormalLayout.setVerticalGroup(
            JPNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLNormal, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(JPNormal);
        JPNormal.setBounds(55, 230, 190, 60);

        JPCerrar.setBackground(new java.awt.Color(167, 242, 238));
        JPCerrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 107, 149), 10, true));
        JPCerrar.setMinimumSize(new java.awt.Dimension(50, 100));
        JPCerrar.setPreferredSize(new java.awt.Dimension(50, 100));
        JPCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPCerrarMouseExited(evt);
            }
        });

        JLCerrar.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 30)); // NOI18N
        JLCerrar.setForeground(new java.awt.Color(0, 107, 149));
        JLCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLCerrar.setText("X");
        JLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout JPCerrarLayout = new javax.swing.GroupLayout(JPCerrar);
        JPCerrar.setLayout(JPCerrarLayout);
        JPCerrarLayout.setHorizontalGroup(
            JPCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        JPCerrarLayout.setVerticalGroup(
            JPCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPCerrarLayout.createSequentialGroup()
                .addComponent(JLCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        jPanel1.add(JPCerrar);
        JPCerrar.setBounds(230, 20, 50, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JLFacilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLFacilMousePressed
        tableroSudoku.generarSudoku(1);
        this.setVisible(false);
    }//GEN-LAST:event_JLFacilMousePressed

    private void JLNormalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLNormalMousePressed
        tableroSudoku.generarSudoku(2);
        this.setVisible(false);
    }//GEN-LAST:event_JLNormalMousePressed

    private void JLDificilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLDificilMousePressed
        tableroSudoku.generarSudoku(3);
        this.setVisible(false);
    }//GEN-LAST:event_JLDificilMousePressed

    private void JLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCerrarMouseClicked
            this.setVisible(false);
    }//GEN-LAST:event_JLCerrarMouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(evt.getXOnScreen() - xPos, evt.getYOnScreen() - yPos);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xPos = evt.getX();
        yPos = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void JLFacilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLFacilMouseEntered
        JPFacil.setBackground(new Color(88,201,185));
        JLFacil.setForeground(Color.white);
    }//GEN-LAST:event_JLFacilMouseEntered

    private void JPFacilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPFacilMouseEntered
        JPFacil.setBackground(new Color(88,201,185));
        JLFacil.setForeground(Color.white);
    }//GEN-LAST:event_JPFacilMouseEntered

    private void JPNormalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPNormalMouseEntered
        JPNormal.setBackground(new Color(88,201,185));
        JLNormal.setForeground(Color.white);
    }//GEN-LAST:event_JPNormalMouseEntered

    private void JPDificilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPDificilMouseEntered
        JPDificil.setBackground(new Color(88,201,185));
        JLDificil.setForeground(Color.white);
    }//GEN-LAST:event_JPDificilMouseEntered

    private void JPCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPCerrarMouseEntered
        JPCerrar.setBackground(Color.red);
        JLCerrar.setForeground(Color.white);
    }//GEN-LAST:event_JPCerrarMouseEntered

    private void JLCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCerrarMouseEntered
        JPCerrar.setBackground(Color.red);
        JLCerrar.setForeground(Color.white);
    }//GEN-LAST:event_JLCerrarMouseEntered

    private void JLNormalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLNormalMouseEntered
        JPNormal.setBackground(new Color(88,201,185));
        JLNormal.setForeground(Color.white);
    }//GEN-LAST:event_JLNormalMouseEntered

    private void JLDificilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLDificilMouseEntered
        JPDificil.setBackground(new Color(88,201,185));
        JLDificil.setForeground(Color.white);
    }//GEN-LAST:event_JLDificilMouseEntered

    private void JLCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCerrarMouseExited
        JPCerrar.setBackground(new Color(167,242,238));
        JLCerrar.setForeground(new Color(0,107,149));
    }//GEN-LAST:event_JLCerrarMouseExited

    private void JLFacilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLFacilMouseExited
        JPFacil.setBackground(new Color(167,242,238));
        JLFacil.setForeground(new Color(0,107,149));
    }//GEN-LAST:event_JLFacilMouseExited

    private void JLNormalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLNormalMouseExited
        JPNormal.setBackground(new Color(167,242,238));
        JLNormal.setForeground(new Color(0,107,149));
    }//GEN-LAST:event_JLNormalMouseExited

    private void JLDificilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLDificilMouseExited
        JPDificil.setBackground(new Color(167,242,238));
        JLDificil.setForeground(new Color(0,107,149));
    }//GEN-LAST:event_JLDificilMouseExited

    private void JPCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPCerrarMouseExited
        JPCerrar.setBackground(new Color(167,242,238));
        JLCerrar.setForeground(new Color(0,107,149));
    }//GEN-LAST:event_JPCerrarMouseExited

    private void JPFacilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPFacilMouseExited
        JPFacil.setBackground(new Color(167,242,238));
        JLFacil.setForeground(new Color(0,107,149));
    }//GEN-LAST:event_JPFacilMouseExited

    private void JPNormalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPNormalMouseExited
        JPNormal.setBackground(new Color(167,242,238));
        JLNormal.setForeground(new Color(0,107,149));
    }//GEN-LAST:event_JPNormalMouseExited

    private void JPDificilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPDificilMouseExited
        JPDificil.setBackground(new Color(167,242,238));
        JLDificil.setForeground(new Color(0,107,149));
    }//GEN-LAST:event_JPDificilMouseExited

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLCerrar;
    public javax.swing.JLabel JLDificil;
    private javax.swing.JLabel JLDificultad;
    public javax.swing.JLabel JLFacil;
    public javax.swing.JLabel JLNormal;
    private javax.swing.JPanel JPCerrar;
    private javax.swing.JPanel JPDificil;
    private javax.swing.JPanel JPFacil;
    private javax.swing.JPanel JPNormal;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
