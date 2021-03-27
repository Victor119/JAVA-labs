package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.shape.Shape;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private Canvas canvas;
    @FXML private ColorPicker colorPicker;
    @FXML private TextField shapeSizeHeight;
    @FXML private TextField shapeSizeWidth;
    @FXML private TableColumn<Shape, String> sideNumbersColumn;

    GraphicsContext brushTool;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        brushTool = canvas.getGraphicsContext2D();
        //mai intai click la mouse si dupa aceea miscat
        canvas.setOnMouseDragged(e -> {
            double sizeX = Double.parseDouble(shapeSizeWidth.getText());
            double sizeY = Double.parseDouble(shapeSizeHeight.getText());
            //coordonatele x si y
            double x = e.getX() - sizeX;
            double y = e.getY() - sizeY;

            brushTool.setFill(colorPicker.getValue());
            brushTool.fillRect(x, y, sizeY, sizeX);

            if(!shapeSizeHeight.getText().isEmpty() && !shapeSizeWidth.getText().isEmpty()){
                brushTool.setFill(colorPicker.getValue());
                brushTool.fillRoundRect(x, y, sizeX, sizeY, sizeX, sizeY);
            }

        });
    }

    public ObservableList<Shape> getShape (){
        ObservableList<Shape> shape = FXCollections.observableArrayList();
        Shape copyShape = null;
        shape.add(copyShape);

        return shape;
    }
}

