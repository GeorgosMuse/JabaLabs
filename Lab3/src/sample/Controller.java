package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.text.DecimalFormat;

public class Controller {
    public Button btnMain;
    public TextField text;
    public TextField text1;
    public Label weight;
    public Label price;
    public TextField text2;
    public RadioButton steelcommon;
    public RadioButton steelstainless;
    public ToggleGroup toggleGroup;
    double range;
    double height;
    double radius;
    double thickness;
    int clickcounter = 0;
    double fullprice;
    double fweight;
    double volume;
    final double densitysteelless = 8.85;
    final double densitysteel = 7.8;
    String Bląd;

    public void calculation(){
        Bląd = null;
        height = Double.parseDouble(text.getText());
        radius = Double.parseDouble(text1.getText());
        thickness = Double.parseDouble(text2.getText());
        range= 2 * Math.PI * radius *(radius+ height);
        if (thickness > radius / 2 || radius > height / 2) {
            Bląd = "Nie poprawna grubość";
        }
        if (toggleGroup.getSelectedToggle().equals(steelcommon)){
            fullprice = range / 10000 * (thickness / 0.0025);
            volume =  range* thickness;
            fweight = (densitysteel * volume) / 1000;
        } else if (toggleGroup.getSelectedToggle().equals(steelstainless)){
            fullprice = range / 10000 * (thickness / 0/00071);
            volume = range * thickness;
            fweight = (densitysteelless * volume) / 1000;
        }

    }

    public void onBtnAction(ActionEvent actionEvent) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##");
        calculation();
        if (Bląd == null) {
        price.setText(String.valueOf(decimalFormat.format(fullprice)));
        weight.setText(String.valueOf(decimalFormat.format(fweight)));
        } else if (Bląd != null) {
            price.setText("Bląd: " + Bląd);
            weight.setText("Bląd: " + Bląd);
        }
    }
}

