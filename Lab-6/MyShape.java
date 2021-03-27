package sample;

import javafx.beans.property.SimpleStringProperty;

public class MyShape {
    private SimpleStringProperty hight, width, sidesNumber, stroke;

    public MyShape(String hight, String width, String sidesNumber, String stroke) {
        this.hight = new SimpleStringProperty(hight);
        this.width = new SimpleStringProperty(width);
        this.sidesNumber = new SimpleStringProperty(sidesNumber);
        this.stroke = new SimpleStringProperty(stroke);
    }

    public void setHight(String hight) {
        this.hight = new SimpleStringProperty(hight);
    }

    public String getWidth() {
        return width.get();
    }

    public SimpleStringProperty widthProperty() {
        return width;
    }

    public void setWidth(String width) {
        this.width = new SimpleStringProperty(width);
    }

    public void setSidesNumber(String sidesNumber) {
        this.sidesNumber.set(sidesNumber);
    }

    public void setStroke(String stroke) {
        this.stroke = new SimpleStringProperty(stroke);
    }

    public String getHight() {
        return hight.get();
    }

    public SimpleStringProperty hightProperty() {
        return hight;
    }

    public String getSidesNumber() {
        return sidesNumber.get();
    }

    public SimpleStringProperty sidesNumberProperty() {
        return sidesNumber;
    }

    public String getStroke() {
        return stroke.get();
    }

    public SimpleStringProperty strokeProperty() {
        return stroke;
    }
}
