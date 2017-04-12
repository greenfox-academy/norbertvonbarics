

public class Hero extends Character {
  Board myArray = new Board();

  public Hero(int posX, int posY) {
    super(posX, posY);
  }

  Hero() {
    super();
  }

  void heroMoveUp() {
    super.costume = "./assets/doom/doom-up.png";
    if (myArray.ifThereIsWall(posX, posY - 1) && posY >= 1) {
      posY -= 1;
    }
  }

  void heroMoveDown() {
    super.costume = "./assets/doom/doom-down.png";
    if (myArray.ifThereIsWall(posX, posY + 1) && posY <= 8) {
      posY += 1;
    }

  }

  void heroMoveRight() {
    super.costume = "./assets/doom/doom-right.png";
    if (myArray.ifThereIsWall(posX + 1, posY) && posX <= 8) {
      posX += 1;
    }
  }

  void heroMoveLeft() {
    super.costume = "./assets/doom/doom-left.png";
    if (myArray.ifThereIsWall(posX - 1, posY) && posX >= 1) {
      posX -= 1;
    }
  }
}
