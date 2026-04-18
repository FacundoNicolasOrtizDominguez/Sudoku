package vista;

import controlador.ControladorInterfaz;
import java.awt.Color;

public class FromSudoku extends javax.swing.JFrame {

    public static TableroSudoku tableroSudoku;
    private TableroNumeros tableroNumeros;
    private FromNiveles fromNiveles;
    public static ControladorInterfaz controlador;
    private boolean estadoCrear;

    private int xPos, yPos;

    public FromSudoku(ControladorInterfaz controlador) {
        this.controlador = controlador;
        initComponents();
        iniciarComponentes();
    }

    public void iniciarComponentes() {
        
        tableroSudoku = new TableroSudoku(controlador);

        tableroSudoku.setTxtAncho(55);
        tableroSudoku.setTxtAlto(55);
        tableroSudoku.setTxtTamañoLetra(27);
        tableroSudoku.setTxtMargen(8);
        tableroSudoku.setPanelBackground(new Color(0, 107, 149));

        tableroSudoku.setTxtBackground1(Color.white);
        tableroSudoku.setTxtForeground1(Color.black);
        tableroSudoku.setTxtBackground2(new Color(117, 224, 237));//cuadrante
        tableroSudoku.setTxtForeground2(Color.black);
        tableroSudoku.setTxtBackground3(new Color(22, 149, 181)); //seleccion
        tableroSudoku.setTxtForeground3(Color.white);
        tableroSudoku.setTxtBackground4(new Color(100, 179, 184));
        tableroSudoku.setTxtForeground4(Color.black);
        tableroSudoku.setTxtBackground5(new Color(201, 230, 231)); //txt creadps
        tableroSudoku.setTxtForeground5(Color.BLACK);

        panelFondo.add(tableroSudoku);
        tableroSudoku.setLocation(70, 120);
        tableroSudoku.setVisible(true);
        tableroSudoku.crearSudoku();

        tableroNumeros = new TableroNumeros();
        tableroNumeros.setTxtAncho(55);
        tableroNumeros.setTxtAlto(55);
        tableroNumeros.setTxtMargen(8);
        tableroNumeros.setTxtTamañoLetra(37);
        tableroNumeros.setPanelBackground(new Color(0, 107, 149));
        tableroNumeros.setTxtBackground1(new Color(167, 242, 238));
        tableroNumeros.setTxtForeground1(new Color(0, 107, 149));
        tableroNumeros.setTxtBackground2(new Color(88, 201, 185));
        tableroNumeros.setTxtForeground2(Color.white);
        panelFondo.add(tableroNumeros);
        tableroNumeros.crearTablero();
        tableroNumeros.setLocation(625, 450);
        tableroNumeros.setVisible(true);

        tableroSudoku.generarSudoku(2);

        estadoCrear = true;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        JLSudoku = new javax.swing.JLabel();
        JPNuevaPartida = new javax.swing.JPanel();
        JLNuevaPartida = new javax.swing.JLabel();
        JPLimpiar = new javax.swing.JPanel();
        JLLimpiar = new javax.swing.JLabel();
        JPComprobar = new javax.swing.JPanel();
        JLComprobar = new javax.swing.JLabel();
        JPCrear = new javax.swing.JPanel();
        JLCrear = new javax.swing.JLabel();
        JPResolver = new javax.swing.JPanel();
        JLResolver = new javax.swing.JLabel();
        JPCerrar = new javax.swing.JPanel();
        JLCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setUndecorated(true);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(221, 245, 242));
        panelFondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 107, 149), 10, true));
        panelFondo.setPreferredSize(new java.awt.Dimension(892, 720));
        panelFondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelFondoMouseDragged(evt);
            }
        });
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt);
            }
        });
        panelFondo.setLayout(null);

        JLSudoku.setFont(new java.awt.Font("Cooper Black", 0, 40)); // NOI18N
        JLSudoku.setForeground(new java.awt.Color(0, 107, 149));
        JLSudoku.setText("SUDOKU");
        panelFondo.add(JLSudoku);
        JLSudoku.setBounds(70, 50, 200, 50);

        JPNuevaPartida.setBackground(new java.awt.Color(167, 242, 238));
        JPNuevaPartida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 107, 149), 10, true));
        JPNuevaPartida.setPreferredSize(new java.awt.Dimension(189, 60));
        JPNuevaPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPNuevaPartidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPNuevaPartidaMouseExited(evt);
            }
        });

        JLNuevaPartida.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        JLNuevaPartida.setForeground(new java.awt.Color(0, 107, 149));
        JLNuevaPartida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLNuevaPartida.setText("NUEVA PARTIDA");
        JLNuevaPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLNuevaPartidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLNuevaPartidaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JLNuevaPartidaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout JPNuevaPartidaLayout = new javax.swing.GroupLayout(JPNuevaPartida);
        JPNuevaPartida.setLayout(JPNuevaPartidaLayout);
        JPNuevaPartidaLayout.setHorizontalGroup(
            JPNuevaPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLNuevaPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPNuevaPartidaLayout.setVerticalGroup(
            JPNuevaPartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLNuevaPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelFondo.add(JPNuevaPartida);
        JPNuevaPartida.setBounds(625, 120, 197, 55);

        JPLimpiar.setBackground(new java.awt.Color(167, 242, 238));
        JPLimpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 107, 149), 10, true));
        JPLimpiar.setPreferredSize(new java.awt.Dimension(189, 60));
        JPLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPLimpiarMouseExited(evt);
            }
        });

        JLLimpiar.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        JLLimpiar.setForeground(new java.awt.Color(0, 107, 149));
        JLLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLLimpiar.setText("LIMPIAR");
        JLLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLLimpiarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JLLimpiarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout JPLimpiarLayout = new javax.swing.GroupLayout(JPLimpiar);
        JPLimpiar.setLayout(JPLimpiarLayout);
        JPLimpiarLayout.setHorizontalGroup(
            JPLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
        );
        JPLimpiarLayout.setVerticalGroup(
            JPLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panelFondo.add(JPLimpiar);
        JPLimpiar.setBounds(625, 185, 197, 55);

        JPComprobar.setBackground(new java.awt.Color(167, 242, 238));
        JPComprobar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 107, 149), 10, true));
        JPComprobar.setPreferredSize(new java.awt.Dimension(189, 60));
        JPComprobar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPComprobarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPComprobarMouseExited(evt);
            }
        });

        JLComprobar.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        JLComprobar.setForeground(new java.awt.Color(0, 107, 149));
        JLComprobar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLComprobar.setText("COMPROBAR");
        JLComprobar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLComprobarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLComprobarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JLComprobarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout JPComprobarLayout = new javax.swing.GroupLayout(JPComprobar);
        JPComprobar.setLayout(JPComprobarLayout);
        JPComprobarLayout.setHorizontalGroup(
            JPComprobarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLComprobar, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
        );
        JPComprobarLayout.setVerticalGroup(
            JPComprobarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPComprobarLayout.createSequentialGroup()
                .addComponent(JLComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelFondo.add(JPComprobar);
        JPComprobar.setBounds(625, 315, 197, 55);

        JPCrear.setBackground(new java.awt.Color(167, 242, 238));
        JPCrear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 107, 149), 10, true));
        JPCrear.setMinimumSize(new java.awt.Dimension(189, 60));
        JPCrear.setPreferredSize(new java.awt.Dimension(189, 60));
        JPCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPCrearMouseExited(evt);
            }
        });

        JLCrear.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        JLCrear.setForeground(new java.awt.Color(0, 107, 149));
        JLCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLCrear.setText("CREAR");
        JLCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLCrearMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JLCrearMousePressed(evt);
            }
        });

        javax.swing.GroupLayout JPCrearLayout = new javax.swing.GroupLayout(JPCrear);
        JPCrear.setLayout(JPCrearLayout);
        JPCrearLayout.setHorizontalGroup(
            JPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
        );
        JPCrearLayout.setVerticalGroup(
            JPCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        panelFondo.add(JPCrear);
        JPCrear.setBounds(625, 250, 197, 55);

        JPResolver.setBackground(new java.awt.Color(167, 242, 238));
        JPResolver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 107, 149), 10, true));
        JPResolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JPResolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JPResolverMouseExited(evt);
            }
        });

        JLResolver.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        JLResolver.setForeground(new java.awt.Color(0, 107, 149));
        JLResolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLResolver.setText("RESOLVER");
        JLResolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLResolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLResolverMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JLResolverMousePressed(evt);
            }
        });

        javax.swing.GroupLayout JPResolverLayout = new javax.swing.GroupLayout(JPResolver);
        JPResolver.setLayout(JPResolverLayout);
        JPResolverLayout.setHorizontalGroup(
            JPResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPResolverLayout.createSequentialGroup()
                .addComponent(JLResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        JPResolverLayout.setVerticalGroup(
            JPResolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPResolverLayout.createSequentialGroup()
                .addComponent(JLResolver, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelFondo.add(JPResolver);
        JPResolver.setBounds(625, 380, 197, 55);

        JPCerrar.setBackground(new java.awt.Color(167, 242, 238));
        JPCerrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 107, 149), 10, true));
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
        JLCerrar.setToolTipText("");
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JLCerrarMousePressed(evt);
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
            .addComponent(JLCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
        );

        panelFondo.add(JPCerrar);
        JPCerrar.setBounds(822, 20, 50, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JLNuevaPartidaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLNuevaPartidaMousePressed
        if (fromNiveles != null) {
            fromNiveles.setVisible(true);
        } else {
            fromNiveles = new FromNiveles(tableroSudoku);
            fromNiveles.setVisible(true);
        }
    }//GEN-LAST:event_JLNuevaPartidaMousePressed

    private void JLLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLLimpiarMousePressed
        tableroSudoku.limpiarSudoku();
    }//GEN-LAST:event_JLLimpiarMousePressed

    private void JLCrearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCrearMousePressed
        if (estadoCrear) {
            JPNuevaPartida.setVisible(false);
            JPLimpiar.setVisible(false);
            JPComprobar.setVisible(false);
            JPResolver.setVisible(false);
            JLNuevaPartida.setVisible(false);
            JLLimpiar.setVisible(false);
            JLComprobar.setVisible(false);
            JLResolver.setVisible(false);
            JLCrear.setText("LISTO");
            tableroSudoku.limpiarTxt();
            estadoCrear = false;

        } else {
            if (tableroSudoku.crearSudokuPersonalizado()) {
                JPNuevaPartida.setVisible(true);
                JPLimpiar.setVisible(true);
                JPComprobar.setVisible(true);
                JPResolver.setVisible(true);
                JLNuevaPartida.setVisible(true);
                JLLimpiar.setVisible(true);
                JLComprobar.setVisible(true);
                JLResolver.setVisible(true);
                JLCrear.setText("CREAR");
                estadoCrear = true;

            }

        }
    }//GEN-LAST:event_JLCrearMousePressed

    private void JLComprobarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLComprobarMousePressed
        tableroSudoku.comprobar();
    }//GEN-LAST:event_JLComprobarMousePressed

    private void JLResolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLResolverMousePressed
        tableroSudoku.resolver();
    }//GEN-LAST:event_JLResolverMousePressed

    private void JLCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCerrarMousePressed

    }//GEN-LAST:event_JLCerrarMousePressed

    private void JLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_JLCerrarMouseClicked

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
        xPos = evt.getX();
        yPos = evt.getY();
    }//GEN-LAST:event_panelFondoMousePressed

    private void panelFondoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMouseDragged
        this.setLocation(evt.getXOnScreen() - xPos, evt.getYOnScreen() - yPos);
    }//GEN-LAST:event_panelFondoMouseDragged

    private void JPNuevaPartidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPNuevaPartidaMouseEntered
        JPNuevaPartida.setBackground(new Color(88, 201, 185));
        JLNuevaPartida.setForeground(Color.white);
    }//GEN-LAST:event_JPNuevaPartidaMouseEntered

    private void JPLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPLimpiarMouseEntered
        JPLimpiar.setBackground(new Color(88, 201, 185));
        JLLimpiar.setForeground(Color.white);
    }//GEN-LAST:event_JPLimpiarMouseEntered

    private void JPCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPCrearMouseEntered
        JPCrear.setBackground(new Color(88, 201, 185));
        JLCrear.setForeground(Color.white);
    }//GEN-LAST:event_JPCrearMouseEntered

    private void JPComprobarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPComprobarMouseEntered
        JPComprobar.setBackground(new Color(88, 201, 185));
        JLComprobar.setForeground(Color.white);
    }//GEN-LAST:event_JPComprobarMouseEntered

    private void JPResolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPResolverMouseEntered
        JPResolver.setBackground(new Color(88, 201, 185));
        JLResolver.setForeground(Color.white);
    }//GEN-LAST:event_JPResolverMouseEntered

    private void JPCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPCerrarMouseEntered
        JPCerrar.setBackground(Color.red);
        JLCerrar.setForeground(Color.white);
    }//GEN-LAST:event_JPCerrarMouseEntered

    private void JPCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPCerrarMouseExited
        JPCerrar.setBackground(new Color(167, 242, 238));
        JLCerrar.setForeground(new Color(0, 107, 149));
    }//GEN-LAST:event_JPCerrarMouseExited

    private void JLCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCerrarMouseExited
        JPCerrar.setBackground(new Color(167, 242, 238));
        JLCerrar.setForeground(new Color(0, 107, 149));
    }//GEN-LAST:event_JLCerrarMouseExited

    private void JLNuevaPartidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLNuevaPartidaMouseEntered
        JPNuevaPartida.setBackground(new Color(88, 201, 185));
        JLNuevaPartida.setForeground(Color.white);
    }//GEN-LAST:event_JLNuevaPartidaMouseEntered

    private void JLLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLLimpiarMouseEntered
        JPLimpiar.setBackground(new Color(88, 201, 185));
        JLLimpiar.setForeground(Color.white);
    }//GEN-LAST:event_JLLimpiarMouseEntered

    private void JLCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCrearMouseEntered
        JPCrear.setBackground(new Color(88, 201, 185));
        JLCrear.setForeground(Color.white);
    }//GEN-LAST:event_JLCrearMouseEntered

    private void JLComprobarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLComprobarMouseEntered
        JPComprobar.setBackground(new Color(88, 201, 185));
        JLComprobar.setForeground(Color.white);
    }//GEN-LAST:event_JLComprobarMouseEntered

    private void JLResolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLResolverMouseEntered
        JPResolver.setBackground(new Color(88, 201, 185));
        JLResolver.setForeground(Color.white);
    }//GEN-LAST:event_JLResolverMouseEntered

    private void JLCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCerrarMouseEntered
        JPCerrar.setBackground(Color.red);
        JLCerrar.setForeground(Color.white);
    }//GEN-LAST:event_JLCerrarMouseEntered

    private void JLNuevaPartidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLNuevaPartidaMouseExited
        JPNuevaPartida.setBackground(new Color(167, 242, 238));
        JLNuevaPartida.setForeground(new Color(0, 107, 149));
    }//GEN-LAST:event_JLNuevaPartidaMouseExited

    private void JLLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLLimpiarMouseExited
        JPLimpiar.setBackground(new Color(167, 242, 238));
        JLLimpiar.setForeground(new Color(0, 107, 149));
    }//GEN-LAST:event_JLLimpiarMouseExited

    private void JLCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLCrearMouseExited
        JPCrear.setBackground(new Color(167, 242, 238));
        JLCrear.setForeground(new Color(0, 107, 149));
    }//GEN-LAST:event_JLCrearMouseExited

    private void JLComprobarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLComprobarMouseExited
        JPComprobar.setBackground(new Color(167, 242, 238));
        JLComprobar.setForeground(new Color(0, 107, 149));
    }//GEN-LAST:event_JLComprobarMouseExited

    private void JLResolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLResolverMouseExited
        JPResolver.setBackground(new Color(167, 242, 238));
        JLResolver.setForeground(new Color(0, 107, 149));
    }//GEN-LAST:event_JLResolverMouseExited

    private void JPNuevaPartidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPNuevaPartidaMouseExited
        JPNuevaPartida.setBackground(new Color(167, 242, 238));
        JLNuevaPartida.setForeground(new Color(0, 107, 149));
    }//GEN-LAST:event_JPNuevaPartidaMouseExited

    private void JPLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPLimpiarMouseExited
        JPLimpiar.setBackground(new Color(167, 242, 238));
        JLLimpiar.setForeground(new Color(0, 107, 149));
    }//GEN-LAST:event_JPLimpiarMouseExited

    private void JPCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPCrearMouseExited
        JPCrear.setBackground(new Color(167, 242, 238));
        JLCrear.setForeground(new Color(0, 107, 149));
    }//GEN-LAST:event_JPCrearMouseExited

    private void JPComprobarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPComprobarMouseExited
        JPComprobar.setBackground(new Color(167, 242, 238));
        JLComprobar.setForeground(new Color(0, 107, 149));
    }//GEN-LAST:event_JPComprobarMouseExited

    private void JPResolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPResolverMouseExited
        JPResolver.setBackground(new Color(167, 242, 238));
        JLResolver.setForeground(new Color(0, 107, 149));
    }//GEN-LAST:event_JPResolverMouseExited

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FromSudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromSudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromSudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromSudoku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromSudoku(controlador).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLCerrar;
    private javax.swing.JLabel JLComprobar;
    private javax.swing.JLabel JLCrear;
    private javax.swing.JLabel JLLimpiar;
    private javax.swing.JLabel JLNuevaPartida;
    private javax.swing.JLabel JLResolver;
    private javax.swing.JLabel JLSudoku;
    private javax.swing.JPanel JPCerrar;
    private javax.swing.JPanel JPComprobar;
    private javax.swing.JPanel JPCrear;
    private javax.swing.JPanel JPLimpiar;
    private javax.swing.JPanel JPNuevaPartida;
    private javax.swing.JPanel JPResolver;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
}
