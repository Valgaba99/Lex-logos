package com.example.controlador.lexilogos;

import com.example.controlador.lexilogos.controller.AnalisisController;
import com.example.controlador.lexilogos.model.Texto;
import com.example.controlador.lexilogos.model.basedatos;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button pantallaLogin;
    @FXML
    private TextField tfUsuario;
    @FXML
    private TextField tfContrasenia;
    @FXML
    private Text loginok;
    @FXML
    private TableView<Texto> tableViewuser;
    @FXML
    private TableView<Texto> tableViewadmin;

    // **********************************

    private final basedatos basededatos = new basedatos();
    public static ObservableList<Texto> listaTextos = FXCollections.observableArrayList();


    // **********************************

    private String idSelect;
    private Stage stage;

    public LoginController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tfUsuario.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                pantallaLogin.fire();
            }
        });
        tfContrasenia.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                pantallaLogin.fire();
            }
        });
        pantallaLogin.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {
                pantallaLogin.fire();
            }
        });
    }

    @FXML
    public void pantallaLogin() {
        if(basededatos.securityLogin(tfUsuario.getText(),tfContrasenia.getText()) == 1) {
           interfazMenu(true);

        } else {
            loginok.setVisible(true);
        }
        if (basededatos.securityLogin(tfUsuario.getText(),tfContrasenia.getText()) == 2){
           interfazMenu(false);
        } else {
            loginok.setVisible(true);
        }
    }

    public void interfazMenu(boolean visible) {
        stage = new Stage();

        // Crear el TabPane
        TabPane tabPane = new TabPane();

        // Crear pestañas
        Tab tab1 = new Tab("Inserción de datos");
        tab1.setClosable(false);
        Tab tab2 = new Tab("Análisis morfosintáctico");
        tab2.setClosable(false);

        // Crear contenido de las pestañas
        Pane content1 = new Pane();
        Pane content2 = new Pane();

        // Content1 *****************************************************************

        // Agregar contenido al Pane de la primera pestaña
        Label text1 = new Label("Título del texto");
        text1.setLayoutX(40.0);
        text1.setPrefWidth(200);
        text1.setLayoutY(30.0);
        content1.getChildren().add(text1);

        Label text3 = new Label("0");
        text3.setVisible(false);
        text3.setLayoutX(300.0);
        text3.setLayoutY(50.0);
        content1.getChildren().add(text3);

        TextField tftitulo = new TextField();
        tftitulo.setLayoutX(40.0);
        tftitulo.setLayoutY(50.0);
        tftitulo.prefWidth(140);
        tftitulo.prefHeight(50);
        content1.getChildren().add(tftitulo);

        Label text2 = new Label("Contenido del texto");
        text2.setLayoutX(40.0);
        text2.setLayoutY(110.0);
        content1.getChildren().add(text2);

        TextArea tatextos = new TextArea();
        tatextos.setLayoutX(40.0);
        tatextos.setLayoutY(130.0);
        tatextos.prefWidth(350);
        tatextos.prefHeight(160);
        content1.getChildren().add(tatextos);

        Button buttonborrar = new Button("Borrar");

        buttonborrar.setOnAction(event -> {
            if (tftitulo.getText().equals("") && tatextos.getText().equals("")) {
                System.out.println("CAMPOS EN BLANCO");
            } else {
                try {
                    ventanaEmergentedelete(tftitulo.getText(), tftitulo, tatextos, text3.getText());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        buttonborrar.setLayoutX(470.0);
        buttonborrar.setLayoutY(330.0);
        buttonborrar.prefWidth(168.0);
        buttonborrar.prefHeight(125.0);


        Button buttonadd = new Button("Añadir");
        buttonadd.setOnAction(event -> {
            try {
                if (tftitulo.getText().equals("") && tatextos.getText().equals("")) {
                    System.out.println("CAMPOS EN BLANCO");
                } else {
                    basededatos.insertarTextosBD(tftitulo, tatextos);
                    Texto t = new Texto(tftitulo.getText(), tatextos.getText());
                    listaTextos.add(t);
                    listaTextos.clear();
                    basededatos.addTextosTable();
                }
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        });
        buttonadd.setLayoutX(330.0);
        buttonadd.setLayoutY(330.0);
        buttonadd.prefWidth(68.0);
        buttonadd.prefHeight(25.0);

        Button buttonactualizar = new Button("Actualizar");

        buttonactualizar.setOnAction(event -> {
            if (tftitulo.getText().equals("") && tatextos.getText().equals("")) {
                System.out.println("CAMPOS EN BLANCO");
            } else {
                try {
                    ventanaEmergenteupdate(tftitulo.getText(), tftitulo, tatextos, text3.getText());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        buttonactualizar.setLayoutX(392.0);
        buttonactualizar.setLayoutY(330.0);
        buttonactualizar.prefWidth(173.0);
        buttonactualizar.prefHeight(125.0);

        content1.getChildren().add(buttonadd);
        content1.getChildren().add(buttonborrar);
        content1.getChildren().add(buttonactualizar);
        basededatos.addTextosTable();

        // ************************
        tableViewadmin = new TableView<>();
        tableViewadmin.setLayoutX(600);
        tableViewadmin.setLayoutY(50);
        tableViewadmin.setPrefSize(1200, 500);

        TableColumn<Texto, String> numColum = new TableColumn<>("Número de referencia");
        numColum.setMinWidth(140);
        TableColumn<Texto, String> firstNameColumn = new TableColumn<>("Titulo del texto");
        firstNameColumn.setMinWidth(400);
        TableColumn<Texto, String> lastNameColumn = new TableColumn<>("Cuerpo de los textos");
        lastNameColumn.setMinWidth(800);
        tableViewadmin.getColumns().addAll(numColum, firstNameColumn, lastNameColumn);

        // Configurar celdas de la tabla para que muestren los datos
        numColum.setCellValueFactory(new PropertyValueFactory<>("Id"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("cuerpo"));

        // Obtener los datos de la base de datos y mostrarlos en la tabla y en el ListView
        tableViewadmin.setItems(listaTextos);

        // Crear el layout de la interfaz de usuario
        content1.getChildren().add(tableViewadmin);

        tableViewadmin.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                Texto selectedPerson = tableViewadmin.getSelectionModel().getSelectedItem();
                if (selectedPerson != null) {
                    tftitulo.setText(selectedPerson.getTitulo());
                    tatextos.setText(selectedPerson.getCuerpo());
                    text3.setText(String.valueOf(selectedPerson.getId()));
                }
            }
        });

        // Content2 *****************************************************************

        tableViewuser = new TableView<>();
        tableViewuser.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        tableViewuser.setPrefSize(screenBounds.getWidth(), screenBounds.getHeight());


        TableColumn<Texto, String> numColum2 = new TableColumn<>("Número de referencia");
        numColum2.setMinWidth(140);
        TableColumn<Texto, String> firstNameColumn2 = new TableColumn<>("Titulo del texto");
        firstNameColumn2.setMinWidth(400);
        TableColumn<Texto, String> lastNameColumn2 = new TableColumn<>("Cuerpo de los textos");
        lastNameColumn2.setMinWidth(800);
        tableViewuser.getColumns().addAll(numColum2, firstNameColumn2, lastNameColumn2);

        // Configurar celdas de la tabla para que muestren los datos
        numColum2.setCellValueFactory(new PropertyValueFactory<>("Id"));
        firstNameColumn2.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        lastNameColumn2.setCellValueFactory(new PropertyValueFactory<>("cuerpo"));

        // Obtener los datos de la base de datos y mostrarlos en la tabla y en el ListView
        tableViewuser.setItems(listaTextos);

        // Crear el layout de la interfaz de usuario
        Pane vbox2 = new Pane(tableViewuser);
        content2.getChildren().add(vbox2);

        tableViewuser.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                Texto selectedPerson = tableViewuser.getSelectionModel().getSelectedItem();
                if (selectedPerson != null) {
                    handleRowClick(selectedPerson, stage);
                }
            }
        });
        // Establecer el contenido de las pestañas
        tab1.setContent(content1);
        tab2.setContent(content2);

        // Agregar pestañas al TabPane
        tabPane.getTabs().addAll(tab1, tab2);

        // Crear la escena y agregar el TabPane
        Scene scene = new Scene(tabPane);
        scene.getStylesheets().addAll(getClass().getResource("css/menu.css").toExternalForm());

        // Configurar la ventana principal
        stage.setTitle("Análisis Lexílogos");
        stage.setScene(scene);
        stage.initStyle(StageStyle.DECORATED);
        stage.setMaximized(true);
        stage.show();

        if (!visible) {
            tabPane.getTabs().remove(tab1);
        }

        Stage myStage = (Stage) this.pantallaLogin.getScene().getWindow();
        if (myStage != null && myStage.getScene() != null && myStage.getScene().getWindow() != null) {
            myStage.close();
        }

        stage.setOnCloseRequest(e -> {
            if (scene.getWindow() != null) {
                scene.getWindow().hide();
            }
        });

    }
    private void handleRowClick(Texto person, Stage primaryStage) {
        idSelect = String.valueOf(person.getId());
        cambiarVentana(primaryStage);
    }
    private void cambiarVentana(Stage primaryStage) {
        try {
            Screen screen = Screen.getPrimary();
            Rectangle2D bounds = screen.getVisualBounds();
            FXMLLoader loader = new FXMLLoader(LoginController.class.getResource("analisis.fxml"));
            Parent root = loader.load();
            AnalisisController ventana2Controller = loader.getController();
            ventana2Controller.setVariable(basededatos.filterforid(idSelect), idSelect);
            Scene scene = new Scene(root, bounds.getWidth(), bounds.getHeight() - 30);
            scene.getStylesheets().addAll(this.getClass().getResource("css/estilos.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void ventanaEmergentedelete(String titulo, TextField tftitulo, TextArea tatextos, String idSelect) {
        ButtonType botonAceptar = new ButtonType("Aceptar");
        ButtonType botonCancelar = new ButtonType("Cancelar");

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmación");
        alert.setHeaderText("Borrar registro");
        alert.setContentText("Seguro que quieres borrar la fila con el número de referencia " + idSelect + " con el título del texto: " + titulo + "." );

        alert.getButtonTypes().setAll(botonAceptar, botonCancelar);

        alert.showAndWait().ifPresent(resultado -> {
            if (resultado == botonAceptar) {
                try {
                    basededatos.delteteTextosBD(idSelect,tftitulo,tatextos);
                } catch (SQLException | ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
                listaTextos.clear();
                basededatos.addTextosTable();
            } else if (resultado == botonCancelar) {
                System.out.println("Se ha seleccionado Cancelar");
            }
        });
    }
    private void ventanaEmergenteupdate(String titulo, TextField tftitulo, TextArea tatextos, String idSelect) {
        ButtonType botonAceptar = new ButtonType("Aceptar");
        ButtonType botonCancelar = new ButtonType("Cancelar");

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmación");
        alert.setHeaderText("Actualizar registro");
        alert.setContentText("Seguro que quieres actualizar la fila con el número de referencia " + idSelect + " con el título del texto: " + titulo + "." );

        alert.getButtonTypes().setAll(botonAceptar, botonCancelar);

        alert.showAndWait().ifPresent(resultado -> {
            if (resultado == botonAceptar) {
                try {
                    basededatos.updateTextosBD(idSelect, tftitulo.getText(), tatextos.getText());
                    tftitulo.setText("");
                    tatextos.setText("");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                listaTextos.clear();
                basededatos.addTextosTable();
            } else if (resultado == botonCancelar) {
                System.out.println("Se ha seleccionado Cancelar");
            }
        });
    }

}