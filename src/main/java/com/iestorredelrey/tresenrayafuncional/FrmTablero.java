package com.iestorredelrey.tresenrayafuncional;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

/**
 *
 * @author pepe
 */

public class FrmTablero extends javax.swing.JFrame {
    
    JToggleButton[] casillas;
    ImageIcon imagenX = new ImageIcon("cruz.png");
    ImageIcon imagenO = new ImageIcon("o.png");
    int turno = 0;
    boolean ganaJugador = false;
    boolean ganaCPU = false;
    boolean empate = false;
    boolean finJuego = false;
    
    public FrmTablero() {
        initComponents();
        setTitle("Tres en Raya");
        // Tablero
        casillas = new JToggleButton[] {
            tgbIzqArriba, tgbCentroArriba, tgbDerArriba,
            tgbIzqCentro, tgbCentro, tgbDerCentro,
            tgbIzqAbajo, tgbCentroAbajo, tgbDerAbajo
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tgbIzqArriba = new javax.swing.JToggleButton();
        tgbCentroArriba = new javax.swing.JToggleButton();
        tgbDerArriba = new javax.swing.JToggleButton();
        tgbIzqCentro = new javax.swing.JToggleButton();
        tgbCentro = new javax.swing.JToggleButton();
        tgbDerCentro = new javax.swing.JToggleButton();
        tgbIzqAbajo = new javax.swing.JToggleButton();
        tgbCentroAbajo = new javax.swing.JToggleButton();
        tgbDerAbajo = new javax.swing.JToggleButton();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tgbIzqArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbIzqArribaActionPerformed(evt);
            }
        });

        tgbCentroArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbCentroArribaActionPerformed(evt);
            }
        });

        tgbDerArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbDerArribaActionPerformed(evt);
            }
        });

        tgbIzqCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbIzqCentroActionPerformed(evt);
            }
        });

        tgbCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbCentroActionPerformed(evt);
            }
        });

        tgbDerCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbDerCentroActionPerformed(evt);
            }
        });

        tgbIzqAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbIzqAbajoActionPerformed(evt);
            }
        });

        tgbCentroAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbCentroAbajoActionPerformed(evt);
            }
        });

        tgbDerAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbDerAbajoActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tgbIzqArriba, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(tgbIzqCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgbIzqAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tgbCentro, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(tgbCentroArriba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgbCentroAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(tgbDerArriba, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(tgbDerCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgbDerAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tgbCentroArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbDerArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgbIzqArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tgbDerCentro, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(tgbIzqCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tgbCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tgbDerAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(tgbCentroAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(tgbIzqAbajo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReiniciar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        for (JToggleButton tgb : casillas) {
            reiniciar(tgb);
        }
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void tgbIzqArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbIzqArribaActionPerformed
        modificarCasilla(tgbIzqArriba);
    }//GEN-LAST:event_tgbIzqArribaActionPerformed

    private void tgbCentroArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbCentroArribaActionPerformed
        modificarCasilla(tgbCentroArriba);
    }//GEN-LAST:event_tgbCentroArribaActionPerformed

    private void tgbDerArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbDerArribaActionPerformed
        modificarCasilla(tgbDerArriba);
    }//GEN-LAST:event_tgbDerArribaActionPerformed

    private void tgbIzqCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbIzqCentroActionPerformed
        modificarCasilla(tgbIzqCentro);
    }//GEN-LAST:event_tgbIzqCentroActionPerformed

    private void tgbCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbCentroActionPerformed
        modificarCasilla(tgbCentro);
    }//GEN-LAST:event_tgbCentroActionPerformed

    private void tgbDerCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbDerCentroActionPerformed
        modificarCasilla(tgbDerCentro);
    }//GEN-LAST:event_tgbDerCentroActionPerformed

    private void tgbIzqAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbIzqAbajoActionPerformed
        modificarCasilla(tgbIzqAbajo);
    }//GEN-LAST:event_tgbIzqAbajoActionPerformed

    private void tgbCentroAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbCentroAbajoActionPerformed
        modificarCasilla(tgbCentroAbajo);
    }//GEN-LAST:event_tgbCentroAbajoActionPerformed

    private void tgbDerAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbDerAbajoActionPerformed
        modificarCasilla(tgbDerAbajo);
    }//GEN-LAST:event_tgbDerAbajoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JToggleButton tgbCentro;
    private javax.swing.JToggleButton tgbCentroAbajo;
    private javax.swing.JToggleButton tgbCentroArriba;
    private javax.swing.JToggleButton tgbDerAbajo;
    private javax.swing.JToggleButton tgbDerArriba;
    private javax.swing.JToggleButton tgbDerCentro;
    private javax.swing.JToggleButton tgbIzqAbajo;
    private javax.swing.JToggleButton tgbIzqArriba;
    private javax.swing.JToggleButton tgbIzqCentro;
    // End of variables declaration//GEN-END:variables

    private void modificarCasilla(JToggleButton tgb) {
        // Turno Jugador
        turno++;
        int numeroCasillaCPU = 0;
        tgb.setIcon(imagenX);
        tgb.setSelected(true);
        tgb.setEnabled(false);
        // Empezamos a comprobar si alguién ha ganado cuando vamos por el turno 4 porque antes es imposible ganar
        if (turno > 3) {
            comprobarGanador();
            if (finJuego) return;
        }
        // Empate
        if (turno >= 9) {
            empate = true;
            ganaJugador = false;
            ganaCPU = false;
            finJuego = true;
        } else {
            switch (turno) {
                // Primer Turno CPU
                case 1 -> numeroCasillaCPU = cpuPrimeraTirada(tgb);
                // Resto de Turnos CPU
                case 3, 5 ,7 -> numeroCasillaCPU = cpuOtraTirada(tgb);
            }
            // Turno CPU
            if (turno < 8) turno++;
            casillas[numeroCasillaCPU].setIcon(imagenO);
            casillas[numeroCasillaCPU].setSelected(true);
            casillas[numeroCasillaCPU].setEnabled(false); 
        }
        // Empezamos a comprobar si alguién ha ganado cuando vamos por el turno 4 porque antes es imposible ganar 
        if (turno > 3) comprobarGanador();
    }
    
    private int cpuPrimeraTirada(JToggleButton tgb) {
        boolean casillaOcupada = false;
        int posicion = 0;
        int posicionActual = 0;
        // Obtenemos la posición de la casilla que pulsa el Jugador
        for (int i = 0; i < casillas.length; i++) {
            if (casillas[i] == tgb) {
                posicionActual = i;
                break;
            }
        }
        // Hacemos que la CPU seleccione su primera casilla de forma predefinida
        do {
            // Para que la CPU eliga una posición aleatoria entre las posibilidades más cercanas
            int posicionElegida = (int) (Math.random() * 3);
            posicionElegida = switch (posicionElegida) {
                case 0 -> 4;
                case 1 -> 3;
                default -> 1;
            };
            // Contemplamos que nunca se salga de los límites del Array
            if (posicionActual == 4 || posicionActual == 5 || posicionActual == 6 || posicionActual == 7 || posicionActual == 8) posicion = posicionActual - posicionElegida;
            else if (posicionActual == 0 || posicionActual == 1 || posicionActual == 2 || posicionActual == 3) posicion = posicionActual + posicionElegida;
            else if (!(posicionActual == 1)) posicion = posicionActual + 1;
            else posicion = posicionActual - 1;
        } while (casillaOcupada);
        return posicion;
    }

    private int cpuOtraTirada(JToggleButton tgb) {
        int numeroAleatorio;
        int posicion;
        boolean ocupada;
        // Diagonal 1
        if (!casillas[0].isSelected() & casillas[4].getIcon() == imagenX & casillas[8].getIcon() == imagenX) posicion = 0;
        else if (casillas[0].getIcon() == imagenX & !casillas[4].isSelected() & casillas[8].getIcon() == imagenX) posicion = 4;
        else if (casillas[0].getIcon() == imagenX & casillas[4].getIcon() == imagenX & !casillas[8].isSelected()) posicion = 8;
        // Diagonal 2
        else if (!casillas[2].isSelected() & casillas[4].getIcon() == imagenX & casillas[6].getIcon() == imagenX) posicion = 2;
        else if (casillas[2].getIcon() == imagenX & !casillas[4].isSelected() & casillas[6].getIcon() == imagenX) posicion = 4;
        else if (casillas[2].getIcon() == imagenX & casillas[4].getIcon() == imagenX & !casillas[6].isSelected()) posicion = 6;
        // Vertical 1
        else if (!casillas[0].isSelected() & casillas[3].getIcon() == imagenX & casillas[6].getIcon() == imagenX) posicion = 0;
        else if (casillas[0].getIcon() == imagenX & !casillas[3].isSelected() & casillas[6].getIcon() == imagenX) posicion = 3;
        else if (casillas[0].getIcon() == imagenX & casillas[3].getIcon() == imagenX & !casillas[6].isSelected()) posicion = 6;
        // Vertical 2
        else if (!casillas[1].isSelected() & casillas[4].getIcon() == imagenX & casillas[7].getIcon() == imagenX) posicion = 1;
        else if (casillas[1].getIcon() == imagenX & !casillas[4].isSelected() & casillas[7].getIcon() == imagenX) posicion = 4;
        else if (casillas[1].getIcon() == imagenX & casillas[4].getIcon() == imagenX & !casillas[7].isSelected()) posicion = 7;
        // Vertical 3
        else if (!casillas[2].isSelected() & casillas[5].getIcon() == imagenX & casillas[8].getIcon() == imagenX) posicion = 2;
        else if (casillas[2].getIcon() == imagenX & !casillas[5].isSelected() & casillas[8].getIcon() == imagenX) posicion = 5;
        else if (casillas[2].getIcon() == imagenX & casillas[5].getIcon() == imagenX & !casillas[8].isSelected()) posicion = 8;
        // Horizontal 1
        else if (!casillas[0].isSelected() & casillas[1].getIcon() == imagenX & casillas[2].getIcon() == imagenX) posicion = 0;
        else if (casillas[0].getIcon() == imagenX & !casillas[1].isSelected() & casillas[2].getIcon() == imagenX) posicion = 1;
        else if (casillas[0].getIcon() == imagenX & casillas[1].getIcon() == imagenX & !casillas[2].isSelected()) posicion = 2;
        // Horizontal 2
        else if (!casillas[3].isSelected() & casillas[4].getIcon() == imagenX & casillas[5].getIcon() == imagenX) posicion = 3;
        else if (casillas[3].getIcon() == imagenX & !casillas[4].isSelected() & casillas[5].getIcon() == imagenX) posicion = 4;
        else if (casillas[3].getIcon() == imagenX & casillas[4].getIcon() == imagenX & !casillas[5].isSelected()) posicion = 5;
        // Horizontal 2
        else if (!casillas[6].isSelected() & casillas[7].getIcon() == imagenX & casillas[8].getIcon() == imagenX) posicion = 6;
        else if (casillas[6].getIcon() == imagenX & !casillas[7].isSelected() & casillas[8].getIcon() == imagenX) posicion = 7;
        else if (casillas[6].getIcon() == imagenX & casillas[7].getIcon() == imagenX & !casillas[8].isSelected()) posicion = 8;
        // En caso de estar todas las combianaciones ganadoras ocupadas obetenemos una posición aleatoria
        else {
            do {
                numeroAleatorio = (int) (Math.random() * casillas.length);
                if (casillas[numeroAleatorio] == tgb) ocupada = true;
                else if (casillas[numeroAleatorio].isSelected()) ocupada = true;
                else {
                    ocupada = false;
                    break;
                }
            } while (ocupada = true);
            posicion = numeroAleatorio;
        }
        return posicion;
    }
    

    private void reiniciar(JToggleButton tgb) {
        // Reiniciar un botón a sus valores predeterminados
        tgb.setIcon(null);
        tgb.setEnabled(true);
        tgb.setSelected(false);
        turno = 0;
        finJuego = false;
    }

    private void comprobarGanador() {
        // Comprobar si haace línea la CPU o el Jugador
        comprobarTurno("Jugador", imagenX);
        comprobarTurno("CPU", imagenO);
        if (finJuego) mensajes();
    }
    
    private void comprobarTurno(String turno, ImageIcon imagen) {
        // Diagonales
        comprobarLinea(turno, imagen, new int[]{0,4,8});
        comprobarLinea(turno, imagen, new int[]{2,4,6});
        // Verticales
        comprobarLinea(turno, imagen, new int[]{0,3,6});
        comprobarLinea(turno, imagen, new int[]{1,4,7});
        comprobarLinea(turno, imagen, new int[]{2,5,8});
        // Horizontales
        comprobarLinea(turno, imagen, new int[]{0,1,2});
        comprobarLinea(turno, imagen, new int[]{3,4,5});
        comprobarLinea(turno, imagen, new int[]{6,7,8});
    }
    
    private void comprobarLinea(String turno, ImageIcon imagen, int[] casillasAComprobar) {
        if (casillas[casillasAComprobar[0]].getIcon() == imagen & casillas[casillasAComprobar[1]].getIcon() == imagen & casillas[casillasAComprobar[2]].getIcon() == imagen) {
             if (turno.equals("Jugador")) {
                 ganaJugador = true;
                 ganaCPU = false;
             } else if (turno.equals("CPU")) {
                 ganaJugador = false;
                 ganaCPU = true; 
             }
             empate = false;
             finJuego = true; 
        }
    }
    
    private void mensajes() {
        // Mensajes de interación con el usuario
        if (empate) {
            JOptionPane.showMessageDialog(rootPane, "Empate.", "EMPATE", JOptionPane.INFORMATION_MESSAGE);
            finJuego = true;
        }
        if (ganaJugador) {
            JOptionPane.showMessageDialog(rootPane, "!Enhorabuena! !Has ganado!", "VICTORIA", JOptionPane.INFORMATION_MESSAGE);
            finJuego = true;
        }
        if (ganaCPU) {
            JOptionPane.showMessageDialog(rootPane, "Lo siento. ¡Has perdido!", "DERROTA", JOptionPane.INFORMATION_MESSAGE);
            finJuego = true;
        }
    }
    
}
