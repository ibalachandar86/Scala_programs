import sbt._

// Library Versions
object Version {
  val scalaVersion = "1.2.1"
  val enumeratumCirceVersion = "1.6.1"
  val declineVerison = "1.3.0"
  val cirisVersion = "1.2.1"
}

// Libraries
object Library {
  import Version._
  val cirisEnumeratum = "is.cir" %% "ciris-enumeratum" % cirisVersion
  val declineEnumeratum = "com.monovore" %% "decline-enumeratum" % declineVerison
  val enumeratumCirce = "com.beachape" %% "enumeratum-circe" % enumeratumCirceVersion
}

// Dependencies
object Dependencies {
  import Library._
  lazy val advancedDependencies = Seq(
    cirisEnumeratum,
    declineEnumeratum,
    enumeratumCirce
  )

}