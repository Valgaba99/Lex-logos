package com.example.controlador.lexilogos.controller;
import com.example.controlador.lexilogos.LoginController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class AnalisisController implements Initializable {
    @FXML
    private AnchorPane nodoraiz;
    @FXML
    private TextFlow tituloflow;
    @FXML
    private TextField tfpalabra0;
    @FXML
    private TextField tfpalabra1;
    @FXML
    private TextField tfpalabra2;
    @FXML
    private TextField tfpalabra3;
    @FXML
    private TextField tfpalabra4;
    @FXML
    private TextField tfpalabra5;
    @FXML
    private TextField tfpalabra6;
    @FXML
    private TextField tfpalabra7;
    @FXML
    private TextField tfpalabra8;
    @FXML
    private TextField tfpalabra9;
    @FXML
    private TextField tfpalabra10;
    @FXML
    private ComboBox<String> tpg1;
    @FXML
    private ComboBox<String> cpg1;
    @FXML
    private ComboBox<String> ng1;
    @FXML
    private ComboBox<String> gg1;
    @FXML
    private ComboBox<String> mvg1;
    @FXML
    private ComboBox<String> tpg8;
    @FXML
    private ComboBox<String> tpg7;
    @FXML
    private ComboBox<String> tpg9;
    @FXML
    private ComboBox<String> tpg6;
    @FXML
    private ComboBox<String> tpg5;
    @FXML
    private ComboBox<String> tpg4;
    @FXML
    private ComboBox<String> tpg3;
    @FXML
    private ComboBox<String> tpg2;
    @FXML
    private ComboBox<String> tpg10;
    @FXML
    private ComboBox<String> tpg11;
    @FXML
    private ComboBox<String> cpg8;
    @FXML
    private ComboBox<String> cpg7;
    @FXML
    private ComboBox<String> cpg9;
    @FXML
    private ComboBox<String> cpg6;
    @FXML
    private ComboBox<String> cpg5;
    @FXML
    private ComboBox<String> cpg4;
    @FXML
    private ComboBox<String> cpg3;
    @FXML
    private ComboBox<String> cpg2;
    @FXML
    private ComboBox<String> cpg10;
    @FXML
    private ComboBox<String> cpg11;
    @FXML
    private ComboBox<String> ng8;
    @FXML
    private ComboBox<String> ng7;
    @FXML
    private ComboBox<String> ng6;
    @FXML
    private ComboBox<String> ng5;
    @FXML
    private ComboBox<String> ng4;
    @FXML
    private ComboBox<String> ng3;
    @FXML
    private ComboBox<String> ng2;
    @FXML
    private ComboBox<String> ng10;
    @FXML
    private ComboBox<String> ng11;
    @FXML
    private ComboBox<String> ng9;
    @FXML
    private ComboBox<String> gg8;
    @FXML
    private ComboBox<String> gg7;
    @FXML
    private ComboBox<String> gg9;
    @FXML
    private ComboBox<String> gg6;
    @FXML
    private ComboBox<String> gg5;
    @FXML
    private ComboBox<String> gg4;
    @FXML
    private ComboBox<String> gg3;
    @FXML
    private ComboBox<String> gg2;
    @FXML
    private ComboBox<String> gg10;
    @FXML
    private ComboBox<String> gg11;
    @FXML
    private ComboBox<String> tvg8;
    @FXML
    private ComboBox<String> tvg7;
    @FXML
    private ComboBox<String> tvg6;
    @FXML
    private ComboBox<String> tvg9;
    @FXML
    private ComboBox<String> tvg5;
    @FXML
    private ComboBox<String> tvg4;
    @FXML
    private ComboBox<String> tvg3;
    @FXML
    private ComboBox<String> tvg2;
    @FXML
    private ComboBox<String> tvg10;
    @FXML
    private ComboBox<String> tvg11;
    @FXML
    private ComboBox<String> mvg8;
    @FXML
    private ComboBox<String> mvg7;
    @FXML
    private ComboBox<String> mvg9;
    @FXML
    private ComboBox<String> mvg6;
    @FXML
    private ComboBox<String> mvg5;
    @FXML
    private ComboBox<String> mvg4;
    @FXML
    private ComboBox<String> mvg3;
    @FXML
    private ComboBox<String> mvg2;
    @FXML
    private ComboBox<String> mvg10;
    @FXML
    private ComboBox<String> mvg11;
    @FXML
    private ComboBox<String> n1g1;
    @FXML
    private ComboBox<String> n1g8;
    @FXML
    private ComboBox<String> n1g7;
    @FXML
    private ComboBox<String> n1g9;
    @FXML
    private ComboBox<String> n1g6;
    @FXML
    private ComboBox<String> n1g5;
    @FXML
    private ComboBox<String> n1g4;
    @FXML
    private ComboBox<String> n1g3;
    @FXML
    private ComboBox<String> n1g2;
    @FXML
    private ComboBox<String> n1g10;
    @FXML
    private ComboBox<String> n1g11;
    @FXML
    private ComboBox<String> n2g1;
    @FXML
    private ComboBox<String> n2g8;
    @FXML
    private ComboBox<String> n2g7;
    @FXML
    private ComboBox<String> n2g9;
    @FXML
    private ComboBox<String> n2g6;
    @FXML
    private ComboBox<String> n2g5;
    @FXML
    private ComboBox<String> n2g4;
    @FXML
    private ComboBox<String> n2g3;
    @FXML
    private ComboBox<String> n2g2;
    @FXML
    private ComboBox<String> n3g1;
    @FXML
    private ComboBox<String> n3g8;
    @FXML
    private ComboBox<String> n3g7;
    @FXML
    private ComboBox<String> n3g9;
    @FXML
    private ComboBox<String> n3g6;
    @FXML
    private ComboBox<String> n3g5;
    @FXML
    private ComboBox<String> n3g4;
    @FXML
    private ComboBox<String> n3g3;
    @FXML
    private ComboBox<String> n3g2;
    @FXML
    private ComboBox<String> n3g10;
    @FXML
    private ComboBox<String> n3g11;
    @FXML
    private ComboBox<String> n2g10;
    @FXML
    private ComboBox<String> n2g11;
    @FXML
    private ComboBox<String> n4g8;
    @FXML
    private ComboBox<String> n4g7;
    @FXML
    private ComboBox<String> n4g9;
    @FXML
    private ComboBox<String> n4g6;
    @FXML
    private ComboBox<String> n4g5;
    @FXML
    private ComboBox<String> n4g4;
    @FXML
    private ComboBox<String> n4g3;
    @FXML
    private ComboBox<String> n4g2;
    @FXML
    private ComboBox<String> n4g10;
    @FXML
    private ComboBox<String> n4g11;
    @FXML
    private ComboBox<String> n5g1;
    @FXML
    private ComboBox<String> n5g8;
    @FXML
    private ComboBox<String> n5g7;
    @FXML
    private ComboBox<String> n5g9;
    @FXML
    private ComboBox<String> n5g6;
    @FXML
    private ComboBox<String> n5g5;
    @FXML
    private ComboBox<String> n5g4;
    @FXML
    private ComboBox<String> n5g3;
    @FXML
    private ComboBox<String> n5g2;
    @FXML
    private ComboBox<String> n5g10;
    @FXML
    private ComboBox<String> n5g11;
    @FXML
    private ComboBox<String> n4g1;
    @FXML
    private ComboBox<String> enc1;
    @FXML
    private ComboBox<String> enc4;
    @FXML
    private ComboBox<String> enc3;
    @FXML
    private ComboBox<String> enc2;
    @FXML
    private ComboBox<String> cs1;
    @FXML
    private ComboBox<String> cs2;
    @FXML
    private ComboBox<String> cs3;
    @FXML
    private ComboBox<String> cs4;
    @FXML
    private ComboBox<String> enc9;
    @FXML
    private ComboBox<String> enc8;
    @FXML
    private ComboBox<String> enc7;
    @FXML
    private ComboBox<String> enc6;
    @FXML
    private ComboBox<String> enc5;
    @FXML
    private ComboBox<String> enc11;
    @FXML
    private ComboBox<String> enc10;
    @FXML
    private ComboBox<String> cs5;
    @FXML
    private ComboBox<String> cs6;
    @FXML
    private ComboBox<String> cs7;
    @FXML
    private ComboBox<String> cs8;
    @FXML
    private ComboBox<String> cs9;
    @FXML
    private ComboBox<String> cs10;
    @FXML
    private ComboBox<String> cs11;
    @FXML
    private ComboBox<String> tvg1;

    @FXML
    private RadioButton juntarn1g1;
    @FXML
    private RadioButton juntarn1g2;
    @FXML
    private RadioButton juntarn1g3;
    @FXML
    private RadioButton juntarn1g4;
    @FXML
    private RadioButton juntarn1g5;
    @FXML
    private RadioButton juntarn1g6;
    @FXML
    private RadioButton juntarn1g7;
    @FXML
    private RadioButton juntarn1g8;
    @FXML
    private RadioButton juntarn1g9;
    @FXML
    private RadioButton juntarn1g10;

    @FXML
    private RadioButton juntarn2g1;
    @FXML
    private RadioButton juntarn2g2;
    @FXML
    private RadioButton juntarn2g3;
    @FXML
    private RadioButton juntarn2g4;
    @FXML
    private RadioButton juntarn2g5;
    @FXML
    private RadioButton juntarn2g6;
    @FXML
    private RadioButton juntarn2g7;
    @FXML
    private RadioButton juntarn2g8;
    @FXML
    private RadioButton juntarn2g9;
    @FXML
    private RadioButton juntarn2g10;

    @FXML
    private RadioButton juntarn3g1;
    @FXML
    private RadioButton juntarn3g2;
    @FXML
    private RadioButton juntarn3g3;
    @FXML
    private RadioButton juntarn3g4;
    @FXML
    private RadioButton juntarn3g5;
    @FXML
    private RadioButton juntarn3g6;
    @FXML
    private RadioButton juntarn3g7;
    @FXML
    private RadioButton juntarn3g8;
    @FXML
    private RadioButton juntarn3g9;
    @FXML
    private RadioButton juntarn3g10;

    @FXML
    private RadioButton juntarn4g1;
    @FXML
    private RadioButton juntarn4g2;
    @FXML
    private RadioButton juntarn4g3;
    @FXML
    private RadioButton juntarn4g4;
    @FXML
    private RadioButton juntarn4g5;
    @FXML
    private RadioButton juntarn4g6;
    @FXML
    private RadioButton juntarn4g7;
    @FXML
    private RadioButton juntarn4g8;
    @FXML
    private RadioButton juntarn4g9;
    @FXML
    private RadioButton juntarn4g10;

    @FXML
    private RadioButton juntarn5g1;
    @FXML
    private RadioButton juntarn5g2;
    @FXML
    private RadioButton juntarn5g3;
    @FXML
    private RadioButton juntarn5g4;
    @FXML
    private RadioButton juntarn5g5;
    @FXML
    private RadioButton juntarn5g6;
    @FXML
    private RadioButton juntarn5g7;
    @FXML
    private RadioButton juntarn5g8;
    @FXML
    private RadioButton juntarn5g9;
    @FXML
    private RadioButton juntarn5g10;

    @FXML
    private RadioButton separarn1g1;
    @FXML
    private RadioButton separarn1g2;
    @FXML
    private RadioButton separarn1g3;
    @FXML
    private RadioButton separarn1g4;
    @FXML
    private RadioButton separarn1g5;
    @FXML
    private RadioButton separarn1g6;
    @FXML
    private RadioButton separarn1g7;
    @FXML
    private RadioButton separarn1g8;
    @FXML
    private RadioButton separarn1g9;
    @FXML
    private RadioButton separarn1g10;

    @FXML
    private RadioButton separarn2g1;
    @FXML
    private RadioButton separarn2g2;
    @FXML
    private RadioButton separarn2g3;
    @FXML
    private RadioButton separarn2g4;
    @FXML
    private RadioButton separarn2g5;
    @FXML
    private RadioButton separarn2g6;
    @FXML
    private RadioButton separarn2g7;
    @FXML
    private RadioButton separarn2g8;
    @FXML
    private RadioButton separarn2g9;
    @FXML
    private RadioButton separarn2g10;

    @FXML
    private RadioButton separarn3g1;
    @FXML
    private RadioButton separarn3g2;
    @FXML
    private RadioButton separarn3g3;
    @FXML
    private RadioButton separarn3g4;
    @FXML
    private RadioButton separarn3g5;
    @FXML
    private RadioButton separarn3g6;
    @FXML
    private RadioButton separarn3g7;
    @FXML
    private RadioButton separarn3g8;
    @FXML
    private RadioButton separarn3g9;
    @FXML
    private RadioButton separarn3g10;

    @FXML
    private RadioButton separarn4g1;
    @FXML
    private RadioButton separarn4g2;
    @FXML
    private RadioButton separarn4g3;
    @FXML
    private RadioButton separarn4g4;
    @FXML
    private RadioButton separarn4g5;
    @FXML
    private RadioButton separarn4g6;
    @FXML
    private RadioButton separarn4g7;
    @FXML
    private RadioButton separarn4g8;
    @FXML
    private RadioButton separarn4g9;
    @FXML
    private RadioButton separarn4g10;

    @FXML
    private RadioButton separarn5g1;
    @FXML
    private RadioButton separarn5g2;
    @FXML
    private RadioButton separarn5g3;
    @FXML
    private RadioButton separarn5g4;
    @FXML
    private RadioButton separarn5g5;
    @FXML
    private RadioButton separarn5g6;
    @FXML
    private RadioButton separarn5g7;
    @FXML
    private RadioButton separarn5g8;
    @FXML
    private RadioButton separarn5g9;
    @FXML
    private RadioButton separarn5g10;

    @FXML
    private Pane panen1g1;
    @FXML
    private Pane panen1g2;
    @FXML
    private Pane panen1g3;
    @FXML
    private Pane panen1g4;
    @FXML
    private Pane panen1g5;
    @FXML
    private Pane panen1g6;
    @FXML
    private Pane panen1g7;
    @FXML
    private Pane panen1g8;
    @FXML
    private Pane panen1g9;
    @FXML
    private Pane panen1g10;
    @FXML
    private Pane panen1g11;

    @FXML
    private Pane panen2g1;
    @FXML
    private Pane panen2g2;
    @FXML
    private Pane panen2g3;
    @FXML
    private Pane panen2g4;
    @FXML
    private Pane panen2g5;
    @FXML
    private Pane panen2g6;
    @FXML
    private Pane panen2g7;
    @FXML
    private Pane panen2g8;
    @FXML
    private Pane panen2g9;
    @FXML
    private Pane panen2g10;
    @FXML
    private Pane panen2g11;

    @FXML
    private Pane panen3g1;
    @FXML
    private Pane panen3g2;
    @FXML
    private Pane panen3g3;
    @FXML
    private Pane panen3g4;
    @FXML
    private Pane panen3g5;
    @FXML
    private Pane panen3g6;
    @FXML
    private Pane panen3g7;
    @FXML
    private Pane panen3g8;
    @FXML
    private Pane panen3g9;
    @FXML
    private Pane panen3g10;
    @FXML
    private Pane panen3g11;

    @FXML
    private Pane panen4g1;
    @FXML
    private Pane panen4g2;
    @FXML
    private Pane panen4g3;
    @FXML
    private Pane panen4g4;
    @FXML
    private Pane panen4g5;
    @FXML
    private Pane panen4g6;
    @FXML
    private Pane panen4g7;
    @FXML
    private Pane panen4g8;
    @FXML
    private Pane panen4g9;
    @FXML
    private Pane panen4g10;
    @FXML
    private Pane panen4g11;

    @FXML
    private Pane panen5g1;
    @FXML
    private Pane panen5g2;
    @FXML
    private Pane panen5g3;
    @FXML
    private Pane panen5g4;
    @FXML
    private Pane panen5g5;
    @FXML
    private Pane panen5g6;
    @FXML
    private Pane panen5g7;
    @FXML
    private Pane panen5g8;
    @FXML
    private Pane panen5g9;
    @FXML
    private Pane panen5g10;
    @FXML
    private Pane panen5g11;

    @FXML
    private Label distancian1g1;
    @FXML
    private Label distancian1g2;
    @FXML
    private Label distancian1g3;
    @FXML
    private Label distancian1g4;
    @FXML
    private Label distancian1g5;
    @FXML
    private Label distancian1g6;
    @FXML
    private Label distancian1g7;
    @FXML
    private Label distancian1g8;
    @FXML
    private Label distancian1g9;
    @FXML
    private Label distancian1g10;
    @FXML
    private Label distancian1g11;

    @FXML
    private Label distancian2g1;
    @FXML
    private Label distancian2g2;
    @FXML
    private Label distancian2g3;
    @FXML
    private Label distancian2g4;
    @FXML
    private Label distancian2g5;
    @FXML
    private Label distancian2g6;
    @FXML
    private Label distancian2g7;
    @FXML
    private Label distancian2g8;
    @FXML
    private Label distancian2g9;
    @FXML
    private Label distancian2g10;
    @FXML
    private Label distancian2g11;

    @FXML
    private Label distancian3g1;
    @FXML
    private Label distancian3g2;
    @FXML
    private Label distancian3g3;
    @FXML
    private Label distancian3g4;
    @FXML
    private Label distancian3g5;
    @FXML
    private Label distancian3g6;
    @FXML
    private Label distancian3g7;
    @FXML
    private Label distancian3g8;
    @FXML
    private Label distancian3g9;
    @FXML
    private Label distancian3g10;
    @FXML
    private Label distancian3g11;

    @FXML
    private Label distancian4g1;
    @FXML
    private Label distancian4g2;
    @FXML
    private Label distancian4g3;
    @FXML
    private Label distancian4g4;
    @FXML
    private Label distancian4g5;
    @FXML
    private Label distancian4g6;
    @FXML
    private Label distancian4g7;
    @FXML
    private Label distancian4g8;
    @FXML
    private Label distancian4g9;
    @FXML
    private Label distancian4g10;
    @FXML
    private Label distancian4g11;

    @FXML
    private Label distancian5g1;
    @FXML
    private Label distancian5g2;
    @FXML
    private Label distancian5g3;
    @FXML
    private Label distancian5g4;
    @FXML
    private Label distancian5g5;
    @FXML
    private Label distancian5g6;
    @FXML
    private Label distancian5g7;
    @FXML
    private Label distancian5g8;
    @FXML
    private Label distancian5g9;
    @FXML
    private Label distancian5g10;
    @FXML
    private Label distancian5g11;
    @FXML
    private Button diccionario;

    @FXML
    private TextField sp1;
    @FXML
    private TextField sp4;
    @FXML
    private TextField sp3;
    @FXML
    private TextField sp2;
    @FXML
    private TextField sp5;
    @FXML
    private TextField sp8;
    @FXML
    private TextField sp7;
    @FXML
    private TextField sp6;
    @FXML
    private TextField sp9;
    @FXML
    private TextField sp11;
    @FXML
    private TextField sp10;
    @FXML
    private TextField rp;
    @FXML
    private TextField trd;
    @FXML
    private Button guardarBT;
    @FXML
    private Button exportBT;

    @FXML
    private Label masn1g1;
    @FXML
    private Label masn1g2;
    @FXML
    private Label masn1g3;
    @FXML
    private Label masn1g4;
    @FXML
    private Label masn1g5;
    @FXML
    private Label masn1g6;
    @FXML
    private Label masn1g7;
    @FXML
    private Label masn1g8;
    @FXML
    private Label masn1g9;
    @FXML
    private Label masn1g10;

    @FXML
    private Label masn2g1;
    @FXML
    private Label masn2g2;
    @FXML
    private Label masn2g3;
    @FXML
    private Label masn2g4;
    @FXML
    private Label masn2g5;
    @FXML
    private Label masn2g6;
    @FXML
    private Label masn2g7;
    @FXML
    private Label masn2g8;
    @FXML
    private Label masn2g9;
    @FXML
    private Label masn2g10;

    @FXML
    private Label masn3g1;
    @FXML
    private Label masn3g2;
    @FXML
    private Label masn3g3;
    @FXML
    private Label masn3g4;
    @FXML
    private Label masn3g5;
    @FXML
    private Label masn3g6;
    @FXML
    private Label masn3g7;
    @FXML
    private Label masn3g8;
    @FXML
    private Label masn3g9;
    @FXML
    private Label masn3g10;

    @FXML
    private Label masn4g1;
    @FXML
    private Label masn4g2;
    @FXML
    private Label masn4g3;
    @FXML
    private Label masn4g4;
    @FXML
    private Label masn4g5;
    @FXML
    private Label masn4g6;
    @FXML
    private Label masn4g7;
    @FXML
    private Label masn4g8;
    @FXML
    private Label masn4g9;
    @FXML
    private Label masn4g10;

    @FXML
    private Label masn5g1;
    @FXML
    private Label masn5g2;
    @FXML
    private Label masn5g3;
    @FXML
    private Label masn5g4;
    @FXML
    private Label masn5g5;
    @FXML
    private Label masn5g6;
    @FXML
    private Label masn5g7;
    @FXML
    private Label masn5g8;
    @FXML
    private Label masn5g9;
    @FXML
    private Label masn5g10;

    @FXML
    private Label menosn1g1;
    @FXML
    private Label menosn1g2;
    @FXML
    private Label menosn1g3;
    @FXML
    private Label menosn1g4;
    @FXML
    private Label menosn1g5;
    @FXML
    private Label menosn1g6;
    @FXML
    private Label menosn1g7;
    @FXML
    private Label menosn1g8;
    @FXML
    private Label menosn1g9;
    @FXML
    private Label menosn1g10;

    @FXML
    private Label menosn2g1;
    @FXML
    private Label menosn2g2;
    @FXML
    private Label menosn2g3;
    @FXML
    private Label menosn2g4;
    @FXML
    private Label menosn2g5;
    @FXML
    private Label menosn2g6;
    @FXML
    private Label menosn2g7;
    @FXML
    private Label menosn2g8;
    @FXML
    private Label menosn2g9;
    @FXML
    private Label menosn2g10;

    @FXML
    private Label menosn3g1;
    @FXML
    private Label menosn3g2;
    @FXML
    private Label menosn3g3;
    @FXML
    private Label menosn3g4;
    @FXML
    private Label menosn3g5;
    @FXML
    private Label menosn3g6;
    @FXML
    private Label menosn3g7;
    @FXML
    private Label menosn3g8;
    @FXML
    private Label menosn3g9;
    @FXML
    private Label menosn3g10;

    @FXML
    private Label menosn4g1;
    @FXML
    private Label menosn4g2;
    @FXML
    private Label menosn4g3;
    @FXML
    private Label menosn4g4;
    @FXML
    private Label menosn4g5;
    @FXML
    private Label menosn4g6;
    @FXML
    private Label menosn4g7;
    @FXML
    private Label menosn4g8;
    @FXML
    private Label menosn4g9;
    @FXML
    private Label menosn4g10;

    @FXML
    private Label menosn5g1;
    @FXML
    private Label menosn5g2;
    @FXML
    private Label menosn5g3;
    @FXML
    private Label menosn5g4;
    @FXML
    private Label menosn5g5;
    @FXML
    private Label menosn5g6;
    @FXML
    private Label menosn5g7;
    @FXML
    private Label menosn5g8;
    @FXML
    private Label menosn5g9;
    @FXML
    private Label menosn5g10;

    private Button btnVolver;

    String ra;

    @FXML
    private ComboBox<String> comboselectfrase;

    // *************************************************************

    ObservableList<String> items;
    ArrayList<String> tipospalabra = new ArrayList<>();
    ArrayList<String> casopersona = new ArrayList<>();
    ArrayList<String> genero = new ArrayList<>();
    ArrayList<String> numero = new ArrayList<>();
    ArrayList<String> tiempo = new ArrayList<>();
    ArrayList<String> modovoz = new ArrayList<>();
    ArrayList<String> niveles = new ArrayList<>();
    ArrayList<String> encliticas = new ArrayList<>();
    ArrayList<String> crsb = new ArrayList<>();
    ArrayList<String> caperg1 = new ArrayList<>();
    ArrayList<String> caperg2 = new ArrayList<>();
    ArrayList<String> caperg3 = new ArrayList<>();
    ArrayList<String> caperg4 = new ArrayList<>();
    ArrayList<String> caperg5 = new ArrayList<>();
    ArrayList<String> caperg6 = new ArrayList<>();
    ArrayList<String> caperg7 = new ArrayList<>();
    ArrayList<String> caperg8 = new ArrayList<>();
    ArrayList<String> caperg9 = new ArrayList<>();
    ArrayList<String> caperg10 = new ArrayList<>();
    ArrayList<String> caperg11 = new ArrayList<>();
    ArrayList<String> limpieza = new ArrayList<>();

    private Workbook excel;
    private Sheet hoja;
    public Row fila = null;
    private int numfr;
    private int numcl;


    // ********************************************************

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboselectfrase.setOnAction(e -> {
            limpiarGUI();
            cargaExcel();
            try {
                String[] palabras1 = comboselectfrase.getValue().split("\\s+");  // Separar por espacio en blanco
                tfpalabra0.setText(palabras1.length > 0 ? palabras1[0] : "");
                tfpalabra1.setText(palabras1.length > 1 ? palabras1[1] : "");
                tfpalabra2.setText(palabras1.length > 2 ? palabras1[2] : "");
                tfpalabra3.setText(palabras1.length > 3 ? palabras1[3] : "");
                tfpalabra4.setText(palabras1.length > 4 ? palabras1[4] : "");
                tfpalabra5.setText(palabras1.length > 5 ? palabras1[5] : "");
                tfpalabra6.setText(palabras1.length > 6 ? palabras1[6] : "");
                tfpalabra7.setText(palabras1.length > 7 ? palabras1[7] : "");
                tfpalabra8.setText(palabras1.length > 8 ? palabras1[8] : "");
                tfpalabra9.setText(palabras1.length > 9 ? palabras1[9] : "");
                tfpalabra10.setText(palabras1.length > 10 ? palabras1[10] : "");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

        Text texttituloflow = new Text("Análisis sintáctico");
        texttituloflow.setStyle("-fx-font-family: serif; -fx-font-size: 42;"
                + "-fx-font-style: oblique; -fx-font-weight: bold");
        Color colorEffect = new Color(0.69, 0.5, 0.5, 1);
        texttituloflow.setFill(colorEffect);
        texttituloflow.setFont(Font.font("Helvetica", FontWeight.BOLD, 40));
        tituloflow.getChildren().addAll(texttituloflow);

        /**panen1g1.setOnMouseEntered(event -> {
            if (panen1g1.getId().equals("panen1g1")) {
                juntarn1g1.setVisible(true);
                masn1g1.setVisible(true);
                if (n1g1.getPrefWidth() != 149.6){
                    separarn1g1.setVisible(true);
                    menosn1g1.setVisible(true);
                } else {
                    separarn1g1.setVisible(false);
                    menosn1g1.setVisible(false);
                }
            }
        });

        panen1g1.setOnMouseExited(event -> {
            if (panen1g1.getId().equals("panen1g1")) {
                juntarn1g1.setVisible(false);
                masn1g1.setVisible(false);
                if (n1g1.getPrefWidth() != 149.6){
                    separarn1g1.setVisible(false);
                    menosn1g1.setVisible(false);
                }
            }
        });

        panen1g2.setOnMouseEntered(event -> {
            if (panen1g2.getId().equals("panen1g2")) {
                juntarn1g2.setVisible(true);
                masn1g2.setVisible(true);
                separarn1g2.setVisible(true);
                menosn1g2.setVisible(true);
            }
        });

        panen1g2.setOnMouseExited(event -> {
            if (panen1g2.getId().equals("panen1g2")) {
                juntarn1g2.setVisible(false);
                masn1g2.setVisible(false);
                separarn1g2.setVisible(false);
                menosn1g2.setVisible(false);
            }
        });

        panen1g3.setOnMouseEntered(event -> {
            if (panen1g3.getId().equals("panen1g3")) {
                juntarn1g3.setVisible(true);
                masn1g3.setVisible(true);
                separarn1g3.setVisible(true);
                menosn1g3.setVisible(true);
            }
        });

        panen1g3.setOnMouseExited(event -> {
            if (panen1g3.getId().equals("panen1g3")) {
                juntarn1g3.setVisible(false);
                masn1g3.setVisible(false);
                separarn1g3.setVisible(false);
                menosn1g3.setVisible(false);
            }
        });

        panen1g4.setOnMouseEntered(event -> {
            if (panen1g4.getId().equals("panen1g4")) {
                juntarn1g4.setVisible(true);
                masn1g4.setVisible(true);
                separarn1g4.setVisible(true);
                menosn1g4.setVisible(true);
            }
        });

        panen1g4.setOnMouseExited(event -> {
            if (panen1g4.getId().equals("panen1g4")) {
                juntarn1g4.setVisible(false);
                masn1g4.setVisible(false);
                separarn1g4.setVisible(false);
                menosn1g4.setVisible(false);
            }
        });

        panen1g5.setOnMouseEntered(event -> {
            if (panen1g5.getId().equals("panen1g5")) {
                juntarn1g5.setVisible(true);
                masn1g5.setVisible(true);
                separarn1g5.setVisible(true);
                menosn1g5.setVisible(true);
            }
        });

        panen1g5.setOnMouseExited(event -> {
            if (panen1g5.getId().equals("panen1g5")) {
                juntarn1g5.setVisible(false);
                masn1g5.setVisible(false);
                separarn1g5.setVisible(false);
                menosn1g5.setVisible(false);
            }
        });

        panen1g6.setOnMouseEntered(event -> {
            if (panen1g6.getId().equals("panen1g6")) {
                juntarn1g6.setVisible(true);
                masn1g6.setVisible(true);
                separarn1g6.setVisible(true);
                menosn1g6.setVisible(true);
            }
        });

        panen1g6.setOnMouseExited(event -> {
            if (panen1g6.getId().equals("panen1g6")) {
                juntarn1g6.setVisible(false);
                masn1g6.setVisible(false);
                separarn1g6.setVisible(false);
                menosn1g6.setVisible(false);
            }
        });

        panen1g7.setOnMouseEntered(event -> {
            if (panen1g7.getId().equals("panen1g7")) {
                juntarn1g7.setVisible(true);
                masn1g7.setVisible(true);
                separarn1g7.setVisible(true);
                menosn1g7.setVisible(true);
            }
        });

        panen1g7.setOnMouseExited(event -> {
            if (panen1g7.getId().equals("panen1g7")) {
                juntarn1g7.setVisible(false);
                masn1g7.setVisible(false);
                separarn1g7.setVisible(false);
                menosn1g7.setVisible(false);
            }
        });

        panen1g8.setOnMouseEntered(event -> {
            if (panen1g8.getId().equals("panen1g8")) {
                juntarn1g8.setVisible(true);
                masn1g8.setVisible(true);
                separarn1g8.setVisible(true);
                menosn1g8.setVisible(true);
            }
        });

        panen1g8.setOnMouseExited(event -> {
            if (panen1g8.getId().equals("panen1g8")) {
                juntarn1g8.setVisible(false);
                masn1g8.setVisible(false);
                separarn1g8.setVisible(false);
                menosn1g8.setVisible(false);
            }
        });

        panen1g9.setOnMouseEntered(event -> {
            if (panen1g9.getId().equals("panen1g9")) {
                juntarn1g9.setVisible(true);
                masn1g9.setVisible(true);
                separarn1g9.setVisible(true);
                menosn1g9.setVisible(true);
            }
        });

        panen1g9.setOnMouseExited(event -> {
            if (panen1g9.getId().equals("panen1g9")) {
                juntarn1g9.setVisible(false);
                masn1g9.setVisible(false);
                separarn1g9.setVisible(false);
                menosn1g9.setVisible(false);
            }
        });

        panen1g10.setOnMouseEntered(event -> {
            if (panen1g10.getId().equals("panen1g10")) {
                juntarn1g10.setVisible(true);
                masn1g10.setVisible(true);
                separarn1g10.setVisible(true);
                menosn1g10.setVisible(true);
            }
        });

        panen1g10.setOnMouseExited(event -> {
            if (panen1g10.getId().equals("panen1g10")) {
                juntarn1g10.setVisible(false);
                masn1g10.setVisible(false);
                separarn1g10.setVisible(false);
                menosn1g10.setVisible(false);
            }
        });

        panen2g1.setOnMouseEntered(event -> {
            if (panen2g1.getId().equals("panen2g1")) {
                juntarn2g1.setVisible(true);
                masn2g1.setVisible(true);
                if (n2g1.getPrefWidth() != 149.6){
                    separarn2g1.setVisible(true);
                    menosn2g1.setVisible(true);
                } else {
                    separarn2g1.setVisible(false);
                    menosn2g1.setVisible(false);
                }
            }
        });

        panen2g1.setOnMouseExited(event -> {
            if (panen2g1.getId().equals("panen2g1")) {
                juntarn2g1.setVisible(false);
                masn2g1.setVisible(false);
                if (n2g1.getPrefWidth() != 149.6){
                    separarn2g1.setVisible(false);
                    menosn2g1.setVisible(false);
                }
            }
        });

        panen2g2.setOnMouseEntered(event -> {
            if (panen2g2.getId().equals("panen2g2")) {
                juntarn2g2.setVisible(true);
                masn2g2.setVisible(true);
                separarn2g2.setVisible(true);
                menosn2g2.setVisible(true);
            }
        });

        panen2g2.setOnMouseExited(event -> {
            if (panen2g2.getId().equals("panen2g2")) {
                juntarn2g2.setVisible(false);
                masn2g2.setVisible(false);
                separarn2g2.setVisible(false);
                menosn2g2.setVisible(false);
            }
        });

        panen2g3.setOnMouseEntered(event -> {
            if (panen2g3.getId().equals("panen2g3")) {
                juntarn2g3.setVisible(true);
                masn2g3.setVisible(true);
                separarn2g3.setVisible(true);
                menosn2g3.setVisible(true);
            }
        });

        panen2g3.setOnMouseExited(event -> {
            if (panen2g3.getId().equals("panen2g3")) {
                juntarn2g3.setVisible(false);
                masn2g3.setVisible(false);
                separarn2g3.setVisible(false);
                menosn2g3.setVisible(false);
            }
        });

        panen2g4.setOnMouseEntered(event -> {
            if (panen2g4.getId().equals("panen2g4")) {
                juntarn2g4.setVisible(true);
                masn2g4.setVisible(true);
                separarn2g4.setVisible(true);
                menosn2g4.setVisible(true);
            }
        });

        panen2g4.setOnMouseExited(event -> {
            if (panen2g4.getId().equals("panen2g4")) {
                juntarn2g4.setVisible(false);
                masn2g4.setVisible(false);
                separarn2g4.setVisible(false);
                menosn2g4.setVisible(false);
            }
        });

        panen2g5.setOnMouseEntered(event -> {
            if (panen2g5.getId().equals("panen2g5")) {
                juntarn2g5.setVisible(true);
                masn2g5.setVisible(true);
                separarn2g5.setVisible(true);
                menosn2g5.setVisible(true);
            }
        });

        panen2g5.setOnMouseExited(event -> {
            if (panen2g5.getId().equals("panen2g5")) {
                juntarn2g5.setVisible(false);
                masn2g5.setVisible(false);
                separarn2g5.setVisible(false);
                menosn2g5.setVisible(false);
            }
        });

        panen2g6.setOnMouseEntered(event -> {
            if (panen2g6.getId().equals("panen2g6")) {
                juntarn2g6.setVisible(true);
                masn2g6.setVisible(true);
                separarn2g6.setVisible(true);
                menosn2g6.setVisible(true);
            }
        });

        panen2g6.setOnMouseExited(event -> {
            if (panen2g6.getId().equals("panen2g6")) {
                juntarn2g6.setVisible(false);
                masn2g6.setVisible(false);
                separarn2g6.setVisible(false);
                menosn2g6.setVisible(false);
            }
        });

        panen2g7.setOnMouseEntered(event -> {
            if (panen2g7.getId().equals("panen2g7")) {
                juntarn2g7.setVisible(true);
                masn2g7.setVisible(true);
                separarn2g7.setVisible(true);
                menosn2g7.setVisible(true);
            }
        });

        panen2g7.setOnMouseExited(event -> {
            if (panen2g7.getId().equals("panen2g7")) {
                juntarn2g7.setVisible(false);
                masn2g7.setVisible(false);
                separarn2g7.setVisible(false);
                menosn2g7.setVisible(false);
            }
        });

        panen2g8.setOnMouseEntered(event -> {
            if (panen2g8.getId().equals("panen2g8")) {
                juntarn2g8.setVisible(true);
                masn2g8.setVisible(true);
                separarn2g8.setVisible(true);
                menosn2g8.setVisible(true);
            }
        });

        panen2g8.setOnMouseExited(event -> {
            if (panen2g8.getId().equals("panen2g8")) {
                juntarn2g8.setVisible(false);
                masn2g8.setVisible(false);
                separarn2g8.setVisible(false);
                menosn2g8.setVisible(false);
            }
        });

        panen2g9.setOnMouseEntered(event -> {
            if (panen2g9.getId().equals("panen2g9")) {
                juntarn2g9.setVisible(true);
                masn2g9.setVisible(true);
                separarn2g9.setVisible(true);
                menosn2g9.setVisible(true);
            }
        });

        panen2g9.setOnMouseExited(event -> {
            if (panen2g9.getId().equals("panen2g9")) {
                juntarn2g9.setVisible(false);
                masn2g9.setVisible(false);
                separarn2g9.setVisible(false);
                menosn2g9.setVisible(false);
            }
        });

        panen2g10.setOnMouseEntered(event -> {
            if (panen2g10.getId().equals("panen2g10")) {
                juntarn2g10.setVisible(true);
                masn2g10.setVisible(true);
                separarn2g10.setVisible(true);
                menosn2g10.setVisible(true);
            }
        });

        panen2g10.setOnMouseExited(event -> {
            if (panen2g10.getId().equals("panen2g10")) {
                juntarn2g10.setVisible(false);
                masn2g10.setVisible(false);
                separarn2g10.setVisible(false);
                menosn2g10.setVisible(false);
            }
        });

        panen3g1.setOnMouseEntered(event -> {
            if (panen3g1.getId().equals("panen3g1")) {
                juntarn3g1.setVisible(true);
                masn3g1.setVisible(true);
                if (n3g1.getPrefWidth() != 149.6){
                    separarn3g1.setVisible(true);
                    menosn3g1.setVisible(true);
                } else {
                    separarn3g1.setVisible(false);
                    menosn3g1.setVisible(false);
                }
            }
        });

        panen3g1.setOnMouseExited(event -> {
            if (panen3g1.getId().equals("panen3g1")) {
                juntarn3g1.setVisible(false);
                masn3g1.setVisible(false);
                if (n3g1.getPrefWidth() != 149.6){
                    separarn3g1.setVisible(false);
                    menosn3g1.setVisible(false);
                }
            }
        });

        panen3g2.setOnMouseEntered(event -> {
            if (panen3g2.getId().equals("panen3g2")) {
                juntarn3g2.setVisible(true);
                masn3g2.setVisible(true);
                separarn3g2.setVisible(true);
                menosn3g2.setVisible(true);
            }
        });

        panen3g2.setOnMouseExited(event -> {
            if (panen3g2.getId().equals("panen3g2")) {
                juntarn3g2.setVisible(false);
                masn3g2.setVisible(false);
                separarn3g2.setVisible(false);
                menosn3g2.setVisible(false);
            }
        });

        panen3g3.setOnMouseEntered(event -> {
            if (panen3g3.getId().equals("panen3g3")) {
                juntarn3g3.setVisible(true);
                masn3g3.setVisible(true);
                separarn3g3.setVisible(true);
                menosn3g3.setVisible(true);
            }
        });

        panen3g3.setOnMouseExited(event -> {
            if (panen3g3.getId().equals("panen3g3")) {
                juntarn3g3.setVisible(false);
                masn3g3.setVisible(false);
                separarn3g3.setVisible(false);
                menosn3g3.setVisible(false);
            }
        });

        panen3g4.setOnMouseEntered(event -> {
            if (panen3g4.getId().equals("panen3g4")) {
                juntarn3g4.setVisible(true);
                masn3g4.setVisible(true);
                separarn3g4.setVisible(true);
                menosn3g4.setVisible(true);
            }
        });

        panen3g4.setOnMouseExited(event -> {
            if (panen3g4.getId().equals("panen3g4")) {
                juntarn3g4.setVisible(false);
                masn3g4.setVisible(false);
                separarn3g4.setVisible(false);
                menosn3g4.setVisible(false);
            }
        });

        panen3g5.setOnMouseEntered(event -> {
            if (panen3g5.getId().equals("panen3g5")) {
                juntarn3g5.setVisible(true);
                masn3g5.setVisible(true);
                separarn3g5.setVisible(true);
                menosn3g5.setVisible(true);
            }
        });

        panen3g5.setOnMouseExited(event -> {
            if (panen3g5.getId().equals("panen3g5")) {
                juntarn3g5.setVisible(false);
                masn3g5.setVisible(false);
                separarn3g5.setVisible(false);
                menosn3g5.setVisible(false);
            }
        });

        panen3g6.setOnMouseEntered(event -> {
            if (panen3g6.getId().equals("panen3g6")) {
                juntarn3g6.setVisible(true);
                masn3g6.setVisible(true);
                separarn3g6.setVisible(true);
                menosn3g6.setVisible(true);
            }
        });

        panen3g6.setOnMouseExited(event -> {
            if (panen3g6.getId().equals("panen3g6")) {
                juntarn3g6.setVisible(false);
                masn3g6.setVisible(false);
                separarn3g6.setVisible(false);
                menosn3g6.setVisible(false);
            }
        });

        panen3g7.setOnMouseEntered(event -> {
            if (panen3g7.getId().equals("panen3g7")) {
                juntarn3g7.setVisible(true);
                masn3g7.setVisible(true);
                separarn3g7.setVisible(true);
                menosn3g7.setVisible(true);
            }
        });

        panen3g7.setOnMouseExited(event -> {
            if (panen3g7.getId().equals("panen3g7")) {
                juntarn3g7.setVisible(false);
                masn3g7.setVisible(false);
                separarn3g7.setVisible(false);
                menosn3g7.setVisible(false);
            }
        });

        panen3g8.setOnMouseEntered(event -> {
            if (panen3g8.getId().equals("panen3g8")) {
                juntarn3g8.setVisible(true);
                masn3g8.setVisible(true);
                separarn3g8.setVisible(true);
                menosn3g8.setVisible(true);
            }
        });

        panen3g8.setOnMouseExited(event -> {
            if (panen3g8.getId().equals("panen3g8")) {
                juntarn3g8.setVisible(false);
                masn3g8.setVisible(false);
                separarn3g8.setVisible(false);
                menosn3g8.setVisible(false);
            }
        });

        panen3g9.setOnMouseEntered(event -> {
            if (panen3g9.getId().equals("panen3g9")) {
                juntarn3g9.setVisible(true);
                masn3g9.setVisible(true);
                separarn3g9.setVisible(true);
                menosn3g9.setVisible(true);
            }
        });

        panen3g9.setOnMouseExited(event -> {
            if (panen3g9.getId().equals("panen3g9")) {
                juntarn3g9.setVisible(false);
                masn3g9.setVisible(false);
                separarn3g9.setVisible(false);
                menosn3g9.setVisible(false);
            }
        });

        panen3g10.setOnMouseEntered(event -> {
            if (panen3g10.getId().equals("panen3g10")) {
                juntarn3g10.setVisible(true);
                masn3g10.setVisible(true);
                separarn3g10.setVisible(true);
                menosn3g10.setVisible(true);
            }
        });

        panen3g10.setOnMouseExited(event -> {
            if (panen3g10.getId().equals("panen3g10")) {
                juntarn3g10.setVisible(false);
                masn3g10.setVisible(false);
                separarn3g10.setVisible(false);
                menosn3g10.setVisible(false);
            }
        });

        panen4g1.setOnMouseEntered(event -> {
            if (panen4g1.getId().equals("panen4g1")) {
                juntarn4g1.setVisible(true);
                masn4g1.setVisible(true);
                if (n4g1.getPrefWidth() != 149.6){
                    separarn4g1.setVisible(true);
                    menosn4g1.setVisible(true);
                } else {
                    separarn4g1.setVisible(false);
                    menosn4g1.setVisible(false);
                }
            }
        });

        panen4g1.setOnMouseExited(event -> {
            if (panen4g1.getId().equals("panen4g1")) {
                juntarn4g1.setVisible(false);
                masn4g1.setVisible(false);
                if (n4g1.getPrefWidth() != 149.6){
                    separarn4g1.setVisible(false);
                    menosn4g1.setVisible(false);
                }
            }
        });

        panen4g2.setOnMouseEntered(event -> {
            if (panen4g2.getId().equals("panen4g2")) {
                juntarn4g2.setVisible(true);
                masn4g2.setVisible(true);
                separarn4g2.setVisible(true);
                menosn4g2.setVisible(true);
            }
        });

        panen4g2.setOnMouseExited(event -> {
            if (panen4g2.getId().equals("panen4g2")) {
                juntarn4g2.setVisible(false);
                masn4g2.setVisible(false);
                separarn4g2.setVisible(false);
                menosn4g2.setVisible(false);
            }
        });

        panen4g3.setOnMouseEntered(event -> {
            if (panen4g3.getId().equals("panen4g3")) {
                juntarn4g3.setVisible(true);
                masn4g3.setVisible(true);
                separarn4g3.setVisible(true);
                menosn4g3.setVisible(true);
            }
        });

        panen4g3.setOnMouseExited(event -> {
            if (panen4g3.getId().equals("panen4g3")) {
                juntarn4g3.setVisible(false);
                masn4g3.setVisible(false);
                separarn4g3.setVisible(false);
                menosn4g3.setVisible(false);
            }
        });

        panen4g4.setOnMouseEntered(event -> {
            if (panen4g4.getId().equals("panen4g4")) {
                juntarn4g4.setVisible(true);
                masn4g4.setVisible(true);
                separarn4g4.setVisible(true);
                menosn4g4.setVisible(true);
            }
        });

        panen4g4.setOnMouseExited(event -> {
            if (panen4g4.getId().equals("panen4g4")) {
                juntarn4g4.setVisible(false);
                masn4g4.setVisible(false);
                separarn4g4.setVisible(false);
                menosn4g4.setVisible(false);
            }
        });

        panen4g5.setOnMouseEntered(event -> {
            if (panen4g5.getId().equals("panen4g5")) {
                juntarn4g5.setVisible(true);
                masn4g5.setVisible(true);
                separarn4g5.setVisible(true);
                menosn4g5.setVisible(true);
            }
        });

        panen4g5.setOnMouseExited(event -> {
            if (panen4g5.getId().equals("panen4g5")) {
                juntarn4g5.setVisible(false);
                masn4g5.setVisible(false);
                separarn4g5.setVisible(false);
                menosn4g5.setVisible(false);
            }
        });

        panen4g6.setOnMouseEntered(event -> {
            if (panen4g6.getId().equals("panen4g6")) {
                juntarn4g6.setVisible(true);
                masn4g6.setVisible(true);
                separarn4g6.setVisible(true);
                menosn4g6.setVisible(true);
            }
        });

        panen4g6.setOnMouseExited(event -> {
            if (panen4g6.getId().equals("panen4g6")) {
                juntarn4g6.setVisible(false);
                masn4g6.setVisible(false);
                separarn4g6.setVisible(false);
                menosn4g6.setVisible(false);
            }
        });

        panen4g7.setOnMouseEntered(event -> {
            if (panen4g7.getId().equals("panen4g7")) {
                juntarn4g7.setVisible(true);
                masn4g7.setVisible(true);
                separarn4g7.setVisible(true);
                menosn4g7.setVisible(true);
            }
        });

        panen4g7.setOnMouseExited(event -> {
            if (panen4g7.getId().equals("panen4g7")) {
                juntarn4g7.setVisible(false);
                masn4g7.setVisible(false);
                separarn4g7.setVisible(false);
                menosn4g7.setVisible(false);
            }
        });

        panen4g8.setOnMouseEntered(event -> {
            if (panen4g8.getId().equals("panen4g8")) {
                juntarn4g8.setVisible(true);
                masn4g8.setVisible(true);
                separarn4g8.setVisible(true);
                menosn4g8.setVisible(true);
            }
        });

        panen4g8.setOnMouseExited(event -> {
            if (panen4g8.getId().equals("panen4g8")) {
                juntarn4g8.setVisible(false);
                masn4g8.setVisible(false);
                separarn4g8.setVisible(false);
                menosn4g8.setVisible(false);
            }
        });

        panen4g9.setOnMouseEntered(event -> {
            if (panen4g9.getId().equals("panen4g9")) {
                juntarn4g9.setVisible(true);
                masn4g9.setVisible(true);
                separarn4g9.setVisible(true);
                menosn4g9.setVisible(true);
            }
        });

        panen4g9.setOnMouseExited(event -> {
            if (panen4g9.getId().equals("panen4g9")) {
                juntarn4g9.setVisible(false);
                masn4g9.setVisible(false);
                separarn4g9.setVisible(false);
                menosn4g9.setVisible(false);
            }
        });

        panen4g10.setOnMouseEntered(event -> {
            if (panen4g10.getId().equals("panen4g10")) {
                juntarn4g10.setVisible(true);
                masn4g10.setVisible(true);
                separarn4g10.setVisible(true);
                menosn4g10.setVisible(true);
            }
        });

        panen4g10.setOnMouseExited(event -> {
            if (panen4g10.getId().equals("panen4g10")) {
                juntarn4g10.setVisible(false);
                masn4g10.setVisible(false);
                separarn4g10.setVisible(false);
                menosn4g10.setVisible(false);
            }
        });

        panen5g1.setOnMouseEntered(event -> {
            if (panen5g1.getId().equals("panen5g1")) {
                juntarn5g1.setVisible(true);
                masn5g1.setVisible(true);
                if (n5g1.getPrefWidth() != 149.6){
                    separarn5g1.setVisible(true);
                    menosn5g1.setVisible(true);
                } else {
                    separarn5g1.setVisible(false);
                    menosn5g1.setVisible(false);
                }
            }
        });

        panen5g1.setOnMouseExited(event -> {
            if (panen5g1.getId().equals("panen5g1")) {
                juntarn5g1.setVisible(false);
                masn5g1.setVisible(false);
                if (n5g1.getPrefWidth() != 149.6){
                    separarn5g1.setVisible(false);
                    menosn5g1.setVisible(false);
                }
            }
        });

        panen5g2.setOnMouseEntered(event -> {
            if (panen5g2.getId().equals("panen5g2")) {
                juntarn5g2.setVisible(true);
                masn5g2.setVisible(true);
                separarn5g2.setVisible(true);
                menosn5g2.setVisible(true);
            }
        });

        panen5g2.setOnMouseExited(event -> {
            if (panen5g2.getId().equals("panen5g2")) {
                juntarn5g2.setVisible(false);
                masn5g2.setVisible(false);
                separarn5g2.setVisible(false);
                menosn5g2.setVisible(false);
            }
        });

        panen5g3.setOnMouseEntered(event -> {
            if (panen5g3.getId().equals("panen5g3")) {
                juntarn5g3.setVisible(true);
                masn5g3.setVisible(true);
                separarn5g3.setVisible(true);
                menosn5g3.setVisible(true);
            }
        });

        panen5g3.setOnMouseExited(event -> {
            if (panen5g3.getId().equals("panen5g3")) {
                juntarn5g3.setVisible(false);
                masn5g3.setVisible(false);
                separarn5g3.setVisible(false);
                menosn5g3.setVisible(false);
            }
        });

        panen5g4.setOnMouseEntered(event -> {
            if (panen5g4.getId().equals("panen5g4")) {
                juntarn5g4.setVisible(true);
                masn5g4.setVisible(true);
                separarn5g4.setVisible(true);
                menosn5g4.setVisible(true);
            }
        });

        panen5g4.setOnMouseExited(event -> {
            if (panen5g4.getId().equals("panen5g4")) {
                juntarn5g4.setVisible(false);
                masn5g4.setVisible(false);
                separarn5g4.setVisible(false);
                menosn5g4.setVisible(false);
            }
        });

        panen5g5.setOnMouseEntered(event -> {
            if (panen5g5.getId().equals("panen5g5")) {
                juntarn5g5.setVisible(true);
                masn5g5.setVisible(true);
                separarn5g5.setVisible(true);
                menosn5g5.setVisible(true);
            }
        });

        panen5g5.setOnMouseExited(event -> {
            if (panen5g5.getId().equals("panen5g5")) {
                juntarn5g5.setVisible(false);
                masn5g5.setVisible(false);
                separarn5g5.setVisible(false);
                menosn5g5.setVisible(false);
            }
        });

        panen5g6.setOnMouseEntered(event -> {
            if (panen5g6.getId().equals("panen5g6")) {
                juntarn5g6.setVisible(true);
                masn5g6.setVisible(true);
                separarn5g6.setVisible(true);
                menosn5g6.setVisible(true);
            }
        });

        panen5g6.setOnMouseExited(event -> {
            if (panen5g6.getId().equals("panen5g6")) {
                juntarn5g6.setVisible(false);
                masn5g6.setVisible(false);
                separarn5g6.setVisible(false);
                menosn5g6.setVisible(false);
            }
        });

        panen5g7.setOnMouseEntered(event -> {
            if (panen5g7.getId().equals("panen5g7")) {
                juntarn5g7.setVisible(true);
                masn5g7.setVisible(true);
                separarn5g7.setVisible(true);
                menosn5g7.setVisible(true);
            }
        });

        panen5g7.setOnMouseExited(event -> {
            if (panen5g7.getId().equals("panen5g7")) {
                juntarn5g7.setVisible(false);
                masn5g7.setVisible(false);
                separarn5g7.setVisible(false);
                menosn5g7.setVisible(false);
            }
        });

        panen5g8.setOnMouseEntered(event -> {
            if (panen5g8.getId().equals("panen5g8")) {
                juntarn5g8.setVisible(true);
                masn5g8.setVisible(true);
                separarn5g8.setVisible(true);
                menosn5g8.setVisible(true);
            }
        });

        panen5g8.setOnMouseExited(event -> {
            if (panen5g8.getId().equals("panen5g8")) {
                juntarn5g8.setVisible(false);
                masn5g8.setVisible(false);
                separarn5g8.setVisible(false);
                menosn5g8.setVisible(false);
            }
        });

        panen5g9.setOnMouseEntered(event -> {
            if (panen5g9.getId().equals("panen5g9")) {
                juntarn5g9.setVisible(true);
                masn5g9.setVisible(true);
                separarn5g9.setVisible(true);
                menosn5g9.setVisible(true);
            }
        });

        panen5g9.setOnMouseExited(event -> {
            if (panen5g9.getId().equals("panen5g9")) {
                juntarn5g9.setVisible(false);
                masn5g9.setVisible(false);
                separarn5g9.setVisible(false);
                menosn5g9.setVisible(false);
            }
        });

        panen5g10.setOnMouseEntered(event -> {
            if (panen5g10.getId().equals("panen5g10")) {
                juntarn5g10.setVisible(true);
                masn5g10.setVisible(true);
                separarn5g10.setVisible(true);
                menosn5g10.setVisible(true);
            }
        });

        panen5g10.setOnMouseExited(event -> {
            if (panen5g10.getId().equals("panen5g10")) {
                juntarn5g10.setVisible(false);
                masn5g10.setVisible(false);
                separarn5g10.setVisible(false);
                menosn5g10.setVisible(false);
            }
        });*/

        // Para juntar y separar los campos de los combobox de los niveles sintácticos

        // Juntar y separar n1g1
        juntarn1g1.setOnAction(event -> {
            if (distancian1g1.getPrefWidth() == 1 && distancian1g2.getPrefWidth() == 1 || distancian1g1.getPrefWidth() == 2 && distancian1g3.getPrefWidth() == 1
                    || distancian1g1.getPrefWidth() == 3 && distancian1g4.getPrefWidth() == 1 || distancian1g1.getPrefWidth() == 4 && distancian1g5.getPrefWidth() == 1
                    || distancian1g1.getPrefWidth() == 5 && distancian1g6.getPrefWidth() == 1 || distancian1g1.getPrefWidth() == 6 && distancian1g7.getPrefWidth() == 1
                    || distancian1g1.getPrefWidth() == 7 && distancian1g8.getPrefWidth() == 1 || distancian1g1.getPrefWidth() == 8 && distancian1g9.getPrefWidth() == 1
                    || distancian1g1.getPrefWidth() == 9 && distancian1g10.getPrefWidth() == 1 || distancian1g1.getPrefWidth() == 10 && distancian1g11.getPrefWidth() == 1){
                if (distancian1g1.getPrefWidth() < 11){
                    distancian1g1.setPrefWidth(distancian1g1.getPrefWidth() + 1);
                    panen1g1.setPrefWidth((panen1g1.getPrefWidth() + 209) + 60);
                    n1g1.setPrefWidth((n1g1.getPrefWidth() + 149.6) + 60);
                    juntarn1g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn1g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn1g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn1g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian1g1.getPrefWidth() == 2) {
                    panen1g2.setVisible(false);
                } else if (distancian1g1.getPrefWidth() == 3) {
                    panen1g3.setVisible(false);
                } else if (distancian1g1.getPrefWidth() == 4) {
                    panen1g4.setVisible(false);
                } else if (distancian1g1.getPrefWidth() == 5) {
                    panen1g5.setVisible(false);
                } else if (distancian1g1.getPrefWidth() == 6) {
                    panen1g6.setVisible(false);
                } else if (distancian1g1.getPrefWidth() == 7) {
                    panen1g7.setVisible(false);
                } else if (distancian1g1.getPrefWidth() == 8) {
                    panen1g8.setVisible(false);
                } else if (distancian1g1.getPrefWidth() == 9) {
                    panen1g9.setVisible(false);
                } else if (distancian1g1.getPrefWidth() == 10) {
                    panen1g10.setVisible(false);
                } else if (distancian1g1.getPrefWidth() == 11) {
                    panen1g11.setVisible(false);
                }
            }
        });

        separarn1g1.setOnAction(event -> {
            if (distancian1g1.getPrefWidth() > 1){
                distancian1g1.setPrefWidth(distancian1g1.getPrefWidth() - 1);
                panen1g1.setPrefWidth((panen1g1.getPrefWidth() - 209) - 60);
                n1g1.setPrefWidth((n1g1.getPrefWidth() - 149.6) - 60);
                juntarn1g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn1g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn1g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn1g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian1g1.getPrefWidth() == 1){
                panen1g2.setVisible(true);
            } else if (distancian1g1.getPrefWidth() == 2){
                panen1g3.setVisible(true);
            } else if (distancian1g1.getPrefWidth() == 3){
                panen1g4.setVisible(true);
            } else if (distancian1g1.getPrefWidth() == 4){
                panen1g5.setVisible(true);
            } else if (distancian1g1.getPrefWidth() == 5){
                panen1g6.setVisible(true);
            } else if (distancian1g1.getPrefWidth() == 6){
                panen1g7.setVisible(true);
            } else if (distancian1g1.getPrefWidth() == 7){
                panen1g8.setVisible(true);
            } else if (distancian1g1.getPrefWidth() == 8){
                panen1g9.setVisible(true);
            } else if (distancian1g1.getPrefWidth() == 9){
                panen1g10.setVisible(true);
            } else if (distancian1g1.getPrefWidth() == 10){
                panen1g11.setVisible(true);
                separarn1g1.setVisible(false);
            }
        });

        // Juntar y separar n1g2
        juntarn1g2.setOnAction(event -> {
            if (distancian1g2.getPrefWidth() == 1 && distancian1g3.getPrefWidth() == 1 || distancian1g2.getPrefWidth() == 2 && distancian1g4.getPrefWidth() == 1
                    || distancian1g2.getPrefWidth() == 3 && distancian1g5.getPrefWidth() == 1 || distancian1g2.getPrefWidth() == 4 && distancian1g6.getPrefWidth() == 1
                    || distancian1g2.getPrefWidth() == 5 && distancian1g7.getPrefWidth() == 1 || distancian1g2.getPrefWidth() == 6 && distancian1g8.getPrefWidth() == 1
                    || distancian1g2.getPrefWidth() == 7 && distancian1g9.getPrefWidth() == 1 || distancian1g2.getPrefWidth() == 8 && distancian1g10.getPrefWidth() == 1
                    || distancian1g2.getPrefWidth() == 9 && distancian1g11.getPrefWidth() == 1){
                if (distancian1g2.getPrefWidth() < 10) {
                    distancian1g2.setPrefWidth(distancian1g2.getPrefWidth() + 1);
                    panen1g2.setPrefWidth((panen1g2.getPrefWidth() + 209) + 60);
                    n1g2.setPrefWidth((n1g2.getPrefWidth() + 149.6) + 60);
                    juntarn1g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn1g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn1g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn1g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian1g2.getPrefWidth() == 2) {
                    panen1g3.setVisible(false);
                } else if (distancian1g2.getPrefWidth() == 3) {
                    panen1g4.setVisible(false);
                } else if (distancian1g2.getPrefWidth() == 4) {
                    panen1g5.setVisible(false);
                } else if (distancian1g2.getPrefWidth() == 5) {
                    panen1g6.setVisible(false);
                } else if (distancian1g2.getPrefWidth() == 6) {
                    panen1g7.setVisible(false);
                } else if (distancian1g2.getPrefWidth() == 7) {
                    panen1g8.setVisible(false);
                } else if (distancian1g2.getPrefWidth() == 8) {
                    panen1g9.setVisible(false);
                } else if (distancian1g2.getPrefWidth() == 9) {
                    panen1g10.setVisible(false);
                } else if (distancian1g2.getPrefWidth() == 10) {
                    panen1g11.setVisible(false);
                }
            }
        });

        separarn1g2.setOnAction(event -> {
            if (distancian1g2.getPrefWidth() > 1) {
                distancian1g2.setPrefWidth(distancian1g2.getPrefWidth() - 1);
                panen1g2.setPrefWidth((panen1g2.getPrefWidth() - 209) - 60);
                n1g2.setPrefWidth((n1g2.getPrefWidth() - 149.6) - 60);
                juntarn1g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn1g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn1g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn1g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian1g2.getPrefWidth() == 1) {
                panen1g3.setVisible(true);
            } else if (distancian1g2.getPrefWidth() == 2) {
                panen1g4.setVisible(true);
            } else if (distancian1g2.getPrefWidth() == 3) {
                panen1g5.setVisible(true);
            } else if (distancian1g2.getPrefWidth() == 4) {
                panen1g6.setVisible(true);
            } else if (distancian1g2.getPrefWidth() == 5) {
                panen1g7.setVisible(true);
            } else if (distancian1g2.getPrefWidth() == 6) {
                panen1g8.setVisible(true);
            } else if (distancian1g2.getPrefWidth() == 7) {
                panen1g9.setVisible(true);
            } else if (distancian1g2.getPrefWidth() == 8) {
                panen1g10.setVisible(true);
            } else if (distancian1g2.getPrefWidth() == 9) {
                panen1g11.setVisible(true);
            }
        });

        // Juntar y separar n1g3
        juntarn1g3.setOnAction(event -> {
            if (distancian1g3.getPrefWidth() == 1 && distancian1g4.getPrefWidth() == 1 || distancian1g3.getPrefWidth() == 2 && distancian1g5.getPrefWidth() == 1
                    || distancian1g3.getPrefWidth() == 3 && distancian1g6.getPrefWidth() == 1 || distancian1g3.getPrefWidth() == 4 && distancian1g7.getPrefWidth() == 1
                    || distancian1g3.getPrefWidth() == 5 && distancian1g8.getPrefWidth() == 1 || distancian1g3.getPrefWidth() == 6 && distancian1g9.getPrefWidth() == 1
                    || distancian1g3.getPrefWidth() == 7 && distancian1g10.getPrefWidth() == 1 || distancian1g3.getPrefWidth() == 8 && distancian1g11.getPrefWidth() == 1){
                if (distancian1g3.getPrefWidth() < 9) {
                    distancian1g3.setPrefWidth(distancian1g3.getPrefWidth() + 1);
                    panen1g3.setPrefWidth((panen1g3.getPrefWidth() + 209) + 60);
                    n1g3.setPrefWidth((n1g3.getPrefWidth() + 149.6) + 60);
                    juntarn1g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn1g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn1g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn1g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian1g3.getPrefWidth() == 2) {
                    panen1g4.setVisible(false);
                } else if (distancian1g3.getPrefWidth() == 3) {
                    panen1g5.setVisible(false);
                } else if (distancian1g3.getPrefWidth() == 4) {
                    panen1g6.setVisible(false);
                } else if (distancian1g3.getPrefWidth() == 5) {
                    panen1g7.setVisible(false);
                } else if (distancian1g3.getPrefWidth() == 6) {
                    panen1g8.setVisible(false);
                } else if (distancian1g3.getPrefWidth() == 7) {
                    panen1g9.setVisible(false);
                } else if (distancian1g3.getPrefWidth() == 8) {
                    panen1g10.setVisible(false);
                } else if (distancian1g3.getPrefWidth() == 9) {
                    panen1g11.setVisible(false);
                }
            }
        });

        separarn1g3.setOnAction(event -> {
            if (distancian1g3.getPrefWidth() > 1) {
                distancian1g3.setPrefWidth(distancian1g3.getPrefWidth() - 1);
                panen1g3.setPrefWidth((panen1g3.getPrefWidth() - 209) - 60);
                n1g3.setPrefWidth((n1g3.getPrefWidth() - 149.6) - 60);
                juntarn1g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn1g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn1g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn1g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian1g3.getPrefWidth() == 1) {
                panen1g4.setVisible(true);
            } else if (distancian1g3.getPrefWidth() == 2) {
                panen1g5.setVisible(true);
            } else if (distancian1g3.getPrefWidth() == 3) {
                panen1g6.setVisible(true);
            } else if (distancian1g3.getPrefWidth() == 4) {
                panen1g7.setVisible(true);
            } else if (distancian1g3.getPrefWidth() == 5) {
                panen1g8.setVisible(true);
            } else if (distancian1g3.getPrefWidth() == 6) {
                panen1g9.setVisible(true);
            } else if (distancian1g3.getPrefWidth() == 7) {
                panen1g10.setVisible(true);
            } else if (distancian1g3.getPrefWidth() == 8) {
                panen1g11.setVisible(true);
            }
        });

        // Juntar y separar n1g4
        juntarn1g4.setOnAction(event -> {
            if (distancian1g4.getPrefWidth() == 1 && distancian1g5.getPrefWidth() == 1 || distancian1g4.getPrefWidth() == 2 && distancian1g6.getPrefWidth() == 1
                    || distancian1g4.getPrefWidth() == 3 && distancian1g7.getPrefWidth() == 1 || distancian1g4.getPrefWidth() == 4 && distancian1g8.getPrefWidth() == 1
                    || distancian1g4.getPrefWidth() == 5 && distancian1g9.getPrefWidth() == 1 || distancian1g4.getPrefWidth() == 6 && distancian1g10.getPrefWidth() == 1
                    || distancian1g4.getPrefWidth() == 7 && distancian1g11.getPrefWidth() == 1){
                if (distancian1g4.getPrefWidth() < 8) {
                    distancian1g4.setPrefWidth(distancian1g4.getPrefWidth() + 1);
                    panen1g4.setPrefWidth((panen1g4.getPrefWidth() + 209) + 60);
                    n1g4.setPrefWidth((n1g4.getPrefWidth() + 149.6) + 60);
                    juntarn1g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn1g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn1g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn1g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian1g4.getPrefWidth() == 2) {
                    panen1g5.setVisible(false);
                } else if (distancian1g4.getPrefWidth() == 3) {
                    panen1g6.setVisible(false);
                } else if (distancian1g4.getPrefWidth() == 4) {
                    panen1g7.setVisible(false);
                } else if (distancian1g4.getPrefWidth() == 5) {
                    panen1g8.setVisible(false);
                } else if (distancian1g4.getPrefWidth() == 6) {
                    panen1g9.setVisible(false);
                } else if (distancian1g4.getPrefWidth() == 7) {
                    panen1g10.setVisible(false);
                } else if (distancian1g4.getPrefWidth() == 8) {
                    panen1g11.setVisible(false);
                }
            }
        });

        separarn1g4.setOnAction(event -> {
            if (distancian1g4.getPrefWidth() > 1) {
                distancian1g4.setPrefWidth(distancian1g4.getPrefWidth() - 1);
                panen1g4.setPrefWidth((panen1g4.getPrefWidth() - 209) - 60);
                n1g4.setPrefWidth((n1g4.getPrefWidth() - 149.6) - 60);
                juntarn1g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn1g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn1g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn1g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian1g4.getPrefWidth() == 1) {
                panen1g5.setVisible(true);
            } else if (distancian1g4.getPrefWidth() == 2) {
                panen1g6.setVisible(true);
            } else if (distancian1g4.getPrefWidth() == 3) {
                panen1g7.setVisible(true);
            } else if (distancian1g4.getPrefWidth() == 4) {
                panen1g8.setVisible(true);
            } else if (distancian1g4.getPrefWidth() == 5) {
                panen1g9.setVisible(true);
            } else if (distancian1g4.getPrefWidth() == 6) {
                panen1g10.setVisible(true);
            } else if (distancian1g4.getPrefWidth() == 7) {
                panen1g11.setVisible(true);
            }
        });

        // Juntar y separar n1g5
        juntarn1g5.setOnAction(event -> {
            if (distancian1g5.getPrefWidth() == 1 && distancian1g6.getPrefWidth() == 1 || distancian1g5.getPrefWidth() == 2 && distancian1g7.getPrefWidth() == 1
                    || distancian1g5.getPrefWidth() == 3 && distancian1g8.getPrefWidth() == 1 || distancian1g5.getPrefWidth() == 4 && distancian1g9.getPrefWidth() == 1
                    || distancian1g5.getPrefWidth() == 5 && distancian1g10.getPrefWidth() == 1 || distancian1g5.getPrefWidth() == 6 && distancian1g11.getPrefWidth() == 1){
                if (distancian1g5.getPrefWidth() < 7) {
                    distancian1g5.setPrefWidth(distancian1g5.getPrefWidth() + 1);
                    panen1g5.setPrefWidth((panen1g5.getPrefWidth() + 209) + 60);
                    n1g5.setPrefWidth((n1g5.getPrefWidth() + 149.6) + 60);
                    juntarn1g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn1g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn1g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn1g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian1g5.getPrefWidth() == 2) {
                    panen1g6.setVisible(false);
                } else if (distancian1g5.getPrefWidth() == 3) {
                    panen1g7.setVisible(false);
                } else if (distancian1g5.getPrefWidth() == 4) {
                    panen1g8.setVisible(false);
                } else if (distancian1g5.getPrefWidth() == 5) {
                    panen1g9.setVisible(false);
                } else if (distancian1g5.getPrefWidth() == 6) {
                    panen1g10.setVisible(false);
                } else if (distancian1g5.getPrefWidth() == 7) {
                    panen1g11.setVisible(false);
                }
            }
        });

        separarn1g5.setOnAction(event -> {
            if (distancian1g5.getPrefWidth() > 1) {
                distancian1g5.setPrefWidth(distancian1g5.getPrefWidth() - 1);
                panen1g5.setPrefWidth((panen1g5.getPrefWidth() - 209) - 60);
                n1g5.setPrefWidth((n1g5.getPrefWidth() - 149.6) - 60);
                juntarn1g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn1g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn1g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn1g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian1g5.getPrefWidth() == 1) {
                panen1g6.setVisible(true);
            } else if (distancian1g5.getPrefWidth() == 2) {
                panen1g7.setVisible(true);
            } else if (distancian1g5.getPrefWidth() == 3) {
                panen1g8.setVisible(true);
            } else if (distancian1g5.getPrefWidth() == 4) {
                panen1g9.setVisible(true);
            } else if (distancian1g5.getPrefWidth() == 5) {
                panen1g10.setVisible(true);
            } else if (distancian1g5.getPrefWidth() == 6) {
                panen1g11.setVisible(true);
            }
        });

        // Juntar y separar n1g6
        juntarn1g6.setOnAction(event -> {
            if (distancian1g6.getPrefWidth() == 1 && distancian1g7.getPrefWidth() == 1 || distancian1g6.getPrefWidth() == 2 && distancian1g8.getPrefWidth() == 1
                    || distancian1g6.getPrefWidth() == 3 && distancian1g9.getPrefWidth() == 1 || distancian1g6.getPrefWidth() == 4 && distancian1g10.getPrefWidth() == 1
                    || distancian1g6.getPrefWidth() == 5 && distancian1g11.getPrefWidth() == 1){
                if (distancian1g6.getPrefWidth() < 6) {
                    distancian1g6.setPrefWidth(distancian1g6.getPrefWidth() + 1);
                    panen1g6.setPrefWidth((panen1g6.getPrefWidth() + 209) + 60);
                    n1g6.setPrefWidth((n1g6.getPrefWidth() + 149.6) + 60);
                    juntarn1g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn1g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn1g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn1g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian1g6.getPrefWidth() == 2) {
                    panen1g7.setVisible(false);
                } else if (distancian1g6.getPrefWidth() == 3) {
                    panen1g8.setVisible(false);
                } else if (distancian1g6.getPrefWidth() == 4) {
                    panen1g9.setVisible(false);
                } else if (distancian1g6.getPrefWidth() == 5) {
                    panen1g10.setVisible(false);
                } else if (distancian1g6.getPrefWidth() == 6) {
                    panen1g11.setVisible(false);
                }
            }
        });

        separarn1g6.setOnAction(event -> {
            if (distancian1g6.getPrefWidth() > 1) {
                distancian1g6.setPrefWidth(distancian1g6.getPrefWidth() - 1);
                panen1g6.setPrefWidth((panen1g6.getPrefWidth() - 209) - 60);
                n1g6.setPrefWidth((n1g6.getPrefWidth() - 149.6) - 60);
                juntarn1g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn1g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn1g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn1g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian1g6.getPrefWidth() == 1) {
                panen1g7.setVisible(true);
            } else if (distancian1g6.getPrefWidth() == 2) {
                panen1g8.setVisible(true);
            } else if (distancian1g6.getPrefWidth() == 3) {
                panen1g9.setVisible(true);
            } else if (distancian1g6.getPrefWidth() == 4) {
                panen1g10.setVisible(true);
            } else if (distancian1g6.getPrefWidth() == 5) {
                panen1g11.setVisible(true);
            }
        });

        // Juntar y separar n1g7
        juntarn1g7.setOnAction(event -> {
            if (distancian1g7.getPrefWidth() == 1 && distancian1g8.getPrefWidth() == 1 || distancian1g7.getPrefWidth() == 2 && distancian1g9.getPrefWidth() == 1
                    || distancian1g7.getPrefWidth() == 3 && distancian1g10.getPrefWidth() == 1 || distancian1g7.getPrefWidth() == 4 && distancian1g11.getPrefWidth() == 1){
                if (distancian1g7.getPrefWidth() < 5) {
                    distancian1g7.setPrefWidth(distancian1g7.getPrefWidth() + 1);
                    panen1g7.setPrefWidth((panen1g7.getPrefWidth() + 209) + 60);
                    n1g7.setPrefWidth((n1g7.getPrefWidth() + 149.6) + 60);
                    juntarn1g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn1g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn1g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn1g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian1g7.getPrefWidth() == 2) {
                    panen1g8.setVisible(false);
                } else if (distancian1g7.getPrefWidth() == 3) {
                    panen1g9.setVisible(false);
                } else if (distancian1g7.getPrefWidth() == 4) {
                    panen1g10.setVisible(false);
                } else if (distancian1g7.getPrefWidth() == 5) {
                    panen1g11.setVisible(false);
                }
            }
        });

        separarn1g7.setOnAction(event -> {
            if (distancian1g7.getPrefWidth() > 1) {
                distancian1g7.setPrefWidth(distancian1g7.getPrefWidth() - 1);
                panen1g7.setPrefWidth((panen1g7.getPrefWidth() - 209) - 60);
                n1g7.setPrefWidth((n1g7.getPrefWidth() - 149.6) - 60);
                juntarn1g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn1g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn1g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn1g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian1g7.getPrefWidth() == 1) {
                panen1g8.setVisible(true);
            } else if (distancian1g7.getPrefWidth() == 2) {
                panen1g9.setVisible(true);
            } else if (distancian1g7.getPrefWidth() == 3) {
                panen1g10.setVisible(true);
            } else if (distancian1g7.getPrefWidth() == 4) {
                panen1g11.setVisible(true);
            }
        });

        //Juntar y separar n1g8
        juntarn1g8.setOnAction(event -> {
            if (distancian1g8.getPrefWidth() == 1 && distancian1g9.getPrefWidth() == 1 || distancian1g8.getPrefWidth() == 2 && distancian1g10.getPrefWidth() == 1
                    || distancian1g8.getPrefWidth() == 3 && distancian1g11.getPrefWidth() == 1){
                if (distancian1g8.getPrefWidth() < 4) {
                    distancian1g8.setPrefWidth(distancian1g8.getPrefWidth() + 1);
                    panen1g8.setPrefWidth((panen1g8.getPrefWidth() + 209) + 60);
                    n1g8.setPrefWidth((n1g8.getPrefWidth() + 149.6) + 60);
                    juntarn1g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn1g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn1g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn1g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian1g8.getPrefWidth() == 2) {
                    panen1g9.setVisible(false);
                } else if (distancian1g8.getPrefWidth() == 3) {
                    panen1g10.setVisible(false);
                } else if (distancian1g8.getPrefWidth() == 4) {
                    panen1g11.setVisible(false);
                }
            }
        });

        separarn1g8.setOnAction(event -> {
            if (distancian1g8.getPrefWidth() > 1) {
                distancian1g8.setPrefWidth(distancian1g8.getPrefWidth() - 1);
                panen1g8.setPrefWidth((panen1g8.getPrefWidth() - 209) - 60);
                n1g8.setPrefWidth((n1g8.getPrefWidth() - 149.6) - 60);
                juntarn1g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn1g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn1g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn1g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian1g8.getPrefWidth() == 1) {
                panen1g9.setVisible(true);
            } else if (distancian1g8.getPrefWidth() == 2) {
                panen1g10.setVisible(true);
            } else if (distancian1g8.getPrefWidth() == 3) {
                panen1g11.setVisible(true);
            }
        });

        //Juntar y separar n1g9
        juntarn1g9.setOnAction(event -> {
            if (distancian1g9.getPrefWidth() == 1 && distancian1g10.getPrefWidth() == 1 || distancian1g9.getPrefWidth() == 2 && distancian1g11.getPrefWidth() == 1){
                if (distancian1g9.getPrefWidth() < 3) {
                    distancian1g9.setPrefWidth(distancian1g9.getPrefWidth() + 1);
                    panen1g9.setPrefWidth((panen1g9.getPrefWidth() + 209) + 60);
                    n1g9.setPrefWidth((n1g9.getPrefWidth() + 149.6) + 60);
                    juntarn1g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn1g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn1g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn1g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian1g9.getPrefWidth() == 2) {
                    panen1g10.setVisible(false);
                } else if (distancian1g9.getPrefWidth() == 3) {
                    panen1g11.setVisible(false);
                }
            }
        });

        separarn1g9.setOnAction(event -> {
            if (distancian1g9.getPrefWidth() > 1) {
                distancian1g9.setPrefWidth(distancian1g9.getPrefWidth() - 1);
                panen1g9.setPrefWidth((panen1g9.getPrefWidth() - 209) - 60);
                n1g9.setPrefWidth((n1g9.getPrefWidth() - 149.6) - 60);
                juntarn1g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn1g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn1g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn1g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian1g9.getPrefWidth() == 1) {
                panen1g10.setVisible(true);
            } else if (distancian1g9.getPrefWidth() == 2) {
                panen1g11.setVisible(true);
            }
        });

        // Juntar y separar n1g10
        juntarn1g10.setOnAction(event -> {
            if (distancian1g10.getPrefWidth() == 1 && distancian1g11.getPrefWidth() == 1){
                if (distancian1g10.getPrefWidth() < 2) {
                    distancian1g10.setPrefWidth(distancian1g10.getPrefWidth() + 1);
                    panen1g10.setPrefWidth((panen1g10.getPrefWidth() + 209) + 60);
                    n1g10.setPrefWidth((n1g10.getPrefWidth() + 149.6) + 60);
                    juntarn1g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn1g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn1g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn1g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian1g10.getPrefWidth() == 2) {
                    panen1g11.setVisible(false);
                }
            }
        });

        separarn1g10.setOnAction(event -> {
            if (distancian1g10.getPrefWidth() > 1) {
                distancian1g10.setPrefWidth(distancian1g10.getPrefWidth() - 1);
                panen1g10.setPrefWidth((panen1g10.getPrefWidth() - 209) - 60);
                n1g10.setPrefWidth((n1g10.getPrefWidth() - 149.6) - 60);
                juntarn1g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn1g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn1g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn1g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian1g10.getPrefWidth() == 1) {
                panen1g11.setVisible(true);
            }
        });

        // Juntar y separar n2g1
        juntarn2g1.setOnAction(event -> {
            if (distancian2g1.getPrefWidth() == 1 && distancian2g2.getPrefWidth() == 1 || distancian2g1.getPrefWidth() == 2 && distancian2g3.getPrefWidth() == 1
                    || distancian2g1.getPrefWidth() == 3 && distancian2g4.getPrefWidth() == 1 || distancian2g1.getPrefWidth() == 4 && distancian2g5.getPrefWidth() == 1
                    || distancian2g1.getPrefWidth() == 5 && distancian2g6.getPrefWidth() == 1 || distancian2g1.getPrefWidth() == 6 && distancian2g7.getPrefWidth() == 1
                    || distancian2g1.getPrefWidth() == 7 && distancian2g8.getPrefWidth() == 1 || distancian2g1.getPrefWidth() == 8 && distancian2g9.getPrefWidth() == 1
                    || distancian2g1.getPrefWidth() == 9 && distancian2g10.getPrefWidth() == 1 || distancian2g1.getPrefWidth() == 10 && distancian2g11.getPrefWidth() == 1) {
                if (distancian2g1.getPrefWidth() < 11){
                    distancian2g1.setPrefWidth(distancian2g1.getPrefWidth() + 1);
                    panen2g1.setPrefWidth((panen2g1.getPrefWidth() + 209) + 60);
                    n2g1.setPrefWidth((n2g1.getPrefWidth() + 149.6) + 60);
                    juntarn2g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn2g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn2g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn2g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian2g1.getPrefWidth() == 2) {
                    panen2g2.setVisible(false);
                } else if (distancian2g1.getPrefWidth() == 3) {
                    panen2g3.setVisible(false);
                } else if (distancian2g1.getPrefWidth() == 4) {
                    panen2g4.setVisible(false);
                } else if (distancian2g1.getPrefWidth() == 5) {
                    panen2g5.setVisible(false);
                } else if (distancian2g1.getPrefWidth() == 6) {
                    panen2g6.setVisible(false);
                } else if (distancian2g1.getPrefWidth() == 7) {
                    panen2g7.setVisible(false);
                } else if (distancian2g1.getPrefWidth() == 8) {
                    panen2g8.setVisible(false);
                } else if (distancian2g1.getPrefWidth() == 9) {
                    panen2g9.setVisible(false);
                } else if (distancian2g1.getPrefWidth() == 10) {
                    panen2g10.setVisible(false);
                } else if (distancian2g1.getPrefWidth() == 11) {
                    panen2g11.setVisible(false);
                }
            }
        });

        separarn2g1.setOnAction(event -> {
            if (distancian2g1.getPrefWidth() > 1){
                distancian2g1.setPrefWidth(distancian2g1.getPrefWidth() - 1);
                panen2g1.setPrefWidth((panen2g1.getPrefWidth() - 209) - 60);
                n2g1.setPrefWidth((n2g1.getPrefWidth() - 149.6) - 60);
                juntarn2g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn2g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn2g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn2g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian2g1.getPrefWidth() == 1){
                panen2g2.setVisible(true);
            } else if (distancian2g1.getPrefWidth() == 2){
                panen2g3.setVisible(true);
            } else if (distancian2g1.getPrefWidth() == 3){
                panen2g4.setVisible(true);
            } else if (distancian2g1.getPrefWidth() == 4){
                panen2g5.setVisible(true);
            } else if (distancian2g1.getPrefWidth() == 5){
                panen2g6.setVisible(true);
            } else if (distancian2g1.getPrefWidth() == 6){
                panen2g7.setVisible(true);
            } else if (distancian2g1.getPrefWidth() == 7){
                panen2g8.setVisible(true);
            } else if (distancian2g1.getPrefWidth() == 8){
                panen2g9.setVisible(true);
            } else if (distancian2g1.getPrefWidth() == 9){
                panen2g10.setVisible(true);
            } else if (distancian2g1.getPrefWidth() == 10){
                panen2g11.setVisible(true);
                separarn2g1.setVisible(false);
            }
        });

        // Juntar y separar n2g2
        juntarn2g2.setOnAction(event -> {
            if (distancian2g2.getPrefWidth() == 1 && distancian2g3.getPrefWidth() == 1 || distancian2g2.getPrefWidth() == 2 && distancian2g4.getPrefWidth() == 1
                    || distancian2g2.getPrefWidth() == 3 && distancian2g5.getPrefWidth() == 1 || distancian2g2.getPrefWidth() == 4 && distancian2g6.getPrefWidth() == 1
                    || distancian2g2.getPrefWidth() == 5 && distancian2g7.getPrefWidth() == 1 || distancian2g2.getPrefWidth() == 6 && distancian2g8.getPrefWidth() == 1
                    || distancian2g2.getPrefWidth() == 7 && distancian2g9.getPrefWidth() == 1 || distancian2g2.getPrefWidth() == 8 && distancian2g10.getPrefWidth() == 1
                    || distancian2g2.getPrefWidth() == 9 && distancian2g11.getPrefWidth() == 1) {
                if (distancian2g2.getPrefWidth() < 9) {
                    distancian2g2.setPrefWidth(distancian2g2.getPrefWidth() + 1);
                    panen2g2.setPrefWidth((panen2g2.getPrefWidth() + 209) + 60);
                    n2g2.setPrefWidth((n2g2.getPrefWidth() + 149.6) + 60);
                    juntarn2g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn2g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn2g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn2g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian2g2.getPrefWidth() == 2) {
                    panen2g3.setVisible(false);
                } else if (distancian2g2.getPrefWidth() == 3) {
                    panen2g4.setVisible(false);
                } else if (distancian2g2.getPrefWidth() == 4) {
                    panen2g5.setVisible(false);
                } else if (distancian2g2.getPrefWidth() == 5) {
                    panen2g6.setVisible(false);
                } else if (distancian2g2.getPrefWidth() == 6) {
                    panen2g7.setVisible(false);
                } else if (distancian2g2.getPrefWidth() == 7) {
                    panen2g8.setVisible(false);
                } else if (distancian2g2.getPrefWidth() == 8) {
                    panen2g9.setVisible(false);
                } else if (distancian2g2.getPrefWidth() == 9) {
                    panen2g10.setVisible(false);
                } else if (distancian2g2.getPrefWidth() == 10) {
                    panen2g11.setVisible(false);
                }
            }
        });

        separarn2g2.setOnAction(event -> {
            if (distancian2g2.getPrefWidth() > 1) {
                distancian2g2.setPrefWidth(distancian2g2.getPrefWidth() - 1);
                panen2g2.setPrefWidth((panen2g2.getPrefWidth() - 209) - 60);
                n2g2.setPrefWidth((n2g2.getPrefWidth() - 149.6) - 60);
                juntarn2g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn2g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn2g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn2g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian2g2.getPrefWidth() == 1) {
                panen2g3.setVisible(true);
            } else if (distancian2g2.getPrefWidth() == 2) {
                panen2g4.setVisible(true);
            } else if (distancian2g2.getPrefWidth() == 3) {
                panen2g5.setVisible(true);
            } else if (distancian2g2.getPrefWidth() == 4) {
                panen2g6.setVisible(true);
            } else if (distancian2g2.getPrefWidth() == 5) {
                panen2g7.setVisible(true);
            } else if (distancian2g2.getPrefWidth() == 6) {
                panen2g8.setVisible(true);
            } else if (distancian2g2.getPrefWidth() == 7) {
                panen2g9.setVisible(true);
            } else if (distancian2g2.getPrefWidth() == 8) {
                panen2g10.setVisible(true);
            } else if (distancian2g2.getPrefWidth() == 9) {
                panen2g11.setVisible(true);
            }
        });

        // Juntar y separar n2g3
        juntarn2g3.setOnAction(event -> {
            if (distancian2g3.getPrefWidth() == 1 && distancian2g4.getPrefWidth() == 1 || distancian2g3.getPrefWidth() == 2 && distancian2g5.getPrefWidth() == 1
                    || distancian2g3.getPrefWidth() == 3 && distancian2g6.getPrefWidth() == 1 || distancian2g3.getPrefWidth() == 4 && distancian2g7.getPrefWidth() == 1
                    || distancian2g3.getPrefWidth() == 5 && distancian2g8.getPrefWidth() == 1 || distancian2g3.getPrefWidth() == 6 && distancian2g9.getPrefWidth() == 1
                    || distancian2g3.getPrefWidth() == 7 && distancian2g10.getPrefWidth() == 1 || distancian2g3.getPrefWidth() == 8 && distancian2g11.getPrefWidth() == 1) {
                if (distancian2g3.getPrefWidth() < 9) {
                    distancian2g3.setPrefWidth(distancian2g3.getPrefWidth() + 1);
                    panen2g3.setPrefWidth((panen2g3.getPrefWidth() + 209) + 60);
                    n2g3.setPrefWidth((n2g3.getPrefWidth() + 149.6) + 60);
                    juntarn2g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn2g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn2g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn2g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian2g3.getPrefWidth() == 2) {
                    panen2g4.setVisible(false);
                } else if (distancian2g3.getPrefWidth() == 3) {
                    panen2g5.setVisible(false);
                } else if (distancian2g3.getPrefWidth() == 4) {
                    panen2g6.setVisible(false);
                } else if (distancian2g3.getPrefWidth() == 5) {
                    panen2g7.setVisible(false);
                } else if (distancian2g3.getPrefWidth() == 6) {
                    panen2g8.setVisible(false);
                } else if (distancian2g3.getPrefWidth() == 7) {
                    panen2g9.setVisible(false);
                } else if (distancian2g3.getPrefWidth() == 8) {
                    panen2g10.setVisible(false);
                } else if (distancian2g3.getPrefWidth() == 9) {
                    panen2g11.setVisible(false);
                }
            }
        });

        separarn2g3.setOnAction(event -> {
            if (distancian2g3.getPrefWidth() > 1) {
                distancian2g3.setPrefWidth(distancian2g3.getPrefWidth() - 1);
                panen2g3.setPrefWidth((panen2g3.getPrefWidth() - 209) - 60);
                n2g3.setPrefWidth((n2g3.getPrefWidth() - 149.6) - 60);
                juntarn2g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn2g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn2g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn2g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian2g3.getPrefWidth() == 1) {
                panen2g4.setVisible(true);
            } else if (distancian2g3.getPrefWidth() == 2) {
                panen2g5.setVisible(true);
            } else if (distancian2g3.getPrefWidth() == 3) {
                panen2g6.setVisible(true);
            } else if (distancian2g3.getPrefWidth() == 4) {
                panen2g7.setVisible(true);
            } else if (distancian2g3.getPrefWidth() == 5) {
                panen2g8.setVisible(true);
            } else if (distancian2g3.getPrefWidth() == 6) {
                panen2g9.setVisible(true);
            } else if (distancian2g3.getPrefWidth() == 7) {
                panen2g10.setVisible(true);
            } else if (distancian2g3.getPrefWidth() == 8) {
                panen2g11.setVisible(true);
            }
        });

        juntarn2g4.setOnAction(event -> {
            if (distancian2g4.getPrefWidth() == 1 && distancian2g5.getPrefWidth() == 1 || distancian2g4.getPrefWidth() == 2 && distancian2g6.getPrefWidth() == 1
                    || distancian2g4.getPrefWidth() == 3 && distancian2g7.getPrefWidth() == 1 || distancian2g4.getPrefWidth() == 4 && distancian2g8.getPrefWidth() == 1
                    || distancian2g4.getPrefWidth() == 5 && distancian2g9.getPrefWidth() == 1 || distancian2g4.getPrefWidth() == 6 && distancian2g10.getPrefWidth() == 1
                    || distancian2g4.getPrefWidth() == 7 && distancian2g11.getPrefWidth() == 1) {
                if (distancian2g4.getPrefWidth() < 8) {
                    distancian2g4.setPrefWidth(distancian2g4.getPrefWidth() + 1);
                    panen2g4.setPrefWidth((panen2g4.getPrefWidth() + 209) + 60);
                    n2g4.setPrefWidth((n2g4.getPrefWidth() + 149.6) + 60);
                    juntarn2g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn2g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn2g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn2g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian2g4.getPrefWidth() == 2) {
                    panen2g5.setVisible(false);
                } else if (distancian2g4.getPrefWidth() == 3) {
                    panen2g6.setVisible(false);
                } else if (distancian2g4.getPrefWidth() == 4) {
                    panen2g7.setVisible(false);
                } else if (distancian2g4.getPrefWidth() == 5) {
                    panen2g8.setVisible(false);
                } else if (distancian2g4.getPrefWidth() == 6) {
                    panen2g9.setVisible(false);
                } else if (distancian2g4.getPrefWidth() == 7) {
                    panen2g10.setVisible(false);
                } else if (distancian2g4.getPrefWidth() == 8) {
                    panen2g11.setVisible(false);
                }
            }
        });

        separarn2g4.setOnAction(event -> {
            if (distancian2g4.getPrefWidth() > 1) {
                distancian2g4.setPrefWidth(distancian2g4.getPrefWidth() - 1);
                panen2g4.setPrefWidth((panen2g4.getPrefWidth() - 209) - 60);
                n2g4.setPrefWidth((n2g4.getPrefWidth() - 149.6) - 60);
                juntarn2g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn2g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn2g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn2g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian2g4.getPrefWidth() == 1) {
                panen2g5.setVisible(true);
            } else if (distancian2g4.getPrefWidth() == 2) {
                panen2g6.setVisible(true);
            } else if (distancian2g4.getPrefWidth() == 3) {
                panen2g7.setVisible(true);
            } else if (distancian2g4.getPrefWidth() == 4) {
                panen2g8.setVisible(true);
            } else if (distancian2g4.getPrefWidth() == 5) {
                panen2g9.setVisible(true);
            } else if (distancian2g4.getPrefWidth() == 6) {
                panen2g10.setVisible(true);
            } else if (distancian2g4.getPrefWidth() == 7) {
                panen2g11.setVisible(true);
            }
        });

        juntarn2g5.setOnAction(event -> {
            if (distancian2g5.getPrefWidth() == 1 && distancian2g6.getPrefWidth() == 1 || distancian2g5.getPrefWidth() == 2 && distancian2g7.getPrefWidth() == 1
                    || distancian2g5.getPrefWidth() == 3 && distancian2g8.getPrefWidth() == 1 || distancian2g5.getPrefWidth() == 4 && distancian2g9.getPrefWidth() == 1
                    || distancian2g5.getPrefWidth() == 5 && distancian2g10.getPrefWidth() == 1 || distancian2g5.getPrefWidth() == 6 && distancian2g11.getPrefWidth() == 1) {
                if (distancian2g5.getPrefWidth() < 7) {
                    distancian2g5.setPrefWidth(distancian2g5.getPrefWidth() + 1);
                    panen2g5.setPrefWidth((panen2g5.getPrefWidth() + 209) + 60);
                    n2g5.setPrefWidth((n2g5.getPrefWidth() + 149.6) + 60);
                    juntarn2g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn2g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn2g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn2g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian2g5.getPrefWidth() == 2) {
                    panen2g6.setVisible(false);
                } else if (distancian2g5.getPrefWidth() == 3) {
                    panen2g7.setVisible(false);
                } else if (distancian2g5.getPrefWidth() == 4) {
                    panen2g8.setVisible(false);
                } else if (distancian2g5.getPrefWidth() == 5) {
                    panen2g9.setVisible(false);
                } else if (distancian2g5.getPrefWidth() == 6) {
                    panen2g10.setVisible(false);
                } else if (distancian2g5.getPrefWidth() == 7) {
                    panen2g11.setVisible(false);
                }
            }
        });

        separarn2g5.setOnAction(event -> {
            if (distancian2g5.getPrefWidth() > 1) {
                distancian2g5.setPrefWidth(distancian2g5.getPrefWidth() - 1);
                panen2g5.setPrefWidth((panen2g5.getPrefWidth() - 209) - 60);
                n2g5.setPrefWidth((n2g5.getPrefWidth() - 149.6) - 60);
                juntarn2g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn2g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn2g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn2g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian2g5.getPrefWidth() == 1) {
                panen2g6.setVisible(true);
            } else if (distancian2g5.getPrefWidth() == 2) {
                panen2g7.setVisible(true);
            } else if (distancian2g5.getPrefWidth() == 3) {
                panen2g8.setVisible(true);
            } else if (distancian2g5.getPrefWidth() == 4) {
                panen2g9.setVisible(true);
            } else if (distancian2g5.getPrefWidth() == 5) {
                panen2g10.setVisible(true);
            } else if (distancian2g5.getPrefWidth() == 6) {
                panen2g11.setVisible(true);
            }
        });

        juntarn2g6.setOnAction(event -> {
            if (distancian2g6.getPrefWidth() == 1 && distancian2g7.getPrefWidth() == 1 || distancian2g6.getPrefWidth() == 2 && distancian2g8.getPrefWidth() == 1
                    || distancian2g6.getPrefWidth() == 3 && distancian2g9.getPrefWidth() == 1 || distancian2g6.getPrefWidth() == 4 && distancian2g10.getPrefWidth() == 1
                    || distancian2g6.getPrefWidth() == 5 && distancian2g11.getPrefWidth() == 1) {
                if (distancian2g6.getPrefWidth() < 6) {
                    distancian2g6.setPrefWidth(distancian2g6.getPrefWidth() + 1);
                    panen2g6.setPrefWidth((panen2g6.getPrefWidth() + 209) + 60);
                    n2g6.setPrefWidth((n2g6.getPrefWidth() + 149.6) + 60);
                    juntarn2g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn2g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn2g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn2g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian2g6.getPrefWidth() == 2) {
                    panen2g7.setVisible(false);
                } else if (distancian2g6.getPrefWidth() == 3) {
                    panen2g8.setVisible(false);
                } else if (distancian2g6.getPrefWidth() == 4) {
                    panen2g9.setVisible(false);
                } else if (distancian2g6.getPrefWidth() == 5) {
                    panen2g10.setVisible(false);
                } else if (distancian2g6.getPrefWidth() == 6) {
                    panen2g11.setVisible(false);
                }
            }
        });

        separarn2g6.setOnAction(event -> {
            if (distancian2g6.getPrefWidth() > 1) {
                distancian2g6.setPrefWidth(distancian2g6.getPrefWidth() - 1);
                panen2g6.setPrefWidth((panen2g6.getPrefWidth() - 209) - 60);
                n2g6.setPrefWidth((n2g6.getPrefWidth() - 149.6) - 60);
                juntarn2g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn2g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn2g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn2g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian2g6.getPrefWidth() == 1) {
                panen2g7.setVisible(true);
            } else if (distancian2g6.getPrefWidth() == 2) {
                panen2g8.setVisible(true);
            } else if (distancian2g6.getPrefWidth() == 3) {
                panen2g9.setVisible(true);
            } else if (distancian2g6.getPrefWidth() == 4) {
                panen2g10.setVisible(true);
            } else if (distancian2g6.getPrefWidth() == 5) {
                panen2g11.setVisible(true);
            }
        });

        juntarn2g7.setOnAction(event -> {
            if (distancian2g7.getPrefWidth() == 1 && distancian2g8.getPrefWidth() == 1 || distancian2g7.getPrefWidth() == 2 && distancian2g9.getPrefWidth() == 1
                    || distancian2g7.getPrefWidth() == 3 && distancian2g10.getPrefWidth() == 1 || distancian2g7.getPrefWidth() == 4 && distancian2g11.getPrefWidth() == 1) {
                if (distancian2g7.getPrefWidth() < 5) {
                    distancian2g7.setPrefWidth(distancian2g7.getPrefWidth() + 1);
                    panen2g7.setPrefWidth((panen2g7.getPrefWidth() + 209) + 60);
                    n2g7.setPrefWidth((n2g7.getPrefWidth() + 149.6) + 60);
                    juntarn2g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn2g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn2g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn2g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian2g7.getPrefWidth() == 2) {
                    panen2g8.setVisible(false);
                } else if (distancian2g7.getPrefWidth() == 3) {
                    panen2g9.setVisible(false);
                } else if (distancian2g7.getPrefWidth() == 4) {
                    panen2g10.setVisible(false);
                } else if (distancian2g7.getPrefWidth() == 5) {
                    panen2g11.setVisible(false);
                }
            }
        });

        separarn2g7.setOnAction(event -> {
            if (distancian2g7.getPrefWidth() > 1) {
                distancian2g7.setPrefWidth(distancian2g7.getPrefWidth() - 1);
                panen2g7.setPrefWidth((panen2g7.getPrefWidth() - 209) - 60);
                n2g7.setPrefWidth((n2g7.getPrefWidth() - 149.6) - 60);
                juntarn2g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn2g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn2g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn2g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian2g7.getPrefWidth() == 1) {
                panen2g8.setVisible(true);
            } else if (distancian2g7.getPrefWidth() == 2) {
                panen2g9.setVisible(true);
            } else if (distancian2g7.getPrefWidth() == 3) {
                panen2g10.setVisible(true);
            } else if (distancian2g7.getPrefWidth() == 4) {
                panen2g11.setVisible(true);
            }
        });

        juntarn2g8.setOnAction(event -> {
            if (distancian2g8.getPrefWidth() == 1 && distancian2g9.getPrefWidth() == 1 || distancian2g8.getPrefWidth() == 2 && distancian2g10.getPrefWidth() == 1
                    || distancian2g8.getPrefWidth() == 3 && distancian2g11.getPrefWidth() == 1) {
                if (distancian2g8.getPrefWidth() < 4) {
                    distancian2g8.setPrefWidth(distancian2g8.getPrefWidth() + 1);
                    panen2g8.setPrefWidth((panen2g8.getPrefWidth() + 209) + 60);
                    n2g8.setPrefWidth((n2g8.getPrefWidth() + 149.6) + 60);
                    juntarn2g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn2g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn2g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn2g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian2g8.getPrefWidth() == 2) {
                    panen2g9.setVisible(false);
                } else if (distancian2g8.getPrefWidth() == 3) {
                    panen2g10.setVisible(false);
                } else if (distancian2g8.getPrefWidth() == 4) {
                    panen2g11.setVisible(false);
                }
            }
        });

        separarn2g8.setOnAction(event -> {
            if (distancian2g8.getPrefWidth() > 1) {
                distancian2g8.setPrefWidth(distancian2g8.getPrefWidth() - 1);
                panen2g8.setPrefWidth((panen2g8.getPrefWidth() - 209) - 60);
                n2g8.setPrefWidth((n2g8.getPrefWidth() - 149.6) - 60);
                juntarn2g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn2g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn2g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn2g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian2g8.getPrefWidth() == 1) {
                panen2g9.setVisible(true);
            } else if (distancian2g8.getPrefWidth() == 2) {
                panen2g10.setVisible(true);
            } else if (distancian2g8.getPrefWidth() == 3) {
                panen2g11.setVisible(true);
            }
        });

        juntarn2g9.setOnAction(event -> {
            if (distancian2g9.getPrefWidth() == 1 && distancian2g10.getPrefWidth() == 1 || distancian2g9.getPrefWidth() == 2 && distancian2g11.getPrefWidth() == 1) {
                if (distancian2g9.getPrefWidth() < 3) {
                    distancian2g9.setPrefWidth(distancian2g9.getPrefWidth() + 1);
                    panen2g9.setPrefWidth((panen2g9.getPrefWidth() + 209) + 60);
                    n2g9.setPrefWidth((n2g9.getPrefWidth() + 149.6) + 60);
                    juntarn2g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn2g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn2g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn2g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian2g9.getPrefWidth() == 2) {
                    panen2g10.setVisible(false);
                } else if (distancian2g9.getPrefWidth() == 3) {
                    panen2g11.setVisible(false);
                }
            }
        });

        separarn2g9.setOnAction(event -> {
            if (distancian2g9.getPrefWidth() > 1) {
                distancian2g9.setPrefWidth(distancian2g9.getPrefWidth() - 1);
                panen2g9.setPrefWidth((panen2g9.getPrefWidth() - 209) - 60);
                n2g9.setPrefWidth((n2g9.getPrefWidth() - 149.6) - 60);
                juntarn2g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn2g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn2g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn2g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian2g9.getPrefWidth() == 1) {
                panen2g10.setVisible(true);
            } else if (distancian2g9.getPrefWidth() == 2) {
                panen2g11.setVisible(true);
            }
        });

        juntarn2g10.setOnAction(event -> {
            if (distancian2g10.getPrefWidth() == 1 && distancian2g11.getPrefWidth() == 1) {
                if (distancian2g10.getPrefWidth() < 2) {
                    distancian2g10.setPrefWidth(distancian2g10.getPrefWidth() + 1);
                    panen2g10.setPrefWidth((panen2g10.getPrefWidth() + 209) + 60);
                    n2g10.setPrefWidth((n2g10.getPrefWidth() + 149.6) + 60);
                    juntarn2g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn2g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn2g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn2g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian2g10.getPrefWidth() == 2) {
                    panen2g11.setVisible(false);
                }
            }
        });

        separarn2g10.setOnAction(event -> {
            if (distancian2g10.getPrefWidth() > 1) {
                distancian2g10.setPrefWidth(distancian2g10.getPrefWidth() - 1);
                panen2g10.setPrefWidth((panen2g10.getPrefWidth() - 209) - 60);
                n2g10.setPrefWidth((n2g10.getPrefWidth() - 149.6) - 60);
                juntarn2g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn2g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn2g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn2g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian2g10.getPrefWidth() == 1) {
                panen2g11.setVisible(true);
            }
        });

        juntarn3g1.setOnAction(event -> {
            if (distancian3g1.getPrefWidth() == 1 && distancian3g2.getPrefWidth() == 1 || distancian3g1.getPrefWidth() == 2 && distancian3g3.getPrefWidth() == 1
                    || distancian3g1.getPrefWidth() == 3 && distancian3g4.getPrefWidth() == 1 || distancian3g1.getPrefWidth() == 4 && distancian3g5.getPrefWidth() == 1
                    || distancian3g1.getPrefWidth() == 5 && distancian3g6.getPrefWidth() == 1 || distancian3g1.getPrefWidth() == 6 && distancian3g7.getPrefWidth() == 1
                    || distancian3g1.getPrefWidth() == 7 && distancian3g8.getPrefWidth() == 1 || distancian3g1.getPrefWidth() == 8 && distancian3g9.getPrefWidth() == 1
                    || distancian3g1.getPrefWidth() == 9 && distancian3g10.getPrefWidth() == 1 || distancian3g1.getPrefWidth() == 10 && distancian3g11.getPrefWidth() == 1) {
                if (distancian3g1.getPrefWidth() < 11) {
                    distancian3g1.setPrefWidth(distancian3g1.getPrefWidth() + 1);
                    panen3g1.setPrefWidth((panen3g1.getPrefWidth() + 209) + 60);
                    n3g1.setPrefWidth((n3g1.getPrefWidth() + 149.6) + 60);
                    juntarn3g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn3g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn3g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn3g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian3g1.getPrefWidth() == 2) {
                    panen3g2.setVisible(false);
                } else if (distancian3g1.getPrefWidth() == 3) {
                    panen3g3.setVisible(false);
                } else if (distancian3g1.getPrefWidth() == 4) {
                    panen3g4.setVisible(false);
                } else if (distancian3g1.getPrefWidth() == 5) {
                    panen3g5.setVisible(false);
                } else if (distancian3g1.getPrefWidth() == 6) {
                    panen3g6.setVisible(false);
                } else if (distancian3g1.getPrefWidth() == 7) {
                    panen3g7.setVisible(false);
                } else if (distancian3g1.getPrefWidth() == 8) {
                    panen3g8.setVisible(false);
                } else if (distancian3g1.getPrefWidth() == 9) {
                    panen3g9.setVisible(false);
                } else if (distancian3g1.getPrefWidth() == 10) {
                    panen3g10.setVisible(false);
                } else if (distancian3g1.getPrefWidth() == 11) {
                    panen3g11.setVisible(false);
                }
            }
        });

        separarn3g1.setOnAction(event -> {
            if (distancian3g1.getPrefWidth() > 1) {
                distancian3g1.setPrefWidth(distancian3g1.getPrefWidth() - 1);
                panen3g1.setPrefWidth((panen3g1.getPrefWidth() - 209) - 60);
                n3g1.setPrefWidth((n3g1.getPrefWidth() - 149.6) - 60);
                juntarn3g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn3g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn3g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn3g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian3g1.getPrefWidth() == 1) {
                panen3g2.setVisible(true);
            } else if (distancian3g1.getPrefWidth() == 2) {
                panen3g3.setVisible(true);
            } else if (distancian3g1.getPrefWidth() == 3) {
                panen3g4.setVisible(true);
            } else if (distancian3g1.getPrefWidth() == 4) {
                panen3g5.setVisible(true);
            } else if (distancian3g1.getPrefWidth() == 5) {
                panen3g6.setVisible(true);
            } else if (distancian3g1.getPrefWidth() == 6) {
                panen3g7.setVisible(true);
            } else if (distancian3g1.getPrefWidth() == 7) {
                panen3g8.setVisible(true);
            } else if (distancian3g1.getPrefWidth() == 8) {
                panen3g9.setVisible(true);
            } else if (distancian3g1.getPrefWidth() == 9) {
                panen3g10.setVisible(true);
            } else if (distancian3g1.getPrefWidth() == 10) {
                panen3g11.setVisible(true);
            }
        });

        juntarn3g2.setOnAction(event -> {
            if (distancian3g2.getPrefWidth() == 1 && distancian3g3.getPrefWidth() == 1 || distancian3g2.getPrefWidth() == 2 && distancian3g4.getPrefWidth() == 1
                    || distancian3g2.getPrefWidth() == 3 && distancian3g5.getPrefWidth() == 1 || distancian3g2.getPrefWidth() == 4 && distancian3g6.getPrefWidth() == 1
                    || distancian3g2.getPrefWidth() == 5 && distancian3g7.getPrefWidth() == 1 || distancian3g2.getPrefWidth() == 6 && distancian3g8.getPrefWidth() == 1
                    || distancian3g2.getPrefWidth() == 7 && distancian3g9.getPrefWidth() == 1 || distancian3g2.getPrefWidth() == 8 && distancian3g10.getPrefWidth() == 1
                    || distancian3g2.getPrefWidth() == 9 && distancian3g11.getPrefWidth() == 1) {
                if (distancian3g2.getPrefWidth() < 11) {
                    distancian3g2.setPrefWidth(distancian3g2.getPrefWidth() + 1);
                    panen3g2.setPrefWidth((panen3g2.getPrefWidth() + 209) + 60);
                    n3g2.setPrefWidth((n3g2.getPrefWidth() + 149.6) + 60);
                    juntarn3g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn3g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn3g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn3g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian3g2.getPrefWidth() == 2) {
                    panen3g3.setVisible(false);
                } else if (distancian3g2.getPrefWidth() == 3) {
                    panen3g4.setVisible(false);
                } else if (distancian3g2.getPrefWidth() == 4) {
                    panen3g5.setVisible(false);
                } else if (distancian3g2.getPrefWidth() == 5) {
                    panen3g6.setVisible(false);
                } else if (distancian3g2.getPrefWidth() == 6) {
                    panen3g7.setVisible(false);
                } else if (distancian3g2.getPrefWidth() == 7) {
                    panen3g8.setVisible(false);
                } else if (distancian3g2.getPrefWidth() == 8) {
                    panen3g9.setVisible(false);
                } else if (distancian3g2.getPrefWidth() == 9) {
                    panen3g10.setVisible(false);
                } else if (distancian3g2.getPrefWidth() == 10) {
                    panen3g11.setVisible(false);
                }
            }
        });

        separarn3g2.setOnAction(event -> {
            if (distancian3g2.getPrefWidth() > 1) {
                distancian3g2.setPrefWidth(distancian3g2.getPrefWidth() - 1);
                panen3g2.setPrefWidth((panen3g2.getPrefWidth() - 209) - 60);
                n3g2.setPrefWidth((n3g2.getPrefWidth() - 149.6) - 60);
                juntarn3g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn3g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn3g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn3g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian3g2.getPrefWidth() == 1) {
                panen3g3.setVisible(true);
            } else if (distancian3g2.getPrefWidth() == 2) {
                panen3g4.setVisible(true);
            } else if (distancian3g2.getPrefWidth() == 3) {
                panen3g5.setVisible(true);
            } else if (distancian3g2.getPrefWidth() == 4) {
                panen3g6.setVisible(true);
            } else if (distancian3g2.getPrefWidth() == 5) {
                panen3g7.setVisible(true);
            } else if (distancian3g2.getPrefWidth() == 6) {
                panen3g8.setVisible(true);
            } else if (distancian3g2.getPrefWidth() == 7) {
                panen3g9.setVisible(true);
            } else if (distancian3g2.getPrefWidth() == 8) {
                panen3g10.setVisible(true);
            } else if (distancian3g2.getPrefWidth() == 9) {
                panen3g11.setVisible(true);
            }
        });

        // Juntar y separar n3g3
        juntarn3g3.setOnAction(event -> {
            if (distancian3g3.getPrefWidth() == 1 && distancian3g4.getPrefWidth() == 1 || distancian3g3.getPrefWidth() == 2 && distancian3g5.getPrefWidth() == 1
                    || distancian3g3.getPrefWidth() == 3 && distancian3g6.getPrefWidth() == 1 || distancian3g3.getPrefWidth() == 4 && distancian3g7.getPrefWidth() == 1
                    || distancian3g3.getPrefWidth() == 5 && distancian3g8.getPrefWidth() == 1 || distancian3g3.getPrefWidth() == 6 && distancian3g9.getPrefWidth() == 1
                    || distancian3g3.getPrefWidth() == 7 && distancian3g10.getPrefWidth() == 1 || distancian3g3.getPrefWidth() == 8 && distancian3g11.getPrefWidth() == 1) {
                if (distancian3g3.getPrefWidth() < 9) {
                    distancian3g3.setPrefWidth(distancian3g3.getPrefWidth() + 1);
                    panen3g3.setPrefWidth((panen3g3.getPrefWidth() + 209) + 60);
                    n3g3.setPrefWidth((n3g3.getPrefWidth() + 149.6) + 60);
                    juntarn3g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn3g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn3g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn3g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian3g3.getPrefWidth() == 2) {
                    panen3g4.setVisible(false);
                } else if (distancian3g3.getPrefWidth() == 3) {
                    panen3g5.setVisible(false);
                } else if (distancian3g3.getPrefWidth() == 4) {
                    panen3g6.setVisible(false);
                } else if (distancian3g3.getPrefWidth() == 5) {
                    panen3g7.setVisible(false);
                } else if (distancian3g3.getPrefWidth() == 6) {
                    panen3g8.setVisible(false);
                } else if (distancian3g3.getPrefWidth() == 7) {
                    panen3g9.setVisible(false);
                } else if (distancian3g3.getPrefWidth() == 8) {
                    panen3g10.setVisible(false);
                } else if (distancian3g3.getPrefWidth() == 9) {
                    panen3g11.setVisible(false);
                }
            }
        });

        separarn3g3.setOnAction(event -> {
            if (distancian3g3.getPrefWidth() > 1) {
                distancian3g3.setPrefWidth(distancian3g3.getPrefWidth() - 1);
                panen3g3.setPrefWidth((panen3g3.getPrefWidth() - 209) - 60);
                n3g3.setPrefWidth((n3g3.getPrefWidth() - 149.6) - 60);
                juntarn3g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn3g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn3g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn3g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian3g3.getPrefWidth() == 1) {
                panen3g4.setVisible(true);
            } else if (distancian3g3.getPrefWidth() == 2) {
                panen3g5.setVisible(true);
            } else if (distancian3g3.getPrefWidth() == 3) {
                panen3g6.setVisible(true);
            } else if (distancian3g3.getPrefWidth() == 4) {
                panen3g7.setVisible(true);
            } else if (distancian3g3.getPrefWidth() == 5) {
                panen3g8.setVisible(true);
            } else if (distancian3g3.getPrefWidth() == 6) {
                panen3g9.setVisible(true);
            } else if (distancian3g3.getPrefWidth() == 7) {
                panen3g10.setVisible(true);
            } else if (distancian3g3.getPrefWidth() == 8) {
                panen3g11.setVisible(true);
            }
        });

        // Juntar y separar n3g4
        juntarn3g4.setOnAction(event -> {
            if (distancian3g4.getPrefWidth() == 1 && distancian3g5.getPrefWidth() == 1 || distancian3g4.getPrefWidth() == 2 && distancian3g6.getPrefWidth() == 1
                    || distancian3g4.getPrefWidth() == 3 && distancian3g7.getPrefWidth() == 1 || distancian3g4.getPrefWidth() == 4 && distancian3g8.getPrefWidth() == 1
                    || distancian3g4.getPrefWidth() == 5 && distancian3g9.getPrefWidth() == 1 || distancian3g4.getPrefWidth() == 6 && distancian3g10.getPrefWidth() == 1
                    || distancian3g4.getPrefWidth() == 7 && distancian3g11.getPrefWidth() == 1) {
                if (distancian3g4.getPrefWidth() < 9) {
                    distancian3g4.setPrefWidth(distancian3g4.getPrefWidth() + 1);
                    panen3g4.setPrefWidth((panen3g4.getPrefWidth() + 209) + 60);
                    n3g4.setPrefWidth((n3g4.getPrefWidth() + 149.6) + 60);
                    juntarn3g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn3g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn3g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn3g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian3g4.getPrefWidth() == 2) {
                    panen3g5.setVisible(false);
                } else if (distancian3g4.getPrefWidth() == 3) {
                    panen3g6.setVisible(false);
                } else if (distancian3g4.getPrefWidth() == 4) {
                    panen3g7.setVisible(false);
                } else if (distancian3g4.getPrefWidth() == 5) {
                    panen3g8.setVisible(false);
                } else if (distancian3g4.getPrefWidth() == 6) {
                    panen3g9.setVisible(false);
                } else if (distancian3g4.getPrefWidth() == 7) {
                    panen3g10.setVisible(false);
                } else if (distancian3g4.getPrefWidth() == 8) {
                    panen3g11.setVisible(false);
                }
            }
        });

        separarn3g4.setOnAction(event -> {
            if (distancian3g4.getPrefWidth() > 1) {
                distancian3g4.setPrefWidth(distancian3g4.getPrefWidth() - 1);
                panen3g4.setPrefWidth((panen3g4.getPrefWidth() - 209) - 60);
                n3g4.setPrefWidth((n3g4.getPrefWidth() - 149.6) - 60);
                juntarn3g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn3g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn3g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn3g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian3g4.getPrefWidth() == 1) {
                panen3g5.setVisible(true);
            } else if (distancian3g4.getPrefWidth() == 2) {
                panen3g6.setVisible(true);
            } else if (distancian3g4.getPrefWidth() == 3) {
                panen3g7.setVisible(true);
            } else if (distancian3g4.getPrefWidth() == 4) {
                panen3g8.setVisible(true);
            } else if (distancian3g4.getPrefWidth() == 5) {
                panen3g9.setVisible(true);
            } else if (distancian3g4.getPrefWidth() == 6) {
                panen3g10.setVisible(true);
            } else if (distancian3g4.getPrefWidth() == 7) {
                panen3g11.setVisible(true);
            }
        });

        // Juntar y separar n3g5
        juntarn3g5.setOnAction(event -> {
            if (distancian3g5.getPrefWidth() == 1 && distancian3g6.getPrefWidth() == 1 || distancian3g5.getPrefWidth() == 2 && distancian3g7.getPrefWidth() == 1
                    || distancian3g5.getPrefWidth() == 3 && distancian3g8.getPrefWidth() == 1 || distancian3g5.getPrefWidth() == 4 && distancian3g9.getPrefWidth() == 1
                    || distancian3g5.getPrefWidth() == 5 && distancian3g10.getPrefWidth() == 1 || distancian3g5.getPrefWidth() == 6 && distancian3g11.getPrefWidth() == 1) {
                if (distancian3g5.getPrefWidth() < 9) {
                    distancian3g5.setPrefWidth(distancian3g5.getPrefWidth() + 1);
                    panen3g5.setPrefWidth((panen3g5.getPrefWidth() + 209) + 60);
                    n3g5.setPrefWidth((n3g5.getPrefWidth() + 149.6) + 60);
                    juntarn3g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn3g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn3g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn3g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian3g5.getPrefWidth() == 2) {
                    panen3g6.setVisible(false);
                } else if (distancian3g5.getPrefWidth() == 3) {
                    panen3g7.setVisible(false);
                } else if (distancian3g5.getPrefWidth() == 4) {
                    panen3g8.setVisible(false);
                } else if (distancian3g5.getPrefWidth() == 5) {
                    panen3g9.setVisible(false);
                } else if (distancian3g5.getPrefWidth() == 6) {
                    panen3g10.setVisible(false);
                } else if (distancian3g5.getPrefWidth() == 7) {
                    panen3g11.setVisible(false);
                }
            }
        });

        separarn3g5.setOnAction(event -> {
            if (distancian3g5.getPrefWidth() > 1) {
                distancian3g5.setPrefWidth(distancian3g5.getPrefWidth() - 1);
                panen3g5.setPrefWidth((panen3g5.getPrefWidth() - 209) - 60);
                n3g5.setPrefWidth((n3g5.getPrefWidth() - 149.6) - 60);
                juntarn3g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn3g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn3g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn3g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian3g5.getPrefWidth() == 1) {
                panen3g6.setVisible(true);
            } else if (distancian3g5.getPrefWidth() == 2) {
                panen3g7.setVisible(true);
            } else if (distancian3g5.getPrefWidth() == 3) {
                panen3g8.setVisible(true);
            } else if (distancian3g5.getPrefWidth() == 4) {
                panen3g9.setVisible(true);
            } else if (distancian3g5.getPrefWidth() == 5) {
                panen3g10.setVisible(true);
            } else if (distancian3g5.getPrefWidth() == 6) {
                panen3g11.setVisible(true);
            }
        });

        // Juntar y separar n3g6
        juntarn3g6.setOnAction(event -> {
            if (distancian3g6.getPrefWidth() == 1 && distancian3g7.getPrefWidth() == 1 || distancian3g6.getPrefWidth() == 2 && distancian3g8.getPrefWidth() == 1
                    || distancian3g6.getPrefWidth() == 3 && distancian3g9.getPrefWidth() == 1 || distancian3g6.getPrefWidth() == 4 && distancian3g10.getPrefWidth() == 1
                    || distancian3g6.getPrefWidth() == 5 && distancian3g11.getPrefWidth() == 1) {
                if (distancian3g6.getPrefWidth() < 9) {
                    distancian3g6.setPrefWidth(distancian3g6.getPrefWidth() + 1);
                    panen3g6.setPrefWidth((panen3g6.getPrefWidth() + 209) + 60);
                    n3g6.setPrefWidth((n3g6.getPrefWidth() + 149.6) + 60);
                    juntarn3g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn3g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn3g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn3g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian3g6.getPrefWidth() == 2) {
                    panen3g7.setVisible(false);
                } else if (distancian3g6.getPrefWidth() == 3) {
                    panen3g8.setVisible(false);
                } else if (distancian3g6.getPrefWidth() == 4) {
                    panen3g9.setVisible(false);
                } else if (distancian3g6.getPrefWidth() == 5) {
                    panen3g10.setVisible(false);
                } else if (distancian3g6.getPrefWidth() == 6) {
                    panen3g11.setVisible(false);
                }
            }
        });

        separarn3g6.setOnAction(event -> {
            if (distancian3g6.getPrefWidth() > 1) {
                distancian3g6.setPrefWidth(distancian3g6.getPrefWidth() - 1);
                panen3g6.setPrefWidth((panen3g6.getPrefWidth() - 209) - 60);
                n3g6.setPrefWidth((n3g6.getPrefWidth() - 149.6) - 60);
                juntarn3g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn3g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn3g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn3g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian3g6.getPrefWidth() == 1) {
                panen3g7.setVisible(true);
            } else if (distancian3g6.getPrefWidth() == 2) {
                panen3g8.setVisible(true);
            } else if (distancian3g6.getPrefWidth() == 3) {
                panen3g9.setVisible(true);
            } else if (distancian3g6.getPrefWidth() == 4) {
                panen3g10.setVisible(true);
            } else if (distancian3g6.getPrefWidth() == 5) {
                panen3g11.setVisible(true);
            }
        });

        // Juntar y separar n3g7
        juntarn3g7.setOnAction(event -> {
            if (distancian3g7.getPrefWidth() == 1 && distancian3g8.getPrefWidth() == 1 || distancian3g7.getPrefWidth() == 2 && distancian3g9.getPrefWidth() == 1
                    || distancian3g7.getPrefWidth() == 3 && distancian3g10.getPrefWidth() == 1 || distancian3g7.getPrefWidth() == 4 && distancian3g11.getPrefWidth() == 1) {
                if (distancian3g7.getPrefWidth() < 9) {
                    distancian3g7.setPrefWidth(distancian3g7.getPrefWidth() + 1);
                    panen3g7.setPrefWidth((panen3g7.getPrefWidth() + 209) + 60);
                    n3g7.setPrefWidth((n3g7.getPrefWidth() + 149.6) + 60);
                    juntarn3g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn3g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn3g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn3g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian3g7.getPrefWidth() == 2) {
                    panen3g8.setVisible(false);
                } else if (distancian3g7.getPrefWidth() == 3) {
                    panen3g9.setVisible(false);
                } else if (distancian3g7.getPrefWidth() == 4) {
                    panen3g10.setVisible(false);
                } else if (distancian3g7.getPrefWidth() == 5) {
                    panen3g11.setVisible(false);
                }
            }
        });

        separarn3g7.setOnAction(event -> {
            if (distancian3g7.getPrefWidth() > 1) {
                distancian3g7.setPrefWidth(distancian3g7.getPrefWidth() - 1);
                panen3g7.setPrefWidth((panen3g7.getPrefWidth() - 209) - 60);
                n3g7.setPrefWidth((n3g7.getPrefWidth() - 149.6) - 60);
                juntarn3g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn3g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn3g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn3g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian3g7.getPrefWidth() == 1) {
                panen3g8.setVisible(true);
            } else if (distancian3g7.getPrefWidth() == 2) {
                panen3g9.setVisible(true);
            } else if (distancian3g7.getPrefWidth() == 3) {
                panen3g10.setVisible(true);
            } else if (distancian3g7.getPrefWidth() == 4) {
                panen3g11.setVisible(true);
            }
        });

        // Juntar y separar n3g8
        juntarn3g8.setOnAction(event -> {
            if (distancian3g8.getPrefWidth() == 1 && distancian3g9.getPrefWidth() == 1 || distancian3g8.getPrefWidth() == 2 && distancian3g10.getPrefWidth() == 1
                    || distancian3g8.getPrefWidth() == 3 && distancian3g11.getPrefWidth() == 1) {
                if (distancian3g8.getPrefWidth() < 9) {
                    distancian3g8.setPrefWidth(distancian3g8.getPrefWidth() + 1);
                    panen3g8.setPrefWidth((panen3g8.getPrefWidth() + 209) + 60);
                    n3g8.setPrefWidth((n3g8.getPrefWidth() + 149.6) + 60);
                    juntarn3g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn3g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn3g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn3g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian3g8.getPrefWidth() == 2) {
                    panen3g9.setVisible(false);
                } else if (distancian3g8.getPrefWidth() == 3) {
                    panen3g10.setVisible(false);
                } else if (distancian3g8.getPrefWidth() == 4) {
                    panen3g11.setVisible(false);
                }
            }
        });

        separarn3g8.setOnAction(event -> {
            if (distancian3g8.getPrefWidth() > 1) {
                distancian3g8.setPrefWidth(distancian3g8.getPrefWidth() - 1);
                panen3g8.setPrefWidth((panen3g8.getPrefWidth() - 209) - 60);
                n3g8.setPrefWidth((n3g8.getPrefWidth() - 149.6) - 60);
                juntarn3g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn3g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn3g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn3g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian3g8.getPrefWidth() == 1) {
                panen3g9.setVisible(true);
            } else if (distancian3g8.getPrefWidth() == 2) {
                panen3g10.setVisible(true);
            } else if (distancian3g8.getPrefWidth() == 3) {
                panen3g11.setVisible(true);
            }
        });

        // Juntar y separar n3g9
        juntarn3g9.setOnAction(event -> {
            if (distancian3g9.getPrefWidth() == 1 && distancian3g10.getPrefWidth() == 1 || distancian3g9.getPrefWidth() == 2 && distancian3g11.getPrefWidth() == 1) {
                if (distancian3g9.getPrefWidth() < 9) {
                    distancian3g9.setPrefWidth(distancian3g9.getPrefWidth() + 1);
                    panen3g9.setPrefWidth((panen3g9.getPrefWidth() + 209) + 60);
                    n3g9.setPrefWidth((n3g9.getPrefWidth() + 149.6) + 60);
                    juntarn3g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn3g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn3g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn3g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian3g9.getPrefWidth() == 2) {
                    panen3g10.setVisible(false);
                } else if (distancian3g9.getPrefWidth() == 3) {
                    panen3g11.setVisible(false);
                }
            }
        });

        separarn3g9.setOnAction(event -> {
            if (distancian3g9.getPrefWidth() > 1) {
                distancian3g9.setPrefWidth(distancian3g9.getPrefWidth() - 1);
                panen3g9.setPrefWidth((panen3g9.getPrefWidth() - 209) - 60);
                n3g9.setPrefWidth((n3g9.getPrefWidth() - 149.6) - 60);
                juntarn3g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn3g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn3g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn3g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian3g9.getPrefWidth() == 1) {
                panen3g10.setVisible(true);
            } else if (distancian3g9.getPrefWidth() == 2) {
                panen3g11.setVisible(true);
            }
        });

        // Juntar y separar n3g10
        juntarn3g10.setOnAction(event -> {
            if (distancian3g10.getPrefWidth() == 1 && distancian3g11.getPrefWidth() == 1) {
                if (distancian3g10.getPrefWidth() < 9) {
                    distancian3g10.setPrefWidth(distancian3g10.getPrefWidth() + 1);
                    panen3g10.setPrefWidth((panen3g10.getPrefWidth() + 209) + 60);
                    n3g10.setPrefWidth((n3g10.getPrefWidth() + 149.6) + 60);
                    juntarn3g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn3g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn3g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn3g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian3g10.getPrefWidth() == 2) {
                    panen3g11.setVisible(false);
                }
            }
        });

        separarn3g10.setOnAction(event -> {
            if (distancian3g10.getPrefWidth() > 1) {
                distancian3g10.setPrefWidth(distancian3g10.getPrefWidth() - 1);
                panen3g10.setPrefWidth((panen3g10.getPrefWidth() - 209) - 60);
                n3g10.setPrefWidth((n3g10.getPrefWidth() - 149.6) - 60);
                juntarn3g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn3g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn3g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn3g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian3g10.getPrefWidth() == 1) {
                panen3g11.setVisible(true);
            }
        });

        juntarn4g1.setOnAction(event -> {
            if (distancian4g1.getPrefWidth() == 1 && distancian4g2.getPrefWidth() == 1 || distancian4g1.getPrefWidth() == 2 && distancian4g3.getPrefWidth() == 1
                    || distancian4g1.getPrefWidth() == 3 && distancian4g4.getPrefWidth() == 1 || distancian4g1.getPrefWidth() == 4 && distancian4g5.getPrefWidth() == 1
                    || distancian4g1.getPrefWidth() == 5 && distancian4g6.getPrefWidth() == 1 || distancian4g1.getPrefWidth() == 6 && distancian4g7.getPrefWidth() == 1
                    || distancian4g1.getPrefWidth() == 7 && distancian4g8.getPrefWidth() == 1 || distancian4g1.getPrefWidth() == 8 && distancian4g9.getPrefWidth() == 1
                    || distancian4g1.getPrefWidth() == 9 && distancian4g10.getPrefWidth() == 1 || distancian4g1.getPrefWidth() == 10 && distancian4g11.getPrefWidth() == 1) {
                if (distancian4g1.getPrefWidth() < 11) {
                    distancian4g1.setPrefWidth(distancian4g1.getPrefWidth() + 1);
                    panen4g1.setPrefWidth((panen4g1.getPrefWidth() + 209) + 60);
                    n4g1.setPrefWidth((n4g1.getPrefWidth() + 149.6) + 60);
                    juntarn4g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn4g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn4g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn4g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian4g1.getPrefWidth() == 2) {
                    panen4g2.setVisible(false);
                } else if (distancian4g1.getPrefWidth() == 3) {
                    panen4g3.setVisible(false);
                } else if (distancian4g1.getPrefWidth() == 4) {
                    panen4g4.setVisible(false);
                } else if (distancian4g1.getPrefWidth() == 5) {
                    panen4g5.setVisible(false);
                } else if (distancian4g1.getPrefWidth() == 6) {
                    panen4g6.setVisible(false);
                } else if (distancian4g1.getPrefWidth() == 7) {
                    panen4g7.setVisible(false);
                } else if (distancian4g1.getPrefWidth() == 8) {
                    panen4g8.setVisible(false);
                } else if (distancian4g1.getPrefWidth() == 9) {
                    panen4g9.setVisible(false);
                } else if (distancian4g1.getPrefWidth() == 10) {
                    panen4g10.setVisible(false);
                } else if (distancian4g1.getPrefWidth() == 11) {
                    panen4g11.setVisible(false);
                }
            }
        });

        separarn4g1.setOnAction(event -> {
            if (distancian4g1.getPrefWidth() > 1) {
                distancian4g1.setPrefWidth(distancian4g1.getPrefWidth() - 1);
                panen4g1.setPrefWidth((panen4g1.getPrefWidth() - 209) - 60);
                n4g1.setPrefWidth((n4g1.getPrefWidth() - 149.6) - 60);
                juntarn4g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn4g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn4g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn4g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian4g1.getPrefWidth() == 1) {
                panen4g2.setVisible(true);
            } else if (distancian4g1.getPrefWidth() == 2) {
                panen4g3.setVisible(true);
            } else if (distancian4g1.getPrefWidth() == 3) {
                panen4g4.setVisible(true);
            } else if (distancian4g1.getPrefWidth() == 4) {
                panen4g5.setVisible(true);
            } else if (distancian4g1.getPrefWidth() == 5) {
                panen4g6.setVisible(true);
            } else if (distancian4g1.getPrefWidth() == 6) {
                panen4g7.setVisible(true);
            } else if (distancian4g1.getPrefWidth() == 7) {
                panen4g8.setVisible(true);
            } else if (distancian4g1.getPrefWidth() == 8) {
                panen4g9.setVisible(true);
            } else if (distancian4g1.getPrefWidth() == 9) {
                panen4g10.setVisible(true);
            } else if (distancian4g1.getPrefWidth() == 10) {
                panen4g11.setVisible(true);
            }
        });

        juntarn4g2.setOnAction(event -> {
            if (distancian4g2.getPrefWidth() == 1 && distancian4g3.getPrefWidth() == 1 || distancian4g2.getPrefWidth() == 2 && distancian4g4.getPrefWidth() == 1
                    || distancian4g2.getPrefWidth() == 3 && distancian4g5.getPrefWidth() == 1 || distancian4g2.getPrefWidth() == 4 && distancian4g6.getPrefWidth() == 1
                    || distancian4g2.getPrefWidth() == 5 && distancian4g7.getPrefWidth() == 1 || distancian4g2.getPrefWidth() == 6 && distancian4g8.getPrefWidth() == 1
                    || distancian4g2.getPrefWidth() == 7 && distancian4g9.getPrefWidth() == 1 || distancian4g2.getPrefWidth() == 8 && distancian4g10.getPrefWidth() == 1
                    || distancian4g2.getPrefWidth() == 9 && distancian4g11.getPrefWidth() == 1) {
                if (distancian4g2.getPrefWidth() < 11) {
                    distancian4g2.setPrefWidth(distancian4g2.getPrefWidth() + 1);
                    panen4g2.setPrefWidth((panen4g2.getPrefWidth() + 209) + 60);
                    n4g2.setPrefWidth((n4g2.getPrefWidth() + 149.6) + 60);
                    juntarn4g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn4g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn4g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn4g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian4g2.getPrefWidth() == 2) {
                    panen4g1.setVisible(false);
                } else if (distancian4g2.getPrefWidth() == 3) {
                    panen4g3.setVisible(false);
                } else if (distancian4g2.getPrefWidth() == 4) {
                    panen4g4.setVisible(false);
                } else if (distancian4g2.getPrefWidth() == 5) {
                    panen4g5.setVisible(false);
                } else if (distancian4g2.getPrefWidth() == 6) {
                    panen4g6.setVisible(false);
                } else if (distancian4g2.getPrefWidth() == 7) {
                    panen4g7.setVisible(false);
                } else if (distancian4g2.getPrefWidth() == 8) {
                    panen4g8.setVisible(false);
                } else if (distancian4g2.getPrefWidth() == 9) {
                    panen4g9.setVisible(false);
                } else if (distancian4g2.getPrefWidth() == 10) {
                    panen4g10.setVisible(false);
                } else if (distancian4g2.getPrefWidth() == 11) {
                    panen4g11.setVisible(false);
                }
            }
        });

        separarn4g2.setOnAction(event -> {
            if (distancian4g2.getPrefWidth() > 1) {
                distancian4g2.setPrefWidth(distancian4g2.getPrefWidth() - 1);
                panen4g2.setPrefWidth((panen4g2.getPrefWidth() - 209) - 60);
                n4g2.setPrefWidth((n4g2.getPrefWidth() - 149.6) - 60);
                juntarn4g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn4g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn4g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn4g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian4g2.getPrefWidth() == 1) {
                panen4g1.setVisible(true);
            } else if (distancian4g2.getPrefWidth() == 2) {
                panen4g3.setVisible(true);
            } else if (distancian4g2.getPrefWidth() == 3) {
                panen4g4.setVisible(true);
            } else if (distancian4g2.getPrefWidth() == 4) {
                panen4g5.setVisible(true);
            } else if (distancian4g2.getPrefWidth() == 5) {
                panen4g6.setVisible(true);
            } else if (distancian4g2.getPrefWidth() == 6) {
                panen4g7.setVisible(true);
            } else if (distancian4g2.getPrefWidth() == 7) {
                panen4g8.setVisible(true);
            } else if (distancian4g2.getPrefWidth() == 8) {
                panen4g9.setVisible(true);
            } else if (distancian4g2.getPrefWidth() == 9) {
                panen4g10.setVisible(true);
            } else if (distancian4g2.getPrefWidth() == 10) {
                panen4g11.setVisible(true);
            }
        });

        juntarn4g3.setOnAction(event -> {
            if (distancian4g3.getPrefWidth() == 1 && distancian4g4.getPrefWidth() == 1 || distancian4g3.getPrefWidth() == 2 && distancian4g5.getPrefWidth() == 1
                    || distancian4g3.getPrefWidth() == 3 && distancian4g6.getPrefWidth() == 1 || distancian4g3.getPrefWidth() == 4 && distancian4g7.getPrefWidth() == 1
                    || distancian4g3.getPrefWidth() == 5 && distancian4g8.getPrefWidth() == 1 || distancian4g3.getPrefWidth() == 6 && distancian4g9.getPrefWidth() == 1
                    || distancian4g3.getPrefWidth() == 7 && distancian4g10.getPrefWidth() == 1 || distancian4g3.getPrefWidth() == 8 && distancian4g11.getPrefWidth() == 1) {
                if (distancian4g3.getPrefWidth() < 11) {
                    distancian4g3.setPrefWidth(distancian4g3.getPrefWidth() + 1);
                    panen4g3.setPrefWidth((panen4g3.getPrefWidth() + 209) + 60);
                    n4g3.setPrefWidth((n4g3.getPrefWidth() + 149.6) + 60);
                    juntarn4g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn4g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn4g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn4g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian4g3.getPrefWidth() == 2) {
                    panen4g2.setVisible(false);
                } else if (distancian4g3.getPrefWidth() == 3) {
                    panen4g4.setVisible(false);
                } else if (distancian4g3.getPrefWidth() == 4) {
                    panen4g5.setVisible(false);
                } else if (distancian4g3.getPrefWidth() == 5) {
                    panen4g6.setVisible(false);
                } else if (distancian4g3.getPrefWidth() == 6) {
                    panen4g7.setVisible(false);
                } else if (distancian4g3.getPrefWidth() == 7) {
                    panen4g8.setVisible(false);
                } else if (distancian4g3.getPrefWidth() == 8) {
                    panen4g9.setVisible(false);
                } else if (distancian4g3.getPrefWidth() == 9) {
                    panen4g10.setVisible(false);
                } else if (distancian4g3.getPrefWidth() == 10) {
                    panen4g11.setVisible(false);
                }
            }
        });

        separarn4g3.setOnAction(event -> {
            if (distancian4g3.getPrefWidth() > 1) {
                distancian4g3.setPrefWidth(distancian4g3.getPrefWidth() - 1);
                panen4g3.setPrefWidth((panen4g3.getPrefWidth() - 209) - 60);
                n4g3.setPrefWidth((n4g3.getPrefWidth() - 149.6) - 60);
                juntarn4g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn4g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn4g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn4g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian4g3.getPrefWidth() == 1) {
                panen4g2.setVisible(true);
            } else if (distancian4g3.getPrefWidth() == 2) {
                panen4g4.setVisible(true);
            } else if (distancian4g3.getPrefWidth() == 3) {
                panen4g5.setVisible(true);
            } else if (distancian4g3.getPrefWidth() == 4) {
                panen4g6.setVisible(true);
            } else if (distancian4g3.getPrefWidth() == 5) {
                panen4g7.setVisible(true);
            } else if (distancian4g3.getPrefWidth() == 6) {
                panen4g8.setVisible(true);
            } else if (distancian4g3.getPrefWidth() == 7) {
                panen4g9.setVisible(true);
            } else if (distancian4g3.getPrefWidth() == 8) {
                panen4g10.setVisible(true);
            } else if (distancian4g3.getPrefWidth() == 9) {
                panen4g11.setVisible(true);
            }
        });

        juntarn4g4.setOnAction(event -> {
            if (distancian4g4.getPrefWidth() == 1 && distancian4g5.getPrefWidth() == 1 || distancian4g4.getPrefWidth() == 2 && distancian4g6.getPrefWidth() == 1
                    || distancian4g4.getPrefWidth() == 3 && distancian4g7.getPrefWidth() == 1 || distancian4g4.getPrefWidth() == 4 && distancian4g8.getPrefWidth() == 1
                    || distancian4g4.getPrefWidth() == 5 && distancian4g9.getPrefWidth() == 1 || distancian4g4.getPrefWidth() == 6 && distancian4g10.getPrefWidth() == 1
                    || distancian4g4.getPrefWidth() == 7 && distancian4g11.getPrefWidth() == 1) {
                if (distancian4g4.getPrefWidth() < 11) {
                    distancian4g4.setPrefWidth(distancian4g4.getPrefWidth() + 1);
                    panen4g4.setPrefWidth((panen4g4.getPrefWidth() + 209) + 60);
                    n4g4.setPrefWidth((n4g4.getPrefWidth() + 149.6) + 60);
                    juntarn4g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn4g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn4g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn4g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian4g4.getPrefWidth() == 2) {
                    panen4g3.setVisible(false);
                } else if (distancian4g4.getPrefWidth() == 3) {
                    panen4g5.setVisible(false);
                } else if (distancian4g4.getPrefWidth() == 4) {
                    panen4g6.setVisible(false);
                } else if (distancian4g4.getPrefWidth() == 5) {
                    panen4g7.setVisible(false);
                } else if (distancian4g4.getPrefWidth() == 6) {
                    panen4g8.setVisible(false);
                } else if (distancian4g4.getPrefWidth() == 7) {
                    panen4g9.setVisible(false);
                } else if (distancian4g4.getPrefWidth() == 8) {
                    panen4g10.setVisible(false);
                } else if (distancian4g4.getPrefWidth() == 9) {
                    panen4g11.setVisible(false);
                }
            }
        });

        separarn4g4.setOnAction(event -> {
            if (distancian4g4.getPrefWidth() > 1) {
                distancian4g4.setPrefWidth(distancian4g4.getPrefWidth() - 1);
                panen4g4.setPrefWidth((panen4g4.getPrefWidth() - 209) - 60);
                n4g4.setPrefWidth((n4g4.getPrefWidth() - 149.6) - 60);
                juntarn4g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn4g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn4g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn4g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian4g4.getPrefWidth() == 1) {
                panen4g3.setVisible(true);
            } else if (distancian4g4.getPrefWidth() == 2) {
                panen4g5.setVisible(true);
            } else if (distancian4g4.getPrefWidth() == 3) {
                panen4g6.setVisible(true);
            } else if (distancian4g4.getPrefWidth() == 4) {
                panen4g7.setVisible(true);
            } else if (distancian4g4.getPrefWidth() == 5) {
                panen4g8.setVisible(true);
            } else if (distancian4g4.getPrefWidth() == 6) {
                panen4g9.setVisible(true);
            } else if (distancian4g4.getPrefWidth() == 7) {
                panen4g10.setVisible(true);
            } else if (distancian4g4.getPrefWidth() == 8) {
                panen4g11.setVisible(true);
            }
        });

        juntarn4g5.setOnAction(event -> {
            if (distancian4g5.getPrefWidth() == 1 && distancian4g6.getPrefWidth() == 1 || distancian4g5.getPrefWidth() == 2 && distancian4g7.getPrefWidth() == 1
                    || distancian4g5.getPrefWidth() == 3 && distancian4g8.getPrefWidth() == 1 || distancian4g5.getPrefWidth() == 4 && distancian4g9.getPrefWidth() == 1
                    || distancian4g5.getPrefWidth() == 5 && distancian4g10.getPrefWidth() == 1 || distancian4g5.getPrefWidth() == 6 && distancian4g11.getPrefWidth() == 1) {
                if (distancian4g5.getPrefWidth() < 11) {
                    distancian4g5.setPrefWidth(distancian4g5.getPrefWidth() + 1);
                    panen4g5.setPrefWidth((panen4g5.getPrefWidth() + 209) + 60);
                    n4g5.setPrefWidth((n4g5.getPrefWidth() + 149.6) + 60);
                    juntarn4g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn4g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn4g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn4g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian4g5.getPrefWidth() == 2) {
                    panen4g4.setVisible(false);
                } else if (distancian4g5.getPrefWidth() == 3) {
                    panen4g6.setVisible(false);
                } else if (distancian4g5.getPrefWidth() == 4) {
                    panen4g7.setVisible(false);
                } else if (distancian4g5.getPrefWidth() == 5) {
                    panen4g8.setVisible(false);
                } else if (distancian4g5.getPrefWidth() == 6) {
                    panen4g9.setVisible(false);
                } else if (distancian4g5.getPrefWidth() == 7) {
                    panen4g10.setVisible(false);
                } else if (distancian4g5.getPrefWidth() == 8) {
                    panen4g11.setVisible(false);
                }
            }
        });

        separarn4g5.setOnAction(event -> {
            if (distancian4g5.getPrefWidth() > 1) {
                distancian4g5.setPrefWidth(distancian4g5.getPrefWidth() - 1);
                panen4g5.setPrefWidth((panen4g5.getPrefWidth() - 209) - 60);
                n4g5.setPrefWidth((n4g5.getPrefWidth() - 149.6) - 60);
                juntarn4g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn4g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn4g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn4g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian4g5.getPrefWidth() == 1) {
                panen4g4.setVisible(true);
            } else if (distancian4g5.getPrefWidth() == 2) {
                panen4g6.setVisible(true);
            } else if (distancian4g5.getPrefWidth() == 3) {
                panen4g7.setVisible(true);
            } else if (distancian4g5.getPrefWidth() == 4) {
                panen4g8.setVisible(true);
            } else if (distancian4g5.getPrefWidth() == 5) {
                panen4g9.setVisible(true);
            } else if (distancian4g5.getPrefWidth() == 6) {
                panen4g10.setVisible(true);
            } else if (distancian4g5.getPrefWidth() == 7) {
                panen4g11.setVisible(true);
            }
        });

        juntarn4g6.setOnAction(event -> {
            if (distancian4g6.getPrefWidth() == 1 && distancian4g7.getPrefWidth() == 1 || distancian4g6.getPrefWidth() == 2 && distancian4g8.getPrefWidth() == 1
                    || distancian4g6.getPrefWidth() == 3 && distancian4g9.getPrefWidth() == 1 || distancian4g6.getPrefWidth() == 4 && distancian4g10.getPrefWidth() == 1
                    || distancian4g6.getPrefWidth() == 5 && distancian4g11.getPrefWidth() == 1) {
                if (distancian4g6.getPrefWidth() < 11) {
                    distancian4g6.setPrefWidth(distancian4g6.getPrefWidth() + 1);
                    panen4g6.setPrefWidth((panen4g6.getPrefWidth() + 209) + 60);
                    n4g6.setPrefWidth((n4g6.getPrefWidth() + 149.6) + 60);
                    juntarn4g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn4g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn4g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn4g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian4g6.getPrefWidth() == 2) {
                    panen4g5.setVisible(false);
                } else if (distancian4g6.getPrefWidth() == 3) {
                    panen4g7.setVisible(false);
                } else if (distancian4g6.getPrefWidth() == 4) {
                    panen4g8.setVisible(false);
                } else if (distancian4g6.getPrefWidth() == 5) {
                    panen4g9.setVisible(false);
                } else if (distancian4g6.getPrefWidth() == 6) {
                    panen4g10.setVisible(false);
                } else if (distancian4g6.getPrefWidth() == 7) {
                    panen4g11.setVisible(false);
                }
            }
        });

        separarn4g6.setOnAction(event -> {
            if (distancian4g6.getPrefWidth() > 1) {
                distancian4g6.setPrefWidth(distancian4g6.getPrefWidth() - 1);
                panen4g6.setPrefWidth((panen4g6.getPrefWidth() - 209) - 60);
                n4g6.setPrefWidth((n4g6.getPrefWidth() - 149.6) - 60);
                juntarn4g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn4g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn4g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn4g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian4g6.getPrefWidth() == 1) {
                panen4g5.setVisible(true);
            } else if (distancian4g6.getPrefWidth() == 2) {
                panen4g7.setVisible(true);
            } else if (distancian4g6.getPrefWidth() == 3) {
                panen4g8.setVisible(true);
            } else if (distancian4g6.getPrefWidth() == 4) {
                panen4g9.setVisible(true);
            } else if (distancian4g6.getPrefWidth() == 5) {
                panen4g10.setVisible(true);
            } else if (distancian4g6.getPrefWidth() == 6) {
                panen4g11.setVisible(true);
            }
        });

        juntarn4g7.setOnAction(event -> {
            if (distancian4g7.getPrefWidth() == 1 && distancian4g8.getPrefWidth() == 1 || distancian4g7.getPrefWidth() == 2 && distancian4g9.getPrefWidth() == 1
                    || distancian4g7.getPrefWidth() == 3 && distancian4g10.getPrefWidth() == 1 || distancian4g7.getPrefWidth() == 4 && distancian4g11.getPrefWidth() == 1) {
                if (distancian4g7.getPrefWidth() < 11) {
                    distancian4g7.setPrefWidth(distancian4g7.getPrefWidth() + 1);
                    panen4g7.setPrefWidth((panen4g7.getPrefWidth() + 209) + 60);
                    n4g7.setPrefWidth((n4g7.getPrefWidth() + 149.6) + 60);
                    juntarn4g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn4g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn4g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn4g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian4g7.getPrefWidth() == 2) {
                    panen4g6.setVisible(false);
                } else if (distancian4g7.getPrefWidth() == 3) {
                    panen4g8.setVisible(false);
                } else if (distancian4g7.getPrefWidth() == 4) {
                    panen4g9.setVisible(false);
                } else if (distancian4g7.getPrefWidth() == 5) {
                    panen4g10.setVisible(false);
                } else if (distancian4g7.getPrefWidth() == 6) {
                    panen4g11.setVisible(false);
                }
            }
        });

        separarn4g7.setOnAction(event -> {
            if (distancian4g7.getPrefWidth() > 1) {
                distancian4g7.setPrefWidth(distancian4g7.getPrefWidth() - 1);
                panen4g7.setPrefWidth((panen4g7.getPrefWidth() - 209) - 60);
                n4g7.setPrefWidth((n4g7.getPrefWidth() - 149.6) - 60);
                juntarn4g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn4g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn4g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn4g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian4g7.getPrefWidth() == 1) {
                panen4g6.setVisible(true);
            } else if (distancian4g7.getPrefWidth() == 2) {
                panen4g8.setVisible(true);
            } else if (distancian4g7.getPrefWidth() == 3) {
                panen4g9.setVisible(true);
            } else if (distancian4g7.getPrefWidth() == 4) {
                panen4g10.setVisible(true);
            } else if (distancian4g7.getPrefWidth() == 5) {
                panen4g11.setVisible(true);
            }
        });

        juntarn4g8.setOnAction(event -> {
            if (distancian4g8.getPrefWidth() == 1 && distancian4g9.getPrefWidth() == 1 || distancian4g8.getPrefWidth() == 2 && distancian4g10.getPrefWidth() == 1
                    || distancian4g8.getPrefWidth() == 3 && distancian4g11.getPrefWidth() == 1) {
                if (distancian4g8.getPrefWidth() < 11) {
                    distancian4g8.setPrefWidth(distancian4g8.getPrefWidth() + 1);
                    panen4g8.setPrefWidth((panen4g8.getPrefWidth() + 209) + 60);
                    n4g8.setPrefWidth((n4g8.getPrefWidth() + 149.6) + 60);
                    juntarn4g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn4g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn4g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn4g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian4g8.getPrefWidth() == 2) {
                    panen4g7.setVisible(false);
                } else if (distancian4g8.getPrefWidth() == 3) {
                    panen4g9.setVisible(false);
                } else if (distancian4g8.getPrefWidth() == 4) {
                    panen4g10.setVisible(false);
                } else if (distancian4g8.getPrefWidth() == 5) {
                    panen4g11.setVisible(false);
                }
            }
        });

        separarn4g8.setOnAction(event -> {
            if (distancian4g8.getPrefWidth() > 1) {
                distancian4g8.setPrefWidth(distancian4g8.getPrefWidth() - 1);
                panen4g8.setPrefWidth((panen4g8.getPrefWidth() - 209) - 60);
                n4g8.setPrefWidth((n4g8.getPrefWidth() - 149.6) - 60);
                juntarn4g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn4g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn4g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn4g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian4g8.getPrefWidth() == 1) {
                panen4g7.setVisible(true);
            } else if (distancian4g8.getPrefWidth() == 2) {
                panen4g9.setVisible(true);
            } else if (distancian4g8.getPrefWidth() == 3) {
                panen4g10.setVisible(true);
            } else if (distancian4g8.getPrefWidth() == 4) {
                panen4g11.setVisible(true);
            }
        });

        juntarn4g9.setOnAction(event -> {
            if (distancian4g9.getPrefWidth() == 1 && distancian4g10.getPrefWidth() == 1 || distancian4g9.getPrefWidth() == 2 && distancian4g11.getPrefWidth() == 1) {
                if (distancian4g9.getPrefWidth() < 11) {
                    distancian4g9.setPrefWidth(distancian4g9.getPrefWidth() + 1);
                    panen4g9.setPrefWidth((panen4g9.getPrefWidth() + 209) + 60);
                    n4g9.setPrefWidth((n4g9.getPrefWidth() + 149.6) + 60);
                    juntarn4g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn4g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn4g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn4g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian4g9.getPrefWidth() == 2) {
                    panen4g8.setVisible(false);
                } else if (distancian4g9.getPrefWidth() == 3) {
                    panen4g10.setVisible(false);
                } else if (distancian4g9.getPrefWidth() == 4) {
                    panen4g11.setVisible(false);
                }
            }
        });

        separarn4g9.setOnAction(event -> {
            if (distancian4g9.getPrefWidth() > 1) {
                distancian4g9.setPrefWidth(distancian4g9.getPrefWidth() - 1);
                panen4g9.setPrefWidth((panen4g9.getPrefWidth() - 209) - 60);
                n4g9.setPrefWidth((n4g9.getPrefWidth() - 149.6) - 60);
                juntarn4g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn4g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn4g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn4g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian4g9.getPrefWidth() == 1) {
                panen4g8.setVisible(true);
            } else if (distancian4g9.getPrefWidth() == 2) {
                panen4g10.setVisible(true);
            } else if (distancian4g9.getPrefWidth() == 3) {
                panen4g11.setVisible(true);
            }
        });

        juntarn4g10.setOnAction(event -> {
            if (distancian4g10.getPrefWidth() == 1 && distancian4g11.getPrefWidth() == 1) {
                if (distancian4g10.getPrefWidth() < 9) {
                    distancian4g10.setPrefWidth(distancian4g10.getPrefWidth() + 1);
                    panen4g10.setPrefWidth((panen4g10.getPrefWidth() + 209) + 60);
                    n4g10.setPrefWidth((n4g10.getPrefWidth() + 149.6) + 60);
                    juntarn4g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn4g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn4g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn4g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian4g10.getPrefWidth() == 2) {
                    panen4g11.setVisible(false);
                }
            }
        });

        separarn4g10.setOnAction(event -> {
            if (distancian4g10.getPrefWidth() > 1) {
                distancian4g10.setPrefWidth(distancian4g10.getPrefWidth() - 1);
                panen4g10.setPrefWidth((panen4g10.getPrefWidth() - 209) - 60);
                n4g10.setPrefWidth((n4g10.getPrefWidth() - 149.6) - 60);
                juntarn4g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn4g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn4g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn4g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian4g10.getPrefWidth() == 1) {
                panen4g11.setVisible(true);
            }
        });

        juntarn5g1.setOnAction(event -> {
            if (distancian5g1.getPrefWidth() == 1 && distancian5g2.getPrefWidth() == 1 || distancian5g1.getPrefWidth() == 2 && distancian5g3.getPrefWidth() == 1
                    || distancian5g1.getPrefWidth() == 3 && distancian5g4.getPrefWidth() == 1 || distancian5g1.getPrefWidth() == 4 && distancian5g5.getPrefWidth() == 1
                    || distancian5g1.getPrefWidth() == 5 && distancian5g6.getPrefWidth() == 1 || distancian5g1.getPrefWidth() == 6 && distancian5g7.getPrefWidth() == 1
                    || distancian5g1.getPrefWidth() == 7 && distancian5g8.getPrefWidth() == 1 || distancian5g1.getPrefWidth() == 8 && distancian5g9.getPrefWidth() == 1
                    || distancian5g1.getPrefWidth() == 9 && distancian5g10.getPrefWidth() == 1 || distancian5g1.getPrefWidth() == 9 && distancian5g11.getPrefWidth() == 1) {
                if (distancian5g1.getPrefWidth() < 11) {
                    distancian5g1.setPrefWidth(distancian5g1.getPrefWidth() + 1);
                    panen5g1.setPrefWidth((panen5g1.getPrefWidth() + 209) + 60);
                    n5g1.setPrefWidth((n5g1.getPrefWidth() + 149.6) + 60);
                    juntarn5g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn5g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn5g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn5g1.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian5g1.getPrefWidth() == 2) {
                    panen5g2.setVisible(false);
                } else if (distancian5g1.getPrefWidth() == 3) {
                    panen5g3.setVisible(false);
                } else if (distancian5g1.getPrefWidth() == 4) {
                    panen5g4.setVisible(false);
                } else if (distancian5g1.getPrefWidth() == 5) {
                    panen5g5.setVisible(false);
                } else if (distancian5g1.getPrefWidth() == 6) {
                    panen5g6.setVisible(false);
                } else if (distancian5g1.getPrefWidth() == 7) {
                    panen5g7.setVisible(false);
                } else if (distancian5g1.getPrefWidth() == 8) {
                    panen5g8.setVisible(false);
                } else if (distancian5g1.getPrefWidth() == 9) {
                    panen5g9.setVisible(false);
                } else if (distancian5g1.getPrefWidth() == 10) {
                    panen5g10.setVisible(false);
                } else if (distancian5g1.getPrefWidth() == 11) {
                    panen5g11.setVisible(false);
                }
            }
        });

        separarn5g1.setOnAction(event -> {
            if (distancian5g1.getPrefWidth() > 1) {
                distancian5g1.setPrefWidth(distancian5g1.getPrefWidth() - 1);
                panen5g1.setPrefWidth((panen5g1.getPrefWidth() - 209) - 60);
                n5g1.setPrefWidth((n5g1.getPrefWidth() - 149.6) - 60);
                juntarn5g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn5g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn5g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn5g1.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian5g1.getPrefWidth() == 1) {
                panen5g2.setVisible(true);
            } else if (distancian5g1.getPrefWidth() == 2) {
                panen5g3.setVisible(true);
            } else if (distancian5g1.getPrefWidth() == 3) {
                panen5g4.setVisible(true);
            } else if (distancian5g1.getPrefWidth() == 4) {
                panen5g5.setVisible(true);
            } else if (distancian5g1.getPrefWidth() == 5) {
                panen5g6.setVisible(true);
            } else if (distancian5g1.getPrefWidth() == 6) {
                panen5g7.setVisible(true);
            } else if (distancian5g1.getPrefWidth() == 7) {
                panen5g8.setVisible(true);
            } else if (distancian5g1.getPrefWidth() == 8) {
                panen5g9.setVisible(true);
            } else if (distancian5g1.getPrefWidth() == 9) {
                panen5g10.setVisible(true);
            } else if (distancian5g1.getPrefWidth() == 10) {
                panen5g11.setVisible(true);
            }
        });

        juntarn5g2.setOnAction(event -> {
            if (distancian5g2.getPrefWidth() == 1 && distancian5g3.getPrefWidth() == 1 || distancian5g2.getPrefWidth() == 2 && distancian5g4.getPrefWidth() == 1
                    || distancian5g2.getPrefWidth() == 3 && distancian5g5.getPrefWidth() == 1 || distancian5g2.getPrefWidth() == 4 && distancian5g6.getPrefWidth() == 1
                    || distancian5g2.getPrefWidth() == 5 && distancian5g7.getPrefWidth() == 1 || distancian5g2.getPrefWidth() == 6 && distancian5g8.getPrefWidth() == 1
                    || distancian5g2.getPrefWidth() == 7 && distancian5g9.getPrefWidth() == 1 || distancian5g2.getPrefWidth() == 8 && distancian5g10.getPrefWidth() == 1
                    || distancian5g2.getPrefWidth() == 9 && distancian5g11.getPrefWidth() == 1) {
                if (distancian5g2.getPrefWidth() < 11) {
                    distancian5g2.setPrefWidth(distancian5g2.getPrefWidth() + 1);
                    panen5g2.setPrefWidth((panen5g2.getPrefWidth() + 209) + 60);
                    n5g2.setPrefWidth((n5g2.getPrefWidth() + 149.6) + 60);
                    juntarn5g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn5g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn5g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn5g2.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian5g2.getPrefWidth() == 2) {
                    panen5g3.setVisible(false);
                } else if (distancian5g2.getPrefWidth() == 3) {
                    panen5g4.setVisible(false);
                } else if (distancian5g2.getPrefWidth() == 4) {
                    panen5g5.setVisible(false);
                } else if (distancian5g2.getPrefWidth() == 5) {
                    panen5g6.setVisible(false);
                } else if (distancian5g2.getPrefWidth() == 6) {
                    panen5g7.setVisible(false);
                } else if (distancian5g2.getPrefWidth() == 7) {
                    panen5g8.setVisible(false);
                } else if (distancian5g2.getPrefWidth() == 8) {
                    panen5g9.setVisible(false);
                } else if (distancian5g2.getPrefWidth() == 9) {
                    panen5g10.setVisible(false);
                } else if (distancian5g2.getPrefWidth() == 10) {
                    panen5g11.setVisible(false);
                }
            }
        });

        separarn5g2.setOnAction(event -> {
            if (distancian5g2.getPrefWidth() > 1) {
                distancian5g2.setPrefWidth(distancian5g2.getPrefWidth() - 1);
                panen5g2.setPrefWidth((panen5g2.getPrefWidth() - 209) - 60);
                n5g2.setPrefWidth((n5g2.getPrefWidth() - 149.6) - 60);
                juntarn5g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn5g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn5g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn5g2.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian5g2.getPrefWidth() == 1) {
                panen5g3.setVisible(true);
            } else if (distancian5g2.getPrefWidth() == 2) {
                panen5g4.setVisible(true);
            } else if (distancian5g2.getPrefWidth() == 3) {
                panen5g5.setVisible(true);
            } else if (distancian5g2.getPrefWidth() == 4) {
                panen5g6.setVisible(true);
            } else if (distancian5g2.getPrefWidth() == 5) {
                panen5g7.setVisible(true);
            } else if (distancian5g2.getPrefWidth() == 6) {
                panen5g8.setVisible(true);
            } else if (distancian5g2.getPrefWidth() == 7) {
                panen5g9.setVisible(true);
            } else if (distancian5g2.getPrefWidth() == 8) {
                panen5g10.setVisible(true);
            } else if (distancian5g2.getPrefWidth() == 9) {
                panen5g11.setVisible(true);
            }
        });

        juntarn5g3.setOnAction(event -> {
            if (distancian5g3.getPrefWidth() == 1 && distancian5g4.getPrefWidth() == 1 || distancian5g3.getPrefWidth() == 2 && distancian5g5.getPrefWidth() == 1
                    || distancian5g3.getPrefWidth() == 3 && distancian5g6.getPrefWidth() == 1 || distancian5g3.getPrefWidth() == 4 && distancian5g7.getPrefWidth() == 1
                    || distancian5g3.getPrefWidth() == 5 && distancian5g8.getPrefWidth() == 1 || distancian5g3.getPrefWidth() == 6 && distancian5g9.getPrefWidth() == 1
                    || distancian5g3.getPrefWidth() == 7 && distancian5g10.getPrefWidth() == 1 || distancian5g3.getPrefWidth() == 8 && distancian5g11.getPrefWidth() == 1) {
                if (distancian5g3.getPrefWidth() < 11) {
                    distancian5g3.setPrefWidth(distancian5g3.getPrefWidth() + 1);
                    panen5g3.setPrefWidth((panen5g3.getPrefWidth() + 209) + 60);
                    n5g3.setPrefWidth((n5g3.getPrefWidth() + 149.6) + 60);
                    juntarn5g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn5g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn5g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn5g3.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian5g3.getPrefWidth() == 2) {
                    panen5g4.setVisible(false);
                } else if (distancian5g3.getPrefWidth() == 3) {
                    panen5g5.setVisible(false);
                } else if (distancian5g3.getPrefWidth() == 4) {
                    panen5g6.setVisible(false);
                } else if (distancian5g3.getPrefWidth() == 5) {
                    panen5g7.setVisible(false);
                } else if (distancian5g3.getPrefWidth() == 6) {
                    panen5g8.setVisible(false);
                } else if (distancian5g3.getPrefWidth() == 7) {
                    panen5g9.setVisible(false);
                } else if (distancian5g3.getPrefWidth() == 8) {
                    panen5g10.setVisible(false);
                } else if (distancian5g3.getPrefWidth() == 9) {
                    panen5g11.setVisible(false);
                }
            }
        });

        separarn5g3.setOnAction(event -> {
            if (distancian5g3.getPrefWidth() > 1) {
                distancian5g3.setPrefWidth(distancian5g3.getPrefWidth() - 1);
                panen5g3.setPrefWidth((panen5g3.getPrefWidth() - 209) - 60);
                n5g3.setPrefWidth((n5g3.getPrefWidth() - 149.6) - 60);
                juntarn5g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn5g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn5g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn5g3.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian5g3.getPrefWidth() == 1) {
                panen5g4.setVisible(true);
            } else if (distancian5g3.getPrefWidth() == 2) {
                panen5g5.setVisible(true);
            } else if (distancian5g3.getPrefWidth() == 3) {
                panen5g6.setVisible(true);
            } else if (distancian5g3.getPrefWidth() == 4) {
                panen5g7.setVisible(true);
            } else if (distancian5g3.getPrefWidth() == 5) {
                panen5g8.setVisible(true);
            } else if (distancian5g3.getPrefWidth() == 6) {
                panen5g9.setVisible(true);
            } else if (distancian5g3.getPrefWidth() == 7) {
                panen5g10.setVisible(true);
            } else if (distancian5g3.getPrefWidth() == 8) {
                panen5g11.setVisible(true);
            }
        });

        juntarn5g4.setOnAction(event -> {
            if (distancian5g4.getPrefWidth() == 1 && distancian5g5.getPrefWidth() == 1 || distancian5g4.getPrefWidth() == 2 && distancian5g6.getPrefWidth() == 1
                    || distancian5g4.getPrefWidth() == 3 && distancian5g7.getPrefWidth() == 1 || distancian5g4.getPrefWidth() == 4 && distancian5g8.getPrefWidth() == 1
                    || distancian5g4.getPrefWidth() == 5 && distancian5g9.getPrefWidth() == 1 || distancian5g4.getPrefWidth() == 6 && distancian5g10.getPrefWidth() == 1
                    || distancian5g4.getPrefWidth() == 7 && distancian5g11.getPrefWidth() == 1) {
                if (distancian5g4.getPrefWidth() < 11) {
                    distancian5g4.setPrefWidth(distancian5g4.getPrefWidth() + 1);
                    panen5g4.setPrefWidth((panen5g4.getPrefWidth() + 209) + 60);
                    n5g4.setPrefWidth((n5g4.getPrefWidth() + 149.6) + 60);
                    juntarn5g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn5g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn5g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn5g4.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian5g4.getPrefWidth() == 2) {
                    panen5g5.setVisible(false);
                } else if (distancian5g4.getPrefWidth() == 3) {
                    panen5g6.setVisible(false);
                } else if (distancian5g4.getPrefWidth() == 4) {
                    panen5g7.setVisible(false);
                } else if (distancian5g4.getPrefWidth() == 5) {
                    panen5g8.setVisible(false);
                } else if (distancian5g4.getPrefWidth() == 6) {
                    panen5g9.setVisible(false);
                } else if (distancian5g4.getPrefWidth() == 7) {
                    panen5g10.setVisible(false);
                } else if (distancian5g4.getPrefWidth() == 8) {
                    panen5g11.setVisible(false);
                }
            }
        });

        separarn5g4.setOnAction(event -> {
            if (distancian5g4.getPrefWidth() > 1) {
                distancian5g4.setPrefWidth(distancian5g4.getPrefWidth() - 1);
                panen5g4.setPrefWidth((panen5g4.getPrefWidth() - 209) - 60);
                n5g4.setPrefWidth((n5g4.getPrefWidth() - 149.6) - 60);
                juntarn5g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn5g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn5g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn5g4.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian5g4.getPrefWidth() == 1) {
                panen5g5.setVisible(true);
            } else if (distancian5g4.getPrefWidth() == 2) {
                panen5g6.setVisible(true);
            } else if (distancian5g4.getPrefWidth() == 3) {
                panen5g7.setVisible(true);
            } else if (distancian5g4.getPrefWidth() == 4) {
                panen5g8.setVisible(true);
            } else if (distancian5g4.getPrefWidth() == 5) {
                panen5g9.setVisible(true);
            } else if (distancian5g4.getPrefWidth() == 6) {
                panen5g10.setVisible(true);
            } else if (distancian5g4.getPrefWidth() == 7) {
                panen5g11.setVisible(true);
            }
        });

        juntarn5g5.setOnAction(event -> {
            if (distancian5g5.getPrefWidth() == 1 && distancian5g6.getPrefWidth() == 1 || distancian5g5.getPrefWidth() == 2 && distancian5g7.getPrefWidth() == 1
                    || distancian5g5.getPrefWidth() == 3 && distancian5g8.getPrefWidth() == 1 || distancian5g5.getPrefWidth() == 4 && distancian5g9.getPrefWidth() == 1
                    || distancian5g5.getPrefWidth() == 5 && distancian5g10.getPrefWidth() == 1 || distancian5g5.getPrefWidth() == 6 && distancian5g11.getPrefWidth() == 1) {
                if (distancian5g5.getPrefWidth() < 11) {
                    distancian5g5.setPrefWidth(distancian5g5.getPrefWidth() + 1);
                    panen5g5.setPrefWidth((panen5g5.getPrefWidth() + 209) + 60);
                    n5g5.setPrefWidth((n5g5.getPrefWidth() + 149.6) + 60);
                    juntarn5g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn5g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn5g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn5g5.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian5g5.getPrefWidth() == 2) {
                    panen5g6.setVisible(false);
                } else if (distancian5g5.getPrefWidth() == 3) {
                    panen5g7.setVisible(false);
                } else if (distancian5g5.getPrefWidth() == 4) {
                    panen5g8.setVisible(false);
                } else if (distancian5g5.getPrefWidth() == 5) {
                    panen5g9.setVisible(false);
                } else if (distancian5g5.getPrefWidth() == 6) {
                    panen5g10.setVisible(false);
                } else if (distancian5g5.getPrefWidth() == 7) {
                    panen5g11.setVisible(false);
                }
            }
        });

        separarn5g5.setOnAction(event -> {
            if (distancian5g5.getPrefWidth() > 1) {
                distancian5g5.setPrefWidth(distancian5g5.getPrefWidth() - 1);
                panen5g5.setPrefWidth((panen5g5.getPrefWidth() - 209) - 60);
                n5g5.setPrefWidth((n5g5.getPrefWidth() - 149.6) - 60);
                juntarn5g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn5g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn5g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn5g5.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian5g5.getPrefWidth() == 1) {
                panen5g6.setVisible(true);
            } else if (distancian5g5.getPrefWidth() == 2) {
                panen5g7.setVisible(true);
            } else if (distancian5g5.getPrefWidth() == 3) {
                panen5g8.setVisible(true);
            } else if (distancian5g5.getPrefWidth() == 4) {
                panen5g9.setVisible(true);
            } else if (distancian5g5.getPrefWidth() == 5) {
                panen5g10.setVisible(true);
            } else if (distancian5g5.getPrefWidth() == 6) {
                panen5g11.setVisible(true);
            }
        });

        juntarn5g6.setOnAction(event -> {
            if (distancian5g6.getPrefWidth() == 1 && distancian5g7.getPrefWidth() == 1 || distancian5g6.getPrefWidth() == 2 && distancian5g8.getPrefWidth() == 1
                    || distancian5g6.getPrefWidth() == 3 && distancian5g9.getPrefWidth() == 1 || distancian5g6.getPrefWidth() == 4 && distancian5g10.getPrefWidth() == 1
                    || distancian5g6.getPrefWidth() == 5 && distancian5g11.getPrefWidth() == 1) {
                if (distancian5g6.getPrefWidth() < 11) {
                    distancian5g6.setPrefWidth(distancian5g6.getPrefWidth() + 1);
                    panen5g6.setPrefWidth((panen5g6.getPrefWidth() + 209) + 60);
                    n5g6.setPrefWidth((n5g6.getPrefWidth() + 149.6) + 60);
                    juntarn5g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn5g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn5g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn5g6.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian5g6.getPrefWidth() == 2) {
                    panen5g7.setVisible(false);
                } else if (distancian5g6.getPrefWidth() == 3) {
                    panen5g8.setVisible(false);
                } else if (distancian5g6.getPrefWidth() == 4) {
                    panen5g9.setVisible(false);
                } else if (distancian5g6.getPrefWidth() == 5) {
                    panen5g10.setVisible(false);
                } else if (distancian5g6.getPrefWidth() == 6) {
                    panen5g11.setVisible(false);
                }
            }
        });

        separarn5g6.setOnAction(event -> {
            if (distancian5g6.getPrefWidth() > 1) {
                distancian5g6.setPrefWidth(distancian5g6.getPrefWidth() - 1);
                panen5g6.setPrefWidth((panen5g6.getPrefWidth() - 209) - 60);
                n5g6.setPrefWidth((n5g6.getPrefWidth() - 149.6) - 60);
                juntarn5g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn5g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn5g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn5g6.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian5g6.getPrefWidth() == 1) {
                panen5g7.setVisible(true);
            } else if (distancian5g6.getPrefWidth() == 2) {
                panen5g8.setVisible(true);
            } else if (distancian5g6.getPrefWidth() == 3) {
                panen5g9.setVisible(true);
            } else if (distancian5g6.getPrefWidth() == 4) {
                panen5g10.setVisible(true);
            } else if (distancian5g6.getPrefWidth() == 5) {
                panen5g11.setVisible(true);
            }
        });

        juntarn5g7.setOnAction(event -> {
            if (distancian5g7.getPrefWidth() == 1 && distancian5g8.getPrefWidth() == 1 || distancian5g7.getPrefWidth() == 2 && distancian5g9.getPrefWidth() == 1
                    || distancian5g7.getPrefWidth() == 3 && distancian5g10.getPrefWidth() == 1 || distancian5g7.getPrefWidth() == 4 && distancian5g11.getPrefWidth() == 1) {
                if (distancian5g7.getPrefWidth() < 11) {
                    distancian5g7.setPrefWidth(distancian5g7.getPrefWidth() + 1);
                    panen5g7.setPrefWidth((panen5g7.getPrefWidth() + 209) + 60);
                    n5g7.setPrefWidth((n5g7.getPrefWidth() + 149.6) + 60);
                    juntarn5g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn5g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn5g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn5g7.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian5g7.getPrefWidth() == 2) {
                    panen5g8.setVisible(false);
                } else if (distancian5g7.getPrefWidth() == 3) {
                    panen5g9.setVisible(false);
                } else if (distancian5g7.getPrefWidth() == 4) {
                    panen5g10.setVisible(false);
                } else if (distancian5g7.getPrefWidth() == 5) {
                    panen5g11.setVisible(false);
                }
            }
        });

        separarn5g7.setOnAction(event -> {
            if (distancian5g7.getPrefWidth() > 1) {
                distancian5g7.setPrefWidth(distancian5g7.getPrefWidth() - 1);
                panen5g7.setPrefWidth((panen5g7.getPrefWidth() - 209) - 60);
                n5g7.setPrefWidth((n5g7.getPrefWidth() - 149.6) - 60);
                juntarn5g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn5g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn5g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn5g7.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian5g7.getPrefWidth() == 1) {
                panen5g8.setVisible(true);
            } else if (distancian5g7.getPrefWidth() == 2) {
                panen5g9.setVisible(true);
            } else if (distancian5g7.getPrefWidth() == 3) {
                panen5g10.setVisible(true);
            } else if (distancian5g7.getPrefWidth() == 4) {
                panen5g11.setVisible(true);
            }
        });

        juntarn5g8.setOnAction(event -> {
            if (distancian5g8.getPrefWidth() == 1 && distancian5g9.getPrefWidth() == 1 || distancian5g8.getPrefWidth() == 2 && distancian5g10.getPrefWidth() == 1
                    || distancian5g8.getPrefWidth() == 3 && distancian5g11.getPrefWidth() == 1) {
                if (distancian5g7.getPrefWidth() < 11) {
                    distancian5g8.setPrefWidth(distancian5g8.getPrefWidth() + 1);
                    panen5g8.setPrefWidth((panen5g8.getPrefWidth() + 209) + 60);
                    n5g8.setPrefWidth((n5g8.getPrefWidth() + 149.6) + 60);
                    juntarn5g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn5g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn5g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn5g8.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian5g8.getPrefWidth() == 2) {
                    panen5g9.setVisible(false);
                } else if (distancian5g8.getPrefWidth() == 3) {
                    panen5g10.setVisible(false);
                } else if (distancian5g8.getPrefWidth() == 4) {
                    panen5g11.setVisible(false);
                }
            }
        });

        separarn5g8.setOnAction(event -> {
            if (distancian5g8.getPrefWidth() > 1) {
                distancian5g8.setPrefWidth(distancian5g8.getPrefWidth() - 1);
                panen5g8.setPrefWidth((panen5g8.getPrefWidth() - 209) - 60);
                n5g8.setPrefWidth((n5g8.getPrefWidth() - 149.6) - 60);
                juntarn5g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn5g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn5g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn5g8.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian5g8.getPrefWidth() == 1) {
                panen5g9.setVisible(true);
            } else if (distancian5g8.getPrefWidth() == 2) {
                panen5g10.setVisible(true);
            } else if (distancian5g8.getPrefWidth() == 3) {
                panen5g11.setVisible(true);
            }
        });

        juntarn5g9.setOnAction(event -> {
            if (distancian5g9.getPrefWidth() == 1 && distancian5g10.getPrefWidth() == 1 || distancian5g9.getPrefWidth() == 2 && distancian5g11.getPrefWidth() == 1) {
                if (distancian5g8.getPrefWidth() < 11) {
                    distancian5g9.setPrefWidth(distancian5g9.getPrefWidth() + 1);
                    panen5g9.setPrefWidth((panen5g9.getPrefWidth() + 209) + 60);
                    n5g9.setPrefWidth((n5g9.getPrefWidth() + 149.6) + 60);
                    juntarn5g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn5g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn5g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn5g9.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian5g9.getPrefWidth() == 2) {
                    panen5g10.setVisible(false);
                } else if (distancian5g9.getPrefWidth() == 3) {
                    panen5g11.setVisible(false);
                }
            }
        });

        separarn5g9.setOnAction(event -> {
            if (distancian5g9.getPrefWidth() > 1) {
                distancian5g9.setPrefWidth(distancian5g9.getPrefWidth() - 1);
                panen5g9.setPrefWidth((panen5g9.getPrefWidth() - 209) - 60);
                n5g9.setPrefWidth((n5g9.getPrefWidth() - 149.6) - 60);
                juntarn5g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn5g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn5g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn5g9.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian5g9.getPrefWidth() == 1) {
                panen5g10.setVisible(true);
            } else if (distancian5g9.getPrefWidth() == 2) {
                panen5g11.setVisible(true);
            }
        });

        juntarn5g10.setOnAction(event -> {
            if (distancian5g10.getPrefWidth() == 1 && distancian5g11.getPrefWidth() == 1) {
                if (distancian5g9.getPrefWidth() < 11) {
                    distancian5g10.setPrefWidth(distancian5g10.getPrefWidth() + 1);
                    panen5g10.setPrefWidth((panen5g10.getPrefWidth() + 209) + 60);
                    n5g10.setPrefWidth((n5g10.getPrefWidth() + 149.6) + 60);
                    juntarn5g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    separarn5g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    masn5g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                    menosn5g10.getTransforms().add(new javafx.scene.transform.Translate(210, 0));
                }
                if (distancian5g10.getPrefWidth() == 2) {
                    panen5g11.setVisible(false);
                }
            }
        });

        separarn5g10.setOnAction(event -> {
            if (distancian5g10.getPrefWidth() > 1) {
                distancian5g10.setPrefWidth(distancian5g10.getPrefWidth() - 1);
                panen5g10.setPrefWidth((panen5g10.getPrefWidth() - 209) - 60);
                n5g10.setPrefWidth((n5g10.getPrefWidth() - 149.6) - 60);
                juntarn5g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                separarn5g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                masn5g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
                menosn5g10.getTransforms().add(new javafx.scene.transform.Translate(-210, 0));
            }
            if (distancian5g10.getPrefWidth() == 1) {
                panen5g11.setVisible(true);
            }
        });

        ocultarcombo1();
        ocultarcombo2();
        ocultarcombo3();
        ocultarcombo4();
        ocultarcombo5();
        ocultarcombo6();
        ocultarcombo7();
        ocultarcombo8();
        ocultarcombo9();
        ocultarcombo10();
        ocultarcombo11();


        tipospalabra.add("");
        tipospalabra.add("Sust.");
        tipospalabra.add("Adj.");
        tipospalabra.add("Adj. Sust.");
        tipospalabra.add("Pron.");
        tipospalabra.add("Pron. Rel.");
        tipospalabra.add("Vb. Pers.");
        tipospalabra.add("Vb. No Pers.");
        tipospalabra.add("Adverbio");
        tipospalabra.add("Conj_Coor.");
        tipospalabra.add("Conj_Sub.");
        tipospalabra.add("Preposición");
        items = FXCollections.observableList(tipospalabra);
        tpg1.setItems(items);
        tpg2.setItems(items);
        tpg3.setItems(items);
        tpg4.setItems(items);
        tpg5.setItems(items);
        tpg6.setItems(items);
        tpg7.setItems(items);
        tpg8.setItems(items);
        tpg9.setItems(items);
        tpg10.setItems(items);
        tpg11.setItems(items);

        items.removeAll();

        niveles.add("");
        niveles.add("Sujeto");
        niveles.add("Predicado");
        niveles.add("Núcleo");
        niveles.add("Adyacente");
        niveles.add("Determ.");
        niveles.add("C.Nombre");
        niveles.add("Aposición");
        niveles.add("Núcleo VB");
        niveles.add("Atributo");
        niveles.add("C.Directo");
        niveles.add("C.Indirecto");
        niveles.add("C.Circunst.");
        niveles.add("C.Suplem.");
        niveles.add("C.Predicat.");
        niveles.add("C.Agente");
        niveles.add("Enlace");
        niveles.add("Término");
        niveles.add("Nexo");
        niveles.add("Part. Absol.");
        niveles.add("Pr_Sub_Adj");
        niveles.add("Pr_Sub_Adv");
        niveles.add("Pr_Sub_Sus");
        niveles.add("Pr_Coord");
        niveles.add("Sintg_Parti");
        niveles.add("Cpl_Inf_C");
        niveles.add("Cpl_Inf_N_C");

        items = FXCollections.observableList(niveles);
        n1g1.setItems(items);
        n1g2.setItems(items);
        n1g3.setItems(items);
        n1g4.setItems(items);
        n1g5.setItems(items);
        n1g6.setItems(items);
        n1g7.setItems(items);
        n1g8.setItems(items);
        n1g9.setItems(items);
        n1g10.setItems(items);
        n1g11.setItems(items);
        n2g1.setItems(items);
        n2g2.setItems(items);
        n2g3.setItems(items);
        n2g4.setItems(items);
        n2g5.setItems(items);
        n2g6.setItems(items);
        n2g7.setItems(items);
        n2g8.setItems(items);
        n2g9.setItems(items);
        n2g10.setItems(items);
        n2g11.setItems(items);
        n3g1.setItems(items);
        n3g2.setItems(items);
        n3g3.setItems(items);
        n3g4.setItems(items);
        n3g5.setItems(items);
        n3g6.setItems(items);
        n3g7.setItems(items);
        n3g8.setItems(items);
        n3g9.setItems(items);
        n3g10.setItems(items);
        n3g11.setItems(items);
        n4g1.setItems(items);
        n4g2.setItems(items);
        n4g3.setItems(items);
        n4g4.setItems(items);
        n4g5.setItems(items);
        n4g6.setItems(items);
        n4g7.setItems(items);
        n4g8.setItems(items);
        n4g9.setItems(items);
        n4g10.setItems(items);
        n4g11.setItems(items);
        n5g1.setItems(items);
        n5g2.setItems(items);
        n5g3.setItems(items);
        n5g4.setItems(items);
        n5g5.setItems(items);
        n5g6.setItems(items);
        n5g7.setItems(items);
        n5g8.setItems(items);
        n5g9.setItems(items);
        n5g10.setItems(items);
        n5g11.setItems(items);

        items.removeAll();
        encliticas.add("");
        encliticas.add("-QUE");
        encliticas.add("-VE");
        encliticas.add("-CUM");
        items = FXCollections.observableList(encliticas);
        enc1.setItems(items);
        enc2.setItems(items);
        enc3.setItems(items);
        enc4.setItems(items);
        enc5.setItems(items);
        enc6.setItems(items);
        enc7.setItems(items);
        enc8.setItems(items);
        enc9.setItems(items);
        enc10.setItems(items);
        enc11.setItems(items);

        items.removeAll();
        crsb.add("");
        crsb.add("[");
        crsb.add("]");
        crsb.add("(");
        crsb.add(")");
        crsb.add("[(");
        crsb.add(")]");
        crsb.add("[((");
        crsb.add("))]");
        crsb.add("([");
        crsb.add("])");
        items = FXCollections.observableList(crsb);
        cs1.setItems(items);
        cs2.setItems(items);
        cs3.setItems(items);
        cs4.setItems(items);
        cs5.setItems(items);
        cs6.setItems(items);
        cs7.setItems(items);
        cs8.setItems(items);
        cs9.setItems(items);
        cs10.setItems(items);
        cs11.setItems(items);

        genero.add("Masculino");
        genero.add("Femenino");
        genero.add("Neutro");

        numero.add("Singular");
        numero.add("Plural");

        timer.schedule(atgrd, 30000, 1000);

    }


    public void abrirDiccionario(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/controlador/lexilogos/diccionario.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Diccionario Lexílogos");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sensorG1() {
        ocultarcombo1();
        if (tpg1.getValue().equals("Sust.") ||
                tpg1.getValue().equals("Adj.") ||
                tpg1.getValue().equals("Adj. Sust.") ||
                tpg1.getValue().equals("Pron.") ||
                tpg1.getValue().equals("Pron. Rel.")) {
            caperg1.clear();
            caperg1.add("Nominat.");
            caperg1.add("Acusat.");
            caperg1.add("Genitivo");
            caperg1.add("Dativo");
            caperg1.add("Ablativo");
            caperg1.add("Locativo");
            items.removeAll();
            items = FXCollections.observableList(caperg1);
            cpg1.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg1.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng1.setItems(items);

            cpg1.setVisible(true);
            gg1.setVisible(true);
            ng1.setVisible(true);

        } if (tpg1.getValue().equals("Vb. Pers.")) {
            caperg1.clear();
            caperg1.add("1ª Persona");
            caperg1.add("2ª Persona");
            caperg1.add("3ª Persona");
            items.removeAll();
            items = FXCollections.observableList(caperg1);
            cpg1.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng1.setItems(items);
            tiempo.clear();
            tiempo.add("Pres.");
            tiempo.add("Pr. Imp.");
            tiempo.add("Pr. Perf");
            tiempo.add("Pr. Plus.");
            tiempo.add("Fut. Imp.");
            tiempo.add("Fut. Perf.");
            items.removeAll();
            items = FXCollections.observableList(tiempo);
            tvg1.setItems(items);
            items.removeAll();
            insMV(mvg1);

            cpg1.setVisible(true);
            ng1.setVisible(true);
            tvg1.setVisible(true);
            mvg1.setVisible(true);


        }
        if (tpg1.getValue().equals("Vb. No Pers.")) {
            caperg1.clear();
            caperg1.add("Nominat.");
            caperg1.add("Acusat.");
            caperg1.add("Genitivo");
            caperg1.add("Dativo");
            caperg1.add("Ablativo");
            items.removeAll();
            items = FXCollections.observableList(caperg1);
            cpg1.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg1.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng1.setItems(items);
            tiempo.clear();
            tiempo.add("Inf_Pr_A");
            tiempo.add("Inf_Pr_P");
            tiempo.add("Inf_Perf_A");
            tiempo.add("Inf_Perf_P");
            tiempo.add("Inf_Fut_A");
            tiempo.add("Inf_Fut_P");
            tiempo.add("Part_Pr_A");
            tiempo.add("Part_Perf_P");
            tiempo.add("Part_Fut_A");
            tiempo.add("Gerundio");
            tiempo.add("Gerundivo");
            tiempo.add("Supino");
            items = FXCollections.observableList(tiempo);
            tvg1.setItems(items);
            items.removeAll();

            cpg1.setVisible(true);
            ng1.setVisible(true);
            tvg1.setVisible(true);
            gg1.setVisible(true);
        }
        if (tpg1.getValue().equals("Adverbio") ||
                tpg1.getValue().equals("Conj_Coor.") ||
                tpg1.getValue().equals("Conj_Sub.") ||
                tpg1.getValue().equals("Preposición") ||
                tpg1.getValue().equals("")) {
            items.removeAll();
            items = FXCollections.observableList(limpieza);
            cpg1.setItems(items);
            ng1.setItems(items);
            gg1.setItems(items);
            tvg1.setItems(items);
            mvg1.setItems(items);
        }
    }
    public void sensorG2() {
        ocultarcombo2();
        if (tpg2.getValue().equals("Sust.") ||
                tpg2.getValue().equals("Adj.") ||
                tpg2.getValue().equals("Adj. Sust.") ||
                tpg2.getValue().equals("Pron.") ||
                tpg2.getValue().equals("Pron. Rel.")) {
            caperg2.clear();
            caperg2.add("Nominat.");
            caperg2.add("Acusat.");
            caperg2.add("Genitivo");
            caperg2.add("Dativo");
            caperg2.add("Ablativo");
            caperg2.add("Locativo");
            items.removeAll();
            items = FXCollections.observableList(caperg2);
            cpg2.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg2.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng2.setItems(items);

            cpg2.setVisible(true);
            gg2.setVisible(true);
            ng2.setVisible(true);

        } if (tpg2.getValue().equals("Vb. Pers.")) {
            caperg2.clear();
            caperg2.add("1ª Persona");
            caperg2.add("2ª Persona");
            caperg2.add("3ª Persona");
            items.removeAll();
            items = FXCollections.observableList(caperg2);
            cpg2.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng2.setItems(items);
            tiempo.clear();
            tiempo.add("Pres.");
            tiempo.add("Pr. Imp.");
            tiempo.add("Pr. Perf");
            tiempo.add("Pr. Plus.");
            tiempo.add("Fut. Imp.");
            tiempo.add("Fut. Perf.");
            items.removeAll();
            items = FXCollections.observableList(tiempo);
            tvg2.setItems(items);
            items.removeAll();
            insMV(mvg2);

            cpg2.setVisible(true);
            ng2.setVisible(true);
            tvg2.setVisible(true);
            mvg2.setVisible(true);
        }
        if (tpg2.getValue().equals("Vb. No Pers.")) {
            caperg2.clear();
            caperg2.add("Nominat.");
            caperg2.add("Acusat.");
            caperg2.add("Genitivo");
            caperg2.add("Dativo");
            caperg2.add("Ablativo");
            items.removeAll();
            items = FXCollections.observableList(caperg2);
            cpg2.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg2.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng2.setItems(items);
            tiempo.clear();
            tiempo.add("Inf_Pr_A");
            tiempo.add("Inf_Pr_P");
            tiempo.add("Inf_Perf_A");
            tiempo.add("Inf_Perf_P");
            tiempo.add("Inf_Fut_A");
            tiempo.add("Inf_Fut_P");
            tiempo.add("Part_Pr_A");
            tiempo.add("Part_Perf_P");
            tiempo.add("Part_Fut_A");
            tiempo.add("Gerundio");
            tiempo.add("Gerundivo");
            tiempo.add("Supino");
            items = FXCollections.observableList(tiempo);
            tvg2.setItems(items);
            items.removeAll();

            cpg2.setVisible(true);
            ng2.setVisible(true);
            tvg2.setVisible(true);
            gg2.setVisible(true);
        }
        if (tpg2.getValue().equals("Adverbio") ||
                tpg2.getValue().equals("Conj_Coor.") ||
                tpg2.getValue().equals("Conj_Sub.") ||
                tpg2.getValue().equals("Preposición") ||
                tpg2.getValue().equals("")) {
            items.removeAll();
            items = FXCollections.observableList(limpieza);
            cpg2.setItems(items);
            ng2.setItems(items);
            gg2.setItems(items);
            tvg2.setItems(items);
            mvg2.setItems(items);

        }
    }
    public void sensorG3() {
        ocultarcombo3();
        if (tpg3.getValue().equals("Sust.") ||
                tpg3.getValue().equals("Adj.") ||
                tpg3.getValue().equals("Adj. Sust.") ||
                tpg3.getValue().equals("Pron.") ||
                tpg3.getValue().equals("Pron. Rel.")) {
            caperg3.clear();
            caperg3.add("Nominat.");
            caperg3.add("Acusat.");
            caperg3.add("Genitivo");
            caperg3.add("Dativo");
            caperg3.add("Ablativo");
            caperg3.add("Locativo");
            items.removeAll();
            items = FXCollections.observableList(caperg3);
            cpg3.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg3.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng3.setItems(items);

            cpg3.setVisible(true);
            gg3.setVisible(true);
            ng3.setVisible(true);

        } if (tpg3.getValue().equals("Vb. Pers.")) {
            caperg3.clear();
            caperg3.add("1ª Persona");
            caperg3.add("2ª Persona");
            caperg3.add("3ª Persona");
            items.removeAll();
            items = FXCollections.observableList(caperg3);
            cpg3.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng3.setItems(items);
            tiempo.clear();
            tiempo.add("Pres.");
            tiempo.add("Pr. Imp.");
            tiempo.add("Pr. Perf");
            tiempo.add("Pr. Plus.");
            tiempo.add("Fut. Imp.");
            tiempo.add("Fut. Perf.");
            items.removeAll();
            items = FXCollections.observableList(tiempo);
            tvg3.setItems(items);
            items.removeAll();
            insMV(mvg3);

            cpg3.setVisible(true);
            ng3.setVisible(true);
            tvg3.setVisible(true);
            mvg3.setVisible(true);
        }
        if (tpg3.getValue().equals("Vb. No Pers.")) {
            caperg3.clear();
            caperg3.add("Nominat.");
            caperg3.add("Acusat.");
            caperg3.add("Genitivo");
            caperg3.add("Dativo");
            caperg3.add("Ablativo");
            items.removeAll();
            items = FXCollections.observableList(caperg3);
            cpg3.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg3.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng3.setItems(items);
            tiempo.clear();
            tiempo.add("Inf_Pr_A");
            tiempo.add("Inf_Pr_P");
            tiempo.add("Inf_Perf_A");
            tiempo.add("Inf_Perf_P");
            tiempo.add("Inf_Fut_A");
            tiempo.add("Inf_Fut_P");
            tiempo.add("Part_Pr_A");
            tiempo.add("Part_Perf_P");
            tiempo.add("Part_Fut_A");
            tiempo.add("Gerundio");
            tiempo.add("Gerundivo");
            tiempo.add("Supino");
            items = FXCollections.observableList(tiempo);
            tvg3.setItems(items);
            items.removeAll();

            cpg3.setVisible(true);
            ng3.setVisible(true);
            tvg3.setVisible(true);
            gg3.setVisible(true);


        }
        if (tpg3.getValue().equals("Adverbio") ||
                tpg3.getValue().equals("Conj_Coor.") ||
                tpg3.getValue().equals("Conj_Sub.") ||
                tpg3.getValue().equals("Preposición") ||
                tpg3.getValue().equals("")) {
            items.removeAll();
            items = FXCollections.observableList(limpieza);
            cpg3.setItems(items);
            ng3.setItems(items);
            gg3.setItems(items);
            tvg3.setItems(items);
            mvg3.setItems(items);

        }
    }
    public void sensorG4() {
        ocultarcombo4();
        if (tpg4.getValue().equals("Sust.") ||
                tpg4.getValue().equals("Adj.") ||
                tpg4.getValue().equals("Adj. Sust.") ||
                tpg4.getValue().equals("Pron.") ||
                tpg4.getValue().equals("Pron. Rel.")) {
            caperg4.clear();
            caperg4.add("Nominat.");
            caperg4.add("Acusat.");
            caperg4.add("Genitivo");
            caperg4.add("Dativo");
            caperg4.add("Ablativo");
            caperg4.add("Locativo");
            items.removeAll();
            items = FXCollections.observableList(caperg4);
            cpg4.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg4.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng4.setItems(items);

            cpg4.setVisible(true);
            gg4.setVisible(true);
            ng4.setVisible(true);

        } if (tpg4.getValue().equals("Vb. Pers.")) {
            caperg4.clear();
            caperg4.add("1ª Persona");
            caperg4.add("2ª Persona");
            caperg4.add("3ª Persona");
            items.removeAll();
            items = FXCollections.observableList(caperg4);
            cpg4.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng4.setItems(items);
            tiempo.clear();
            tiempo.add("Pres.");
            tiempo.add("Pr. Imp.");
            tiempo.add("Pr. Perf");
            tiempo.add("Pr. Plus.");
            tiempo.add("Fut. Imp.");
            tiempo.add("Fut. Perf.");
            items.removeAll();
            items = FXCollections.observableList(tiempo);
            tvg4.setItems(items);
            items.removeAll();
            insMV(mvg4);

            cpg4.setVisible(true);
            ng4.setVisible(true);
            tvg4.setVisible(true);
            mvg4.setVisible(true);

        }
        if (tpg4.getValue().equals("Vb. No Pers.")) {
            caperg4.clear();
            caperg4.add("Nominat.");
            caperg4.add("Acusat.");
            caperg4.add("Genitivo");
            caperg4.add("Dativo");
            caperg4.add("Ablativo");
            items.removeAll();
            items = FXCollections.observableList(caperg4);
            cpg4.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg4.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng4.setItems(items);
            tiempo.clear();
            tiempo.add("Inf_Pr_A");
            tiempo.add("Inf_Pr_P");
            tiempo.add("Inf_Perf_A");
            tiempo.add("Inf_Perf_P");
            tiempo.add("Inf_Fut_A");
            tiempo.add("Inf_Fut_P");
            tiempo.add("Part_Pr_A");
            tiempo.add("Part_Perf_P");
            tiempo.add("Part_Fut_A");
            tiempo.add("Gerundio");
            tiempo.add("Gerundivo");
            tiempo.add("Supino");
            items = FXCollections.observableList(tiempo);
            tvg4.setItems(items);
            items.removeAll();

            cpg4.setVisible(true);
            ng4.setVisible(true);
            tvg4.setVisible(true);
            gg4.setVisible(true);
        }
        if (tpg4.getValue().equals("Adverbio") ||
                tpg4.getValue().equals("Conj_Coor.") ||
                tpg4.getValue().equals("Conj_Sub.") ||
                tpg4.getValue().equals("Preposición") ||
                tpg4.getValue().equals("")) {
            items.removeAll();
            items = FXCollections.observableList(limpieza);
            cpg4.setItems(items);
            ng4.setItems(items);
            gg4.setItems(items);
            tvg4.setItems(items);
            mvg4.setItems(items);

        }
    }
    public void sensorG5() {
        ocultarcombo5();
        if (tpg5.getValue().equals("Sust.") ||
                tpg5.getValue().equals("Adj.") ||
                tpg5.getValue().equals("Adj. Sust.") ||
                tpg5.getValue().equals("Pron.") ||
                tpg5.getValue().equals("Pron. Rel.")) {
            caperg5.clear();
            caperg5.add("Nominat.");
            caperg5.add("Acusat.");
            caperg5.add("Genitivo");
            caperg5.add("Dativo");
            caperg5.add("Ablativo");
            caperg5.add("Locativo");
            items.removeAll();
            items = FXCollections.observableList(caperg5);
            cpg5.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg5.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng5.setItems(items);

            cpg5.setVisible(true);
            gg5.setVisible(true);
            ng5.setVisible(true);

        } if (tpg5.getValue().equals("Vb. Pers.")) {
            caperg5.clear();
            caperg5.add("1ª Persona");
            caperg5.add("2ª Persona");
            caperg5.add("3ª Persona");
            items.removeAll();
            items = FXCollections.observableList(caperg5);
            cpg5.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng5.setItems(items);
            tiempo.clear();
            tiempo.add("Pres.");
            tiempo.add("Pr. Imp.");
            tiempo.add("Pr. Perf");
            tiempo.add("Pr. Plus.");
            tiempo.add("Fut. Imp.");
            tiempo.add("Fut. Perf.");
            items.removeAll();
            items = FXCollections.observableList(tiempo);
            tvg5.setItems(items);
            items.removeAll();
            insMV(mvg5);

            cpg5.setVisible(true);
            ng5.setVisible(true);
            tvg5.setVisible(true);
            mvg5.setVisible(true);

        }
        if (tpg5.getValue().equals("Vb. No Pers.")) {
            caperg5.clear();
            caperg5.add("Nominat.");
            caperg5.add("Acusat.");
            caperg5.add("Genitivo");
            caperg5.add("Dativo");
            caperg5.add("Ablativo");
            items.removeAll();
            items = FXCollections.observableList(caperg5);
            cpg5.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg5.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng5.setItems(items);
            tiempo.clear();
            tiempo.add("Inf_Pr_A");
            tiempo.add("Inf_Pr_P");
            tiempo.add("Inf_Perf_A");
            tiempo.add("Inf_Perf_P");
            tiempo.add("Inf_Fut_A");
            tiempo.add("Inf_Fut_P");
            tiempo.add("Part_Pr_A");
            tiempo.add("Part_Perf_P");
            tiempo.add("Part_Fut_A");
            tiempo.add("Gerundio");
            tiempo.add("Gerundivo");
            tiempo.add("Supino");
            items = FXCollections.observableList(tiempo);
            tvg5.setItems(items);
            items.removeAll();

            cpg5.setVisible(true);
            ng5.setVisible(true);
            tvg5.setVisible(true);
            gg5.setVisible(true);
        }
        if (tpg5.getValue().equals("Adverbio") ||
                tpg5.getValue().equals("Conj_Coor.") ||
                tpg5.getValue().equals("Conj_Sub.") ||
                tpg5.getValue().equals("Preposición") ||
                tpg5.getValue().equals("")) {
            items.removeAll();
            items = FXCollections.observableList(limpieza);
            cpg5.setItems(items);
            ng5.setItems(items);
            gg5.setItems(items);
            tvg5.setItems(items);
            mvg5.setItems(items);

        }
    }
    public void sensorG6() {
        ocultarcombo6();
        if (tpg6.getValue().equals("Sust.") ||
                tpg6.getValue().equals("Adj.") ||
                tpg6.getValue().equals("Adj. Sust.") ||
                tpg6.getValue().equals("Pron.") ||
                tpg6.getValue().equals("Pron. Rel.")) {
            caperg6.clear();
            caperg6.add("Nominat.");
            caperg6.add("Acusat.");
            caperg6.add("Genitivo");
            caperg6.add("Dativo");
            caperg6.add("Ablativo");
            caperg6.add("Locativo");
            items.removeAll();
            items = FXCollections.observableList(caperg6);
            cpg6.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg6.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng6.setItems(items);

            cpg6.setVisible(true);
            gg6.setVisible(true);
            ng6.setVisible(true);

        } if (tpg6.getValue().equals("Vb. Pers.")) {
            caperg6.clear();
            caperg6.add("1ª Persona");
            caperg6.add("2ª Persona");
            caperg6.add("3ª Persona");
            items.removeAll();
            items = FXCollections.observableList(caperg6);
            cpg6.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng6.setItems(items);
            tiempo.clear();
            tiempo.add("Pres.");
            tiempo.add("Pr. Imp.");
            tiempo.add("Pr. Perf");
            tiempo.add("Pr. Plus.");
            tiempo.add("Fut. Imp.");
            tiempo.add("Fut. Perf.");
            items.removeAll();
            items = FXCollections.observableList(tiempo);
            tvg6.setItems(items);
            items.removeAll();
            insMV(mvg6);

            cpg6.setVisible(true);
            ng6.setVisible(true);
            tvg6.setVisible(true);
            mvg6.setVisible(true);

        }
        if (tpg6.getValue().equals("Vb. No Pers.")) {
            caperg6.clear();
            caperg6.add("Nominat.");
            caperg6.add("Acusat.");
            caperg6.add("Genitivo");
            caperg6.add("Dativo");
            caperg6.add("Ablativo");
            items.removeAll();
            items = FXCollections.observableList(caperg6);
            cpg6.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg6.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng6.setItems(items);
            tiempo.clear();
            tiempo.add("Inf_Pr_A");
            tiempo.add("Inf_Pr_P");
            tiempo.add("Inf_Perf_A");
            tiempo.add("Inf_Perf_P");
            tiempo.add("Inf_Fut_A");
            tiempo.add("Inf_Fut_P");
            tiempo.add("Part_Pr_A");
            tiempo.add("Part_Perf_P");
            tiempo.add("Part_Fut_A");
            tiempo.add("Gerundio");
            tiempo.add("Gerundivo");
            tiempo.add("Supino");
            items = FXCollections.observableList(tiempo);
            tvg6.setItems(items);
            items.removeAll();

            cpg6.setVisible(true);
            ng6.setVisible(true);
            tvg6.setVisible(true);
            gg6.setVisible(true);
        }
        if (tpg6.getValue().equals("Adverbio") ||
                tpg6.getValue().equals("Conj_Coor.") ||
                tpg6.getValue().equals("Conj_Sub.") ||
                tpg6.getValue().equals("Preposición") ||
                tpg6.getValue().equals("")) {
            items.removeAll();
            items = FXCollections.observableList(limpieza);
            cpg6.setItems(items);
            ng6.setItems(items);
            gg6.setItems(items);
            tvg6.setItems(items);
            mvg6.setItems(items);

        }
    }
    public void sensorG7() {
        ocultarcombo7();
        if (tpg7.getValue().equals("Sust.") ||
                tpg7.getValue().equals("Adj.") ||
                tpg7.getValue().equals("Adj. Sust.") ||
                tpg7.getValue().equals("Pron.") ||
                tpg7.getValue().equals("Pron. Rel.")) {
            caperg7.clear();
            caperg7.add("Nominat.");
            caperg7.add("Acusat.");
            caperg7.add("Genitivo");
            caperg7.add("Dativo");
            caperg7.add("Ablativo");
            caperg7.add("Locativo");
            items.removeAll();
            items = FXCollections.observableList(caperg7);
            cpg7.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg7.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng7.setItems(items);

            cpg7.setVisible(true);
            gg7.setVisible(true);
            ng7.setVisible(true);

        } if (tpg7.getValue().equals("Vb. Pers.")) {
            caperg7.clear();
            caperg7.add("1ª Persona");
            caperg7.add("2ª Persona");
            caperg7.add("3ª Persona");
            items.removeAll();
            items = FXCollections.observableList(caperg7);
            cpg7.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng7.setItems(items);
            tiempo.clear();
            tiempo.add("Pres.");
            tiempo.add("Pr. Imp.");
            tiempo.add("Pr. Perf");
            tiempo.add("Pr. Plus.");
            tiempo.add("Fut. Imp.");
            tiempo.add("Fut. Perf.");
            items.removeAll();
            items = FXCollections.observableList(tiempo);
            tvg7.setItems(items);
            items.removeAll();
            insMV(mvg7);

            cpg7.setVisible(true);
            ng7.setVisible(true);
            tvg7.setVisible(true);
            mvg7.setVisible(true);

        }
        if (tpg7.getValue().equals("Vb. No Pers.")) {
            caperg7.clear();
            caperg7.add("Nominat.");
            caperg7.add("Acusat.");
            caperg7.add("Genitivo");
            caperg7.add("Dativo");
            caperg7.add("Ablativo");
            items.removeAll();
            items = FXCollections.observableList(caperg7);
            cpg7.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg7.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng7.setItems(items);
            tiempo.clear();
            tiempo.add("Inf_Pr_A");
            tiempo.add("Inf_Pr_P");
            tiempo.add("Inf_Perf_A");
            tiempo.add("Inf_Perf_P");
            tiempo.add("Inf_Fut_A");
            tiempo.add("Inf_Fut_P");
            tiempo.add("Part_Pr_A");
            tiempo.add("Part_Perf_P");
            tiempo.add("Part_Fut_A");
            tiempo.add("Gerundio");
            tiempo.add("Gerundivo");
            tiempo.add("Supino");
            items = FXCollections.observableList(tiempo);
            tvg7.setItems(items);
            items.removeAll();

            cpg7.setVisible(true);
            ng7.setVisible(true);
            tvg7.setVisible(true);
            gg7.setVisible(true);
        }
        if (tpg7.getValue().equals("Adverbio") ||
                tpg7.getValue().equals("Conj_Coor.") ||
                tpg7.getValue().equals("Conj_Sub.") ||
                tpg7.getValue().equals("Preposición") ||
                tpg7.getValue().equals("")) {
            items.removeAll();
            items = FXCollections.observableList(limpieza);
            cpg7.setItems(items);
            ng7.setItems(items);
            gg7.setItems(items);
            tvg7.setItems(items);
            mvg7.setItems(items);

        }
    }
    public void sensorG8() {
        ocultarcombo8();
        if (tpg8.getValue().equals("Sust.") ||
                tpg8.getValue().equals("Adj.") ||
                tpg8.getValue().equals("Adj. Sust.") ||
                tpg8.getValue().equals("Pron.") ||
                tpg8.getValue().equals("Pron. Rel.")) {
            caperg8.clear();
            caperg8.add("Nominat.");
            caperg8.add("Acusat.");
            caperg8.add("Genitivo");
            caperg8.add("Dativo");
            caperg8.add("Ablativo");
            caperg8.add("Locativo");
            items.removeAll();
            items = FXCollections.observableList(caperg8);
            cpg8.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg8.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng8.setItems(items);

            cpg8.setVisible(true);
            gg8.setVisible(true);
            ng8.setVisible(true);

        } if (tpg8.getValue().equals("Vb. Pers.")) {
            caperg8.clear();
            caperg8.add("1ª Persona");
            caperg8.add("2ª Persona");
            caperg8.add("3ª Persona");
            items.removeAll();
            items = FXCollections.observableList(caperg8);
            cpg8.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng8.setItems(items);
            tiempo.clear();
            tiempo.add("Pres.");
            tiempo.add("Pr. Imp.");
            tiempo.add("Pr. Perf");
            tiempo.add("Pr. Plus.");
            tiempo.add("Fut. Imp.");
            tiempo.add("Fut. Perf.");
            items.removeAll();
            items = FXCollections.observableList(tiempo);
            tvg8.setItems(items);
            items.removeAll();
            insMV(mvg8);

            cpg8.setVisible(true);
            ng8.setVisible(true);
            tvg8.setVisible(true);
            mvg8.setVisible(true);
        }
        if (tpg8.getValue().equals("Vb. No Pers.")) {
            caperg8.clear();
            caperg8.add("Nominat.");
            caperg8.add("Acusat.");
            caperg8.add("Genitivo");
            caperg8.add("Dativo");
            caperg8.add("Ablativo");
            items.removeAll();
            items = FXCollections.observableList(caperg8);
            cpg8.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg8.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng8.setItems(items);
            tiempo.clear();
            tiempo.add("Inf_Pr_A");
            tiempo.add("Inf_Pr_P");
            tiempo.add("Inf_Perf_A");
            tiempo.add("Inf_Perf_P");
            tiempo.add("Inf_Fut_A");
            tiempo.add("Inf_Fut_P");
            tiempo.add("Part_Pr_A");
            tiempo.add("Part_Perf_P");
            tiempo.add("Part_Fut_A");
            tiempo.add("Gerundio");
            tiempo.add("Gerundivo");
            tiempo.add("Supino");
            items = FXCollections.observableList(tiempo);
            tvg8.setItems(items);
            items.removeAll();

            cpg8.setVisible(true);
            ng8.setVisible(true);
            tvg8.setVisible(true);
            gg8.setVisible(true);
        }
        if (tpg8.getValue().equals("Adverbio") ||
                tpg8.getValue().equals("Conj_Coor.") ||
                tpg8.getValue().equals("Conj_Sub.") ||
                tpg8.getValue().equals("Preposición") ||
                tpg8.getValue().equals("")) {
            items.removeAll();
            items = FXCollections.observableList(limpieza);
            cpg8.setItems(items);
            ng8.setItems(items);
            gg8.setItems(items);
            tvg8.setItems(items);
            mvg8.setItems(items);

        }
    }
    public void sensorG9() {
        ocultarcombo9();
        if (tpg9.getValue().equals("Sust.") ||
                tpg9.getValue().equals("Adj.") ||
                tpg9.getValue().equals("Adj. Sust.") ||
                tpg9.getValue().equals("Pron.") ||
                tpg9.getValue().equals("Pron. Rel.")) {
            caperg9.clear();
            caperg9.add("Nominat.");
            caperg9.add("Acusat.");
            caperg9.add("Genitivo");
            caperg9.add("Dativo");
            caperg9.add("Ablativo");
            caperg9.add("Locativo");
            items.removeAll();
            items = FXCollections.observableList(caperg9);
            cpg9.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg9.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng9.setItems(items);

            cpg9.setVisible(true);
            gg9.setVisible(true);
            ng9.setVisible(true);

        } if (tpg9.getValue().equals("Vb. Pers.")) {
            caperg9.clear();
            caperg9.add("1ª Persona");
            caperg9.add("2ª Persona");
            caperg9.add("3ª Persona");
            items.removeAll();
            items = FXCollections.observableList(caperg9);
            cpg9.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng9.setItems(items);
            tiempo.clear();
            tiempo.add("Pres.");
            tiempo.add("Pr. Imp.");
            tiempo.add("Pr. Perf");
            tiempo.add("Pr. Plus.");
            tiempo.add("Fut. Imp.");
            tiempo.add("Fut. Perf.");
            items.removeAll();
            items = FXCollections.observableList(tiempo);
            tvg9.setItems(items);
            items.removeAll();
            insMV(mvg9);

            cpg9.setVisible(true);
            ng9.setVisible(true);
            tvg9.setVisible(true);
            mvg9.setVisible(true);

        }
        if (tpg9.getValue().equals("Vb. No Pers.")) {
            caperg9.clear();
            caperg9.add("Nominat.");
            caperg9.add("Acusat.");
            caperg9.add("Genitivo");
            caperg9.add("Dativo");
            caperg9.add("Ablativo");
            items.removeAll();
            items = FXCollections.observableList(caperg9);
            cpg9.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg9.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng9.setItems(items);
            tiempo.clear();
            tiempo.add("Inf_Pr_A");
            tiempo.add("Inf_Pr_P");
            tiempo.add("Inf_Perf_A");
            tiempo.add("Inf_Perf_P");
            tiempo.add("Inf_Fut_A");
            tiempo.add("Inf_Fut_P");
            tiempo.add("Part_Pr_A");
            tiempo.add("Part_Perf_P");
            tiempo.add("Part_Fut_A");
            tiempo.add("Gerundio");
            tiempo.add("Gerundivo");
            tiempo.add("Supino");
            items = FXCollections.observableList(tiempo);
            tvg9.setItems(items);
            items.removeAll();

            cpg9.setVisible(true);
            ng9.setVisible(true);
            tvg9.setVisible(true);
            gg9.setVisible(true);
        }
        if (tpg9.getValue().equals("Adverbio") ||
                tpg9.getValue().equals("Conj_Coor.") ||
                tpg9.getValue().equals("Conj_Sub.") ||
                tpg9.getValue().equals("Preposición") ||
                tpg9.getValue().equals("")) {
            items.removeAll();
            items = FXCollections.observableList(limpieza);
            cpg9.setItems(items);
            ng9.setItems(items);
            gg9.setItems(items);
            tvg9.setItems(items);
            mvg9.setItems(items);

        }
    }
    public void sensorG10() {
        ocultarcombo10();
        if (tpg10.getValue().equals("Sust.") ||
                tpg10.getValue().equals("Adj.") ||
                tpg10.getValue().equals("Adj. Sust.") ||
                tpg10.getValue().equals("Pron.") ||
                tpg10.getValue().equals("Pron. Rel.")) {
            caperg10.clear();
            caperg10.add("Nominat.");
            caperg10.add("Acusat.");
            caperg10.add("Genitivo");
            caperg10.add("Dativo");
            caperg10.add("Ablativo");
            caperg10.add("Locativo");
            items.removeAll();
            items = FXCollections.observableList(caperg10);
            cpg10.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg10.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng10.setItems(items);

            cpg10.setVisible(true);
            gg10.setVisible(true);
            ng10.setVisible(true);

        } if (tpg10.getValue().equals("Vb. Pers.")) {
            caperg10.clear();
            caperg10.add("1ª Persona");
            caperg10.add("2ª Persona");
            caperg10.add("3ª Persona");
            items.removeAll();
            items = FXCollections.observableList(caperg10);
            cpg10.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng10.setItems(items);
            tiempo.clear();
            tiempo.add("Pres.");
            tiempo.add("Pr. Imp.");
            tiempo.add("Pr. Perf");
            tiempo.add("Pr. Plus.");
            tiempo.add("Fut. Imp.");
            tiempo.add("Fut. Perf.");
            items.removeAll();
            items = FXCollections.observableList(tiempo);
            tvg10.setItems(items);
            items.removeAll();
            insMV(mvg10);

            cpg10.setVisible(true);
            ng10.setVisible(true);
            tvg10.setVisible(true);
            mvg10.setVisible(true);

        }
        if (tpg10.getValue().equals("Vb. No Pers.")) {
            caperg10.clear();
            caperg10.add("Nominat.");
            caperg10.add("Acusat.");
            caperg10.add("Genitivo");
            caperg10.add("Dativo");
            caperg10.add("Ablativo");
            items.removeAll();
            items = FXCollections.observableList(caperg10);
            cpg10.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg10.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng10.setItems(items);
            tiempo.clear();
            tiempo.add("Inf_Pr_A");
            tiempo.add("Inf_Pr_P");
            tiempo.add("Inf_Perf_A");
            tiempo.add("Inf_Perf_P");
            tiempo.add("Inf_Fut_A");
            tiempo.add("Inf_Fut_P");
            tiempo.add("Part_Pr_A");
            tiempo.add("Part_Perf_P");
            tiempo.add("Part_Fut_A");
            tiempo.add("Gerundio");
            tiempo.add("Gerundivo");
            tiempo.add("Supino");
            items = FXCollections.observableList(tiempo);
            tvg10.setItems(items);
            items.removeAll();

            cpg10.setVisible(true);
            ng10.setVisible(true);
            tvg10.setVisible(true);
            gg10.setVisible(true);
        }
        if (tpg10.getValue().equals("Adverbio") ||
                tpg10.getValue().equals("Conj_Coor.") ||
                tpg10.getValue().equals("Conj_Sub.") ||
                tpg10.getValue().equals("Preposición") ||
                tpg10.getValue().equals("")) {
            items.removeAll();
            items = FXCollections.observableList(limpieza);
            cpg10.setItems(items);
            ng10.setItems(items);
            gg10.setItems(items);
            tvg10.setItems(items);
            mvg10.setItems(items);

        }
    }
    public void sensorG11() {
        ocultarcombo11();
        if (tpg11.getValue().equals("Sust.") ||
                tpg11.getValue().equals("Adj.") ||
                tpg11.getValue().equals("Adj. Sust.") ||
                tpg11.getValue().equals("Pron.") ||
                tpg11.getValue().equals("Pron. Rel.")) {
            caperg11.clear();
            caperg11.add("Nominat.");
            caperg11.add("Acusat.");
            caperg11.add("Genitivo");
            caperg11.add("Dativo");
            caperg11.add("Ablativo");
            caperg11.add("Locativo");
            items.removeAll();
            items = FXCollections.observableList(caperg11);
            cpg11.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg11.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng11.setItems(items);

            cpg11.setVisible(true);
            gg11.setVisible(true);
            ng11.setVisible(true);
        } if (tpg11.getValue().equals("Vb. Pers.")) {
            caperg11.clear();
            caperg11.add("1ª Persona");
            caperg11.add("2ª Persona");
            caperg11.add("3ª Persona");
            items.removeAll();
            items = FXCollections.observableList(caperg11);
            cpg11.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng11.setItems(items);
            tiempo.clear();
            tiempo.add("Pres.");
            tiempo.add("Pr. Imp.");
            tiempo.add("Pr. Perf");
            tiempo.add("Pr. Plus.");
            tiempo.add("Fut. Imp.");
            tiempo.add("Fut. Perf.");
            items.removeAll();
            items = FXCollections.observableList(tiempo);
            tvg11.setItems(items);
            items.removeAll();
            insMV(mvg1);

            cpg11.setVisible(true);
            ng11.setVisible(true);
            tvg11.setVisible(true);
            mvg11.setVisible(true);
        }
        if (tpg11.getValue().equals("Vb. No Pers.")) {
            caperg11.clear();
            caperg11.add("Nominat.");
            caperg11.add("Acusat.");
            caperg11.add("Genitivo");
            caperg11.add("Dativo");
            caperg11.add("Ablativo");
            items.removeAll();
            items = FXCollections.observableList(caperg11);
            cpg11.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(genero);
            gg11.setItems(items);
            items.removeAll();
            items = FXCollections.observableList(numero);
            ng11.setItems(items);
            tiempo.clear();
            tiempo.add("Inf_Pr_A");
            tiempo.add("Inf_Pr_P");
            tiempo.add("Inf_Perf_A");
            tiempo.add("Inf_Perf_P");
            tiempo.add("Inf_Fut_A");
            tiempo.add("Inf_Fut_P");
            tiempo.add("Part_Pr_A");
            tiempo.add("Part_Perf_P");
            tiempo.add("Part_Fut_A");
            tiempo.add("Gerundio");
            tiempo.add("Gerundivo");
            tiempo.add("Supino");
            items = FXCollections.observableList(tiempo);
            tvg11.setItems(items);
            items.removeAll();

            cpg11.setVisible(true);
            ng11.setVisible(true);
            tvg11.setVisible(true);
            gg11.setVisible(true);
        }
        if (tpg11.getValue().equals("Adverbio") ||
                tpg11.getValue().equals("Conj_Coor.") ||
                tpg11.getValue().equals("Conj_Sub.") ||
                tpg11.getValue().equals("Preposición") ||
                tpg11.getValue().equals("")) {
            items.removeAll();
            items = FXCollections.observableList(limpieza);
            cpg11.setItems(items);
            ng11.setItems(items);
            gg11.setItems(items);
            tvg11.setItems(items);
            mvg11.setItems(items);

        }
    }
    public void ocultarcombo1() {
        cpg1.setVisible(false);
        ng1.setVisible(false);
        tvg1.setVisible(false);
        gg1.setVisible(false);
        mvg1.setVisible(false);
    }
    public void ocultarcombo2() {
        cpg2.setVisible(false);
        ng2.setVisible(false);
        tvg2.setVisible(false);
        gg2.setVisible(false);
        mvg2.setVisible(false);
    }
    public void ocultarcombo3() {
        cpg3.setVisible(false);
        ng3.setVisible(false);
        tvg3.setVisible(false);
        gg3.setVisible(false);
        mvg3.setVisible(false);
    }
    public void ocultarcombo4() {
        cpg4.setVisible(false);
        ng4.setVisible(false);
        tvg4.setVisible(false);
        gg4.setVisible(false);
        mvg4.setVisible(false);
    }
    public void ocultarcombo5() {
        cpg5.setVisible(false);
        ng5.setVisible(false);
        tvg5.setVisible(false);
        gg5.setVisible(false);
        mvg5.setVisible(false);
    }
    public void ocultarcombo6() {
        cpg6.setVisible(false);
        ng6.setVisible(false);
        tvg6.setVisible(false);
        gg6.setVisible(false);
        mvg6.setVisible(false);
    }
    public void ocultarcombo7() {
        cpg7.setVisible(false);
        ng7.setVisible(false);
        tvg7.setVisible(false);
        gg7.setVisible(false);
        mvg7.setVisible(false);
    }
    public void ocultarcombo8() {
        cpg8.setVisible(false);
        ng8.setVisible(false);
        tvg8.setVisible(false);
        gg8.setVisible(false);
        mvg8.setVisible(false);
    }
    public void ocultarcombo9() {
        cpg9.setVisible(false);
        ng9.setVisible(false);
        tvg9.setVisible(false);
        gg9.setVisible(false);
        mvg9.setVisible(false);
    }
    public void ocultarcombo10() {
        cpg10.setVisible(false);
        ng10.setVisible(false);
        tvg10.setVisible(false);
        gg10.setVisible(false);
        mvg10.setVisible(false);
    }
    public void ocultarcombo11() {
        cpg11.setVisible(false);
        ng11.setVisible(false);
        tvg11.setVisible(false);
        gg11.setVisible(false);
        mvg11.setVisible(false);
    }
    public void insMV(ComboBox<String> cbbx) {
        modovoz.clear();
        modovoz.add("Ind. A.");
        modovoz.add("Ind. P.");
        modovoz.add("Sub. A.");
        modovoz.add("Sub. P.");
        items.removeAll();
        items = FXCollections.observableList(modovoz);
        cbbx.setItems(items);
    }

    // **************************************************************************
    public void setVariable(String cuerpotexto, String id) throws IOException {

        String dir = System.getProperty("user.home")+"/Lexilogos";
        String nombreArchivo = "texto" + id + ".xlsx";

        File archivo = new File(dir, nombreArchivo);
        ra = dir+"/"+nombreArchivo;
        String[] palabras2 = cuerpotexto.split("\\.\\s+|; ");
        for (String s : palabras2) {
            if (!superaLimitePalabras(s)) {
                comboselectfrase.getItems().add(s);
            } else {
                String[] todasLasFrases = maximopalabras(s);
                for (String unaFrase : todasLasFrases) {
                    comboselectfrase.getItems().add(unaFrase);
                }
            }
        }
        construyeExcel(archivo,dir);
        comboselectfrase.setValue(comboselectfrase.getItems().get(0));
        String[] palabras = comboselectfrase.getValue().split("\\s+");  // Separar por espacio en blanco

        tfpalabra0.setText(palabras.length > 0 ? palabras[0] : "");
        tfpalabra1.setText(palabras.length > 1 ? palabras[1] : "");
        tfpalabra2.setText(palabras.length > 2 ? palabras[2] : "");
        tfpalabra3.setText(palabras.length > 3 ? palabras[3] : "");
        tfpalabra4.setText(palabras.length > 4 ? palabras[4] : "");
        tfpalabra5.setText(palabras.length > 5 ? palabras[5] : "");
        tfpalabra6.setText(palabras.length > 6 ? palabras[6] : "");
        tfpalabra7.setText(palabras.length > 7 ? palabras[7] : "");
        tfpalabra8.setText(palabras.length > 8 ? palabras[8] : "");
        tfpalabra9.setText(palabras.length > 9 ? palabras[9] : "");
        tfpalabra10.setText(palabras.length > 10 ? palabras[10] : "");

        cargaExcel();
        sensorG1();
        sensorG2();
        sensorG3();
        sensorG4();
        sensorG5();
        sensorG6();
        sensorG7();
        sensorG8();
        sensorG9();
        sensorG10();
        sensorG11();
    }
    private String[] maximopalabras(String frase) {
        String[] palabras = frase.split("\\s+"); // Dividir la frase en palabras
        List<String> frases = new ArrayList<>();

        StringBuilder fraseActual = new StringBuilder();
        int contador = 0;

        for (String palabra : palabras) {
            fraseActual.append(palabra).append(" ");
            contador++;

            if (contador >= 11) {
                frases.add(fraseActual.toString().trim());
                fraseActual = new StringBuilder();
                contador = 0;
            }
        }

        if (fraseActual.length() > 0) {
            frases.add(fraseActual.toString().trim());
        }

        return frases.toArray(new String[0]);
    }
    public boolean superaLimitePalabras(String palabras) {
        String[] palabrasnew = palabras.split("\\s+");
        return palabrasnew.length > 11;
    }

    // ************************************************************

    @FXML
    private void autosave() {
        int index = comboselectfrase.getSelectionModel().getSelectedIndex();
        int idr = index * 18;
        for (int i = 0; i < numcl; i += 18) {
            fila.getSheet().getRow(i).getCell(0).setCellValue("Enclíticas");
            fila.getSheet().getRow(i + 1).getCell(0).setCellValue("[Coor.](Sub.)");
            fila.getSheet().getRow(i + 2).getCell(0).setCellValue("Oración");
            fila.getSheet().getRow(i + 3).getCell(0).setCellValue("Tipo palabra");
            fila.getSheet().getRow(i + 4).getCell(0).setCellValue("Caso/Persona");
            fila.getSheet().getRow(i + 5).getCell(0).setCellValue("Número");
            fila.getSheet().getRow(i + 6).getCell(0).setCellValue("Genero");
            fila.getSheet().getRow(i + 7).getCell(0).setCellValue("Tiempo Vb");
            fila.getSheet().getRow(i + 8).getCell(0).setCellValue("Modo/Voz");
            fila.getSheet().getRow(i + 9).getCell(0).setCellValue("Significado Palabra");
            fila.getSheet().getRow(i + 10).getCell(0).setCellValue("1er nivel sintáctico");
            fila.getSheet().getRow(i + 11).getCell(0).setCellValue("2º nivel sintáctico");
            fila.getSheet().getRow(i + 12).getCell(0).setCellValue("3º nivel sintáctico");
            fila.getSheet().getRow(i + 13).getCell(0).setCellValue("4º nivel sintáctico");
            fila.getSheet().getRow(i + 14).getCell(0).setCellValue("5º nivel sintáctico");
            fila.getSheet().getRow(i + 15).getCell(0).setCellValue("Traducción");
            fila.getSheet().getRow(i + 16).getCell(0).setCellValue("Realizado por");
            fila.getSheet().getRow(i + 17).getCell(0).setCellValue("");
        }

        //Encliticas, coord y subord
        fila.getSheet().getRow(idr).getCell(1).setCellValue(enc1.getValue());
        fila.getSheet().getRow(idr).getCell(2).setCellValue(enc2.getValue());
        fila.getSheet().getRow(idr).getCell(3).setCellValue(enc3.getValue());
        fila.getSheet().getRow(idr).getCell(4).setCellValue(enc4.getValue());
        fila.getSheet().getRow(idr).getCell(5).setCellValue(enc5.getValue());
        fila.getSheet().getRow(idr).getCell(6).setCellValue(enc6.getValue());
        fila.getSheet().getRow(idr).getCell(7).setCellValue(enc7.getValue());
        fila.getSheet().getRow(idr).getCell(8).setCellValue(enc8.getValue());
        fila.getSheet().getRow(idr).getCell(9).setCellValue(enc9.getValue());
        fila.getSheet().getRow(idr).getCell(10).setCellValue(enc10.getValue());
        fila.getSheet().getRow(idr).getCell(11).setCellValue(enc11.getValue());

        fila.getSheet().getRow(idr + 1).getCell(1).setCellValue(cs1.getValue());
        fila.getSheet().getRow(idr + 1).getCell(2).setCellValue(cs2.getValue());
        fila.getSheet().getRow(idr + 1).getCell(3).setCellValue(cs3.getValue());
        fila.getSheet().getRow(idr + 1).getCell(4).setCellValue(cs4.getValue());
        fila.getSheet().getRow(idr + 1).getCell(5).setCellValue(cs5.getValue());
        fila.getSheet().getRow(idr + 1).getCell(6).setCellValue(cs6.getValue());
        fila.getSheet().getRow(idr + 1).getCell(7).setCellValue(cs7.getValue());
        fila.getSheet().getRow(idr + 1).getCell(8).setCellValue(cs8.getValue());
        fila.getSheet().getRow(idr + 1).getCell(9).setCellValue(cs9.getValue());
        fila.getSheet().getRow(idr + 1).getCell(10).setCellValue(cs10.getValue());
        fila.getSheet().getRow(idr + 1).getCell(11).setCellValue(cs11.getValue());

        //Palabras
        fila.getSheet().getRow(idr + 2).getCell(1).setCellValue(tfpalabra0.getText());
        fila.getSheet().getRow(idr + 2).getCell(2).setCellValue(tfpalabra1.getText());
        fila.getSheet().getRow(idr + 2).getCell(3).setCellValue(tfpalabra2.getText());
        fila.getSheet().getRow(idr + 2).getCell(4).setCellValue(tfpalabra3.getText());
        fila.getSheet().getRow(idr + 2).getCell(5).setCellValue(tfpalabra4.getText());
        fila.getSheet().getRow(idr + 2).getCell(6).setCellValue(tfpalabra5.getText());
        fila.getSheet().getRow(idr + 2).getCell(7).setCellValue(tfpalabra6.getText());
        fila.getSheet().getRow(idr + 2).getCell(8).setCellValue(tfpalabra7.getText());
        fila.getSheet().getRow(idr + 2).getCell(9).setCellValue(tfpalabra8.getText());
        fila.getSheet().getRow(idr + 2).getCell(10).setCellValue(tfpalabra9.getText());
        fila.getSheet().getRow(idr + 2).getCell(11).setCellValue(tfpalabra10.getText());

        fila.getSheet().getRow(idr + 3).getCell(1).setCellValue(tpg1.getValue());
        fila.getSheet().getRow(idr + 3).getCell(2).setCellValue(tpg2.getValue());
        fila.getSheet().getRow(idr + 3).getCell(3).setCellValue(tpg3.getValue());
        fila.getSheet().getRow(idr + 3).getCell(4).setCellValue(tpg4.getValue());
        fila.getSheet().getRow(idr + 3).getCell(5).setCellValue(tpg5.getValue());
        fila.getSheet().getRow(idr + 3).getCell(6).setCellValue(tpg6.getValue());
        fila.getSheet().getRow(idr + 3).getCell(7).setCellValue(tpg7.getValue());
        fila.getSheet().getRow(idr + 3).getCell(8).setCellValue(tpg8.getValue());
        fila.getSheet().getRow(idr + 3).getCell(9).setCellValue(tpg9.getValue());
        fila.getSheet().getRow(idr + 3).getCell(10).setCellValue(tpg10.getValue());
        fila.getSheet().getRow(idr + 3).getCell(11).setCellValue(tpg11.getValue());

        fila.getSheet().getRow(idr + 4).getCell(1).setCellValue(cpg1.getValue());
        fila.getSheet().getRow(idr + 4).getCell(2).setCellValue(cpg2.getValue());
        fila.getSheet().getRow(idr + 4).getCell(3).setCellValue(cpg3.getValue());
        fila.getSheet().getRow(idr + 4).getCell(4).setCellValue(cpg4.getValue());
        fila.getSheet().getRow(idr + 4).getCell(5).setCellValue(cpg5.getValue());
        fila.getSheet().getRow(idr + 4).getCell(6).setCellValue(cpg6.getValue());
        fila.getSheet().getRow(idr + 4).getCell(7).setCellValue(cpg7.getValue());
        fila.getSheet().getRow(idr + 4).getCell(8).setCellValue(cpg8.getValue());
        fila.getSheet().getRow(idr + 4).getCell(9).setCellValue(cpg9.getValue());
        fila.getSheet().getRow(idr + 4).getCell(10).setCellValue(cpg10.getValue());
        fila.getSheet().getRow(idr + 4).getCell(11).setCellValue(cpg11.getValue());

        fila.getSheet().getRow(idr + 5).getCell(1).setCellValue(ng1.getValue());
        fila.getSheet().getRow(idr + 5).getCell(2).setCellValue(ng2.getValue());
        fila.getSheet().getRow(idr + 5).getCell(3).setCellValue(ng3.getValue());
        fila.getSheet().getRow(idr + 5).getCell(4).setCellValue(ng4.getValue());
        fila.getSheet().getRow(idr + 5).getCell(5).setCellValue(ng5.getValue());
        fila.getSheet().getRow(idr + 5).getCell(6).setCellValue(ng6.getValue());
        fila.getSheet().getRow(idr + 5).getCell(7).setCellValue(ng7.getValue());
        fila.getSheet().getRow(idr + 5).getCell(8).setCellValue(ng8.getValue());
        fila.getSheet().getRow(idr + 5).getCell(9).setCellValue(ng9.getValue());
        fila.getSheet().getRow(idr + 5).getCell(10).setCellValue(ng10.getValue());
        fila.getSheet().getRow(idr + 5).getCell(11).setCellValue(ng11.getValue());

        fila.getSheet().getRow(idr + 6).getCell(1).setCellValue(gg1.getValue());
        fila.getSheet().getRow(idr + 6).getCell(2).setCellValue(gg2.getValue());
        fila.getSheet().getRow(idr + 6).getCell(3).setCellValue(gg3.getValue());
        fila.getSheet().getRow(idr + 6).getCell(4).setCellValue(gg4.getValue());
        fila.getSheet().getRow(idr + 6).getCell(5).setCellValue(gg5.getValue());
        fila.getSheet().getRow(idr + 6).getCell(6).setCellValue(gg6.getValue());
        fila.getSheet().getRow(idr + 6).getCell(7).setCellValue(gg7.getValue());
        fila.getSheet().getRow(idr + 6).getCell(8).setCellValue(gg8.getValue());
        fila.getSheet().getRow(idr + 6).getCell(9).setCellValue(gg9.getValue());
        fila.getSheet().getRow(idr + 6).getCell(10).setCellValue(gg10.getValue());
        fila.getSheet().getRow(idr + 6).getCell(11).setCellValue(gg11.getValue());

        fila.getSheet().getRow(idr + 7).getCell(1).setCellValue(tvg1.getValue());
        fila.getSheet().getRow(idr + 7).getCell(2).setCellValue(tvg2.getValue());
        fila.getSheet().getRow(idr + 7).getCell(3).setCellValue(tvg3.getValue());
        fila.getSheet().getRow(idr + 7).getCell(4).setCellValue(tvg4.getValue());
        fila.getSheet().getRow(idr + 7).getCell(5).setCellValue(tvg5.getValue());
        fila.getSheet().getRow(idr + 7).getCell(6).setCellValue(tvg6.getValue());
        fila.getSheet().getRow(idr + 7).getCell(7).setCellValue(tvg7.getValue());
        fila.getSheet().getRow(idr + 7).getCell(8).setCellValue(tvg8.getValue());
        fila.getSheet().getRow(idr + 7).getCell(9).setCellValue(tvg9.getValue());
        fila.getSheet().getRow(idr + 7).getCell(10).setCellValue(tvg10.getValue());
        fila.getSheet().getRow(idr + 7).getCell(11).setCellValue(tvg11.getValue());

        fila.getSheet().getRow(idr + 8).getCell(1).setCellValue(mvg1.getValue());
        fila.getSheet().getRow(idr + 8).getCell(2).setCellValue(mvg2.getValue());
        fila.getSheet().getRow(idr + 8).getCell(3).setCellValue(mvg3.getValue());
        fila.getSheet().getRow(idr + 8).getCell(4).setCellValue(mvg4.getValue());
        fila.getSheet().getRow(idr + 8).getCell(5).setCellValue(mvg5.getValue());
        fila.getSheet().getRow(idr + 8).getCell(6).setCellValue(mvg6.getValue());
        fila.getSheet().getRow(idr + 8).getCell(7).setCellValue(mvg7.getValue());
        fila.getSheet().getRow(idr + 8).getCell(8).setCellValue(mvg8.getValue());
        fila.getSheet().getRow(idr + 8).getCell(9).setCellValue(mvg9.getValue());
        fila.getSheet().getRow(idr + 8).getCell(10).setCellValue(mvg10.getValue());
        fila.getSheet().getRow(idr + 8).getCell(11).setCellValue(mvg11.getValue());

        fila.getSheet().getRow(idr + 9).getCell(1).setCellValue(sp1.getText());
        fila.getSheet().getRow(idr + 9).getCell(2).setCellValue(sp2.getText());
        fila.getSheet().getRow(idr + 9).getCell(3).setCellValue(sp3.getText());
        fila.getSheet().getRow(idr + 9).getCell(4).setCellValue(sp4.getText());
        fila.getSheet().getRow(idr + 9).getCell(5).setCellValue(sp5.getText());
        fila.getSheet().getRow(idr + 9).getCell(6).setCellValue(sp6.getText());
        fila.getSheet().getRow(idr + 9).getCell(7).setCellValue(sp7.getText());
        fila.getSheet().getRow(idr + 9).getCell(8).setCellValue(sp8.getText());
        fila.getSheet().getRow(idr + 9).getCell(9).setCellValue(sp9.getText());
        fila.getSheet().getRow(idr + 9).getCell(10).setCellValue(sp10.getText());
        fila.getSheet().getRow(idr + 9).getCell(11).setCellValue(sp11.getText());

        fila.getSheet().getRow(idr + 10).getCell(1).setCellValue(n1g1.getValue());
        fila.getSheet().getRow(idr + 10).getCell(2).setCellValue(n1g2.getValue());
        fila.getSheet().getRow(idr + 10).getCell(3).setCellValue(n1g3.getValue());
        fila.getSheet().getRow(idr + 10).getCell(4).setCellValue(n1g4.getValue());
        fila.getSheet().getRow(idr + 10).getCell(5).setCellValue(n1g5.getValue());
        fila.getSheet().getRow(idr + 10).getCell(6).setCellValue(n1g6.getValue());
        fila.getSheet().getRow(idr + 10).getCell(7).setCellValue(n1g7.getValue());
        fila.getSheet().getRow(idr + 10).getCell(8).setCellValue(n1g8.getValue());
        fila.getSheet().getRow(idr + 10).getCell(9).setCellValue(n1g9.getValue());
        fila.getSheet().getRow(idr + 10).getCell(10).setCellValue(n1g10.getValue());
        fila.getSheet().getRow(idr + 10).getCell(11).setCellValue(n1g11.getValue());

        fila.getSheet().getRow(idr + 11).getCell(1).setCellValue(n2g1.getValue());
        fila.getSheet().getRow(idr + 11).getCell(2).setCellValue(n2g2.getValue());
        fila.getSheet().getRow(idr + 11).getCell(3).setCellValue(n2g3.getValue());
        fila.getSheet().getRow(idr + 11).getCell(4).setCellValue(n2g4.getValue());
        fila.getSheet().getRow(idr + 11).getCell(5).setCellValue(n2g5.getValue());
        fila.getSheet().getRow(idr + 11).getCell(6).setCellValue(n2g6.getValue());
        fila.getSheet().getRow(idr + 11).getCell(7).setCellValue(n2g7.getValue());
        fila.getSheet().getRow(idr + 11).getCell(8).setCellValue(n2g8.getValue());
        fila.getSheet().getRow(idr + 11).getCell(9).setCellValue(n2g9.getValue());
        fila.getSheet().getRow(idr + 11).getCell(10).setCellValue(n2g10.getValue());
        fila.getSheet().getRow(idr + 11).getCell(11).setCellValue(n2g11.getValue());

        fila.getSheet().getRow(idr + 12).getCell(1).setCellValue(n3g1.getValue());
        fila.getSheet().getRow(idr + 12).getCell(2).setCellValue(n3g2.getValue());
        fila.getSheet().getRow(idr + 12).getCell(3).setCellValue(n3g3.getValue());
        fila.getSheet().getRow(idr + 12).getCell(4).setCellValue(n3g4.getValue());
        fila.getSheet().getRow(idr + 12).getCell(5).setCellValue(n3g5.getValue());
        fila.getSheet().getRow(idr + 12).getCell(6).setCellValue(n3g6.getValue());
        fila.getSheet().getRow(idr + 12).getCell(7).setCellValue(n3g7.getValue());
        fila.getSheet().getRow(idr + 12).getCell(8).setCellValue(n3g8.getValue());
        fila.getSheet().getRow(idr + 12).getCell(9).setCellValue(n3g9.getValue());
        fila.getSheet().getRow(idr + 12).getCell(10).setCellValue(n3g10.getValue());
        fila.getSheet().getRow(idr + 12).getCell(11).setCellValue(n3g11.getValue());

        fila.getSheet().getRow(idr + 13).getCell(1).setCellValue(n4g1.getValue());
        fila.getSheet().getRow(idr + 13).getCell(2).setCellValue(n4g2.getValue());
        fila.getSheet().getRow(idr + 13).getCell(3).setCellValue(n4g3.getValue());
        fila.getSheet().getRow(idr + 13).getCell(4).setCellValue(n4g4.getValue());
        fila.getSheet().getRow(idr + 13).getCell(5).setCellValue(n4g5.getValue());
        fila.getSheet().getRow(idr + 13).getCell(6).setCellValue(n4g6.getValue());
        fila.getSheet().getRow(idr + 13).getCell(7).setCellValue(n4g7.getValue());
        fila.getSheet().getRow(idr + 13).getCell(8).setCellValue(n4g8.getValue());
        fila.getSheet().getRow(idr + 13).getCell(9).setCellValue(n4g9.getValue());
        fila.getSheet().getRow(idr + 13).getCell(10).setCellValue(n4g10.getValue());
        fila.getSheet().getRow(idr + 13).getCell(11).setCellValue(n4g11.getValue());

        fila.getSheet().getRow(idr + 14).getCell(1).setCellValue(n5g1.getValue());
        fila.getSheet().getRow(idr + 14).getCell(2).setCellValue(n5g2.getValue());
        fila.getSheet().getRow(idr + 14).getCell(3).setCellValue(n5g3.getValue());
        fila.getSheet().getRow(idr + 14).getCell(4).setCellValue(n5g4.getValue());
        fila.getSheet().getRow(idr + 14).getCell(5).setCellValue(n5g5.getValue());
        fila.getSheet().getRow(idr + 14).getCell(6).setCellValue(n5g6.getValue());
        fila.getSheet().getRow(idr + 14).getCell(7).setCellValue(n5g7.getValue());
        fila.getSheet().getRow(idr + 14).getCell(8).setCellValue(n5g8.getValue());
        fila.getSheet().getRow(idr + 14).getCell(9).setCellValue(n5g9.getValue());
        fila.getSheet().getRow(idr + 14).getCell(10).setCellValue(n5g10.getValue());
        fila.getSheet().getRow(idr + 14).getCell(11).setCellValue(n5g11.getValue());

        fila.getSheet().getRow(idr + 15).getCell(1).setCellValue(trd.getText());
        fila.getSheet().getRow(idr + 16).getCell(1).setCellValue(rp.getText());


        try (FileOutputStream outputStream = new FileOutputStream(ra)) {
            excel.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void limpiarGUI() {
        ocultarcombo1();
        ocultarcombo2();
        ocultarcombo3();
        ocultarcombo4();
        ocultarcombo5();
        ocultarcombo6();
        ocultarcombo7();
        ocultarcombo8();
        ocultarcombo9();
        ocultarcombo10();
        ocultarcombo11();

        enc1.setValue("");
        enc2.setValue("");
        enc3.setValue("");
        enc4.setValue("");
        enc5.setValue("");
        enc6.setValue("");
        enc7.setValue("");
        enc8.setValue("");
        enc9.setValue("");
        enc10.setValue("");
        enc11.setValue("");
        cs1.setValue("");
        cs2.setValue("");
        cs3.setValue("");
        cs4.setValue("");
        cs5.setValue("");
        cs6.setValue("");
        cs7.setValue("");
        cs8.setValue("");
        cs9.setValue("");
        cs10.setValue("");
        cs11.setValue("");
        tpg1.setValue("");
        tpg2.setValue("");
        tpg3.setValue("");
        tpg4.setValue("");
        tpg5.setValue("");
        tpg6.setValue("");
        tpg7.setValue("");
        tpg8.setValue("");
        tpg9.setValue("");
        tpg10.setValue("");
        tpg11.setValue("");
        cpg1.setValue("");
        cpg2.setValue("");
        cpg3.setValue("");
        cpg4.setValue("");
        cpg5.setValue("");
        cpg6.setValue("");
        cpg7.setValue("");
        cpg8.setValue("");
        cpg9.setValue("");
        cpg10.setValue("");
        cpg11.setValue("");
        ng1.setValue("");
        ng2.setValue("");
        ng3.setValue("");
        ng4.setValue("");
        ng5.setValue("");
        ng6.setValue("");
        ng7.setValue("");
        ng8.setValue("");
        ng9.setValue("");
        ng10.setValue("");
        ng11.setValue("");
        gg1.setValue("");
        gg2.setValue("");
        gg3.setValue("");
        gg4.setValue("");
        gg5.setValue("");
        gg6.setValue("");
        gg7.setValue("");
        gg8.setValue("");
        gg9.setValue("");
        gg10.setValue("");
        gg11.setValue("");
        tvg1.setValue("");
        tvg2.setValue("");
        tvg3.setValue("");
        tvg4.setValue("");
        tvg5.setValue("");
        tvg6.setValue("");
        tvg7.setValue("");
        tvg8.setValue("");
        tvg9.setValue("");
        tvg10.setValue("");
        tvg11.setValue("");
        mvg1.setValue("");
        mvg2.setValue("");
        mvg3.setValue("");
        mvg4.setValue("");
        mvg5.setValue("");
        mvg6.setValue("");
        mvg7.setValue("");
        mvg8.setValue("");
        mvg9.setValue("");
        mvg10.setValue("");
        mvg11.setValue("");
        n1g1.setValue("");
        n1g2.setValue("");
        n1g3.setValue("");
        n1g4.setValue("");
        n1g5.setValue("");
        n1g6.setValue("");
        n1g7.setValue("");
        n1g8.setValue("");
        n1g9.setValue("");
        n1g10.setValue("");
        n1g11.setValue("");
        n2g1.setValue("");
        n2g2.setValue("");
        n2g3.setValue("");
        n2g4.setValue("");
        n2g5.setValue("");
        n2g6.setValue("");
        n2g7.setValue("");
        n2g8.setValue("");
        n2g9.setValue("");
        n2g10.setValue("");
        n2g11.setValue("");
        n3g1.setValue("");
        n3g2.setValue("");
        n3g3.setValue("");
        n3g4.setValue("");
        n3g5.setValue("");
        n3g6.setValue("");
        n3g7.setValue("");
        n3g8.setValue("");
        n3g9.setValue("");
        n3g10.setValue("");
        n3g11.setValue("");
        n4g1.setValue("");
        n4g2.setValue("");
        n4g3.setValue("");
        n4g4.setValue("");
        n4g5.setValue("");
        n4g6.setValue("");
        n4g7.setValue("");
        n4g8.setValue("");
        n4g9.setValue("");
        n4g10.setValue("");
        n4g11.setValue("");
        n5g1.setValue("");
        n5g2.setValue("");
        n5g3.setValue("");
        n5g4.setValue("");
        n5g5.setValue("");
        n5g6.setValue("");
        n5g7.setValue("");
        n5g8.setValue("");
        n5g9.setValue("");
        n5g10.setValue("");
        n5g11.setValue("");
    }
    public void cargaExcel() {
        int index = comboselectfrase.getSelectionModel().getSelectedIndex();
        int idr = index * 18;
            enc1.setValue(fila.getSheet().getRow(idr).getCell(1).getStringCellValue());
            enc2.setValue(fila.getSheet().getRow(idr).getCell(2).getStringCellValue());
            enc3.setValue(fila.getSheet().getRow(idr).getCell(3).getStringCellValue());
            enc4.setValue(fila.getSheet().getRow(idr).getCell(4).getStringCellValue());
            enc5.setValue(fila.getSheet().getRow(idr).getCell(5).getStringCellValue());
            enc6.setValue(fila.getSheet().getRow(idr).getCell(6).getStringCellValue());
            enc7.setValue(fila.getSheet().getRow(idr).getCell(7).getStringCellValue());
            enc8.setValue(fila.getSheet().getRow(idr).getCell(8).getStringCellValue());
            enc9.setValue(fila.getSheet().getRow(idr).getCell(9).getStringCellValue());
            enc10.setValue(fila.getSheet().getRow(idr).getCell(10).getStringCellValue());
            enc11.setValue(fila.getSheet().getRow(idr).getCell(11).getStringCellValue());

            cs1.setValue(fila.getSheet().getRow(idr + 1).getCell(1).getStringCellValue());
            cs2.setValue(fila.getSheet().getRow(idr + 1).getCell(2).getStringCellValue());
            cs3.setValue(fila.getSheet().getRow(idr + 1).getCell(3).getStringCellValue());
            cs4.setValue(fila.getSheet().getRow(idr + 1).getCell(4).getStringCellValue());
            cs5.setValue(fila.getSheet().getRow(idr + 1).getCell(5).getStringCellValue());
            cs6.setValue(fila.getSheet().getRow(idr + 1).getCell(6).getStringCellValue());
            cs7.setValue(fila.getSheet().getRow(idr + 1).getCell(7).getStringCellValue());
            cs8.setValue(fila.getSheet().getRow(idr + 1).getCell(8).getStringCellValue());
            cs9.setValue(fila.getSheet().getRow(idr + 1).getCell(9).getStringCellValue());
            cs10.setValue(fila.getSheet().getRow(idr + 1).getCell(10).getStringCellValue());
            cs11.setValue(fila.getSheet().getRow(idr + 1).getCell(11).getStringCellValue());

            tpg1.setValue(fila.getSheet().getRow(idr + 3).getCell(1).getStringCellValue());
            tpg2.setValue(fila.getSheet().getRow(idr + 3).getCell(2).getStringCellValue());
            tpg3.setValue(fila.getSheet().getRow(idr + 3).getCell(3).getStringCellValue());
            tpg4.setValue(fila.getSheet().getRow(idr + 3).getCell(4).getStringCellValue());
            tpg5.setValue(fila.getSheet().getRow(idr + 3).getCell(5).getStringCellValue());
            tpg6.setValue(fila.getSheet().getRow(idr + 3).getCell(6).getStringCellValue());
            tpg7.setValue(fila.getSheet().getRow(idr + 3).getCell(7).getStringCellValue());
            tpg8.setValue(fila.getSheet().getRow(idr + 3).getCell(8).getStringCellValue());
            tpg9.setValue(fila.getSheet().getRow(idr + 3).getCell(9).getStringCellValue());
            tpg10.setValue(fila.getSheet().getRow(idr + 3).getCell(10).getStringCellValue());
            tpg11.setValue(fila.getSheet().getRow(idr + 3).getCell(11).getStringCellValue());

            cpg1.setValue(fila.getSheet().getRow(idr + 4).getCell(1).getStringCellValue());
            cpg2.setValue(fila.getSheet().getRow(idr + 4).getCell(2).getStringCellValue());
            cpg3.setValue(fila.getSheet().getRow(idr + 4).getCell(3).getStringCellValue());
            cpg4.setValue(fila.getSheet().getRow(idr + 4).getCell(4).getStringCellValue());
            cpg5.setValue(fila.getSheet().getRow(idr + 4).getCell(5).getStringCellValue());
            cpg6.setValue(fila.getSheet().getRow(idr + 4).getCell(6).getStringCellValue());
            cpg7.setValue(fila.getSheet().getRow(idr + 4).getCell(7).getStringCellValue());
            cpg8.setValue(fila.getSheet().getRow(idr + 4).getCell(8).getStringCellValue());
            cpg9.setValue(fila.getSheet().getRow(idr + 4).getCell(9).getStringCellValue());
            cpg10.setValue(fila.getSheet().getRow(idr + 4).getCell(10).getStringCellValue());
            cpg11.setValue(fila.getSheet().getRow(idr + 4).getCell(11).getStringCellValue());

            ng1.setValue(fila.getSheet().getRow(idr + 5).getCell(1).getStringCellValue());
            ng2.setValue(fila.getSheet().getRow(idr + 5).getCell(2).getStringCellValue());
            ng3.setValue(fila.getSheet().getRow(idr + 5).getCell(3).getStringCellValue());
            ng4.setValue(fila.getSheet().getRow(idr + 5).getCell(4).getStringCellValue());
            ng5.setValue(fila.getSheet().getRow(idr + 5).getCell(5).getStringCellValue());
            ng6.setValue(fila.getSheet().getRow(idr + 5).getCell(6).getStringCellValue());
            ng7.setValue(fila.getSheet().getRow(idr + 5).getCell(7).getStringCellValue());
            ng8.setValue(fila.getSheet().getRow(idr + 5).getCell(8).getStringCellValue());
            ng9.setValue(fila.getSheet().getRow(idr + 5).getCell(9).getStringCellValue());
            ng10.setValue(fila.getSheet().getRow(idr + 5).getCell(10).getStringCellValue());
            ng11.setValue(fila.getSheet().getRow(idr + 5).getCell(11).getStringCellValue());

            gg1.setValue(fila.getSheet().getRow(idr + 6).getCell(1).getStringCellValue());
            gg2.setValue(fila.getSheet().getRow(idr + 6).getCell(2).getStringCellValue());
            gg3.setValue(fila.getSheet().getRow(idr + 6).getCell(3).getStringCellValue());
            gg4.setValue(fila.getSheet().getRow(idr + 6).getCell(4).getStringCellValue());
            gg5.setValue(fila.getSheet().getRow(idr + 6).getCell(5).getStringCellValue());
            gg6.setValue(fila.getSheet().getRow(idr + 6).getCell(6).getStringCellValue());
            gg7.setValue(fila.getSheet().getRow(idr + 6).getCell(7).getStringCellValue());
            gg8.setValue(fila.getSheet().getRow(idr + 6).getCell(8).getStringCellValue());
            gg9.setValue(fila.getSheet().getRow(idr + 6).getCell(9).getStringCellValue());
            gg10.setValue(fila.getSheet().getRow(idr + 6).getCell(10).getStringCellValue());
            gg11.setValue(fila.getSheet().getRow(idr + 6).getCell(11).getStringCellValue());

            tvg1.setValue(fila.getSheet().getRow(idr + 7).getCell(1).getStringCellValue());
            tvg2.setValue(fila.getSheet().getRow(idr + 7).getCell(2).getStringCellValue());
            tvg3.setValue(fila.getSheet().getRow(idr + 7).getCell(3).getStringCellValue());
            tvg4.setValue(fila.getSheet().getRow(idr + 7).getCell(4).getStringCellValue());
            tvg5.setValue(fila.getSheet().getRow(idr + 7).getCell(5).getStringCellValue());
            tvg6.setValue(fila.getSheet().getRow(idr + 7).getCell(6).getStringCellValue());
            tvg7.setValue(fila.getSheet().getRow(idr + 7).getCell(7).getStringCellValue());
            tvg8.setValue(fila.getSheet().getRow(idr + 7).getCell(8).getStringCellValue());
            tvg9.setValue(fila.getSheet().getRow(idr + 7).getCell(9).getStringCellValue());
            tvg10.setValue(fila.getSheet().getRow(idr + 7).getCell(10).getStringCellValue());
            tvg11.setValue(fila.getSheet().getRow(idr + 7).getCell(11).getStringCellValue());

            mvg1.setValue(fila.getSheet().getRow(idr + 8).getCell(1).getStringCellValue());
            mvg2.setValue(fila.getSheet().getRow(idr + 8).getCell(2).getStringCellValue());
            mvg3.setValue(fila.getSheet().getRow(idr + 8).getCell(3).getStringCellValue());
            mvg4.setValue(fila.getSheet().getRow(idr + 8).getCell(4).getStringCellValue());
            mvg5.setValue(fila.getSheet().getRow(idr + 8).getCell(5).getStringCellValue());
            mvg6.setValue(fila.getSheet().getRow(idr + 8).getCell(6).getStringCellValue());
            mvg7.setValue(fila.getSheet().getRow(idr + 8).getCell(7).getStringCellValue());
            mvg8.setValue(fila.getSheet().getRow(idr + 8).getCell(8).getStringCellValue());
            mvg9.setValue(fila.getSheet().getRow(idr + 8).getCell(9).getStringCellValue());
            mvg10.setValue(fila.getSheet().getRow(idr + 8).getCell(10).getStringCellValue());
            mvg11.setValue(fila.getSheet().getRow(idr + 8).getCell(11).getStringCellValue());

            sp1.setText(fila.getSheet().getRow(idr + 9).getCell(1).getStringCellValue());
            sp2.setText(fila.getSheet().getRow(idr + 9).getCell(2).getStringCellValue());
            sp3.setText(fila.getSheet().getRow(idr + 9).getCell(3).getStringCellValue());
            sp4.setText(fila.getSheet().getRow(idr + 9).getCell(4).getStringCellValue());
            sp5.setText(fila.getSheet().getRow(idr + 9).getCell(5).getStringCellValue());
            sp6.setText(fila.getSheet().getRow(idr + 9).getCell(6).getStringCellValue());
            sp7.setText(fila.getSheet().getRow(idr + 9).getCell(7).getStringCellValue());
            sp8.setText(fila.getSheet().getRow(idr + 9).getCell(8).getStringCellValue());
            sp9.setText(fila.getSheet().getRow(idr + 9).getCell(9).getStringCellValue());
            sp10.setText(fila.getSheet().getRow(idr + 9).getCell(10).getStringCellValue());
            sp11.setText(fila.getSheet().getRow(idr + 9).getCell(11).getStringCellValue());

            n1g1.setValue(fila.getSheet().getRow(idr + 10).getCell(1).getStringCellValue());
            n1g2.setValue(fila.getSheet().getRow(idr + 10).getCell(2).getStringCellValue());
            n1g3.setValue(fila.getSheet().getRow(idr + 10).getCell(3).getStringCellValue());
            n1g4.setValue(fila.getSheet().getRow(idr + 10).getCell(4).getStringCellValue());
            n1g5.setValue(fila.getSheet().getRow(idr + 10).getCell(5).getStringCellValue());
            n1g6.setValue(fila.getSheet().getRow(idr + 10).getCell(6).getStringCellValue());
            n1g7.setValue(fila.getSheet().getRow(idr + 10).getCell(7).getStringCellValue());
            n1g8.setValue(fila.getSheet().getRow(idr + 10).getCell(8).getStringCellValue());
            n1g9.setValue(fila.getSheet().getRow(idr + 10).getCell(9).getStringCellValue());
            n1g10.setValue(fila.getSheet().getRow(idr + 10).getCell(10).getStringCellValue());
            n1g11.setValue(fila.getSheet().getRow(idr + 10).getCell(11).getStringCellValue());

            n2g1.setValue(fila.getSheet().getRow(idr + 11).getCell(1).getStringCellValue());
            n2g2.setValue(fila.getSheet().getRow(idr + 11).getCell(2).getStringCellValue());
            n2g3.setValue(fila.getSheet().getRow(idr + 11).getCell(3).getStringCellValue());
            n2g4.setValue(fila.getSheet().getRow(idr + 11).getCell(4).getStringCellValue());
            n2g5.setValue(fila.getSheet().getRow(idr + 11).getCell(5).getStringCellValue());
            n2g6.setValue(fila.getSheet().getRow(idr + 11).getCell(6).getStringCellValue());
            n2g7.setValue(fila.getSheet().getRow(idr + 11).getCell(7).getStringCellValue());
            n2g8.setValue(fila.getSheet().getRow(idr + 11).getCell(8).getStringCellValue());
            n2g9.setValue(fila.getSheet().getRow(idr + 11).getCell(9).getStringCellValue());
            n2g10.setValue(fila.getSheet().getRow(idr + 11).getCell(10).getStringCellValue());
            n2g11.setValue(fila.getSheet().getRow(idr + 11).getCell(11).getStringCellValue());

            n3g1.setValue(fila.getSheet().getRow(idr + 12).getCell(1).getStringCellValue());
            n3g2.setValue(fila.getSheet().getRow(idr + 12).getCell(2).getStringCellValue());
            n3g3.setValue(fila.getSheet().getRow(idr + 12).getCell(3).getStringCellValue());
            n3g4.setValue(fila.getSheet().getRow(idr + 12).getCell(4).getStringCellValue());
            n3g5.setValue(fila.getSheet().getRow(idr + 12).getCell(5).getStringCellValue());
            n3g6.setValue(fila.getSheet().getRow(idr + 12).getCell(6).getStringCellValue());
            n3g7.setValue(fila.getSheet().getRow(idr + 12).getCell(7).getStringCellValue());
            n3g8.setValue(fila.getSheet().getRow(idr + 12).getCell(8).getStringCellValue());
            n3g9.setValue(fila.getSheet().getRow(idr + 12).getCell(9).getStringCellValue());
            n3g10.setValue(fila.getSheet().getRow(idr + 12).getCell(10).getStringCellValue());
            n3g11.setValue(fila.getSheet().getRow(idr + 12).getCell(11).getStringCellValue());

            n4g1.setValue(fila.getSheet().getRow(idr + 13).getCell(1).getStringCellValue());
            n4g2.setValue(fila.getSheet().getRow(idr + 13).getCell(2).getStringCellValue());
            n4g3.setValue(fila.getSheet().getRow(idr + 13).getCell(3).getStringCellValue());
            n4g4.setValue(fila.getSheet().getRow(idr + 13).getCell(4).getStringCellValue());
            n4g5.setValue(fila.getSheet().getRow(idr + 13).getCell(5).getStringCellValue());
            n4g6.setValue(fila.getSheet().getRow(idr + 13).getCell(6).getStringCellValue());
            n4g7.setValue(fila.getSheet().getRow(idr + 13).getCell(7).getStringCellValue());
            n4g8.setValue(fila.getSheet().getRow(idr + 13).getCell(8).getStringCellValue());
            n4g9.setValue(fila.getSheet().getRow(idr + 13).getCell(9).getStringCellValue());
            n4g10.setValue(fila.getSheet().getRow(idr + 13).getCell(10).getStringCellValue());
            n4g11.setValue(fila.getSheet().getRow(idr + 13).getCell(11).getStringCellValue());

            n5g1.setValue(fila.getSheet().getRow(idr + 14).getCell(1).getStringCellValue());
            n5g2.setValue(fila.getSheet().getRow(idr + 14).getCell(2).getStringCellValue());
            n5g3.setValue(fila.getSheet().getRow(idr + 14).getCell(3).getStringCellValue());
            n5g4.setValue(fila.getSheet().getRow(idr + 14).getCell(4).getStringCellValue());
            n5g5.setValue(fila.getSheet().getRow(idr + 14).getCell(5).getStringCellValue());
            n5g6.setValue(fila.getSheet().getRow(idr + 14).getCell(6).getStringCellValue());
            n5g7.setValue(fila.getSheet().getRow(idr + 14).getCell(7).getStringCellValue());
            n5g8.setValue(fila.getSheet().getRow(idr + 14).getCell(8).getStringCellValue());
            n5g9.setValue(fila.getSheet().getRow(idr + 14).getCell(9).getStringCellValue());
            n5g10.setValue(fila.getSheet().getRow(idr + 14).getCell(10).getStringCellValue());
            n5g11.setValue(fila.getSheet().getRow(idr + 14).getCell(11).getStringCellValue());

            trd.setText(fila.getSheet().getRow(idr + 15).getCell(1).getStringCellValue());
            rp.setText(fila.getSheet().getRow(idr + 16).getCell(1).getStringCellValue());
    }

    @FXML
    private void exportarEXC() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Guardar texto");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Archivos Excel", "*.xlsx"));

        // Obtener la ubicación seleccionada del archivo
        Stage stage = (Stage) exportBT.getScene().getWindow();
        File file = fileChooser.showSaveDialog(stage);

        if (file != null) {
            // Guardar el archivo Excel en la ubicación seleccionada
            try (FileOutputStream outputStream = new FileOutputStream(file)) {
                excel.write(outputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    Timer timer = new Timer();
    TimerTask atgrd = new TimerTask() {
        @Override
        public void run() {
            autosave();
        }
    };
    public void construyeExcel(File arc, String crp) throws IOException {
        Path path = Paths.get(crp);
        try {
            Files.createDirectories(path);
            System.out.println("Carpeta creada exitosamente en: " + crp);
        } catch (Exception e) {
            System.out.println("Error al crear la carpeta: " + e.getMessage());
        }

        if (!arc.exists()) {
            excel = new XSSFWorkbook();
            hoja = excel.createSheet("Hoja 1");
            numfr = comboselectfrase.getItems().size();
            numcl = numfr * 18;
            for (int i = 0; i < numcl; i++) {
                fila = hoja.createRow(i);
                for (int j = 0; j < 12; j++) {
                    fila.createCell(j);
                }
            }
        }
        else {
            FileInputStream fis = new FileInputStream(arc);
            numfr = comboselectfrase.getItems().size();
            numcl = numfr * 18;
            excel = new XSSFWorkbook(fis);
            hoja = excel.getSheetAt(0);
            for (int i = 0; i < numcl; i++) {
                fila = hoja.getRow(i);
                for (int j = 0; j < 12; j++) {
                    fila.getCell(j);
                }
            }
        }
    }

    public void volverLogin(ActionEvent event) {
        try {
            // Obtener la referencia a la ventana actual
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close(); // Cerrar la ventana actual

            LoginController login = new LoginController();
            login.interfazMenu(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}