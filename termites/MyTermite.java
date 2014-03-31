public class MyTermite extends Termite {

    public void act() {
        if (getGrid() == null)
            return;

        if (seeFlower()) {
            pickUpFlower();
        }
        if (hasFlower()) {
            dropFlower();
        }

        if (canMove()) {
            move();
        }
        randomTurn();
    }
}