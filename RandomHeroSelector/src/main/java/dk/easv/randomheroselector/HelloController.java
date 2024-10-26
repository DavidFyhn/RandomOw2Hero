package dk.easv.randomheroselector;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
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
    ArrayList<String> prevHero = new ArrayList<>();
    ArrayList<Image> tankImageList = new ArrayList<>();
    ArrayList<Image> damageImageList = new ArrayList<>();
    ArrayList<Image> supportImageList = new ArrayList<>();

    @FXML
    private Label lblHero;
    @FXML
    private ListView<String> lstPrev;
    @FXML
    private ListView<String> lstAvail;


    @FXML
    private void PressedTank(ActionEvent actionEvent) {
        Tank = true;

        tankImageList.clear();
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

        updateAvailableListView(tankList);
    }

    @FXML
    private void PressedDPS(ActionEvent actionEvent) {
        Damage = true;

        damageImageList.clear();
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

        updateAvailableListView(damageList);
    }

    @FXML
    private void PressedSupport(ActionEvent actionEvent) {
    Support = true;

    supportImageList.clear();
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

    updateAvailableListView(supportList);
    }

    @FXML
    private void ChooseHero(ActionEvent actionEvent) {
      if (!Tank && !Damage && !Support) {lblHero.setText("Please choose a Role");}

      String chosenHero = null;

      if (Tank){
          int randomTank = (int) (Math.random() * tankList.size());
          chosenHero = tankList.get(randomTank);
          lblHero.setText(tankList.get(randomTank));

      }
      if (Damage){
          int randomDamage = (int) (Math.random() * damageList.size());
          chosenHero = damageList.get(randomDamage);
          lblHero.setText(damageList.get(randomDamage));

      }
      if (Support){
          int randomSupport = (int) (Math.random() * supportList.size());
          chosenHero = supportList.get(randomSupport);

      }

        if (chosenHero != null) {
            lblHero.setText(chosenHero);
            prevHero.add(chosenHero);
            updatePrevHeroListView();
        }

    }

    private void updatePrevHeroListView() {
        lstPrev.getItems().clear();
        lstPrev.getItems().addAll(prevHero);
    }

    private void updateAvailableListView(ArrayList<String> heroList) {
        lstAvail.getItems().clear();
        lstAvail.getItems().addAll(heroList);
    }


    @FXML
    private void OnReset(ActionEvent actionEvent) {
        prevHero.clear();
        lstPrev.getItems().clear();
        lstAvail.getItems().clear();
        Tank = false;
        Damage = false;
        Support = false;
        lblHero.setText("");
    }


}





