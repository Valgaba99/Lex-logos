package com.example.controlador.lexilogos.model;

import com.example.controlador.lexilogos.LoginController;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.*;

public class basedatos {

    public basedatos() {

    }
    public int numerofrases = 0;

    public Statement abrirBD() throws SQLException, ClassNotFoundException {
        Class.forName("org.mariadb.jdbc.Driver");
        String urlCon = "jdbc:mariadb://localhost:3306/lexilogos";
        Connection conexBD = DriverManager.getConnection(urlCon, "root", "");
        return conexBD.createStatement();
    }

    // *********************Diseño Login*********************

    public int securityLogin(String nombre1, String contra1){
        try
        {
            String query = "SELECT * FROM usuario";
            Statement a = abrirBD();
            ResultSet rs = a.executeQuery(query);
            while (rs.next())
            {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String contra = rs.getString("contra");

                if (nombre.equals(nombre1) && contra.equals(contra1)) {
                    if (nombre.equals("admin") && contra.equals("admin1234")) {
                        return 1;
                    }
                }
                if (nombre.equals(nombre1) && contra.equals(contra1)) {
                    if (nombre.equals("usuario") && contra.equals("usuario1234")) {
                        return 2;
                    }
                }

            }
            a.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return 0;
    }

    // *********************Diseño Menu*********************

    public void insertarTextosBD(TextField textField, TextArea textArea) throws SQLException, ClassNotFoundException {
        String contenido = textArea.getText();
        String titulo = textField.getText();
            Statement a = abrirBD();
            String consulta = String.format("INSERT INTO textos(titulo, cuerpo) VALUES('%s', '%s')", titulo, contenido);
            a.execute(consulta);
            textArea.setText("");
            textField.setText("");
    }
    public void delteteTextosBD(String id, TextField titulo, TextArea cuerpo) throws SQLException, ClassNotFoundException {
        try {
            Connection connection = abrirBD().getConnection();
            String query = "DELETE FROM textos WHERE id = '" + id + "'";
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
            cuerpo.setText("");
            titulo.setText("");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error al eliminar el texto: " + e.getMessage());
        }
    }
    public void updateTextosBD(String id, String titulo, String cuerpo) {
        System.out.println(id);
        try (Connection connection = abrirBD().getConnection()) {
            String sql = "UPDATE textos SET titulo = ?, cuerpo = ? WHERE id = '" + id + "'";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, titulo);
            statement.setString(2, cuerpo);
            statement.executeUpdate();
            System.out.println("NICES");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public int cuentaTxt() throws SQLException, ClassNotFoundException {
        Statement a = abrirBD();
        String consulta = "Select count(*) from textos";
        ResultSet rs = a.executeQuery(consulta);
        if(rs.next()) {
            numerofrases = rs.getInt(1);
        }
        return numerofrases;
    }
    public void addTextosTable(){
        try
        {
            String query = "SELECT * FROM textos";
            Statement a = abrirBD();
            ResultSet rs = a.executeQuery(query);
            LoginController.listaTextos.clear();
            while (rs.next())
            {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String cuerpo = rs.getString("cuerpo");
                LoginController.listaTextos.add(new Texto(id,titulo,cuerpo));
            }
            a.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }

    // *********************Diseño Analisis*********************

    public String filterforid(String id){
        try
        {
            String query = "SELECT * FROM textos WHERE id = '" + id + "' ";
            Statement a = abrirBD();
            ResultSet rs = a.executeQuery(query);
            while (rs.next())
            {
                String cuerpo = rs.getString("cuerpo");;
                return cuerpo;
            }
            a.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return null;
    }

}
