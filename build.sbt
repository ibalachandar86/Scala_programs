import Settings._

lazy val advanced = Project(
  id = "advanced",
  base = file("modules/advanced")
).settings(advancedSettings)

// Custom Tasks

/*
lazy val packageAdvance = taskKey[Unit]
packageAdvance := Def
  .sequential(
    (advanced / publishLocal)
  )
  .value*/
