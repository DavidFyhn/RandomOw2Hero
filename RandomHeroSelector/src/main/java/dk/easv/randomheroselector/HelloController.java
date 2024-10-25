package dk.easv.randomheroselector;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.random.RandomGenerator;

public class HelloController {

   boolean Tank = false;
   boolean Damage = false;
   boolean Support = false;
    ArrayList<String> tankList = new ArrayList<>();
    ArrayList<String> damageList = new ArrayList<>();
    ArrayList<String> supportList = new ArrayList<>();
    ArrayList<Image> tankImageList = new ArrayList<>();
    ArrayList<Image> damageImageList = new ArrayList<>();
    ArrayList<Image> supportImageList = new ArrayList<>();
    @FXML
    private Label lblHero;



    @FXML
    private void PressedTank(ActionEvent actionEvent) {
        Tank = true;

        tankList.add("Doomfist");
        tankList.add("Dva");
        tankList.add("JunkerQueen");
        tankList.add("Mauga");
        tankList.add("Orisa");
        tankList.add("Ramattra");
        tankList.add("Reinhardt");
        tankList.add("Roadhog");
        tankList.add("Sigma");
        tankList.add("Winston");
        tankList.add("WreckingBall");
        tankList.add("Zarya");

        tankImageList.add()


    }

    @FXML
    private void PressedDPS(ActionEvent actionEvent) {
        Damage = true;

        damageList.add("Ashe");
        damageList.add("Bastion");
        damageList.add("Cassidy");
        damageList.add("Echo");
        damageList.add("Genji");
        damageList.add("Hanzo");
        damageList.add("Junkrat");
        damageList.add("Mei");
        damageList.add("Pharah");
        damageList.add("Sombra");
        damageList.add("Symmetra");
        damageList.add("Torbjørn");
        damageList.add("Tracer");
        damageList.add("Venture");
        damageList.add("Widowmaker");


    }

    @FXML
    private void PressedSupport(ActionEvent actionEvent) {
    Support = true;

    supportList.add("Ana");
    supportList.add("Baptiste");
    supportList.add("Brigitte");
    supportList.add("Illari");
    supportList.add("Juno");
    supportList.add("Kiriko");
    supportList.add("Lifeweaver");
    supportList.add("Lucio");
    supportList.add("Mercy");
    supportList.add("Moira");
    supportList.add("Zenyatta");
    }

    @FXML
    private void ChooseHero(ActionEvent actionEvent) {
      if (!Tank && !Damage && !Support) {lblHero.setText("Please choose a Role");}
      if (Tank){
          int randomTank = (int) (Math.random() * tankList.size());
          tankList.get(randomTank);
          lblHero.setText(tankList.get(randomTank));
      }
      if (Damage){
          int randomDamage = (int) (Math.random() * damageList.size());
          damageList.get(randomDamage);
          lblHero.setText(damageList.get(randomDamage));
      }
      if (Support){
          int randomSupport = (int) (Math.random() * supportList.size());
          supportList.get(randomSupport);
      }

    }

    @FXML
    private void OnReset(ActionEvent actionEvent) {
    }


}




