package com.example.controlador.lexilogos.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import com.example.controlador.lexilogos.model.Registro;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class DiccionarioController implements Initializable {

    @FXML
    private AnchorPane root2;

    @FXML
    private TextField txtFiltro;

    @FXML
    private TableView<Registro> tablaDiccionario;

    @FXML
    private TableColumn<Registro, String> registroTabla;

    // Almacenar los registros leídos del archivo xlsx
    private List<Registro> data;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // Abrir el archivo xlsx
            String dir = System.getProperty("user.home")+"/Lexilogos/Diccionario";
            Path path = Paths.get(dir);
            try {
                Files.createDirectories(path);
                System.out.println("Carpeta creada exitosamente en: " + dir);
            } catch (Exception e) {
                System.out.println("Error al crear la carpeta: " + e.getMessage());
            }
            FileInputStream file = new FileInputStream(new File(dir+"/TraduccionLatin.xlsx"));

            Workbook workbook = WorkbookFactory.create(file);

            // Leer la primera hoja del archivo
            Sheet sheet = workbook.getSheetAt(0);

            // Leer los datos de cada fila del archivo y guardarlos en una lista de registros
            data = new ArrayList<>();
            for (Row row : sheet) {
                Cell cell = row.getCell(0);
                if (cell != null) {
                    String value = cell.getStringCellValue().trim();
                    if (!value.isEmpty()) {
                        data.add(new Registro(value));
                    }
                }
            }

            // Agregar los registros a la tabla
            tablaDiccionario.setItems(FXCollections.observableArrayList(data));


            // Configurar la columna de la tabla para mostrar los datos
            registroTabla.setCellValueFactory(new PropertyValueFactory<>("registroTabla"));
            registroTabla.setCellFactory(tc -> {
                TableCell<Registro, String> cell = new TableCell<Registro, String>() {
                    @Override
                    protected void updateItem(String item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty || item == null) {
                            setText(null);
                            setGraphic(null);
                            setPrefHeight(0);
                        } else {
                            setText(item);
                            setWrapText(true);
                            setEllipsisString("");
                            setPrefHeight(Control.USE_COMPUTED_SIZE);
                        }
                    }
                };
                cell.setWrapText(true);
                cell.setAlignment(Pos.TOP_LEFT);
                return cell;
            });

            // Agregar un EventHandler para manejar el cierre de la aplicación
            Platform.runLater(() -> {
                Stage stage = (Stage) root2.getScene().getWindow();
                stage.setOnCloseRequest(event -> {
                    try {
                        // Cerrar la lectura del archivo xlsx
                        file.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                });
            });

            // Agregar un listener al TextField para filtrar la tabla
            txtFiltro.textProperty().addListener((observable, oldValue, newValue) -> {
                // Obtener los registros que empiezan con el texto ingresado en el TextField, ignorando las diferencias de mayúsculas y minúsculas
                List<Registro> filteredData = data.stream()
                        .filter(registro -> registro.getRegistroTabla().toLowerCase().startsWith(newValue.toLowerCase()))
                        .collect(Collectors.toList());

                // Actualizar la tabla con los registros filtrados
                tablaDiccionario.setItems(FXCollections.observableArrayList(filteredData));
            });

        } catch (IOException ex) {
            // Manejar cualquier error
            ex.printStackTrace();
        }
    }
}
