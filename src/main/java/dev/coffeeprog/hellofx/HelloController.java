package dev.coffeeprog.hellofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

public class HelloController {
    @FXML
    private Label myMessage;

    public void generateRandom(ActionEvent event) {
        Random rand = new Random();
        int myrand = rand.nextInt(50)+1;
        myMessage.setText(Integer.toString(myrand));
        System.out.println(myrand);
    }
}
