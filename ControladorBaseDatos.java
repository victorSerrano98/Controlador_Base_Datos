package controladorbasedatos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class ControladorBaseDatos extends javax.swing.JFrame {
         java.sql.Connection conexion;
         java.sql.PreparedStatement seleccionarPersonas;
         java.sql.PreparedStatement seleccionarPersonasPorApellido;
         java.sql.PreparedStatement insertarNuevaPersona;
      
         List<Persona>lista=null;
  
    public ControladorBaseDatos() {
        initComponents();
        this.setLocationRelativeTo(null);
        
       cargarDriver();
        
       txtPosicion.setEditable(false);
       txtTamanio.setEditable(false);
       
       lista=getPersonas();
        
        if (lista.size()>0) {
            txtID.setText(""+lista.get(0).getId());
            txtNombres.setText(lista.get(0).getNombres());
            txtApellidos.setText(lista.get(0).getApellidos());
            txtCorreo.setText(lista.get(0).getEmail());
            txtTelefono.setText(lista.get(0).getTelefono());
        }

        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        txtPosicion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTamanio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtBuscarApellido = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAnterior.setText("Previous");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Next");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        txtPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosicionActionPerformed(evt);
            }
        });

        jLabel1.setText("of");

        txtTamanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanioActionPerformed(evt);
            }
        });

        jLabel2.setText("Address ID:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("First Name:");

        jLabel5.setText("Email:");

        jLabel6.setText("Phone:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Last Name:");

        txtBuscarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarApellidoActionPerformed(evt);
            }
        });

        btnBuscar.setText("Find");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBuscarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel7.setText("Find an entry by Last Name");

        btnAgregar.setText("Insert New Entry");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Remove all Entries");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar)
                                .addGap(60, 60, 60))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnterior)
                                .addGap(38, 38, 38)
                                .addComponent(txtPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)
                                .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnSiguiente)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente)
                    .addComponent(txtPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosicionActionPerformed

    private void txtTamanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTamanioActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
  
      agregarPersona(Integer.parseInt(txtID.getText()),txtNombres.getText(), txtApellidos.getText(), txtCorreo.getText(), txtTelefono.getText());
    
        
    }//GEN-LAST:event_btnAgregarActionPerformed
  int i=0;
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        btnAnterior.setEnabled(true);
        if (i==lista.size()-1) {
            btnSiguiente.setEnabled(false);
        }else{    
           i++;
           txtPosicion.setText(""+(i+1));
           txtTamanio.setText(""+lista.size());
           
           txtID.setText(""+lista.get(i).getId());
           txtNombres.setText(lista.get(i).getNombres());
           txtApellidos.setText(lista.get(i).getApellidos());
           txtCorreo.setText(lista.get(i).getEmail());
           txtTelefono.setText(lista.get(i).getTelefono());
        }
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        btnSiguiente.setEnabled(true);
        if (i==0) {
            btnAnterior.setEnabled(false);
        }else{    
           i--;
           txtPosicion.setText(""+(i+1));
           txtTamanio.setText(""+lista.size());
           txtID.setText(""+lista.get(i).getId());
           txtNombres.setText(lista.get(i).getNombres());
           txtApellidos.setText(lista.get(i).getApellidos());
           txtCorreo.setText(lista.get(i).getEmail());
           txtTelefono.setText(lista.get(i).getTelefono());
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       cargarDriver();
        getPersonasPorApellido(txtBuscarApellido.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarApellidoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        cargarDriver();
        ResultSet rs;
        try {
            seleccionarPersonas=conexion.prepareStatement("DELETE from PERSONA");
  
            int s=seleccionarPersonas.executeUpdate();
             JOptionPane.showMessageDialog(null, "LOS DATOS HAN SDO BORRADOS");
         
         conexion.close();
        } catch (SQLException ex) {
            System.out.println("ERROR  "+ex);
        } 
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControladorBaseDatos().setVisible(true);
            }
        });
    }

    public void cargarDriver(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("Driver cargado !!!");
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error al cargar Driver "+cnfe);   
        }
        
         
         
        try {
            String urlbd="jdbc:derby://localhost:1527/ControladorBaseDatos";
            conexion = DriverManager.getConnection(urlbd, "administrador","admin");
             System.out.println("Conexion satisfactoria !!!");
        } catch (SQLException sqlex) {
            System.out.println("Error al establecer conexion a la BD: "+sqlex);
        }
    }
    
      public List<Persona> getPersonas(){
          cargarDriver();
       List <Persona>lista=new ArrayList<Persona>();
        ResultSet rs;
        try {
            seleccionarPersonas=conexion.prepareStatement("select * from PERSONA");

            rs=seleccionarPersonas.executeQuery();
            while (rs.next()) {

                Persona p=new Persona(Integer.parseInt(rs.getString(1)), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                lista.add(p);
            }
            rs.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("ERROR  "+ex);
        }
        return lista;
        
    }
    
      
    public void getPersonasPorApellido(String apellido){
      
        ResultSet rs;
        try {
            seleccionarPersonas=conexion.prepareStatement("select * from PERSONA WHERE APELLIDOS LIKE '"+apellido+"'");
  
            rs=seleccionarPersonas.executeQuery();
            while (rs.next()) {
                txtID.setText(rs.getString(1));
                txtNombres.setText(rs.getString(2));
                txtApellidos.setText(rs.getString(3));
                txtCorreo.setText(rs.getString(4));
                txtTelefono.setText(rs.getString(5));
             
                System.out.println("");
   
            }
            rs.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("ERROR  "+ex);
        } 
    }

     public void agregarPersona(int ID, String nombres, String apellidos, String email,String telefono){
        cargarDriver();
        
        try {
            seleccionarPersonas=conexion.prepareStatement("INSERT INTO PERSONA (ID,NOMBRES,APELLIDOS,EMAIL,TELEFONO) values(?,?,?,?,?)");   
            seleccionarPersonas.setInt(1, ID);
            seleccionarPersonas.setString(2, nombres);
            seleccionarPersonas.setString(3, apellidos);
            seleccionarPersonas.setString(4, email);
            seleccionarPersonas.setString(5, telefono);
            seleccionarPersonas.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("ERROR  "+ex);
        }
           
     }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscarApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPosicion;
    private javax.swing.JTextField txtTamanio;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
