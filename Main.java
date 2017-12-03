package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.WindowEvent;
import javafx.application.Platform;
import javafx.beans.property.*;
import javafx.scene.chart.XYChart;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;

public class Main extends Application {
    protected NumberAxis xAxis, yAxis;
    XYChart.Series series1;
    XYChart.Series series2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        ScatterChart<Number,Number> scatterChart;

        primaryStage.setTitle("Hello World");
        BorderPane bp = new BorderPane();
        primaryStage.setScene(new Scene(bp, 800, 800));

        xAxis = new NumberAxis(0,500,100);
        yAxis = new NumberAxis(0,500,100);
        scatterChart = new ScatterChart<Number,Number>(xAxis,yAxis);
        xAxis.setLabel("Longitude");
        yAxis.setLabel("Latitude");
        scatterChart.setTitle("Weather Plotti");

        series1 = new XYChart.Series();
        series1.setName("heiss");

        series2 = new XYChart.Series();
        series2.setName("kalt");

        series1.getData().add(new XYChart.Data<>(200,200));
        series1.getData().add(new XYChart.Data<>(201,200));
        series1.getData().add(new XYChart.Data<>(202,200));
        series1.getData().add(new XYChart.Data<>(201,201));
        series1.getData().add(new XYChart.Data<>(201,202));
        series2.getData().add(new XYChart.Data<>(300,300));
        series2.getData().add(new XYChart.Data<>(301,300));
        series2.getData().add(new XYChart.Data<>(302,300));
        series2.getData().add(new XYChart.Data<>(303,300));
        series2.getData().add(new XYChart.Data<>(304,300));
        series2.getData().add(new XYChart.Data<>(305,300));

        scatterChart.getData().addAll(series1,series2);

        bp.setCenter(scatterChart);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
