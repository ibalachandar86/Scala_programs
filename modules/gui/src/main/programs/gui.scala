package src.main.programs
import scala.swing._
import java.awt.Color

class UI extends MainFrame {
  title = "Hive Interface"
  // Box Specifications
  val la = new Label("Look at me!")
  la.foreground = Color.BLUE
  contents = new BoxPanel(Orientation.Horizontal) {
    contents += la
    contents += Swing.HStrut(10)
    contents += Swing.Glue
    contents += Button("Press me, please") { pressMe() }
    contents += Swing.HStrut(5)
    contents += Button("Close") { closeMe() }
    border = Swing.EmptyBorder(10, 10, 10, 10)
  }
  // Button Dialog Details
  def pressMe() {
    Dialog.showMessage(contents.head, "Thank you!", title="You pressed me")
  }
  // CLose the Window
  def closeMe() {
    val res = Dialog.showConfirmation(contents.head,
      "Do you really want to quit?",
      optionType=Dialog.Options.YesNo,
      title=title)
    if (res == Dialog.Result.Ok)
      sys.exit(0)
  }


}

object gui extends App {
  val ui = new UI
  ui.visible = true
  println("End of main function")
}
