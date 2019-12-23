package root.GameMode.Levels;

import root.GUI.GamePanel;
import root.GUI.IconButton;
import root.entities.plants.FreezePeaShooter;
import root.entities.plants.Walnut;
import root.entities.plants.Repeater;
import root.entities.zombies.ConeHeadZombie;

public class Round2 extends Round1 {

  public Round2(GamePanel gamePanel) {
    super(gamePanel);

    zombieClasses.add(ConeHeadZombie.class);

    plantClasses.add(FreezePeaShooter.class);
    cards.add(new IconButton(gamePanel.visualMode.FreezePeaShooterCardIcon, gamePanel.visualMode.GameDim.width * 28 / 90,
        gamePanel.visualMode.GameDim.height / 67, gamePanel.visualMode.FreezePeaShooterImage, gamePanel));

    plantClasses.add(Repeater.class);
    cards.add(new IconButton(gamePanel.visualMode.RepeaterCardIcon, gamePanel.visualMode.GameDim.width * 34 / 90,
            gamePanel.visualMode.GameDim.height / 67, gamePanel.visualMode.RepeaterImage, gamePanel));

    MAX_ZOMBIES = 60;
  }
}
