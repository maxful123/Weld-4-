package password_checker

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._

class Menu_test extends AnyFunSpec with Matchers {
  describe("The Weld 4 Simulation") {
    describe("has a menu") {

      //***********SHOW PLAYER ORDER ****************
      it("can show the player order") {
        val expectedResult = "Orange, Magenta, Lime, Aqua"
        Menu.showPlayerOrder should be(expectedResult)
      }

       //***********ADVANCE ORDER ****************
      it("can advance the player order") { 
        val expectedResult = "Magenta, Lime, Aqua, Orange" 
        Menu.advancePlayerOrder should be(expectedResult) 
      }
      //*********** SHOW GAME AREA ****************
      it("can show the game area, including the 9x9 board and player power ups") {
        val expectedResult =
          "Board:\n" +
          |"+---+---+---+---+---+---+---+---+---+\n" +
          |"|   |   |   |   |   |   |   |   |   |\n" +
          |"+---+---+---+---+---+---+---+---+---+\n" +
          |"|   |   |   |   |   |   |   |   |   |\n" +
          |"+---+---+---+---+---+---+---+---+---+\n" +
          |"|   |   |   |   |   |   |   |   |   |\n" +
          |"+---+---+---+---+---+---+---+---+---+\n" +
          |"|   |   |   |   |   |   |   |   |   |\n" +
          |"+---+---+---+---+---+---+---+---+---+\n" +
          |"|   |   |   |   |   |   |   |   |   |\n" +
          |"+---+---+---+---+---+---+---+---+---+\n" +
          |"|   |   |   |   |   |   |   |   |   |\n" +
          |"+---+---+---+---+---+---+---+---+---+\n" +
          |"|   |   |   |   |   |   |   |   |   |\n" +
          |"+---+---+---+---+---+---+---+---+---+\n" +
          |"|   |   |   |   |   |   |   |   |   |\n" +
          |"+---+---+---+---+---+---+---+---+---+\n" +
          |"|   |   |   |   |   |   |   |   |   |\n" +
          |"+---+---+---+---+---+---+---+---+---+\n" +
          "\n" + 
          |"Power-ups:\n" +
          |"Orange:  [Power-up 1], [Power-up 2]\n" +
          |"Magenta: [Power-up 1], [Power-up 2]\n" +
          |"Lime:    [Power-up 1], [Power-up 2]\n" +
          |"Aqua:    [Power-up 1], [Power-up 2]\n"
        Menu.showGameArea should be (expectedResult)
      }
    }
  }
}