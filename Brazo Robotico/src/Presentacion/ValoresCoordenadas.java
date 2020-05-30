package Presentacion;

import Logica.Articulacion;
import Logica.Base;
import Logica.Seccion;

public class ValoresCoordenadas extends javax.swing.JFrame {
    
    public ValoresCoordenadas() {
        initComponents();
        setBounds(0,0,500,500 );
        jPanel1.setBounds(0,0,500,500);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        deslizamientoHorizontal = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jSangulo1 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rotacion = new javax.swing.JSlider();
        jSangulo2 = new javax.swing.JSlider();
        jSangulo4 = new javax.swing.JSlider();
        jSangulo3 = new javax.swing.JSlider();
        anguloToracionBase = new javax.swing.JLabel();
        jLHorizontal = new javax.swing.JLabel();
        angulo1 = new javax.swing.JLabel();
        angulo2 = new javax.swing.JLabel();
        angulo3 = new javax.swing.JLabel();
        angulo4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DESLIZADOR HORIZONTAL");

        deslizamientoHorizontal.setMaximum(700);
        deslizamientoHorizontal.setValue(200);
        deslizamientoHorizontal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                deslizamientoHorizontalStateChanged(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ROTACION");

        jSangulo1.setMaximum(175);
        jSangulo1.setMinimum(5);
        jSangulo1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSangulo1StateChanged(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ART");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("A:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("B:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("C:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("D:");

        rotacion.setMaximum(360);
        rotacion.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rotacionStateChanged(evt);
            }
        });

        jSangulo2.setMaximum(175);
        jSangulo2.setMinimum(5);
        jSangulo2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSangulo2StateChanged(evt);
            }
        });

        jSangulo4.setMaximum(175);
        jSangulo4.setMinimum(5);
        jSangulo4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSangulo4StateChanged(evt);
            }
        });

        jSangulo3.setMaximum(175);
        jSangulo3.setMinimum(5);
        jSangulo3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSangulo3StateChanged(evt);
            }
        });

        anguloToracionBase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        anguloToracionBase.setText("0");
        anguloToracionBase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLHorizontal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLHorizontal.setText("0");
        jLHorizontal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        angulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        angulo1.setText("5");
        angulo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        angulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        angulo2.setText("5");
        angulo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        angulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        angulo3.setText("5");
        angulo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        angulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        angulo4.setText("5");
        angulo4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jCheckBox1.setText("CERRAR");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Enviar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSangulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSangulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSangulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSangulo4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deslizamientoHorizontal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rotacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(anguloToracionBase, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(angulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(angulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(angulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(angulo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox1))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLHorizontal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deslizamientoHorizontal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(anguloToracionBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rotacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3))
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSangulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(angulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(angulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSangulo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSangulo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSangulo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(angulo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        jLHorizontal.getAccessibleContext().setAccessibleName("JLHORIZONTAL");
        jLHorizontal.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    public Base plataforma=new Base();
    public Articulacion a1=new Articulacion();
    public Seccion s1=new Seccion();
    public Articulacion a2=new Articulacion();
    public Seccion s2=new Seccion();
    public Articulacion a3=new Articulacion();
    public Seccion s3=new Seccion();
    public Articulacion aGD1=new Articulacion();
    public Articulacion aGI1=new Articulacion();
    public Seccion sGD1=new Seccion();
    public Seccion sGI1=new Seccion();
    public Articulacion aGD2=new Articulacion();
    public Articulacion aGI2=new Articulacion();
    public Seccion sGD2=new Seccion();
    public Seccion sGI2=new Seccion();
    
    private void deslizamientoHorizontalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_deslizamientoHorizontalStateChanged
         jLHorizontal.setText(String.valueOf(deslizamientoHorizontal.getValue()));
         
    }//GEN-LAST:event_deslizamientoHorizontalStateChanged

    private void rotacionStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rotacionStateChanged
        anguloToracionBase.setText(String.valueOf(rotacion.getValue()));
    }//GEN-LAST:event_rotacionStateChanged

    private void jSangulo1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSangulo1StateChanged
        angulo1.setText(String.valueOf(jSangulo1.getValue()));
        
    }//GEN-LAST:event_jSangulo1StateChanged

    private void jSangulo2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSangulo2StateChanged
        angulo2.setText(String.valueOf(jSangulo2.getValue()));
        
    }//GEN-LAST:event_jSangulo2StateChanged

    private void jSangulo3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSangulo3StateChanged
        angulo3.setText(String.valueOf(jSangulo3.getValue()));
        
    }//GEN-LAST:event_jSangulo3StateChanged
   
    private void jSangulo4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSangulo4StateChanged
        angulo4.setText(String.valueOf(jSangulo4.getValue()));
        
    }//GEN-LAST:event_jSangulo4StateChanged
  
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        plataforma.setMovHorizontal(deslizamientoHorizontal.getValue());
        
        a1.setAngulo(Math.toRadians(jSangulo1.getValue()));
        s1.setIx(((plataforma.getMovHorizontal())+plataforma.getAncho()/2));
        s1.setIy(plataforma.getInicialVer());
        s1.setFx(s1.getIx()+(int)(Math.cos(a1.getAngulo())*(150)));
        s1.setFy(s1.getIy()-(int)(Math.sin(a1.getAngulo())*(150)));
        
        a2.setAngulo(Math.toRadians(jSangulo2.getValue()));
        s2.setIx(s1.getFx());
        s2.setIy(s1.getFy());
        s2.setFx(s2.getIx()+(int)(Math.sin(a2.getAngulo())*(150)));
        s2.setFy(s2.getIy()+(int)(Math.cos(a2.getAngulo())*(150)));
        
        a3.setAngulo(Math.toRadians(jSangulo3.getValue()));
        s3.setIx(s2.getFx());
        s3.setIy(s2.getFy());
        s3.setFx(s3.getIx()-(int)(Math.cos(a3.getAngulo())*(150)));
        s3.setFy(s3.getIy()+(int)(Math.sin(a3.getAngulo())*(150)));
        
        aGD1.setAngulo(Math.toRadians(45));
        sGD1.setIx(s3.getFx());
        sGD1.setIy(s3.getFy());
        sGD1.setFx(sGD1.getIx()+(int)(Math.sin(aGD1.getAngulo())*(10)));
        sGD1.setFy(sGD1.getIy()+(int)(Math.cos(aGD1.getAngulo())*(10)));
        
        aGI1.setAngulo(-Math.toRadians(45));
        sGI1.setIx(s3.getFx());
        sGI1.setIy(s3.getFy());
        sGI1.setFx(sGI1.getIx()+(int)(Math.sin(aGI1.getAngulo())*(10)));
        sGI1.setFy(sGI1.getIy()+(int)(Math.cos(aGD1.getAngulo())*(10)));
        
        if(jCheckBox1.isSelected()==true){
            aGD2.setAngulo(-Math.PI/4);
            sGD2.setIx(sGD1.getFx());
            sGD2.setIy(sGD1.getFy());
            sGD2.setFx(sGD2.getIx()+(int)(Math.sin(aGD2.getAngulo())*(10)));
            sGD2.setFy(sGD2.getIy()+(int)(Math.cos(aGD2.getAngulo())*(10)));
            
            aGI2.setAngulo(Math.PI/4);
            sGI2.setIx(sGI1.getFx());
            sGI2.setIy(sGI1.getFy());
            sGI2.setFx(sGI2.getIx()+(int)(Math.sin(aGI2.getAngulo())*(10)));
            sGI2.setFy(sGI2.getIy()+(int)(Math.cos(aGI2.getAngulo())*(10)));
        }else if(jCheckBox1.isSelected()==false){
            aGD2.setAngulo(-Math.PI/39);
            sGD2.setIx(sGD1.getFx());
            sGD2.setIy(sGD1.getFy());
            sGD2.setFx(sGD2.getIx()+(int)(Math.sin(aGD2.getAngulo())*(10)));
            sGD2.setFy(sGD2.getIy()+(int)(Math.cos(aGD2.getAngulo())*(10)));
            
            aGI2.setAngulo(Math.PI/39);
            sGI2.setIx(sGI1.getFx());
            sGI2.setIy(sGI1.getFy());
            sGI2.setFx(sGI2.getIx()+(int)(Math.sin(aGI2.getAngulo())*(10)));
            sGI2.setFy(sGI2.getIy()+(int)(Math.cos(aGI2.getAngulo())*(10)));
        }
        
        Ventana brazoRobotico= new Ventana(plataforma,  s1,  s2,  s3,  sGD1,  sGI1,  sGD2,  sGI2);
        brazoRobotico.setVisible(true);
        brazoRobotico.setSize(700, 700);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel angulo1;
    private javax.swing.JLabel angulo2;
    private javax.swing.JLabel angulo3;
    private javax.swing.JLabel angulo4;
    private javax.swing.JLabel anguloToracionBase;
    private javax.swing.JSlider deslizamientoHorizontal;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLHorizontal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSangulo1;
    private javax.swing.JSlider jSangulo2;
    private javax.swing.JSlider jSangulo3;
    private javax.swing.JSlider jSangulo4;
    private javax.swing.JSlider rotacion;
    // End of variables declaration//GEN-END:variables
}
